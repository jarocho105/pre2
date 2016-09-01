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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.VentaPorLineaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class VentaPorLineaDetalleFormJInternalFrame extends VentaPorLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentaPorLinea;
	
	protected JMenuBar jmenuBarDetalleVentaPorLinea;
	
	protected JMenu jmenuDetalleVentaPorLinea;
	protected JMenu jmenuDetalleArchivoVentaPorLinea;
	protected JMenu jmenuDetalleAccionesVentaPorLinea;
	protected JMenu jmenuDetalleDatosVentaPorLinea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentaPorLinea;	
	protected GridBagConstraints gridBagConstraintsVentaPorLinea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentaPorLineaBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentaPorLinea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public VentaPorLineaSessionBean ventaporlineaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public VentaPorLineaLogic ventaporlineaLogic;
	
	public JScrollPane jScrollPanelDatosVentaPorLinea;
	public JScrollPane jScrollPanelDatosEdicionVentaPorLinea;
	public JScrollPane jScrollPanelDatosGeneralVentaPorLinea;
	
	protected JPanel jPanelCamposVentaPorLinea;    
	protected JPanel jPanelCamposOcultosVentaPorLinea;    	
	protected JPanel jPanelAccionesVentaPorLinea;
	protected JPanel jPanelAccionesFormularioVentaPorLinea;
    
	
	
	protected Integer iXPanelCamposVentaPorLinea=0;
	protected Integer iYPanelCamposVentaPorLinea=0;
	
	protected Integer iXPanelCamposOcultosVentaPorLinea=0;
	protected Integer iYPanelCamposOcultosVentaPorLinea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentaPorLinea;
	public JButton jButtonModificarVentaPorLinea;
	public JButton jButtonActualizarVentaPorLinea;
    public JButton jButtonEliminarVentaPorLinea;
	public JButton jButtonCancelarVentaPorLinea;
    public JButton jButtonGuardarCambiosVentaPorLinea;
	public JButton jButtonGuardarCambiosTablaVentaPorLinea;
	protected JButton jButtonCerrarVentaPorLinea;
	
	
	protected JButton jButtonProcesarInformacionVentaPorLinea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentaPorLinea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentaPorLinea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentaPorLinea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentaPorLinea;
	protected JButton jButtonModificarToolBarVentaPorLinea;
	protected JButton jButtonActualizarToolBarVentaPorLinea;
    protected JButton jButtonEliminarToolBarVentaPorLinea;
	protected JButton jButtonCancelarToolBarVentaPorLinea;
    protected JButton jButtonGuardarCambiosToolBarVentaPorLinea;
	protected JButton jButtonGuardarCambiosTablaToolBarVentaPorLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarVentaPorLinea;
	protected JButton jButtonCerrarToolBarVentaPorLinea;
	
	protected JButton jButtonProcesarInformacionToolBarVentaPorLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentaPorLinea;
	protected JMenuItem jMenuItemModificarVentaPorLinea;
	protected JMenuItem jMenuItemActualizarVentaPorLinea;
    protected JMenuItem jMenuItemEliminarVentaPorLinea;
	protected JMenuItem jMenuItemCancelarVentaPorLinea;
    protected JMenuItem jMenuItemGuardarCambiosVentaPorLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentaPorLinea;
	protected JMenuItem jMenuItemCerrarVentaPorLinea;
	protected JMenuItem jMenuItemDetalleCerrarVentaPorLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentaPorLinea;
	
	protected JMenuItem jMenuItemProcesarInformacionVentaPorLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentaPorLinea;
	protected JMenuItem jMenuItemMostrarOcultarVentaPorLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentaPorLinea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentaPorLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentaPorLinea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentaPorLinea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentaPorLinea;
	public JLabel jLabelIdVentaPorLinea;
	public JLabel jLabelidVentaPorLinea;
	public JButton jButtonidVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeVentaPorLinea;
	public JLabel jLabelfecha_desdeVentaPorLinea;
	//public JFormattedTextField jDateChooserfecha_desdeVentaPorLinea;

	public JDateChooser jDateChooserfecha_desdeVentaPorLinea;
	public JButton jButtonfecha_desdeVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaVentaPorLinea;
	public JLabel jLabelfecha_hastaVentaPorLinea;
	//public JFormattedTextField jDateChooserfecha_hastaVentaPorLinea;

	public JDateChooser jDateChooserfecha_hastaVentaPorLinea;
	public JButton jButtonfecha_hastaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoVentaPorLinea;
	public JLabel jLabelnombre_productoVentaPorLinea;
	public JTextArea jTextAreanombre_productoVentaPorLinea;
	public JScrollPane jscrollPanenombre_productoVentaPorLinea;
	public JButton jButtonnombre_productoVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaVentaPorLinea;
	public JLabel jLabelnombre_lineaVentaPorLinea;
	public JTextArea jTextAreanombre_lineaVentaPorLinea;
	public JScrollPane jscrollPanenombre_lineaVentaPorLinea;
	public JButton jButtonnombre_lineaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupoVentaPorLinea;
	public JLabel jLabelnombre_grupoVentaPorLinea;
	public JTextArea jTextAreanombre_grupoVentaPorLinea;
	public JScrollPane jscrollPanenombre_grupoVentaPorLinea;
	public JButton jButtonnombre_grupoVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_categoriaVentaPorLinea;
	public JLabel jLabelnombre_categoriaVentaPorLinea;
	public JTextArea jTextAreanombre_categoriaVentaPorLinea;
	public JScrollPane jscrollPanenombre_categoriaVentaPorLinea;
	public JButton jButtonnombre_categoriaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_marcaVentaPorLinea;
	public JLabel jLabelnombre_marcaVentaPorLinea;
	public JTextArea jTextAreanombre_marcaVentaPorLinea;
	public JScrollPane jscrollPanenombre_marcaVentaPorLinea;
	public JButton jButtonnombre_marcaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelfechaVentaPorLinea;
	public JLabel jLabelfechaVentaPorLinea;
	//public JFormattedTextField jDateChooserfechaVentaPorLinea;

	public JDateChooser jDateChooserfechaVentaPorLinea;
	public JButton jButtonfechaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialVentaPorLinea;
	public JLabel jLabelsecuencialVentaPorLinea;
	public JTextField jTextFieldsecuencialVentaPorLinea;
	public JButton jButtonsecuencialVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadVentaPorLinea;
	public JLabel jLabelcantidadVentaPorLinea;
	public JTextField jTextFieldcantidadVentaPorLinea;
	public JButton jButtoncantidadVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelprecioVentaPorLinea;
	public JLabel jLabelprecioVentaPorLinea;
	public JTextField jTextFieldprecioVentaPorLinea;
	public JButton jButtonprecioVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoVentaPorLinea;
	public JLabel jLabeldescuentoVentaPorLinea;
	public JTextField jTextFielddescuentoVentaPorLinea;
	public JButton jButtondescuentoVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelivaVentaPorLinea;
	public JLabel jLabelivaVentaPorLinea;
	public JTextField jTextFieldivaVentaPorLinea;
	public JButton jButtonivaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPaneliceVentaPorLinea;
	public JLabel jLabeliceVentaPorLinea;
	public JTextField jTextFieldiceVentaPorLinea;
	public JButton jButtoniceVentaPorLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentaPorLinea;
	public JLabel jLabelid_empresaVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentaPorLinea;
	public JButton jButtonid_empresaVentaPorLinea= new JButtonMe();
	public JButton jButtonid_empresaVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVentaPorLinea;
	public JLabel jLabelid_sucursalVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVentaPorLinea;
	public JButton jButtonid_sucursalVentaPorLinea= new JButtonMe();
	public JButton jButtonid_sucursalVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoVentaPorLinea;
	public JLabel jLabelid_productoVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoVentaPorLinea;
	public JButton jButtonid_productoVentaPorLinea= new JButtonMe();
	public JButton jButtonid_productoVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_productoVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaVentaPorLinea;
	public JLabel jLabelid_lineaVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaVentaPorLinea;
	public JButton jButtonid_lineaVentaPorLinea= new JButtonMe();
	public JButton jButtonid_lineaVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_lineaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoVentaPorLinea;
	public JLabel jLabelid_linea_grupoVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoVentaPorLinea;
	public JButton jButtonid_linea_grupoVentaPorLinea= new JButtonMe();
	public JButton jButtonid_linea_grupoVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaVentaPorLinea;
	public JLabel jLabelid_linea_categoriaVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaVentaPorLinea;
	public JButton jButtonid_linea_categoriaVentaPorLinea= new JButtonMe();
	public JButton jButtonid_linea_categoriaVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaVentaPorLineaBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaVentaPorLinea;
	public JLabel jLabelid_linea_marcaVentaPorLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaVentaPorLinea;
	public JButton jButtonid_linea_marcaVentaPorLinea= new JButtonMe();
	public JButton jButtonid_linea_marcaVentaPorLineaUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaVentaPorLineaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentaPorLinea;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentaPorLineaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentaPorLinea=new JPanel();
				this.jPanelAccionesFormularioVentaPorLinea=new JPanel();
				this.jmenuBarDetalleVentaPorLinea=new JMenuBar();
				this.jTtoolBarDetalleVentaPorLinea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentaPorLineaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentaPorLinea() {
		return this.jButtonActualizarToolBarVentaPorLinea;
	}
	
	public JButton getjButtonEliminarToolBarVentaPorLinea() {
		return this.jButtonEliminarToolBarVentaPorLinea;
	}
	
	public JButton getjButtonCancelarToolBarVentaPorLinea() {
		return this.jButtonCancelarToolBarVentaPorLinea;
	}		
	
	public JButton getjButtonProcesarInformacionVentaPorLinea() {
		return this.jButtonProcesarInformacionVentaPorLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentaPorLinea)	{
		this.jButtonProcesarInformacionVentaPorLinea = jButtonProcesarInformacionVentaPorLinea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentaPorLinea() {
		return this.jComboBoxTiposAccionesVentaPorLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentaPorLinea(
			JComboBox jComboBoxTiposRelacionesVentaPorLinea) {
		this.jComboBoxTiposRelacionesVentaPorLinea = jComboBoxTiposRelacionesVentaPorLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentaPorLinea(
			JComboBox jComboBoxTiposAccionesVentaPorLinea) {
		this.jComboBoxTiposAccionesVentaPorLinea = jComboBoxTiposAccionesVentaPorLinea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentaPorLinea() {
		return this.jComboBoxTiposAccionesFormularioVentaPorLinea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentaPorLinea(
			JComboBox jComboBoxTiposAccionesFormularioVentaPorLinea) {
		this.jComboBoxTiposAccionesFormularioVentaPorLinea = jComboBoxTiposAccionesFormularioVentaPorLinea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
		
		this.ventaporlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventaporlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventaporlineaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentaPorLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentaPorLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentaPorLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Venta Por Linea MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
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
	
		VentaPorLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentaPorLinea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentaPorLinea=new JButtonMe();
				this.jButtonModificarToolBarVentaPorLinea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentaPorLinea,this.jTtoolBarDetalleVentaPorLinea,
							"actualizar","actualizar","Actualizar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentaPorLinea,this.jTtoolBarDetalleVentaPorLinea,
							"eliminar","eliminar","Eliminar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentaPorLinea,this.jTtoolBarDetalleVentaPorLinea,
							"cancelar","cancelar","Cancelar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentaPorLinea,this.jTtoolBarDetalleVentaPorLinea,
							"guardarcambios","guardarcambios","Guardar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentaPorLinea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentaPorLinea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentaPorLinea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentaPorLinea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentaPorLinea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentaPorLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentaPorLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentaPorLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentaPorLinea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentaPorLinea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentaPorLinea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentaPorLinea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentaPorLinea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentaPorLinea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentaPorLinea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentaPorLinea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentaPorLinea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentaPorLinea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentaPorLinea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentaPorLinea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentaPorLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentaPorLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentaPorLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentaPorLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentaPorLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentaPorLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentaPorLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentaPorLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentaPorLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentaPorLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentaPorLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentaPorLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentaPorLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentaPorLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentaPorLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentaPorLinea.add(this.jMenuItemDetalleCerrarVentaPorLinea);
		
		this.jmenuDetalleAccionesVentaPorLinea.add(this.jMenuItemActualizarVentaPorLinea);
		this.jmenuDetalleAccionesVentaPorLinea.add(this.jMenuItemEliminarVentaPorLinea);
		this.jmenuDetalleAccionesVentaPorLinea.add(this.jMenuItemCancelarVentaPorLinea);		
		
		//this.jmenuDetalleDatosVentaPorLinea.add(this.jMenuItemDetalleAbrirOrderByVentaPorLinea);				
		this.jmenuDetalleDatosVentaPorLinea.add(this.jMenuItemDetalleMostarOcultarVentaPorLinea);				
				
		//this.jmenuDetalleAccionesVentaPorLinea.add(this.jMenuItemGuardarCambiosVentaPorLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentaPorLinea.add(this.jmenuDetalleArchivoVentaPorLinea);		
		this.jmenuBarDetalleVentaPorLinea.add(this.jmenuDetalleAccionesVentaPorLinea);		
		this.jmenuBarDetalleVentaPorLinea.add(this.jmenuDetalleDatosVentaPorLinea);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentaPorLinea);				
	}
	
	
	public void inicializarElementosCamposVentaPorLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentaPorLinea = new JLabelMe();
		jLabelIdVentaPorLinea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentaPorLinea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentaPorLinea= new GridBagLayout();

		this.jPanelidVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);

		jLabelidVentaPorLinea = new JLabel();
		jLabelidVentaPorLinea.setText("Id");

		jLabelidVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeVentaPorLinea = new JLabelMe();
		this.jLabelfecha_desdeVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeVentaPorLinea.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelfecha_desdeVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		//jFormattedTextFieldfecha_desdeVentaPorLinea= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeVentaPorLinea= new JDateChooser();
		jDateChooserfecha_desdeVentaPorLinea.setEnabled(false);
		jDateChooserfecha_desdeVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeVentaPorLinea.setDate(new Date());
		jDateChooserfecha_desdeVentaPorLinea.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeVentaPorLinea.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonfecha_desdeVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeVentaPorLineaBusqueda.setText("U");
		this.jButtonfecha_desdeVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaVentaPorLinea = new JLabelMe();
		this.jLabelfecha_hastaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaVentaPorLinea.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelfecha_hastaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		//jFormattedTextFieldfecha_hastaVentaPorLinea= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaVentaPorLinea= new JDateChooser();
		jDateChooserfecha_hastaVentaPorLinea.setEnabled(false);
		jDateChooserfecha_hastaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaVentaPorLinea.setDate(new Date());
		jDateChooserfecha_hastaVentaPorLinea.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaVentaPorLinea.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonfecha_hastaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaVentaPorLineaBusqueda.setText("U");
		this.jButtonfecha_hastaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoVentaPorLinea = new JLabelMe();
		this.jLabelnombre_productoVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoVentaPorLinea.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelnombre_productoVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextAreanombre_productoVentaPorLinea= new JTextAreaMe();
		jTextAreanombre_productoVentaPorLinea.setEnabled(false);
		jTextAreanombre_productoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoVentaPorLinea.setLineWrap(true);
		jTextAreanombre_productoVentaPorLinea.setWrapStyleWord(true);
		jTextAreanombre_productoVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoVentaPorLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoVentaPorLinea = new JScrollPane(jTextAreanombre_productoVentaPorLinea);
		jscrollPanenombre_productoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonnombre_productoVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoVentaPorLineaBusqueda.setText("U");
		this.jButtonnombre_productoVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaVentaPorLinea = new JLabelMe();
		this.jLabelnombre_lineaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaVentaPorLinea.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelnombre_lineaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextAreanombre_lineaVentaPorLinea= new JTextAreaMe();
		jTextAreanombre_lineaVentaPorLinea.setEnabled(false);
		jTextAreanombre_lineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaVentaPorLinea.setLineWrap(true);
		jTextAreanombre_lineaVentaPorLinea.setWrapStyleWord(true);
		jTextAreanombre_lineaVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaVentaPorLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaVentaPorLinea = new JScrollPane(jTextAreanombre_lineaVentaPorLinea);
		jscrollPanenombre_lineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonnombre_lineaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaVentaPorLineaBusqueda.setText("U");
		this.jButtonnombre_lineaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupoVentaPorLinea = new JLabelMe();
		this.jLabelnombre_grupoVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO+" : *");
		this.jLabelnombre_grupoVentaPorLinea.setToolTipText("Nombre Grupo");
		this.jLabelnombre_grupoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_grupoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_grupoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupoVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupoVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelnombre_grupoVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextAreanombre_grupoVentaPorLinea= new JTextAreaMe();
		jTextAreanombre_grupoVentaPorLinea.setEnabled(false);
		jTextAreanombre_grupoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupoVentaPorLinea.setLineWrap(true);
		jTextAreanombre_grupoVentaPorLinea.setWrapStyleWord(true);
		jTextAreanombre_grupoVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupoVentaPorLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupoVentaPorLinea = new JScrollPane(jTextAreanombre_grupoVentaPorLinea);
		jscrollPanenombre_grupoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupoVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonnombre_grupoVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupoVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupoVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupoVentaPorLineaBusqueda.setText("U");
		this.jButtonnombre_grupoVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupoVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupoVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupoVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupoVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_categoriaVentaPorLinea = new JLabelMe();
		this.jLabelnombre_categoriaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA+" : *");
		this.jLabelnombre_categoriaVentaPorLinea.setToolTipText("Nombre Categoria");
		this.jLabelnombre_categoriaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_categoriaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_categoriaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_categoriaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_categoriaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_categoriaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelnombre_categoriaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextAreanombre_categoriaVentaPorLinea= new JTextAreaMe();
		jTextAreanombre_categoriaVentaPorLinea.setEnabled(false);
		jTextAreanombre_categoriaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_categoriaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_categoriaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_categoriaVentaPorLinea.setLineWrap(true);
		jTextAreanombre_categoriaVentaPorLinea.setWrapStyleWord(true);
		jTextAreanombre_categoriaVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_categoriaVentaPorLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_categoriaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_categoriaVentaPorLinea = new JScrollPane(jTextAreanombre_categoriaVentaPorLinea);
		jscrollPanenombre_categoriaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_categoriaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_categoriaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_categoriaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonnombre_categoriaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_categoriaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_categoriaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_categoriaVentaPorLineaBusqueda.setText("U");
		this.jButtonnombre_categoriaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_categoriaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_categoriaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_categoriaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_categoriaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_categoriaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_categoriaVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_marcaVentaPorLinea = new JLabelMe();
		this.jLabelnombre_marcaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA+" : *");
		this.jLabelnombre_marcaVentaPorLinea.setToolTipText("Nombre Marca");
		this.jLabelnombre_marcaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_marcaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_marcaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_marcaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_marcaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_marcaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelnombre_marcaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextAreanombre_marcaVentaPorLinea= new JTextAreaMe();
		jTextAreanombre_marcaVentaPorLinea.setEnabled(false);
		jTextAreanombre_marcaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_marcaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_marcaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_marcaVentaPorLinea.setLineWrap(true);
		jTextAreanombre_marcaVentaPorLinea.setWrapStyleWord(true);
		jTextAreanombre_marcaVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_marcaVentaPorLinea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_marcaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_marcaVentaPorLinea = new JScrollPane(jTextAreanombre_marcaVentaPorLinea);
		jscrollPanenombre_marcaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_marcaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_marcaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_marcaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonnombre_marcaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_marcaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_marcaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_marcaVentaPorLineaBusqueda.setText("U");
		this.jButtonnombre_marcaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_marcaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_marcaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_marcaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_marcaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_marcaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_marcaVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelfechaVentaPorLinea = new JLabelMe();
		this.jLabelfechaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaVentaPorLinea.setToolTipText("Fecha");
		this.jLabelfechaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelfechaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		//jFormattedTextFieldfechaVentaPorLinea= new JFormattedTextFieldMe();

		jDateChooserfechaVentaPorLinea= new JDateChooser();
		jDateChooserfechaVentaPorLinea.setEnabled(false);
		jDateChooserfechaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaVentaPorLinea.setDate(new Date());
		jDateChooserfechaVentaPorLinea.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaVentaPorLinea.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonfechaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaVentaPorLineaBusqueda.setText("U");
		this.jButtonfechaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialVentaPorLinea = new JLabelMe();
		this.jLabelsecuencialVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialVentaPorLinea.setToolTipText("Secuencial");
		this.jLabelsecuencialVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelsecuencialVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextFieldsecuencialVentaPorLinea= new JTextFieldMe();

		jTextFieldsecuencialVentaPorLinea.setEnabled(false);
		jTextFieldsecuencialVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonsecuencialVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialVentaPorLineaBusqueda.setText("U");
		this.jButtonsecuencialVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadVentaPorLinea = new JLabelMe();
		this.jLabelcantidadVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadVentaPorLinea.setToolTipText("Cantad");
		this.jLabelcantidadVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelcantidadVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextFieldcantidadVentaPorLinea= new JTextFieldMe();
		jTextFieldcantidadVentaPorLinea.setEnabled(false);
		jTextFieldcantidadVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadVentaPorLinea.setText("0.0");

		this.jButtoncantidadVentaPorLineaBusqueda= new JButtonMe();
		this.jButtoncantidadVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadVentaPorLineaBusqueda.setText("U");
		this.jButtoncantidadVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelprecioVentaPorLinea = new JLabelMe();
		this.jLabelprecioVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioVentaPorLinea.setToolTipText("Precio");
		this.jLabelprecioVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelprecioVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextFieldprecioVentaPorLinea= new JTextFieldMe();
		jTextFieldprecioVentaPorLinea.setEnabled(false);
		jTextFieldprecioVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioVentaPorLinea.setText("0.0");

		this.jButtonprecioVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonprecioVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioVentaPorLineaBusqueda.setText("U");
		this.jButtonprecioVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoVentaPorLinea = new JLabelMe();
		this.jLabeldescuentoVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoVentaPorLinea.setToolTipText("Descuento");
		this.jLabeldescuentoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPaneldescuentoVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextFielddescuentoVentaPorLinea= new JTextFieldMe();
		jTextFielddescuentoVentaPorLinea.setEnabled(false);
		jTextFielddescuentoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoVentaPorLinea.setText("0.0");

		this.jButtondescuentoVentaPorLineaBusqueda= new JButtonMe();
		this.jButtondescuentoVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoVentaPorLineaBusqueda.setText("U");
		this.jButtondescuentoVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabelivaVentaPorLinea = new JLabelMe();
		this.jLabelivaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaVentaPorLinea.setToolTipText("Iva");
		this.jLabelivaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelivaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextFieldivaVentaPorLinea= new JTextFieldMe();
		jTextFieldivaVentaPorLinea.setEnabled(false);
		jTextFieldivaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaVentaPorLinea.setText("0.0");

		this.jButtonivaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonivaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaVentaPorLineaBusqueda.setText("U");
		this.jButtonivaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaVentaPorLineaBusqueda.setVisible(false);		}


					
		this.jLabeliceVentaPorLinea = new JLabelMe();
		this.jLabeliceVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceVentaPorLinea.setToolTipText("Ice");
		this.jLabeliceVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPaneliceVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jTextFieldiceVentaPorLinea= new JTextFieldMe();
		jTextFieldiceVentaPorLinea.setEnabled(false);
		jTextFieldiceVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceVentaPorLinea.setText("0.0");

		this.jButtoniceVentaPorLineaBusqueda= new JButtonMe();
		this.jButtoniceVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceVentaPorLineaBusqueda.setText("U");
		this.jButtoniceVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceVentaPorLineaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentaPorLinea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentaPorLinea = new JLabelMe();
		this.jLabelid_empresaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentaPorLinea.setToolTipText("Empresa");
		this.jLabelid_empresaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_empresaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_empresaVentaPorLinea= new JComboBoxMe();
		jComboBoxid_empresaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentaPorLinea.setEnabled(false);

		this.jButtonid_empresaVentaPorLinea= new JButtonMe();
		this.jButtonid_empresaVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentaPorLinea.setText("Buscar");
		this.jButtonid_empresaVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentaPorLinea"));

		this.jButtonid_empresaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_empresaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentaPorLineaBusqueda.setText("U");
		this.jButtonid_empresaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_empresaVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentaPorLineaUpdate.setText("U");
		this.jButtonid_empresaVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentaPorLineaUpdate"));



					
		this.jLabelid_sucursalVentaPorLinea = new JLabelMe();
		this.jLabelid_sucursalVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVentaPorLinea.setToolTipText("Sucursal");
		this.jLabelid_sucursalVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_sucursalVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_sucursalVentaPorLinea= new JComboBoxMe();
		jComboBoxid_sucursalVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVentaPorLinea.setEnabled(false);

		this.jButtonid_sucursalVentaPorLinea= new JButtonMe();
		this.jButtonid_sucursalVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentaPorLinea.setText("Buscar");
		this.jButtonid_sucursalVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentaPorLinea"));

		this.jButtonid_sucursalVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_sucursalVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentaPorLineaBusqueda.setText("U");
		this.jButtonid_sucursalVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_sucursalVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentaPorLineaUpdate.setText("U");
		this.jButtonid_sucursalVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentaPorLineaUpdate"));



					
		this.jLabelid_productoVentaPorLinea = new JLabelMe();
		this.jLabelid_productoVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoVentaPorLinea.setToolTipText("Producto");
		this.jLabelid_productoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_productoVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_productoVentaPorLinea= new JComboBoxMe();
		jComboBoxid_productoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoVentaPorLinea= new JButtonMe();
		this.jButtonid_productoVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoVentaPorLinea.setText("Buscar");
		this.jButtonid_productoVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoVentaPorLinea"));

		this.jButtonid_productoVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_productoVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoVentaPorLineaBusqueda.setText("U");
		this.jButtonid_productoVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_productoVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_productoVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoVentaPorLineaUpdate.setText("U");
		this.jButtonid_productoVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoVentaPorLineaUpdate"));



					
		this.jLabelid_lineaVentaPorLinea = new JLabelMe();
		this.jLabelid_lineaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaVentaPorLinea.setToolTipText("Linea");
		this.jLabelid_lineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_lineaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_lineaVentaPorLinea= new JComboBoxMe();
		jComboBoxid_lineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_lineaVentaPorLinea.setEnabled(false);

		this.jButtonid_lineaVentaPorLinea= new JButtonMe();
		this.jButtonid_lineaVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaVentaPorLinea.setText("Buscar");
		this.jButtonid_lineaVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaVentaPorLinea"));

		this.jButtonid_lineaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_lineaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaVentaPorLineaBusqueda.setText("U");
		this.jButtonid_lineaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_lineaVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_lineaVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaVentaPorLineaUpdate.setText("U");
		this.jButtonid_lineaVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaVentaPorLineaUpdate"));



					
		this.jLabelid_linea_grupoVentaPorLinea = new JLabelMe();
		this.jLabelid_linea_grupoVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoVentaPorLinea.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_linea_grupoVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_linea_grupoVentaPorLinea= new JComboBoxMe();
		jComboBoxid_linea_grupoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_linea_grupoVentaPorLinea.setEnabled(false);

		this.jButtonid_linea_grupoVentaPorLinea= new JButtonMe();
		this.jButtonid_linea_grupoVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoVentaPorLinea.setText("Buscar");
		this.jButtonid_linea_grupoVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoVentaPorLinea"));

		this.jButtonid_linea_grupoVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoVentaPorLineaBusqueda.setText("U");
		this.jButtonid_linea_grupoVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_linea_grupoVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoVentaPorLineaUpdate.setText("U");
		this.jButtonid_linea_grupoVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoVentaPorLineaUpdate"));



					
		this.jLabelid_linea_categoriaVentaPorLinea = new JLabelMe();
		this.jLabelid_linea_categoriaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaVentaPorLinea.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_linea_categoriaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_linea_categoriaVentaPorLinea= new JComboBoxMe();
		jComboBoxid_linea_categoriaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_linea_categoriaVentaPorLinea.setEnabled(false);

		this.jButtonid_linea_categoriaVentaPorLinea= new JButtonMe();
		this.jButtonid_linea_categoriaVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaVentaPorLinea.setText("Buscar");
		this.jButtonid_linea_categoriaVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaVentaPorLinea"));

		this.jButtonid_linea_categoriaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setText("U");
		this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaVentaPorLineaUpdate.setText("U");
		this.jButtonid_linea_categoriaVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaVentaPorLineaUpdate"));



					
		this.jLabelid_linea_marcaVentaPorLinea = new JLabelMe();
		this.jLabelid_linea_marcaVentaPorLinea.setText(""+VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaVentaPorLinea.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaVentaPorLinea.setToolTipText(VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutVentaPorLinea = new GridBagLayout();
		this.jPanelid_linea_marcaVentaPorLinea.setLayout(this.gridaBagLayoutVentaPorLinea);


		jComboBoxid_linea_marcaVentaPorLinea= new JComboBoxMe();
		jComboBoxid_linea_marcaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_linea_marcaVentaPorLinea.setEnabled(false);

		this.jButtonid_linea_marcaVentaPorLinea= new JButtonMe();
		this.jButtonid_linea_marcaVentaPorLinea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaVentaPorLinea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaVentaPorLinea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaVentaPorLinea.setText("Buscar");
		this.jButtonid_linea_marcaVentaPorLinea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaVentaPorLinea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaVentaPorLinea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaVentaPorLinea"));

		this.jButtonid_linea_marcaVentaPorLineaBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaVentaPorLineaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentaPorLineaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentaPorLineaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaVentaPorLineaBusqueda.setText("U");
		this.jButtonid_linea_marcaVentaPorLineaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaVentaPorLineaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaVentaPorLineaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaVentaPorLineaBusqueda"));

		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaVentaPorLineaBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaVentaPorLineaUpdate= new JButtonMe();
		this.jButtonid_linea_marcaVentaPorLineaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentaPorLineaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentaPorLineaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaVentaPorLineaUpdate.setText("U");
		this.jButtonid_linea_marcaVentaPorLineaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaVentaPorLineaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaVentaPorLineaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaVentaPorLineaUpdate"));



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
		//this.jInternalFrameDetalleVentaPorLinea = new VentaPorLineaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Venta Por Linea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentaPorLinea= new GridBagLayout();
		

		
		String sToolTipVentaPorLinea="";
		sToolTipVentaPorLinea=VentaPorLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentaPorLinea+="(PuntoVenta.VentaPorLinea)";
		}
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentaPorLinea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentaPorLinea = new JButtonMe();
		this.jButtonModificarVentaPorLinea = new JButtonMe();
        this.jButtonActualizarVentaPorLinea = new JButtonMe();
        this.jButtonEliminarVentaPorLinea = new JButtonMe();
        this.jButtonCancelarVentaPorLinea = new JButtonMe();
        this.jButtonGuardarCambiosVentaPorLinea = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentaPorLinea = new JButtonMe();
		this.jButtonCerrarVentaPorLinea = new JButtonMe();
		
		this.jScrollPanelDatosVentaPorLinea = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentaPorLinea = new JScrollPane();
		this.jScrollPanelDatosGeneralVentaPorLinea = new JScrollPane();
				
		
		
		this.jPanelCamposVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Venta Por Linea";
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Por Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentaPorLinea.setName("jPanelCamposVentaPorLinea"); 

		this.jPanelCamposOcultosVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentaPorLinea.setName("jPanelCamposOcultosVentaPorLinea"); 

        this.jPanelAccionesVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentaPorLinea.setToolTipText("Acciones");
        this.jPanelAccionesVentaPorLinea.setName("Acciones"); 

		this.jPanelAccionesFormularioVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentaPorLinea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentaPorLinea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentaPorLinea.setText("Nuevo");
		this.jButtonModificarVentaPorLinea.setText("Editar");
        this.jButtonActualizarVentaPorLinea.setText("Actualizar");
        this.jButtonEliminarVentaPorLinea.setText("Eliminar");
        this.jButtonCancelarVentaPorLinea.setText("Cancelar");
        this.jButtonGuardarCambiosVentaPorLinea.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentaPorLinea.setText("Guardar");
		this.jButtonCerrarVentaPorLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentaPorLinea,"nuevo_button","Nuevo",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentaPorLinea,"modificar_button","Editar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentaPorLinea,"actualizar_button","Actualizar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentaPorLinea,"eliminar_button","Eliminar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentaPorLinea,"cancelar_button","Cancelar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentaPorLinea,"guardarcambios_button","Guardar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentaPorLinea,"guardarcambiostabla_button","Guardar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentaPorLinea,"cerrar_button","Salir",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentaPorLinea.setToolTipText("Nuevo"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentaPorLinea.setToolTipText("Editar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentaPorLinea.setToolTipText("Actualizar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentaPorLinea.setToolTipText("Eliminar)"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentaPorLinea.setToolTipText("Cancelar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentaPorLinea.setToolTipText("Guardar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentaPorLinea.setToolTipText("Guardar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentaPorLinea.setToolTipText("Salir"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentaPorLinea";
		inputMap = this.jButtonNuevoVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentaPorLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentaPorLinea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentaPorLinea";
		inputMap = this.jButtonActualizarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentaPorLinea"));
		
		//ELIMINAR
		sMapKey = "EliminarVentaPorLinea";
		inputMap = this.jButtonEliminarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentaPorLinea"));
		
		//CANCELAR	
		sMapKey = "CancelarVentaPorLinea";
		inputMap = this.jButtonCancelarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentaPorLinea"));
		
		//CERRAR		
		sMapKey = "CerrarVentaPorLinea";
		inputMap = this.jButtonCerrarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentaPorLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentaPorLinea";
		inputMap = this.jButtonGuardarCambiosTablaVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentaPorLinea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentaPorLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentaPorLinea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentaPorLinea.setToolTipText("Nuevo VentaPorLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentaPorLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentaPorLinea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentaPorLinea.setToolTipText("Sin Cerrar Ventana VentaPorLinea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentaPorLinea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentaPorLinea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentaPorLinea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentaPorLinea.setText("Accion");
		this.jComboBoxTiposAccionesVentaPorLinea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentaPorLinea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentaPorLinea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentaPorLinea = new JLabelMe();
		
		this.jLabelAccionesVentaPorLinea.setText("Acciones");		
		this.jLabelAccionesVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentaPorLinea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentaPorLinea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentaPorLinea=new JTabbedPane();
		this.jTabbedPaneRelacionesVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentaPorLinea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentaPorLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaPorLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaPorLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentaPorLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentaPorLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentaPorLinea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentaPorLinea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentaPorLinea = new GridBagLayout();
		
		this.jPanelCamposVentaPorLinea.setLayout(gridaBagLayoutCamposVentaPorLinea);
		this.jPanelCamposOcultosVentaPorLinea.setLayout(gridaBagLayoutCamposOcultosVentaPorLinea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentaPorLinea.add(jLabelIdVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentaPorLinea.add(jLabelidVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentaPorLinea.add(jLabelid_empresaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentaPorLinea.add(jButtonid_empresaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentaPorLinea.add(jButtonid_empresaVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentaPorLinea.add(jComboBoxid_empresaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVentaPorLinea.add(jLabelid_sucursalVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentaPorLinea.add(jButtonid_sucursalVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentaPorLinea.add(jButtonid_sucursalVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVentaPorLinea.add(jComboBoxid_sucursalVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoVentaPorLinea.add(jLabelid_productoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoVentaPorLinea.add(jButtonid_productoVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoVentaPorLinea.add(jButtonid_productoVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoVentaPorLinea.add(jComboBoxid_productoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaVentaPorLinea.add(jLabelid_lineaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaVentaPorLinea.add(jButtonid_lineaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaVentaPorLinea.add(jButtonid_lineaVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaVentaPorLinea.add(jComboBoxid_lineaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoVentaPorLinea.add(jLabelid_linea_grupoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoVentaPorLinea.add(jButtonid_linea_grupoVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoVentaPorLinea.add(jButtonid_linea_grupoVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoVentaPorLinea.add(jComboBoxid_linea_grupoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaVentaPorLinea.add(jLabelid_linea_categoriaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaVentaPorLinea.add(jButtonid_linea_categoriaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaVentaPorLinea.add(jButtonid_linea_categoriaVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaVentaPorLinea.add(jComboBoxid_linea_categoriaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaVentaPorLinea.add(jLabelid_linea_marcaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaVentaPorLinea.add(jButtonid_linea_marcaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 3;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaVentaPorLinea.add(jButtonid_linea_marcaVentaPorLineaUpdate, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaVentaPorLinea.add(jComboBoxid_linea_marcaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeVentaPorLinea.add(jLabelfecha_desdeVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeVentaPorLinea.add(jButtonfecha_desdeVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeVentaPorLinea.add(jDateChooserfecha_desdeVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaVentaPorLinea.add(jLabelfecha_hastaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaVentaPorLinea.add(jButtonfecha_hastaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaVentaPorLinea.add(jDateChooserfecha_hastaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoVentaPorLinea.add(jLabelnombre_productoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoVentaPorLinea.add(jButtonnombre_productoVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoVentaPorLinea.add(jscrollPanenombre_productoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaVentaPorLinea.add(jLabelnombre_lineaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaVentaPorLinea.add(jButtonnombre_lineaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaVentaPorLinea.add(jscrollPanenombre_lineaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupoVentaPorLinea.add(jLabelnombre_grupoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupoVentaPorLinea.add(jButtonnombre_grupoVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupoVentaPorLinea.add(jscrollPanenombre_grupoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_categoriaVentaPorLinea.add(jLabelnombre_categoriaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_categoriaVentaPorLinea.add(jButtonnombre_categoriaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_categoriaVentaPorLinea.add(jscrollPanenombre_categoriaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_marcaVentaPorLinea.add(jLabelnombre_marcaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_marcaVentaPorLinea.add(jButtonnombre_marcaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_marcaVentaPorLinea.add(jscrollPanenombre_marcaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaVentaPorLinea.add(jLabelfechaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaVentaPorLinea.add(jButtonfechaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaVentaPorLinea.add(jDateChooserfechaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialVentaPorLinea.add(jLabelsecuencialVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialVentaPorLinea.add(jButtonsecuencialVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialVentaPorLinea.add(jTextFieldsecuencialVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadVentaPorLinea.add(jLabelcantidadVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadVentaPorLinea.add(jButtoncantidadVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadVentaPorLinea.add(jTextFieldcantidadVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioVentaPorLinea.add(jLabelprecioVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioVentaPorLinea.add(jButtonprecioVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioVentaPorLinea.add(jTextFieldprecioVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoVentaPorLinea.add(jLabeldescuentoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoVentaPorLinea.add(jButtondescuentoVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoVentaPorLinea.add(jTextFielddescuentoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaVentaPorLinea.add(jLabelivaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaVentaPorLinea.add(jButtonivaVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaVentaPorLinea.add(jTextFieldivaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 0;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceVentaPorLinea.add(jLabeliceVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 2;
		this.gridBagConstraintsVentaPorLinea.ipadx = 0;
		this.gridBagConstraintsVentaPorLinea.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceVentaPorLinea.add(jButtoniceVentaPorLineaBusqueda, this.gridBagConstraintsVentaPorLinea);
	}

	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentaPorLinea.gridy = 0;
	this.gridBagConstraintsVentaPorLinea.gridx = 1;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceVentaPorLinea.add(jTextFieldiceVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelidVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelid_productoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelfecha_desdeVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelfecha_hastaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelnombre_productoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelnombre_lineaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelnombre_grupoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelnombre_categoriaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelnombre_marcaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelfechaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelsecuencialVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelcantidadVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelprecioVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPaneldescuentoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPanelivaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentaPorLinea.add(this.jPaneliceVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposVentaPorLinea % 2==0) {
		iXPanelCamposVentaPorLinea=0;
		iYPanelCamposVentaPorLinea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposOcultosVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposOcultosVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaPorLinea.add(this.jPanelid_empresaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposOcultosVentaPorLinea % 2==0) {
		iXPanelCamposOcultosVentaPorLinea=0;
		iYPanelCamposOcultosVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposOcultosVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposOcultosVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaPorLinea.add(this.jPanelid_sucursalVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposOcultosVentaPorLinea % 2==0) {
		iXPanelCamposOcultosVentaPorLinea=0;
		iYPanelCamposOcultosVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposOcultosVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposOcultosVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaPorLinea.add(this.jPanelid_lineaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposOcultosVentaPorLinea % 2==0) {
		iXPanelCamposOcultosVentaPorLinea=0;
		iYPanelCamposOcultosVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposOcultosVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposOcultosVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaPorLinea.add(this.jPanelid_linea_grupoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposOcultosVentaPorLinea % 2==0) {
		iXPanelCamposOcultosVentaPorLinea=0;
		iYPanelCamposOcultosVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposOcultosVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposOcultosVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaPorLinea.add(this.jPanelid_linea_categoriaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposOcultosVentaPorLinea % 2==0) {
		iXPanelCamposOcultosVentaPorLinea=0;
		iYPanelCamposOcultosVentaPorLinea++;
	}
	this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentaPorLinea.gridy = iYPanelCamposOcultosVentaPorLinea;
	this.gridBagConstraintsVentaPorLinea.gridx = iXPanelCamposOcultosVentaPorLinea++;
	this.gridBagConstraintsVentaPorLinea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentaPorLinea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentaPorLinea.add(this.jPanelid_linea_marcaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);



	if(iXPanelCamposOcultosVentaPorLinea % 2==0) {
		iXPanelCamposOcultosVentaPorLinea=0;
		iYPanelCamposOcultosVentaPorLinea++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentaPorLinea= new GridBagLayout();
		this.jPanelAccionesVentaPorLinea.setLayout(gridaBagLayoutAccionesVentaPorLinea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentaPorLinea= new GridBagLayout();
		this.jPanelAccionesFormularioVentaPorLinea.setLayout(gridaBagLayoutAccionesFormularioVentaPorLinea);
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentaPorLinea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentaPorLinea.add(this.jComboBoxTiposAccionesFormularioVentaPorLinea, this.gridBagConstraintsVentaPorLinea);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentaPorLinea.add(this.jButtonModificarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);							

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentaPorLinea.add(this.jButtonEliminarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = 0;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentaPorLinea.add(this.jButtonActualizarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = 0;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentaPorLinea.add(this.jButtonGuardarCambiosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);	
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = 0;		
		this.gridBagConstraintsVentaPorLinea.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentaPorLinea.add(this.jButtonCancelarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentaPorLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentaPorLinea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();						
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentaPorLinea.gridx = 0;		
			//this.gridBagConstraintsVentaPorLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentaPorLinea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentaPorLinea.gridx =0;
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentaPorLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentaPorLinea = new VentaPorLineaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Venta Por Linea DATOS");
			
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
			
	        //this.setTitle("[FOR] - Venta Por Linea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Venta Por Linea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentaPorLineaModel ventaporlineaModel=new VentaPorLineaModel(this);
			
			//SI USARA CLASE INTERNA
			//VentaPorLineaModel.VentaPorLineaFocusTraversalPolicy ventaporlineaFocusTraversalPolicy = ventaporlineaModel.new VentaPorLineaFocusTraversalPolicy(this);
			
			//ventaporlineaFocusTraversalPolicy.setventaporlineaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventaporlineaModel);
			
			
			this.jContentPaneDetalleVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentaPorLinea = new GridBagLayout();	
			this.jContentPaneDetalleVentaPorLinea.setLayout(gridaBagLayoutDetalleVentaPorLinea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentaPorLinea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
				this.gridBagConstraintsVentaPorLinea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentaPorLinea.gridx = 0;
					
				
				this.jContentPaneDetalleVentaPorLinea.add(jTtoolBarDetalleVentaPorLinea, gridBagConstraintsVentaPorLinea);								
				
}
			
			this.jScrollPanelDatosEdicionVentaPorLinea=   new JScrollPane(jContentPaneDetalleVentaPorLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentaPorLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaPorLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaPorLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentaPorLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentaPorLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaPorLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaPorLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentaPorLinea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentaPorLinea.gridx = 0;
	        
			this.jContentPaneDetalleVentaPorLinea.add(jPanelCamposVentaPorLinea, gridBagConstraintsVentaPorLinea);
			
			
			
			
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
						//&& ventaporlineaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentaPorLinea= new GridBagConstraints();
						this.gridBagConstraintsVentaPorLinea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentaPorLinea.gridx = 0;
						this.jContentPaneDetalleVentaPorLinea.add(this.jTabbedPaneRelacionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentaPorLinea.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentaPorLinea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
					this.gridBagConstraintsVentaPorLinea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentaPorLinea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentaPorLinea.gridx = 0;
					
				
					this.jContentPaneDetalleVentaPorLinea.add(jPanelCamposOcultosVentaPorLinea, gridBagConstraintsVentaPorLinea);
				
					this.jPanelCamposOcultosVentaPorLinea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentaPorLinea.gridx = 0;
	        this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentaPorLinea.add(this.jPanelAccionesFormularioVentaPorLinea, this.gridBagConstraintsVentaPorLinea);							
			
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
	        this.gridBagConstraintsVentaPorLinea.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentaPorLinea.gridx = 0;
	        
			
			this.jContentPaneDetalleVentaPorLinea.add(this.jPanelAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentaPorLinea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentaPorLinea=   new JScrollPane(this.jPanelCamposVentaPorLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentaPorLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaPorLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentaPorLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentaPorLinea.gridx = 0;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentaPorLinea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentaPorLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentaPorLinea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentaPorLinea;//jContentPane;
		
		return jScrollPanelDatosEdicionVentaPorLinea;
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
