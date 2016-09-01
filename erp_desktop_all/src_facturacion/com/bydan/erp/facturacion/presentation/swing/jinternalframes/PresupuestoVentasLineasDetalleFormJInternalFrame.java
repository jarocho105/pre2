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
import com.bydan.erp.facturacion.util.PresupuestoVentasLineasConstantesFunciones;

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
public class PresupuestoVentasLineasDetalleFormJInternalFrame extends PresupuestoVentasLineasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoVentasLineas;
	
	protected JMenuBar jmenuBarDetallePresupuestoVentasLineas;
	
	protected JMenu jmenuDetallePresupuestoVentasLineas;
	protected JMenu jmenuDetalleArchivoPresupuestoVentasLineas;
	protected JMenu jmenuDetalleAccionesPresupuestoVentasLineas;
	protected JMenu jmenuDetalleDatosPresupuestoVentasLineas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoVentasLineas;	
	protected GridBagConstraints gridBagConstraintsPresupuestoVentasLineas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoVentasLineasBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoVentasLineas;		
	
	
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

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public PresupuestoVentasLineasSessionBean presupuestoventaslineasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public PresupuestoVentasLineasLogic presupuestoventaslineasLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoVentasLineas;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoVentasLineas;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoVentasLineas;
	
	protected JPanel jPanelCamposPresupuestoVentasLineas;    
	protected JPanel jPanelCamposOcultosPresupuestoVentasLineas;    	
	protected JPanel jPanelAccionesPresupuestoVentasLineas;
	protected JPanel jPanelAccionesFormularioPresupuestoVentasLineas;
    
	
	
	protected Integer iXPanelCamposPresupuestoVentasLineas=0;
	protected Integer iYPanelCamposPresupuestoVentasLineas=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoVentasLineas=0;
	protected Integer iYPanelCamposOcultosPresupuestoVentasLineas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoVentasLineas;
	public JButton jButtonModificarPresupuestoVentasLineas;
	public JButton jButtonActualizarPresupuestoVentasLineas;
    public JButton jButtonEliminarPresupuestoVentasLineas;
	public JButton jButtonCancelarPresupuestoVentasLineas;
    public JButton jButtonGuardarCambiosPresupuestoVentasLineas;
	public JButton jButtonGuardarCambiosTablaPresupuestoVentasLineas;
	protected JButton jButtonCerrarPresupuestoVentasLineas;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoVentasLineas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoVentasLineas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoVentasLineas;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoVentasLineas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoVentasLineas;
	protected JButton jButtonModificarToolBarPresupuestoVentasLineas;
	protected JButton jButtonActualizarToolBarPresupuestoVentasLineas;
    protected JButton jButtonEliminarToolBarPresupuestoVentasLineas;
	protected JButton jButtonCancelarToolBarPresupuestoVentasLineas;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoVentasLineas;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoVentasLineas;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoVentasLineas;
	protected JButton jButtonCerrarToolBarPresupuestoVentasLineas;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoVentasLineas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoVentasLineas;
	protected JMenuItem jMenuItemModificarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemActualizarPresupuestoVentasLineas;
    protected JMenuItem jMenuItemEliminarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemCancelarPresupuestoVentasLineas;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoVentasLineas;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoVentasLineas;
	protected JMenuItem jMenuItemCerrarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoVentasLineas;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoVentasLineas;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoVentasLineas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoVentasLineas;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoVentasLineas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoVentasLineas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoVentasLineas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoVentasLineas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoVentasLineas;
	public JLabel jLabelIdPresupuestoVentasLineas;
	public JLabel jLabelidPresupuestoVentasLineas;
	public JButton jButtonidPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelprecioPresupuestoVentasLineas;
	public JLabel jLabelprecioPresupuestoVentasLineas;
	public JTextField jTextFieldprecioPresupuestoVentasLineas;
	public JButton jButtonprecioPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelcantidadPresupuestoVentasLineas;
	public JLabel jLabelcantidadPresupuestoVentasLineas;
	public JTextField jTextFieldcantidadPresupuestoVentasLineas;
	public JButton jButtoncantidadPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresupuestoVentasLineas;
	public JLabel jLabelvalorPresupuestoVentasLineas;
	public JTextField jTextFieldvalorPresupuestoVentasLineas;
	public JButton jButtonvalorPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelporcentajePresupuestoVentasLineas;
	public JLabel jLabelporcentajePresupuestoVentasLineas;
	public JTextField jTextFieldporcentajePresupuestoVentasLineas;
	public JButton jButtonporcentajePresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_totalPresupuestoVentasLineas;
	public JLabel jLabelcantidad_totalPresupuestoVentasLineas;
	public JTextField jTextFieldcantidad_totalPresupuestoVentasLineas;
	public JButton jButtoncantidad_totalPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_totalPresupuestoVentasLineas;
	public JLabel jLabelvalor_totalPresupuestoVentasLineas;
	public JTextField jTextFieldvalor_totalPresupuestoVentasLineas;
	public JButton jButtonvalor_totalPresupuestoVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoVentasLineas;
	public JLabel jLabelid_empresaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoVentasLineas;
	public JButton jButtonid_empresaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPresupuestoVentasLineas;
	public JLabel jLabelid_sucursalPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPresupuestoVentasLineas;
	public JButton jButtonid_sucursalPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPresupuestoVentasLineas;
	public JLabel jLabelid_ejercicioPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresupuestoVentasLineas;
	public JButton jButtonid_ejercicioPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPresupuestoVentasLineas;
	public JLabel jLabelid_periodoPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPresupuestoVentasLineas;
	public JButton jButtonid_periodoPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorPresupuestoVentasLineas;
	public JLabel jLabelid_vendedorPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorPresupuestoVentasLineas;
	public JButton jButtonid_vendedorPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_vendedorPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_vendedorPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorPresupuestoVentasLineasArbol= new JButtonMe();

	public JPanel jPanelid_paisPresupuestoVentasLineas;
	public JLabel jLabelid_paisPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisPresupuestoVentasLineas;
	public JButton jButtonid_paisPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_paisPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_paisPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadPresupuestoVentasLineas;
	public JLabel jLabelid_ciudadPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadPresupuestoVentasLineas;
	public JButton jButtonid_ciudadPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_ciudadPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_ciudadPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaPresupuestoVentasLineas;
	public JLabel jLabelid_zonaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaPresupuestoVentasLineas;
	public JButton jButtonid_zonaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_zonaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_zonaPresupuestoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaPresupuestoVentasLineas;
	public JLabel jLabelid_lineaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaPresupuestoVentasLineas;
	public JButton jButtonid_lineaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_lineaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_lineaPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_lineaPresupuestoVentasLineasArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoPresupuestoVentasLineas;
	public JLabel jLabelid_linea_grupoPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoPresupuestoVentasLineas;
	public JButton jButtonid_linea_grupoPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_grupoPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoPresupuestoVentasLineasArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaPresupuestoVentasLineas;
	public JLabel jLabelid_linea_categoriaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaPresupuestoVentasLineas;
	public JButton jButtonid_linea_categoriaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_categoriaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaPresupuestoVentasLineasArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaPresupuestoVentasLineas;
	public JLabel jLabelid_linea_marcaPresupuestoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaPresupuestoVentasLineas;
	public JButton jButtonid_linea_marcaPresupuestoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_marcaPresupuestoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaPresupuestoVentasLineasBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaPresupuestoVentasLineasArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoVentasLineas;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoVentasLineasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoVentasLineas=new JPanel();
				this.jPanelAccionesFormularioPresupuestoVentasLineas=new JPanel();
				this.jmenuBarDetallePresupuestoVentasLineas=new JMenuBar();
				this.jTtoolBarDetallePresupuestoVentasLineas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoVentasLineasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoVentasLineasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoVentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresupuestoVentasLineas() {
		return this.jButtonActualizarToolBarPresupuestoVentasLineas;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoVentasLineas() {
		return this.jButtonEliminarToolBarPresupuestoVentasLineas;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoVentasLineas() {
		return this.jButtonCancelarToolBarPresupuestoVentasLineas;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoVentasLineas() {
		return this.jButtonProcesarInformacionPresupuestoVentasLineas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoVentasLineas)	{
		this.jButtonProcesarInformacionPresupuestoVentasLineas = jButtonProcesarInformacionPresupuestoVentasLineas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoVentasLineas() {
		return this.jComboBoxTiposAccionesPresupuestoVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposRelacionesPresupuestoVentasLineas) {
		this.jComboBoxTiposRelacionesPresupuestoVentasLineas = jComboBoxTiposRelacionesPresupuestoVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoVentasLineas(
			JComboBox jComboBoxTiposAccionesPresupuestoVentasLineas) {
		this.jComboBoxTiposAccionesPresupuestoVentasLineas = jComboBoxTiposAccionesPresupuestoVentasLineas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoVentasLineas() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoVentasLineas(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoVentasLineas) {
		this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas = jComboBoxTiposAccionesFormularioPresupuestoVentasLineas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		
		this.presupuestoventaslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoVentasLineasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Ventas_lineas MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
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
	
		PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoVentasLineas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoVentasLineas=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoVentasLineas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoVentasLineas,this.jTtoolBarDetallePresupuestoVentasLineas,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoVentasLineas,this.jTtoolBarDetallePresupuestoVentasLineas,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoVentasLineas,this.jTtoolBarDetallePresupuestoVentasLineas,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoVentasLineas,this.jTtoolBarDetallePresupuestoVentasLineas,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoVentasLineas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoVentasLineas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoVentasLineas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoVentasLineas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoVentasLineas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoVentasLineas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoVentasLineas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoVentasLineas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoVentasLineas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoVentasLineas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoVentasLineas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoVentasLineas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoVentasLineas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoVentasLineas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoVentasLineas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoVentasLineas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoVentasLineas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoVentasLineas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoVentasLineas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoVentasLineas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoVentasLineas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoVentasLineas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoVentasLineas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoVentasLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoVentasLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoVentasLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoVentasLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoVentasLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoVentasLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoVentasLineas.add(this.jMenuItemDetalleCerrarPresupuestoVentasLineas);
		
		this.jmenuDetalleAccionesPresupuestoVentasLineas.add(this.jMenuItemActualizarPresupuestoVentasLineas);
		this.jmenuDetalleAccionesPresupuestoVentasLineas.add(this.jMenuItemEliminarPresupuestoVentasLineas);
		this.jmenuDetalleAccionesPresupuestoVentasLineas.add(this.jMenuItemCancelarPresupuestoVentasLineas);		
		
		//this.jmenuDetalleDatosPresupuestoVentasLineas.add(this.jMenuItemDetalleAbrirOrderByPresupuestoVentasLineas);				
		this.jmenuDetalleDatosPresupuestoVentasLineas.add(this.jMenuItemDetalleMostarOcultarPresupuestoVentasLineas);				
				
		//this.jmenuDetalleAccionesPresupuestoVentasLineas.add(this.jMenuItemGuardarCambiosPresupuestoVentasLineas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoVentasLineas.add(this.jmenuDetalleArchivoPresupuestoVentasLineas);		
		this.jmenuBarDetallePresupuestoVentasLineas.add(this.jmenuDetalleAccionesPresupuestoVentasLineas);		
		this.jmenuBarDetallePresupuestoVentasLineas.add(this.jmenuDetalleDatosPresupuestoVentasLineas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoVentasLineas);				
	}
	
	
	public void inicializarElementosCamposPresupuestoVentasLineas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoVentasLineas = new JLabelMe();
		jLabelIdPresupuestoVentasLineas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoVentasLineas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoVentasLineas= new GridBagLayout();

		this.jPanelidPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);

		jLabelidPresupuestoVentasLineas = new JLabel();
		jLabelidPresupuestoVentasLineas.setText("Id");

		jLabelidPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecioPresupuestoVentasLineas = new JLabelMe();
		this.jLabelprecioPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioPresupuestoVentasLineas.setToolTipText("Precio");
		this.jLabelprecioPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelprecioPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jTextFieldprecioPresupuestoVentasLineas= new JTextFieldMe();
		jTextFieldprecioPresupuestoVentasLineas.setEnabled(false);
		jTextFieldprecioPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioPresupuestoVentasLineas.setText("0.0");

		this.jButtonprecioPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonprecioPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonprecioPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioPresupuestoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelcantidadPresupuestoVentasLineas = new JLabelMe();
		this.jLabelcantidadPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadPresupuestoVentasLineas.setToolTipText("Cantidad");
		this.jLabelcantidadPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelcantidadPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jTextFieldcantidadPresupuestoVentasLineas= new JTextFieldMe();
		jTextFieldcantidadPresupuestoVentasLineas.setEnabled(false);
		jTextFieldcantidadPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadPresupuestoVentasLineas.setText("0");

		this.jButtoncantidadPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtoncantidadPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtoncantidadPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadPresupuestoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresupuestoVentasLineas = new JLabelMe();
		this.jLabelvalorPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresupuestoVentasLineas.setToolTipText("Valor");
		this.jLabelvalorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelvalorPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jTextFieldvalorPresupuestoVentasLineas= new JTextFieldMe();
		jTextFieldvalorPresupuestoVentasLineas.setEnabled(false);
		jTextFieldvalorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresupuestoVentasLineas.setText("0.0");

		this.jButtonvalorPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonvalorPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonvalorPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresupuestoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelporcentajePresupuestoVentasLineas = new JLabelMe();
		this.jLabelporcentajePresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajePresupuestoVentasLineas.setToolTipText("Porcentaje");
		this.jLabelporcentajePresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajePresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajePresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajePresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelporcentajePresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jTextFieldporcentajePresupuestoVentasLineas= new JTextFieldMe();
		jTextFieldporcentajePresupuestoVentasLineas.setEnabled(false);
		jTextFieldporcentajePresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajePresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajePresupuestoVentasLineas.setText("0.0");

		this.jButtonporcentajePresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonporcentajePresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajePresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonporcentajePresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajePresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajePresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajePresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajePresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajePresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajePresupuestoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_totalPresupuestoVentasLineas = new JLabelMe();
		this.jLabelcantidad_totalPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_CANTIDADTOTAL+" : *");
		this.jLabelcantidad_totalPresupuestoVentasLineas.setToolTipText("Cantidad Total");
		this.jLabelcantidad_totalPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_totalPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_totalPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_totalPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_totalPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_totalPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_CANTIDADTOTAL);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelcantidad_totalPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jTextFieldcantidad_totalPresupuestoVentasLineas= new JTextFieldMe();
		jTextFieldcantidad_totalPresupuestoVentasLineas.setEnabled(false);
		jTextFieldcantidad_totalPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_totalPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_totalPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_totalPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_totalPresupuestoVentasLineas.setText("0");

		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_totalPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_totalPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_totalPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_totalPresupuestoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_totalPresupuestoVentasLineas = new JLabelMe();
		this.jLabelvalor_totalPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_VALORTOTAL+" : *");
		this.jLabelvalor_totalPresupuestoVentasLineas.setToolTipText("Valor Total");
		this.jLabelvalor_totalPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_totalPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_totalPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_totalPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_VALORTOTAL);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelvalor_totalPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jTextFieldvalor_totalPresupuestoVentasLineas= new JTextFieldMe();
		jTextFieldvalor_totalPresupuestoVentasLineas.setEnabled(false);
		jTextFieldvalor_totalPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_totalPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_totalPresupuestoVentasLineas.setText("0.0");

		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_totalPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_totalPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_totalPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_totalPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_totalPresupuestoVentasLineasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoVentasLineas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_empresaPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoVentasLineas.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_empresaPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_empresaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoVentasLineas.setEnabled(false);

		this.jButtonid_empresaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_empresaPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasLineas"));

		this.jButtonid_empresaPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_empresaPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_sucursalPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_sucursalPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPresupuestoVentasLineas.setToolTipText("Sucursal");
		this.jLabelid_sucursalPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_sucursalPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_sucursalPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_sucursalPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPresupuestoVentasLineas.setEnabled(false);

		this.jButtonid_sucursalPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_sucursalPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasLineas"));

		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_sucursalPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_sucursalPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_ejercicioPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_ejercicioPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresupuestoVentasLineas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_ejercicioPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_ejercicioPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_ejercicioPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPresupuestoVentasLineas.setEnabled(false);

		this.jButtonid_ejercicioPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_ejercicioPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasLineas"));

		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_ejercicioPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_periodoPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_periodoPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPresupuestoVentasLineas.setToolTipText("Periodo");
		this.jLabelid_periodoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_periodoPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_periodoPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_periodoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPresupuestoVentasLineas.setEnabled(false);

		this.jButtonid_periodoPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_periodoPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasLineas"));

		this.jButtonid_periodoPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_periodoPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_periodoPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_periodoPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_vendedorPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_vendedorPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorPresupuestoVentasLineas.setToolTipText("Vendedor");
		this.jLabelid_vendedorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_vendedorPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_vendedorPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_vendedorPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_vendedorPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_vendedorPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasLineas"));

		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_vendedorPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_vendedorPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_vendedorPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasLineasUpdate"));


		jButtonid_vendedorPresupuestoVentasLineasArbol= new JButtonMe();
		jButtonid_vendedorPresupuestoVentasLineasArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPresupuestoVentasLineasArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPresupuestoVentasLineasArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPresupuestoVentasLineasArbol.setText("Arbol");
		jButtonid_vendedorPresupuestoVentasLineasArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorPresupuestoVentasLineasArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPresupuestoVentasLineasArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPresupuestoVentasLineasArbol"));



					
		this.jLabelid_paisPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_paisPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisPresupuestoVentasLineas.setToolTipText("Pais");
		this.jLabelid_paisPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_paisPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_paisPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_paisPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_paisPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_paisPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPresupuestoVentasLineas"));

		this.jButtonid_paisPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_paisPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_paisPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_paisPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_paisPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_paisPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_ciudadPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_ciudadPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadPresupuestoVentasLineas.setToolTipText("Ciudad");
		this.jLabelid_ciudadPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_ciudadPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_ciudadPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_ciudadPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_ciudadPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_ciudadPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadPresupuestoVentasLineas"));

		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_ciudadPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_ciudadPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_ciudadPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_zonaPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_zonaPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDZONA+" :");
		this.jLabelid_zonaPresupuestoVentasLineas.setToolTipText("Zona");
		this.jLabelid_zonaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_zonaPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_zonaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_zonaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_zonaPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_zonaPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPresupuestoVentasLineas"));

		this.jButtonid_zonaPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_zonaPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_zonaPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_zonaPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPresupuestoVentasLineasUpdate"));



					
		this.jLabelid_lineaPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_lineaPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaPresupuestoVentasLineas.setToolTipText("Linea");
		this.jLabelid_lineaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_lineaPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_lineaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_lineaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_lineaPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_lineaPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoVentasLineas"));

		this.jButtonid_lineaPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_lineaPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_lineaPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_lineaPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoVentasLineasUpdate"));


		jButtonid_lineaPresupuestoVentasLineasArbol= new JButtonMe();
		jButtonid_lineaPresupuestoVentasLineasArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPresupuestoVentasLineasArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPresupuestoVentasLineasArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaPresupuestoVentasLineasArbol.setText("Arbol");
		jButtonid_lineaPresupuestoVentasLineasArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaPresupuestoVentasLineasArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPresupuestoVentasLineasArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPresupuestoVentasLineasArbol"));



					
		this.jLabelid_linea_grupoPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_linea_grupoPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO+" :");
		this.jLabelid_linea_grupoPresupuestoVentasLineas.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_linea_grupoPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_linea_grupoPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_grupoPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_linea_grupoPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_linea_grupoPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPresupuestoVentasLineas"));

		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPresupuestoVentasLineasUpdate"));


		jButtonid_linea_grupoPresupuestoVentasLineasArbol= new JButtonMe();
		jButtonid_linea_grupoPresupuestoVentasLineasArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoPresupuestoVentasLineasArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoPresupuestoVentasLineasArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoPresupuestoVentasLineasArbol.setText("Arbol");
		jButtonid_linea_grupoPresupuestoVentasLineasArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoPresupuestoVentasLineasArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPresupuestoVentasLineasArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPresupuestoVentasLineasArbol"));



					
		this.jLabelid_linea_categoriaPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_linea_categoriaPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA+" :");
		this.jLabelid_linea_categoriaPresupuestoVentasLineas.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_linea_categoriaPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_linea_categoriaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_linea_categoriaPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_linea_categoriaPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPresupuestoVentasLineas"));

		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPresupuestoVentasLineasUpdate"));


		jButtonid_linea_categoriaPresupuestoVentasLineasArbol= new JButtonMe();
		jButtonid_linea_categoriaPresupuestoVentasLineasArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaPresupuestoVentasLineasArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaPresupuestoVentasLineasArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaPresupuestoVentasLineasArbol.setText("Arbol");
		jButtonid_linea_categoriaPresupuestoVentasLineasArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaPresupuestoVentasLineasArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPresupuestoVentasLineasArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPresupuestoVentasLineasArbol"));



					
		this.jLabelid_linea_marcaPresupuestoVentasLineas = new JLabelMe();
		this.jLabelid_linea_marcaPresupuestoVentasLineas.setText(""+PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEAMARCA+" :");
		this.jLabelid_linea_marcaPresupuestoVentasLineas.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaPresupuestoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaPresupuestoVentasLineas.setToolTipText(PresupuestoVentasLineasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		this.jPanelid_linea_marcaPresupuestoVentasLineas.setLayout(this.gridaBagLayoutPresupuestoVentasLineas);


		jComboBoxid_linea_marcaPresupuestoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_marcaPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaPresupuestoVentasLineas= new JButtonMe();
		this.jButtonid_linea_marcaPresupuestoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPresupuestoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPresupuestoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPresupuestoVentasLineas.setText("Buscar");
		this.jButtonid_linea_marcaPresupuestoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaPresupuestoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPresupuestoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPresupuestoVentasLineas"));

		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setText("U");
		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPresupuestoVentasLineasBusqueda"));

		if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaPresupuestoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate.setText("U");
		this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPresupuestoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPresupuestoVentasLineasUpdate"));


		jButtonid_linea_marcaPresupuestoVentasLineasArbol= new JButtonMe();
		jButtonid_linea_marcaPresupuestoVentasLineasArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaPresupuestoVentasLineasArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaPresupuestoVentasLineasArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaPresupuestoVentasLineasArbol.setText("Arbol");
		jButtonid_linea_marcaPresupuestoVentasLineasArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaPresupuestoVentasLineasArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPresupuestoVentasLineasArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPresupuestoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPresupuestoVentasLineasArbol"));



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
		//this.jInternalFrameDetallePresupuestoVentasLineas = new PresupuestoVentasLineasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Ventas_lineas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoVentasLineas= new GridBagLayout();
		

		
		String sToolTipPresupuestoVentasLineas="";
		sToolTipPresupuestoVentasLineas=PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoVentasLineas+="(Facturacion.PresupuestoVentasLineas)";
		}
		
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoVentasLineas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoVentasLineas = new JButtonMe();
		this.jButtonModificarPresupuestoVentasLineas = new JButtonMe();
        this.jButtonActualizarPresupuestoVentasLineas = new JButtonMe();
        this.jButtonEliminarPresupuestoVentasLineas = new JButtonMe();
        this.jButtonCancelarPresupuestoVentasLineas = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoVentasLineas = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas = new JButtonMe();
		this.jButtonCerrarPresupuestoVentasLineas = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoVentasLineas = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoVentasLineas = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoVentasLineas = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Ventas_lineas";
		
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Ventas_lineases" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoVentasLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoVentasLineas.setName("jPanelCamposPresupuestoVentasLineas"); 

		this.jPanelCamposOcultosPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoVentasLineas.setName("jPanelCamposOcultosPresupuestoVentasLineas"); 

        this.jPanelAccionesPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoVentasLineas.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoVentasLineas.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoVentasLineas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoVentasLineas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoVentasLineas.setText("Nuevo");
		this.jButtonModificarPresupuestoVentasLineas.setText("Editar");
        this.jButtonActualizarPresupuestoVentasLineas.setText("Actualizar");
        this.jButtonEliminarPresupuestoVentasLineas.setText("Eliminar");
        this.jButtonCancelarPresupuestoVentasLineas.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoVentasLineas.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.setText("Guardar");
		this.jButtonCerrarPresupuestoVentasLineas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoVentasLineas,"nuevo_button","Nuevo",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoVentasLineas,"modificar_button","Editar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoVentasLineas,"actualizar_button","Actualizar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoVentasLineas,"eliminar_button","Eliminar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoVentasLineas,"cancelar_button","Cancelar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoVentasLineas,"guardarcambios_button","Guardar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoVentasLineas,"guardarcambiostabla_button","Guardar",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoVentasLineas,"cerrar_button","Salir",this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoVentasLineas.setToolTipText("Nuevo"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoVentasLineas.setToolTipText("Editar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoVentasLineas.setToolTipText("Actualizar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoVentasLineas.setToolTipText("Eliminar)"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoVentasLineas.setToolTipText("Cancelar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoVentasLineas.setToolTipText("Guardar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.setToolTipText("Guardar"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoVentasLineas.setToolTipText("Salir"+" "+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoVentasLineas";
		inputMap = this.jButtonNuevoPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoVentasLineas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoVentasLineas";
		inputMap = this.jButtonActualizarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoVentasLineas"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoVentasLineas";
		inputMap = this.jButtonEliminarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoVentasLineas"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoVentasLineas";
		inputMap = this.jButtonCancelarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoVentasLineas"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoVentasLineas";
		inputMap = this.jButtonCerrarPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoVentasLineas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoVentasLineas";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoVentasLineas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoVentasLineas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoVentasLineas.setToolTipText("Nuevo PresupuestoVentasLineas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentasLineas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoVentasLineas.setToolTipText("Sin Cerrar Ventana PresupuestoVentasLineas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoVentasLineas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoVentasLineas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoVentasLineas.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoVentasLineas = new JLabelMe();
		
		this.jLabelAccionesPresupuestoVentasLineas.setText("Acciones");		
		this.jLabelAccionesPresupuestoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoVentasLineas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoVentasLineas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoVentasLineas=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoVentasLineas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoVentasLineas = new GridBagLayout();
		
		this.jPanelCamposPresupuestoVentasLineas.setLayout(gridaBagLayoutCamposPresupuestoVentasLineas);
		this.jPanelCamposOcultosPresupuestoVentasLineas.setLayout(gridaBagLayoutCamposOcultosPresupuestoVentasLineas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoVentasLineas.add(jLabelIdPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoVentasLineas.add(jLabelidPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoVentasLineas.add(jLabelid_empresaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoVentasLineas.add(jButtonid_empresaPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoVentasLineas.add(jButtonid_empresaPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoVentasLineas.add(jComboBoxid_empresaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPresupuestoVentasLineas.add(jLabelid_sucursalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoVentasLineas.add(jButtonid_sucursalPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoVentasLineas.add(jButtonid_sucursalPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPresupuestoVentasLineas.add(jComboBoxid_sucursalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresupuestoVentasLineas.add(jLabelid_ejercicioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoVentasLineas.add(jButtonid_ejercicioPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoVentasLineas.add(jButtonid_ejercicioPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresupuestoVentasLineas.add(jComboBoxid_ejercicioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPresupuestoVentasLineas.add(jLabelid_periodoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoVentasLineas.add(jButtonid_periodoPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoVentasLineas.add(jButtonid_periodoPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPresupuestoVentasLineas.add(jComboBoxid_periodoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorPresupuestoVentasLineas.add(jLabelid_vendedorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPresupuestoVentasLineas.add(jButtonid_vendedorPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPresupuestoVentasLineas.add(jButtonid_vendedorPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorPresupuestoVentasLineas.add(jComboBoxid_vendedorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisPresupuestoVentasLineas.add(jLabelid_paisPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPresupuestoVentasLineas.add(jButtonid_paisPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPresupuestoVentasLineas.add(jButtonid_paisPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisPresupuestoVentasLineas.add(jComboBoxid_paisPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadPresupuestoVentasLineas.add(jLabelid_ciudadPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadPresupuestoVentasLineas.add(jButtonid_ciudadPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadPresupuestoVentasLineas.add(jButtonid_ciudadPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadPresupuestoVentasLineas.add(jComboBoxid_ciudadPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaPresupuestoVentasLineas.add(jLabelid_zonaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaPresupuestoVentasLineas.add(jButtonid_zonaPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaPresupuestoVentasLineas.add(jButtonid_zonaPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaPresupuestoVentasLineas.add(jComboBoxid_zonaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaPresupuestoVentasLineas.add(jLabelid_lineaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPresupuestoVentasLineas.add(jButtonid_lineaPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPresupuestoVentasLineas.add(jButtonid_lineaPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaPresupuestoVentasLineas.add(jComboBoxid_lineaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoPresupuestoVentasLineas.add(jLabelid_linea_grupoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPresupuestoVentasLineas.add(jButtonid_linea_grupoPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPresupuestoVentasLineas.add(jButtonid_linea_grupoPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoPresupuestoVentasLineas.add(jComboBoxid_linea_grupoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaPresupuestoVentasLineas.add(jLabelid_linea_categoriaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPresupuestoVentasLineas.add(jButtonid_linea_categoriaPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPresupuestoVentasLineas.add(jButtonid_linea_categoriaPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaPresupuestoVentasLineas.add(jComboBoxid_linea_categoriaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaPresupuestoVentasLineas.add(jLabelid_linea_marcaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPresupuestoVentasLineas.add(jButtonid_linea_marcaPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 3;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPresupuestoVentasLineas.add(jButtonid_linea_marcaPresupuestoVentasLineasUpdate, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaPresupuestoVentasLineas.add(jComboBoxid_linea_marcaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioPresupuestoVentasLineas.add(jLabelprecioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioPresupuestoVentasLineas.add(jButtonprecioPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioPresupuestoVentasLineas.add(jTextFieldprecioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadPresupuestoVentasLineas.add(jLabelcantidadPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadPresupuestoVentasLineas.add(jButtoncantidadPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadPresupuestoVentasLineas.add(jTextFieldcantidadPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresupuestoVentasLineas.add(jLabelvalorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresupuestoVentasLineas.add(jButtonvalorPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresupuestoVentasLineas.add(jTextFieldvalorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajePresupuestoVentasLineas.add(jLabelporcentajePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajePresupuestoVentasLineas.add(jButtonporcentajePresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajePresupuestoVentasLineas.add(jTextFieldporcentajePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_totalPresupuestoVentasLineas.add(jLabelcantidad_totalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_totalPresupuestoVentasLineas.add(jButtoncantidad_totalPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_totalPresupuestoVentasLineas.add(jTextFieldcantidad_totalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_totalPresupuestoVentasLineas.add(jLabelvalor_totalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 2;
		this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_totalPresupuestoVentasLineas.add(jButtonvalor_totalPresupuestoVentasLineasBusqueda, this.gridBagConstraintsPresupuestoVentasLineas);
	}

	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = 1;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_totalPresupuestoVentasLineas.add(jTextFieldvalor_totalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelidPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_vendedorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_paisPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_ciudadPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_zonaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_lineaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_linea_grupoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_linea_categoriaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelid_linea_marcaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelprecioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelcantidadPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelvalorPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelporcentajePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelcantidad_totalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoVentasLineas.add(this.jPanelvalor_totalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposPresupuestoVentasLineas % 1==0) {
		iXPanelCamposPresupuestoVentasLineas=0;
		iYPanelCamposPresupuestoVentasLineas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposOcultosPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposOcultosPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasLineas.add(this.jPanelid_empresaPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposOcultosPresupuestoVentasLineas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasLineas=0;
		iYPanelCamposOcultosPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposOcultosPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposOcultosPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasLineas.add(this.jPanelid_sucursalPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposOcultosPresupuestoVentasLineas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasLineas=0;
		iYPanelCamposOcultosPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposOcultosPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposOcultosPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasLineas.add(this.jPanelid_ejercicioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposOcultosPresupuestoVentasLineas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasLineas=0;
		iYPanelCamposOcultosPresupuestoVentasLineas++;
	}
	this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoVentasLineas.gridy = iYPanelCamposOcultosPresupuestoVentasLineas;
	this.gridBagConstraintsPresupuestoVentasLineas.gridx = iXPanelCamposOcultosPresupuestoVentasLineas++;
	this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoVentasLineas.add(this.jPanelid_periodoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);



	if(iXPanelCamposOcultosPresupuestoVentasLineas % 1==0) {
		iXPanelCamposOcultosPresupuestoVentasLineas=0;
		iYPanelCamposOcultosPresupuestoVentasLineas++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoVentasLineas= new GridBagLayout();
		this.jPanelAccionesPresupuestoVentasLineas.setLayout(gridaBagLayoutAccionesPresupuestoVentasLineas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoVentasLineas= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoVentasLineas.setLayout(gridaBagLayoutAccionesFormularioPresupuestoVentasLineas);
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoVentasLineas.add(this.jComboBoxTiposAccionesFormularioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoVentasLineas.add(this.jCheckBoxPostAccionNuevoPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestoventaslineasSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoVentasLineas.add(this.jCheckBoxPostAccionSinCerrarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestoventaslineasSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoVentasLineas.add(this.jCheckBoxPostAccionSinMensajePresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoVentasLineas.add(this.jButtonModificarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);							

		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoVentasLineas.add(this.jButtonEliminarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentasLineas.add(this.jButtonActualizarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);


		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentasLineas.add(this.jButtonGuardarCambiosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);	
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = 0;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoVentasLineas.add(this.jButtonCancelarPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoVentasLineas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoVentasLineas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;		
			//this.gridBagConstraintsPresupuestoVentasLineas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoVentasLineas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =0;
		this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoVentasLineas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoVentasLineasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoVentasLineas = new PresupuestoVentasLineasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Ventas_lineas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Presupuesto Ventas_lineas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Ventas_lineas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresupuestoVentasLineasModel presupuestoventaslineasModel=new PresupuestoVentasLineasModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoVentasLineasModel.PresupuestoVentasLineasFocusTraversalPolicy presupuestoventaslineasFocusTraversalPolicy = presupuestoventaslineasModel.new PresupuestoVentasLineasFocusTraversalPolicy(this);
			
			//presupuestoventaslineasFocusTraversalPolicy.setpresupuestoventaslineasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestoventaslineasModel);
			
			
			this.jContentPaneDetallePresupuestoVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoVentasLineas = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoVentasLineas.setLayout(gridaBagLayoutDetallePresupuestoVentasLineas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoVentasLineas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoVentasLineas.add(jTtoolBarDetallePresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas=   new JScrollPane(jContentPaneDetallePresupuestoVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoVentasLineas.add(jPanelCamposPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);
			
			
			
			
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
						&& presupuestoventaslineasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestoventaslineasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoVentasLineas= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
						this.jContentPaneDetallePresupuestoVentasLineas.add(this.jTabbedPaneRelacionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoVentasLineas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoVentasLineas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoVentasLineas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoVentasLineas.add(jPanelCamposOcultosPresupuestoVentasLineas, gridBagConstraintsPresupuestoVentasLineas);
				
					this.jPanelCamposOcultosPresupuestoVentasLineas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	        this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoVentasLineas.add(this.jPanelAccionesFormularioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);							
			
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoVentasLineas.add(this.jPanelAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoVentasLineas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas=   new JScrollPane(this.jPanelCamposPresupuestoVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
			this.gridBagConstraintsPresupuestoVentasLineas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoVentasLineas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoVentasLineas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);			
			
			this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
			
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		
			
		this.gridBagConstraintsPresupuestoVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoVentasLineas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoVentasLineas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoVentasLineas, this.gridBagConstraintsPresupuestoVentasLineas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoVentasLineas;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoVentasLineas;
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
