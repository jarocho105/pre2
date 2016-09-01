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
import com.bydan.erp.inventario.util.report.AntiguedadesInventariosConstantesFunciones;

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
public class AntiguedadesInventariosDetalleFormJInternalFrame extends AntiguedadesInventariosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAntiguedadesInventarios;
	
	protected JMenuBar jmenuBarDetalleAntiguedadesInventarios;
	
	protected JMenu jmenuDetalleAntiguedadesInventarios;
	protected JMenu jmenuDetalleArchivoAntiguedadesInventarios;
	protected JMenu jmenuDetalleAccionesAntiguedadesInventarios;
	protected JMenu jmenuDetalleDatosAntiguedadesInventarios;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAntiguedadesInventarios;	
	protected GridBagConstraints gridBagConstraintsAntiguedadesInventarios;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AntiguedadesInventariosBeanSwingJInternalFrameAdditional jInternalFrameDetalleAntiguedadesInventarios;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

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
	
	public AntiguedadesInventariosSessionBean antiguedadesinventariosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public AntiguedadesInventariosLogic antiguedadesinventariosLogic;
	
	public JScrollPane jScrollPanelDatosAntiguedadesInventarios;
	public JScrollPane jScrollPanelDatosEdicionAntiguedadesInventarios;
	public JScrollPane jScrollPanelDatosGeneralAntiguedadesInventarios;
	
	protected JPanel jPanelCamposAntiguedadesInventarios;    
	protected JPanel jPanelCamposOcultosAntiguedadesInventarios;    	
	protected JPanel jPanelAccionesAntiguedadesInventarios;
	protected JPanel jPanelAccionesFormularioAntiguedadesInventarios;
    
	
	
	protected Integer iXPanelCamposAntiguedadesInventarios=0;
	protected Integer iYPanelCamposAntiguedadesInventarios=0;
	
	protected Integer iXPanelCamposOcultosAntiguedadesInventarios=0;
	protected Integer iYPanelCamposOcultosAntiguedadesInventarios=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAntiguedadesInventarios;
	public JButton jButtonModificarAntiguedadesInventarios;
	public JButton jButtonActualizarAntiguedadesInventarios;
    public JButton jButtonEliminarAntiguedadesInventarios;
	public JButton jButtonCancelarAntiguedadesInventarios;
    public JButton jButtonGuardarCambiosAntiguedadesInventarios;
	public JButton jButtonGuardarCambiosTablaAntiguedadesInventarios;
	protected JButton jButtonCerrarAntiguedadesInventarios;
	
	
	protected JButton jButtonProcesarInformacionAntiguedadesInventarios;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAntiguedadesInventarios;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAntiguedadesInventarios;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAntiguedadesInventarios;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAntiguedadesInventarios;
	protected JButton jButtonModificarToolBarAntiguedadesInventarios;
	protected JButton jButtonActualizarToolBarAntiguedadesInventarios;
    protected JButton jButtonEliminarToolBarAntiguedadesInventarios;
	protected JButton jButtonCancelarToolBarAntiguedadesInventarios;
    protected JButton jButtonGuardarCambiosToolBarAntiguedadesInventarios;
	protected JButton jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios;
	protected JButton jButtonMostrarOcultarTablaToolBarAntiguedadesInventarios;
	protected JButton jButtonCerrarToolBarAntiguedadesInventarios;
	
	protected JButton jButtonProcesarInformacionToolBarAntiguedadesInventarios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAntiguedadesInventarios;
	protected JMenuItem jMenuItemModificarAntiguedadesInventarios;
	protected JMenuItem jMenuItemActualizarAntiguedadesInventarios;
    protected JMenuItem jMenuItemEliminarAntiguedadesInventarios;
	protected JMenuItem jMenuItemCancelarAntiguedadesInventarios;
    protected JMenuItem jMenuItemGuardarCambiosAntiguedadesInventarios;
	protected JMenuItem jMenuItemGuardarCambiosTablaAntiguedadesInventarios;
	protected JMenuItem jMenuItemCerrarAntiguedadesInventarios;
	protected JMenuItem jMenuItemDetalleCerrarAntiguedadesInventarios;
	protected JMenuItem jMenuItemDetalleMostarOcultarAntiguedadesInventarios;
	
	protected JMenuItem jMenuItemProcesarInformacionAntiguedadesInventarios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAntiguedadesInventarios;
	protected JMenuItem jMenuItemMostrarOcultarAntiguedadesInventarios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAntiguedadesInventarios;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAntiguedadesInventarios;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAntiguedadesInventarios;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAntiguedadesInventarios;
	public JLabel jLabelIdAntiguedadesInventarios;
	public JLabel jLabelidAntiguedadesInventarios;
	public JButton jButtonidAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_venta_hastaAntiguedadesInventarios;
	public JLabel jLabelfecha_ultima_venta_hastaAntiguedadesInventarios;
	//public JFormattedTextField jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios;

	public JDateChooser jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios;
	public JButton jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalAntiguedadesInventarios;
	public JLabel jLabelnombre_sucursalAntiguedadesInventarios;
	public JTextArea jTextAreanombre_sucursalAntiguedadesInventarios;
	public JScrollPane jscrollPanenombre_sucursalAntiguedadesInventarios;
	public JButton jButtonnombre_sucursalAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaAntiguedadesInventarios;
	public JLabel jLabelnombre_lineaAntiguedadesInventarios;
	public JTextArea jTextAreanombre_lineaAntiguedadesInventarios;
	public JScrollPane jscrollPanenombre_lineaAntiguedadesInventarios;
	public JButton jButtonnombre_lineaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoAntiguedadesInventarios;
	public JLabel jLabelnombre_linea_grupoAntiguedadesInventarios;
	public JTextArea jTextAreanombre_linea_grupoAntiguedadesInventarios;
	public JScrollPane jscrollPanenombre_linea_grupoAntiguedadesInventarios;
	public JButton jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaAntiguedadesInventarios;
	public JLabel jLabelnombre_linea_categoriaAntiguedadesInventarios;
	public JTextArea jTextAreanombre_linea_categoriaAntiguedadesInventarios;
	public JScrollPane jscrollPanenombre_linea_categoriaAntiguedadesInventarios;
	public JButton jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaAntiguedadesInventarios;
	public JLabel jLabelnombre_linea_marcaAntiguedadesInventarios;
	public JTextArea jTextAreanombre_linea_marcaAntiguedadesInventarios;
	public JScrollPane jscrollPanenombre_linea_marcaAntiguedadesInventarios;
	public JButton jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAntiguedadesInventarios;
	public JLabel jLabelcodigoAntiguedadesInventarios;
	public JTextField jTextFieldcodigoAntiguedadesInventarios;
	public JButton jButtoncodigoAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombreAntiguedadesInventarios;
	public JLabel jLabelnombreAntiguedadesInventarios;
	public JTextArea jTextAreanombreAntiguedadesInventarios;
	public JScrollPane jscrollPanenombreAntiguedadesInventarios;
	public JButton jButtonnombreAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaAntiguedadesInventarios;
	public JLabel jLabelnombre_bodegaAntiguedadesInventarios;
	public JTextArea jTextAreanombre_bodegaAntiguedadesInventarios;
	public JScrollPane jscrollPanenombre_bodegaAntiguedadesInventarios;
	public JButton jButtonnombre_bodegaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadAntiguedadesInventarios;
	public JLabel jLabelnombre_unidadAntiguedadesInventarios;
	public JTextField jTextFieldnombre_unidadAntiguedadesInventarios;
	public JButton jButtonnombre_unidadAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleAntiguedadesInventarios;
	public JLabel jLabelcantidad_disponibleAntiguedadesInventarios;
	public JTextField jTextFieldcantidad_disponibleAntiguedadesInventarios;
	public JButton jButtoncantidad_disponibleAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_compraAntiguedadesInventarios;
	public JLabel jLabelfecha_ultima_compraAntiguedadesInventarios;
	//public JFormattedTextField jDateChooserfecha_ultima_compraAntiguedadesInventarios;

	public JDateChooser jDateChooserfecha_ultima_compraAntiguedadesInventarios;
	public JButton jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_ventaAntiguedadesInventarios;
	public JLabel jLabelfecha_ultima_ventaAntiguedadesInventarios;
	//public JFormattedTextField jDateChooserfecha_ultima_ventaAntiguedadesInventarios;

	public JDateChooser jDateChooserfecha_ultima_ventaAntiguedadesInventarios;
	public JButton jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaAntiguedadesInventarios;
	public JLabel jLabelid_bodegaAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaAntiguedadesInventarios;
	public JButton jButtonid_bodegaAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_bodegaAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaAntiguedadesInventarios;
	public JLabel jLabelid_empresaAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAntiguedadesInventarios;
	public JButton jButtonid_empresaAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_empresaAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_empresaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAntiguedadesInventarios;
	public JLabel jLabelid_sucursalAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAntiguedadesInventarios;
	public JButton jButtonid_sucursalAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_sucursalAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaAntiguedadesInventarios;
	public JLabel jLabelid_lineaAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaAntiguedadesInventarios;
	public JButton jButtonid_lineaAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_lineaAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_lineaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoAntiguedadesInventarios;
	public JLabel jLabelid_linea_grupoAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoAntiguedadesInventarios;
	public JButton jButtonid_linea_grupoAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_linea_grupoAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaAntiguedadesInventarios;
	public JLabel jLabelid_linea_categoriaAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaAntiguedadesInventarios;
	public JButton jButtonid_linea_categoriaAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_linea_categoriaAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaAntiguedadesInventariosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaAntiguedadesInventarios;
	public JLabel jLabelid_linea_marcaAntiguedadesInventarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaAntiguedadesInventarios;
	public JButton jButtonid_linea_marcaAntiguedadesInventarios= new JButtonMe();
	public JButton jButtonid_linea_marcaAntiguedadesInventariosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaAntiguedadesInventariosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAntiguedadesInventarios;
	
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
	public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AntiguedadesInventariosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAntiguedadesInventarios=new JPanel();
				this.jPanelAccionesFormularioAntiguedadesInventarios=new JPanel();
				this.jmenuBarDetalleAntiguedadesInventarios=new JMenuBar();
				this.jTtoolBarDetalleAntiguedadesInventarios=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AntiguedadesInventariosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AntiguedadesInventariosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AntiguedadesInventarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAntiguedadesInventarios() {
		return this.jButtonActualizarToolBarAntiguedadesInventarios;
	}
	
	public JButton getjButtonEliminarToolBarAntiguedadesInventarios() {
		return this.jButtonEliminarToolBarAntiguedadesInventarios;
	}
	
	public JButton getjButtonCancelarToolBarAntiguedadesInventarios() {
		return this.jButtonCancelarToolBarAntiguedadesInventarios;
	}		
	
	public JButton getjButtonProcesarInformacionAntiguedadesInventarios() {
		return this.jButtonProcesarInformacionAntiguedadesInventarios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAntiguedadesInventarios)	{
		this.jButtonProcesarInformacionAntiguedadesInventarios = jButtonProcesarInformacionAntiguedadesInventarios;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAntiguedadesInventarios() {
		return this.jComboBoxTiposAccionesAntiguedadesInventarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAntiguedadesInventarios(
			JComboBox jComboBoxTiposRelacionesAntiguedadesInventarios) {
		this.jComboBoxTiposRelacionesAntiguedadesInventarios = jComboBoxTiposRelacionesAntiguedadesInventarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAntiguedadesInventarios(
			JComboBox jComboBoxTiposAccionesAntiguedadesInventarios) {
		this.jComboBoxTiposAccionesAntiguedadesInventarios = jComboBoxTiposAccionesAntiguedadesInventarios;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAntiguedadesInventarios() {
		return this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAntiguedadesInventarios(
			JComboBox jComboBoxTiposAccionesFormularioAntiguedadesInventarios) {
		this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios = jComboBoxTiposAccionesFormularioAntiguedadesInventarios;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
		
		this.antiguedadesinventariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.antiguedadesinventariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AntiguedadesInventariosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AntiguedadesInventariosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AntiguedadesInventariosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Antiguedades Inventarios MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
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
	
		AntiguedadesInventariosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAntiguedadesInventarios= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAntiguedadesInventarios=new JButtonMe();
				this.jButtonModificarToolBarAntiguedadesInventarios=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAntiguedadesInventarios,this.jTtoolBarDetalleAntiguedadesInventarios,
							"actualizar","actualizar","Actualizar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAntiguedadesInventarios,this.jTtoolBarDetalleAntiguedadesInventarios,
							"eliminar","eliminar","Eliminar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAntiguedadesInventarios,this.jTtoolBarDetalleAntiguedadesInventarios,
							"cancelar","cancelar","Cancelar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAntiguedadesInventarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAntiguedadesInventarios,this.jTtoolBarDetalleAntiguedadesInventarios,
							"guardarcambios","guardarcambios","Guardar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAntiguedadesInventarios=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAntiguedadesInventarios=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAntiguedadesInventarios=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAntiguedadesInventarios=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAntiguedadesInventarios=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAntiguedadesInventarios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAntiguedadesInventarios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAntiguedadesInventarios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAntiguedadesInventarios= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAntiguedadesInventarios.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAntiguedadesInventarios,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAntiguedadesInventarios= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAntiguedadesInventarios.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAntiguedadesInventarios,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAntiguedadesInventarios= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAntiguedadesInventarios.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAntiguedadesInventarios,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAntiguedadesInventarios= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAntiguedadesInventarios.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAntiguedadesInventarios,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAntiguedadesInventarios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAntiguedadesInventarios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAntiguedadesInventarios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAntiguedadesInventarios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAntiguedadesInventarios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAntiguedadesInventarios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAntiguedadesInventarios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAntiguedadesInventarios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAntiguedadesInventarios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAntiguedadesInventarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAntiguedadesInventarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAntiguedadesInventarios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAntiguedadesInventarios.add(this.jMenuItemDetalleCerrarAntiguedadesInventarios);
		
		this.jmenuDetalleAccionesAntiguedadesInventarios.add(this.jMenuItemActualizarAntiguedadesInventarios);
		this.jmenuDetalleAccionesAntiguedadesInventarios.add(this.jMenuItemEliminarAntiguedadesInventarios);
		this.jmenuDetalleAccionesAntiguedadesInventarios.add(this.jMenuItemCancelarAntiguedadesInventarios);		
		
		//this.jmenuDetalleDatosAntiguedadesInventarios.add(this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios);				
		this.jmenuDetalleDatosAntiguedadesInventarios.add(this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios);				
				
		//this.jmenuDetalleAccionesAntiguedadesInventarios.add(this.jMenuItemGuardarCambiosAntiguedadesInventarios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAntiguedadesInventarios.add(this.jmenuDetalleArchivoAntiguedadesInventarios);		
		this.jmenuBarDetalleAntiguedadesInventarios.add(this.jmenuDetalleAccionesAntiguedadesInventarios);		
		this.jmenuBarDetalleAntiguedadesInventarios.add(this.jmenuDetalleDatosAntiguedadesInventarios);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAntiguedadesInventarios);				
	}
	
	
	public void inicializarElementosCamposAntiguedadesInventarios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAntiguedadesInventarios = new JLabelMe();
		jLabelIdAntiguedadesInventarios.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAntiguedadesInventarios = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAntiguedadesInventarios= new GridBagLayout();

		this.jPanelidAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);

		jLabelidAntiguedadesInventarios = new JLabel();
		jLabelidAntiguedadesInventarios.setText("Id");

		jLabelidAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ultima_venta_hastaAntiguedadesInventarios = new JLabelMe();
		this.jLabelfecha_ultima_venta_hastaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA+" : *");
		this.jLabelfecha_ultima_venta_hastaAntiguedadesInventarios.setToolTipText("Fecha Ultima Venta Hasta");
		this.jLabelfecha_ultima_venta_hastaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_venta_hastaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_venta_hastaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		//jFormattedTextFieldfecha_ultima_venta_hastaAntiguedadesInventarios= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios= new JDateChooser();
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setEnabled(false);
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setDate(new Date());
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_venta_hastaAntiguedadesInventarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_venta_hastaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_sucursalAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalAntiguedadesInventarios.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_sucursalAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombre_sucursalAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombre_sucursalAntiguedadesInventarios.setEnabled(false);
		jTextAreanombre_sucursalAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombre_sucursalAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombre_sucursalAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalAntiguedadesInventarios = new JScrollPane(jTextAreanombre_sucursalAntiguedadesInventarios);
		jscrollPanenombre_sucursalAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_lineaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaAntiguedadesInventarios.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_lineaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombre_lineaAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombre_lineaAntiguedadesInventarios.setEnabled(false);
		jTextAreanombre_lineaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombre_lineaAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombre_lineaAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaAntiguedadesInventarios = new JScrollPane(jTextAreanombre_lineaAntiguedadesInventarios);
		jscrollPanenombre_lineaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_linea_grupoAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoAntiguedadesInventarios.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_linea_grupoAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombre_linea_grupoAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setEnabled(false);
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoAntiguedadesInventarios = new JScrollPane(jTextAreanombre_linea_grupoAntiguedadesInventarios);
		jscrollPanenombre_linea_grupoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_linea_categoriaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaAntiguedadesInventarios.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_linea_categoriaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombre_linea_categoriaAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setEnabled(false);
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaAntiguedadesInventarios = new JScrollPane(jTextAreanombre_linea_categoriaAntiguedadesInventarios);
		jscrollPanenombre_linea_categoriaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_linea_marcaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaAntiguedadesInventarios.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_linea_marcaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombre_linea_marcaAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setEnabled(false);
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaAntiguedadesInventarios = new JScrollPane(jTextAreanombre_linea_marcaAntiguedadesInventarios);
		jscrollPanenombre_linea_marcaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoAntiguedadesInventarios = new JLabelMe();
		this.jLabelcodigoAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoAntiguedadesInventarios.setToolTipText("Codigo");
		this.jLabelcodigoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelcodigoAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextFieldcodigoAntiguedadesInventarios= new JTextFieldMe();

		jTextFieldcodigoAntiguedadesInventarios.setEnabled(false);
		jTextFieldcodigoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtoncodigoAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAntiguedadesInventariosBusqueda.setText("U");
		this.jButtoncodigoAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombreAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombreAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAntiguedadesInventarios.setToolTipText("Nombre");
		this.jLabelnombreAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombreAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombreAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombreAntiguedadesInventarios.setEnabled(false);
		jTextAreanombreAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombreAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombreAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreAntiguedadesInventarios = new JScrollPane(jTextAreanombreAntiguedadesInventarios);
		jscrollPanenombreAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombreAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombreAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_bodegaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaAntiguedadesInventarios.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_bodegaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextAreanombre_bodegaAntiguedadesInventarios= new JTextAreaMe();
		jTextAreanombre_bodegaAntiguedadesInventarios.setEnabled(false);
		jTextAreanombre_bodegaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaAntiguedadesInventarios.setLineWrap(true);
		jTextAreanombre_bodegaAntiguedadesInventarios.setWrapStyleWord(true);
		jTextAreanombre_bodegaAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaAntiguedadesInventarios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaAntiguedadesInventarios = new JScrollPane(jTextAreanombre_bodegaAntiguedadesInventarios);
		jscrollPanenombre_bodegaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadAntiguedadesInventarios = new JLabelMe();
		this.jLabelnombre_unidadAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadAntiguedadesInventarios.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelnombre_unidadAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextFieldnombre_unidadAntiguedadesInventarios= new JTextFieldMe();

		jTextFieldnombre_unidadAntiguedadesInventarios.setEnabled(false);
		jTextFieldnombre_unidadAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleAntiguedadesInventarios = new JLabelMe();
		this.jLabelcantidad_disponibleAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleAntiguedadesInventarios.setToolTipText("Cantad Disponible");
		this.jLabelcantidad_disponibleAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelcantidad_disponibleAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jTextFieldcantidad_disponibleAntiguedadesInventarios= new JTextFieldMe();
		jTextFieldcantidad_disponibleAntiguedadesInventarios.setEnabled(false);
		jTextFieldcantidad_disponibleAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleAntiguedadesInventarios.setText("0");

		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setText("U");
		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_compraAntiguedadesInventarios = new JLabelMe();
		this.jLabelfecha_ultima_compraAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA+" : *");
		this.jLabelfecha_ultima_compraAntiguedadesInventarios.setToolTipText("Fecha Ultima Compra");
		this.jLabelfecha_ultima_compraAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_compraAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_compraAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_compraAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_compraAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_compraAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelfecha_ultima_compraAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		//jFormattedTextFieldfecha_ultima_compraAntiguedadesInventarios= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_compraAntiguedadesInventarios= new JDateChooser();
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.setEnabled(false);
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_compraAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.setDate(new Date());
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_compraAntiguedadesInventarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_compraAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_compraAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_ventaAntiguedadesInventarios = new JLabelMe();
		this.jLabelfecha_ultima_ventaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA+" : *");
		this.jLabelfecha_ultima_ventaAntiguedadesInventarios.setToolTipText("Fecha Ultima Venta");
		this.jLabelfecha_ultima_ventaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_ventaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_ventaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_ventaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelfecha_ultima_ventaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		//jFormattedTextFieldfecha_ultima_ventaAntiguedadesInventarios= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_ventaAntiguedadesInventarios= new JDateChooser();
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setEnabled(false);
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_ventaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setDate(new Date());
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_ventaAntiguedadesInventarios.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_ventaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_ventaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAntiguedadesInventarios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_bodegaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaAntiguedadesInventarios.setToolTipText("Bodega");
		this.jLabelid_bodegaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_bodegaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_bodegaAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_bodegaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_bodegaAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_bodegaAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaAntiguedadesInventarios"));

		this.jButtonid_bodegaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_bodegaAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_bodegaAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaAntiguedadesInventariosUpdate"));



					
		this.jLabelid_empresaAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_empresaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAntiguedadesInventarios.setToolTipText("Empresa");
		this.jLabelid_empresaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_empresaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_empresaAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_empresaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAntiguedadesInventarios.setEnabled(false);

		this.jButtonid_empresaAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_empresaAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_empresaAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAntiguedadesInventarios"));

		this.jButtonid_empresaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_empresaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_empresaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_empresaAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_empresaAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_empresaAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAntiguedadesInventariosUpdate"));



					
		this.jLabelid_sucursalAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_sucursalAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAntiguedadesInventarios.setToolTipText("Sucursal");
		this.jLabelid_sucursalAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_sucursalAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_sucursalAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_sucursalAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAntiguedadesInventarios.setEnabled(false);

		this.jButtonid_sucursalAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_sucursalAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_sucursalAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAntiguedadesInventarios"));

		this.jButtonid_sucursalAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_sucursalAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_sucursalAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAntiguedadesInventariosUpdate"));



					
		this.jLabelid_lineaAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_lineaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaAntiguedadesInventarios.setToolTipText("Linea");
		this.jLabelid_lineaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_lineaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_lineaAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_lineaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_lineaAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_lineaAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaAntiguedadesInventarios"));

		this.jButtonid_lineaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_lineaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_lineaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_lineaAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_lineaAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_lineaAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaAntiguedadesInventariosUpdate"));



					
		this.jLabelid_linea_grupoAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_linea_grupoAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoAntiguedadesInventarios.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_linea_grupoAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_linea_grupoAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_linea_grupoAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_linea_grupoAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_linea_grupoAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoAntiguedadesInventarios"));

		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_linea_grupoAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoAntiguedadesInventariosUpdate"));



					
		this.jLabelid_linea_categoriaAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_linea_categoriaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaAntiguedadesInventarios.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_linea_categoriaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_linea_categoriaAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_linea_categoriaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_linea_categoriaAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_linea_categoriaAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaAntiguedadesInventarios"));

		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaAntiguedadesInventariosUpdate"));



					
		this.jLabelid_linea_marcaAntiguedadesInventarios = new JLabelMe();
		this.jLabelid_linea_marcaAntiguedadesInventarios.setText(""+AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaAntiguedadesInventarios.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaAntiguedadesInventarios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaAntiguedadesInventarios.setToolTipText(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		this.jPanelid_linea_marcaAntiguedadesInventarios.setLayout(this.gridaBagLayoutAntiguedadesInventarios);


		jComboBoxid_linea_marcaAntiguedadesInventarios= new JComboBoxMe();
		jComboBoxid_linea_marcaAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaAntiguedadesInventarios= new JButtonMe();
		this.jButtonid_linea_marcaAntiguedadesInventarios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaAntiguedadesInventarios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaAntiguedadesInventarios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaAntiguedadesInventarios.setText("Buscar");
		this.jButtonid_linea_marcaAntiguedadesInventarios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaAntiguedadesInventarios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaAntiguedadesInventarios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaAntiguedadesInventarios"));

		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setText("U");
		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaAntiguedadesInventariosBusqueda"));

		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaAntiguedadesInventariosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaAntiguedadesInventariosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaAntiguedadesInventariosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaAntiguedadesInventariosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaAntiguedadesInventariosUpdate.setText("U");
		this.jButtonid_linea_marcaAntiguedadesInventariosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaAntiguedadesInventariosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaAntiguedadesInventariosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaAntiguedadesInventariosUpdate"));



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
		//this.jInternalFrameDetalleAntiguedadesInventarios = new AntiguedadesInventariosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Antiguedades Inventarios DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAntiguedadesInventarios= new GridBagLayout();
		

		
		String sToolTipAntiguedadesInventarios="";
		sToolTipAntiguedadesInventarios=AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAntiguedadesInventarios+="(Inventario.AntiguedadesInventarios)";
		}
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			sToolTipAntiguedadesInventarios+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAntiguedadesInventarios = new JButtonMe();
		this.jButtonModificarAntiguedadesInventarios = new JButtonMe();
        this.jButtonActualizarAntiguedadesInventarios = new JButtonMe();
        this.jButtonEliminarAntiguedadesInventarios = new JButtonMe();
        this.jButtonCancelarAntiguedadesInventarios = new JButtonMe();
        this.jButtonGuardarCambiosAntiguedadesInventarios = new JButtonMe();
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios = new JButtonMe();
		this.jButtonCerrarAntiguedadesInventarios = new JButtonMe();
		
		this.jScrollPanelDatosAntiguedadesInventarios = new JScrollPane();   
        this.jScrollPanelDatosEdicionAntiguedadesInventarios = new JScrollPane();
		this.jScrollPanelDatosGeneralAntiguedadesInventarios = new JScrollPane();
				
		
		
		this.jPanelCamposAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Antiguedades Inventarios";
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Antiguedades Inventarioses" + this.sPath));
		} else {
			this.jScrollPanelDatosAntiguedadesInventarios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAntiguedadesInventarios.setName("jPanelCamposAntiguedadesInventarios"); 

		this.jPanelCamposOcultosAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAntiguedadesInventarios.setName("jPanelCamposOcultosAntiguedadesInventarios"); 

        this.jPanelAccionesAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAntiguedadesInventarios.setToolTipText("Acciones");
        this.jPanelAccionesAntiguedadesInventarios.setName("Acciones"); 

		this.jPanelAccionesFormularioAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAntiguedadesInventarios.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAntiguedadesInventarios.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAntiguedadesInventarios.setText("Nuevo");
		this.jButtonModificarAntiguedadesInventarios.setText("Editar");
        this.jButtonActualizarAntiguedadesInventarios.setText("Actualizar");
        this.jButtonEliminarAntiguedadesInventarios.setText("Eliminar");
        this.jButtonCancelarAntiguedadesInventarios.setText("Cancelar");
        this.jButtonGuardarCambiosAntiguedadesInventarios.setText("Guardar");
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.setText("Guardar");
		this.jButtonCerrarAntiguedadesInventarios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAntiguedadesInventarios,"nuevo_button","Nuevo",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAntiguedadesInventarios,"modificar_button","Editar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAntiguedadesInventarios,"actualizar_button","Actualizar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAntiguedadesInventarios,"eliminar_button","Eliminar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAntiguedadesInventarios,"cancelar_button","Cancelar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAntiguedadesInventarios,"guardarcambios_button","Guardar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAntiguedadesInventarios,"guardarcambiostabla_button","Guardar",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAntiguedadesInventarios,"cerrar_button","Salir",this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAntiguedadesInventarios.setToolTipText("Nuevo"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAntiguedadesInventarios.setToolTipText("Editar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAntiguedadesInventarios.setToolTipText("Actualizar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAntiguedadesInventarios.setToolTipText("Eliminar)"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAntiguedadesInventarios.setToolTipText("Cancelar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAntiguedadesInventarios.setToolTipText("Guardar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.setToolTipText("Guardar"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAntiguedadesInventarios.setToolTipText("Salir"+" "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAntiguedadesInventarios";
		inputMap = this.jButtonNuevoAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAntiguedadesInventarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAntiguedadesInventarios"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAntiguedadesInventarios";
		inputMap = this.jButtonActualizarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAntiguedadesInventarios"));
		
		//ELIMINAR
		sMapKey = "EliminarAntiguedadesInventarios";
		inputMap = this.jButtonEliminarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAntiguedadesInventarios"));
		
		//CANCELAR	
		sMapKey = "CancelarAntiguedadesInventarios";
		inputMap = this.jButtonCancelarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAntiguedadesInventarios"));
		
		//CERRAR		
		sMapKey = "CerrarAntiguedadesInventarios";
		inputMap = this.jButtonCerrarAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAntiguedadesInventarios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAntiguedadesInventarios";
		inputMap = this.jButtonGuardarCambiosTablaAntiguedadesInventarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAntiguedadesInventarios"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAntiguedadesInventarios = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAntiguedadesInventarios.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAntiguedadesInventarios.setToolTipText("Nuevo AntiguedadesInventarios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAntiguedadesInventarios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAntiguedadesInventarios.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAntiguedadesInventarios.setToolTipText("Sin Cerrar Ventana AntiguedadesInventarios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAntiguedadesInventarios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAntiguedadesInventarios.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAntiguedadesInventarios.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAntiguedadesInventarios.setText("Accion");
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAntiguedadesInventarios = new JLabelMe();
		
		this.jLabelAccionesAntiguedadesInventarios.setText("Acciones");		
		this.jLabelAccionesAntiguedadesInventarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAntiguedadesInventarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAntiguedadesInventarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAntiguedadesInventarios();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAntiguedadesInventarios();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAntiguedadesInventarios=new JTabbedPane();
		this.jTabbedPaneRelacionesAntiguedadesInventarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAntiguedadesInventarios,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAntiguedadesInventarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAntiguedadesInventarios = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAntiguedadesInventarios = new GridBagLayout();
		
		this.jPanelCamposAntiguedadesInventarios.setLayout(gridaBagLayoutCamposAntiguedadesInventarios);
		this.jPanelCamposOcultosAntiguedadesInventarios.setLayout(gridaBagLayoutCamposOcultosAntiguedadesInventarios);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAntiguedadesInventarios.add(jLabelIdAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAntiguedadesInventarios.add(jLabelidAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaAntiguedadesInventarios.add(jLabelid_bodegaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaAntiguedadesInventarios.add(jButtonid_bodegaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaAntiguedadesInventarios.add(jButtonid_bodegaAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaAntiguedadesInventarios.add(jComboBoxid_bodegaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAntiguedadesInventarios.add(jLabelid_empresaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAntiguedadesInventarios.add(jButtonid_empresaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAntiguedadesInventarios.add(jButtonid_empresaAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAntiguedadesInventarios.add(jComboBoxid_empresaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAntiguedadesInventarios.add(jLabelid_sucursalAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAntiguedadesInventarios.add(jButtonid_sucursalAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAntiguedadesInventarios.add(jButtonid_sucursalAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAntiguedadesInventarios.add(jComboBoxid_sucursalAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaAntiguedadesInventarios.add(jLabelid_lineaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaAntiguedadesInventarios.add(jButtonid_lineaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaAntiguedadesInventarios.add(jButtonid_lineaAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaAntiguedadesInventarios.add(jComboBoxid_lineaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoAntiguedadesInventarios.add(jLabelid_linea_grupoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoAntiguedadesInventarios.add(jButtonid_linea_grupoAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoAntiguedadesInventarios.add(jButtonid_linea_grupoAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoAntiguedadesInventarios.add(jComboBoxid_linea_grupoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaAntiguedadesInventarios.add(jLabelid_linea_categoriaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaAntiguedadesInventarios.add(jButtonid_linea_categoriaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaAntiguedadesInventarios.add(jButtonid_linea_categoriaAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaAntiguedadesInventarios.add(jComboBoxid_linea_categoriaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaAntiguedadesInventarios.add(jLabelid_linea_marcaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaAntiguedadesInventarios.add(jButtonid_linea_marcaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 3;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaAntiguedadesInventarios.add(jButtonid_linea_marcaAntiguedadesInventariosUpdate, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaAntiguedadesInventarios.add(jComboBoxid_linea_marcaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios.add(jLabelfecha_ultima_venta_hastaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios.add(jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios.add(jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalAntiguedadesInventarios.add(jLabelnombre_sucursalAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalAntiguedadesInventarios.add(jButtonnombre_sucursalAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalAntiguedadesInventarios.add(jscrollPanenombre_sucursalAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaAntiguedadesInventarios.add(jLabelnombre_lineaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaAntiguedadesInventarios.add(jButtonnombre_lineaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaAntiguedadesInventarios.add(jscrollPanenombre_lineaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoAntiguedadesInventarios.add(jLabelnombre_linea_grupoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoAntiguedadesInventarios.add(jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoAntiguedadesInventarios.add(jscrollPanenombre_linea_grupoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaAntiguedadesInventarios.add(jLabelnombre_linea_categoriaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaAntiguedadesInventarios.add(jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaAntiguedadesInventarios.add(jscrollPanenombre_linea_categoriaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaAntiguedadesInventarios.add(jLabelnombre_linea_marcaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaAntiguedadesInventarios.add(jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaAntiguedadesInventarios.add(jscrollPanenombre_linea_marcaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoAntiguedadesInventarios.add(jLabelcodigoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAntiguedadesInventarios.add(jButtoncodigoAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoAntiguedadesInventarios.add(jTextFieldcodigoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAntiguedadesInventarios.add(jLabelnombreAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAntiguedadesInventarios.add(jButtonnombreAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAntiguedadesInventarios.add(jscrollPanenombreAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaAntiguedadesInventarios.add(jLabelnombre_bodegaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaAntiguedadesInventarios.add(jButtonnombre_bodegaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaAntiguedadesInventarios.add(jscrollPanenombre_bodegaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadAntiguedadesInventarios.add(jLabelnombre_unidadAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadAntiguedadesInventarios.add(jButtonnombre_unidadAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadAntiguedadesInventarios.add(jTextFieldnombre_unidadAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleAntiguedadesInventarios.add(jLabelcantidad_disponibleAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleAntiguedadesInventarios.add(jButtoncantidad_disponibleAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleAntiguedadesInventarios.add(jTextFieldcantidad_disponibleAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_compraAntiguedadesInventarios.add(jLabelfecha_ultima_compraAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_compraAntiguedadesInventarios.add(jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_compraAntiguedadesInventarios.add(jDateChooserfecha_ultima_compraAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_ventaAntiguedadesInventarios.add(jLabelfecha_ultima_ventaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		//this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 2;
		this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
		this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_ventaAntiguedadesInventarios.add(jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda, this.gridBagConstraintsAntiguedadesInventarios);
	}

	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = 1;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_ventaAntiguedadesInventarios.add(jDateChooserfecha_ultima_ventaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelidAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelid_bodegaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelid_lineaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelid_linea_grupoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelid_linea_categoriaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelid_linea_marcaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_sucursalAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_lineaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_linea_grupoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_linea_categoriaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_linea_marcaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelcodigoAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombreAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_bodegaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelnombre_unidadAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelcantidad_disponibleAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelfecha_ultima_compraAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAntiguedadesInventarios.add(this.jPanelfecha_ultima_ventaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposAntiguedadesInventarios % 2==0) {
		iXPanelCamposAntiguedadesInventarios=0;
		iYPanelCamposAntiguedadesInventarios++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposOcultosAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposOcultosAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAntiguedadesInventarios.add(this.jPanelid_empresaAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposOcultosAntiguedadesInventarios % 2==0) {
		iXPanelCamposOcultosAntiguedadesInventarios=0;
		iYPanelCamposOcultosAntiguedadesInventarios++;
	}
	this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAntiguedadesInventarios.gridy = iYPanelCamposOcultosAntiguedadesInventarios;
	this.gridBagConstraintsAntiguedadesInventarios.gridx = iXPanelCamposOcultosAntiguedadesInventarios++;
	this.gridBagConstraintsAntiguedadesInventarios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAntiguedadesInventarios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAntiguedadesInventarios.add(this.jPanelid_sucursalAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);



	if(iXPanelCamposOcultosAntiguedadesInventarios % 2==0) {
		iXPanelCamposOcultosAntiguedadesInventarios=0;
		iYPanelCamposOcultosAntiguedadesInventarios++;
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
			
		GridBagLayout gridaBagLayoutAccionesAntiguedadesInventarios= new GridBagLayout();
		this.jPanelAccionesAntiguedadesInventarios.setLayout(gridaBagLayoutAccionesAntiguedadesInventarios);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAntiguedadesInventarios= new GridBagLayout();
		this.jPanelAccionesFormularioAntiguedadesInventarios.setLayout(gridaBagLayoutAccionesFormularioAntiguedadesInventarios);
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAntiguedadesInventarios.add(this.jComboBoxTiposAccionesFormularioAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccion++;
			
		this.jPanelAccionesAntiguedadesInventarios.add(this.jButtonModificarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);							

		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;
		this.gridBagConstraintsAntiguedadesInventarios.gridx =iPosXAccion++;
			
		this.jPanelAccionesAntiguedadesInventarios.add(this.jButtonEliminarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
			
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccion++;
		
		this.jPanelAccionesAntiguedadesInventarios.add(this.jButtonActualizarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);


		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = iPosXAccion++;
		
		this.jPanelAccionesAntiguedadesInventarios.add(this.jButtonGuardarCambiosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);	
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = 0;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx =iPosXAccion++;
		
		this.jPanelAccionesAntiguedadesInventarios.add(this.jButtonCancelarAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAntiguedadesInventarios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAntiguedadesInventarios);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();						
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;		
			//this.gridBagConstraintsAntiguedadesInventarios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAntiguedadesInventarios.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAntiguedadesInventarios.gridx =0;
		this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAntiguedadesInventarios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAntiguedadesInventarios = new AntiguedadesInventariosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Antiguedades Inventarios DATOS");
			
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
			
	        //this.setTitle("[FOR] - Antiguedades Inventarios DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Antiguedades Inventarios Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AntiguedadesInventariosModel antiguedadesinventariosModel=new AntiguedadesInventariosModel(this);
			
			//SI USARA CLASE INTERNA
			//AntiguedadesInventariosModel.AntiguedadesInventariosFocusTraversalPolicy antiguedadesinventariosFocusTraversalPolicy = antiguedadesinventariosModel.new AntiguedadesInventariosFocusTraversalPolicy(this);
			
			//antiguedadesinventariosFocusTraversalPolicy.setantiguedadesinventariosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(antiguedadesinventariosModel);
			
			
			this.jContentPaneDetalleAntiguedadesInventarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAntiguedadesInventarios = new GridBagLayout();	
			this.jContentPaneDetalleAntiguedadesInventarios.setLayout(gridaBagLayoutDetalleAntiguedadesInventarios);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAntiguedadesInventarios = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
				this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
					
				
				this.jContentPaneDetalleAntiguedadesInventarios.add(jTtoolBarDetalleAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);								
				
}
			
			this.jScrollPanelDatosEdicionAntiguedadesInventarios=   new JScrollPane(jContentPaneDetalleAntiguedadesInventarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAntiguedadesInventarios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	        
			this.jContentPaneDetalleAntiguedadesInventarios.add(jPanelCamposAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);
			
			
			
			
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
						//&& antiguedadesinventariosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAntiguedadesInventarios= new GridBagConstraints();
						this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
						this.jContentPaneDetalleAntiguedadesInventarios.add(this.jTabbedPaneRelacionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAntiguedadesInventarios.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAntiguedadesInventarios.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
					this.gridBagConstraintsAntiguedadesInventarios.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
					
				
					this.jContentPaneDetalleAntiguedadesInventarios.add(jPanelCamposOcultosAntiguedadesInventarios, gridBagConstraintsAntiguedadesInventarios);
				
					this.jPanelCamposOcultosAntiguedadesInventarios.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	        this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAntiguedadesInventarios.add(this.jPanelAccionesFormularioAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);							
			
			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
	        this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
	        
			
			this.jContentPaneDetalleAntiguedadesInventarios.add(this.jPanelAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAntiguedadesInventarios);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAntiguedadesInventarios=   new JScrollPane(this.jPanelCamposAntiguedadesInventarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAntiguedadesInventarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAntiguedadesInventarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAntiguedadesInventarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
			this.gridBagConstraintsAntiguedadesInventarios.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAntiguedadesInventarios.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAntiguedadesInventarios.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);			
			
			this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
			this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
			
			
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		
			
		this.gridBagConstraintsAntiguedadesInventarios = new GridBagConstraints();
		this.gridBagConstraintsAntiguedadesInventarios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAntiguedadesInventarios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAntiguedadesInventarios, this.gridBagConstraintsAntiguedadesInventarios);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAntiguedadesInventarios;//jContentPane;
		
		return jScrollPanelDatosEdicionAntiguedadesInventarios;
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
