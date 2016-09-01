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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.report.ModificacionLineasProductosConstantesFunciones;

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
public class ModificacionLineasProductosDetalleFormJInternalFrame extends ModificacionLineasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleModificacionLineasProductos;
	
	protected JMenuBar jmenuBarDetalleModificacionLineasProductos;
	
	protected JMenu jmenuDetalleModificacionLineasProductos;
	protected JMenu jmenuDetalleArchivoModificacionLineasProductos;
	protected JMenu jmenuDetalleAccionesModificacionLineasProductos;
	protected JMenu jmenuDetalleDatosModificacionLineasProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutModificacionLineasProductos;	
	protected GridBagConstraints gridBagConstraintsModificacionLineasProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ModificacionLineasProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleModificacionLineasProductos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

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

	protected LineaBeanSwingJInternalFrame lineadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineadestino="";

	protected LineaBeanSwingJInternalFrame lineagrupodestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupodestino="";

	protected LineaBeanSwingJInternalFrame lineacategoriadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoriadestino="";

	protected LineaBeanSwingJInternalFrame lineamarcadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarcadestino="";
	
	public ModificacionLineasProductosSessionBean modificacionlineasproductosSessionBean;
	
	
	
	
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public LineaSessionBean lineadestinoSessionBean;
	public LineaSessionBean lineagrupodestinoSessionBean;
	public LineaSessionBean lineacategoriadestinoSessionBean;
	public LineaSessionBean lineamarcadestinoSessionBean;	
	
	public ModificacionLineasProductosLogic modificacionlineasproductosLogic;
	
	public JScrollPane jScrollPanelDatosModificacionLineasProductos;
	public JScrollPane jScrollPanelDatosEdicionModificacionLineasProductos;
	public JScrollPane jScrollPanelDatosGeneralModificacionLineasProductos;
	
	protected JPanel jPanelCamposModificacionLineasProductos;    
	protected JPanel jPanelCamposOcultosModificacionLineasProductos;    	
	protected JPanel jPanelAccionesModificacionLineasProductos;
	protected JPanel jPanelAccionesFormularioModificacionLineasProductos;
    
	
	
	protected Integer iXPanelCamposModificacionLineasProductos=0;
	protected Integer iYPanelCamposModificacionLineasProductos=0;
	
	protected Integer iXPanelCamposOcultosModificacionLineasProductos=0;
	protected Integer iYPanelCamposOcultosModificacionLineasProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoModificacionLineasProductos;
	public JButton jButtonModificarModificacionLineasProductos;
	public JButton jButtonActualizarModificacionLineasProductos;
    public JButton jButtonEliminarModificacionLineasProductos;
	public JButton jButtonCancelarModificacionLineasProductos;
    public JButton jButtonGuardarCambiosModificacionLineasProductos;
	public JButton jButtonGuardarCambiosTablaModificacionLineasProductos;
	protected JButton jButtonCerrarModificacionLineasProductos;
	
	
	protected JButton jButtonProcesarInformacionModificacionLineasProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoModificacionLineasProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarModificacionLineasProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeModificacionLineasProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarModificacionLineasProductos;
	protected JButton jButtonModificarToolBarModificacionLineasProductos;
	protected JButton jButtonActualizarToolBarModificacionLineasProductos;
    protected JButton jButtonEliminarToolBarModificacionLineasProductos;
	protected JButton jButtonCancelarToolBarModificacionLineasProductos;
    protected JButton jButtonGuardarCambiosToolBarModificacionLineasProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarModificacionLineasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarModificacionLineasProductos;
	protected JButton jButtonCerrarToolBarModificacionLineasProductos;
	
	protected JButton jButtonProcesarInformacionToolBarModificacionLineasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoModificacionLineasProductos;
	protected JMenuItem jMenuItemModificarModificacionLineasProductos;
	protected JMenuItem jMenuItemActualizarModificacionLineasProductos;
    protected JMenuItem jMenuItemEliminarModificacionLineasProductos;
	protected JMenuItem jMenuItemCancelarModificacionLineasProductos;
    protected JMenuItem jMenuItemGuardarCambiosModificacionLineasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaModificacionLineasProductos;
	protected JMenuItem jMenuItemCerrarModificacionLineasProductos;
	protected JMenuItem jMenuItemDetalleCerrarModificacionLineasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarModificacionLineasProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionModificacionLineasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosModificacionLineasProductos;
	protected JMenuItem jMenuItemMostrarOcultarModificacionLineasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesModificacionLineasProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesModificacionLineasProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioModificacionLineasProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidModificacionLineasProductos;
	public JLabel jLabelIdModificacionLineasProductos;
	public JLabel jLabelidModificacionLineasProductos;
	public JButton jButtonidModificacionLineasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoModificacionLineasProductos;
	public JLabel jLabelid_productoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoModificacionLineasProductos;
	public JButton jButtonid_productoModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_productoModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaModificacionLineasProductos;
	public JLabel jLabelid_lineaModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaModificacionLineasProductos;
	public JButton jButtonid_lineaModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_lineaModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_lineaModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoModificacionLineasProductos;
	public JLabel jLabelid_linea_grupoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoModificacionLineasProductos;
	public JButton jButtonid_linea_grupoModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupoModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaModificacionLineasProductos;
	public JLabel jLabelid_linea_categoriaModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaModificacionLineasProductos;
	public JButton jButtonid_linea_categoriaModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoriaModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaModificacionLineasProductos;
	public JLabel jLabelid_linea_marcaModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaModificacionLineasProductos;
	public JButton jButtonid_linea_marcaModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_marcaModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_destinoModificacionLineasProductos;
	public JLabel jLabelid_linea_destinoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_destinoModificacionLineasProductos;
	public JButton jButtonid_linea_destinoModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_destinoModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_destinoModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupo_destinoModificacionLineasProductos;
	public JLabel jLabelid_linea_grupo_destinoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupo_destinoModificacionLineasProductos;
	public JButton jButtonid_linea_grupo_destinoModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoria_destinoModificacionLineasProductos;
	public JLabel jLabelid_linea_categoria_destinoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoria_destinoModificacionLineasProductos;
	public JButton jButtonid_linea_categoria_destinoModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marca_destinoModificacionLineasProductos;
	public JLabel jLabelid_linea_marca_destinoModificacionLineasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marca_destinoModificacionLineasProductos;
	public JButton jButtonid_linea_marca_destinoModificacionLineasProductos= new JButtonMe();
	public JButton jButtonid_linea_marca_destinoModificacionLineasProductosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesModificacionLineasProductos;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ModificacionLineasProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposModificacionLineasProductos=new JPanel();
				this.jPanelAccionesFormularioModificacionLineasProductos=new JPanel();
				this.jmenuBarDetalleModificacionLineasProductos=new JMenuBar();
				this.jTtoolBarDetalleModificacionLineasProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ModificacionLineasProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModificacionLineasProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ModificacionLineasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarModificacionLineasProductos() {
		return this.jButtonActualizarToolBarModificacionLineasProductos;
	}
	
	public JButton getjButtonEliminarToolBarModificacionLineasProductos() {
		return this.jButtonEliminarToolBarModificacionLineasProductos;
	}
	
	public JButton getjButtonCancelarToolBarModificacionLineasProductos() {
		return this.jButtonCancelarToolBarModificacionLineasProductos;
	}		
	
	public JButton getjButtonProcesarInformacionModificacionLineasProductos() {
		return this.jButtonProcesarInformacionModificacionLineasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionModificacionLineasProductos)	{
		this.jButtonProcesarInformacionModificacionLineasProductos = jButtonProcesarInformacionModificacionLineasProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesModificacionLineasProductos() {
		return this.jComboBoxTiposAccionesModificacionLineasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesModificacionLineasProductos(
			JComboBox jComboBoxTiposRelacionesModificacionLineasProductos) {
		this.jComboBoxTiposRelacionesModificacionLineasProductos = jComboBoxTiposRelacionesModificacionLineasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesModificacionLineasProductos(
			JComboBox jComboBoxTiposAccionesModificacionLineasProductos) {
		this.jComboBoxTiposAccionesModificacionLineasProductos = jComboBoxTiposAccionesModificacionLineasProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioModificacionLineasProductos() {
		return this.jComboBoxTiposAccionesFormularioModificacionLineasProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioModificacionLineasProductos(
			JComboBox jComboBoxTiposAccionesFormularioModificacionLineasProductos) {
		this.jComboBoxTiposAccionesFormularioModificacionLineasProductos = jComboBoxTiposAccionesFormularioModificacionLineasProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
		
		this.modificacionlineasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.modificacionlineasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ModificacionLineasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ModificacionLineasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ModificacionLineasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Modificacion Lineas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		ModificacionLineasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleModificacionLineasProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarModificacionLineasProductos=new JButtonMe();
				this.jButtonModificarToolBarModificacionLineasProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarModificacionLineasProductos,this.jTtoolBarDetalleModificacionLineasProductos,
							"actualizar","actualizar","Actualizar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarModificacionLineasProductos,this.jTtoolBarDetalleModificacionLineasProductos,
							"eliminar","eliminar","Eliminar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarModificacionLineasProductos,this.jTtoolBarDetalleModificacionLineasProductos,
							"cancelar","cancelar","Cancelar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarModificacionLineasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarModificacionLineasProductos,this.jTtoolBarDetalleModificacionLineasProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleModificacionLineasProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleModificacionLineasProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoModificacionLineasProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesModificacionLineasProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosModificacionLineasProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoModificacionLineasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoModificacionLineasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoModificacionLineasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarModificacionLineasProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarModificacionLineasProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarModificacionLineasProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarModificacionLineasProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarModificacionLineasProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarModificacionLineasProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarModificacionLineasProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarModificacionLineasProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarModificacionLineasProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarModificacionLineasProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarModificacionLineasProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarModificacionLineasProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosModificacionLineasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosModificacionLineasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosModificacionLineasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarModificacionLineasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarModificacionLineasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarModificacionLineasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarModificacionLineasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarModificacionLineasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarModificacionLineasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarModificacionLineasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarModificacionLineasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarModificacionLineasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarModificacionLineasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarModificacionLineasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarModificacionLineasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoModificacionLineasProductos.add(this.jMenuItemDetalleCerrarModificacionLineasProductos);
		
		this.jmenuDetalleAccionesModificacionLineasProductos.add(this.jMenuItemActualizarModificacionLineasProductos);
		this.jmenuDetalleAccionesModificacionLineasProductos.add(this.jMenuItemEliminarModificacionLineasProductos);
		this.jmenuDetalleAccionesModificacionLineasProductos.add(this.jMenuItemCancelarModificacionLineasProductos);		
		
		//this.jmenuDetalleDatosModificacionLineasProductos.add(this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos);				
		this.jmenuDetalleDatosModificacionLineasProductos.add(this.jMenuItemDetalleMostarOcultarModificacionLineasProductos);				
				
		//this.jmenuDetalleAccionesModificacionLineasProductos.add(this.jMenuItemGuardarCambiosModificacionLineasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleModificacionLineasProductos.add(this.jmenuDetalleArchivoModificacionLineasProductos);		
		this.jmenuBarDetalleModificacionLineasProductos.add(this.jmenuDetalleAccionesModificacionLineasProductos);		
		this.jmenuBarDetalleModificacionLineasProductos.add(this.jmenuDetalleDatosModificacionLineasProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleModificacionLineasProductos);				
	}
	
	
	public void inicializarElementosCamposModificacionLineasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdModificacionLineasProductos = new JLabelMe();
		jLabelIdModificacionLineasProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidModificacionLineasProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutModificacionLineasProductos= new GridBagLayout();

		this.jPanelidModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);

		jLabelidModificacionLineasProductos = new JLabel();
		jLabelidModificacionLineasProductos.setText("Id");

		jLabelidModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysModificacionLineasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_productoModificacionLineasProductos = new JLabelMe();
		this.jLabelid_productoModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoModificacionLineasProductos.setToolTipText("Producto");
		this.jLabelid_productoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_productoModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_productoModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_productoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoModificacionLineasProductos= new JButtonMe();
		this.jButtonid_productoModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoModificacionLineasProductos.setText("Procesar");
		this.jButtonid_productoModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoModificacionLineasProductos"));

		this.jButtonid_productoModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_productoModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_productoModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_productoModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_productoModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_productoModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoModificacionLineasProductosUpdate"));



					
		this.jLabelid_lineaModificacionLineasProductos = new JLabelMe();
		this.jLabelid_lineaModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaModificacionLineasProductos.setToolTipText("Linea");
		this.jLabelid_lineaModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_lineaModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_lineaModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_lineaModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaModificacionLineasProductos= new JButtonMe();
		this.jButtonid_lineaModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaModificacionLineasProductos.setText("Procesar");
		this.jButtonid_lineaModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaModificacionLineasProductos"));

		this.jButtonid_lineaModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_lineaModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_lineaModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_lineaModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_lineaModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_lineaModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_grupoModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_grupoModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoModificacionLineasProductos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_grupoModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_grupoModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_grupoModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_grupoModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoModificacionLineasProductos"));

		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_grupoModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_categoriaModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_categoriaModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaModificacionLineasProductos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_categoriaModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_categoriaModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoriaModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_categoriaModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_categoriaModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaModificacionLineasProductos"));

		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_categoriaModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_marcaModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_marcaModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaModificacionLineasProductos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_marcaModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_marcaModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_marcaModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_marcaModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_marcaModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaModificacionLineasProductos"));

		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_marcaModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_destinoModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_destinoModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO+" : *");
		this.jLabelid_linea_destinoModificacionLineasProductos.setToolTipText("Linea Destino");
		this.jLabelid_linea_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_destinoModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_destinoModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_destinoModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_destinoModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_destinoModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_destinoModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_destinoModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_destinoModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_destinoModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_destinoModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_destinoModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_destinoModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_destinoModificacionLineasProductos"));

		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_destinoModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_destinoModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_destinoModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_destinoModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_destinoModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_destinoModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_destinoModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_destinoModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_destinoModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_destinoModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_destinoModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_destinoModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_grupo_destinoModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_grupo_destinoModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO+" : *");
		this.jLabelid_linea_grupo_destinoModificacionLineasProductos.setToolTipText("Linea Grupo Destino");
		this.jLabelid_linea_grupo_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_grupo_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_grupo_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupo_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupo_destinoModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupo_destinoModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_grupo_destinoModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_grupo_destinoModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupo_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupo_destinoModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_grupo_destinoModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_grupo_destinoModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupo_destinoModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupo_destinoModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupo_destinoModificacionLineasProductos"));

		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupo_destinoModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupo_destinoModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_categoria_destinoModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_categoria_destinoModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO+" : *");
		this.jLabelid_linea_categoria_destinoModificacionLineasProductos.setToolTipText("Linea Categoria Destino");
		this.jLabelid_linea_categoria_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_linea_categoria_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_linea_categoria_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoria_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoria_destinoModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoria_destinoModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_categoria_destinoModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_categoria_destinoModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoria_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoria_destinoModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_categoria_destinoModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_categoria_destinoModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoria_destinoModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoria_destinoModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoria_destinoModificacionLineasProductos"));

		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoria_destinoModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoria_destinoModificacionLineasProductosUpdate"));



					
		this.jLabelid_linea_marca_destinoModificacionLineasProductos = new JLabelMe();
		this.jLabelid_linea_marca_destinoModificacionLineasProductos.setText(""+ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO+" : *");
		this.jLabelid_linea_marca_destinoModificacionLineasProductos.setToolTipText("Linea Marca Destino");
		this.jLabelid_linea_marca_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_marca_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_marca_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marca_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marca_destinoModificacionLineasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marca_destinoModificacionLineasProductos.setToolTipText(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO);
		this.gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		this.jPanelid_linea_marca_destinoModificacionLineasProductos.setLayout(this.gridaBagLayoutModificacionLineasProductos);


		jComboBoxid_linea_marca_destinoModificacionLineasProductos= new JComboBoxMe();
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marca_destinoModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marca_destinoModificacionLineasProductos= new JButtonMe();
		this.jButtonid_linea_marca_destinoModificacionLineasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marca_destinoModificacionLineasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marca_destinoModificacionLineasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marca_destinoModificacionLineasProductos.setText("Procesar");
		this.jButtonid_linea_marca_destinoModificacionLineasProductos.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marca_destinoModificacionLineasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marca_destinoModificacionLineasProductos,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marca_destinoModificacionLineasProductos"));

		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda= new JButtonMe();
		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setText("U");
		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marca_destinoModificacionLineasProductosBusqueda"));

		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate= new JButtonMe();
		this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.setText("U");
		this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marca_destinoModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marca_destinoModificacionLineasProductosUpdate"));



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
		//this.jInternalFrameDetalleModificacionLineasProductos = new ModificacionLineasProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Modificacion Lineas Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutModificacionLineasProductos= new GridBagLayout();
		

		
		String sToolTipModificacionLineasProductos="";
		sToolTipModificacionLineasProductos=ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipModificacionLineasProductos+="(Inventario.ModificacionLineasProductos)";
		}
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipModificacionLineasProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoModificacionLineasProductos = new JButtonMe();
		this.jButtonModificarModificacionLineasProductos = new JButtonMe();
        this.jButtonActualizarModificacionLineasProductos = new JButtonMe();
        this.jButtonEliminarModificacionLineasProductos = new JButtonMe();
        this.jButtonCancelarModificacionLineasProductos = new JButtonMe();
        this.jButtonGuardarCambiosModificacionLineasProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaModificacionLineasProductos = new JButtonMe();
		this.jButtonCerrarModificacionLineasProductos = new JButtonMe();
		
		this.jScrollPanelDatosModificacionLineasProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionModificacionLineasProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralModificacionLineasProductos = new JScrollPane();
				
		
		
		this.jPanelCamposModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Modificacion Lineas Productos";
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modificacion Lineas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosModificacionLineasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposModificacionLineasProductos.setName("jPanelCamposModificacionLineasProductos"); 

		this.jPanelCamposOcultosModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosModificacionLineasProductos.setName("jPanelCamposOcultosModificacionLineasProductos"); 

        this.jPanelAccionesModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesModificacionLineasProductos.setToolTipText("Acciones");
        this.jPanelAccionesModificacionLineasProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioModificacionLineasProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioModificacionLineasProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoModificacionLineasProductos.setText("Nuevo");
		this.jButtonModificarModificacionLineasProductos.setText("Editar");
        this.jButtonActualizarModificacionLineasProductos.setText("Actualizar");
        this.jButtonEliminarModificacionLineasProductos.setText("Eliminar");
        this.jButtonCancelarModificacionLineasProductos.setText("Cancelar");
        this.jButtonGuardarCambiosModificacionLineasProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.setText("Guardar");
		this.jButtonCerrarModificacionLineasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoModificacionLineasProductos,"nuevo_button","Nuevo",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarModificacionLineasProductos,"modificar_button","Editar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarModificacionLineasProductos,"actualizar_button","Actualizar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarModificacionLineasProductos,"eliminar_button","Eliminar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarModificacionLineasProductos,"cancelar_button","Cancelar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosModificacionLineasProductos,"guardarcambios_button","Guardar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaModificacionLineasProductos,"guardarcambiostabla_button","Guardar",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarModificacionLineasProductos,"cerrar_button","Salir",this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoModificacionLineasProductos.setToolTipText("Nuevo"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarModificacionLineasProductos.setToolTipText("Editar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarModificacionLineasProductos.setToolTipText("Actualizar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarModificacionLineasProductos.setToolTipText("Eliminar)"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarModificacionLineasProductos.setToolTipText("Cancelar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosModificacionLineasProductos.setToolTipText("Guardar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.setToolTipText("Guardar"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarModificacionLineasProductos.setToolTipText("Salir"+" "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoModificacionLineasProductos";
		inputMap = this.jButtonNuevoModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoModificacionLineasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoModificacionLineasProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarModificacionLineasProductos";
		inputMap = this.jButtonActualizarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarModificacionLineasProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarModificacionLineasProductos";
		inputMap = this.jButtonEliminarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarModificacionLineasProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarModificacionLineasProductos";
		inputMap = this.jButtonCancelarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarModificacionLineasProductos"));
		
		//CERRAR		
		sMapKey = "CerrarModificacionLineasProductos";
		inputMap = this.jButtonCerrarModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarModificacionLineasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaModificacionLineasProductos";
		inputMap = this.jButtonGuardarCambiosTablaModificacionLineasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaModificacionLineasProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoModificacionLineasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoModificacionLineasProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoModificacionLineasProductos.setToolTipText("Nuevo ModificacionLineasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarModificacionLineasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarModificacionLineasProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarModificacionLineasProductos.setToolTipText("Sin Cerrar Ventana ModificacionLineasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeModificacionLineasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeModificacionLineasProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeModificacionLineasProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesModificacionLineasProductos.setText("Accion");
		this.jComboBoxTiposAccionesModificacionLineasProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioModificacionLineasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesModificacionLineasProductos = new JLabelMe();
		
		this.jLabelAccionesModificacionLineasProductos.setText("Acciones");		
		this.jLabelAccionesModificacionLineasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModificacionLineasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModificacionLineasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposModificacionLineasProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysModificacionLineasProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesModificacionLineasProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesModificacionLineasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesModificacionLineasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesModificacionLineasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModificacionLineasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModificacionLineasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioModificacionLineasProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposModificacionLineasProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosModificacionLineasProductos = new GridBagLayout();
		
		this.jPanelCamposModificacionLineasProductos.setLayout(gridaBagLayoutCamposModificacionLineasProductos);
		this.jPanelCamposOcultosModificacionLineasProductos.setLayout(gridaBagLayoutCamposOcultosModificacionLineasProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidModificacionLineasProductos.add(jLabelIdModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidModificacionLineasProductos.add(jLabelidModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoModificacionLineasProductos.add(jLabelid_productoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoModificacionLineasProductos.add(jButtonid_productoModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoModificacionLineasProductos.add(jButtonid_productoModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoModificacionLineasProductos.add(jComboBoxid_productoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaModificacionLineasProductos.add(jLabelid_lineaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaModificacionLineasProductos.add(jButtonid_lineaModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaModificacionLineasProductos.add(jButtonid_lineaModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaModificacionLineasProductos.add(jComboBoxid_lineaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoModificacionLineasProductos.add(jLabelid_linea_grupoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoModificacionLineasProductos.add(jButtonid_linea_grupoModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoModificacionLineasProductos.add(jButtonid_linea_grupoModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoModificacionLineasProductos.add(jComboBoxid_linea_grupoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaModificacionLineasProductos.add(jLabelid_linea_categoriaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaModificacionLineasProductos.add(jButtonid_linea_categoriaModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaModificacionLineasProductos.add(jButtonid_linea_categoriaModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaModificacionLineasProductos.add(jComboBoxid_linea_categoriaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaModificacionLineasProductos.add(jLabelid_linea_marcaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaModificacionLineasProductos.add(jButtonid_linea_marcaModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaModificacionLineasProductos.add(jButtonid_linea_marcaModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaModificacionLineasProductos.add(jComboBoxid_linea_marcaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_destinoModificacionLineasProductos.add(jLabelid_linea_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_destinoModificacionLineasProductos.add(jButtonid_linea_destinoModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_destinoModificacionLineasProductos.add(jButtonid_linea_destinoModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_destinoModificacionLineasProductos.add(jComboBoxid_linea_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupo_destinoModificacionLineasProductos.add(jLabelid_linea_grupo_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupo_destinoModificacionLineasProductos.add(jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupo_destinoModificacionLineasProductos.add(jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupo_destinoModificacionLineasProductos.add(jComboBoxid_linea_grupo_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoria_destinoModificacionLineasProductos.add(jLabelid_linea_categoria_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoria_destinoModificacionLineasProductos.add(jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoria_destinoModificacionLineasProductos.add(jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoria_destinoModificacionLineasProductos.add(jComboBoxid_linea_categoria_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marca_destinoModificacionLineasProductos.add(jLabelid_linea_marca_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 2;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marca_destinoModificacionLineasProductos.add(jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda, this.gridBagConstraintsModificacionLineasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		//this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = 3;
		this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
		this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marca_destinoModificacionLineasProductos.add(jButtonid_linea_marca_destinoModificacionLineasProductosUpdate, this.gridBagConstraintsModificacionLineasProductos);
	}

	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
	this.gridBagConstraintsModificacionLineasProductos.gridx = 1;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marca_destinoModificacionLineasProductos.add(jComboBoxid_linea_marca_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelidModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_productoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_lineaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_grupoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_categoriaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_marcaModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_grupo_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_categoria_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
	this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModificacionLineasProductos.gridy = iYPanelCamposModificacionLineasProductos;
	this.gridBagConstraintsModificacionLineasProductos.gridx = iXPanelCamposModificacionLineasProductos++;
	this.gridBagConstraintsModificacionLineasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModificacionLineasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModificacionLineasProductos.add(this.jPanelid_linea_marca_destinoModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);



	if(iXPanelCamposModificacionLineasProductos % 1==0) {
		iXPanelCamposModificacionLineasProductos=0;
		iYPanelCamposModificacionLineasProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesModificacionLineasProductos= new GridBagLayout();
		this.jPanelAccionesModificacionLineasProductos.setLayout(gridaBagLayoutAccionesModificacionLineasProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioModificacionLineasProductos= new GridBagLayout();
		this.jPanelAccionesFormularioModificacionLineasProductos.setLayout(gridaBagLayoutAccionesFormularioModificacionLineasProductos);
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioModificacionLineasProductos.add(this.jComboBoxTiposAccionesFormularioModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesModificacionLineasProductos.add(this.jButtonModificarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);							

		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;
		this.gridBagConstraintsModificacionLineasProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesModificacionLineasProductos.add(this.jButtonEliminarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
			
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesModificacionLineasProductos.add(this.jButtonActualizarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);


		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesModificacionLineasProductos.add(this.jButtonGuardarCambiosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);	
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = 0;		
		this.gridBagConstraintsModificacionLineasProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesModificacionLineasProductos.add(this.jButtonCancelarModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutModificacionLineasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutModificacionLineasProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();						
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;		
			//this.gridBagConstraintsModificacionLineasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsModificacionLineasProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsModificacionLineasProductos.gridx =0;
		this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsModificacionLineasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleModificacionLineasProductos = new ModificacionLineasProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Modificacion Lineas Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Modificacion Lineas Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Modificacion Lineas Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ModificacionLineasProductosModel modificacionlineasproductosModel=new ModificacionLineasProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//ModificacionLineasProductosModel.ModificacionLineasProductosFocusTraversalPolicy modificacionlineasproductosFocusTraversalPolicy = modificacionlineasproductosModel.new ModificacionLineasProductosFocusTraversalPolicy(this);
			
			//modificacionlineasproductosFocusTraversalPolicy.setmodificacionlineasproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(modificacionlineasproductosModel);
			
			
			this.jContentPaneDetalleModificacionLineasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleModificacionLineasProductos = new GridBagLayout();	
			this.jContentPaneDetalleModificacionLineasProductos.setLayout(gridaBagLayoutDetalleModificacionLineasProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosModificacionLineasProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
				this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
					
				
				this.jContentPaneDetalleModificacionLineasProductos.add(jTtoolBarDetalleModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);								
				
}
			
			this.jScrollPanelDatosEdicionModificacionLineasProductos=   new JScrollPane(jContentPaneDetalleModificacionLineasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionModificacionLineasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModificacionLineasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModificacionLineasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralModificacionLineasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralModificacionLineasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModificacionLineasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModificacionLineasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	        
			this.jContentPaneDetalleModificacionLineasProductos.add(jPanelCamposModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);
			
			
			
			
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
						//&& modificacionlineasproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsModificacionLineasProductos= new GridBagConstraints();
						this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
						this.jContentPaneDetalleModificacionLineasProductos.add(this.jTabbedPaneRelacionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesModificacionLineasProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosModificacionLineasProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
					this.gridBagConstraintsModificacionLineasProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
					
				
					this.jContentPaneDetalleModificacionLineasProductos.add(jPanelCamposOcultosModificacionLineasProductos, gridBagConstraintsModificacionLineasProductos);
				
					this.jPanelCamposOcultosModificacionLineasProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	        this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleModificacionLineasProductos.add(this.jPanelAccionesFormularioModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);							
			
			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
	        this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleModificacionLineasProductos.add(this.jPanelAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionModificacionLineasProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionModificacionLineasProductos=   new JScrollPane(this.jPanelCamposModificacionLineasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionModificacionLineasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModificacionLineasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModificacionLineasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
			this.gridBagConstraintsModificacionLineasProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsModificacionLineasProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsModificacionLineasProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);			
			
			this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
			this.gridBagConstraintsModificacionLineasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
			
			
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		
			
		this.gridBagConstraintsModificacionLineasProductos = new GridBagConstraints();
		this.gridBagConstraintsModificacionLineasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsModificacionLineasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesModificacionLineasProductos, this.gridBagConstraintsModificacionLineasProductos);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosModificacionLineasProductos.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesModificacionLineasProductos.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setVisible(false);
		//this.jComboBoxTiposSeleccionarModificacionLineasProductos.setVisible(false);		
		
		
		
		
		//this.jTtoolBarModificacionLineasProductos.setVisible(false);
			
		this.jMenuItemMostrarOcultarModificacionLineasProductos.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralModificacionLineasProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionModificacionLineasProductos;
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
