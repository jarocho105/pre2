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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DetallePlaneacionCompraConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DetallePlaneacionCompraDetalleFormJInternalFrame extends DetallePlaneacionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePlaneacionCompra;
	
	protected JMenuBar jmenuBarDetalleDetallePlaneacionCompra;
	
	protected JMenu jmenuDetalleDetallePlaneacionCompra;
	protected JMenu jmenuDetalleArchivoDetallePlaneacionCompra;
	protected JMenu jmenuDetalleAccionesDetallePlaneacionCompra;
	protected JMenu jmenuDetalleDatosDetallePlaneacionCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePlaneacionCompra;	
	protected GridBagConstraints gridBagConstraintsDetallePlaneacionCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePlaneacionCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePlaneacionCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_planeacioncompra="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public PlaneacionCompraSessionBean planeacioncompraSessionBean;
	public LineaSessionBean lineaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public DetallePlaneacionCompraLogic detalleplaneacioncompraLogic;
	
	public JScrollPane jScrollPanelDatosDetallePlaneacionCompra;
	public JScrollPane jScrollPanelDatosEdicionDetallePlaneacionCompra;
	public JScrollPane jScrollPanelDatosGeneralDetallePlaneacionCompra;
	
	protected JPanel jPanelCamposDetallePlaneacionCompra;    
	protected JPanel jPanelCamposOcultosDetallePlaneacionCompra;    	
	protected JPanel jPanelAccionesDetallePlaneacionCompra;
	protected JPanel jPanelAccionesFormularioDetallePlaneacionCompra;
    
	
	
	protected Integer iXPanelCamposDetallePlaneacionCompra=0;
	protected Integer iYPanelCamposDetallePlaneacionCompra=0;
	
	protected Integer iXPanelCamposOcultosDetallePlaneacionCompra=0;
	protected Integer iYPanelCamposOcultosDetallePlaneacionCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePlaneacionCompra;
	public JButton jButtonModificarDetallePlaneacionCompra;
	public JButton jButtonActualizarDetallePlaneacionCompra;
    public JButton jButtonEliminarDetallePlaneacionCompra;
	public JButton jButtonCancelarDetallePlaneacionCompra;
    public JButton jButtonGuardarCambiosDetallePlaneacionCompra;
	public JButton jButtonGuardarCambiosTablaDetallePlaneacionCompra;
	protected JButton jButtonCerrarDetallePlaneacionCompra;
	
	
	protected JButton jButtonProcesarInformacionDetallePlaneacionCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePlaneacionCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePlaneacionCompra;
	protected JButton jButtonModificarToolBarDetallePlaneacionCompra;
	protected JButton jButtonActualizarToolBarDetallePlaneacionCompra;
    protected JButton jButtonEliminarToolBarDetallePlaneacionCompra;
	protected JButton jButtonCancelarToolBarDetallePlaneacionCompra;
    protected JButton jButtonGuardarCambiosToolBarDetallePlaneacionCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePlaneacionCompra;
	protected JButton jButtonCerrarToolBarDetallePlaneacionCompra;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePlaneacionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePlaneacionCompra;
	protected JMenuItem jMenuItemModificarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemActualizarDetallePlaneacionCompra;
    protected JMenuItem jMenuItemEliminarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemCancelarDetallePlaneacionCompra;
    protected JMenuItem jMenuItemGuardarCambiosDetallePlaneacionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePlaneacionCompra;
	protected JMenuItem jMenuItemCerrarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetallePlaneacionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePlaneacionCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePlaneacionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetallePlaneacionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePlaneacionCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePlaneacionCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePlaneacionCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePlaneacionCompra;
	public JLabel jLabelIdDetallePlaneacionCompra;
	public JLabel jLabelidDetallePlaneacionCompra;
	public JButton jButtonidDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelstockDetallePlaneacionCompra;
	public JLabel jLabelstockDetallePlaneacionCompra;
	public JTextField jTextFieldstockDetallePlaneacionCompra;
	public JButton jButtonstockDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldia_minimoDetallePlaneacionCompra;
	public JLabel jLabeldia_minimoDetallePlaneacionCompra;
	public JTextField jTextFielddia_minimoDetallePlaneacionCompra;
	public JButton jButtondia_minimoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelstock_minimoDetallePlaneacionCompra;
	public JLabel jLabelstock_minimoDetallePlaneacionCompra;
	public JTextField jTextFieldstock_minimoDetallePlaneacionCompra;
	public JButton jButtonstock_minimoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldia_maximoDetallePlaneacionCompra;
	public JLabel jLabeldia_maximoDetallePlaneacionCompra;
	public JTextField jTextFielddia_maximoDetallePlaneacionCompra;
	public JButton jButtondia_maximoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelstock_maximoDetallePlaneacionCompra;
	public JLabel jLabelstock_maximoDetallePlaneacionCompra;
	public JTextField jTextFieldstock_maximoDetallePlaneacionCompra;
	public JButton jButtonstock_maximoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelsalidaDetallePlaneacionCompra;
	public JLabel jLabelsalidaDetallePlaneacionCompra;
	public JTextField jTextFieldsalidaDetallePlaneacionCompra;
	public JButton jButtonsalidaDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelstock_mensualDetallePlaneacionCompra;
	public JLabel jLabelstock_mensualDetallePlaneacionCompra;
	public JTextField jTextFieldstock_mensualDetallePlaneacionCompra;
	public JButton jButtonstock_mensualDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetallePlaneacionCompra;
	public JLabel jLabeldescripcionDetallePlaneacionCompra;
	public JTextArea jTextAreadescripcionDetallePlaneacionCompra;
	public JScrollPane jscrollPanedescripcionDetallePlaneacionCompra;
	public JButton jButtondescripcionDetallePlaneacionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallePlaneacionCompra;
	public JLabel jLabelid_empresaDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePlaneacionCompra;
	public JButton jButtonid_empresaDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_empresaDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePlaneacionCompra;
	public JLabel jLabelid_sucursalDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePlaneacionCompra;
	public JButton jButtonid_sucursalDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_sucursalDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePlaneacionCompra;
	public JLabel jLabelid_ejercicioDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePlaneacionCompra;
	public JButton jButtonid_ejercicioDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePlaneacionCompra;
	public JLabel jLabelid_periodoDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePlaneacionCompra;
	public JButton jButtonid_periodoDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_periodoDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_planeacion_compraDetallePlaneacionCompra;
	public JLabel jLabelid_planeacion_compraDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_planeacion_compraDetallePlaneacionCompra;
	public JButton jButtonid_planeacion_compraDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_planeacion_compraDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaDetallePlaneacionCompra;
	public JLabel jLabelid_lineaDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaDetallePlaneacionCompra;
	public JButton jButtonid_lineaDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_lineaDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_lineaDetallePlaneacionCompraBusqueda= new JButtonMe();
	public JButton jButtonid_lineaDetallePlaneacionCompraArbol= new JButtonMe();

	public JPanel jPanelid_productoDetallePlaneacionCompra;
	public JLabel jLabelid_productoDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetallePlaneacionCompra;
	public JButton jButtonid_productoDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_productoDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoDetallePlaneacionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetallePlaneacionCompra;
	public JLabel jLabelid_unidadDetallePlaneacionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetallePlaneacionCompra;
	public JButton jButtonid_unidadDetallePlaneacionCompra= new JButtonMe();
	public JButton jButtonid_unidadDetallePlaneacionCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetallePlaneacionCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePlaneacionCompra;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePlaneacionCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePlaneacionCompra=new JPanel();
				this.jPanelAccionesFormularioDetallePlaneacionCompra=new JPanel();
				this.jmenuBarDetalleDetallePlaneacionCompra=new JMenuBar();
				this.jTtoolBarDetalleDetallePlaneacionCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePlaneacionCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePlaneacionCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePlaneacionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePlaneacionCompra() {
		return this.jButtonActualizarToolBarDetallePlaneacionCompra;
	}
	
	public JButton getjButtonEliminarToolBarDetallePlaneacionCompra() {
		return this.jButtonEliminarToolBarDetallePlaneacionCompra;
	}
	
	public JButton getjButtonCancelarToolBarDetallePlaneacionCompra() {
		return this.jButtonCancelarToolBarDetallePlaneacionCompra;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePlaneacionCompra() {
		return this.jButtonProcesarInformacionDetallePlaneacionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePlaneacionCompra)	{
		this.jButtonProcesarInformacionDetallePlaneacionCompra = jButtonProcesarInformacionDetallePlaneacionCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePlaneacionCompra() {
		return this.jComboBoxTiposAccionesDetallePlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposRelacionesDetallePlaneacionCompra) {
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra = jComboBoxTiposRelacionesDetallePlaneacionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePlaneacionCompra(
			JComboBox jComboBoxTiposAccionesDetallePlaneacionCompra) {
		this.jComboBoxTiposAccionesDetallePlaneacionCompra = jComboBoxTiposAccionesDetallePlaneacionCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePlaneacionCompra() {
		return this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePlaneacionCompra(
			JComboBox jComboBoxTiposAccionesFormularioDetallePlaneacionCompra) {
		this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra = jComboBoxTiposAccionesFormularioDetallePlaneacionCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		
		this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePlaneacionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Planeacion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePlaneacionCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePlaneacionCompra=new JButtonMe();
				this.jButtonModificarToolBarDetallePlaneacionCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePlaneacionCompra,this.jTtoolBarDetalleDetallePlaneacionCompra,
							"actualizar","actualizar","Actualizar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePlaneacionCompra,this.jTtoolBarDetalleDetallePlaneacionCompra,
							"eliminar","eliminar","Eliminar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePlaneacionCompra,this.jTtoolBarDetalleDetallePlaneacionCompra,
							"cancelar","cancelar","Cancelar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePlaneacionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePlaneacionCompra,this.jTtoolBarDetalleDetallePlaneacionCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePlaneacionCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePlaneacionCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePlaneacionCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePlaneacionCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePlaneacionCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePlaneacionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePlaneacionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePlaneacionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePlaneacionCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePlaneacionCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePlaneacionCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePlaneacionCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePlaneacionCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePlaneacionCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePlaneacionCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePlaneacionCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePlaneacionCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePlaneacionCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePlaneacionCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePlaneacionCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePlaneacionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePlaneacionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePlaneacionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePlaneacionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePlaneacionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePlaneacionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePlaneacionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePlaneacionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePlaneacionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePlaneacionCompra.add(this.jMenuItemDetalleCerrarDetallePlaneacionCompra);
		
		this.jmenuDetalleAccionesDetallePlaneacionCompra.add(this.jMenuItemActualizarDetallePlaneacionCompra);
		this.jmenuDetalleAccionesDetallePlaneacionCompra.add(this.jMenuItemEliminarDetallePlaneacionCompra);
		this.jmenuDetalleAccionesDetallePlaneacionCompra.add(this.jMenuItemCancelarDetallePlaneacionCompra);		
		
		//this.jmenuDetalleDatosDetallePlaneacionCompra.add(this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra);				
		this.jmenuDetalleDatosDetallePlaneacionCompra.add(this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra);				
				
		//this.jmenuDetalleAccionesDetallePlaneacionCompra.add(this.jMenuItemGuardarCambiosDetallePlaneacionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePlaneacionCompra.add(this.jmenuDetalleArchivoDetallePlaneacionCompra);		
		this.jmenuBarDetalleDetallePlaneacionCompra.add(this.jmenuDetalleAccionesDetallePlaneacionCompra);		
		this.jmenuBarDetalleDetallePlaneacionCompra.add(this.jmenuDetalleDatosDetallePlaneacionCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePlaneacionCompra);				
	}
	
	
	public void inicializarElementosCamposDetallePlaneacionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePlaneacionCompra = new JLabelMe();
		jLabelIdDetallePlaneacionCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePlaneacionCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePlaneacionCompra= new GridBagLayout();

		this.jPanelidDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);

		jLabelidDetallePlaneacionCompra = new JLabel();
		jLabelidDetallePlaneacionCompra.setText("Id");

		jLabelidDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelstockDetallePlaneacionCompra = new JLabelMe();
		this.jLabelstockDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK+" : *");
		this.jLabelstockDetallePlaneacionCompra.setToolTipText("Stock");
		this.jLabelstockDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstockDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstockDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstockDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelstockDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFieldstockDetallePlaneacionCompra= new JTextFieldMe();
		jTextFieldstockDetallePlaneacionCompra.setEnabled(false);
		jTextFieldstockDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstockDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstockDetallePlaneacionCompra.setText("0.0");

		this.jButtonstockDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonstockDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstockDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonstockDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstockDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstockDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstockDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstockDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stockDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstockDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldia_minimoDetallePlaneacionCompra = new JLabelMe();
		this.jLabeldia_minimoDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO+" : *");
		this.jLabeldia_minimoDetallePlaneacionCompra.setToolTipText("Dia Minimo");
		this.jLabeldia_minimoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_minimoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_minimoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_minimoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_minimoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_minimoDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPaneldia_minimoDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFielddia_minimoDetallePlaneacionCompra= new JTextFieldMe();
		jTextFielddia_minimoDetallePlaneacionCompra.setEnabled(false);
		jTextFielddia_minimoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_minimoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_minimoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_minimoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_minimoDetallePlaneacionCompra.setText("0");

		this.jButtondia_minimoDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_minimoDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_minimoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_minimoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_minimoDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_minimoDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelstock_minimoDetallePlaneacionCompra = new JLabelMe();
		this.jLabelstock_minimoDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO+" : *");
		this.jLabelstock_minimoDetallePlaneacionCompra.setToolTipText("Stock Minimo");
		this.jLabelstock_minimoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_minimoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_minimoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstock_minimoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstock_minimoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstock_minimoDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelstock_minimoDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFieldstock_minimoDetallePlaneacionCompra= new JTextFieldMe();
		jTextFieldstock_minimoDetallePlaneacionCompra.setEnabled(false);
		jTextFieldstock_minimoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_minimoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_minimoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstock_minimoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstock_minimoDetallePlaneacionCompra.setText("0.0");

		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstock_minimoDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstock_minimoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstock_minimoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stock_minimoDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstock_minimoDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldia_maximoDetallePlaneacionCompra = new JLabelMe();
		this.jLabeldia_maximoDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO+" : *");
		this.jLabeldia_maximoDetallePlaneacionCompra.setToolTipText("Dia Maximo");
		this.jLabeldia_maximoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_maximoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_maximoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_maximoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_maximoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_maximoDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPaneldia_maximoDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFielddia_maximoDetallePlaneacionCompra= new JTextFieldMe();
		jTextFielddia_maximoDetallePlaneacionCompra.setEnabled(false);
		jTextFielddia_maximoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_maximoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_maximoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_maximoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_maximoDetallePlaneacionCompra.setText("0");

		this.jButtondia_maximoDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_maximoDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_maximoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_maximoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_maximoDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_maximoDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelstock_maximoDetallePlaneacionCompra = new JLabelMe();
		this.jLabelstock_maximoDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO+" : *");
		this.jLabelstock_maximoDetallePlaneacionCompra.setToolTipText("Stock Maximo");
		this.jLabelstock_maximoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_maximoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_maximoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstock_maximoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstock_maximoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstock_maximoDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelstock_maximoDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFieldstock_maximoDetallePlaneacionCompra= new JTextFieldMe();
		jTextFieldstock_maximoDetallePlaneacionCompra.setEnabled(false);
		jTextFieldstock_maximoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_maximoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_maximoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstock_maximoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstock_maximoDetallePlaneacionCompra.setText("0.0");

		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstock_maximoDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstock_maximoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstock_maximoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stock_maximoDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstock_maximoDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelsalidaDetallePlaneacionCompra = new JLabelMe();
		this.jLabelsalidaDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA+" : *");
		this.jLabelsalidaDetallePlaneacionCompra.setToolTipText("Salida");
		this.jLabelsalidaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsalidaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsalidaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsalidaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsalidaDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsalidaDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelsalidaDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFieldsalidaDetallePlaneacionCompra= new JTextFieldMe();
		jTextFieldsalidaDetallePlaneacionCompra.setEnabled(false);
		jTextFieldsalidaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsalidaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsalidaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsalidaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsalidaDetallePlaneacionCompra.setText("0.0");

		this.jButtonsalidaDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonsalidaDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsalidaDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsalidaDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsalidaDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonsalidaDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsalidaDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsalidaDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsalidaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsalidaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"salidaDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsalidaDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabelstock_mensualDetallePlaneacionCompra = new JLabelMe();
		this.jLabelstock_mensualDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL+" : *");
		this.jLabelstock_mensualDetallePlaneacionCompra.setToolTipText("Stock Mensual");
		this.jLabelstock_mensualDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_mensualDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_mensualDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstock_mensualDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstock_mensualDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstock_mensualDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelstock_mensualDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextFieldstock_mensualDetallePlaneacionCompra= new JTextFieldMe();
		jTextFieldstock_mensualDetallePlaneacionCompra.setEnabled(false);
		jTextFieldstock_mensualDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_mensualDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_mensualDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstock_mensualDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstock_mensualDetallePlaneacionCompra.setText("0.0");

		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstock_mensualDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstock_mensualDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstock_mensualDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stock_mensualDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstock_mensualDetallePlaneacionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetallePlaneacionCompra = new JLabelMe();
		this.jLabeldescripcionDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetallePlaneacionCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPaneldescripcionDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jTextAreadescripcionDetallePlaneacionCompra= new JTextAreaMe();
		jTextAreadescripcionDetallePlaneacionCompra.setEnabled(false);
		jTextAreadescripcionDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePlaneacionCompra.setLineWrap(true);
		jTextAreadescripcionDetallePlaneacionCompra.setWrapStyleWord(true);
		jTextAreadescripcionDetallePlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetallePlaneacionCompra.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetallePlaneacionCompra = new JScrollPane(jTextAreadescripcionDetallePlaneacionCompra);
		jscrollPanedescripcionDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtondescripcionDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtondescripcionDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetallePlaneacionCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePlaneacionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_empresaDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePlaneacionCompra.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_empresaDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_empresaDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_empresaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePlaneacionCompra.setEnabled(false);

		this.jButtonid_empresaDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_empresaDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_empresaDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePlaneacionCompra"));

		this.jButtonid_empresaDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_empresaDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePlaneacionCompraUpdate"));



					
		this.jLabelid_sucursalDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_sucursalDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePlaneacionCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_sucursalDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_sucursalDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_sucursalDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePlaneacionCompra.setEnabled(false);

		this.jButtonid_sucursalDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_sucursalDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_sucursalDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePlaneacionCompra"));

		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_sucursalDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePlaneacionCompraUpdate"));



					
		this.jLabelid_ejercicioDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_ejercicioDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePlaneacionCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_ejercicioDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_ejercicioDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePlaneacionCompra.setEnabled(false);

		this.jButtonid_ejercicioDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_ejercicioDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_ejercicioDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePlaneacionCompra"));

		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_ejercicioDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePlaneacionCompraUpdate"));



					
		this.jLabelid_periodoDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_periodoDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePlaneacionCompra.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_periodoDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_periodoDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_periodoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePlaneacionCompra.setEnabled(false);

		this.jButtonid_periodoDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_periodoDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_periodoDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePlaneacionCompra"));

		this.jButtonid_periodoDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_periodoDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePlaneacionCompraUpdate"));



					
		this.jLabelid_planeacion_compraDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_planeacion_compraDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA+" : *");
		this.jLabelid_planeacion_compraDetallePlaneacionCompra.setToolTipText("Planeacion Compra");
		this.jLabelid_planeacion_compraDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_planeacion_compraDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_planeacion_compraDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_planeacion_compraDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_planeacion_compraDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_planeacion_compraDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_planeacion_compraDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_planeacion_compraDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_planeacion_compraDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_planeacion_compraDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_planeacion_compraDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_planeacion_compraDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_planeacion_compraDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_planeacion_compraDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_planeacion_compraDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_planeacion_compraDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_planeacion_compraDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_planeacion_compraDetallePlaneacionCompra"));

		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_planeacion_compraDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_planeacion_compraDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_planeacion_compraDetallePlaneacionCompraUpdate"));



					
		this.jLabelid_lineaDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_lineaDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaDetallePlaneacionCompra.setToolTipText("Linea");
		this.jLabelid_lineaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_lineaDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_lineaDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_lineaDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_lineaDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_lineaDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetallePlaneacionCompra"));

		this.jButtonid_lineaDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_lineaDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_lineaDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_lineaDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetallePlaneacionCompraUpdate"));


		jButtonid_lineaDetallePlaneacionCompraArbol= new JButtonMe();
		jButtonid_lineaDetallePlaneacionCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaDetallePlaneacionCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaDetallePlaneacionCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaDetallePlaneacionCompraArbol.setText("Arbol");
		jButtonid_lineaDetallePlaneacionCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaDetallePlaneacionCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaDetallePlaneacionCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaDetallePlaneacionCompraArbol"));



					
		this.jLabelid_productoDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_productoDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetallePlaneacionCompra.setToolTipText("Producto");
		this.jLabelid_productoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_productoDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_productoDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_productoDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_productoDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_productoDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePlaneacionCompra"));

		this.jButtonid_productoDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_productoDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_productoDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_productoDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_productoDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_productoDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePlaneacionCompraUpdate"));



					
		this.jLabelid_unidadDetallePlaneacionCompra = new JLabelMe();
		this.jLabelid_unidadDetallePlaneacionCompra.setText(""+DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetallePlaneacionCompra.setToolTipText("Unad");
		this.jLabelid_unidadDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetallePlaneacionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetallePlaneacionCompra.setToolTipText(DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		this.jPanelid_unidadDetallePlaneacionCompra.setLayout(this.gridaBagLayoutDetallePlaneacionCompra);


		jComboBoxid_unidadDetallePlaneacionCompra= new JComboBoxMe();
		jComboBoxid_unidadDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetallePlaneacionCompra= new JButtonMe();
		this.jButtonid_unidadDetallePlaneacionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePlaneacionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePlaneacionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePlaneacionCompra.setText("Buscar");
		this.jButtonid_unidadDetallePlaneacionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetallePlaneacionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePlaneacionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePlaneacionCompra"));

		this.jButtonid_unidadDetallePlaneacionCompraBusqueda= new JButtonMe();
		this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setText("U");
		this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePlaneacionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePlaneacionCompraBusqueda"));

		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetallePlaneacionCompraBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetallePlaneacionCompraUpdate= new JButtonMe();
		this.jButtonid_unidadDetallePlaneacionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePlaneacionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePlaneacionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePlaneacionCompraUpdate.setText("U");
		this.jButtonid_unidadDetallePlaneacionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetallePlaneacionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePlaneacionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePlaneacionCompraUpdate"));



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
		//this.jInternalFrameDetalleDetallePlaneacionCompra = new DetallePlaneacionCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Planeacion Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePlaneacionCompra= new GridBagLayout();
		

		
		String sToolTipDetallePlaneacionCompra="";
		sToolTipDetallePlaneacionCompra=DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePlaneacionCompra+="(Inventario.DetallePlaneacionCompra)";
		}
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePlaneacionCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePlaneacionCompra = new JButtonMe();
		this.jButtonModificarDetallePlaneacionCompra = new JButtonMe();
        this.jButtonActualizarDetallePlaneacionCompra = new JButtonMe();
        this.jButtonEliminarDetallePlaneacionCompra = new JButtonMe();
        this.jButtonCancelarDetallePlaneacionCompra = new JButtonMe();
        this.jButtonGuardarCambiosDetallePlaneacionCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra = new JButtonMe();
		this.jButtonCerrarDetallePlaneacionCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetallePlaneacionCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePlaneacionCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePlaneacionCompra = new JScrollPane();
				
		
		
		this.jPanelCamposDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Planeacion Compra";
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Planeacion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePlaneacionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePlaneacionCompra.setName("jPanelCamposDetallePlaneacionCompra"); 

		this.jPanelCamposOcultosDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePlaneacionCompra.setName("jPanelCamposOcultosDetallePlaneacionCompra"); 

        this.jPanelAccionesDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePlaneacionCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetallePlaneacionCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePlaneacionCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePlaneacionCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePlaneacionCompra.setText("Nuevo");
		this.jButtonModificarDetallePlaneacionCompra.setText("Editar");
        this.jButtonActualizarDetallePlaneacionCompra.setText("Actualizar");
        this.jButtonEliminarDetallePlaneacionCompra.setText("Eliminar");
        this.jButtonCancelarDetallePlaneacionCompra.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePlaneacionCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.setText("Guardar");
		this.jButtonCerrarDetallePlaneacionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePlaneacionCompra,"nuevo_button","Nuevo",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePlaneacionCompra,"modificar_button","Editar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePlaneacionCompra,"actualizar_button","Actualizar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePlaneacionCompra,"eliminar_button","Eliminar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePlaneacionCompra,"cancelar_button","Cancelar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePlaneacionCompra,"guardarcambios_button","Guardar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePlaneacionCompra,"guardarcambiostabla_button","Guardar",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePlaneacionCompra,"cerrar_button","Salir",this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePlaneacionCompra.setToolTipText("Nuevo"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePlaneacionCompra.setToolTipText("Editar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePlaneacionCompra.setToolTipText("Actualizar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePlaneacionCompra.setToolTipText("Eliminar)"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePlaneacionCompra.setToolTipText("Cancelar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePlaneacionCompra.setToolTipText("Guardar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.setToolTipText("Guardar"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePlaneacionCompra.setToolTipText("Salir"+" "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePlaneacionCompra";
		inputMap = this.jButtonNuevoDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePlaneacionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePlaneacionCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePlaneacionCompra";
		inputMap = this.jButtonActualizarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePlaneacionCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePlaneacionCompra";
		inputMap = this.jButtonEliminarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePlaneacionCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePlaneacionCompra";
		inputMap = this.jButtonCancelarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePlaneacionCompra"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePlaneacionCompra";
		inputMap = this.jButtonCerrarDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePlaneacionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePlaneacionCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePlaneacionCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePlaneacionCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePlaneacionCompra.setToolTipText("Nuevo DetallePlaneacionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra.setToolTipText("Sin Cerrar Ventana DetallePlaneacionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePlaneacionCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePlaneacionCompra = new JLabelMe();
		
		this.jLabelAccionesDetallePlaneacionCompra.setText("Acciones");		
		this.jLabelAccionesDetallePlaneacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePlaneacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePlaneacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePlaneacionCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePlaneacionCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePlaneacionCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePlaneacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePlaneacionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePlaneacionCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePlaneacionCompra = new GridBagLayout();
		
		this.jPanelCamposDetallePlaneacionCompra.setLayout(gridaBagLayoutCamposDetallePlaneacionCompra);
		this.jPanelCamposOcultosDetallePlaneacionCompra.setLayout(gridaBagLayoutCamposOcultosDetallePlaneacionCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePlaneacionCompra.add(jLabelIdDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePlaneacionCompra.add(jLabelidDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePlaneacionCompra.add(jLabelid_empresaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePlaneacionCompra.add(jButtonid_empresaDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePlaneacionCompra.add(jButtonid_empresaDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePlaneacionCompra.add(jComboBoxid_empresaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePlaneacionCompra.add(jLabelid_sucursalDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePlaneacionCompra.add(jButtonid_sucursalDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePlaneacionCompra.add(jButtonid_sucursalDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePlaneacionCompra.add(jComboBoxid_sucursalDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallePlaneacionCompra.add(jLabelid_ejercicioDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePlaneacionCompra.add(jButtonid_ejercicioDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePlaneacionCompra.add(jButtonid_ejercicioDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallePlaneacionCompra.add(jComboBoxid_ejercicioDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetallePlaneacionCompra.add(jLabelid_periodoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePlaneacionCompra.add(jButtonid_periodoDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePlaneacionCompra.add(jButtonid_periodoDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetallePlaneacionCompra.add(jComboBoxid_periodoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_planeacion_compraDetallePlaneacionCompra.add(jLabelid_planeacion_compraDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_planeacion_compraDetallePlaneacionCompra.add(jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_planeacion_compraDetallePlaneacionCompra.add(jButtonid_planeacion_compraDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_planeacion_compraDetallePlaneacionCompra.add(jComboBoxid_planeacion_compraDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaDetallePlaneacionCompra.add(jLabelid_lineaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDetallePlaneacionCompra.add(jButtonid_lineaDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaDetallePlaneacionCompra.add(jButtonid_lineaDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaDetallePlaneacionCompra.add(jComboBoxid_lineaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetallePlaneacionCompra.add(jLabelid_productoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetallePlaneacionCompra.add(jButtonid_productoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePlaneacionCompra.add(jButtonid_productoDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 4;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePlaneacionCompra.add(jButtonid_productoDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetallePlaneacionCompra.add(jComboBoxid_productoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetallePlaneacionCompra.add(jLabelid_unidadDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePlaneacionCompra.add(jButtonid_unidadDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 3;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePlaneacionCompra.add(jButtonid_unidadDetallePlaneacionCompraUpdate, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetallePlaneacionCompra.add(jComboBoxid_unidadDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstockDetallePlaneacionCompra.add(jLabelstockDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelstockDetallePlaneacionCompra.add(jButtonstockDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstockDetallePlaneacionCompra.add(jTextFieldstockDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_minimoDetallePlaneacionCompra.add(jLabeldia_minimoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_minimoDetallePlaneacionCompra.add(jButtondia_minimoDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_minimoDetallePlaneacionCompra.add(jTextFielddia_minimoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstock_minimoDetallePlaneacionCompra.add(jLabelstock_minimoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelstock_minimoDetallePlaneacionCompra.add(jButtonstock_minimoDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstock_minimoDetallePlaneacionCompra.add(jTextFieldstock_minimoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_maximoDetallePlaneacionCompra.add(jLabeldia_maximoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_maximoDetallePlaneacionCompra.add(jButtondia_maximoDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_maximoDetallePlaneacionCompra.add(jTextFielddia_maximoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstock_maximoDetallePlaneacionCompra.add(jLabelstock_maximoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelstock_maximoDetallePlaneacionCompra.add(jButtonstock_maximoDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstock_maximoDetallePlaneacionCompra.add(jTextFieldstock_maximoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsalidaDetallePlaneacionCompra.add(jLabelsalidaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsalidaDetallePlaneacionCompra.add(jButtonsalidaDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsalidaDetallePlaneacionCompra.add(jTextFieldsalidaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstock_mensualDetallePlaneacionCompra.add(jLabelstock_mensualDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelstock_mensualDetallePlaneacionCompra.add(jButtonstock_mensualDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstock_mensualDetallePlaneacionCompra.add(jTextFieldstock_mensualDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetallePlaneacionCompra.add(jLabeldescripcionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 2;
		this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetallePlaneacionCompra.add(jButtondescripcionDetallePlaneacionCompraBusqueda, this.gridBagConstraintsDetallePlaneacionCompra);
	}

	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = 1;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetallePlaneacionCompra.add(jscrollPanedescripcionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelidDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelid_planeacion_compraDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelid_lineaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelid_productoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelid_unidadDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelstockDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPaneldia_minimoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelstock_minimoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPaneldia_maximoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelstock_maximoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelsalidaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPanelstock_mensualDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePlaneacionCompra.add(this.jPaneldescripcionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposDetallePlaneacionCompra % 2==0) {
		iXPanelCamposDetallePlaneacionCompra=0;
		iYPanelCamposDetallePlaneacionCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposOcultosDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposOcultosDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePlaneacionCompra.add(this.jPanelid_empresaDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposOcultosDetallePlaneacionCompra % 2==0) {
		iXPanelCamposOcultosDetallePlaneacionCompra=0;
		iYPanelCamposOcultosDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposOcultosDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposOcultosDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePlaneacionCompra.add(this.jPanelid_sucursalDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposOcultosDetallePlaneacionCompra % 2==0) {
		iXPanelCamposOcultosDetallePlaneacionCompra=0;
		iYPanelCamposOcultosDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposOcultosDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposOcultosDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePlaneacionCompra.add(this.jPanelid_ejercicioDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposOcultosDetallePlaneacionCompra % 2==0) {
		iXPanelCamposOcultosDetallePlaneacionCompra=0;
		iYPanelCamposOcultosDetallePlaneacionCompra++;
	}
	this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePlaneacionCompra.gridy = iYPanelCamposOcultosDetallePlaneacionCompra;
	this.gridBagConstraintsDetallePlaneacionCompra.gridx = iXPanelCamposOcultosDetallePlaneacionCompra++;
	this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePlaneacionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePlaneacionCompra.add(this.jPanelid_periodoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);



	if(iXPanelCamposOcultosDetallePlaneacionCompra % 2==0) {
		iXPanelCamposOcultosDetallePlaneacionCompra=0;
		iYPanelCamposOcultosDetallePlaneacionCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePlaneacionCompra= new GridBagLayout();
		this.jPanelAccionesDetallePlaneacionCompra.setLayout(gridaBagLayoutAccionesDetallePlaneacionCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePlaneacionCompra= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePlaneacionCompra.setLayout(gridaBagLayoutAccionesFormularioDetallePlaneacionCompra);
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePlaneacionCompra.add(this.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePlaneacionCompra.add(this.jCheckBoxPostAccionNuevoDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePlaneacionCompra.add(this.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePlaneacionCompra.add(this.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePlaneacionCompra.add(this.jButtonModificarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);							

		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePlaneacionCompra.add(this.jButtonEliminarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePlaneacionCompra.add(this.jButtonActualizarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);


		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePlaneacionCompra.add(this.jButtonGuardarCambiosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);	
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = 0;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePlaneacionCompra.add(this.jButtonCancelarDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePlaneacionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePlaneacionCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;		
			//this.gridBagConstraintsDetallePlaneacionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePlaneacionCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =0;
		this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePlaneacionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePlaneacionCompra = new DetallePlaneacionCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Planeacion Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Planeacion Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Planeacion Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePlaneacionCompraModel detalleplaneacioncompraModel=new DetallePlaneacionCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePlaneacionCompraModel.DetallePlaneacionCompraFocusTraversalPolicy detalleplaneacioncompraFocusTraversalPolicy = detalleplaneacioncompraModel.new DetallePlaneacionCompraFocusTraversalPolicy(this);
			
			//detalleplaneacioncompraFocusTraversalPolicy.setdetalleplaneacioncompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleplaneacioncompraModel);
			
			
			this.jContentPaneDetalleDetallePlaneacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePlaneacionCompra = new GridBagLayout();	
			this.jContentPaneDetalleDetallePlaneacionCompra.setLayout(gridaBagLayoutDetalleDetallePlaneacionCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePlaneacionCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
				this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePlaneacionCompra.add(jTtoolBarDetalleDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra=   new JScrollPane(jContentPaneDetalleDetallePlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	        
			this.jContentPaneDetalleDetallePlaneacionCompra.add(jPanelCamposDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);
			
			
			
			
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
						&& detalleplaneacioncompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePlaneacionCompra= new GridBagConstraints();
						this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
						this.jContentPaneDetalleDetallePlaneacionCompra.add(this.jTabbedPaneRelacionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePlaneacionCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePlaneacionCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
					this.gridBagConstraintsDetallePlaneacionCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePlaneacionCompra.add(jPanelCamposOcultosDetallePlaneacionCompra, gridBagConstraintsDetallePlaneacionCompra);
				
					this.jPanelCamposOcultosDetallePlaneacionCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	        this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePlaneacionCompra.add(this.jPanelAccionesFormularioDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);							
			
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
	        this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePlaneacionCompra.add(this.jPanelAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePlaneacionCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra=   new JScrollPane(this.jPanelCamposDetallePlaneacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
			this.gridBagConstraintsDetallePlaneacionCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePlaneacionCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePlaneacionCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);			
			
			this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
			
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		
			
		this.gridBagConstraintsDetallePlaneacionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetallePlaneacionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePlaneacionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePlaneacionCompra, this.gridBagConstraintsDetallePlaneacionCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePlaneacionCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePlaneacionCompra;
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
