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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.OrdenDetaProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class OrdenDetaProduDetalleFormJInternalFrame extends OrdenDetaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleOrdenDetaProdu;
	
	protected JMenuBar jmenuBarDetalleOrdenDetaProdu;
	
	protected JMenu jmenuDetalleOrdenDetaProdu;
	protected JMenu jmenuDetalleArchivoOrdenDetaProdu;
	protected JMenu jmenuDetalleAccionesOrdenDetaProdu;
	protected JMenu jmenuDetalleDatosOrdenDetaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOrdenDetaProdu;	
	protected GridBagConstraints gridBagConstraintsOrdenDetaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected OrdenDetaProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleOrdenDetaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordenprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected BodegaBeanSwingJInternalFrame bodegadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegadestino="";

	protected TipoProcesoProduBeanSwingJInternalFrame tipoprocesoproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoprodu="";
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	
	

	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame productoordendetaprodugastoBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduGastoBeanSwingJInternalFrame productoordendetaprodugastoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduGasto=false;
	public ProductoOrdenDetaProduGastoSessionBean productoordendetaprodugastoSessionBean;

	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMano=false;
	public ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean;

	public ProductoOrdenDetaProduBeanSwingJInternalFrame productoordendetaproduBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduBeanSwingJInternalFrame productoordendetaproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProdu=false;
	public ProductoOrdenDetaProduSessionBean productoordendetaproduSessionBean;

	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMaquina=false;
	public ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean;

	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame productoordendetaprodumermaBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame productoordendetaprodumermaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMerma=false;
	public ProductoOrdenDetaProduMermaSessionBean productoordendetaprodumermaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public OrdenProduSessionBean ordenproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public BodegaSessionBean bodegadestinoSessionBean;
	public TipoProcesoProduSessionBean tipoprocesoproduSessionBean;	
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	
	public JScrollPane jScrollPanelDatosOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosEdicionOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosGeneralOrdenDetaProdu;
	
	protected JPanel jPanelCamposOrdenDetaProdu;    
	protected JPanel jPanelCamposOcultosOrdenDetaProdu;    	
	protected JPanel jPanelAccionesOrdenDetaProdu;
	protected JPanel jPanelAccionesFormularioOrdenDetaProdu;
    
	
	
	protected Integer iXPanelCamposOrdenDetaProdu=0;
	protected Integer iYPanelCamposOrdenDetaProdu=0;
	
	protected Integer iXPanelCamposOcultosOrdenDetaProdu=0;
	protected Integer iYPanelCamposOcultosOrdenDetaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoOrdenDetaProdu;
	public JButton jButtonModificarOrdenDetaProdu;
	public JButton jButtonActualizarOrdenDetaProdu;
    public JButton jButtonEliminarOrdenDetaProdu;
	public JButton jButtonCancelarOrdenDetaProdu;
    public JButton jButtonGuardarCambiosOrdenDetaProdu;
	public JButton jButtonGuardarCambiosTablaOrdenDetaProdu;
	protected JButton jButtonCerrarOrdenDetaProdu;
	
	
	protected JButton jButtonProcesarInformacionOrdenDetaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoOrdenDetaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarOrdenDetaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeOrdenDetaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOrdenDetaProdu;
	protected JButton jButtonModificarToolBarOrdenDetaProdu;
	protected JButton jButtonActualizarToolBarOrdenDetaProdu;
    protected JButton jButtonEliminarToolBarOrdenDetaProdu;
	protected JButton jButtonCancelarToolBarOrdenDetaProdu;
    protected JButton jButtonGuardarCambiosToolBarOrdenDetaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarOrdenDetaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarOrdenDetaProdu;
	protected JButton jButtonCerrarToolBarOrdenDetaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarOrdenDetaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOrdenDetaProdu;
	protected JMenuItem jMenuItemModificarOrdenDetaProdu;
	protected JMenuItem jMenuItemActualizarOrdenDetaProdu;
    protected JMenuItem jMenuItemEliminarOrdenDetaProdu;
	protected JMenuItem jMenuItemCancelarOrdenDetaProdu;
    protected JMenuItem jMenuItemGuardarCambiosOrdenDetaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaOrdenDetaProdu;
	protected JMenuItem jMenuItemCerrarOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleCerrarOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarOrdenDetaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionOrdenDetaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOrdenDetaProdu;
	protected JMenuItem jMenuItemMostrarOcultarOrdenDetaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesOrdenDetaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOrdenDetaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioOrdenDetaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidOrdenDetaProdu;
	public JLabel jLabelIdOrdenDetaProdu;
	public JLabel jLabelidOrdenDetaProdu;
	public JButton jButtonidOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcantidadOrdenDetaProdu;
	public JLabel jLabelcantidadOrdenDetaProdu;
	public JTextField jTextFieldcantidadOrdenDetaProdu;
	public JButton jButtoncantidadOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pendienteOrdenDetaProdu;
	public JLabel jLabelcantidad_pendienteOrdenDetaProdu;
	public JTextField jTextFieldcantidad_pendienteOrdenDetaProdu;
	public JButton jButtoncantidad_pendienteOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionOrdenDetaProdu;
	public JLabel jLabeldescripcionOrdenDetaProdu;
	public JTextArea jTextAreadescripcionOrdenDetaProdu;
	public JScrollPane jscrollPanedescripcionOrdenDetaProdu;
	public JButton jButtondescripcionOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaOrdenDetaProdu;
	public JLabel jLabelid_empresaOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaOrdenDetaProdu;
	public JButton jButtonid_empresaOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_empresaOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalOrdenDetaProdu;
	public JLabel jLabelid_sucursalOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalOrdenDetaProdu;
	public JButton jButtonid_sucursalOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_sucursalOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioOrdenDetaProdu;
	public JLabel jLabelid_ejercicioOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioOrdenDetaProdu;
	public JButton jButtonid_ejercicioOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_ejercicioOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoOrdenDetaProdu;
	public JLabel jLabelid_periodoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoOrdenDetaProdu;
	public JButton jButtonid_periodoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_periodoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_periodoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_orden_produOrdenDetaProdu;
	public JLabel jLabelid_orden_produOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_produOrdenDetaProdu;
	public JButton jButtonid_orden_produOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_orden_produOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_orden_produOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaOrdenDetaProdu;
	public JLabel jLabelid_bodegaOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaOrdenDetaProdu;
	public JButton jButtonid_bodegaOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_bodegaOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_productoOrdenDetaProdu;
	public JLabel jLabelid_productoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoOrdenDetaProdu;
	public JButton jButtonid_productoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_productoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_productoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadOrdenDetaProdu;
	public JLabel jLabelid_unidadOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadOrdenDetaProdu;
	public JButton jButtonid_unidadOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_unidadOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_destinoOrdenDetaProdu;
	public JLabel jLabelid_bodega_destinoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_destinoOrdenDetaProdu;
	public JButton jButtonid_bodega_destinoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_bodega_destinoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodega_destinoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_produOrdenDetaProdu;
	public JLabel jLabelid_tipo_proceso_produOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_produOrdenDetaProdu;
	public JButton jButtonid_tipo_proceso_produOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_produOrdenDetaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesOrdenDetaProdu;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public OrdenDetaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposOrdenDetaProdu=new JPanel();
				this.jPanelAccionesFormularioOrdenDetaProdu=new JPanel();
				this.jmenuBarDetalleOrdenDetaProdu=new JMenuBar();
				this.jTtoolBarDetalleOrdenDetaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public OrdenDetaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenDetaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("OrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarOrdenDetaProdu() {
		return this.jButtonActualizarToolBarOrdenDetaProdu;
	}
	
	public JButton getjButtonEliminarToolBarOrdenDetaProdu() {
		return this.jButtonEliminarToolBarOrdenDetaProdu;
	}
	
	public JButton getjButtonCancelarToolBarOrdenDetaProdu() {
		return this.jButtonCancelarToolBarOrdenDetaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionOrdenDetaProdu() {
		return this.jButtonProcesarInformacionOrdenDetaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOrdenDetaProdu)	{
		this.jButtonProcesarInformacionOrdenDetaProdu = jButtonProcesarInformacionOrdenDetaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOrdenDetaProdu() {
		return this.jComboBoxTiposAccionesOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOrdenDetaProdu(
			JComboBox jComboBoxTiposRelacionesOrdenDetaProdu) {
		this.jComboBoxTiposRelacionesOrdenDetaProdu = jComboBoxTiposRelacionesOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOrdenDetaProdu(
			JComboBox jComboBoxTiposAccionesOrdenDetaProdu) {
		this.jComboBoxTiposAccionesOrdenDetaProdu = jComboBoxTiposAccionesOrdenDetaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioOrdenDetaProdu() {
		return this.jComboBoxTiposAccionesFormularioOrdenDetaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioOrdenDetaProdu(
			JComboBox jComboBoxTiposAccionesFormularioOrdenDetaProdu) {
		this.jComboBoxTiposAccionesFormularioOrdenDetaProdu = jComboBoxTiposAccionesFormularioOrdenDetaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ordendetaproduSessionBean=new OrdenDetaProduSessionBean();
		
		this.ordendetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordendetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ordendetaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		//this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		//this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		//this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		//this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OrdenDetaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Detalle Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleOrdenDetaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarOrdenDetaProdu=new JButtonMe();
				this.jButtonModificarToolBarOrdenDetaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarOrdenDetaProdu,this.jTtoolBarDetalleOrdenDetaProdu,
							"actualizar","actualizar","Actualizar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarOrdenDetaProdu,this.jTtoolBarDetalleOrdenDetaProdu,
							"eliminar","eliminar","Eliminar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarOrdenDetaProdu,this.jTtoolBarDetalleOrdenDetaProdu,
							"cancelar","cancelar","Cancelar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarOrdenDetaProdu,this.jTtoolBarDetalleOrdenDetaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleOrdenDetaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleOrdenDetaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoOrdenDetaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesOrdenDetaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosOrdenDetaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOrdenDetaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOrdenDetaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOrdenDetaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarOrdenDetaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarOrdenDetaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarOrdenDetaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarOrdenDetaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarOrdenDetaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarOrdenDetaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarOrdenDetaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarOrdenDetaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarOrdenDetaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarOrdenDetaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarOrdenDetaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarOrdenDetaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosOrdenDetaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOrdenDetaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOrdenDetaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOrdenDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOrdenDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOrdenDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarOrdenDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarOrdenDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarOrdenDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoOrdenDetaProdu.add(this.jMenuItemDetalleCerrarOrdenDetaProdu);
		
		this.jmenuDetalleAccionesOrdenDetaProdu.add(this.jMenuItemActualizarOrdenDetaProdu);
		this.jmenuDetalleAccionesOrdenDetaProdu.add(this.jMenuItemEliminarOrdenDetaProdu);
		this.jmenuDetalleAccionesOrdenDetaProdu.add(this.jMenuItemCancelarOrdenDetaProdu);		
		
		//this.jmenuDetalleDatosOrdenDetaProdu.add(this.jMenuItemDetalleAbrirOrderByOrdenDetaProdu);				
		this.jmenuDetalleDatosOrdenDetaProdu.add(this.jMenuItemDetalleMostarOcultarOrdenDetaProdu);				
				
		//this.jmenuDetalleAccionesOrdenDetaProdu.add(this.jMenuItemGuardarCambiosOrdenDetaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleOrdenDetaProdu.add(this.jmenuDetalleArchivoOrdenDetaProdu);		
		this.jmenuBarDetalleOrdenDetaProdu.add(this.jmenuDetalleAccionesOrdenDetaProdu);		
		this.jmenuBarDetalleOrdenDetaProdu.add(this.jmenuDetalleDatosOrdenDetaProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleOrdenDetaProdu.add(this.jmenuDetalleOrdenDetaProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleOrdenDetaProdu);				
	}
	
	
	public void inicializarElementosCamposOrdenDetaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdOrdenDetaProdu = new JLabelMe();
		jLabelIdOrdenDetaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidOrdenDetaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutOrdenDetaProdu= new GridBagLayout();

		this.jPanelidOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);

		jLabelidOrdenDetaProdu = new JLabel();
		jLabelidOrdenDetaProdu.setText("Id");

		jLabelidOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadOrdenDetaProdu = new JLabelMe();
		this.jLabelcantidadOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadOrdenDetaProdu.setToolTipText("Cantad");
		this.jLabelcantidadOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelcantidadOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jTextFieldcantidadOrdenDetaProdu= new JTextFieldMe();
		jTextFieldcantidadOrdenDetaProdu.setEnabled(false);
		jTextFieldcantidadOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadOrdenDetaProdu.setText("0");

		this.jButtoncantidadOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtoncantidadOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadOrdenDetaProduBusqueda.setText("U");
		this.jButtoncantidadOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadOrdenDetaProduBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pendienteOrdenDetaProdu = new JLabelMe();
		this.jLabelcantidad_pendienteOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE+" : *");
		this.jLabelcantidad_pendienteOrdenDetaProdu.setToolTipText("Cantad Pendiente");
		this.jLabelcantidad_pendienteOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pendienteOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pendienteOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pendienteOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelcantidad_pendienteOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jTextFieldcantidad_pendienteOrdenDetaProdu= new JTextFieldMe();
		jTextFieldcantidad_pendienteOrdenDetaProdu.setEnabled(false);
		jTextFieldcantidad_pendienteOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pendienteOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pendienteOrdenDetaProdu.setText("0");

		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setText("U");
		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pendienteOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pendienteOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pendienteOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pendienteOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pendienteOrdenDetaProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionOrdenDetaProdu = new JLabelMe();
		this.jLabeldescripcionOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionOrdenDetaProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPaneldescripcionOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jTextAreadescripcionOrdenDetaProdu= new JTextAreaMe();
		jTextAreadescripcionOrdenDetaProdu.setEnabled(false);
		jTextAreadescripcionOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenDetaProdu.setLineWrap(true);
		jTextAreadescripcionOrdenDetaProdu.setWrapStyleWord(true);
		jTextAreadescripcionOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionOrdenDetaProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionOrdenDetaProdu = new JScrollPane(jTextAreadescripcionOrdenDetaProdu);
		jscrollPanedescripcionOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtondescripcionOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionOrdenDetaProduBusqueda.setText("U");
		this.jButtondescripcionOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionOrdenDetaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysOrdenDetaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaOrdenDetaProdu = new JLabelMe();
		this.jLabelid_empresaOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaOrdenDetaProdu.setToolTipText("Empresa");
		this.jLabelid_empresaOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_empresaOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_empresaOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_empresaOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaOrdenDetaProdu.setEnabled(false);

		this.jButtonid_empresaOrdenDetaProdu= new JButtonMe();
		this.jButtonid_empresaOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenDetaProdu.setText("Buscar");
		this.jButtonid_empresaOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenDetaProdu"));

		this.jButtonid_empresaOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_empresaOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_empresaOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_empresaOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaOrdenDetaProduUpdate.setText("U");
		this.jButtonid_empresaOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenDetaProduUpdate"));



					
		this.jLabelid_sucursalOrdenDetaProdu = new JLabelMe();
		this.jLabelid_sucursalOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalOrdenDetaProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_sucursalOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_sucursalOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_sucursalOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalOrdenDetaProdu.setEnabled(false);

		this.jButtonid_sucursalOrdenDetaProdu= new JButtonMe();
		this.jButtonid_sucursalOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenDetaProdu.setText("Buscar");
		this.jButtonid_sucursalOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenDetaProdu"));

		this.jButtonid_sucursalOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_sucursalOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_sucursalOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalOrdenDetaProduUpdate.setText("U");
		this.jButtonid_sucursalOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenDetaProduUpdate"));



					
		this.jLabelid_ejercicioOrdenDetaProdu = new JLabelMe();
		this.jLabelid_ejercicioOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioOrdenDetaProdu.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_ejercicioOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_ejercicioOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_ejercicioOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioOrdenDetaProdu.setEnabled(false);

		this.jButtonid_ejercicioOrdenDetaProdu= new JButtonMe();
		this.jButtonid_ejercicioOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenDetaProdu.setText("Buscar");
		this.jButtonid_ejercicioOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenDetaProdu"));

		this.jButtonid_ejercicioOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_ejercicioOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_ejercicioOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_ejercicioOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioOrdenDetaProduUpdate.setText("U");
		this.jButtonid_ejercicioOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenDetaProduUpdate"));



					
		this.jLabelid_periodoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_periodoOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoOrdenDetaProdu.setToolTipText("Periodo");
		this.jLabelid_periodoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_periodoOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_periodoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_periodoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoOrdenDetaProdu.setEnabled(false);

		this.jButtonid_periodoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_periodoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_periodoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenDetaProdu"));

		this.jButtonid_periodoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_periodoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_periodoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_periodoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_periodoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_periodoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenDetaProduUpdate"));



					
		this.jLabelid_orden_produOrdenDetaProdu = new JLabelMe();
		this.jLabelid_orden_produOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDORDENPRODU+" : *");
		this.jLabelid_orden_produOrdenDetaProdu.setToolTipText("Orden Produ");
		this.jLabelid_orden_produOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_produOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_produOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_produOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_produOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_produOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDORDENPRODU);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_orden_produOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_orden_produOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_orden_produOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_produOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_produOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_produOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_produOrdenDetaProdu= new JButtonMe();
		this.jButtonid_orden_produOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_produOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_produOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_produOrdenDetaProdu.setText("Buscar");
		this.jButtonid_orden_produOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_produOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_produOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_produOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_produOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_produOrdenDetaProdu"));

		this.jButtonid_orden_produOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_orden_produOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_produOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_produOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_produOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_orden_produOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_produOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_produOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_produOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_produOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_produOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_produOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_orden_produOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_orden_produOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_produOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_produOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_produOrdenDetaProduUpdate.setText("U");
		this.jButtonid_orden_produOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_produOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_produOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_produOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_produOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_produOrdenDetaProduUpdate"));



					
		this.jLabelid_bodegaOrdenDetaProdu = new JLabelMe();
		this.jLabelid_bodegaOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaOrdenDetaProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_bodegaOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_bodegaOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_bodegaOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaOrdenDetaProdu= new JButtonMe();
		this.jButtonid_bodegaOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaOrdenDetaProdu.setText("Buscar");
		this.jButtonid_bodegaOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaOrdenDetaProdu"));

		this.jButtonid_bodegaOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_bodegaOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_bodegaOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaOrdenDetaProduUpdate.setText("U");
		this.jButtonid_bodegaOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaOrdenDetaProduUpdate"));



					
		this.jLabelid_productoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_productoOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoOrdenDetaProdu.setToolTipText("Producto");
		this.jLabelid_productoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_productoOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_productoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_productoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_productoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_productoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoOrdenDetaProdu"));

		this.jButtonid_productoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_productoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_productoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_productoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_productoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_productoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoOrdenDetaProduUpdate"));



					
		this.jLabelid_unidadOrdenDetaProdu = new JLabelMe();
		this.jLabelid_unidadOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadOrdenDetaProdu.setToolTipText("Unad");
		this.jLabelid_unidadOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_unidadOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_unidadOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_unidadOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadOrdenDetaProdu= new JButtonMe();
		this.jButtonid_unidadOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadOrdenDetaProdu.setText("Buscar");
		this.jButtonid_unidadOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadOrdenDetaProdu"));

		this.jButtonid_unidadOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_unidadOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_unidadOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_unidadOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_unidadOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadOrdenDetaProduUpdate.setText("U");
		this.jButtonid_unidadOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadOrdenDetaProduUpdate"));



					
		this.jLabelid_bodega_destinoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_bodega_destinoOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO+" : *");
		this.jLabelid_bodega_destinoOrdenDetaProdu.setToolTipText("Bodega Destino");
		this.jLabelid_bodega_destinoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_destinoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_destinoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_destinoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_destinoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_destinoOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_bodega_destinoOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_bodega_destinoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_bodega_destinoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_destinoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_destinoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_destinoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_bodega_destinoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_destinoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_bodega_destinoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_destinoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_destinoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoOrdenDetaProdu"));

		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_destinoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_destinoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_bodega_destinoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_bodega_destinoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_destinoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_destinoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_bodega_destinoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_destinoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_destinoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_destinoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_destinoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_destinoOrdenDetaProduUpdate"));



					
		this.jLabelid_tipo_proceso_produOrdenDetaProdu = new JLabelMe();
		this.jLabelid_tipo_proceso_produOrdenDetaProdu.setText(""+OrdenDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU+" : *");
		this.jLabelid_tipo_proceso_produOrdenDetaProdu.setToolTipText("Tipo Proceso Produ");
		this.jLabelid_tipo_proceso_produOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_proceso_produOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_proceso_produOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_produOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_produOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_produOrdenDetaProdu.setToolTipText(OrdenDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU);
		this.gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_tipo_proceso_produOrdenDetaProdu.setLayout(this.gridaBagLayoutOrdenDetaProdu);


		jComboBoxid_tipo_proceso_produOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_produOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_produOrdenDetaProdu= new JButtonMe();
		this.jButtonid_tipo_proceso_produOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_produOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_produOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_produOrdenDetaProdu.setText("Buscar");
		this.jButtonid_tipo_proceso_produOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_produOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_produOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_produOrdenDetaProdu"));

		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_produOrdenDetaProduBusqueda"));

		if(this.ordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_produOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate.setText("U");
		this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_produOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_produOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_produOrdenDetaProduUpdate"));



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
		//this.jInternalFrameDetalleOrdenDetaProdu = new OrdenDetaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden Detalle Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOrdenDetaProdu= new GridBagLayout();
		

		
		String sToolTipOrdenDetaProdu="";
		sToolTipOrdenDetaProdu=OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOrdenDetaProdu+="(Produccion.OrdenDetaProdu)";
		}
		
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipOrdenDetaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoOrdenDetaProdu = new JButtonMe();
		this.jButtonModificarOrdenDetaProdu = new JButtonMe();
        this.jButtonActualizarOrdenDetaProdu = new JButtonMe();
        this.jButtonEliminarOrdenDetaProdu = new JButtonMe();
        this.jButtonCancelarOrdenDetaProdu = new JButtonMe();
        this.jButtonGuardarCambiosOrdenDetaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarOrdenDetaProdu = new JButtonMe();
		
		this.jScrollPanelDatosOrdenDetaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionOrdenDetaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralOrdenDetaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Detalle Produccion";
		
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Detalle Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposOrdenDetaProdu.setName("jPanelCamposOrdenDetaProdu"); 

		this.jPanelCamposOcultosOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosOrdenDetaProdu.setName("jPanelCamposOcultosOrdenDetaProdu"); 

        this.jPanelAccionesOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOrdenDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesOrdenDetaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioOrdenDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioOrdenDetaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoOrdenDetaProdu.setText("Nuevo");
		this.jButtonModificarOrdenDetaProdu.setText("Editar");
        this.jButtonActualizarOrdenDetaProdu.setText("Actualizar");
        this.jButtonEliminarOrdenDetaProdu.setText("Eliminar");
        this.jButtonCancelarOrdenDetaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosOrdenDetaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaOrdenDetaProdu.setText("Guardar");
		this.jButtonCerrarOrdenDetaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOrdenDetaProdu,"nuevo_button","Nuevo",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarOrdenDetaProdu,"modificar_button","Editar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarOrdenDetaProdu,"actualizar_button","Actualizar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarOrdenDetaProdu,"eliminar_button","Eliminar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarOrdenDetaProdu,"cancelar_button","Cancelar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosOrdenDetaProdu,"guardarcambios_button","Guardar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOrdenDetaProdu,"guardarcambiostabla_button","Guardar",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrdenDetaProdu,"cerrar_button","Salir",this.ordendetaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoOrdenDetaProdu.setToolTipText("Nuevo"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarOrdenDetaProdu.setToolTipText("Editar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarOrdenDetaProdu.setToolTipText("Actualizar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarOrdenDetaProdu.setToolTipText("Eliminar)"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarOrdenDetaProdu.setToolTipText("Cancelar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosOrdenDetaProdu.setToolTipText("Guardar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaOrdenDetaProdu.setToolTipText("Guardar"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOrdenDetaProdu.setToolTipText("Salir"+" "+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOrdenDetaProdu";
		inputMap = this.jButtonNuevoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOrdenDetaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarOrdenDetaProdu";
		inputMap = this.jButtonActualizarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarOrdenDetaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarOrdenDetaProdu";
		inputMap = this.jButtonEliminarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarOrdenDetaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarOrdenDetaProdu";
		inputMap = this.jButtonCancelarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarOrdenDetaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarOrdenDetaProdu";
		inputMap = this.jButtonCerrarOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOrdenDetaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOrdenDetaProdu";
		inputMap = this.jButtonGuardarCambiosTablaOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOrdenDetaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoOrdenDetaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoOrdenDetaProdu.setToolTipText("Nuevo OrdenDetaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarOrdenDetaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarOrdenDetaProdu.setToolTipText("Sin Cerrar Ventana OrdenDetaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeOrdenDetaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeOrdenDetaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposAccionesOrdenDetaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioOrdenDetaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioOrdenDetaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesOrdenDetaProdu = new JLabelMe();
		
		this.jLabelAccionesOrdenDetaProdu.setText("Acciones");		
		this.jLabelAccionesOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposOrdenDetaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysOrdenDetaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesOrdenDetaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposOrdenDetaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosOrdenDetaProdu = new GridBagLayout();
		
		this.jPanelCamposOrdenDetaProdu.setLayout(gridaBagLayoutCamposOrdenDetaProdu);
		this.jPanelCamposOcultosOrdenDetaProdu.setLayout(gridaBagLayoutCamposOcultosOrdenDetaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidOrdenDetaProdu.add(jLabelIdOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidOrdenDetaProdu.add(jLabelidOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaOrdenDetaProdu.add(jLabelid_empresaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaOrdenDetaProdu.add(jButtonid_empresaOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaOrdenDetaProdu.add(jButtonid_empresaOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaOrdenDetaProdu.add(jComboBoxid_empresaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalOrdenDetaProdu.add(jLabelid_sucursalOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalOrdenDetaProdu.add(jButtonid_sucursalOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalOrdenDetaProdu.add(jButtonid_sucursalOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalOrdenDetaProdu.add(jComboBoxid_sucursalOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioOrdenDetaProdu.add(jLabelid_ejercicioOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioOrdenDetaProdu.add(jButtonid_ejercicioOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioOrdenDetaProdu.add(jButtonid_ejercicioOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioOrdenDetaProdu.add(jComboBoxid_ejercicioOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoOrdenDetaProdu.add(jLabelid_periodoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoOrdenDetaProdu.add(jButtonid_periodoOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoOrdenDetaProdu.add(jButtonid_periodoOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoOrdenDetaProdu.add(jComboBoxid_periodoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_produOrdenDetaProdu.add(jLabelid_orden_produOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_produOrdenDetaProdu.add(jButtonid_orden_produOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_produOrdenDetaProdu.add(jButtonid_orden_produOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_produOrdenDetaProdu.add(jComboBoxid_orden_produOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaOrdenDetaProdu.add(jLabelid_bodegaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaOrdenDetaProdu.add(jButtonid_bodegaOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaOrdenDetaProdu.add(jButtonid_bodegaOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaOrdenDetaProdu.add(jComboBoxid_bodegaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoOrdenDetaProdu.add(jLabelid_productoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoOrdenDetaProdu.add(jButtonid_productoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoOrdenDetaProdu.add(jButtonid_productoOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 4;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoOrdenDetaProdu.add(jButtonid_productoOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoOrdenDetaProdu.add(jComboBoxid_productoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadOrdenDetaProdu.add(jLabelid_unidadOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadOrdenDetaProdu.add(jButtonid_unidadOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadOrdenDetaProdu.add(jButtonid_unidadOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadOrdenDetaProdu.add(jComboBoxid_unidadOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_destinoOrdenDetaProdu.add(jLabelid_bodega_destinoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_destinoOrdenDetaProdu.add(jButtonid_bodega_destinoOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_destinoOrdenDetaProdu.add(jButtonid_bodega_destinoOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_destinoOrdenDetaProdu.add(jComboBoxid_bodega_destinoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_produOrdenDetaProdu.add(jLabelid_tipo_proceso_produOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_produOrdenDetaProdu.add(jButtonid_tipo_proceso_produOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_produOrdenDetaProdu.add(jButtonid_tipo_proceso_produOrdenDetaProduUpdate, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_produOrdenDetaProdu.add(jComboBoxid_tipo_proceso_produOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadOrdenDetaProdu.add(jLabelcantidadOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadOrdenDetaProdu.add(jButtoncantidadOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadOrdenDetaProdu.add(jTextFieldcantidadOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pendienteOrdenDetaProdu.add(jLabelcantidad_pendienteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pendienteOrdenDetaProdu.add(jButtoncantidad_pendienteOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pendienteOrdenDetaProdu.add(jTextFieldcantidad_pendienteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionOrdenDetaProdu.add(jLabeldescripcionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionOrdenDetaProdu.add(jButtondescripcionOrdenDetaProduBusqueda, this.gridBagConstraintsOrdenDetaProdu);
	}

	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionOrdenDetaProdu.add(jscrollPanedescripcionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelidOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelid_orden_produOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelid_bodegaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelid_productoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelid_unidadOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelid_bodega_destinoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelid_tipo_proceso_produOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelcantidadOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPanelcantidad_pendienteOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenDetaProdu.add(this.jPaneldescripcionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOrdenDetaProdu % 2==0) {
		iXPanelCamposOrdenDetaProdu=0;
		iYPanelCamposOrdenDetaProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOcultosOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOcultosOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenDetaProdu.add(this.jPanelid_empresaOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOcultosOrdenDetaProdu % 2==0) {
		iXPanelCamposOcultosOrdenDetaProdu=0;
		iYPanelCamposOcultosOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOcultosOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOcultosOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenDetaProdu.add(this.jPanelid_sucursalOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOcultosOrdenDetaProdu % 2==0) {
		iXPanelCamposOcultosOrdenDetaProdu=0;
		iYPanelCamposOcultosOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOcultosOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOcultosOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenDetaProdu.add(this.jPanelid_ejercicioOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOcultosOrdenDetaProdu % 2==0) {
		iXPanelCamposOcultosOrdenDetaProdu=0;
		iYPanelCamposOcultosOrdenDetaProdu++;
	}
	this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenDetaProdu.gridy = iYPanelCamposOcultosOrdenDetaProdu;
	this.gridBagConstraintsOrdenDetaProdu.gridx = iXPanelCamposOcultosOrdenDetaProdu++;
	this.gridBagConstraintsOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenDetaProdu.add(this.jPanelid_periodoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);



	if(iXPanelCamposOcultosOrdenDetaProdu % 2==0) {
		iXPanelCamposOcultosOrdenDetaProdu=0;
		iYPanelCamposOcultosOrdenDetaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesOrdenDetaProdu= new GridBagLayout();
		this.jPanelAccionesOrdenDetaProdu.setLayout(gridaBagLayoutAccionesOrdenDetaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioOrdenDetaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioOrdenDetaProdu.setLayout(gridaBagLayoutAccionesFormularioOrdenDetaProdu);
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOrdenDetaProdu.add(this.jComboBoxTiposAccionesFormularioOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOrdenDetaProdu.add(this.jCheckBoxPostAccionNuevoOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOrdenDetaProdu.add(this.jCheckBoxPostAccionSinCerrarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ordendetaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOrdenDetaProdu.add(this.jCheckBoxPostAccionSinMensajeOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesOrdenDetaProdu.add(this.jButtonModificarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);							

		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsOrdenDetaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesOrdenDetaProdu.add(this.jButtonEliminarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
			
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesOrdenDetaProdu.add(this.jButtonActualizarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);


		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesOrdenDetaProdu.add(this.jButtonGuardarCambiosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);	
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = 0;		
		this.gridBagConstraintsOrdenDetaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesOrdenDetaProdu.add(this.jButtonCancelarOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOrdenDetaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOrdenDetaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();						
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;		
			//this.gridBagConstraintsOrdenDetaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOrdenDetaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOrdenDetaProdu.gridx =0;
		this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOrdenDetaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(OrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleOrdenDetaProdu = new OrdenDetaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden Detalle Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden Detalle Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Detalle Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			OrdenDetaProduModel ordendetaproduModel=new OrdenDetaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//OrdenDetaProduModel.OrdenDetaProduFocusTraversalPolicy ordendetaproduFocusTraversalPolicy = ordendetaproduModel.new OrdenDetaProduFocusTraversalPolicy(this);
			
			//ordendetaproduFocusTraversalPolicy.setordendetaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ordendetaproduModel);
			
			
			this.jContentPaneDetalleOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleOrdenDetaProdu = new GridBagLayout();	
			this.jContentPaneDetalleOrdenDetaProdu.setLayout(gridaBagLayoutDetalleOrdenDetaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOrdenDetaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
					
				
				this.jContentPaneDetalleOrdenDetaProdu.add(jTtoolBarDetalleOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionOrdenDetaProdu=   new JScrollPane(jContentPaneDetalleOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralOrdenDetaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	        
			this.jContentPaneDetalleOrdenDetaProdu.add(jPanelCamposOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);
			
			
			
			
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
						&& ordendetaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProdu(this.puedeCargarPorParteProductoOrdenDetaProdu,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduGasto(this.puedeCargarPorParteProductoOrdenDetaProduGasto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(this.puedeCargarPorParteProductoOrdenDetaProduMano,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(this.puedeCargarPorParteProductoOrdenDetaProduMaquina,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMerma(this.puedeCargarPorParteProductoOrdenDetaProduMerma,false,-1);
					
					if(this.ordendetaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsOrdenDetaProdu= new GridBagConstraints();
						this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
						this.jContentPaneDetalleOrdenDetaProdu.add(this.jTabbedPaneRelacionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesOrdenDetaProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProdu(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduGasto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMerma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosOrdenDetaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
					this.gridBagConstraintsOrdenDetaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
					
				
					this.jContentPaneDetalleOrdenDetaProdu.add(jPanelCamposOcultosOrdenDetaProdu, gridBagConstraintsOrdenDetaProdu);
				
					this.jPanelCamposOcultosOrdenDetaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	        this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleOrdenDetaProdu.add(this.jPanelAccionesFormularioOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);							
			
			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
	        this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleOrdenDetaProdu.add(this.jPanelAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionOrdenDetaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionOrdenDetaProdu=   new JScrollPane(this.jPanelCamposOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
			this.gridBagConstraintsOrdenDetaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsOrdenDetaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);			
			
			this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenDetaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
			
			
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		
			
		this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenDetaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOrdenDetaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOrdenDetaProdu, this.gridBagConstraintsOrdenDetaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralOrdenDetaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionOrdenDetaProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		this.productoordendetaproduSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaproduSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaproduBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaproduBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaproduSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaproduBeanSwingJInternalFrame=new ProductoOrdenDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaproduBeanSwingJInternalFrame.setproductoordendetaproduSessionBean(this.productoordendetaproduSessionBean);

				//this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				//this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
				//this.jContentPaneDetalleOrdenDetaProdu.add(this.productoordendetaproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenDetaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden Producto Producciones",this.productoordendetaproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenDetaProdu.setComponentAt(iIndexTab,this.productoordendetaproduBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaproduSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaproduBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProdu) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden Producto Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduGasto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodugastoBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodugastoBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodugastoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodugastoBeanSwingJInternalFrame=new ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodugastoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodugastoBeanSwingJInternalFrame.setproductoordendetaprodugastoSessionBean(this.productoordendetaprodugastoSessionBean);

				//this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				//this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
				//this.jContentPaneDetalleOrdenDetaProdu.add(this.productoordendetaprodugastoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenDetaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden  Gastoes",this.productoordendetaprodugastoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenDetaProdu.setComponentAt(iIndexTab,this.productoordendetaprodugastoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodugastoBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduGasto) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden  Gastoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumanoBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumanoBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumanoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumanoBeanSwingJInternalFrame=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumanoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumanoBeanSwingJInternalFrame.setproductoordendetaprodumanoSessionBean(this.productoordendetaprodumanoSessionBean);

				//this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				//this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
				//this.jContentPaneDetalleOrdenDetaProdu.add(this.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenDetaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden  Mano De Obraes",this.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenDetaProdu.setComponentAt(iIndexTab,this.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumanoBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMano) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden  Mano De Obraes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setproductoordendetaprodumaquinaSessionBean(this.productoordendetaprodumaquinaSessionBean);

				//this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				//this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
				//this.jContentPaneDetalleOrdenDetaProdu.add(this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenDetaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden Maquinaes",this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenDetaProdu.setComponentAt(iIndexTab,this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMaquina) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden Maquinaes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMerma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumermaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumermaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumermaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumermaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumermaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumermaBeanSwingJInternalFrame.setproductoordendetaprodumermaSessionBean(this.productoordendetaprodumermaSessionBean);

				//this.gridBagConstraintsOrdenDetaProdu = new GridBagConstraints();
				//this.gridBagConstraintsOrdenDetaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenDetaProdu.gridx = 0;
				//this.jContentPaneDetalleOrdenDetaProdu.add(this.productoordendetaprodumermaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenDetaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden Mermaes",this.productoordendetaprodumermaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenDetaProdu.setComponentAt(iIndexTab,this.productoordendetaprodumermaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumermaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMerma) {
					this.jTabbedPaneRelacionesOrdenDetaProdu.add("Orden Mermaes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoOrdenDetaProduGastoBeanSwingJInternalFrame(List<OrdenDetaProdu> ordendetaprodus,OrdenDetaProdu ordendetaprodu,ProductoOrdenDetaProduGastoBeanSwingJInternalFrame productoordendetaprodugastoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodugastoBeanSwingJInternalFrame=new ProductoOrdenDetaProduGastoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodugastoBeanSwingJInternalFrame.getProductoOrdenDetaProduGastoLogic().setConnexion(this.ordendetaproduLogic.getConnexion());

					productoordendetaprodugastoBeanSwingJInternalFrame.setordendetaprodusForeignKey(ordendetaprodus);
					productoordendetaprodugastoBeanSwingJInternalFrame.setordendetaproduForeignKey(ordendetaprodu);
					productoordendetaprodugastoBeanSwingJInternalFrame.productoordendetaprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(true);
					productoordendetaprodugastoBeanSwingJInternalFrame.productoordendetaprodugastoSessionBean.setlidOrdenDetaProduActual(ordendetaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodugastoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduGasto(productoordendetaprodugastoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodugastoBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenDetaProdu(true);
					productoordendetaprodugastoBeanSwingJInternalFrame.setid_orden_deta_produFK_IdOrdenDetaProdu(ordendetaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodugastoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodugastoBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenDetaProduForeignKey(ordendetaprodu,1,false,true,true);
					productoordendetaprodugastoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodugastoBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodugastoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodugastoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduGasto(true);
					productoordendetaprodugastoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduGasto("n",productoordendetaprodugastoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodugastoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodugastoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodugastoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodugastoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduGasto("relacionado");
					} else {
						productoordendetaprodugastoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduGasto("no_relacionado");
					}

					productoordendetaprodugastoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduGasto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoOrdenDetaProduManoBeanSwingJInternalFrame(List<OrdenDetaProdu> ordendetaprodus,OrdenDetaProdu ordendetaprodu,ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumanoBeanSwingJInternalFrame=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumanoBeanSwingJInternalFrame.getProductoOrdenDetaProduManoLogic().setConnexion(this.ordendetaproduLogic.getConnexion());

					productoordendetaprodumanoBeanSwingJInternalFrame.setordendetaprodusForeignKey(ordendetaprodus);
					productoordendetaprodumanoBeanSwingJInternalFrame.setordendetaproduForeignKey(ordendetaprodu);
					productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setlidOrdenDetaProduActual(ordendetaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumanoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMano(productoordendetaprodumanoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumanoBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenDetaProdu(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.setid_orden_deta_produFK_IdOrdenDetaProdu(ordendetaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumanoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumanoBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenDetaProduForeignKey(ordendetaprodu,1,false,true,true);
					productoordendetaprodumanoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumanoBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodumanoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n",productoordendetaprodumanoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumanoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumanoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMano("relacionado");
					} else {
						productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMano("no_relacionado");
					}

					productoordendetaprodumanoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMano().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoOrdenDetaProduBeanSwingJInternalFrame(List<OrdenDetaProdu> ordendetaprodus,OrdenDetaProdu ordendetaprodu,ProductoOrdenDetaProduBeanSwingJInternalFrame productoordendetaproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaproduBeanSwingJInternalFrame=new ProductoOrdenDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaproduBeanSwingJInternalFrame.getProductoOrdenDetaProduLogic().setConnexion(this.ordendetaproduLogic.getConnexion());

					productoordendetaproduBeanSwingJInternalFrame.setordendetaprodusForeignKey(ordendetaprodus);
					productoordendetaproduBeanSwingJInternalFrame.setordendetaproduForeignKey(ordendetaprodu);
					productoordendetaproduBeanSwingJInternalFrame.productoordendetaproduSessionBean.setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(true);
					productoordendetaproduBeanSwingJInternalFrame.productoordendetaproduSessionBean.setlidOrdenDetaProduActual(ordendetaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaproduBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProdu(productoordendetaproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenDetaProdu(true);
					productoordendetaproduBeanSwingJInternalFrame.setid_orden_deta_produFK_IdOrdenDetaProdu(ordendetaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaproduBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenDetaProduForeignKey(ordendetaprodu,1,false,true,true);
					productoordendetaproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProdu(true);
					productoordendetaproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n",productoordendetaproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaproduBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProdu("relacionado");
					} else {
						productoordendetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProdu("no_relacionado");
					}

					productoordendetaproduBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProdu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(List<OrdenDetaProdu> ordendetaprodus,OrdenDetaProdu ordendetaprodu,ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumaquinaBeanSwingJInternalFrame.getProductoOrdenDetaProduMaquinaLogic().setConnexion(this.ordendetaproduLogic.getConnexion());

					productoordendetaprodumaquinaBeanSwingJInternalFrame.setordendetaprodusForeignKey(ordendetaprodus);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setordendetaproduForeignKey(ordendetaprodu);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setlidOrdenDetaProduActual(ordendetaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenDetaProdu(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setid_orden_deta_produFK_IdOrdenDetaProdu(ordendetaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenDetaProduForeignKey(ordendetaprodu,1,false,true,true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n",productoordendetaprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("relacionado");
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMaquina().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoOrdenDetaProduMermaBeanSwingJInternalFrame(List<OrdenDetaProdu> ordendetaprodus,OrdenDetaProdu ordendetaprodu,ProductoOrdenDetaProduMermaBeanSwingJInternalFrame productoordendetaprodumermaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumermaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumermaBeanSwingJInternalFrame.getProductoOrdenDetaProduMermaLogic().setConnexion(this.ordendetaproduLogic.getConnexion());

					productoordendetaprodumermaBeanSwingJInternalFrame.setordendetaprodusForeignKey(ordendetaprodus);
					productoordendetaprodumermaBeanSwingJInternalFrame.setordendetaproduForeignKey(ordendetaprodu);
					productoordendetaprodumermaBeanSwingJInternalFrame.productoordendetaprodumermaSessionBean.setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(true);
					productoordendetaprodumermaBeanSwingJInternalFrame.productoordendetaprodumermaSessionBean.setlidOrdenDetaProduActual(ordendetaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumermaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMerma(productoordendetaprodumermaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumermaBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenDetaProdu(true);
					productoordendetaprodumermaBeanSwingJInternalFrame.setid_orden_deta_produFK_IdOrdenDetaProdu(ordendetaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumermaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumermaBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenDetaProduForeignKey(ordendetaprodu,1,false,true,true);
					productoordendetaprodumermaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumermaBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodumermaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenDetaProdu");
					productoordendetaprodumermaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(true);
					productoordendetaprodumermaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n",productoordendetaprodumermaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumermaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumermaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumermaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumermaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMerma("relacionado");
					} else {
						productoordendetaprodumermaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMerma("no_relacionado");
					}

					productoordendetaprodumermaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMerma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
