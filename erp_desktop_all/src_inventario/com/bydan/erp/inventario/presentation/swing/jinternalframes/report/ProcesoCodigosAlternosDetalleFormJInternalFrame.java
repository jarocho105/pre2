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
import com.bydan.erp.inventario.util.report.ProcesoCodigosAlternosConstantesFunciones;

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
public class ProcesoCodigosAlternosDetalleFormJInternalFrame extends ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCodigosAlternos;
	
	protected JMenuBar jmenuBarDetalleProcesoCodigosAlternos;
	
	protected JMenu jmenuDetalleProcesoCodigosAlternos;
	protected JMenu jmenuDetalleArchivoProcesoCodigosAlternos;
	protected JMenu jmenuDetalleAccionesProcesoCodigosAlternos;
	protected JMenu jmenuDetalleDatosProcesoCodigosAlternos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCodigosAlternos;	
	protected GridBagConstraints gridBagConstraintsProcesoCodigosAlternos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCodigosAlternos;		
	
	
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
	
	public ProcesoCodigosAlternosSessionBean procesocodigosalternosSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProcesoCodigosAlternosLogic procesocodigosalternosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCodigosAlternos;
	public JScrollPane jScrollPanelDatosEdicionProcesoCodigosAlternos;
	public JScrollPane jScrollPanelDatosGeneralProcesoCodigosAlternos;
	
	protected JPanel jPanelCamposProcesoCodigosAlternos;    
	protected JPanel jPanelCamposOcultosProcesoCodigosAlternos;    	
	protected JPanel jPanelAccionesProcesoCodigosAlternos;
	protected JPanel jPanelAccionesFormularioProcesoCodigosAlternos;
    
	
	
	protected Integer iXPanelCamposProcesoCodigosAlternos=0;
	protected Integer iYPanelCamposProcesoCodigosAlternos=0;
	
	protected Integer iXPanelCamposOcultosProcesoCodigosAlternos=0;
	protected Integer iYPanelCamposOcultosProcesoCodigosAlternos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCodigosAlternos;
	public JButton jButtonModificarProcesoCodigosAlternos;
	public JButton jButtonActualizarProcesoCodigosAlternos;
    public JButton jButtonEliminarProcesoCodigosAlternos;
	public JButton jButtonCancelarProcesoCodigosAlternos;
    public JButton jButtonGuardarCambiosProcesoCodigosAlternos;
	public JButton jButtonGuardarCambiosTablaProcesoCodigosAlternos;
	protected JButton jButtonCerrarProcesoCodigosAlternos;
	
	
	protected JButton jButtonProcesarInformacionProcesoCodigosAlternos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCodigosAlternos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCodigosAlternos;
	protected JButton jButtonModificarToolBarProcesoCodigosAlternos;
	protected JButton jButtonActualizarToolBarProcesoCodigosAlternos;
    protected JButton jButtonEliminarToolBarProcesoCodigosAlternos;
	protected JButton jButtonCancelarToolBarProcesoCodigosAlternos;
    protected JButton jButtonGuardarCambiosToolBarProcesoCodigosAlternos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCodigosAlternos;
	protected JButton jButtonCerrarToolBarProcesoCodigosAlternos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCodigosAlternos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCodigosAlternos;
	protected JMenuItem jMenuItemModificarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemActualizarProcesoCodigosAlternos;
    protected JMenuItem jMenuItemEliminarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemCancelarProcesoCodigosAlternos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCodigosAlternos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCodigosAlternos;
	protected JMenuItem jMenuItemCerrarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCodigosAlternos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCodigosAlternos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCodigosAlternos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCodigosAlternos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCodigosAlternos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCodigosAlternos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCodigosAlternos;
	public JLabel jLabelIdProcesoCodigosAlternos;
	public JLabel jLabelidProcesoCodigosAlternos;
	public JButton jButtonidProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoCodigosAlternos;
	public JLabel jLabelcodigoProcesoCodigosAlternos;
	public JTextArea jTextAreacodigoProcesoCodigosAlternos;
	public JScrollPane jscrollPanecodigoProcesoCodigosAlternos;
	public JButton jButtoncodigoProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProcesoCodigosAlternos;
	public JLabel jLabelnombre_unidadProcesoCodigosAlternos;
	public JTextField jTextFieldnombre_unidadProcesoCodigosAlternos;
	public JButton jButtonnombre_unidadProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteProcesoCodigosAlternos;
	public JLabel jLabelnombre_completo_clienteProcesoCodigosAlternos;
	public JTextArea jTextAreanombre_completo_clienteProcesoCodigosAlternos;
	public JScrollPane jscrollPanenombre_completo_clienteProcesoCodigosAlternos;
	public JButton jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoProcesoCodigosAlternos;
	public JLabel jLabelcodigo_productoProcesoCodigosAlternos;
	public JTextField jTextFieldcodigo_productoProcesoCodigosAlternos;
	public JButton jButtoncodigo_productoProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesoCodigosAlternos;
	public JLabel jLabelnombreProcesoCodigosAlternos;
	public JTextArea jTextAreanombreProcesoCodigosAlternos;
	public JScrollPane jscrollPanenombreProcesoCodigosAlternos;
	public JButton jButtonnombreProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos;
	public JLabel jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos;
	public JTextArea jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos;
	public JScrollPane jscrollPanenombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos;
	public JButton jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaProcesoCodigosAlternos;
	public JLabel jLabelid_bodegaProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProcesoCodigosAlternos;
	public JButton jButtonid_bodegaProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_bodegaProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProcesoCodigosAlternos;
	public JLabel jLabelid_productoProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProcesoCodigosAlternos;
	public JButton jButtonid_productoProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_productoProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_productoProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaProcesoCodigosAlternos;
	public JLabel jLabelid_empresaProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoCodigosAlternos;
	public JButton jButtonid_empresaProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_empresaProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoCodigosAlternos;
	public JLabel jLabelid_sucursalProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoCodigosAlternos;
	public JButton jButtonid_sucursalProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProcesoCodigosAlternos;
	public JLabel jLabelid_lineaProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProcesoCodigosAlternos;
	public JButton jButtonid_lineaProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_lineaProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_lineaProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProcesoCodigosAlternos;
	public JLabel jLabelid_linea_grupoProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProcesoCodigosAlternos;
	public JButton jButtonid_linea_grupoProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProcesoCodigosAlternos;
	public JLabel jLabelid_linea_categoriaProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProcesoCodigosAlternos;
	public JButton jButtonid_linea_categoriaProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProcesoCodigosAlternos;
	public JLabel jLabelid_linea_marcaProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProcesoCodigosAlternos;
	public JButton jButtonid_linea_marcaProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCodigosAlternos;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCodigosAlternosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCodigosAlternos=new JPanel();
				this.jPanelAccionesFormularioProcesoCodigosAlternos=new JPanel();
				this.jmenuBarDetalleProcesoCodigosAlternos=new JMenuBar();
				this.jTtoolBarDetalleProcesoCodigosAlternos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCodigosAlternosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCodigosAlternos() {
		return this.jButtonActualizarToolBarProcesoCodigosAlternos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCodigosAlternos() {
		return this.jButtonEliminarToolBarProcesoCodigosAlternos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCodigosAlternos() {
		return this.jButtonCancelarToolBarProcesoCodigosAlternos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCodigosAlternos() {
		return this.jButtonProcesarInformacionProcesoCodigosAlternos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCodigosAlternos)	{
		this.jButtonProcesarInformacionProcesoCodigosAlternos = jButtonProcesarInformacionProcesoCodigosAlternos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCodigosAlternos() {
		return this.jComboBoxTiposAccionesProcesoCodigosAlternos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposRelacionesProcesoCodigosAlternos) {
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos = jComboBoxTiposRelacionesProcesoCodigosAlternos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposAccionesProcesoCodigosAlternos) {
		this.jComboBoxTiposAccionesProcesoCodigosAlternos = jComboBoxTiposAccionesProcesoCodigosAlternos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCodigosAlternos() {
		return this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCodigosAlternos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCodigosAlternos) {
		this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos = jComboBoxTiposAccionesFormularioProcesoCodigosAlternos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
		
		this.procesocodigosalternosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocodigosalternosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocodigosalternosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCodigosAlternosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCodigosAlternosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCodigosAlternosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Codigos Alternos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCodigosAlternosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCodigosAlternos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCodigosAlternos=new JButtonMe();
				this.jButtonModificarToolBarProcesoCodigosAlternos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCodigosAlternos,this.jTtoolBarDetalleProcesoCodigosAlternos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCodigosAlternos,this.jTtoolBarDetalleProcesoCodigosAlternos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCodigosAlternos,this.jTtoolBarDetalleProcesoCodigosAlternos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCodigosAlternos,this.jTtoolBarDetalleProcesoCodigosAlternos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCodigosAlternos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCodigosAlternos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCodigosAlternos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCodigosAlternos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCodigosAlternos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCodigosAlternos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCodigosAlternos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCodigosAlternos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCodigosAlternos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCodigosAlternos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCodigosAlternos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCodigosAlternos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCodigosAlternos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCodigosAlternos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCodigosAlternos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCodigosAlternos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCodigosAlternos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCodigosAlternos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCodigosAlternos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCodigosAlternos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCodigosAlternos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCodigosAlternos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCodigosAlternos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCodigosAlternos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCodigosAlternos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCodigosAlternos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCodigosAlternos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCodigosAlternos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCodigosAlternos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCodigosAlternos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCodigosAlternos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCodigosAlternos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCodigosAlternos.add(this.jMenuItemDetalleCerrarProcesoCodigosAlternos);
		
		this.jmenuDetalleAccionesProcesoCodigosAlternos.add(this.jMenuItemActualizarProcesoCodigosAlternos);
		this.jmenuDetalleAccionesProcesoCodigosAlternos.add(this.jMenuItemEliminarProcesoCodigosAlternos);
		this.jmenuDetalleAccionesProcesoCodigosAlternos.add(this.jMenuItemCancelarProcesoCodigosAlternos);		
		
		//this.jmenuDetalleDatosProcesoCodigosAlternos.add(this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos);				
		this.jmenuDetalleDatosProcesoCodigosAlternos.add(this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos);				
				
		//this.jmenuDetalleAccionesProcesoCodigosAlternos.add(this.jMenuItemGuardarCambiosProcesoCodigosAlternos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCodigosAlternos.add(this.jmenuDetalleArchivoProcesoCodigosAlternos);		
		this.jmenuBarDetalleProcesoCodigosAlternos.add(this.jmenuDetalleAccionesProcesoCodigosAlternos);		
		this.jmenuBarDetalleProcesoCodigosAlternos.add(this.jmenuDetalleDatosProcesoCodigosAlternos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCodigosAlternos);				
	}
	
	
	public void inicializarElementosCamposProcesoCodigosAlternos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCodigosAlternos = new JLabelMe();
		jLabelIdProcesoCodigosAlternos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCodigosAlternos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCodigosAlternos= new GridBagLayout();

		this.jPanelidProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);

		jLabelidProcesoCodigosAlternos = new JLabel();
		jLabelidProcesoCodigosAlternos.setText("Id");

		jLabelidProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesoCodigosAlternos = new JLabelMe();
		this.jLabelcodigoProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoCodigosAlternos.setToolTipText("Codigo");
		this.jLabelcodigoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelcodigoProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jTextAreacodigoProcesoCodigosAlternos= new JTextAreaMe();
		jTextAreacodigoProcesoCodigosAlternos.setEnabled(false);
		jTextAreacodigoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoCodigosAlternos.setLineWrap(true);
		jTextAreacodigoProcesoCodigosAlternos.setWrapStyleWord(true);
		jTextAreacodigoProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoProcesoCodigosAlternos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoProcesoCodigosAlternos = new JScrollPane(jTextAreacodigoProcesoCodigosAlternos);
		jscrollPanecodigoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtoncodigoProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoCodigosAlternosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProcesoCodigosAlternos = new JLabelMe();
		this.jLabelnombre_unidadProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProcesoCodigosAlternos.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelnombre_unidadProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jTextFieldnombre_unidadProcesoCodigosAlternos= new JTextFieldMe();

		jTextFieldnombre_unidadProcesoCodigosAlternos.setEnabled(false);
		jTextFieldnombre_unidadProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteProcesoCodigosAlternos = new JLabelMe();
		this.jLabelnombre_completo_clienteProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteProcesoCodigosAlternos.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelnombre_completo_clienteProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jTextAreanombre_completo_clienteProcesoCodigosAlternos= new JTextAreaMe();
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setEnabled(false);
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setLineWrap(true);
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteProcesoCodigosAlternos = new JScrollPane(jTextAreanombre_completo_clienteProcesoCodigosAlternos);
		jscrollPanenombre_completo_clienteProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoProcesoCodigosAlternos = new JLabelMe();
		this.jLabelcodigo_productoProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoProcesoCodigosAlternos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelcodigo_productoProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jTextFieldcodigo_productoProcesoCodigosAlternos= new JTextFieldMe();

		jTextFieldcodigo_productoProcesoCodigosAlternos.setEnabled(false);
		jTextFieldcodigo_productoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.setVisible(false);		}


					
		this.jLabelnombreProcesoCodigosAlternos = new JLabelMe();
		this.jLabelnombreProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesoCodigosAlternos.setToolTipText("Nombre");
		this.jLabelnombreProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelnombreProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jTextAreanombreProcesoCodigosAlternos= new JTextAreaMe();
		jTextAreanombreProcesoCodigosAlternos.setEnabled(false);
		jTextAreanombreProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoCodigosAlternos.setLineWrap(true);
		jTextAreanombreProcesoCodigosAlternos.setWrapStyleWord(true);
		jTextAreanombreProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProcesoCodigosAlternos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProcesoCodigosAlternos = new JScrollPane(jTextAreanombreProcesoCodigosAlternos);
		jscrollPanenombreProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonnombreProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonnombreProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesoCodigosAlternosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos = new JLabelMe();
		this.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO+" : *");
		this.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setToolTipText("Nombre Completo Cliente Proveedor Defecto");
		this.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos= new JTextAreaMe();
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setEnabled(false);
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setLineWrap(true);
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setWrapStyleWord(true);
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos = new JScrollPane(jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos);
		jscrollPanenombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCodigosAlternos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_bodegaProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProcesoCodigosAlternos.setToolTipText("Bodega");
		this.jLabelid_bodegaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_bodegaProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_bodegaProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_bodegaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_bodegaProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_bodegaProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCodigosAlternos"));

		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_bodegaProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_bodegaProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_productoProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_productoProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProcesoCodigosAlternos.setToolTipText("Producto");
		this.jLabelid_productoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_productoProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_productoProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_productoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_productoProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_productoProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCodigosAlternos"));

		this.jButtonid_productoProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_productoProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_productoProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_productoProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_productoProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_productoProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_empresaProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_empresaProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoCodigosAlternos.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_empresaProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_empresaProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_empresaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoCodigosAlternos.setEnabled(false);

		this.jButtonid_empresaProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_empresaProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_empresaProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCodigosAlternos"));

		this.jButtonid_empresaProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_empresaProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_sucursalProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_sucursalProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoCodigosAlternos.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_sucursalProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_sucursalProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_sucursalProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoCodigosAlternos.setEnabled(false);

		this.jButtonid_sucursalProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_sucursalProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_sucursalProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCodigosAlternos"));

		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_sucursalProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_lineaProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_lineaProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProcesoCodigosAlternos.setToolTipText("Linea");
		this.jLabelid_lineaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_lineaProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_lineaProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_lineaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_lineaProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_lineaProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCodigosAlternos"));

		this.jButtonid_lineaProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_lineaProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_lineaProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_lineaProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_linea_grupoProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_linea_grupoProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProcesoCodigosAlternos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_linea_grupoProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_linea_grupoProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_linea_grupoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_linea_grupoProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCodigosAlternos"));

		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_linea_categoriaProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_linea_categoriaProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProcesoCodigosAlternos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_linea_categoriaProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_linea_categoriaProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_linea_categoriaProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCodigosAlternos"));

		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoCodigosAlternosUpdate"));



					
		this.jLabelid_linea_marcaProcesoCodigosAlternos = new JLabelMe();
		this.jLabelid_linea_marcaProcesoCodigosAlternos.setText(""+ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProcesoCodigosAlternos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProcesoCodigosAlternos.setToolTipText(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		this.jPanelid_linea_marcaProcesoCodigosAlternos.setLayout(this.gridaBagLayoutProcesoCodigosAlternos);


		jComboBoxid_linea_marcaProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_linea_marcaProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProcesoCodigosAlternos= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCodigosAlternos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCodigosAlternos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCodigosAlternos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoCodigosAlternos.setText("Buscar");
		this.jButtonid_linea_marcaProcesoCodigosAlternos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProcesoCodigosAlternos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCodigosAlternos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCodigosAlternos"));

		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setText("U");
		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCodigosAlternosBusqueda"));

		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.setText("U");
		this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoCodigosAlternosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoCodigosAlternosUpdate"));



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
		//this.jInternalFrameDetalleProcesoCodigosAlternos = new ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Codigos Alternos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCodigosAlternos= new GridBagLayout();
		

		
		String sToolTipProcesoCodigosAlternos="";
		sToolTipProcesoCodigosAlternos=ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCodigosAlternos+="(Inventario.ProcesoCodigosAlternos)";
		}
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCodigosAlternos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCodigosAlternos = new JButtonMe();
		this.jButtonModificarProcesoCodigosAlternos = new JButtonMe();
        this.jButtonActualizarProcesoCodigosAlternos = new JButtonMe();
        this.jButtonEliminarProcesoCodigosAlternos = new JButtonMe();
        this.jButtonCancelarProcesoCodigosAlternos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCodigosAlternos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos = new JButtonMe();
		this.jButtonCerrarProcesoCodigosAlternos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCodigosAlternos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCodigosAlternos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCodigosAlternos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Codigos Alternos";
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Codigos Alternoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCodigosAlternos.setName("jPanelCamposProcesoCodigosAlternos"); 

		this.jPanelCamposOcultosProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCodigosAlternos.setName("jPanelCamposOcultosProcesoCodigosAlternos"); 

        this.jPanelAccionesProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCodigosAlternos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCodigosAlternos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCodigosAlternos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCodigosAlternos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCodigosAlternos.setText("Nuevo");
		this.jButtonModificarProcesoCodigosAlternos.setText("Editar");
        this.jButtonActualizarProcesoCodigosAlternos.setText("Actualizar");
        this.jButtonEliminarProcesoCodigosAlternos.setText("Eliminar");
        this.jButtonCancelarProcesoCodigosAlternos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCodigosAlternos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.setText("Guardar");
		this.jButtonCerrarProcesoCodigosAlternos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCodigosAlternos,"nuevo_button","Nuevo",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCodigosAlternos,"modificar_button","Editar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCodigosAlternos,"actualizar_button","Actualizar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCodigosAlternos,"eliminar_button","Eliminar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCodigosAlternos,"cancelar_button","Cancelar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCodigosAlternos,"guardarcambios_button","Guardar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCodigosAlternos,"guardarcambiostabla_button","Guardar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCodigosAlternos,"cerrar_button","Salir",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCodigosAlternos.setToolTipText("Nuevo"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCodigosAlternos.setToolTipText("Editar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCodigosAlternos.setToolTipText("Actualizar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCodigosAlternos.setToolTipText("Eliminar)"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCodigosAlternos.setToolTipText("Cancelar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCodigosAlternos.setToolTipText("Guardar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.setToolTipText("Guardar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCodigosAlternos.setToolTipText("Salir"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCodigosAlternos";
		inputMap = this.jButtonNuevoProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCodigosAlternos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCodigosAlternos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCodigosAlternos";
		inputMap = this.jButtonActualizarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCodigosAlternos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCodigosAlternos";
		inputMap = this.jButtonEliminarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCodigosAlternos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCodigosAlternos";
		inputMap = this.jButtonCancelarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCodigosAlternos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCodigosAlternos";
		inputMap = this.jButtonCerrarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCodigosAlternos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCodigosAlternos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCodigosAlternos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCodigosAlternos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCodigosAlternos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCodigosAlternos.setToolTipText("Nuevo ProcesoCodigosAlternos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos.setToolTipText("Sin Cerrar Ventana ProcesoCodigosAlternos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCodigosAlternos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCodigosAlternos = new JLabelMe();
		
		this.jLabelAccionesProcesoCodigosAlternos.setText("Acciones");		
		this.jLabelAccionesProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCodigosAlternos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCodigosAlternos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCodigosAlternos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCodigosAlternos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCodigosAlternos = new GridBagLayout();
		
		this.jPanelCamposProcesoCodigosAlternos.setLayout(gridaBagLayoutCamposProcesoCodigosAlternos);
		this.jPanelCamposOcultosProcesoCodigosAlternos.setLayout(gridaBagLayoutCamposOcultosProcesoCodigosAlternos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCodigosAlternos.add(jLabelIdProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCodigosAlternos.add(jLabelidProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProcesoCodigosAlternos.add(jLabelid_bodegaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoCodigosAlternos.add(jButtonid_bodegaProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoCodigosAlternos.add(jButtonid_bodegaProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProcesoCodigosAlternos.add(jComboBoxid_bodegaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProcesoCodigosAlternos.add(jLabelid_productoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoCodigosAlternos.add(jButtonid_productoProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoCodigosAlternos.add(jButtonid_productoProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProcesoCodigosAlternos.add(jComboBoxid_productoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoCodigosAlternos.add(jLabelid_empresaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCodigosAlternos.add(jButtonid_empresaProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCodigosAlternos.add(jButtonid_empresaProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoCodigosAlternos.add(jComboBoxid_empresaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoCodigosAlternos.add(jLabelid_sucursalProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCodigosAlternos.add(jButtonid_sucursalProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCodigosAlternos.add(jButtonid_sucursalProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoCodigosAlternos.add(jComboBoxid_sucursalProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProcesoCodigosAlternos.add(jLabelid_lineaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoCodigosAlternos.add(jButtonid_lineaProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoCodigosAlternos.add(jButtonid_lineaProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProcesoCodigosAlternos.add(jComboBoxid_lineaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProcesoCodigosAlternos.add(jLabelid_linea_grupoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoCodigosAlternos.add(jButtonid_linea_grupoProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoCodigosAlternos.add(jButtonid_linea_grupoProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProcesoCodigosAlternos.add(jComboBoxid_linea_grupoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProcesoCodigosAlternos.add(jLabelid_linea_categoriaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoCodigosAlternos.add(jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoCodigosAlternos.add(jButtonid_linea_categoriaProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProcesoCodigosAlternos.add(jComboBoxid_linea_categoriaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProcesoCodigosAlternos.add(jLabelid_linea_marcaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoCodigosAlternos.add(jButtonid_linea_marcaProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 3;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoCodigosAlternos.add(jButtonid_linea_marcaProcesoCodigosAlternosUpdate, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProcesoCodigosAlternos.add(jComboBoxid_linea_marcaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoCodigosAlternos.add(jLabelcodigoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoCodigosAlternos.add(jButtoncodigoProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoCodigosAlternos.add(jscrollPanecodigoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProcesoCodigosAlternos.add(jLabelnombre_unidadProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProcesoCodigosAlternos.add(jButtonnombre_unidadProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProcesoCodigosAlternos.add(jTextFieldnombre_unidadProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteProcesoCodigosAlternos.add(jLabelnombre_completo_clienteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteProcesoCodigosAlternos.add(jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteProcesoCodigosAlternos.add(jscrollPanenombre_completo_clienteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoProcesoCodigosAlternos.add(jLabelcodigo_productoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoProcesoCodigosAlternos.add(jButtoncodigo_productoProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoProcesoCodigosAlternos.add(jTextFieldcodigo_productoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesoCodigosAlternos.add(jLabelnombreProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesoCodigosAlternos.add(jButtonnombreProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesoCodigosAlternos.add(jscrollPanenombreProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.add(jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 2;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.add(jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda, this.gridBagConstraintsProcesoCodigosAlternos);
	}

	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.add(jscrollPanenombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelidProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelid_bodegaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelid_productoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelid_lineaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelid_linea_grupoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelid_linea_categoriaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelid_linea_marcaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelcodigoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelnombre_unidadProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelnombre_completo_clienteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelcodigo_productoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelnombreProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCodigosAlternos.add(this.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposProcesoCodigosAlternos % 2==0) {
		iXPanelCamposProcesoCodigosAlternos=0;
		iYPanelCamposProcesoCodigosAlternos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposOcultosProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposOcultosProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCodigosAlternos.add(this.jPanelid_empresaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposOcultosProcesoCodigosAlternos % 2==0) {
		iXPanelCamposOcultosProcesoCodigosAlternos=0;
		iYPanelCamposOcultosProcesoCodigosAlternos++;
	}
	this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCodigosAlternos.gridy = iYPanelCamposOcultosProcesoCodigosAlternos;
	this.gridBagConstraintsProcesoCodigosAlternos.gridx = iXPanelCamposOcultosProcesoCodigosAlternos++;
	this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCodigosAlternos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCodigosAlternos.add(this.jPanelid_sucursalProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);



	if(iXPanelCamposOcultosProcesoCodigosAlternos % 2==0) {
		iXPanelCamposOcultosProcesoCodigosAlternos=0;
		iYPanelCamposOcultosProcesoCodigosAlternos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCodigosAlternos= new GridBagLayout();
		this.jPanelAccionesProcesoCodigosAlternos.setLayout(gridaBagLayoutAccionesProcesoCodigosAlternos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCodigosAlternos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCodigosAlternos.setLayout(gridaBagLayoutAccionesFormularioProcesoCodigosAlternos);
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCodigosAlternos.add(this.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCodigosAlternos.add(this.jButtonModificarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);							

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCodigosAlternos.add(this.jButtonEliminarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
			
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCodigosAlternos.add(this.jButtonActualizarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);


		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCodigosAlternos.add(this.jButtonGuardarCambiosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);	
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCodigosAlternos.add(this.jButtonCancelarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCodigosAlternos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;		
			//this.gridBagConstraintsProcesoCodigosAlternos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =0;
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCodigosAlternos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCodigosAlternos = new ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Codigos Alternos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Codigos Alternos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Codigos Alternos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCodigosAlternosModel procesocodigosalternosModel=new ProcesoCodigosAlternosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCodigosAlternosModel.ProcesoCodigosAlternosFocusTraversalPolicy procesocodigosalternosFocusTraversalPolicy = procesocodigosalternosModel.new ProcesoCodigosAlternosFocusTraversalPolicy(this);
			
			//procesocodigosalternosFocusTraversalPolicy.setprocesocodigosalternosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocodigosalternosModel);
			
			
			this.jContentPaneDetalleProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCodigosAlternos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCodigosAlternos.setLayout(gridaBagLayoutDetalleProcesoCodigosAlternos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCodigosAlternos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
				this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCodigosAlternos.add(jTtoolBarDetalleProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos=   new JScrollPane(jContentPaneDetalleProcesoCodigosAlternos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCodigosAlternos.add(jPanelCamposProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);
			
			
			
			
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
						//&& procesocodigosalternosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCodigosAlternos= new GridBagConstraints();
						this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
						this.jContentPaneDetalleProcesoCodigosAlternos.add(this.jTabbedPaneRelacionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCodigosAlternos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCodigosAlternos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
					this.gridBagConstraintsProcesoCodigosAlternos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCodigosAlternos.add(jPanelCamposOcultosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);
				
					this.jPanelCamposOcultosProcesoCodigosAlternos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	        this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCodigosAlternos.add(this.jPanelAccionesFormularioProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);							
			
			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCodigosAlternos.add(this.jPanelAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCodigosAlternos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos=   new JScrollPane(this.jPanelCamposProcesoCodigosAlternos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCodigosAlternos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			
			
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
			
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoCodigosAlternos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCodigosAlternos;
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
