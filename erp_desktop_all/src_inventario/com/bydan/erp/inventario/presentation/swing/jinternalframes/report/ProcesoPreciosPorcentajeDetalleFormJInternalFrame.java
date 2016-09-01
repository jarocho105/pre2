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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProcesoPreciosPorcentajeConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProcesoPreciosPorcentajeDetalleFormJInternalFrame extends ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoPreciosPorcentaje;
	
	protected JMenuBar jmenuBarDetalleProcesoPreciosPorcentaje;
	
	protected JMenu jmenuDetalleProcesoPreciosPorcentaje;
	protected JMenu jmenuDetalleArchivoProcesoPreciosPorcentaje;
	protected JMenu jmenuDetalleAccionesProcesoPreciosPorcentaje;
	protected JMenu jmenuDetalleDatosProcesoPreciosPorcentaje;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoPreciosPorcentaje;	
	protected GridBagConstraints gridBagConstraintsProcesoPreciosPorcentaje;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoPreciosPorcentaje;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProcesoPreciosPorcentajeSessionBean procesopreciosporcentajeSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProcesoPreciosPorcentajeLogic procesopreciosporcentajeLogic;
	
	public JScrollPane jScrollPanelDatosProcesoPreciosPorcentaje;
	public JScrollPane jScrollPanelDatosEdicionProcesoPreciosPorcentaje;
	public JScrollPane jScrollPanelDatosGeneralProcesoPreciosPorcentaje;
	
	protected JPanel jPanelCamposProcesoPreciosPorcentaje;    
	protected JPanel jPanelCamposOcultosProcesoPreciosPorcentaje;    	
	protected JPanel jPanelAccionesProcesoPreciosPorcentaje;
	protected JPanel jPanelAccionesFormularioProcesoPreciosPorcentaje;
    
	
	
	protected Integer iXPanelCamposProcesoPreciosPorcentaje=0;
	protected Integer iYPanelCamposProcesoPreciosPorcentaje=0;
	
	protected Integer iXPanelCamposOcultosProcesoPreciosPorcentaje=0;
	protected Integer iYPanelCamposOcultosProcesoPreciosPorcentaje=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoPreciosPorcentaje;
	public JButton jButtonModificarProcesoPreciosPorcentaje;
	public JButton jButtonActualizarProcesoPreciosPorcentaje;
    public JButton jButtonEliminarProcesoPreciosPorcentaje;
	public JButton jButtonCancelarProcesoPreciosPorcentaje;
    public JButton jButtonGuardarCambiosProcesoPreciosPorcentaje;
	public JButton jButtonGuardarCambiosTablaProcesoPreciosPorcentaje;
	protected JButton jButtonCerrarProcesoPreciosPorcentaje;
	
	
	protected JButton jButtonProcesarInformacionProcesoPreciosPorcentaje;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonModificarToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonActualizarToolBarProcesoPreciosPorcentaje;
    protected JButton jButtonEliminarToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonCancelarToolBarProcesoPreciosPorcentaje;
    protected JButton jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoPreciosPorcentaje;
	protected JButton jButtonCerrarToolBarProcesoPreciosPorcentaje;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoPreciosPorcentaje;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemModificarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemActualizarProcesoPreciosPorcentaje;
    protected JMenuItem jMenuItemEliminarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemCancelarProcesoPreciosPorcentaje;
    protected JMenuItem jMenuItemGuardarCambiosProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemCerrarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemDetalleCerrarProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoPreciosPorcentaje;
	protected JMenuItem jMenuItemMostrarOcultarProcesoPreciosPorcentaje;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoPreciosPorcentaje;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoPreciosPorcentaje;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoPreciosPorcentaje;
	public JLabel jLabelIdProcesoPreciosPorcentaje;
	public JLabel jLabelidProcesoPreciosPorcentaje;
	public JButton jButtonidProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoPreciosPorcentaje;
	public JLabel jLabelcodigoProcesoPreciosPorcentaje;
	public JTextArea jTextAreacodigoProcesoPreciosPorcentaje;
	public JScrollPane jscrollPanecodigoProcesoPreciosPorcentaje;
	public JButton jButtoncodigoProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesoPreciosPorcentaje;
	public JLabel jLabelnombreProcesoPreciosPorcentaje;
	public JTextArea jTextAreanombreProcesoPreciosPorcentaje;
	public JScrollPane jscrollPanenombreProcesoPreciosPorcentaje;
	public JButton jButtonnombreProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoProcesoPreciosPorcentaje;
	public JLabel jLabelcodigo_productoProcesoPreciosPorcentaje;
	public JTextField jTextFieldcodigo_productoProcesoPreciosPorcentaje;
	public JButton jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProcesoPreciosPorcentaje;
	public JLabel jLabelnombre_productoProcesoPreciosPorcentaje;
	public JTextArea jTextAreanombre_productoProcesoPreciosPorcentaje;
	public JScrollPane jscrollPanenombre_productoProcesoPreciosPorcentaje;
	public JButton jButtonnombre_productoProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelprecioProcesoPreciosPorcentaje;
	public JLabel jLabelprecioProcesoPreciosPorcentaje;
	public JTextField jTextFieldprecioProcesoPreciosPorcentaje;
	public JButton jButtonprecioProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeProcesoPreciosPorcentaje;
	public JLabel jLabelporcentajeProcesoPreciosPorcentaje;
	public JTextField jTextFieldporcentajeProcesoPreciosPorcentaje;
	public JButton jButtonporcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaProcesoPreciosPorcentaje;
	public JLabel jLabelid_bodegaProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProcesoPreciosPorcentaje;
	public JButton jButtonid_bodegaProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_bodegaProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProcesoPreciosPorcentaje;
	public JLabel jLabelid_productoProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProcesoPreciosPorcentaje;
	public JButton jButtonid_productoProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_productoProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_productoProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaProcesoPreciosPorcentaje;
	public JLabel jLabelid_empresaProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoPreciosPorcentaje;
	public JButton jButtonid_empresaProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_empresaProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoPreciosPorcentaje;
	public JLabel jLabelid_sucursalProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoPreciosPorcentaje;
	public JButton jButtonid_sucursalProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_sucursalProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProcesoPreciosPorcentaje;
	public JLabel jLabelid_lineaProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProcesoPreciosPorcentaje;
	public JButton jButtonid_lineaProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_lineaProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_lineaProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProcesoPreciosPorcentaje;
	public JLabel jLabelid_linea_grupoProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProcesoPreciosPorcentaje;
	public JButton jButtonid_linea_grupoProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProcesoPreciosPorcentaje;
	public JLabel jLabelid_linea_categoriaProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProcesoPreciosPorcentaje;
	public JButton jButtonid_linea_categoriaProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProcesoPreciosPorcentaje;
	public JLabel jLabelid_linea_marcaProcesoPreciosPorcentaje;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProcesoPreciosPorcentaje;
	public JButton jButtonid_linea_marcaProcesoPreciosPorcentaje= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoPreciosPorcentaje;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoPreciosPorcentaje=new JPanel();
				this.jPanelAccionesFormularioProcesoPreciosPorcentaje=new JPanel();
				this.jmenuBarDetalleProcesoPreciosPorcentaje=new JMenuBar();
				this.jTtoolBarDetalleProcesoPreciosPorcentaje=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosPorcentajeDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoPreciosPorcentaje No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoPreciosPorcentaje() {
		return this.jButtonActualizarToolBarProcesoPreciosPorcentaje;
	}
	
	public JButton getjButtonEliminarToolBarProcesoPreciosPorcentaje() {
		return this.jButtonEliminarToolBarProcesoPreciosPorcentaje;
	}
	
	public JButton getjButtonCancelarToolBarProcesoPreciosPorcentaje() {
		return this.jButtonCancelarToolBarProcesoPreciosPorcentaje;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoPreciosPorcentaje() {
		return this.jButtonProcesarInformacionProcesoPreciosPorcentaje;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoPreciosPorcentaje)	{
		this.jButtonProcesarInformacionProcesoPreciosPorcentaje = jButtonProcesarInformacionProcesoPreciosPorcentaje;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposAccionesProcesoPreciosPorcentaje;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposRelacionesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposRelacionesProcesoPreciosPorcentaje = jComboBoxTiposRelacionesProcesoPreciosPorcentaje;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposAccionesProcesoPreciosPorcentaje) {
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje = jComboBoxTiposAccionesProcesoPreciosPorcentaje;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje() {
		return this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje(
			JComboBox jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje) {
		this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje = jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesopreciosporcentajeSessionBean=new ProcesoPreciosPorcentajeSessionBean();
		
		this.procesopreciosporcentajeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopreciosporcentajeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoPreciosPorcentajeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoPreciosPorcentajeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoPreciosPorcentajeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Precios Porcentaje MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoPreciosPorcentajeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoPreciosPorcentaje= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoPreciosPorcentaje=new JButtonMe();
				this.jButtonModificarToolBarProcesoPreciosPorcentaje=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoPreciosPorcentaje,this.jTtoolBarDetalleProcesoPreciosPorcentaje,
							"actualizar","actualizar","Actualizar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoPreciosPorcentaje,this.jTtoolBarDetalleProcesoPreciosPorcentaje,
							"eliminar","eliminar","Eliminar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoPreciosPorcentaje,this.jTtoolBarDetalleProcesoPreciosPorcentaje,
							"cancelar","cancelar","Cancelar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoPreciosPorcentaje,this.jTtoolBarDetalleProcesoPreciosPorcentaje,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoPreciosPorcentaje=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoPreciosPorcentaje=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoPreciosPorcentaje=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoPreciosPorcentaje=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoPreciosPorcentaje=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoPreciosPorcentaje= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoPreciosPorcentaje.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoPreciosPorcentaje,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoPreciosPorcentaje= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoPreciosPorcentaje.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoPreciosPorcentaje,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoPreciosPorcentaje= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoPreciosPorcentaje.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoPreciosPorcentaje,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoPreciosPorcentaje= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoPreciosPorcentaje.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoPreciosPorcentaje,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoPreciosPorcentaje= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoPreciosPorcentaje.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoPreciosPorcentaje,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoPreciosPorcentaje= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoPreciosPorcentaje.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoPreciosPorcentaje,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoPreciosPorcentaje= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoPreciosPorcentaje.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoPreciosPorcentaje,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoPreciosPorcentaje.add(this.jMenuItemDetalleCerrarProcesoPreciosPorcentaje);
		
		this.jmenuDetalleAccionesProcesoPreciosPorcentaje.add(this.jMenuItemActualizarProcesoPreciosPorcentaje);
		this.jmenuDetalleAccionesProcesoPreciosPorcentaje.add(this.jMenuItemEliminarProcesoPreciosPorcentaje);
		this.jmenuDetalleAccionesProcesoPreciosPorcentaje.add(this.jMenuItemCancelarProcesoPreciosPorcentaje);		
		
		//this.jmenuDetalleDatosProcesoPreciosPorcentaje.add(this.jMenuItemDetalleAbrirOrderByProcesoPreciosPorcentaje);				
		this.jmenuDetalleDatosProcesoPreciosPorcentaje.add(this.jMenuItemDetalleMostarOcultarProcesoPreciosPorcentaje);				
				
		//this.jmenuDetalleAccionesProcesoPreciosPorcentaje.add(this.jMenuItemGuardarCambiosProcesoPreciosPorcentaje);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoPreciosPorcentaje.add(this.jmenuDetalleArchivoProcesoPreciosPorcentaje);		
		this.jmenuBarDetalleProcesoPreciosPorcentaje.add(this.jmenuDetalleAccionesProcesoPreciosPorcentaje);		
		this.jmenuBarDetalleProcesoPreciosPorcentaje.add(this.jmenuDetalleDatosProcesoPreciosPorcentaje);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoPreciosPorcentaje);				
	}
	
	
	public void inicializarElementosCamposProcesoPreciosPorcentaje() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoPreciosPorcentaje = new JLabelMe();
		jLabelIdProcesoPreciosPorcentaje.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoPreciosPorcentaje = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoPreciosPorcentaje= new GridBagLayout();

		this.jPanelidProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);

		jLabelidProcesoPreciosPorcentaje = new JLabel();
		jLabelidProcesoPreciosPorcentaje.setText("Id");

		jLabelidProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelcodigoProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoPreciosPorcentaje.setToolTipText("Codigo");
		this.jLabelcodigoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelcodigoProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jTextAreacodigoProcesoPreciosPorcentaje= new JTextAreaMe();
		jTextAreacodigoProcesoPreciosPorcentaje.setEnabled(false);
		jTextAreacodigoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoPreciosPorcentaje.setLineWrap(true);
		jTextAreacodigoProcesoPreciosPorcentaje.setWrapStyleWord(true);
		jTextAreacodigoProcesoPreciosPorcentaje.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoProcesoPreciosPorcentaje.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoProcesoPreciosPorcentaje = new JScrollPane(jTextAreacodigoProcesoPreciosPorcentaje);
		jscrollPanecodigoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoPreciosPorcentajeBusqueda.setVisible(false);		}


					
		this.jLabelnombreProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelnombreProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesoPreciosPorcentaje.setToolTipText("Nombre");
		this.jLabelnombreProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelnombreProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jTextAreanombreProcesoPreciosPorcentaje= new JTextAreaMe();
		jTextAreanombreProcesoPreciosPorcentaje.setEnabled(false);
		jTextAreanombreProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoPreciosPorcentaje.setLineWrap(true);
		jTextAreanombreProcesoPreciosPorcentaje.setWrapStyleWord(true);
		jTextAreanombreProcesoPreciosPorcentaje.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProcesoPreciosPorcentaje.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProcesoPreciosPorcentaje = new JScrollPane(jTextAreanombreProcesoPreciosPorcentaje);
		jscrollPanenombreProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesoPreciosPorcentajeBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelcodigo_productoProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoProcesoPreciosPorcentaje.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelcodigo_productoProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jTextFieldcodigo_productoProcesoPreciosPorcentaje= new JTextFieldMe();

		jTextFieldcodigo_productoProcesoPreciosPorcentaje.setEnabled(false);
		jTextFieldcodigo_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelnombre_productoProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProcesoPreciosPorcentaje.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelnombre_productoProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jTextAreanombre_productoProcesoPreciosPorcentaje= new JTextAreaMe();
		jTextAreanombre_productoProcesoPreciosPorcentaje.setEnabled(false);
		jTextAreanombre_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoPreciosPorcentaje.setLineWrap(true);
		jTextAreanombre_productoProcesoPreciosPorcentaje.setWrapStyleWord(true);
		jTextAreanombre_productoProcesoPreciosPorcentaje.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProcesoPreciosPorcentaje.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProcesoPreciosPorcentaje = new JScrollPane(jTextAreanombre_productoProcesoPreciosPorcentaje);
		jscrollPanenombre_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProcesoPreciosPorcentajeBusqueda.setVisible(false);		}


					
		this.jLabelprecioProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelprecioProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProcesoPreciosPorcentaje.setToolTipText("Precio");
		this.jLabelprecioProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelprecioProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jTextFieldprecioProcesoPreciosPorcentaje= new JTextFieldMe();
		jTextFieldprecioProcesoPreciosPorcentaje.setEnabled(false);
		jTextFieldprecioProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProcesoPreciosPorcentaje.setText("0.0");

		this.jButtonprecioProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProcesoPreciosPorcentajeBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelporcentajeProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeProcesoPreciosPorcentaje.setToolTipText("Porcentaje");
		this.jLabelporcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelporcentajeProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jTextFieldporcentajeProcesoPreciosPorcentaje= new JTextFieldMe();
		jTextFieldporcentajeProcesoPreciosPorcentaje.setEnabled(false);
		jTextFieldporcentajeProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeProcesoPreciosPorcentaje.setText("0.0");

		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeProcesoPreciosPorcentajeBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoPreciosPorcentaje() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_bodegaProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProcesoPreciosPorcentaje.setToolTipText("Bodega");
		this.jLabelid_bodegaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_bodegaProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_bodegaProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_bodegaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_bodegaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_bodegaProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoPreciosPorcentaje"));

		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_productoProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_productoProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProcesoPreciosPorcentaje.setToolTipText("Producto");
		this.jLabelid_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_productoProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_productoProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_productoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_productoProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoPreciosPorcentaje"));

		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_productoProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_productoProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_productoProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_empresaProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_empresaProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoPreciosPorcentaje.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_empresaProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_empresaProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_empresaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoPreciosPorcentaje.setEnabled(false);

		this.jButtonid_empresaProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_empresaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_empresaProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoPreciosPorcentaje"));

		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_empresaProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_sucursalProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_sucursalProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoPreciosPorcentaje.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_sucursalProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_sucursalProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_sucursalProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoPreciosPorcentaje.setEnabled(false);

		this.jButtonid_sucursalProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_sucursalProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_sucursalProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoPreciosPorcentaje"));

		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_lineaProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_lineaProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProcesoPreciosPorcentaje.setToolTipText("Linea");
		this.jLabelid_lineaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_lineaProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_lineaProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_lineaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_lineaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_lineaProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoPreciosPorcentaje"));

		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_lineaProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_lineaProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_lineaProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_linea_grupoProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_linea_grupoProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProcesoPreciosPorcentaje.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_linea_grupoProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_linea_grupoProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_linea_grupoProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_linea_grupoProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoPreciosPorcentaje"));

		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_linea_categoriaProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_linea_categoriaProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProcesoPreciosPorcentaje.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_linea_categoriaProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoPreciosPorcentaje"));

		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoPreciosPorcentajeUpdate"));



					
		this.jLabelid_linea_marcaProcesoPreciosPorcentaje = new JLabelMe();
		this.jLabelid_linea_marcaProcesoPreciosPorcentaje.setText(""+ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProcesoPreciosPorcentaje.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProcesoPreciosPorcentaje=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProcesoPreciosPorcentaje.setToolTipText(ProcesoPreciosPorcentajeConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		this.jPanelid_linea_marcaProcesoPreciosPorcentaje.setLayout(this.gridaBagLayoutProcesoPreciosPorcentaje);


		jComboBoxid_linea_marcaProcesoPreciosPorcentaje= new JComboBoxMe();
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProcesoPreciosPorcentaje= new JButtonMe();
		this.jButtonid_linea_marcaProcesoPreciosPorcentaje.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoPreciosPorcentaje.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoPreciosPorcentaje.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoPreciosPorcentaje.setText("Buscar");
		this.jButtonid_linea_marcaProcesoPreciosPorcentaje.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProcesoPreciosPorcentaje.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoPreciosPorcentaje,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoPreciosPorcentaje"));

		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setText("U");
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoPreciosPorcentajeBusqueda"));

		if(this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.setText("U");
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoPreciosPorcentaje.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoPreciosPorcentajeUpdate"));



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
		//this.jInternalFrameDetalleProcesoPreciosPorcentaje = new ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Precios Porcentaje DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoPreciosPorcentaje= new GridBagLayout();
		

		
		String sToolTipProcesoPreciosPorcentaje="";
		sToolTipProcesoPreciosPorcentaje=ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoPreciosPorcentaje+="(Inventario.ProcesoPreciosPorcentaje)";
		}
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoPreciosPorcentaje+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonModificarProcesoPreciosPorcentaje = new JButtonMe();
        this.jButtonActualizarProcesoPreciosPorcentaje = new JButtonMe();
        this.jButtonEliminarProcesoPreciosPorcentaje = new JButtonMe();
        this.jButtonCancelarProcesoPreciosPorcentaje = new JButtonMe();
        this.jButtonGuardarCambiosProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje = new JButtonMe();
		this.jButtonCerrarProcesoPreciosPorcentaje = new JButtonMe();
		
		this.jScrollPanelDatosProcesoPreciosPorcentaje = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Precios Porcentaje";
		
		if(!this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Porcentajes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoPreciosPorcentaje.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoPreciosPorcentaje.setName("jPanelCamposProcesoPreciosPorcentaje"); 

		this.jPanelCamposOcultosProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoPreciosPorcentaje.setName("jPanelCamposOcultosProcesoPreciosPorcentaje"); 

        this.jPanelAccionesProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoPreciosPorcentaje.setToolTipText("Acciones");
        this.jPanelAccionesProcesoPreciosPorcentaje.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoPreciosPorcentaje.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoPreciosPorcentaje.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoPreciosPorcentaje.setText("Nuevo");
		this.jButtonModificarProcesoPreciosPorcentaje.setText("Editar");
        this.jButtonActualizarProcesoPreciosPorcentaje.setText("Actualizar");
        this.jButtonEliminarProcesoPreciosPorcentaje.setText("Eliminar");
        this.jButtonCancelarProcesoPreciosPorcentaje.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoPreciosPorcentaje.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.setText("Guardar");
		this.jButtonCerrarProcesoPreciosPorcentaje.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoPreciosPorcentaje,"nuevo_button","Nuevo",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoPreciosPorcentaje,"modificar_button","Editar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoPreciosPorcentaje,"actualizar_button","Actualizar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoPreciosPorcentaje,"eliminar_button","Eliminar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoPreciosPorcentaje,"cancelar_button","Cancelar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoPreciosPorcentaje,"guardarcambios_button","Guardar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje,"guardarcambiostabla_button","Guardar",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoPreciosPorcentaje,"cerrar_button","Salir",this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoPreciosPorcentaje.setToolTipText("Nuevo"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoPreciosPorcentaje.setToolTipText("Editar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoPreciosPorcentaje.setToolTipText("Actualizar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoPreciosPorcentaje.setToolTipText("Eliminar)"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoPreciosPorcentaje.setToolTipText("Cancelar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoPreciosPorcentaje.setToolTipText("Guardar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.setToolTipText("Guardar"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoPreciosPorcentaje.setToolTipText("Salir"+" "+ProcesoPreciosPorcentajeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoPreciosPorcentaje";
		inputMap = this.jButtonNuevoProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoPreciosPorcentaje.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoPreciosPorcentaje"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoPreciosPorcentaje";
		inputMap = this.jButtonActualizarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoPreciosPorcentaje"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoPreciosPorcentaje";
		inputMap = this.jButtonEliminarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoPreciosPorcentaje"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoPreciosPorcentaje";
		inputMap = this.jButtonCancelarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoPreciosPorcentaje"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoPreciosPorcentaje";
		inputMap = this.jButtonCerrarProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoPreciosPorcentaje"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoPreciosPorcentaje";
		inputMap = this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoPreciosPorcentaje.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoPreciosPorcentaje"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje.setToolTipText("Nuevo ProcesoPreciosPorcentaje");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje.setToolTipText("Sin Cerrar Ventana ProcesoPreciosPorcentaje");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setText("Accion");
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoPreciosPorcentaje = new JLabelMe();
		
		this.jLabelAccionesProcesoPreciosPorcentaje.setText("Acciones");		
		this.jLabelAccionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoPreciosPorcentaje();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoPreciosPorcentaje();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoPreciosPorcentaje=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoPreciosPorcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoPreciosPorcentaje,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoPreciosPorcentaje = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoPreciosPorcentaje = new GridBagLayout();
		
		this.jPanelCamposProcesoPreciosPorcentaje.setLayout(gridaBagLayoutCamposProcesoPreciosPorcentaje);
		this.jPanelCamposOcultosProcesoPreciosPorcentaje.setLayout(gridaBagLayoutCamposOcultosProcesoPreciosPorcentaje);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoPreciosPorcentaje.add(jLabelIdProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoPreciosPorcentaje.add(jLabelidProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProcesoPreciosPorcentaje.add(jLabelid_bodegaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoPreciosPorcentaje.add(jButtonid_bodegaProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoPreciosPorcentaje.add(jButtonid_bodegaProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProcesoPreciosPorcentaje.add(jComboBoxid_bodegaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProcesoPreciosPorcentaje.add(jLabelid_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoPreciosPorcentaje.add(jButtonid_productoProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoPreciosPorcentaje.add(jButtonid_productoProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProcesoPreciosPorcentaje.add(jComboBoxid_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoPreciosPorcentaje.add(jLabelid_empresaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoPreciosPorcentaje.add(jButtonid_empresaProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoPreciosPorcentaje.add(jButtonid_empresaProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoPreciosPorcentaje.add(jComboBoxid_empresaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoPreciosPorcentaje.add(jLabelid_sucursalProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoPreciosPorcentaje.add(jButtonid_sucursalProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoPreciosPorcentaje.add(jButtonid_sucursalProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoPreciosPorcentaje.add(jComboBoxid_sucursalProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProcesoPreciosPorcentaje.add(jLabelid_lineaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoPreciosPorcentaje.add(jButtonid_lineaProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoPreciosPorcentaje.add(jButtonid_lineaProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProcesoPreciosPorcentaje.add(jComboBoxid_lineaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProcesoPreciosPorcentaje.add(jLabelid_linea_grupoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoPreciosPorcentaje.add(jButtonid_linea_grupoProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoPreciosPorcentaje.add(jButtonid_linea_grupoProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProcesoPreciosPorcentaje.add(jComboBoxid_linea_grupoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProcesoPreciosPorcentaje.add(jLabelid_linea_categoriaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoPreciosPorcentaje.add(jButtonid_linea_categoriaProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoPreciosPorcentaje.add(jButtonid_linea_categoriaProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProcesoPreciosPorcentaje.add(jComboBoxid_linea_categoriaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProcesoPreciosPorcentaje.add(jLabelid_linea_marcaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoPreciosPorcentaje.add(jButtonid_linea_marcaProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 3;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoPreciosPorcentaje.add(jButtonid_linea_marcaProcesoPreciosPorcentajeUpdate, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProcesoPreciosPorcentaje.add(jComboBoxid_linea_marcaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoPreciosPorcentaje.add(jLabelcodigoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoPreciosPorcentaje.add(jButtoncodigoProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoPreciosPorcentaje.add(jscrollPanecodigoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesoPreciosPorcentaje.add(jLabelnombreProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesoPreciosPorcentaje.add(jButtonnombreProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesoPreciosPorcentaje.add(jscrollPanenombreProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoProcesoPreciosPorcentaje.add(jLabelcodigo_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoProcesoPreciosPorcentaje.add(jButtoncodigo_productoProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoProcesoPreciosPorcentaje.add(jTextFieldcodigo_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProcesoPreciosPorcentaje.add(jLabelnombre_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProcesoPreciosPorcentaje.add(jButtonnombre_productoProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProcesoPreciosPorcentaje.add(jscrollPanenombre_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProcesoPreciosPorcentaje.add(jLabelprecioProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProcesoPreciosPorcentaje.add(jButtonprecioProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProcesoPreciosPorcentaje.add(jTextFieldprecioProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeProcesoPreciosPorcentaje.add(jLabelporcentajeProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 2;
		this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeProcesoPreciosPorcentaje.add(jButtonporcentajeProcesoPreciosPorcentajeBusqueda, this.gridBagConstraintsProcesoPreciosPorcentaje);
	}

	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 1;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeProcesoPreciosPorcentaje.add(jTextFieldporcentajeProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelidProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelid_bodegaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelid_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelid_lineaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelid_linea_grupoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelid_linea_categoriaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelid_linea_marcaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelcodigoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelnombreProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelcodigo_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelnombre_productoProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelprecioProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosPorcentaje.add(this.jPanelporcentajeProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposProcesoPreciosPorcentaje=0;
		iYPanelCamposProcesoPreciosPorcentaje++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposOcultosProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposOcultosProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoPreciosPorcentaje.add(this.jPanelid_empresaProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposOcultosProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposOcultosProcesoPreciosPorcentaje=0;
		iYPanelCamposOcultosProcesoPreciosPorcentaje++;
	}
	this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iYPanelCamposOcultosProcesoPreciosPorcentaje;
	this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iXPanelCamposOcultosProcesoPreciosPorcentaje++;
	this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosPorcentaje.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoPreciosPorcentaje.add(this.jPanelid_sucursalProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);



	if(iXPanelCamposOcultosProcesoPreciosPorcentaje % 2==0) {
		iXPanelCamposOcultosProcesoPreciosPorcentaje=0;
		iYPanelCamposOcultosProcesoPreciosPorcentaje++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoPreciosPorcentaje= new GridBagLayout();
		this.jPanelAccionesProcesoPreciosPorcentaje.setLayout(gridaBagLayoutAccionesProcesoPreciosPorcentaje);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoPreciosPorcentaje= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoPreciosPorcentaje.setLayout(gridaBagLayoutAccionesFormularioProcesoPreciosPorcentaje);
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoPreciosPorcentaje.add(this.jComboBoxTiposAccionesFormularioProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoPreciosPorcentaje.add(this.jButtonModificarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);							

		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoPreciosPorcentaje.add(this.jButtonEliminarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoPreciosPorcentaje.add(this.jButtonActualizarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);


		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoPreciosPorcentaje.add(this.jButtonGuardarCambiosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);	
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = 0;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoPreciosPorcentaje.add(this.jButtonCancelarProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoPreciosPorcentaje = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoPreciosPorcentaje);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesopreciosporcentajeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();						
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;		
			//this.gridBagConstraintsProcesoPreciosPorcentaje.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoPreciosPorcentaje.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =0;
		this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoPreciosPorcentaje.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoPreciosPorcentajeJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoPreciosPorcentaje = new ProcesoPreciosPorcentajeBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Precios Porcentaje DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Precios Porcentaje DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Precios Porcentaje Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoPreciosPorcentajeModel procesopreciosporcentajeModel=new ProcesoPreciosPorcentajeModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoPreciosPorcentajeModel.ProcesoPreciosPorcentajeFocusTraversalPolicy procesopreciosporcentajeFocusTraversalPolicy = procesopreciosporcentajeModel.new ProcesoPreciosPorcentajeFocusTraversalPolicy(this);
			
			//procesopreciosporcentajeFocusTraversalPolicy.setprocesopreciosporcentajeJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesopreciosporcentajeModel);
			
			
			this.jContentPaneDetalleProcesoPreciosPorcentaje = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoPreciosPorcentaje = new GridBagLayout();	
			this.jContentPaneDetalleProcesoPreciosPorcentaje.setLayout(gridaBagLayoutDetalleProcesoPreciosPorcentaje);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoPreciosPorcentaje = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
				this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoPreciosPorcentaje.add(jTtoolBarDetalleProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje=   new JScrollPane(jContentPaneDetalleProcesoPreciosPorcentaje,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	        
			this.jContentPaneDetalleProcesoPreciosPorcentaje.add(jPanelCamposProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);
			
			
			
			
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
						//&& procesopreciosporcentajeSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesopreciosporcentajeSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoPreciosPorcentaje= new GridBagConstraints();
						this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
						this.jContentPaneDetalleProcesoPreciosPorcentaje.add(this.jTabbedPaneRelacionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoPreciosPorcentaje.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoPreciosPorcentaje.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
					this.gridBagConstraintsProcesoPreciosPorcentaje.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoPreciosPorcentaje.add(jPanelCamposOcultosProcesoPreciosPorcentaje, gridBagConstraintsProcesoPreciosPorcentaje);
				
					this.jPanelCamposOcultosProcesoPreciosPorcentaje.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	        this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoPreciosPorcentaje.add(this.jPanelAccionesFormularioProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);							
			
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
	        this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoPreciosPorcentaje.add(this.jPanelAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoPreciosPorcentaje);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje=   new JScrollPane(this.jPanelCamposProcesoPreciosPorcentaje,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
			this.gridBagConstraintsProcesoPreciosPorcentaje.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoPreciosPorcentaje.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoPreciosPorcentaje.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);			
			
			this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
			
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		
			
		this.gridBagConstraintsProcesoPreciosPorcentaje = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosPorcentaje.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoPreciosPorcentaje, this.gridBagConstraintsProcesoPreciosPorcentaje);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoPreciosPorcentaje;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoPreciosPorcentaje;
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
