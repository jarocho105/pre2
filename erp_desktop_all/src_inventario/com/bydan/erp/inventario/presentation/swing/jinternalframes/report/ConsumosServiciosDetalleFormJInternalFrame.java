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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.report.ConsumosServiciosConstantesFunciones;

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
public class ConsumosServiciosDetalleFormJInternalFrame extends ConsumosServiciosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsumosServicios;
	
	protected JMenuBar jmenuBarDetalleConsumosServicios;
	
	protected JMenu jmenuDetalleConsumosServicios;
	protected JMenu jmenuDetalleArchivoConsumosServicios;
	protected JMenu jmenuDetalleAccionesConsumosServicios;
	protected JMenu jmenuDetalleDatosConsumosServicios;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsumosServicios;	
	protected GridBagConstraints gridBagConstraintsConsumosServicios;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsumosServiciosBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsumosServicios;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";
	
	public ConsumosServiciosSessionBean consumosserviciosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;	
	
	public ConsumosServiciosLogic consumosserviciosLogic;
	
	public JScrollPane jScrollPanelDatosConsumosServicios;
	public JScrollPane jScrollPanelDatosEdicionConsumosServicios;
	public JScrollPane jScrollPanelDatosGeneralConsumosServicios;
	
	protected JPanel jPanelCamposConsumosServicios;    
	protected JPanel jPanelCamposOcultosConsumosServicios;    	
	protected JPanel jPanelAccionesConsumosServicios;
	protected JPanel jPanelAccionesFormularioConsumosServicios;
    
	
	
	protected Integer iXPanelCamposConsumosServicios=0;
	protected Integer iYPanelCamposConsumosServicios=0;
	
	protected Integer iXPanelCamposOcultosConsumosServicios=0;
	protected Integer iYPanelCamposOcultosConsumosServicios=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsumosServicios;
	public JButton jButtonModificarConsumosServicios;
	public JButton jButtonActualizarConsumosServicios;
    public JButton jButtonEliminarConsumosServicios;
	public JButton jButtonCancelarConsumosServicios;
    public JButton jButtonGuardarCambiosConsumosServicios;
	public JButton jButtonGuardarCambiosTablaConsumosServicios;
	protected JButton jButtonCerrarConsumosServicios;
	
	
	protected JButton jButtonProcesarInformacionConsumosServicios;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsumosServicios;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsumosServicios;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsumosServicios;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsumosServicios;
	protected JButton jButtonModificarToolBarConsumosServicios;
	protected JButton jButtonActualizarToolBarConsumosServicios;
    protected JButton jButtonEliminarToolBarConsumosServicios;
	protected JButton jButtonCancelarToolBarConsumosServicios;
    protected JButton jButtonGuardarCambiosToolBarConsumosServicios;
	protected JButton jButtonGuardarCambiosTablaToolBarConsumosServicios;
	protected JButton jButtonMostrarOcultarTablaToolBarConsumosServicios;
	protected JButton jButtonCerrarToolBarConsumosServicios;
	
	protected JButton jButtonProcesarInformacionToolBarConsumosServicios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsumosServicios;
	protected JMenuItem jMenuItemModificarConsumosServicios;
	protected JMenuItem jMenuItemActualizarConsumosServicios;
    protected JMenuItem jMenuItemEliminarConsumosServicios;
	protected JMenuItem jMenuItemCancelarConsumosServicios;
    protected JMenuItem jMenuItemGuardarCambiosConsumosServicios;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsumosServicios;
	protected JMenuItem jMenuItemCerrarConsumosServicios;
	protected JMenuItem jMenuItemDetalleCerrarConsumosServicios;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsumosServicios;
	
	protected JMenuItem jMenuItemProcesarInformacionConsumosServicios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsumosServicios;
	protected JMenuItem jMenuItemMostrarOcultarConsumosServicios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsumosServicios;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsumosServicios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsumosServicios;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsumosServicios;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsumosServicios;
	public JLabel jLabelIdConsumosServicios;
	public JLabel jLabelidConsumosServicios;
	public JButton jButtonidConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeConsumosServicios;
	public JLabel jLabelfecha_emision_desdeConsumosServicios;
	//public JFormattedTextField jDateChooserfecha_emision_desdeConsumosServicios;

	public JDateChooser jDateChooserfecha_emision_desdeConsumosServicios;
	public JButton jButtonfecha_emision_desdeConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaConsumosServicios;
	public JLabel jLabelfecha_emision_hastaConsumosServicios;
	//public JFormattedTextField jDateChooserfecha_emision_hastaConsumosServicios;

	public JDateChooser jDateChooserfecha_emision_hastaConsumosServicios;
	public JButton jButtonfecha_emision_hastaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadConsumosServicios;
	public JLabel jLabelnombre_unidadConsumosServicios;
	public JTextField jTextFieldnombre_unidadConsumosServicios;
	public JButton jButtonnombre_unidadConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoConsumosServicios;
	public JLabel jLabelnombre_productoConsumosServicios;
	public JTextArea jTextAreanombre_productoConsumosServicios;
	public JScrollPane jscrollPanenombre_productoConsumosServicios;
	public JButton jButtonnombre_productoConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadConsumosServicios;
	public JLabel jLabelcantidadConsumosServicios;
	public JTextField jTextFieldcantidadConsumosServicios;
	public JButton jButtoncantidadConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaConsumosServicios;
	public JLabel jLabelnombre_lineaConsumosServicios;
	public JTextArea jTextAreanombre_lineaConsumosServicios;
	public JScrollPane jscrollPanenombre_lineaConsumosServicios;
	public JButton jButtonnombre_lineaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoConsumosServicios;
	public JLabel jLabelnombre_linea_grupoConsumosServicios;
	public JTextArea jTextAreanombre_linea_grupoConsumosServicios;
	public JScrollPane jscrollPanenombre_linea_grupoConsumosServicios;
	public JButton jButtonnombre_linea_grupoConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaConsumosServicios;
	public JLabel jLabelnombre_linea_categoriaConsumosServicios;
	public JTextArea jTextAreanombre_linea_categoriaConsumosServicios;
	public JScrollPane jscrollPanenombre_linea_categoriaConsumosServicios;
	public JButton jButtonnombre_linea_categoriaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaConsumosServicios;
	public JLabel jLabelnombre_linea_marcaConsumosServicios;
	public JTextArea jTextAreanombre_linea_marcaConsumosServicios;
	public JScrollPane jscrollPanenombre_linea_marcaConsumosServicios;
	public JButton jButtonnombre_linea_marcaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoConsumosServicios;
	public JLabel jLabelcodigoConsumosServicios;
	public JTextField jTextFieldcodigoConsumosServicios;
	public JButton jButtoncodigoConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPaneltotalConsumosServicios;
	public JLabel jLabeltotalConsumosServicios;
	public JTextField jTextFieldtotalConsumosServicios;
	public JButton jButtontotalConsumosServiciosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsumosServicios;
	public JLabel jLabelid_empresaConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsumosServicios;
	public JButton jButtonid_empresaConsumosServicios= new JButtonMe();
	public JButton jButtonid_empresaConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionConsumosServicios;
	public JLabel jLabelid_transaccionConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionConsumosServicios;
	public JButton jButtonid_transaccionConsumosServicios= new JButtonMe();
	public JButton jButtonid_transaccionConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaConsumosServicios;
	public JLabel jLabelid_lineaConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaConsumosServicios;
	public JButton jButtonid_lineaConsumosServicios= new JButtonMe();
	public JButton jButtonid_lineaConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_lineaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoConsumosServicios;
	public JLabel jLabelid_linea_grupoConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoConsumosServicios;
	public JButton jButtonid_linea_grupoConsumosServicios= new JButtonMe();
	public JButton jButtonid_linea_grupoConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaConsumosServicios;
	public JLabel jLabelid_linea_categoriaConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaConsumosServicios;
	public JButton jButtonid_linea_categoriaConsumosServicios= new JButtonMe();
	public JButton jButtonid_linea_categoriaConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaConsumosServicios;
	public JLabel jLabelid_linea_marcaConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaConsumosServicios;
	public JButton jButtonid_linea_marcaConsumosServicios= new JButtonMe();
	public JButton jButtonid_linea_marcaConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaConsumosServiciosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioConsumosServicios;
	public JLabel jLabelid_tipo_producto_servicioConsumosServicios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioConsumosServicios;
	public JButton jButtonid_tipo_producto_servicioConsumosServicios= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioConsumosServiciosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioConsumosServiciosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsumosServicios;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConsumosServiciosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsumosServicios=new JPanel();
				this.jPanelAccionesFormularioConsumosServicios=new JPanel();
				this.jmenuBarDetalleConsumosServicios=new JMenuBar();
				this.jTtoolBarDetalleConsumosServicios=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsumosServiciosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosServiciosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsumosServicios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConsumosServicios() {
		return this.jButtonActualizarToolBarConsumosServicios;
	}
	
	public JButton getjButtonEliminarToolBarConsumosServicios() {
		return this.jButtonEliminarToolBarConsumosServicios;
	}
	
	public JButton getjButtonCancelarToolBarConsumosServicios() {
		return this.jButtonCancelarToolBarConsumosServicios;
	}		
	
	public JButton getjButtonProcesarInformacionConsumosServicios() {
		return this.jButtonProcesarInformacionConsumosServicios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsumosServicios)	{
		this.jButtonProcesarInformacionConsumosServicios = jButtonProcesarInformacionConsumosServicios;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsumosServicios() {
		return this.jComboBoxTiposAccionesConsumosServicios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsumosServicios(
			JComboBox jComboBoxTiposRelacionesConsumosServicios) {
		this.jComboBoxTiposRelacionesConsumosServicios = jComboBoxTiposRelacionesConsumosServicios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsumosServicios(
			JComboBox jComboBoxTiposAccionesConsumosServicios) {
		this.jComboBoxTiposAccionesConsumosServicios = jComboBoxTiposAccionesConsumosServicios;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsumosServicios() {
		return this.jComboBoxTiposAccionesFormularioConsumosServicios;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsumosServicios(
			JComboBox jComboBoxTiposAccionesFormularioConsumosServicios) {
		this.jComboBoxTiposAccionesFormularioConsumosServicios = jComboBoxTiposAccionesFormularioConsumosServicios;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
		
		this.consumosserviciosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consumosserviciosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consumosserviciosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsumosServiciosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsumosServiciosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsumosServiciosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consumos Servicios MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsumosServiciosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsumosServicios= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsumosServicios=new JButtonMe();
				this.jButtonModificarToolBarConsumosServicios=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsumosServicios,this.jTtoolBarDetalleConsumosServicios,
							"actualizar","actualizar","Actualizar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsumosServicios,this.jTtoolBarDetalleConsumosServicios,
							"eliminar","eliminar","Eliminar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsumosServicios,this.jTtoolBarDetalleConsumosServicios,
							"cancelar","cancelar","Cancelar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsumosServicios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsumosServicios,this.jTtoolBarDetalleConsumosServicios,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsumosServicios=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsumosServicios=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsumosServicios=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsumosServicios=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsumosServicios=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsumosServicios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsumosServicios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsumosServicios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsumosServicios= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsumosServicios.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsumosServicios,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsumosServicios= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsumosServicios.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsumosServicios,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsumosServicios= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsumosServicios.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsumosServicios,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsumosServicios= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsumosServicios.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsumosServicios,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsumosServicios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsumosServicios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsumosServicios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsumosServicios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsumosServicios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsumosServicios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsumosServicios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsumosServicios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsumosServicios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsumosServicios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsumosServicios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsumosServicios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsumosServicios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsumosServicios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsumosServicios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsumosServicios.add(this.jMenuItemDetalleCerrarConsumosServicios);
		
		this.jmenuDetalleAccionesConsumosServicios.add(this.jMenuItemActualizarConsumosServicios);
		this.jmenuDetalleAccionesConsumosServicios.add(this.jMenuItemEliminarConsumosServicios);
		this.jmenuDetalleAccionesConsumosServicios.add(this.jMenuItemCancelarConsumosServicios);		
		
		//this.jmenuDetalleDatosConsumosServicios.add(this.jMenuItemDetalleAbrirOrderByConsumosServicios);				
		this.jmenuDetalleDatosConsumosServicios.add(this.jMenuItemDetalleMostarOcultarConsumosServicios);				
				
		//this.jmenuDetalleAccionesConsumosServicios.add(this.jMenuItemGuardarCambiosConsumosServicios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsumosServicios.add(this.jmenuDetalleArchivoConsumosServicios);		
		this.jmenuBarDetalleConsumosServicios.add(this.jmenuDetalleAccionesConsumosServicios);		
		this.jmenuBarDetalleConsumosServicios.add(this.jmenuDetalleDatosConsumosServicios);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsumosServicios);				
	}
	
	
	public void inicializarElementosCamposConsumosServicios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsumosServicios = new JLabelMe();
		jLabelIdConsumosServicios.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsumosServicios = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsumosServicios= new GridBagLayout();

		this.jPanelidConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);

		jLabelidConsumosServicios = new JLabel();
		jLabelidConsumosServicios.setText("Id");

		jLabelidConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeConsumosServicios = new JLabelMe();
		this.jLabelfecha_emision_desdeConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeConsumosServicios.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelfecha_emision_desdeConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		//jFormattedTextFieldfecha_emision_desdeConsumosServicios= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeConsumosServicios= new JDateChooser();
		jDateChooserfecha_emision_desdeConsumosServicios.setEnabled(false);
		jDateChooserfecha_emision_desdeConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeConsumosServicios.setDate(new Date());
		jDateChooserfecha_emision_desdeConsumosServicios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeConsumosServicios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaConsumosServicios = new JLabelMe();
		this.jLabelfecha_emision_hastaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaConsumosServicios.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelfecha_emision_hastaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		//jFormattedTextFieldfecha_emision_hastaConsumosServicios= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaConsumosServicios= new JDateChooser();
		jDateChooserfecha_emision_hastaConsumosServicios.setEnabled(false);
		jDateChooserfecha_emision_hastaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaConsumosServicios.setDate(new Date());
		jDateChooserfecha_emision_hastaConsumosServicios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaConsumosServicios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadConsumosServicios = new JLabelMe();
		this.jLabelnombre_unidadConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadConsumosServicios.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelnombre_unidadConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextFieldnombre_unidadConsumosServicios= new JTextFieldMe();

		jTextFieldnombre_unidadConsumosServicios.setEnabled(false);
		jTextFieldnombre_unidadConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadConsumosServiciosBusqueda.setText("U");
		this.jButtonnombre_unidadConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoConsumosServicios = new JLabelMe();
		this.jLabelnombre_productoConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoConsumosServicios.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelnombre_productoConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextAreanombre_productoConsumosServicios= new JTextAreaMe();
		jTextAreanombre_productoConsumosServicios.setEnabled(false);
		jTextAreanombre_productoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoConsumosServicios.setLineWrap(true);
		jTextAreanombre_productoConsumosServicios.setWrapStyleWord(true);
		jTextAreanombre_productoConsumosServicios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoConsumosServicios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoConsumosServicios = new JScrollPane(jTextAreanombre_productoConsumosServicios);
		jscrollPanenombre_productoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonnombre_productoConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoConsumosServiciosBusqueda.setText("U");
		this.jButtonnombre_productoConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadConsumosServicios = new JLabelMe();
		this.jLabelcantidadConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadConsumosServicios.setToolTipText("Cantad");
		this.jLabelcantidadConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelcantidadConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextFieldcantidadConsumosServicios= new JTextFieldMe();
		jTextFieldcantidadConsumosServicios.setEnabled(false);
		jTextFieldcantidadConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadConsumosServicios.setText("0");

		this.jButtoncantidadConsumosServiciosBusqueda= new JButtonMe();
		this.jButtoncantidadConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadConsumosServiciosBusqueda.setText("U");
		this.jButtoncantidadConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaConsumosServicios = new JLabelMe();
		this.jLabelnombre_lineaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaConsumosServicios.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelnombre_lineaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextAreanombre_lineaConsumosServicios= new JTextAreaMe();
		jTextAreanombre_lineaConsumosServicios.setEnabled(false);
		jTextAreanombre_lineaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaConsumosServicios.setLineWrap(true);
		jTextAreanombre_lineaConsumosServicios.setWrapStyleWord(true);
		jTextAreanombre_lineaConsumosServicios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaConsumosServicios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaConsumosServicios = new JScrollPane(jTextAreanombre_lineaConsumosServicios);
		jscrollPanenombre_lineaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonnombre_lineaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaConsumosServiciosBusqueda.setText("U");
		this.jButtonnombre_lineaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoConsumosServicios = new JLabelMe();
		this.jLabelnombre_linea_grupoConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoConsumosServicios.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelnombre_linea_grupoConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextAreanombre_linea_grupoConsumosServicios= new JTextAreaMe();
		jTextAreanombre_linea_grupoConsumosServicios.setEnabled(false);
		jTextAreanombre_linea_grupoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoConsumosServicios.setLineWrap(true);
		jTextAreanombre_linea_grupoConsumosServicios.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoConsumosServicios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoConsumosServicios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoConsumosServicios = new JScrollPane(jTextAreanombre_linea_grupoConsumosServicios);
		jscrollPanenombre_linea_grupoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setText("U");
		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaConsumosServicios = new JLabelMe();
		this.jLabelnombre_linea_categoriaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaConsumosServicios.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelnombre_linea_categoriaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextAreanombre_linea_categoriaConsumosServicios= new JTextAreaMe();
		jTextAreanombre_linea_categoriaConsumosServicios.setEnabled(false);
		jTextAreanombre_linea_categoriaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaConsumosServicios.setLineWrap(true);
		jTextAreanombre_linea_categoriaConsumosServicios.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaConsumosServicios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaConsumosServicios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaConsumosServicios = new JScrollPane(jTextAreanombre_linea_categoriaConsumosServicios);
		jscrollPanenombre_linea_categoriaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaConsumosServicios = new JLabelMe();
		this.jLabelnombre_linea_marcaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaConsumosServicios.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelnombre_linea_marcaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextAreanombre_linea_marcaConsumosServicios= new JTextAreaMe();
		jTextAreanombre_linea_marcaConsumosServicios.setEnabled(false);
		jTextAreanombre_linea_marcaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaConsumosServicios.setLineWrap(true);
		jTextAreanombre_linea_marcaConsumosServicios.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaConsumosServicios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaConsumosServicios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaConsumosServicios = new JScrollPane(jTextAreanombre_linea_marcaConsumosServicios);
		jscrollPanenombre_linea_marcaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setText("U");
		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoConsumosServicios = new JLabelMe();
		this.jLabelcodigoConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoConsumosServicios.setToolTipText("Codigo");
		this.jLabelcodigoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelcodigoConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextFieldcodigoConsumosServicios= new JTextFieldMe();

		jTextFieldcodigoConsumosServicios.setEnabled(false);
		jTextFieldcodigoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoConsumosServiciosBusqueda= new JButtonMe();
		this.jButtoncodigoConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoConsumosServiciosBusqueda.setText("U");
		this.jButtoncodigoConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoConsumosServiciosBusqueda.setVisible(false);		}


					
		this.jLabeltotalConsumosServicios = new JLabelMe();
		this.jLabeltotalConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalConsumosServicios.setToolTipText("Total");
		this.jLabeltotalConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPaneltotalConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jTextFieldtotalConsumosServicios= new JTextFieldMe();
		jTextFieldtotalConsumosServicios.setEnabled(false);
		jTextFieldtotalConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalConsumosServicios.setText("0.0");

		this.jButtontotalConsumosServiciosBusqueda= new JButtonMe();
		this.jButtontotalConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalConsumosServiciosBusqueda.setText("U");
		this.jButtontotalConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalConsumosServiciosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsumosServicios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsumosServicios = new JLabelMe();
		this.jLabelid_empresaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsumosServicios.setToolTipText("Empresa");
		this.jLabelid_empresaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_empresaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_empresaConsumosServicios= new JComboBoxMe();
		jComboBoxid_empresaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsumosServicios.setEnabled(false);

		this.jButtonid_empresaConsumosServicios= new JButtonMe();
		this.jButtonid_empresaConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsumosServicios.setText("Buscar");
		this.jButtonid_empresaConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsumosServicios"));

		this.jButtonid_empresaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_empresaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsumosServiciosBusqueda.setText("U");
		this.jButtonid_empresaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_empresaConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsumosServiciosUpdate.setText("U");
		this.jButtonid_empresaConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsumosServiciosUpdate"));



					
		this.jLabelid_transaccionConsumosServicios = new JLabelMe();
		this.jLabelid_transaccionConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionConsumosServicios.setToolTipText("Transaccion");
		this.jLabelid_transaccionConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_transaccionConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_transaccionConsumosServicios= new JComboBoxMe();
		jComboBoxid_transaccionConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionConsumosServicios= new JButtonMe();
		this.jButtonid_transaccionConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionConsumosServicios.setText("Buscar");
		this.jButtonid_transaccionConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionConsumosServicios"));

		this.jButtonid_transaccionConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_transaccionConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionConsumosServiciosBusqueda.setText("U");
		this.jButtonid_transaccionConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_transaccionConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_transaccionConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionConsumosServiciosUpdate.setText("U");
		this.jButtonid_transaccionConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionConsumosServiciosUpdate"));



					
		this.jLabelid_lineaConsumosServicios = new JLabelMe();
		this.jLabelid_lineaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaConsumosServicios.setToolTipText("Linea");
		this.jLabelid_lineaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_lineaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_lineaConsumosServicios= new JComboBoxMe();
		jComboBoxid_lineaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaConsumosServicios= new JButtonMe();
		this.jButtonid_lineaConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConsumosServicios.setText("Buscar");
		this.jButtonid_lineaConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConsumosServicios"));

		this.jButtonid_lineaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_lineaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaConsumosServiciosBusqueda.setText("U");
		this.jButtonid_lineaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_lineaConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_lineaConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaConsumosServiciosUpdate.setText("U");
		this.jButtonid_lineaConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConsumosServiciosUpdate"));



					
		this.jLabelid_linea_grupoConsumosServicios = new JLabelMe();
		this.jLabelid_linea_grupoConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoConsumosServicios.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_linea_grupoConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_linea_grupoConsumosServicios= new JComboBoxMe();
		jComboBoxid_linea_grupoConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoConsumosServicios= new JButtonMe();
		this.jButtonid_linea_grupoConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConsumosServicios.setText("Buscar");
		this.jButtonid_linea_grupoConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConsumosServicios"));

		this.jButtonid_linea_grupoConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoConsumosServiciosBusqueda.setText("U");
		this.jButtonid_linea_grupoConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoConsumosServiciosUpdate.setText("U");
		this.jButtonid_linea_grupoConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConsumosServiciosUpdate"));



					
		this.jLabelid_linea_categoriaConsumosServicios = new JLabelMe();
		this.jLabelid_linea_categoriaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaConsumosServicios.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_linea_categoriaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_linea_categoriaConsumosServicios= new JComboBoxMe();
		jComboBoxid_linea_categoriaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaConsumosServicios= new JButtonMe();
		this.jButtonid_linea_categoriaConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConsumosServicios.setText("Buscar");
		this.jButtonid_linea_categoriaConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConsumosServicios"));

		this.jButtonid_linea_categoriaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setText("U");
		this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaConsumosServiciosUpdate.setText("U");
		this.jButtonid_linea_categoriaConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConsumosServiciosUpdate"));



					
		this.jLabelid_linea_marcaConsumosServicios = new JLabelMe();
		this.jLabelid_linea_marcaConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaConsumosServicios.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_linea_marcaConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_linea_marcaConsumosServicios= new JComboBoxMe();
		jComboBoxid_linea_marcaConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaConsumosServicios= new JButtonMe();
		this.jButtonid_linea_marcaConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConsumosServicios.setText("Buscar");
		this.jButtonid_linea_marcaConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConsumosServicios"));

		this.jButtonid_linea_marcaConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaConsumosServiciosBusqueda.setText("U");
		this.jButtonid_linea_marcaConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaConsumosServiciosUpdate.setText("U");
		this.jButtonid_linea_marcaConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConsumosServiciosUpdate"));



					
		this.jLabelid_tipo_producto_servicioConsumosServicios = new JLabelMe();
		this.jLabelid_tipo_producto_servicioConsumosServicios.setText(""+ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioConsumosServicios.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioConsumosServicios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioConsumosServicios.setToolTipText(ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutConsumosServicios = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioConsumosServicios.setLayout(this.gridaBagLayoutConsumosServicios);


		jComboBoxid_tipo_producto_servicioConsumosServicios= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioConsumosServicios= new JButtonMe();
		this.jButtonid_tipo_producto_servicioConsumosServicios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioConsumosServicios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioConsumosServicios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioConsumosServicios.setText("Buscar");
		this.jButtonid_tipo_producto_servicioConsumosServicios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioConsumosServicios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioConsumosServicios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioConsumosServicios"));

		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioConsumosServiciosBusqueda"));

		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioConsumosServiciosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioConsumosServiciosUpdate"));



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
		//this.jInternalFrameDetalleConsumosServicios = new ConsumosServiciosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consumos Servicios DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsumosServicios= new GridBagLayout();
		

		
		String sToolTipConsumosServicios="";
		sToolTipConsumosServicios=ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsumosServicios+="(Inventario.ConsumosServicios)";
		}
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsumosServicios+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsumosServicios = new JButtonMe();
		this.jButtonModificarConsumosServicios = new JButtonMe();
        this.jButtonActualizarConsumosServicios = new JButtonMe();
        this.jButtonEliminarConsumosServicios = new JButtonMe();
        this.jButtonCancelarConsumosServicios = new JButtonMe();
        this.jButtonGuardarCambiosConsumosServicios = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsumosServicios = new JButtonMe();
		this.jButtonCerrarConsumosServicios = new JButtonMe();
		
		this.jScrollPanelDatosConsumosServicios = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsumosServicios = new JScrollPane();
		this.jScrollPanelDatosGeneralConsumosServicios = new JScrollPane();
				
		
		
		this.jPanelCamposConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Consumos Servicios";
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Servicioses" + this.sPath));
		} else {
			this.jScrollPanelDatosConsumosServicios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConsumosServicios.setName("jPanelCamposConsumosServicios"); 

		this.jPanelCamposOcultosConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsumosServicios.setName("jPanelCamposOcultosConsumosServicios"); 

        this.jPanelAccionesConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsumosServicios.setToolTipText("Acciones");
        this.jPanelAccionesConsumosServicios.setName("Acciones"); 

		this.jPanelAccionesFormularioConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsumosServicios.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsumosServicios.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsumosServicios.setText("Nuevo");
		this.jButtonModificarConsumosServicios.setText("Editar");
        this.jButtonActualizarConsumosServicios.setText("Actualizar");
        this.jButtonEliminarConsumosServicios.setText("Eliminar");
        this.jButtonCancelarConsumosServicios.setText("Cancelar");
        this.jButtonGuardarCambiosConsumosServicios.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsumosServicios.setText("Guardar");
		this.jButtonCerrarConsumosServicios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsumosServicios,"nuevo_button","Nuevo",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsumosServicios,"modificar_button","Editar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsumosServicios,"actualizar_button","Actualizar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsumosServicios,"eliminar_button","Eliminar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsumosServicios,"cancelar_button","Cancelar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsumosServicios,"guardarcambios_button","Guardar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsumosServicios,"guardarcambiostabla_button","Guardar",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsumosServicios,"cerrar_button","Salir",this.consumosserviciosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsumosServicios.setToolTipText("Nuevo"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsumosServicios.setToolTipText("Editar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsumosServicios.setToolTipText("Actualizar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsumosServicios.setToolTipText("Eliminar)"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsumosServicios.setToolTipText("Cancelar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsumosServicios.setToolTipText("Guardar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsumosServicios.setToolTipText("Guardar"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsumosServicios.setToolTipText("Salir"+" "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsumosServicios";
		inputMap = this.jButtonNuevoConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsumosServicios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsumosServicios"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsumosServicios";
		inputMap = this.jButtonActualizarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsumosServicios"));
		
		//ELIMINAR
		sMapKey = "EliminarConsumosServicios";
		inputMap = this.jButtonEliminarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsumosServicios"));
		
		//CANCELAR	
		sMapKey = "CancelarConsumosServicios";
		inputMap = this.jButtonCancelarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsumosServicios"));
		
		//CERRAR		
		sMapKey = "CerrarConsumosServicios";
		inputMap = this.jButtonCerrarConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsumosServicios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsumosServicios";
		inputMap = this.jButtonGuardarCambiosTablaConsumosServicios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsumosServicios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsumosServicios"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsumosServicios = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsumosServicios.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsumosServicios.setToolTipText("Nuevo ConsumosServicios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsumosServicios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsumosServicios.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsumosServicios.setToolTipText("Sin Cerrar Ventana ConsumosServicios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsumosServicios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsumosServicios.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsumosServicios.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsumosServicios.setText("Accion");
		this.jComboBoxTiposAccionesConsumosServicios.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsumosServicios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsumosServicios.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsumosServicios.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsumosServicios = new JLabelMe();
		
		this.jLabelAccionesConsumosServicios.setText("Acciones");		
		this.jLabelAccionesConsumosServicios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosServicios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosServicios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsumosServicios();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsumosServicios();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsumosServicios=new JTabbedPane();
		this.jTabbedPaneRelacionesConsumosServicios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsumosServicios,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsumosServicios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosServicios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosServicios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsumosServicios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsumosServicios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsumosServicios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsumosServicios.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsumosServicios, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsumosServicios = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsumosServicios = new GridBagLayout();
		
		this.jPanelCamposConsumosServicios.setLayout(gridaBagLayoutCamposConsumosServicios);
		this.jPanelCamposOcultosConsumosServicios.setLayout(gridaBagLayoutCamposOcultosConsumosServicios);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsumosServicios.add(jLabelIdConsumosServicios, this.gridBagConstraintsConsumosServicios);



	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsumosServicios.add(jLabelidConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsumosServicios.add(jLabelid_empresaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsumosServicios.add(jButtonid_empresaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsumosServicios.add(jButtonid_empresaConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsumosServicios.add(jComboBoxid_empresaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionConsumosServicios.add(jLabelid_transaccionConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionConsumosServicios.add(jButtonid_transaccionConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionConsumosServicios.add(jButtonid_transaccionConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionConsumosServicios.add(jComboBoxid_transaccionConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaConsumosServicios.add(jLabelid_lineaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaConsumosServicios.add(jButtonid_lineaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaConsumosServicios.add(jButtonid_lineaConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaConsumosServicios.add(jComboBoxid_lineaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoConsumosServicios.add(jLabelid_linea_grupoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoConsumosServicios.add(jButtonid_linea_grupoConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoConsumosServicios.add(jButtonid_linea_grupoConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoConsumosServicios.add(jComboBoxid_linea_grupoConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaConsumosServicios.add(jLabelid_linea_categoriaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaConsumosServicios.add(jButtonid_linea_categoriaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaConsumosServicios.add(jButtonid_linea_categoriaConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaConsumosServicios.add(jComboBoxid_linea_categoriaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaConsumosServicios.add(jLabelid_linea_marcaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaConsumosServicios.add(jButtonid_linea_marcaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaConsumosServicios.add(jButtonid_linea_marcaConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaConsumosServicios.add(jComboBoxid_linea_marcaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioConsumosServicios.add(jLabelid_tipo_producto_servicioConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioConsumosServicios.add(jButtonid_tipo_producto_servicioConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 3;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioConsumosServicios.add(jButtonid_tipo_producto_servicioConsumosServiciosUpdate, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioConsumosServicios.add(jComboBoxid_tipo_producto_servicioConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeConsumosServicios.add(jLabelfecha_emision_desdeConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeConsumosServicios.add(jButtonfecha_emision_desdeConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeConsumosServicios.add(jDateChooserfecha_emision_desdeConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaConsumosServicios.add(jLabelfecha_emision_hastaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaConsumosServicios.add(jButtonfecha_emision_hastaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaConsumosServicios.add(jDateChooserfecha_emision_hastaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadConsumosServicios.add(jLabelnombre_unidadConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadConsumosServicios.add(jButtonnombre_unidadConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadConsumosServicios.add(jTextFieldnombre_unidadConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoConsumosServicios.add(jLabelnombre_productoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoConsumosServicios.add(jButtonnombre_productoConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoConsumosServicios.add(jscrollPanenombre_productoConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadConsumosServicios.add(jLabelcantidadConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadConsumosServicios.add(jButtoncantidadConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadConsumosServicios.add(jTextFieldcantidadConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaConsumosServicios.add(jLabelnombre_lineaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaConsumosServicios.add(jButtonnombre_lineaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaConsumosServicios.add(jscrollPanenombre_lineaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoConsumosServicios.add(jLabelnombre_linea_grupoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoConsumosServicios.add(jButtonnombre_linea_grupoConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoConsumosServicios.add(jscrollPanenombre_linea_grupoConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaConsumosServicios.add(jLabelnombre_linea_categoriaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaConsumosServicios.add(jButtonnombre_linea_categoriaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaConsumosServicios.add(jscrollPanenombre_linea_categoriaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaConsumosServicios.add(jLabelnombre_linea_marcaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaConsumosServicios.add(jButtonnombre_linea_marcaConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaConsumosServicios.add(jscrollPanenombre_linea_marcaConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoConsumosServicios.add(jLabelcodigoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoConsumosServicios.add(jButtoncodigoConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoConsumosServicios.add(jTextFieldcodigoConsumosServicios, this.gridBagConstraintsConsumosServicios);


	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 0;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalConsumosServicios.add(jLabeltotalConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		//this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = 2;
		this.gridBagConstraintsConsumosServicios.ipadx = 0;
		this.gridBagConstraintsConsumosServicios.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalConsumosServicios.add(jButtontotalConsumosServiciosBusqueda, this.gridBagConstraintsConsumosServicios);
	}

	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosServicios.gridy = 0;
	this.gridBagConstraintsConsumosServicios.gridx = 1;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalConsumosServicios.add(jTextFieldtotalConsumosServicios, this.gridBagConstraintsConsumosServicios);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelidConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelid_transaccionConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelid_lineaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelid_linea_grupoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelid_linea_categoriaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelid_linea_marcaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelid_tipo_producto_servicioConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelfecha_emision_desdeConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelfecha_emision_hastaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelnombre_unidadConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelnombre_productoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelcantidadConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelnombre_lineaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelnombre_linea_grupoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelnombre_linea_categoriaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelnombre_linea_marcaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPanelcodigoConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosServicios.add(this.jPaneltotalConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposConsumosServicios % 2==0) {
		iXPanelCamposConsumosServicios=0;
		iYPanelCamposConsumosServicios++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosServicios.gridy = iYPanelCamposOcultosConsumosServicios;
	this.gridBagConstraintsConsumosServicios.gridx = iXPanelCamposOcultosConsumosServicios++;
	this.gridBagConstraintsConsumosServicios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosServicios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsumosServicios.add(this.jPanelid_empresaConsumosServicios, this.gridBagConstraintsConsumosServicios);



	if(iXPanelCamposOcultosConsumosServicios % 2==0) {
		iXPanelCamposOcultosConsumosServicios=0;
		iYPanelCamposOcultosConsumosServicios++;
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
			
		GridBagLayout gridaBagLayoutAccionesConsumosServicios= new GridBagLayout();
		this.jPanelAccionesConsumosServicios.setLayout(gridaBagLayoutAccionesConsumosServicios);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsumosServicios= new GridBagLayout();
		this.jPanelAccionesFormularioConsumosServicios.setLayout(gridaBagLayoutAccionesFormularioConsumosServicios);
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsumosServicios.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsumosServicios.add(this.jComboBoxTiposAccionesFormularioConsumosServicios, this.gridBagConstraintsConsumosServicios);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsumosServicios.add(this.jButtonModificarConsumosServicios, this.gridBagConstraintsConsumosServicios);							

		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosServicios.gridy = 0;
		this.gridBagConstraintsConsumosServicios.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsumosServicios.add(this.jButtonEliminarConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = 0;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsumosServicios.add(this.jButtonActualizarConsumosServicios, this.gridBagConstraintsConsumosServicios);


		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = 0;		
		this.gridBagConstraintsConsumosServicios.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsumosServicios.add(this.jButtonGuardarCambiosConsumosServicios, this.gridBagConstraintsConsumosServicios);	
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = 0;		
		this.gridBagConstraintsConsumosServicios.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsumosServicios.add(this.jButtonCancelarConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsumosServicios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsumosServicios);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();						
			this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsumosServicios.gridx = 0;		
			//this.gridBagConstraintsConsumosServicios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsumosServicios.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsumosServicios.gridx =0;
		this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsumosServicios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsumosServicios, this.gridBagConstraintsConsumosServicios);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsumosServicios = new ConsumosServiciosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consumos Servicios DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consumos Servicios DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consumos Servicios Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsumosServiciosModel consumosserviciosModel=new ConsumosServiciosModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsumosServiciosModel.ConsumosServiciosFocusTraversalPolicy consumosserviciosFocusTraversalPolicy = consumosserviciosModel.new ConsumosServiciosFocusTraversalPolicy(this);
			
			//consumosserviciosFocusTraversalPolicy.setconsumosserviciosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consumosserviciosModel);
			
			
			this.jContentPaneDetalleConsumosServicios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsumosServicios = new GridBagLayout();	
			this.jContentPaneDetalleConsumosServicios.setLayout(gridaBagLayoutDetalleConsumosServicios);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsumosServicios = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
				this.gridBagConstraintsConsumosServicios.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsumosServicios.gridx = 0;
					
				
				this.jContentPaneDetalleConsumosServicios.add(jTtoolBarDetalleConsumosServicios, gridBagConstraintsConsumosServicios);								
				
}
			
			this.jScrollPanelDatosEdicionConsumosServicios=   new JScrollPane(jContentPaneDetalleConsumosServicios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsumosServicios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosServicios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosServicios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsumosServicios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsumosServicios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosServicios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosServicios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConsumosServicios.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsumosServicios.gridx = 0;
	        
			this.jContentPaneDetalleConsumosServicios.add(jPanelCamposConsumosServicios, gridBagConstraintsConsumosServicios);
			
			
			
			
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
						//&& consumosserviciosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsumosServicios= new GridBagConstraints();
						this.gridBagConstraintsConsumosServicios.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsumosServicios.gridx = 0;
						this.jContentPaneDetalleConsumosServicios.add(this.jTabbedPaneRelacionesConsumosServicios, this.gridBagConstraintsConsumosServicios);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsumosServicios.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsumosServicios.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
					this.gridBagConstraintsConsumosServicios.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsumosServicios.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsumosServicios.gridx = 0;
					
				
					this.jContentPaneDetalleConsumosServicios.add(jPanelCamposOcultosConsumosServicios, gridBagConstraintsConsumosServicios);
				
					this.jPanelCamposOcultosConsumosServicios.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConsumosServicios.gridx = 0;
	        this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsumosServicios.add(this.jPanelAccionesFormularioConsumosServicios, this.gridBagConstraintsConsumosServicios);							
			
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
	        this.gridBagConstraintsConsumosServicios.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConsumosServicios.gridx = 0;
	        
			
			this.jContentPaneDetalleConsumosServicios.add(this.jPanelAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsumosServicios);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsumosServicios=   new JScrollPane(this.jPanelCamposConsumosServicios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsumosServicios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosServicios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosServicios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsumosServicios.gridx = 0;
			this.gridBagConstraintsConsumosServicios.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsumosServicios.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsumosServicios.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsumosServicios, this.gridBagConstraintsConsumosServicios);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsumosServicios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsumosServicios, this.gridBagConstraintsConsumosServicios);			
			
			this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
			this.gridBagConstraintsConsumosServicios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsumosServicios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsumosServicios, this.gridBagConstraintsConsumosServicios);
			
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsumosServicios, this.gridBagConstraintsConsumosServicios);
		
			
		this.gridBagConstraintsConsumosServicios = new GridBagConstraints();
		this.gridBagConstraintsConsumosServicios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsumosServicios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsumosServicios, this.gridBagConstraintsConsumosServicios);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsumosServicios;//jContentPane;
		
		return jScrollPanelDatosEdicionConsumosServicios;
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
