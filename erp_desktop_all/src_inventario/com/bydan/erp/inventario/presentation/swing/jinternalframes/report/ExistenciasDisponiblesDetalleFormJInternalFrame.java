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
import com.bydan.erp.inventario.util.report.ExistenciasDisponiblesConstantesFunciones;

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
public class ExistenciasDisponiblesDetalleFormJInternalFrame extends ExistenciasDisponiblesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleExistenciasDisponibles;
	
	protected JMenuBar jmenuBarDetalleExistenciasDisponibles;
	
	protected JMenu jmenuDetalleExistenciasDisponibles;
	protected JMenu jmenuDetalleArchivoExistenciasDisponibles;
	protected JMenu jmenuDetalleAccionesExistenciasDisponibles;
	protected JMenu jmenuDetalleDatosExistenciasDisponibles;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutExistenciasDisponibles;	
	protected GridBagConstraints gridBagConstraintsExistenciasDisponibles;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ExistenciasDisponiblesBeanSwingJInternalFrameAdditional jInternalFrameDetalleExistenciasDisponibles;		
	
	
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
	
	public ExistenciasDisponiblesSessionBean existenciasdisponiblesSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ExistenciasDisponiblesLogic existenciasdisponiblesLogic;
	
	public JScrollPane jScrollPanelDatosExistenciasDisponibles;
	public JScrollPane jScrollPanelDatosEdicionExistenciasDisponibles;
	public JScrollPane jScrollPanelDatosGeneralExistenciasDisponibles;
	
	protected JPanel jPanelCamposExistenciasDisponibles;    
	protected JPanel jPanelCamposOcultosExistenciasDisponibles;    	
	protected JPanel jPanelAccionesExistenciasDisponibles;
	protected JPanel jPanelAccionesFormularioExistenciasDisponibles;
    
	
	
	protected Integer iXPanelCamposExistenciasDisponibles=0;
	protected Integer iYPanelCamposExistenciasDisponibles=0;
	
	protected Integer iXPanelCamposOcultosExistenciasDisponibles=0;
	protected Integer iYPanelCamposOcultosExistenciasDisponibles=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoExistenciasDisponibles;
	public JButton jButtonModificarExistenciasDisponibles;
	public JButton jButtonActualizarExistenciasDisponibles;
    public JButton jButtonEliminarExistenciasDisponibles;
	public JButton jButtonCancelarExistenciasDisponibles;
    public JButton jButtonGuardarCambiosExistenciasDisponibles;
	public JButton jButtonGuardarCambiosTablaExistenciasDisponibles;
	protected JButton jButtonCerrarExistenciasDisponibles;
	
	
	protected JButton jButtonProcesarInformacionExistenciasDisponibles;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoExistenciasDisponibles;
	protected JCheckBox jCheckBoxPostAccionSinCerrarExistenciasDisponibles;
	protected JCheckBox jCheckBoxPostAccionSinMensajeExistenciasDisponibles;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarExistenciasDisponibles;
	protected JButton jButtonModificarToolBarExistenciasDisponibles;
	protected JButton jButtonActualizarToolBarExistenciasDisponibles;
    protected JButton jButtonEliminarToolBarExistenciasDisponibles;
	protected JButton jButtonCancelarToolBarExistenciasDisponibles;
    protected JButton jButtonGuardarCambiosToolBarExistenciasDisponibles;
	protected JButton jButtonGuardarCambiosTablaToolBarExistenciasDisponibles;
	protected JButton jButtonMostrarOcultarTablaToolBarExistenciasDisponibles;
	protected JButton jButtonCerrarToolBarExistenciasDisponibles;
	
	protected JButton jButtonProcesarInformacionToolBarExistenciasDisponibles;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoExistenciasDisponibles;
	protected JMenuItem jMenuItemModificarExistenciasDisponibles;
	protected JMenuItem jMenuItemActualizarExistenciasDisponibles;
    protected JMenuItem jMenuItemEliminarExistenciasDisponibles;
	protected JMenuItem jMenuItemCancelarExistenciasDisponibles;
    protected JMenuItem jMenuItemGuardarCambiosExistenciasDisponibles;
	protected JMenuItem jMenuItemGuardarCambiosTablaExistenciasDisponibles;
	protected JMenuItem jMenuItemCerrarExistenciasDisponibles;
	protected JMenuItem jMenuItemDetalleCerrarExistenciasDisponibles;
	protected JMenuItem jMenuItemDetalleMostarOcultarExistenciasDisponibles;
	
	protected JMenuItem jMenuItemProcesarInformacionExistenciasDisponibles;
	protected JMenuItem jMenuItemNuevoGuardarCambiosExistenciasDisponibles;
	protected JMenuItem jMenuItemMostrarOcultarExistenciasDisponibles;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesExistenciasDisponibles;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesExistenciasDisponibles;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioExistenciasDisponibles;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidExistenciasDisponibles;
	public JLabel jLabelIdExistenciasDisponibles;
	public JLabel jLabelidExistenciasDisponibles;
	public JButton jButtonidExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_venta_hastaExistenciasDisponibles;
	public JLabel jLabelfecha_ultima_venta_hastaExistenciasDisponibles;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles;
	public JButton jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoExistenciasDisponibles;
	public JLabel jLabelcodigoExistenciasDisponibles;
	public JTextArea jTextAreacodigoExistenciasDisponibles;
	public JScrollPane jscrollPanecodigoExistenciasDisponibles;
	public JButton jButtoncodigoExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadExistenciasDisponibles;
	public JLabel jLabelnombre_unidadExistenciasDisponibles;
	public JTextField jTextFieldnombre_unidadExistenciasDisponibles;
	public JButton jButtonnombre_unidadExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleExistenciasDisponibles;
	public JLabel jLabelcantidad_disponibleExistenciasDisponibles;
	public JTextField jTextFieldcantidad_disponibleExistenciasDisponibles;
	public JButton jButtoncantidad_disponibleExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_fisicaExistenciasDisponibles;
	public JLabel jLabelcantidad_fisicaExistenciasDisponibles;
	public JTextField jTextFieldcantidad_fisicaExistenciasDisponibles;
	public JButton jButtoncantidad_fisicaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoExistenciasDisponibles;
	public JLabel jLabelcodigo_productoExistenciasDisponibles;
	public JTextField jTextFieldcodigo_productoExistenciasDisponibles;
	public JButton jButtoncodigo_productoExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelnombreExistenciasDisponibles;
	public JLabel jLabelnombreExistenciasDisponibles;
	public JTextArea jTextAreanombreExistenciasDisponibles;
	public JScrollPane jscrollPanenombreExistenciasDisponibles;
	public JButton jButtonnombreExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelingresosExistenciasDisponibles;
	public JLabel jLabelingresosExistenciasDisponibles;
	public JTextField jTextFieldingresosExistenciasDisponibles;
	public JButton jButtoningresosExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelegresosExistenciasDisponibles;
	public JLabel jLabelegresosExistenciasDisponibles;
	public JTextField jTextFieldegresosExistenciasDisponibles;
	public JButton jButtonegresosExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPaneldisponible_corteExistenciasDisponibles;
	public JLabel jLabeldisponible_corteExistenciasDisponibles;
	public JTextField jTextFielddisponible_corteExistenciasDisponibles;
	public JButton jButtondisponible_corteExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPaneldiferenciaExistenciasDisponibles;
	public JLabel jLabeldiferenciaExistenciasDisponibles;
	public JTextField jTextFielddiferenciaExistenciasDisponibles;
	public JButton jButtondiferenciaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPaneldestinoExistenciasDisponibles;
	public JLabel jLabeldestinoExistenciasDisponibles;
	public JTextField jTextFielddestinoExistenciasDisponibles;
	public JButton jButtondestinoExistenciasDisponiblesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaExistenciasDisponibles;
	public JLabel jLabelid_bodegaExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaExistenciasDisponibles;
	public JButton jButtonid_bodegaExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_bodegaExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_bodegaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_productoExistenciasDisponibles;
	public JLabel jLabelid_productoExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoExistenciasDisponibles;
	public JButton jButtonid_productoExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_productoExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_productoExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaExistenciasDisponibles;
	public JLabel jLabelid_empresaExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaExistenciasDisponibles;
	public JButton jButtonid_empresaExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_empresaExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_empresaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalExistenciasDisponibles;
	public JLabel jLabelid_sucursalExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalExistenciasDisponibles;
	public JButton jButtonid_sucursalExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_sucursalExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaExistenciasDisponibles;
	public JLabel jLabelid_lineaExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaExistenciasDisponibles;
	public JButton jButtonid_lineaExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_lineaExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_lineaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoExistenciasDisponibles;
	public JLabel jLabelid_linea_grupoExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoExistenciasDisponibles;
	public JButton jButtonid_linea_grupoExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_linea_grupoExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaExistenciasDisponibles;
	public JLabel jLabelid_linea_categoriaExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaExistenciasDisponibles;
	public JButton jButtonid_linea_categoriaExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_linea_categoriaExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaExistenciasDisponiblesBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaExistenciasDisponibles;
	public JLabel jLabelid_linea_marcaExistenciasDisponibles;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaExistenciasDisponibles;
	public JButton jButtonid_linea_marcaExistenciasDisponibles= new JButtonMe();
	public JButton jButtonid_linea_marcaExistenciasDisponiblesUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaExistenciasDisponiblesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesExistenciasDisponibles;
	
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
	public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ExistenciasDisponiblesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposExistenciasDisponibles=new JPanel();
				this.jPanelAccionesFormularioExistenciasDisponibles=new JPanel();
				this.jmenuBarDetalleExistenciasDisponibles=new JMenuBar();
				this.jTtoolBarDetalleExistenciasDisponibles=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ExistenciasDisponiblesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasDisponiblesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ExistenciasDisponibles No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarExistenciasDisponibles() {
		return this.jButtonActualizarToolBarExistenciasDisponibles;
	}
	
	public JButton getjButtonEliminarToolBarExistenciasDisponibles() {
		return this.jButtonEliminarToolBarExistenciasDisponibles;
	}
	
	public JButton getjButtonCancelarToolBarExistenciasDisponibles() {
		return this.jButtonCancelarToolBarExistenciasDisponibles;
	}		
	
	public JButton getjButtonProcesarInformacionExistenciasDisponibles() {
		return this.jButtonProcesarInformacionExistenciasDisponibles;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionExistenciasDisponibles)	{
		this.jButtonProcesarInformacionExistenciasDisponibles = jButtonProcesarInformacionExistenciasDisponibles;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesExistenciasDisponibles() {
		return this.jComboBoxTiposAccionesExistenciasDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesExistenciasDisponibles(
			JComboBox jComboBoxTiposRelacionesExistenciasDisponibles) {
		this.jComboBoxTiposRelacionesExistenciasDisponibles = jComboBoxTiposRelacionesExistenciasDisponibles;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesExistenciasDisponibles(
			JComboBox jComboBoxTiposAccionesExistenciasDisponibles) {
		this.jComboBoxTiposAccionesExistenciasDisponibles = jComboBoxTiposAccionesExistenciasDisponibles;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioExistenciasDisponibles() {
		return this.jComboBoxTiposAccionesFormularioExistenciasDisponibles;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioExistenciasDisponibles(
			JComboBox jComboBoxTiposAccionesFormularioExistenciasDisponibles) {
		this.jComboBoxTiposAccionesFormularioExistenciasDisponibles = jComboBoxTiposAccionesFormularioExistenciasDisponibles;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.existenciasdisponiblesSessionBean=new ExistenciasDisponiblesSessionBean();
		
		this.existenciasdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.existenciasdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ExistenciasDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ExistenciasDisponiblesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ExistenciasDisponiblesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Existencias Disponibles MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
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
	
		ExistenciasDisponiblesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleExistenciasDisponibles= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarExistenciasDisponibles=new JButtonMe();
				this.jButtonModificarToolBarExistenciasDisponibles=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarExistenciasDisponibles,this.jTtoolBarDetalleExistenciasDisponibles,
							"actualizar","actualizar","Actualizar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarExistenciasDisponibles,this.jTtoolBarDetalleExistenciasDisponibles,
							"eliminar","eliminar","Eliminar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarExistenciasDisponibles,this.jTtoolBarDetalleExistenciasDisponibles,
							"cancelar","cancelar","Cancelar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarExistenciasDisponibles=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarExistenciasDisponibles,this.jTtoolBarDetalleExistenciasDisponibles,
							"guardarcambios","guardarcambios","Guardar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleExistenciasDisponibles=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleExistenciasDisponibles=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoExistenciasDisponibles=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesExistenciasDisponibles=new JMenuMe("Acciones");
		this.jmenuDetalleDatosExistenciasDisponibles=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoExistenciasDisponibles= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoExistenciasDisponibles.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoExistenciasDisponibles,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarExistenciasDisponibles= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarExistenciasDisponibles.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarExistenciasDisponibles,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarExistenciasDisponibles= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarExistenciasDisponibles.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarExistenciasDisponibles,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarExistenciasDisponibles= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarExistenciasDisponibles.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarExistenciasDisponibles,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarExistenciasDisponibles= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarExistenciasDisponibles.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarExistenciasDisponibles,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosExistenciasDisponibles= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosExistenciasDisponibles.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosExistenciasDisponibles,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarExistenciasDisponibles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarExistenciasDisponibles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarExistenciasDisponibles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarExistenciasDisponibles= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarExistenciasDisponibles.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarExistenciasDisponibles,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarExistenciasDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarExistenciasDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarExistenciasDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarExistenciasDisponibles= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarExistenciasDisponibles.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarExistenciasDisponibles,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoExistenciasDisponibles.add(this.jMenuItemDetalleCerrarExistenciasDisponibles);
		
		this.jmenuDetalleAccionesExistenciasDisponibles.add(this.jMenuItemActualizarExistenciasDisponibles);
		this.jmenuDetalleAccionesExistenciasDisponibles.add(this.jMenuItemEliminarExistenciasDisponibles);
		this.jmenuDetalleAccionesExistenciasDisponibles.add(this.jMenuItemCancelarExistenciasDisponibles);		
		
		//this.jmenuDetalleDatosExistenciasDisponibles.add(this.jMenuItemDetalleAbrirOrderByExistenciasDisponibles);				
		this.jmenuDetalleDatosExistenciasDisponibles.add(this.jMenuItemDetalleMostarOcultarExistenciasDisponibles);				
				
		//this.jmenuDetalleAccionesExistenciasDisponibles.add(this.jMenuItemGuardarCambiosExistenciasDisponibles);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleExistenciasDisponibles.add(this.jmenuDetalleArchivoExistenciasDisponibles);		
		this.jmenuBarDetalleExistenciasDisponibles.add(this.jmenuDetalleAccionesExistenciasDisponibles);		
		this.jmenuBarDetalleExistenciasDisponibles.add(this.jmenuDetalleDatosExistenciasDisponibles);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleExistenciasDisponibles);				
	}
	
	
	public void inicializarElementosCamposExistenciasDisponibles() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdExistenciasDisponibles = new JLabelMe();
		jLabelIdExistenciasDisponibles.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidExistenciasDisponibles = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutExistenciasDisponibles= new GridBagLayout();

		this.jPanelidExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);

		jLabelidExistenciasDisponibles = new JLabel();
		jLabelidExistenciasDisponibles.setText("Id");

		jLabelidExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ultima_venta_hastaExistenciasDisponibles = new JLabelMe();
		this.jLabelfecha_ultima_venta_hastaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA+" : *");
		this.jLabelfecha_ultima_venta_hastaExistenciasDisponibles.setToolTipText("Fecha Ultima Venta Hasta");
		this.jLabelfecha_ultima_venta_hastaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		//jFormattedTextFieldfecha_ultima_venta_hastaExistenciasDisponibles= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setEnabled(false);
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_venta_hastaExistenciasDisponibles.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_venta_hastaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoExistenciasDisponibles = new JLabelMe();
		this.jLabelcodigoExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoExistenciasDisponibles.setToolTipText("Codigo");
		this.jLabelcodigoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelcodigoExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextAreacodigoExistenciasDisponibles= new JTextAreaMe();
		jTextAreacodigoExistenciasDisponibles.setEnabled(false);
		jTextAreacodigoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoExistenciasDisponibles.setLineWrap(true);
		jTextAreacodigoExistenciasDisponibles.setWrapStyleWord(true);
		jTextAreacodigoExistenciasDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoExistenciasDisponibles.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoExistenciasDisponibles = new JScrollPane(jTextAreacodigoExistenciasDisponibles);
		jscrollPanecodigoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtoncodigoExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoExistenciasDisponiblesBusqueda.setText("U");
		this.jButtoncodigoExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadExistenciasDisponibles = new JLabelMe();
		this.jLabelnombre_unidadExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadExistenciasDisponibles.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelnombre_unidadExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFieldnombre_unidadExistenciasDisponibles= new JTextFieldMe();

		jTextFieldnombre_unidadExistenciasDisponibles.setEnabled(false);
		jTextFieldnombre_unidadExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleExistenciasDisponibles = new JLabelMe();
		this.jLabelcantidad_disponibleExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleExistenciasDisponibles.setToolTipText("Cantidad Disponible");
		this.jLabelcantidad_disponibleExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelcantidad_disponibleExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFieldcantidad_disponibleExistenciasDisponibles= new JTextFieldMe();
		jTextFieldcantidad_disponibleExistenciasDisponibles.setEnabled(false);
		jTextFieldcantidad_disponibleExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleExistenciasDisponibles.setText("0");

		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setText("U");
		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_fisicaExistenciasDisponibles = new JLabelMe();
		this.jLabelcantidad_fisicaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA+" : *");
		this.jLabelcantidad_fisicaExistenciasDisponibles.setToolTipText("Cantidad Fisica");
		this.jLabelcantidad_fisicaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_fisicaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_fisicaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_fisicaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_CANTIDADFISICA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelcantidad_fisicaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFieldcantidad_fisicaExistenciasDisponibles= new JTextFieldMe();
		jTextFieldcantidad_fisicaExistenciasDisponibles.setEnabled(false);
		jTextFieldcantidad_fisicaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_fisicaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_fisicaExistenciasDisponibles.setText("0");

		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_fisicaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_fisicaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_fisicaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_fisicaExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoExistenciasDisponibles = new JLabelMe();
		this.jLabelcodigo_productoExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoExistenciasDisponibles.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelcodigo_productoExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFieldcodigo_productoExistenciasDisponibles= new JTextFieldMe();

		jTextFieldcodigo_productoExistenciasDisponibles.setEnabled(false);
		jTextFieldcodigo_productoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setText("U");
		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelnombreExistenciasDisponibles = new JLabelMe();
		this.jLabelnombreExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreExistenciasDisponibles.setToolTipText("Nombre");
		this.jLabelnombreExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelnombreExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextAreanombreExistenciasDisponibles= new JTextAreaMe();
		jTextAreanombreExistenciasDisponibles.setEnabled(false);
		jTextAreanombreExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreExistenciasDisponibles.setLineWrap(true);
		jTextAreanombreExistenciasDisponibles.setWrapStyleWord(true);
		jTextAreanombreExistenciasDisponibles.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreExistenciasDisponibles.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreExistenciasDisponibles = new JScrollPane(jTextAreanombreExistenciasDisponibles);
		jscrollPanenombreExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonnombreExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonnombreExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelingresosExistenciasDisponibles = new JLabelMe();
		this.jLabelingresosExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS+" : *");
		this.jLabelingresosExistenciasDisponibles.setToolTipText("Ingresos");
		this.jLabelingresosExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresosExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresosExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresosExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_INGRESOS);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelingresosExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFieldingresosExistenciasDisponibles= new JTextFieldMe();
		jTextFieldingresosExistenciasDisponibles.setEnabled(false);
		jTextFieldingresosExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingresosExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingresosExistenciasDisponibles.setText("0.0");

		this.jButtoningresosExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtoningresosExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresosExistenciasDisponiblesBusqueda.setText("U");
		this.jButtoningresosExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresosExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresosExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingresosExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingresosExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresosExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresosExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabelegresosExistenciasDisponibles = new JLabelMe();
		this.jLabelegresosExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS+" : *");
		this.jLabelegresosExistenciasDisponibles.setToolTipText("Egresos");
		this.jLabelegresosExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelegresosExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelegresosExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelegresosExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_EGRESOS);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelegresosExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFieldegresosExistenciasDisponibles= new JTextFieldMe();
		jTextFieldegresosExistenciasDisponibles.setEnabled(false);
		jTextFieldegresosExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldegresosExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldegresosExistenciasDisponibles.setText("0.0");

		this.jButtonegresosExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonegresosExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonegresosExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonegresosExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonegresosExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonegresosExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldegresosExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldegresosExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"egresosExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonegresosExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabeldisponible_corteExistenciasDisponibles = new JLabelMe();
		this.jLabeldisponible_corteExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE+" : *");
		this.jLabeldisponible_corteExistenciasDisponibles.setToolTipText("Disponible Corte");
		this.jLabeldisponible_corteExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldisponible_corteExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldisponible_corteExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponible_corteExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponible_corteExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponible_corteExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_DISPONIBLECORTE);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPaneldisponible_corteExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFielddisponible_corteExistenciasDisponibles= new JTextFieldMe();
		jTextFielddisponible_corteExistenciasDisponibles.setEnabled(false);
		jTextFielddisponible_corteExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponible_corteExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponible_corteExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponible_corteExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponible_corteExistenciasDisponibles.setText("0.0");

		this.jButtondisponible_corteExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setText("U");
		this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponible_corteExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponible_corteExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponible_corteExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponible_corteExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponible_corteExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabeldiferenciaExistenciasDisponibles = new JLabelMe();
		this.jLabeldiferenciaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA+" : *");
		this.jLabeldiferenciaExistenciasDisponibles.setToolTipText("Diferencia");
		this.jLabeldiferenciaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiferenciaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiferenciaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiferenciaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiferenciaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiferenciaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_DIFERENCIA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPaneldiferenciaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFielddiferenciaExistenciasDisponibles= new JTextFieldMe();
		jTextFielddiferenciaExistenciasDisponibles.setEnabled(false);
		jTextFielddiferenciaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiferenciaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiferenciaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiferenciaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiferenciaExistenciasDisponibles.setText("0.0");

		this.jButtondiferenciaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtondiferenciaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiferenciaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiferenciaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiferenciaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtondiferenciaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiferenciaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiferenciaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiferenciaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiferenciaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diferenciaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiferenciaExistenciasDisponiblesBusqueda.setVisible(false);		}


					
		this.jLabeldestinoExistenciasDisponibles = new JLabelMe();
		this.jLabeldestinoExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO+" : *");
		this.jLabeldestinoExistenciasDisponibles.setToolTipText("Destino");
		this.jLabeldestinoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldestinoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldestinoExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldestinoExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_DESTINO);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPaneldestinoExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jTextFielddestinoExistenciasDisponibles= new JTextFieldMe();
		jTextFielddestinoExistenciasDisponibles.setEnabled(false);
		jTextFielddestinoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddestinoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddestinoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddestinoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddestinoExistenciasDisponibles.setText("0.0");

		this.jButtondestinoExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtondestinoExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondestinoExistenciasDisponiblesBusqueda.setText("U");
		this.jButtondestinoExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondestinoExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondestinoExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddestinoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddestinoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"destinoExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondestinoExistenciasDisponiblesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysExistenciasDisponibles() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaExistenciasDisponibles = new JLabelMe();
		this.jLabelid_bodegaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaExistenciasDisponibles.setToolTipText("Bodega");
		this.jLabelid_bodegaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_bodegaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_bodegaExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_bodegaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaExistenciasDisponibles= new JButtonMe();
		this.jButtonid_bodegaExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaExistenciasDisponibles.setText("Buscar");
		this.jButtonid_bodegaExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaExistenciasDisponibles"));

		this.jButtonid_bodegaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_bodegaExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_bodegaExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_bodegaExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaExistenciasDisponiblesUpdate"));



					
		this.jLabelid_productoExistenciasDisponibles = new JLabelMe();
		this.jLabelid_productoExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoExistenciasDisponibles.setToolTipText("Producto");
		this.jLabelid_productoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_productoExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_productoExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_productoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoExistenciasDisponibles= new JButtonMe();
		this.jButtonid_productoExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoExistenciasDisponibles.setText("Buscar");
		this.jButtonid_productoExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoExistenciasDisponibles"));

		this.jButtonid_productoExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_productoExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_productoExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_productoExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_productoExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_productoExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoExistenciasDisponiblesUpdate"));



					
		this.jLabelid_empresaExistenciasDisponibles = new JLabelMe();
		this.jLabelid_empresaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaExistenciasDisponibles.setToolTipText("Empresa");
		this.jLabelid_empresaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_empresaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_empresaExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_empresaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaExistenciasDisponibles.setEnabled(false);

		this.jButtonid_empresaExistenciasDisponibles= new JButtonMe();
		this.jButtonid_empresaExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaExistenciasDisponibles.setText("Buscar");
		this.jButtonid_empresaExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaExistenciasDisponibles"));

		this.jButtonid_empresaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_empresaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_empresaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_empresaExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_empresaExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_empresaExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaExistenciasDisponiblesUpdate"));



					
		this.jLabelid_sucursalExistenciasDisponibles = new JLabelMe();
		this.jLabelid_sucursalExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalExistenciasDisponibles.setToolTipText("Sucursal");
		this.jLabelid_sucursalExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_sucursalExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_sucursalExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_sucursalExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalExistenciasDisponibles.setEnabled(false);

		this.jButtonid_sucursalExistenciasDisponibles= new JButtonMe();
		this.jButtonid_sucursalExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalExistenciasDisponibles.setText("Buscar");
		this.jButtonid_sucursalExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalExistenciasDisponibles"));

		this.jButtonid_sucursalExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_sucursalExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_sucursalExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalExistenciasDisponiblesUpdate"));



					
		this.jLabelid_lineaExistenciasDisponibles = new JLabelMe();
		this.jLabelid_lineaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaExistenciasDisponibles.setToolTipText("Linea");
		this.jLabelid_lineaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_lineaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_lineaExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_lineaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaExistenciasDisponibles= new JButtonMe();
		this.jButtonid_lineaExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaExistenciasDisponibles.setText("Buscar");
		this.jButtonid_lineaExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaExistenciasDisponibles"));

		this.jButtonid_lineaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_lineaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_lineaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_lineaExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_lineaExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_lineaExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaExistenciasDisponiblesUpdate"));



					
		this.jLabelid_linea_grupoExistenciasDisponibles = new JLabelMe();
		this.jLabelid_linea_grupoExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoExistenciasDisponibles.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_linea_grupoExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_linea_grupoExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_linea_grupoExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoExistenciasDisponibles= new JButtonMe();
		this.jButtonid_linea_grupoExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoExistenciasDisponibles.setText("Buscar");
		this.jButtonid_linea_grupoExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoExistenciasDisponibles"));

		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_linea_grupoExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_linea_grupoExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoExistenciasDisponiblesUpdate"));



					
		this.jLabelid_linea_categoriaExistenciasDisponibles = new JLabelMe();
		this.jLabelid_linea_categoriaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaExistenciasDisponibles.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_linea_categoriaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_linea_categoriaExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_linea_categoriaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaExistenciasDisponibles= new JButtonMe();
		this.jButtonid_linea_categoriaExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaExistenciasDisponibles.setText("Buscar");
		this.jButtonid_linea_categoriaExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaExistenciasDisponibles"));

		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaExistenciasDisponiblesUpdate"));



					
		this.jLabelid_linea_marcaExistenciasDisponibles = new JLabelMe();
		this.jLabelid_linea_marcaExistenciasDisponibles.setText(""+ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaExistenciasDisponibles.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaExistenciasDisponibles=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaExistenciasDisponibles.setToolTipText(ExistenciasDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		this.jPanelid_linea_marcaExistenciasDisponibles.setLayout(this.gridaBagLayoutExistenciasDisponibles);


		jComboBoxid_linea_marcaExistenciasDisponibles= new JComboBoxMe();
		jComboBoxid_linea_marcaExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaExistenciasDisponibles= new JButtonMe();
		this.jButtonid_linea_marcaExistenciasDisponibles.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaExistenciasDisponibles.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaExistenciasDisponibles.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaExistenciasDisponibles.setText("Buscar");
		this.jButtonid_linea_marcaExistenciasDisponibles.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaExistenciasDisponibles.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaExistenciasDisponibles,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaExistenciasDisponibles"));

		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setText("U");
		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaExistenciasDisponiblesBusqueda"));

		if(this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaExistenciasDisponiblesBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaExistenciasDisponiblesUpdate= new JButtonMe();
		this.jButtonid_linea_marcaExistenciasDisponiblesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasDisponiblesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasDisponiblesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaExistenciasDisponiblesUpdate.setText("U");
		this.jButtonid_linea_marcaExistenciasDisponiblesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaExistenciasDisponiblesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaExistenciasDisponiblesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaExistenciasDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaExistenciasDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaExistenciasDisponiblesUpdate"));



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
		//this.jInternalFrameDetalleExistenciasDisponibles = new ExistenciasDisponiblesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Existencias Disponibles DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutExistenciasDisponibles= new GridBagLayout();
		

		
		String sToolTipExistenciasDisponibles="";
		sToolTipExistenciasDisponibles=ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipExistenciasDisponibles+="(Inventario.ExistenciasDisponibles)";
		}
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			sToolTipExistenciasDisponibles+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoExistenciasDisponibles = new JButtonMe();
		this.jButtonModificarExistenciasDisponibles = new JButtonMe();
        this.jButtonActualizarExistenciasDisponibles = new JButtonMe();
        this.jButtonEliminarExistenciasDisponibles = new JButtonMe();
        this.jButtonCancelarExistenciasDisponibles = new JButtonMe();
        this.jButtonGuardarCambiosExistenciasDisponibles = new JButtonMe();
		this.jButtonGuardarCambiosTablaExistenciasDisponibles = new JButtonMe();
		this.jButtonCerrarExistenciasDisponibles = new JButtonMe();
		
		this.jScrollPanelDatosExistenciasDisponibles = new JScrollPane();   
        this.jScrollPanelDatosEdicionExistenciasDisponibles = new JScrollPane();
		this.jScrollPanelDatosGeneralExistenciasDisponibles = new JScrollPane();
				
		
		
		this.jPanelCamposExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Existencias Disponibles";
		
		if(!this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Disponibleses" + this.sPath));
		} else {
			this.jScrollPanelDatosExistenciasDisponibles.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposExistenciasDisponibles.setName("jPanelCamposExistenciasDisponibles"); 

		this.jPanelCamposOcultosExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosExistenciasDisponibles.setName("jPanelCamposOcultosExistenciasDisponibles"); 

        this.jPanelAccionesExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesExistenciasDisponibles.setToolTipText("Acciones");
        this.jPanelAccionesExistenciasDisponibles.setName("Acciones"); 

		this.jPanelAccionesFormularioExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioExistenciasDisponibles.setToolTipText("Acciones");
        this.jPanelAccionesFormularioExistenciasDisponibles.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoExistenciasDisponibles.setText("Nuevo");
		this.jButtonModificarExistenciasDisponibles.setText("Editar");
        this.jButtonActualizarExistenciasDisponibles.setText("Actualizar");
        this.jButtonEliminarExistenciasDisponibles.setText("Eliminar");
        this.jButtonCancelarExistenciasDisponibles.setText("Cancelar");
        this.jButtonGuardarCambiosExistenciasDisponibles.setText("Guardar");
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.setText("Guardar");
		this.jButtonCerrarExistenciasDisponibles.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoExistenciasDisponibles,"nuevo_button","Nuevo",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarExistenciasDisponibles,"modificar_button","Editar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarExistenciasDisponibles,"actualizar_button","Actualizar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarExistenciasDisponibles,"eliminar_button","Eliminar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarExistenciasDisponibles,"cancelar_button","Cancelar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosExistenciasDisponibles,"guardarcambios_button","Guardar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaExistenciasDisponibles,"guardarcambiostabla_button","Guardar",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarExistenciasDisponibles,"cerrar_button","Salir",this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoExistenciasDisponibles.setToolTipText("Nuevo"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarExistenciasDisponibles.setToolTipText("Editar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarExistenciasDisponibles.setToolTipText("Actualizar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarExistenciasDisponibles.setToolTipText("Eliminar)"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarExistenciasDisponibles.setToolTipText("Cancelar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosExistenciasDisponibles.setToolTipText("Guardar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.setToolTipText("Guardar"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarExistenciasDisponibles.setToolTipText("Salir"+" "+ExistenciasDisponiblesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoExistenciasDisponibles";
		inputMap = this.jButtonNuevoExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoExistenciasDisponibles.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoExistenciasDisponibles"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarExistenciasDisponibles";
		inputMap = this.jButtonActualizarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarExistenciasDisponibles"));
		
		//ELIMINAR
		sMapKey = "EliminarExistenciasDisponibles";
		inputMap = this.jButtonEliminarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarExistenciasDisponibles"));
		
		//CANCELAR	
		sMapKey = "CancelarExistenciasDisponibles";
		inputMap = this.jButtonCancelarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarExistenciasDisponibles"));
		
		//CERRAR		
		sMapKey = "CerrarExistenciasDisponibles";
		inputMap = this.jButtonCerrarExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarExistenciasDisponibles"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaExistenciasDisponibles";
		inputMap = this.jButtonGuardarCambiosTablaExistenciasDisponibles.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaExistenciasDisponibles.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaExistenciasDisponibles"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoExistenciasDisponibles = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoExistenciasDisponibles.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoExistenciasDisponibles.setToolTipText("Nuevo ExistenciasDisponibles");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarExistenciasDisponibles = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarExistenciasDisponibles.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarExistenciasDisponibles.setToolTipText("Sin Cerrar Ventana ExistenciasDisponibles");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeExistenciasDisponibles = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeExistenciasDisponibles.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeExistenciasDisponibles.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesExistenciasDisponibles.setText("Accion");
		this.jComboBoxTiposAccionesExistenciasDisponibles.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioExistenciasDisponibles = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesExistenciasDisponibles = new JLabelMe();
		
		this.jLabelAccionesExistenciasDisponibles.setText("Acciones");		
		this.jLabelAccionesExistenciasDisponibles.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasDisponibles.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasDisponibles.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposExistenciasDisponibles();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysExistenciasDisponibles();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesExistenciasDisponibles=new JTabbedPane();
		this.jTabbedPaneRelacionesExistenciasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesExistenciasDisponibles,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasDisponibles.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioExistenciasDisponibles.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioExistenciasDisponibles, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposExistenciasDisponibles = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosExistenciasDisponibles = new GridBagLayout();
		
		this.jPanelCamposExistenciasDisponibles.setLayout(gridaBagLayoutCamposExistenciasDisponibles);
		this.jPanelCamposOcultosExistenciasDisponibles.setLayout(gridaBagLayoutCamposOcultosExistenciasDisponibles);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidExistenciasDisponibles.add(jLabelIdExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidExistenciasDisponibles.add(jLabelidExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaExistenciasDisponibles.add(jLabelid_bodegaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaExistenciasDisponibles.add(jButtonid_bodegaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaExistenciasDisponibles.add(jButtonid_bodegaExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaExistenciasDisponibles.add(jComboBoxid_bodegaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoExistenciasDisponibles.add(jLabelid_productoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoExistenciasDisponibles.add(jButtonid_productoExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoExistenciasDisponibles.add(jButtonid_productoExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoExistenciasDisponibles.add(jComboBoxid_productoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaExistenciasDisponibles.add(jLabelid_empresaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaExistenciasDisponibles.add(jButtonid_empresaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaExistenciasDisponibles.add(jButtonid_empresaExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaExistenciasDisponibles.add(jComboBoxid_empresaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalExistenciasDisponibles.add(jLabelid_sucursalExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalExistenciasDisponibles.add(jButtonid_sucursalExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalExistenciasDisponibles.add(jButtonid_sucursalExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalExistenciasDisponibles.add(jComboBoxid_sucursalExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaExistenciasDisponibles.add(jLabelid_lineaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaExistenciasDisponibles.add(jButtonid_lineaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaExistenciasDisponibles.add(jButtonid_lineaExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaExistenciasDisponibles.add(jComboBoxid_lineaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoExistenciasDisponibles.add(jLabelid_linea_grupoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoExistenciasDisponibles.add(jButtonid_linea_grupoExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoExistenciasDisponibles.add(jButtonid_linea_grupoExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoExistenciasDisponibles.add(jComboBoxid_linea_grupoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaExistenciasDisponibles.add(jLabelid_linea_categoriaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaExistenciasDisponibles.add(jButtonid_linea_categoriaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaExistenciasDisponibles.add(jButtonid_linea_categoriaExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaExistenciasDisponibles.add(jComboBoxid_linea_categoriaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaExistenciasDisponibles.add(jLabelid_linea_marcaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaExistenciasDisponibles.add(jButtonid_linea_marcaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 3;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaExistenciasDisponibles.add(jButtonid_linea_marcaExistenciasDisponiblesUpdate, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaExistenciasDisponibles.add(jComboBoxid_linea_marcaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles.add(jLabelfecha_ultima_venta_hastaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles.add(jButtonfecha_ultima_venta_hastaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles.add(jDateChooserfecha_ultima_venta_hastaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoExistenciasDisponibles.add(jLabelcodigoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoExistenciasDisponibles.add(jButtoncodigoExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoExistenciasDisponibles.add(jscrollPanecodigoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadExistenciasDisponibles.add(jLabelnombre_unidadExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadExistenciasDisponibles.add(jButtonnombre_unidadExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadExistenciasDisponibles.add(jTextFieldnombre_unidadExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleExistenciasDisponibles.add(jLabelcantidad_disponibleExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleExistenciasDisponibles.add(jButtoncantidad_disponibleExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleExistenciasDisponibles.add(jTextFieldcantidad_disponibleExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_fisicaExistenciasDisponibles.add(jLabelcantidad_fisicaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_fisicaExistenciasDisponibles.add(jButtoncantidad_fisicaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_fisicaExistenciasDisponibles.add(jTextFieldcantidad_fisicaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoExistenciasDisponibles.add(jLabelcodigo_productoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoExistenciasDisponibles.add(jButtoncodigo_productoExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoExistenciasDisponibles.add(jTextFieldcodigo_productoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreExistenciasDisponibles.add(jLabelnombreExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreExistenciasDisponibles.add(jButtonnombreExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreExistenciasDisponibles.add(jscrollPanenombreExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresosExistenciasDisponibles.add(jLabelingresosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresosExistenciasDisponibles.add(jButtoningresosExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresosExistenciasDisponibles.add(jTextFieldingresosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelegresosExistenciasDisponibles.add(jLabelegresosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPanelegresosExistenciasDisponibles.add(jButtonegresosExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelegresosExistenciasDisponibles.add(jTextFieldegresosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponible_corteExistenciasDisponibles.add(jLabeldisponible_corteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponible_corteExistenciasDisponibles.add(jButtondisponible_corteExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponible_corteExistenciasDisponibles.add(jTextFielddisponible_corteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiferenciaExistenciasDisponibles.add(jLabeldiferenciaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiferenciaExistenciasDisponibles.add(jButtondiferenciaExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiferenciaExistenciasDisponibles.add(jTextFielddiferenciaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldestinoExistenciasDisponibles.add(jLabeldestinoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = 2;
		this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
		this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(0, 0, 0, 0);
		this.jPaneldestinoExistenciasDisponibles.add(jButtondestinoExistenciasDisponiblesBusqueda, this.gridBagConstraintsExistenciasDisponibles);
	}

	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
	this.gridBagConstraintsExistenciasDisponibles.gridx = 1;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldestinoExistenciasDisponibles.add(jTextFielddestinoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelidExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelid_bodegaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelid_productoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelid_lineaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelid_linea_grupoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelid_linea_categoriaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelid_linea_marcaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelfecha_ultima_venta_hastaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelcodigoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelnombre_unidadExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelcantidad_disponibleExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelcantidad_fisicaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelcodigo_productoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelnombreExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelingresosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPanelegresosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPaneldisponible_corteExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPaneldiferenciaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasDisponibles.add(this.jPaneldestinoExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposExistenciasDisponibles % 2==0) {
		iXPanelCamposExistenciasDisponibles=0;
		iYPanelCamposExistenciasDisponibles++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposOcultosExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposOcultosExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosExistenciasDisponibles.add(this.jPanelid_empresaExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposOcultosExistenciasDisponibles % 2==0) {
		iXPanelCamposOcultosExistenciasDisponibles=0;
		iYPanelCamposOcultosExistenciasDisponibles++;
	}
	this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasDisponibles.gridy = iYPanelCamposOcultosExistenciasDisponibles;
	this.gridBagConstraintsExistenciasDisponibles.gridx = iXPanelCamposOcultosExistenciasDisponibles++;
	this.gridBagConstraintsExistenciasDisponibles.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasDisponibles.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosExistenciasDisponibles.add(this.jPanelid_sucursalExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);



	if(iXPanelCamposOcultosExistenciasDisponibles % 2==0) {
		iXPanelCamposOcultosExistenciasDisponibles=0;
		iYPanelCamposOcultosExistenciasDisponibles++;
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
			
		GridBagLayout gridaBagLayoutAccionesExistenciasDisponibles= new GridBagLayout();
		this.jPanelAccionesExistenciasDisponibles.setLayout(gridaBagLayoutAccionesExistenciasDisponibles);
		
		GridBagLayout gridaBagLayoutAccionesFormularioExistenciasDisponibles= new GridBagLayout();
		this.jPanelAccionesFormularioExistenciasDisponibles.setLayout(gridaBagLayoutAccionesFormularioExistenciasDisponibles);
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioExistenciasDisponibles.add(this.jComboBoxTiposAccionesFormularioExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccion++;
			
		this.jPanelAccionesExistenciasDisponibles.add(this.jButtonModificarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);							

		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;
		this.gridBagConstraintsExistenciasDisponibles.gridx =iPosXAccion++;
			
		this.jPanelAccionesExistenciasDisponibles.add(this.jButtonEliminarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccion++;
		
		this.jPanelAccionesExistenciasDisponibles.add(this.jButtonActualizarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);


		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = iPosXAccion++;
		
		this.jPanelAccionesExistenciasDisponibles.add(this.jButtonGuardarCambiosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);	
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = 0;		
		this.gridBagConstraintsExistenciasDisponibles.gridx =iPosXAccion++;
		
		this.jPanelAccionesExistenciasDisponibles.add(this.jButtonCancelarExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutExistenciasDisponibles = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutExistenciasDisponibles);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.existenciasdisponiblesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();						
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;		
			//this.gridBagConstraintsExistenciasDisponibles.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsExistenciasDisponibles.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy =iGridyPrincipal++;
		this.gridBagConstraintsExistenciasDisponibles.gridx =0;
		this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsExistenciasDisponibles.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ExistenciasDisponiblesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleExistenciasDisponibles = new ExistenciasDisponiblesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Existencias Disponibles DATOS");
			
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
			
	        //this.setTitle("[FOR] - Existencias Disponibles DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Existencias Disponibles Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ExistenciasDisponiblesModel existenciasdisponiblesModel=new ExistenciasDisponiblesModel(this);
			
			//SI USARA CLASE INTERNA
			//ExistenciasDisponiblesModel.ExistenciasDisponiblesFocusTraversalPolicy existenciasdisponiblesFocusTraversalPolicy = existenciasdisponiblesModel.new ExistenciasDisponiblesFocusTraversalPolicy(this);
			
			//existenciasdisponiblesFocusTraversalPolicy.setexistenciasdisponiblesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(existenciasdisponiblesModel);
			
			
			this.jContentPaneDetalleExistenciasDisponibles = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleExistenciasDisponibles = new GridBagLayout();	
			this.jContentPaneDetalleExistenciasDisponibles.setLayout(gridaBagLayoutDetalleExistenciasDisponibles);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosExistenciasDisponibles = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
				this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
					
				
				this.jContentPaneDetalleExistenciasDisponibles.add(jTtoolBarDetalleExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);								
				
}
			
			this.jScrollPanelDatosEdicionExistenciasDisponibles=   new JScrollPane(jContentPaneDetalleExistenciasDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionExistenciasDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralExistenciasDisponibles=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralExistenciasDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			
			
	        this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	        
			this.jContentPaneDetalleExistenciasDisponibles.add(jPanelCamposExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);
			
			
			
			
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
						//&& existenciasdisponiblesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.existenciasdisponiblesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsExistenciasDisponibles= new GridBagConstraints();
						this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyRelaciones++;
						this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
						this.jContentPaneDetalleExistenciasDisponibles.add(this.jTabbedPaneRelacionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesExistenciasDisponibles.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosExistenciasDisponibles.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
					this.gridBagConstraintsExistenciasDisponibles.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
					
				
					this.jContentPaneDetalleExistenciasDisponibles.add(jPanelCamposOcultosExistenciasDisponibles, gridBagConstraintsExistenciasDisponibles);
				
					this.jPanelCamposOcultosExistenciasDisponibles.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	        this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleExistenciasDisponibles.add(this.jPanelAccionesFormularioExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);							
			
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
	        this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
	        
			
			this.jContentPaneDetalleExistenciasDisponibles.add(this.jPanelAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionExistenciasDisponibles);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionExistenciasDisponibles=   new JScrollPane(this.jPanelCamposExistenciasDisponibles,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionExistenciasDisponibles.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasDisponibles.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasDisponibles.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
			this.gridBagConstraintsExistenciasDisponibles.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsExistenciasDisponibles.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsExistenciasDisponibles.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);			
			
			this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
			this.gridBagConstraintsExistenciasDisponibles.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
			
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		
			
		this.gridBagConstraintsExistenciasDisponibles = new GridBagConstraints();
		this.gridBagConstraintsExistenciasDisponibles.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasDisponibles.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesExistenciasDisponibles, this.gridBagConstraintsExistenciasDisponibles);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralExistenciasDisponibles;//jContentPane;
		
		return jScrollPanelDatosEdicionExistenciasDisponibles;
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
