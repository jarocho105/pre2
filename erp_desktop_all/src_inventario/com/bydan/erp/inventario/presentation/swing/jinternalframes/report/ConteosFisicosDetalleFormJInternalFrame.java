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
import com.bydan.erp.inventario.util.report.ConteosFisicosConstantesFunciones;

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
public class ConteosFisicosDetalleFormJInternalFrame extends ConteosFisicosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConteosFisicos;
	
	protected JMenuBar jmenuBarDetalleConteosFisicos;
	
	protected JMenu jmenuDetalleConteosFisicos;
	protected JMenu jmenuDetalleArchivoConteosFisicos;
	protected JMenu jmenuDetalleAccionesConteosFisicos;
	protected JMenu jmenuDetalleDatosConteosFisicos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConteosFisicos;	
	protected GridBagConstraints gridBagConstraintsConteosFisicos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConteosFisicosBeanSwingJInternalFrameAdditional jInternalFrameDetalleConteosFisicos;		
	
	
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
	
	public ConteosFisicosSessionBean conteosfisicosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ConteosFisicosLogic conteosfisicosLogic;
	
	public JScrollPane jScrollPanelDatosConteosFisicos;
	public JScrollPane jScrollPanelDatosEdicionConteosFisicos;
	public JScrollPane jScrollPanelDatosGeneralConteosFisicos;
	
	protected JPanel jPanelCamposConteosFisicos;    
	protected JPanel jPanelCamposOcultosConteosFisicos;    	
	protected JPanel jPanelAccionesConteosFisicos;
	protected JPanel jPanelAccionesFormularioConteosFisicos;
    
	
	
	protected Integer iXPanelCamposConteosFisicos=0;
	protected Integer iYPanelCamposConteosFisicos=0;
	
	protected Integer iXPanelCamposOcultosConteosFisicos=0;
	protected Integer iYPanelCamposOcultosConteosFisicos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConteosFisicos;
	public JButton jButtonModificarConteosFisicos;
	public JButton jButtonActualizarConteosFisicos;
    public JButton jButtonEliminarConteosFisicos;
	public JButton jButtonCancelarConteosFisicos;
    public JButton jButtonGuardarCambiosConteosFisicos;
	public JButton jButtonGuardarCambiosTablaConteosFisicos;
	protected JButton jButtonCerrarConteosFisicos;
	
	
	protected JButton jButtonProcesarInformacionConteosFisicos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConteosFisicos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConteosFisicos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConteosFisicos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConteosFisicos;
	protected JButton jButtonModificarToolBarConteosFisicos;
	protected JButton jButtonActualizarToolBarConteosFisicos;
    protected JButton jButtonEliminarToolBarConteosFisicos;
	protected JButton jButtonCancelarToolBarConteosFisicos;
    protected JButton jButtonGuardarCambiosToolBarConteosFisicos;
	protected JButton jButtonGuardarCambiosTablaToolBarConteosFisicos;
	protected JButton jButtonMostrarOcultarTablaToolBarConteosFisicos;
	protected JButton jButtonCerrarToolBarConteosFisicos;
	
	protected JButton jButtonProcesarInformacionToolBarConteosFisicos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConteosFisicos;
	protected JMenuItem jMenuItemModificarConteosFisicos;
	protected JMenuItem jMenuItemActualizarConteosFisicos;
    protected JMenuItem jMenuItemEliminarConteosFisicos;
	protected JMenuItem jMenuItemCancelarConteosFisicos;
    protected JMenuItem jMenuItemGuardarCambiosConteosFisicos;
	protected JMenuItem jMenuItemGuardarCambiosTablaConteosFisicos;
	protected JMenuItem jMenuItemCerrarConteosFisicos;
	protected JMenuItem jMenuItemDetalleCerrarConteosFisicos;
	protected JMenuItem jMenuItemDetalleMostarOcultarConteosFisicos;
	
	protected JMenuItem jMenuItemProcesarInformacionConteosFisicos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConteosFisicos;
	protected JMenuItem jMenuItemMostrarOcultarConteosFisicos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConteosFisicos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConteosFisicos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConteosFisicos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConteosFisicos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConteosFisicos;
	public JLabel jLabelIdConteosFisicos;
	public JLabel jLabelidConteosFisicos;
	public JButton jButtonidConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_venta_hastaConteosFisicos;
	public JLabel jLabelfecha_ultima_venta_hastaConteosFisicos;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaConteosFisicos;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaConteosFisicos;
	public JButton jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoConteosFisicos;
	public JLabel jLabelcodigoConteosFisicos;
	public JTextArea jTextAreacodigoConteosFisicos;
	public JScrollPane jscrollPanecodigoConteosFisicos;
	public JButton jButtoncodigoConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadConteosFisicos;
	public JLabel jLabelnombre_unidadConteosFisicos;
	public JTextField jTextFieldnombre_unidadConteosFisicos;
	public JButton jButtonnombre_unidadConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleConteosFisicos;
	public JLabel jLabelcantidad_disponibleConteosFisicos;
	public JTextField jTextFieldcantidad_disponibleConteosFisicos;
	public JButton jButtoncantidad_disponibleConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_fisicaConteosFisicos;
	public JLabel jLabelcantidad_fisicaConteosFisicos;
	public JTextField jTextFieldcantidad_fisicaConteosFisicos;
	public JButton jButtoncantidad_fisicaConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoConteosFisicos;
	public JLabel jLabelcodigo_productoConteosFisicos;
	public JTextField jTextFieldcodigo_productoConteosFisicos;
	public JButton jButtoncodigo_productoConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelnombreConteosFisicos;
	public JLabel jLabelnombreConteosFisicos;
	public JTextArea jTextAreanombreConteosFisicos;
	public JScrollPane jscrollPanenombreConteosFisicos;
	public JButton jButtonnombreConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelingresosConteosFisicos;
	public JLabel jLabelingresosConteosFisicos;
	public JTextField jTextFieldingresosConteosFisicos;
	public JButton jButtoningresosConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelegresosConteosFisicos;
	public JLabel jLabelegresosConteosFisicos;
	public JTextField jTextFieldegresosConteosFisicos;
	public JButton jButtonegresosConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelexistencia_corteConteosFisicos;
	public JLabel jLabelexistencia_corteConteosFisicos;
	public JTextField jTextFieldexistencia_corteConteosFisicos;
	public JButton jButtonexistencia_corteConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelcostoConteosFisicos;
	public JLabel jLabelcostoConteosFisicos;
	public JTextField jTextFieldcostoConteosFisicos;
	public JButton jButtoncostoConteosFisicosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaConteosFisicos;
	public JLabel jLabelid_bodegaConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaConteosFisicos;
	public JButton jButtonid_bodegaConteosFisicos= new JButtonMe();
	public JButton jButtonid_bodegaConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoConteosFisicos;
	public JLabel jLabelid_productoConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoConteosFisicos;
	public JButton jButtonid_productoConteosFisicos= new JButtonMe();
	public JButton jButtonid_productoConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_productoConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaConteosFisicos;
	public JLabel jLabelid_empresaConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConteosFisicos;
	public JButton jButtonid_empresaConteosFisicos= new JButtonMe();
	public JButton jButtonid_empresaConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_empresaConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalConteosFisicos;
	public JLabel jLabelid_sucursalConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalConteosFisicos;
	public JButton jButtonid_sucursalConteosFisicos= new JButtonMe();
	public JButton jButtonid_sucursalConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaConteosFisicos;
	public JLabel jLabelid_lineaConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaConteosFisicos;
	public JButton jButtonid_lineaConteosFisicos= new JButtonMe();
	public JButton jButtonid_lineaConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_lineaConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoConteosFisicos;
	public JLabel jLabelid_linea_grupoConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoConteosFisicos;
	public JButton jButtonid_linea_grupoConteosFisicos= new JButtonMe();
	public JButton jButtonid_linea_grupoConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaConteosFisicos;
	public JLabel jLabelid_linea_categoriaConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaConteosFisicos;
	public JButton jButtonid_linea_categoriaConteosFisicos= new JButtonMe();
	public JButton jButtonid_linea_categoriaConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaConteosFisicosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaConteosFisicos;
	public JLabel jLabelid_linea_marcaConteosFisicos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaConteosFisicos;
	public JButton jButtonid_linea_marcaConteosFisicos= new JButtonMe();
	public JButton jButtonid_linea_marcaConteosFisicosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaConteosFisicosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConteosFisicos;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConteosFisicosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConteosFisicos=new JPanel();
				this.jPanelAccionesFormularioConteosFisicos=new JPanel();
				this.jmenuBarDetalleConteosFisicos=new JMenuBar();
				this.jTtoolBarDetalleConteosFisicos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConteosFisicosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConteosFisicosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConteosFisicos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConteosFisicos() {
		return this.jButtonActualizarToolBarConteosFisicos;
	}
	
	public JButton getjButtonEliminarToolBarConteosFisicos() {
		return this.jButtonEliminarToolBarConteosFisicos;
	}
	
	public JButton getjButtonCancelarToolBarConteosFisicos() {
		return this.jButtonCancelarToolBarConteosFisicos;
	}		
	
	public JButton getjButtonProcesarInformacionConteosFisicos() {
		return this.jButtonProcesarInformacionConteosFisicos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConteosFisicos)	{
		this.jButtonProcesarInformacionConteosFisicos = jButtonProcesarInformacionConteosFisicos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConteosFisicos() {
		return this.jComboBoxTiposAccionesConteosFisicos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConteosFisicos(
			JComboBox jComboBoxTiposRelacionesConteosFisicos) {
		this.jComboBoxTiposRelacionesConteosFisicos = jComboBoxTiposRelacionesConteosFisicos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConteosFisicos(
			JComboBox jComboBoxTiposAccionesConteosFisicos) {
		this.jComboBoxTiposAccionesConteosFisicos = jComboBoxTiposAccionesConteosFisicos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConteosFisicos() {
		return this.jComboBoxTiposAccionesFormularioConteosFisicos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConteosFisicos(
			JComboBox jComboBoxTiposAccionesFormularioConteosFisicos) {
		this.jComboBoxTiposAccionesFormularioConteosFisicos = jComboBoxTiposAccionesFormularioConteosFisicos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
		
		this.conteosfisicosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conteosfisicosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conteosfisicosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConteosFisicosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConteosFisicosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConteosFisicosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conteos Fisicos MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
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
	
		ConteosFisicosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConteosFisicos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConteosFisicos=new JButtonMe();
				this.jButtonModificarToolBarConteosFisicos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConteosFisicos,this.jTtoolBarDetalleConteosFisicos,
							"actualizar","actualizar","Actualizar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConteosFisicos,this.jTtoolBarDetalleConteosFisicos,
							"eliminar","eliminar","Eliminar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConteosFisicos,this.jTtoolBarDetalleConteosFisicos,
							"cancelar","cancelar","Cancelar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConteosFisicos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConteosFisicos,this.jTtoolBarDetalleConteosFisicos,
							"guardarcambios","guardarcambios","Guardar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConteosFisicos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConteosFisicos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConteosFisicos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConteosFisicos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConteosFisicos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConteosFisicos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConteosFisicos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConteosFisicos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConteosFisicos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConteosFisicos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConteosFisicos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConteosFisicos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConteosFisicos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConteosFisicos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConteosFisicos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConteosFisicos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConteosFisicos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConteosFisicos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConteosFisicos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConteosFisicos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConteosFisicos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConteosFisicos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConteosFisicos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConteosFisicos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConteosFisicos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConteosFisicos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConteosFisicos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConteosFisicos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConteosFisicos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConteosFisicos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConteosFisicos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConteosFisicos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConteosFisicos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConteosFisicos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConteosFisicos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConteosFisicos.add(this.jMenuItemDetalleCerrarConteosFisicos);
		
		this.jmenuDetalleAccionesConteosFisicos.add(this.jMenuItemActualizarConteosFisicos);
		this.jmenuDetalleAccionesConteosFisicos.add(this.jMenuItemEliminarConteosFisicos);
		this.jmenuDetalleAccionesConteosFisicos.add(this.jMenuItemCancelarConteosFisicos);		
		
		//this.jmenuDetalleDatosConteosFisicos.add(this.jMenuItemDetalleAbrirOrderByConteosFisicos);				
		this.jmenuDetalleDatosConteosFisicos.add(this.jMenuItemDetalleMostarOcultarConteosFisicos);				
				
		//this.jmenuDetalleAccionesConteosFisicos.add(this.jMenuItemGuardarCambiosConteosFisicos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConteosFisicos.add(this.jmenuDetalleArchivoConteosFisicos);		
		this.jmenuBarDetalleConteosFisicos.add(this.jmenuDetalleAccionesConteosFisicos);		
		this.jmenuBarDetalleConteosFisicos.add(this.jmenuDetalleDatosConteosFisicos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConteosFisicos);				
	}
	
	
	public void inicializarElementosCamposConteosFisicos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConteosFisicos = new JLabelMe();
		jLabelIdConteosFisicos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConteosFisicos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConteosFisicos= new GridBagLayout();

		this.jPanelidConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);

		jLabelidConteosFisicos = new JLabel();
		jLabelidConteosFisicos.setText("Id");

		jLabelidConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ultima_venta_hastaConteosFisicos = new JLabelMe();
		this.jLabelfecha_ultima_venta_hastaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA+" : *");
		this.jLabelfecha_ultima_venta_hastaConteosFisicos.setToolTipText("Fecha Ultima Venta Hasta");
		this.jLabelfecha_ultima_venta_hastaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_venta_hastaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_venta_hastaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelfecha_ultima_venta_hastaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		//jFormattedTextFieldfecha_ultima_venta_hastaConteosFisicos= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_venta_hastaConteosFisicos= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.setEnabled(false);
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_venta_hastaConteosFisicos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setText("U");
		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_venta_hastaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_venta_hastaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoConteosFisicos = new JLabelMe();
		this.jLabelcodigoConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoConteosFisicos.setToolTipText("Codigo");
		this.jLabelcodigoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelcodigoConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextAreacodigoConteosFisicos= new JTextAreaMe();
		jTextAreacodigoConteosFisicos.setEnabled(false);
		jTextAreacodigoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoConteosFisicos.setLineWrap(true);
		jTextAreacodigoConteosFisicos.setWrapStyleWord(true);
		jTextAreacodigoConteosFisicos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoConteosFisicos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoConteosFisicos = new JScrollPane(jTextAreacodigoConteosFisicos);
		jscrollPanecodigoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoConteosFisicosBusqueda= new JButtonMe();
		this.jButtoncodigoConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoConteosFisicosBusqueda.setText("U");
		this.jButtoncodigoConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadConteosFisicos = new JLabelMe();
		this.jLabelnombre_unidadConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadConteosFisicos.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelnombre_unidadConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldnombre_unidadConteosFisicos= new JTextFieldMe();

		jTextFieldnombre_unidadConteosFisicos.setEnabled(false);
		jTextFieldnombre_unidadConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadConteosFisicosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadConteosFisicosBusqueda.setText("U");
		this.jButtonnombre_unidadConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleConteosFisicos = new JLabelMe();
		this.jLabelcantidad_disponibleConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleConteosFisicos.setToolTipText("Cantidad Disponible");
		this.jLabelcantidad_disponibleConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelcantidad_disponibleConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldcantidad_disponibleConteosFisicos= new JTextFieldMe();
		jTextFieldcantidad_disponibleConteosFisicos.setEnabled(false);
		jTextFieldcantidad_disponibleConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleConteosFisicos.setText("0");

		this.jButtoncantidad_disponibleConteosFisicosBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleConteosFisicosBusqueda.setText("U");
		this.jButtoncantidad_disponibleConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_fisicaConteosFisicos = new JLabelMe();
		this.jLabelcantidad_fisicaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA+" : *");
		this.jLabelcantidad_fisicaConteosFisicos.setToolTipText("Cantidad Fisica");
		this.jLabelcantidad_fisicaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_fisicaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_fisicaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_fisicaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelcantidad_fisicaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldcantidad_fisicaConteosFisicos= new JTextFieldMe();
		jTextFieldcantidad_fisicaConteosFisicos.setEnabled(false);
		jTextFieldcantidad_fisicaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_fisicaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_fisicaConteosFisicos.setText("0");

		this.jButtoncantidad_fisicaConteosFisicosBusqueda= new JButtonMe();
		this.jButtoncantidad_fisicaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_fisicaConteosFisicosBusqueda.setText("U");
		this.jButtoncantidad_fisicaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_fisicaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_fisicaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_fisicaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_fisicaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_fisicaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_fisicaConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoConteosFisicos = new JLabelMe();
		this.jLabelcodigo_productoConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoConteosFisicos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelcodigo_productoConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldcodigo_productoConteosFisicos= new JTextFieldMe();

		jTextFieldcodigo_productoConteosFisicos.setEnabled(false);
		jTextFieldcodigo_productoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoConteosFisicosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoConteosFisicosBusqueda.setText("U");
		this.jButtoncodigo_productoConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelnombreConteosFisicos = new JLabelMe();
		this.jLabelnombreConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConteosFisicos.setToolTipText("Nombre");
		this.jLabelnombreConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelnombreConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextAreanombreConteosFisicos= new JTextAreaMe();
		jTextAreanombreConteosFisicos.setEnabled(false);
		jTextAreanombreConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConteosFisicos.setLineWrap(true);
		jTextAreanombreConteosFisicos.setWrapStyleWord(true);
		jTextAreanombreConteosFisicos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConteosFisicos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConteosFisicos = new JScrollPane(jTextAreanombreConteosFisicos);
		jscrollPanenombreConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConteosFisicosBusqueda= new JButtonMe();
		this.jButtonnombreConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConteosFisicosBusqueda.setText("U");
		this.jButtonnombreConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelingresosConteosFisicos = new JLabelMe();
		this.jLabelingresosConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_INGRESOS+" : *");
		this.jLabelingresosConteosFisicos.setToolTipText("Ingresos");
		this.jLabelingresosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresosConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresosConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresosConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_INGRESOS);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelingresosConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldingresosConteosFisicos= new JTextFieldMe();
		jTextFieldingresosConteosFisicos.setEnabled(false);
		jTextFieldingresosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingresosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingresosConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingresosConteosFisicos.setText("0.0");

		this.jButtoningresosConteosFisicosBusqueda= new JButtonMe();
		this.jButtoningresosConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresosConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresosConteosFisicosBusqueda.setText("U");
		this.jButtoningresosConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresosConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresosConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingresosConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingresosConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresosConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresosConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelegresosConteosFisicos = new JLabelMe();
		this.jLabelegresosConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_EGRESOS+" : *");
		this.jLabelegresosConteosFisicos.setToolTipText("Egresos");
		this.jLabelegresosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelegresosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelegresosConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelegresosConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelegresosConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_EGRESOS);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelegresosConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldegresosConteosFisicos= new JTextFieldMe();
		jTextFieldegresosConteosFisicos.setEnabled(false);
		jTextFieldegresosConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldegresosConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldegresosConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldegresosConteosFisicos.setText("0.0");

		this.jButtonegresosConteosFisicosBusqueda= new JButtonMe();
		this.jButtonegresosConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonegresosConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonegresosConteosFisicosBusqueda.setText("U");
		this.jButtonegresosConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonegresosConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonegresosConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldegresosConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldegresosConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"egresosConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonegresosConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelexistencia_corteConteosFisicos = new JLabelMe();
		this.jLabelexistencia_corteConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE+" : *");
		this.jLabelexistencia_corteConteosFisicos.setToolTipText("Existencia Corte");
		this.jLabelexistencia_corteConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelexistencia_corteConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelexistencia_corteConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelexistencia_corteConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelexistencia_corteConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelexistencia_corteConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelexistencia_corteConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldexistencia_corteConteosFisicos= new JTextFieldMe();
		jTextFieldexistencia_corteConteosFisicos.setEnabled(false);
		jTextFieldexistencia_corteConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexistencia_corteConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldexistencia_corteConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldexistencia_corteConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldexistencia_corteConteosFisicos.setText("0.0");

		this.jButtonexistencia_corteConteosFisicosBusqueda= new JButtonMe();
		this.jButtonexistencia_corteConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexistencia_corteConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonexistencia_corteConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonexistencia_corteConteosFisicosBusqueda.setText("U");
		this.jButtonexistencia_corteConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonexistencia_corteConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonexistencia_corteConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldexistencia_corteConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldexistencia_corteConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"existencia_corteConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonexistencia_corteConteosFisicosBusqueda.setVisible(false);		}


					
		this.jLabelcostoConteosFisicos = new JLabelMe();
		this.jLabelcostoConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoConteosFisicos.setToolTipText("Costo");
		this.jLabelcostoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelcostoConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jTextFieldcostoConteosFisicos= new JTextFieldMe();
		jTextFieldcostoConteosFisicos.setEnabled(false);
		jTextFieldcostoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoConteosFisicos.setText("0.0");

		this.jButtoncostoConteosFisicosBusqueda= new JButtonMe();
		this.jButtoncostoConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoConteosFisicosBusqueda.setText("U");
		this.jButtoncostoConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoConteosFisicosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConteosFisicos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaConteosFisicos = new JLabelMe();
		this.jLabelid_bodegaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaConteosFisicos.setToolTipText("Bodega");
		this.jLabelid_bodegaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_bodegaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_bodegaConteosFisicos= new JComboBoxMe();
		jComboBoxid_bodegaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaConteosFisicos= new JButtonMe();
		this.jButtonid_bodegaConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaConteosFisicos.setText("Buscar");
		this.jButtonid_bodegaConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaConteosFisicos"));

		this.jButtonid_bodegaConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_bodegaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaConteosFisicosBusqueda.setText("U");
		this.jButtonid_bodegaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_bodegaConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaConteosFisicosUpdate.setText("U");
		this.jButtonid_bodegaConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaConteosFisicosUpdate"));



					
		this.jLabelid_productoConteosFisicos = new JLabelMe();
		this.jLabelid_productoConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoConteosFisicos.setToolTipText("Producto");
		this.jLabelid_productoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_productoConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_productoConteosFisicos= new JComboBoxMe();
		jComboBoxid_productoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoConteosFisicos= new JButtonMe();
		this.jButtonid_productoConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoConteosFisicos.setText("Buscar");
		this.jButtonid_productoConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoConteosFisicos"));

		this.jButtonid_productoConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_productoConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoConteosFisicosBusqueda.setText("U");
		this.jButtonid_productoConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_productoConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_productoConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoConteosFisicosUpdate.setText("U");
		this.jButtonid_productoConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoConteosFisicosUpdate"));



					
		this.jLabelid_empresaConteosFisicos = new JLabelMe();
		this.jLabelid_empresaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConteosFisicos.setToolTipText("Empresa");
		this.jLabelid_empresaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_empresaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_empresaConteosFisicos= new JComboBoxMe();
		jComboBoxid_empresaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConteosFisicos.setEnabled(false);

		this.jButtonid_empresaConteosFisicos= new JButtonMe();
		this.jButtonid_empresaConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConteosFisicos.setText("Buscar");
		this.jButtonid_empresaConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConteosFisicos"));

		this.jButtonid_empresaConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_empresaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConteosFisicosBusqueda.setText("U");
		this.jButtonid_empresaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_empresaConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_empresaConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConteosFisicosUpdate.setText("U");
		this.jButtonid_empresaConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConteosFisicosUpdate"));



					
		this.jLabelid_sucursalConteosFisicos = new JLabelMe();
		this.jLabelid_sucursalConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalConteosFisicos.setToolTipText("Sucursal");
		this.jLabelid_sucursalConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_sucursalConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_sucursalConteosFisicos= new JComboBoxMe();
		jComboBoxid_sucursalConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalConteosFisicos.setEnabled(false);

		this.jButtonid_sucursalConteosFisicos= new JButtonMe();
		this.jButtonid_sucursalConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConteosFisicos.setText("Buscar");
		this.jButtonid_sucursalConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConteosFisicos"));

		this.jButtonid_sucursalConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_sucursalConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConteosFisicosBusqueda.setText("U");
		this.jButtonid_sucursalConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_sucursalConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConteosFisicosUpdate.setText("U");
		this.jButtonid_sucursalConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConteosFisicosUpdate"));



					
		this.jLabelid_lineaConteosFisicos = new JLabelMe();
		this.jLabelid_lineaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaConteosFisicos.setToolTipText("Linea");
		this.jLabelid_lineaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_lineaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_lineaConteosFisicos= new JComboBoxMe();
		jComboBoxid_lineaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaConteosFisicos= new JButtonMe();
		this.jButtonid_lineaConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConteosFisicos.setText("Buscar");
		this.jButtonid_lineaConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConteosFisicos"));

		this.jButtonid_lineaConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_lineaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaConteosFisicosBusqueda.setText("U");
		this.jButtonid_lineaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_lineaConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_lineaConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaConteosFisicosUpdate.setText("U");
		this.jButtonid_lineaConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConteosFisicosUpdate"));



					
		this.jLabelid_linea_grupoConteosFisicos = new JLabelMe();
		this.jLabelid_linea_grupoConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoConteosFisicos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_linea_grupoConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_linea_grupoConteosFisicos= new JComboBoxMe();
		jComboBoxid_linea_grupoConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoConteosFisicos= new JButtonMe();
		this.jButtonid_linea_grupoConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConteosFisicos.setText("Buscar");
		this.jButtonid_linea_grupoConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConteosFisicos"));

		this.jButtonid_linea_grupoConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoConteosFisicosBusqueda.setText("U");
		this.jButtonid_linea_grupoConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoConteosFisicosUpdate.setText("U");
		this.jButtonid_linea_grupoConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConteosFisicosUpdate"));



					
		this.jLabelid_linea_categoriaConteosFisicos = new JLabelMe();
		this.jLabelid_linea_categoriaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaConteosFisicos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_linea_categoriaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_linea_categoriaConteosFisicos= new JComboBoxMe();
		jComboBoxid_linea_categoriaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaConteosFisicos= new JButtonMe();
		this.jButtonid_linea_categoriaConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConteosFisicos.setText("Buscar");
		this.jButtonid_linea_categoriaConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConteosFisicos"));

		this.jButtonid_linea_categoriaConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaConteosFisicosBusqueda.setText("U");
		this.jButtonid_linea_categoriaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaConteosFisicosUpdate.setText("U");
		this.jButtonid_linea_categoriaConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConteosFisicosUpdate"));



					
		this.jLabelid_linea_marcaConteosFisicos = new JLabelMe();
		this.jLabelid_linea_marcaConteosFisicos.setText(""+ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaConteosFisicos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaConteosFisicos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaConteosFisicos.setToolTipText(ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutConteosFisicos = new GridBagLayout();
		this.jPanelid_linea_marcaConteosFisicos.setLayout(this.gridaBagLayoutConteosFisicos);


		jComboBoxid_linea_marcaConteosFisicos= new JComboBoxMe();
		jComboBoxid_linea_marcaConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaConteosFisicos= new JButtonMe();
		this.jButtonid_linea_marcaConteosFisicos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConteosFisicos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConteosFisicos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConteosFisicos.setText("Buscar");
		this.jButtonid_linea_marcaConteosFisicos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaConteosFisicos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConteosFisicos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConteosFisicos"));

		this.jButtonid_linea_marcaConteosFisicosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaConteosFisicosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConteosFisicosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConteosFisicosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaConteosFisicosBusqueda.setText("U");
		this.jButtonid_linea_marcaConteosFisicosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaConteosFisicosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConteosFisicosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConteosFisicosBusqueda"));

		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaConteosFisicosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaConteosFisicosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaConteosFisicosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConteosFisicosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConteosFisicosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaConteosFisicosUpdate.setText("U");
		this.jButtonid_linea_marcaConteosFisicosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaConteosFisicosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConteosFisicosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConteosFisicosUpdate"));



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
		//this.jInternalFrameDetalleConteosFisicos = new ConteosFisicosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Conteos Fisicos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConteosFisicos= new GridBagLayout();
		

		
		String sToolTipConteosFisicos="";
		sToolTipConteosFisicos=ConteosFisicosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConteosFisicos+="(Inventario.ConteosFisicos)";
		}
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			sToolTipConteosFisicos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConteosFisicos = new JButtonMe();
		this.jButtonModificarConteosFisicos = new JButtonMe();
        this.jButtonActualizarConteosFisicos = new JButtonMe();
        this.jButtonEliminarConteosFisicos = new JButtonMe();
        this.jButtonCancelarConteosFisicos = new JButtonMe();
        this.jButtonGuardarCambiosConteosFisicos = new JButtonMe();
		this.jButtonGuardarCambiosTablaConteosFisicos = new JButtonMe();
		this.jButtonCerrarConteosFisicos = new JButtonMe();
		
		this.jScrollPanelDatosConteosFisicos = new JScrollPane();   
        this.jScrollPanelDatosEdicionConteosFisicos = new JScrollPane();
		this.jScrollPanelDatosGeneralConteosFisicos = new JScrollPane();
				
		
		
		this.jPanelCamposConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Conteos Fisicos";
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conteos Fisicoses" + this.sPath));
		} else {
			this.jScrollPanelDatosConteosFisicos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConteosFisicos.setName("jPanelCamposConteosFisicos"); 

		this.jPanelCamposOcultosConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConteosFisicos.setName("jPanelCamposOcultosConteosFisicos"); 

        this.jPanelAccionesConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConteosFisicos.setToolTipText("Acciones");
        this.jPanelAccionesConteosFisicos.setName("Acciones"); 

		this.jPanelAccionesFormularioConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConteosFisicos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConteosFisicos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConteosFisicos.setText("Nuevo");
		this.jButtonModificarConteosFisicos.setText("Editar");
        this.jButtonActualizarConteosFisicos.setText("Actualizar");
        this.jButtonEliminarConteosFisicos.setText("Eliminar");
        this.jButtonCancelarConteosFisicos.setText("Cancelar");
        this.jButtonGuardarCambiosConteosFisicos.setText("Guardar");
		this.jButtonGuardarCambiosTablaConteosFisicos.setText("Guardar");
		this.jButtonCerrarConteosFisicos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConteosFisicos,"nuevo_button","Nuevo",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConteosFisicos,"modificar_button","Editar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConteosFisicos,"actualizar_button","Actualizar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConteosFisicos,"eliminar_button","Eliminar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConteosFisicos,"cancelar_button","Cancelar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConteosFisicos,"guardarcambios_button","Guardar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConteosFisicos,"guardarcambiostabla_button","Guardar",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConteosFisicos,"cerrar_button","Salir",this.conteosfisicosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConteosFisicos.setToolTipText("Nuevo"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConteosFisicos.setToolTipText("Editar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConteosFisicos.setToolTipText("Actualizar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConteosFisicos.setToolTipText("Eliminar)"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConteosFisicos.setToolTipText("Cancelar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConteosFisicos.setToolTipText("Guardar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConteosFisicos.setToolTipText("Guardar"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConteosFisicos.setToolTipText("Salir"+" "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConteosFisicos";
		inputMap = this.jButtonNuevoConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConteosFisicos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConteosFisicos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConteosFisicos";
		inputMap = this.jButtonActualizarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConteosFisicos"));
		
		//ELIMINAR
		sMapKey = "EliminarConteosFisicos";
		inputMap = this.jButtonEliminarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConteosFisicos"));
		
		//CANCELAR	
		sMapKey = "CancelarConteosFisicos";
		inputMap = this.jButtonCancelarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConteosFisicos"));
		
		//CERRAR		
		sMapKey = "CerrarConteosFisicos";
		inputMap = this.jButtonCerrarConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConteosFisicos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConteosFisicos";
		inputMap = this.jButtonGuardarCambiosTablaConteosFisicos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConteosFisicos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConteosFisicos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConteosFisicos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConteosFisicos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConteosFisicos.setToolTipText("Nuevo ConteosFisicos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConteosFisicos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConteosFisicos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConteosFisicos.setToolTipText("Sin Cerrar Ventana ConteosFisicos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConteosFisicos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConteosFisicos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConteosFisicos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConteosFisicos.setText("Accion");
		this.jComboBoxTiposAccionesConteosFisicos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConteosFisicos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConteosFisicos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConteosFisicos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConteosFisicos = new JLabelMe();
		
		this.jLabelAccionesConteosFisicos.setText("Acciones");		
		this.jLabelAccionesConteosFisicos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConteosFisicos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConteosFisicos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConteosFisicos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConteosFisicos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConteosFisicos=new JTabbedPane();
		this.jTabbedPaneRelacionesConteosFisicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConteosFisicos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConteosFisicos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConteosFisicos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConteosFisicos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConteosFisicos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConteosFisicos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConteosFisicos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConteosFisicos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConteosFisicos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConteosFisicos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConteosFisicos = new GridBagLayout();
		
		this.jPanelCamposConteosFisicos.setLayout(gridaBagLayoutCamposConteosFisicos);
		this.jPanelCamposOcultosConteosFisicos.setLayout(gridaBagLayoutCamposOcultosConteosFisicos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConteosFisicos.add(jLabelIdConteosFisicos, this.gridBagConstraintsConteosFisicos);



	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConteosFisicos.add(jLabelidConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaConteosFisicos.add(jLabelid_bodegaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaConteosFisicos.add(jButtonid_bodegaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaConteosFisicos.add(jButtonid_bodegaConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaConteosFisicos.add(jComboBoxid_bodegaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoConteosFisicos.add(jLabelid_productoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoConteosFisicos.add(jButtonid_productoConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoConteosFisicos.add(jButtonid_productoConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoConteosFisicos.add(jComboBoxid_productoConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConteosFisicos.add(jLabelid_empresaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConteosFisicos.add(jButtonid_empresaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConteosFisicos.add(jButtonid_empresaConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConteosFisicos.add(jComboBoxid_empresaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalConteosFisicos.add(jLabelid_sucursalConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConteosFisicos.add(jButtonid_sucursalConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConteosFisicos.add(jButtonid_sucursalConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalConteosFisicos.add(jComboBoxid_sucursalConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaConteosFisicos.add(jLabelid_lineaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaConteosFisicos.add(jButtonid_lineaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaConteosFisicos.add(jButtonid_lineaConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaConteosFisicos.add(jComboBoxid_lineaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoConteosFisicos.add(jLabelid_linea_grupoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoConteosFisicos.add(jButtonid_linea_grupoConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoConteosFisicos.add(jButtonid_linea_grupoConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoConteosFisicos.add(jComboBoxid_linea_grupoConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaConteosFisicos.add(jLabelid_linea_categoriaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaConteosFisicos.add(jButtonid_linea_categoriaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaConteosFisicos.add(jButtonid_linea_categoriaConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaConteosFisicos.add(jComboBoxid_linea_categoriaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaConteosFisicos.add(jLabelid_linea_marcaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaConteosFisicos.add(jButtonid_linea_marcaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 3;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaConteosFisicos.add(jButtonid_linea_marcaConteosFisicosUpdate, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaConteosFisicos.add(jComboBoxid_linea_marcaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_venta_hastaConteosFisicos.add(jLabelfecha_ultima_venta_hastaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_venta_hastaConteosFisicos.add(jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_venta_hastaConteosFisicos.add(jDateChooserfecha_ultima_venta_hastaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoConteosFisicos.add(jLabelcodigoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoConteosFisicos.add(jButtoncodigoConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoConteosFisicos.add(jscrollPanecodigoConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadConteosFisicos.add(jLabelnombre_unidadConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadConteosFisicos.add(jButtonnombre_unidadConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadConteosFisicos.add(jTextFieldnombre_unidadConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleConteosFisicos.add(jLabelcantidad_disponibleConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleConteosFisicos.add(jButtoncantidad_disponibleConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleConteosFisicos.add(jTextFieldcantidad_disponibleConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_fisicaConteosFisicos.add(jLabelcantidad_fisicaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_fisicaConteosFisicos.add(jButtoncantidad_fisicaConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_fisicaConteosFisicos.add(jTextFieldcantidad_fisicaConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoConteosFisicos.add(jLabelcodigo_productoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoConteosFisicos.add(jButtoncodigo_productoConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoConteosFisicos.add(jTextFieldcodigo_productoConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConteosFisicos.add(jLabelnombreConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConteosFisicos.add(jButtonnombreConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConteosFisicos.add(jscrollPanenombreConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresosConteosFisicos.add(jLabelingresosConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresosConteosFisicos.add(jButtoningresosConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresosConteosFisicos.add(jTextFieldingresosConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelegresosConteosFisicos.add(jLabelegresosConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelegresosConteosFisicos.add(jButtonegresosConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelegresosConteosFisicos.add(jTextFieldegresosConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelexistencia_corteConteosFisicos.add(jLabelexistencia_corteConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelexistencia_corteConteosFisicos.add(jButtonexistencia_corteConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelexistencia_corteConteosFisicos.add(jTextFieldexistencia_corteConteosFisicos, this.gridBagConstraintsConteosFisicos);


	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 0;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoConteosFisicos.add(jLabelcostoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		//this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = 2;
		this.gridBagConstraintsConteosFisicos.ipadx = 0;
		this.gridBagConstraintsConteosFisicos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoConteosFisicos.add(jButtoncostoConteosFisicosBusqueda, this.gridBagConstraintsConteosFisicos);
	}

	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConteosFisicos.gridy = 0;
	this.gridBagConstraintsConteosFisicos.gridx = 1;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoConteosFisicos.add(jTextFieldcostoConteosFisicos, this.gridBagConstraintsConteosFisicos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelidConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelid_bodegaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelid_productoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelid_lineaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelid_linea_grupoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelid_linea_categoriaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelid_linea_marcaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelfecha_ultima_venta_hastaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelcodigoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelnombre_unidadConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelcantidad_disponibleConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelcantidad_fisicaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelcodigo_productoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelnombreConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelingresosConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelegresosConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelexistencia_corteConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConteosFisicos.add(this.jPanelcostoConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposConteosFisicos % 2==0) {
		iXPanelCamposConteosFisicos=0;
		iYPanelCamposConteosFisicos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposOcultosConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposOcultosConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConteosFisicos.add(this.jPanelid_empresaConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposOcultosConteosFisicos % 2==0) {
		iXPanelCamposOcultosConteosFisicos=0;
		iYPanelCamposOcultosConteosFisicos++;
	}
	this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConteosFisicos.gridy = iYPanelCamposOcultosConteosFisicos;
	this.gridBagConstraintsConteosFisicos.gridx = iXPanelCamposOcultosConteosFisicos++;
	this.gridBagConstraintsConteosFisicos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConteosFisicos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConteosFisicos.add(this.jPanelid_sucursalConteosFisicos, this.gridBagConstraintsConteosFisicos);



	if(iXPanelCamposOcultosConteosFisicos % 2==0) {
		iXPanelCamposOcultosConteosFisicos=0;
		iYPanelCamposOcultosConteosFisicos++;
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
			
		GridBagLayout gridaBagLayoutAccionesConteosFisicos= new GridBagLayout();
		this.jPanelAccionesConteosFisicos.setLayout(gridaBagLayoutAccionesConteosFisicos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConteosFisicos= new GridBagLayout();
		this.jPanelAccionesFormularioConteosFisicos.setLayout(gridaBagLayoutAccionesFormularioConteosFisicos);
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConteosFisicos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConteosFisicos.add(this.jComboBoxTiposAccionesFormularioConteosFisicos, this.gridBagConstraintsConteosFisicos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx = iPosXAccion++;
			
		this.jPanelAccionesConteosFisicos.add(this.jButtonModificarConteosFisicos, this.gridBagConstraintsConteosFisicos);							

		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConteosFisicos.gridy = 0;
		this.gridBagConstraintsConteosFisicos.gridx =iPosXAccion++;
			
		this.jPanelAccionesConteosFisicos.add(this.jButtonEliminarConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = 0;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXAccion++;
		
		this.jPanelAccionesConteosFisicos.add(this.jButtonActualizarConteosFisicos, this.gridBagConstraintsConteosFisicos);


		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = 0;		
		this.gridBagConstraintsConteosFisicos.gridx = iPosXAccion++;
		
		this.jPanelAccionesConteosFisicos.add(this.jButtonGuardarCambiosConteosFisicos, this.gridBagConstraintsConteosFisicos);	
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = 0;		
		this.gridBagConstraintsConteosFisicos.gridx =iPosXAccion++;
		
		this.jPanelAccionesConteosFisicos.add(this.jButtonCancelarConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConteosFisicos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConteosFisicos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();						
			this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConteosFisicos.gridx = 0;		
			//this.gridBagConstraintsConteosFisicos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConteosFisicos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConteosFisicos.gridx =0;
		this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConteosFisicos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConteosFisicos, this.gridBagConstraintsConteosFisicos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConteosFisicos = new ConteosFisicosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Conteos Fisicos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Conteos Fisicos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conteos Fisicos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConteosFisicosModel conteosfisicosModel=new ConteosFisicosModel(this);
			
			//SI USARA CLASE INTERNA
			//ConteosFisicosModel.ConteosFisicosFocusTraversalPolicy conteosfisicosFocusTraversalPolicy = conteosfisicosModel.new ConteosFisicosFocusTraversalPolicy(this);
			
			//conteosfisicosFocusTraversalPolicy.setconteosfisicosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(conteosfisicosModel);
			
			
			this.jContentPaneDetalleConteosFisicos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConteosFisicos = new GridBagLayout();	
			this.jContentPaneDetalleConteosFisicos.setLayout(gridaBagLayoutDetalleConteosFisicos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConteosFisicos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
				this.gridBagConstraintsConteosFisicos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConteosFisicos.gridx = 0;
					
				
				this.jContentPaneDetalleConteosFisicos.add(jTtoolBarDetalleConteosFisicos, gridBagConstraintsConteosFisicos);								
				
}
			
			this.jScrollPanelDatosEdicionConteosFisicos=   new JScrollPane(jContentPaneDetalleConteosFisicos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConteosFisicos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConteosFisicos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConteosFisicos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConteosFisicos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConteosFisicos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConteosFisicos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConteosFisicos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConteosFisicos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConteosFisicos.gridx = 0;
	        
			this.jContentPaneDetalleConteosFisicos.add(jPanelCamposConteosFisicos, gridBagConstraintsConteosFisicos);
			
			
			
			
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
						//&& conteosfisicosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConteosFisicos= new GridBagConstraints();
						this.gridBagConstraintsConteosFisicos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConteosFisicos.gridx = 0;
						this.jContentPaneDetalleConteosFisicos.add(this.jTabbedPaneRelacionesConteosFisicos, this.gridBagConstraintsConteosFisicos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConteosFisicos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConteosFisicos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
					this.gridBagConstraintsConteosFisicos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConteosFisicos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConteosFisicos.gridx = 0;
					
				
					this.jContentPaneDetalleConteosFisicos.add(jPanelCamposOcultosConteosFisicos, gridBagConstraintsConteosFisicos);
				
					this.jPanelCamposOcultosConteosFisicos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConteosFisicos.gridx = 0;
	        this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConteosFisicos.add(this.jPanelAccionesFormularioConteosFisicos, this.gridBagConstraintsConteosFisicos);							
			
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
	        this.gridBagConstraintsConteosFisicos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConteosFisicos.gridx = 0;
	        
			
			this.jContentPaneDetalleConteosFisicos.add(this.jPanelAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConteosFisicos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConteosFisicos=   new JScrollPane(this.jPanelCamposConteosFisicos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConteosFisicos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConteosFisicos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConteosFisicos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConteosFisicos.gridx = 0;
			this.gridBagConstraintsConteosFisicos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConteosFisicos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConteosFisicos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConteosFisicos, this.gridBagConstraintsConteosFisicos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConteosFisicos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConteosFisicos, this.gridBagConstraintsConteosFisicos);			
			
			this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
			this.gridBagConstraintsConteosFisicos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConteosFisicos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConteosFisicos, this.gridBagConstraintsConteosFisicos);
			
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConteosFisicos, this.gridBagConstraintsConteosFisicos);
		
			
		this.gridBagConstraintsConteosFisicos = new GridBagConstraints();
		this.gridBagConstraintsConteosFisicos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConteosFisicos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConteosFisicos, this.gridBagConstraintsConteosFisicos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConteosFisicos;//jContentPane;
		
		return jScrollPanelDatosEdicionConteosFisicos;
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
