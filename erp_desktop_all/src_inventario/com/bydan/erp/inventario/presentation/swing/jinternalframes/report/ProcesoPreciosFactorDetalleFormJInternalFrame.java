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
import com.bydan.erp.inventario.util.report.ProcesoPreciosFactorConstantesFunciones;

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
public class ProcesoPreciosFactorDetalleFormJInternalFrame extends ProcesoPreciosFactorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoPreciosFactor;
	
	protected JMenuBar jmenuBarDetalleProcesoPreciosFactor;
	
	protected JMenu jmenuDetalleProcesoPreciosFactor;
	protected JMenu jmenuDetalleArchivoProcesoPreciosFactor;
	protected JMenu jmenuDetalleAccionesProcesoPreciosFactor;
	protected JMenu jmenuDetalleDatosProcesoPreciosFactor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoPreciosFactor;	
	protected GridBagConstraints gridBagConstraintsProcesoPreciosFactor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoPreciosFactorBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoPreciosFactor;		
	
	
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
	
	public ProcesoPreciosFactorSessionBean procesopreciosfactorSessionBean;
	
	
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ProcesoPreciosFactorLogic procesopreciosfactorLogic;
	
	public JScrollPane jScrollPanelDatosProcesoPreciosFactor;
	public JScrollPane jScrollPanelDatosEdicionProcesoPreciosFactor;
	public JScrollPane jScrollPanelDatosGeneralProcesoPreciosFactor;
	
	protected JPanel jPanelCamposProcesoPreciosFactor;    
	protected JPanel jPanelCamposOcultosProcesoPreciosFactor;    	
	protected JPanel jPanelAccionesProcesoPreciosFactor;
	protected JPanel jPanelAccionesFormularioProcesoPreciosFactor;
    
	
	
	protected Integer iXPanelCamposProcesoPreciosFactor=0;
	protected Integer iYPanelCamposProcesoPreciosFactor=0;
	
	protected Integer iXPanelCamposOcultosProcesoPreciosFactor=0;
	protected Integer iYPanelCamposOcultosProcesoPreciosFactor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoPreciosFactor;
	public JButton jButtonModificarProcesoPreciosFactor;
	public JButton jButtonActualizarProcesoPreciosFactor;
    public JButton jButtonEliminarProcesoPreciosFactor;
	public JButton jButtonCancelarProcesoPreciosFactor;
    public JButton jButtonGuardarCambiosProcesoPreciosFactor;
	public JButton jButtonGuardarCambiosTablaProcesoPreciosFactor;
	protected JButton jButtonCerrarProcesoPreciosFactor;
	
	
	protected JButton jButtonProcesarInformacionProcesoPreciosFactor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoPreciosFactor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoPreciosFactor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoPreciosFactor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoPreciosFactor;
	protected JButton jButtonModificarToolBarProcesoPreciosFactor;
	protected JButton jButtonActualizarToolBarProcesoPreciosFactor;
    protected JButton jButtonEliminarToolBarProcesoPreciosFactor;
	protected JButton jButtonCancelarToolBarProcesoPreciosFactor;
    protected JButton jButtonGuardarCambiosToolBarProcesoPreciosFactor;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoPreciosFactor;
	protected JButton jButtonCerrarToolBarProcesoPreciosFactor;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoPreciosFactor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoPreciosFactor;
	protected JMenuItem jMenuItemModificarProcesoPreciosFactor;
	protected JMenuItem jMenuItemActualizarProcesoPreciosFactor;
    protected JMenuItem jMenuItemEliminarProcesoPreciosFactor;
	protected JMenuItem jMenuItemCancelarProcesoPreciosFactor;
    protected JMenuItem jMenuItemGuardarCambiosProcesoPreciosFactor;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoPreciosFactor;
	protected JMenuItem jMenuItemCerrarProcesoPreciosFactor;
	protected JMenuItem jMenuItemDetalleCerrarProcesoPreciosFactor;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoPreciosFactor;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoPreciosFactor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoPreciosFactor;
	protected JMenuItem jMenuItemMostrarOcultarProcesoPreciosFactor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoPreciosFactor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoPreciosFactor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoPreciosFactor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoPreciosFactor;
	public JLabel jLabelIdProcesoPreciosFactor;
	public JLabel jLabelidProcesoPreciosFactor;
	public JButton jButtonidProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoPreciosFactor;
	public JLabel jLabelcodigoProcesoPreciosFactor;
	public JTextArea jTextAreacodigoProcesoPreciosFactor;
	public JScrollPane jscrollPanecodigoProcesoPreciosFactor;
	public JButton jButtoncodigoProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesoPreciosFactor;
	public JLabel jLabelnombreProcesoPreciosFactor;
	public JTextArea jTextAreanombreProcesoPreciosFactor;
	public JScrollPane jscrollPanenombreProcesoPreciosFactor;
	public JButton jButtonnombreProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoProcesoPreciosFactor;
	public JLabel jLabelcodigo_productoProcesoPreciosFactor;
	public JTextField jTextFieldcodigo_productoProcesoPreciosFactor;
	public JButton jButtoncodigo_productoProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProcesoPreciosFactor;
	public JLabel jLabelnombre_productoProcesoPreciosFactor;
	public JTextArea jTextAreanombre_productoProcesoPreciosFactor;
	public JScrollPane jscrollPanenombre_productoProcesoPreciosFactor;
	public JButton jButtonnombre_productoProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelprecioProcesoPreciosFactor;
	public JLabel jLabelprecioProcesoPreciosFactor;
	public JTextField jTextFieldprecioProcesoPreciosFactor;
	public JButton jButtonprecioProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelfactorProcesoPreciosFactor;
	public JLabel jLabelfactorProcesoPreciosFactor;
	public JTextField jTextFieldfactorProcesoPreciosFactor;
	public JButton jButtonfactorProcesoPreciosFactorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaProcesoPreciosFactor;
	public JLabel jLabelid_bodegaProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProcesoPreciosFactor;
	public JButton jButtonid_bodegaProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_bodegaProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProcesoPreciosFactor;
	public JLabel jLabelid_productoProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProcesoPreciosFactor;
	public JButton jButtonid_productoProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_productoProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_productoProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaProcesoPreciosFactor;
	public JLabel jLabelid_empresaProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoPreciosFactor;
	public JButton jButtonid_empresaProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_empresaProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoPreciosFactor;
	public JLabel jLabelid_sucursalProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoPreciosFactor;
	public JButton jButtonid_sucursalProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_sucursalProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProcesoPreciosFactor;
	public JLabel jLabelid_lineaProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProcesoPreciosFactor;
	public JButton jButtonid_lineaProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_lineaProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_lineaProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoProcesoPreciosFactor;
	public JLabel jLabelid_linea_grupoProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProcesoPreciosFactor;
	public JButton jButtonid_linea_grupoProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProcesoPreciosFactor;
	public JLabel jLabelid_linea_categoriaProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProcesoPreciosFactor;
	public JButton jButtonid_linea_categoriaProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProcesoPreciosFactorBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaProcesoPreciosFactor;
	public JLabel jLabelid_linea_marcaProcesoPreciosFactor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProcesoPreciosFactor;
	public JButton jButtonid_linea_marcaProcesoPreciosFactor= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoPreciosFactorUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProcesoPreciosFactorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoPreciosFactor;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoPreciosFactorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoPreciosFactor=new JPanel();
				this.jPanelAccionesFormularioProcesoPreciosFactor=new JPanel();
				this.jmenuBarDetalleProcesoPreciosFactor=new JMenuBar();
				this.jTtoolBarDetalleProcesoPreciosFactor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoPreciosFactorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPreciosFactorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoPreciosFactor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoPreciosFactor() {
		return this.jButtonActualizarToolBarProcesoPreciosFactor;
	}
	
	public JButton getjButtonEliminarToolBarProcesoPreciosFactor() {
		return this.jButtonEliminarToolBarProcesoPreciosFactor;
	}
	
	public JButton getjButtonCancelarToolBarProcesoPreciosFactor() {
		return this.jButtonCancelarToolBarProcesoPreciosFactor;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoPreciosFactor() {
		return this.jButtonProcesarInformacionProcesoPreciosFactor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoPreciosFactor)	{
		this.jButtonProcesarInformacionProcesoPreciosFactor = jButtonProcesarInformacionProcesoPreciosFactor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoPreciosFactor() {
		return this.jComboBoxTiposAccionesProcesoPreciosFactor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoPreciosFactor(
			JComboBox jComboBoxTiposRelacionesProcesoPreciosFactor) {
		this.jComboBoxTiposRelacionesProcesoPreciosFactor = jComboBoxTiposRelacionesProcesoPreciosFactor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoPreciosFactor(
			JComboBox jComboBoxTiposAccionesProcesoPreciosFactor) {
		this.jComboBoxTiposAccionesProcesoPreciosFactor = jComboBoxTiposAccionesProcesoPreciosFactor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoPreciosFactor() {
		return this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoPreciosFactor(
			JComboBox jComboBoxTiposAccionesFormularioProcesoPreciosFactor) {
		this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor = jComboBoxTiposAccionesFormularioProcesoPreciosFactor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
		
		this.procesopreciosfactorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopreciosfactorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesopreciosfactorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoPreciosFactorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoPreciosFactorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoPreciosFactorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Precios Factor MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoPreciosFactorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoPreciosFactor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoPreciosFactor=new JButtonMe();
				this.jButtonModificarToolBarProcesoPreciosFactor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoPreciosFactor,this.jTtoolBarDetalleProcesoPreciosFactor,
							"actualizar","actualizar","Actualizar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoPreciosFactor,this.jTtoolBarDetalleProcesoPreciosFactor,
							"eliminar","eliminar","Eliminar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoPreciosFactor,this.jTtoolBarDetalleProcesoPreciosFactor,
							"cancelar","cancelar","Cancelar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoPreciosFactor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoPreciosFactor,this.jTtoolBarDetalleProcesoPreciosFactor,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoPreciosFactor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoPreciosFactor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoPreciosFactor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoPreciosFactor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoPreciosFactor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoPreciosFactor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoPreciosFactor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoPreciosFactor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoPreciosFactor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoPreciosFactor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoPreciosFactor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoPreciosFactor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoPreciosFactor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoPreciosFactor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoPreciosFactor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoPreciosFactor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoPreciosFactor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoPreciosFactor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoPreciosFactor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoPreciosFactor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoPreciosFactor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoPreciosFactor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoPreciosFactor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoPreciosFactor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoPreciosFactor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoPreciosFactor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoPreciosFactor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoPreciosFactor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoPreciosFactor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoPreciosFactor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoPreciosFactor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoPreciosFactor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoPreciosFactor.add(this.jMenuItemDetalleCerrarProcesoPreciosFactor);
		
		this.jmenuDetalleAccionesProcesoPreciosFactor.add(this.jMenuItemActualizarProcesoPreciosFactor);
		this.jmenuDetalleAccionesProcesoPreciosFactor.add(this.jMenuItemEliminarProcesoPreciosFactor);
		this.jmenuDetalleAccionesProcesoPreciosFactor.add(this.jMenuItemCancelarProcesoPreciosFactor);		
		
		//this.jmenuDetalleDatosProcesoPreciosFactor.add(this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor);				
		this.jmenuDetalleDatosProcesoPreciosFactor.add(this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor);				
				
		//this.jmenuDetalleAccionesProcesoPreciosFactor.add(this.jMenuItemGuardarCambiosProcesoPreciosFactor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoPreciosFactor.add(this.jmenuDetalleArchivoProcesoPreciosFactor);		
		this.jmenuBarDetalleProcesoPreciosFactor.add(this.jmenuDetalleAccionesProcesoPreciosFactor);		
		this.jmenuBarDetalleProcesoPreciosFactor.add(this.jmenuDetalleDatosProcesoPreciosFactor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoPreciosFactor);				
	}
	
	
	public void inicializarElementosCamposProcesoPreciosFactor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoPreciosFactor = new JLabelMe();
		jLabelIdProcesoPreciosFactor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoPreciosFactor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoPreciosFactor= new GridBagLayout();

		this.jPanelidProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);

		jLabelidProcesoPreciosFactor = new JLabel();
		jLabelidProcesoPreciosFactor.setText("Id");

		jLabelidProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesoPreciosFactor = new JLabelMe();
		this.jLabelcodigoProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoPreciosFactor.setToolTipText("Codigo");
		this.jLabelcodigoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelcodigoProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jTextAreacodigoProcesoPreciosFactor= new JTextAreaMe();
		jTextAreacodigoProcesoPreciosFactor.setEnabled(false);
		jTextAreacodigoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoProcesoPreciosFactor.setLineWrap(true);
		jTextAreacodigoProcesoPreciosFactor.setWrapStyleWord(true);
		jTextAreacodigoProcesoPreciosFactor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoProcesoPreciosFactor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoProcesoPreciosFactor = new JScrollPane(jTextAreacodigoProcesoPreciosFactor);
		jscrollPanecodigoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoPreciosFactorBusqueda.setText("U");
		this.jButtoncodigoProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoPreciosFactorBusqueda.setVisible(false);		}


					
		this.jLabelnombreProcesoPreciosFactor = new JLabelMe();
		this.jLabelnombreProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesoPreciosFactor.setToolTipText("Nombre");
		this.jLabelnombreProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelnombreProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jTextAreanombreProcesoPreciosFactor= new JTextAreaMe();
		jTextAreanombreProcesoPreciosFactor.setEnabled(false);
		jTextAreanombreProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesoPreciosFactor.setLineWrap(true);
		jTextAreanombreProcesoPreciosFactor.setWrapStyleWord(true);
		jTextAreanombreProcesoPreciosFactor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProcesoPreciosFactor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProcesoPreciosFactor = new JScrollPane(jTextAreanombreProcesoPreciosFactor);
		jscrollPanenombreProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonnombreProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonnombreProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesoPreciosFactorBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoProcesoPreciosFactor = new JLabelMe();
		this.jLabelcodigo_productoProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoProcesoPreciosFactor.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelcodigo_productoProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jTextFieldcodigo_productoProcesoPreciosFactor= new JTextFieldMe();

		jTextFieldcodigo_productoProcesoPreciosFactor.setEnabled(false);
		jTextFieldcodigo_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setText("U");
		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoProcesoPreciosFactorBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProcesoPreciosFactor = new JLabelMe();
		this.jLabelnombre_productoProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProcesoPreciosFactor.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelnombre_productoProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jTextAreanombre_productoProcesoPreciosFactor= new JTextAreaMe();
		jTextAreanombre_productoProcesoPreciosFactor.setEnabled(false);
		jTextAreanombre_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoPreciosFactor.setLineWrap(true);
		jTextAreanombre_productoProcesoPreciosFactor.setWrapStyleWord(true);
		jTextAreanombre_productoProcesoPreciosFactor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProcesoPreciosFactor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProcesoPreciosFactor = new JScrollPane(jTextAreanombre_productoProcesoPreciosFactor);
		jscrollPanenombre_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProcesoPreciosFactorBusqueda.setVisible(false);		}


					
		this.jLabelprecioProcesoPreciosFactor = new JLabelMe();
		this.jLabelprecioProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProcesoPreciosFactor.setToolTipText("Precio");
		this.jLabelprecioProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelprecioProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jTextFieldprecioProcesoPreciosFactor= new JTextFieldMe();
		jTextFieldprecioProcesoPreciosFactor.setEnabled(false);
		jTextFieldprecioProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProcesoPreciosFactor.setText("0.0");

		this.jButtonprecioProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonprecioProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonprecioProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProcesoPreciosFactorBusqueda.setVisible(false);		}


					
		this.jLabelfactorProcesoPreciosFactor = new JLabelMe();
		this.jLabelfactorProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR+" : *");
		this.jLabelfactorProcesoPreciosFactor.setToolTipText("Factor");
		this.jLabelfactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfactorProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfactorProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelfactorProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jTextFieldfactorProcesoPreciosFactor= new JTextFieldMe();
		jTextFieldfactorProcesoPreciosFactor.setEnabled(false);
		jTextFieldfactorProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactorProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactorProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfactorProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfactorProcesoPreciosFactor.setText("0.0");

		this.jButtonfactorProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonfactorProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactorProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactorProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfactorProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonfactorProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfactorProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfactorProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfactorProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfactorProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"factorProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfactorProcesoPreciosFactorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoPreciosFactor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bodegaProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_bodegaProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProcesoPreciosFactor.setToolTipText("Bodega");
		this.jLabelid_bodegaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_bodegaProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_bodegaProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_bodegaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_bodegaProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_bodegaProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoPreciosFactor"));

		this.jButtonid_bodegaProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_bodegaProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_bodegaProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProcesoPreciosFactorUpdate"));



					
		this.jLabelid_productoProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_productoProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProcesoPreciosFactor.setToolTipText("Producto");
		this.jLabelid_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_productoProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_productoProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_productoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_productoProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_productoProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoPreciosFactor"));

		this.jButtonid_productoProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_productoProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_productoProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_productoProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_productoProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_productoProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProcesoPreciosFactorUpdate"));



					
		this.jLabelid_empresaProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_empresaProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoPreciosFactor.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_empresaProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_empresaProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_empresaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoPreciosFactor.setEnabled(false);

		this.jButtonid_empresaProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_empresaProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_empresaProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoPreciosFactor"));

		this.jButtonid_empresaProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_empresaProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_empresaProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoPreciosFactorUpdate"));



					
		this.jLabelid_sucursalProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_sucursalProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoPreciosFactor.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_sucursalProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_sucursalProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_sucursalProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoPreciosFactor.setEnabled(false);

		this.jButtonid_sucursalProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_sucursalProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_sucursalProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoPreciosFactor"));

		this.jButtonid_sucursalProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_sucursalProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoPreciosFactorUpdate"));



					
		this.jLabelid_lineaProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_lineaProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProcesoPreciosFactor.setToolTipText("Linea");
		this.jLabelid_lineaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_lineaProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_lineaProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_lineaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_lineaProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_lineaProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoPreciosFactor"));

		this.jButtonid_lineaProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_lineaProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_lineaProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_lineaProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_lineaProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_lineaProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProcesoPreciosFactorUpdate"));



					
		this.jLabelid_linea_grupoProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_linea_grupoProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProcesoPreciosFactor.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_linea_grupoProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_linea_grupoProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_linea_grupoProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_linea_grupoProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_linea_grupoProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoPreciosFactor"));

		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_linea_grupoProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProcesoPreciosFactorUpdate"));



					
		this.jLabelid_linea_categoriaProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_linea_categoriaProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProcesoPreciosFactor.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_linea_categoriaProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_linea_categoriaProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_linea_categoriaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_linea_categoriaProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoPreciosFactor"));

		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProcesoPreciosFactorUpdate"));



					
		this.jLabelid_linea_marcaProcesoPreciosFactor = new JLabelMe();
		this.jLabelid_linea_marcaProcesoPreciosFactor.setText(""+ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProcesoPreciosFactor.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProcesoPreciosFactor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProcesoPreciosFactor.setToolTipText(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		this.jPanelid_linea_marcaProcesoPreciosFactor.setLayout(this.gridaBagLayoutProcesoPreciosFactor);


		jComboBoxid_linea_marcaProcesoPreciosFactor= new JComboBoxMe();
		jComboBoxid_linea_marcaProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProcesoPreciosFactor= new JButtonMe();
		this.jButtonid_linea_marcaProcesoPreciosFactor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoPreciosFactor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoPreciosFactor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProcesoPreciosFactor.setText("Buscar");
		this.jButtonid_linea_marcaProcesoPreciosFactor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProcesoPreciosFactor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoPreciosFactor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoPreciosFactor"));

		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setText("U");
		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoPreciosFactorBusqueda"));

		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProcesoPreciosFactorUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProcesoPreciosFactorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosFactorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProcesoPreciosFactorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProcesoPreciosFactorUpdate.setText("U");
		this.jButtonid_linea_marcaProcesoPreciosFactorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProcesoPreciosFactorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProcesoPreciosFactorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProcesoPreciosFactorUpdate"));



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
		//this.jInternalFrameDetalleProcesoPreciosFactor = new ProcesoPreciosFactorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Precios Factor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoPreciosFactor= new GridBagLayout();
		

		
		String sToolTipProcesoPreciosFactor="";
		sToolTipProcesoPreciosFactor=ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoPreciosFactor+="(Inventario.ProcesoPreciosFactor)";
		}
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoPreciosFactor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoPreciosFactor = new JButtonMe();
		this.jButtonModificarProcesoPreciosFactor = new JButtonMe();
        this.jButtonActualizarProcesoPreciosFactor = new JButtonMe();
        this.jButtonEliminarProcesoPreciosFactor = new JButtonMe();
        this.jButtonCancelarProcesoPreciosFactor = new JButtonMe();
        this.jButtonGuardarCambiosProcesoPreciosFactor = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor = new JButtonMe();
		this.jButtonCerrarProcesoPreciosFactor = new JButtonMe();
		
		this.jScrollPanelDatosProcesoPreciosFactor = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoPreciosFactor = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoPreciosFactor = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Precios Factor";
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Precios Factores" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoPreciosFactor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoPreciosFactor.setName("jPanelCamposProcesoPreciosFactor"); 

		this.jPanelCamposOcultosProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoPreciosFactor.setName("jPanelCamposOcultosProcesoPreciosFactor"); 

        this.jPanelAccionesProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoPreciosFactor.setToolTipText("Acciones");
        this.jPanelAccionesProcesoPreciosFactor.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoPreciosFactor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoPreciosFactor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoPreciosFactor.setText("Nuevo");
		this.jButtonModificarProcesoPreciosFactor.setText("Editar");
        this.jButtonActualizarProcesoPreciosFactor.setText("Actualizar");
        this.jButtonEliminarProcesoPreciosFactor.setText("Eliminar");
        this.jButtonCancelarProcesoPreciosFactor.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoPreciosFactor.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.setText("Guardar");
		this.jButtonCerrarProcesoPreciosFactor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoPreciosFactor,"nuevo_button","Nuevo",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoPreciosFactor,"modificar_button","Editar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoPreciosFactor,"actualizar_button","Actualizar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoPreciosFactor,"eliminar_button","Eliminar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoPreciosFactor,"cancelar_button","Cancelar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoPreciosFactor,"guardarcambios_button","Guardar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoPreciosFactor,"guardarcambiostabla_button","Guardar",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoPreciosFactor,"cerrar_button","Salir",this.procesopreciosfactorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoPreciosFactor.setToolTipText("Nuevo"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoPreciosFactor.setToolTipText("Editar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoPreciosFactor.setToolTipText("Actualizar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoPreciosFactor.setToolTipText("Eliminar)"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoPreciosFactor.setToolTipText("Cancelar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoPreciosFactor.setToolTipText("Guardar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.setToolTipText("Guardar"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoPreciosFactor.setToolTipText("Salir"+" "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoPreciosFactor";
		inputMap = this.jButtonNuevoProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoPreciosFactor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoPreciosFactor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoPreciosFactor";
		inputMap = this.jButtonActualizarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoPreciosFactor"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoPreciosFactor";
		inputMap = this.jButtonEliminarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoPreciosFactor"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoPreciosFactor";
		inputMap = this.jButtonCancelarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoPreciosFactor"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoPreciosFactor";
		inputMap = this.jButtonCerrarProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoPreciosFactor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoPreciosFactor";
		inputMap = this.jButtonGuardarCambiosTablaProcesoPreciosFactor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoPreciosFactor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoPreciosFactor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoPreciosFactor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoPreciosFactor.setToolTipText("Nuevo ProcesoPreciosFactor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoPreciosFactor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoPreciosFactor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoPreciosFactor.setToolTipText("Sin Cerrar Ventana ProcesoPreciosFactor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoPreciosFactor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoPreciosFactor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoPreciosFactor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoPreciosFactor.setText("Accion");
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoPreciosFactor = new JLabelMe();
		
		this.jLabelAccionesProcesoPreciosFactor.setText("Acciones");		
		this.jLabelAccionesProcesoPreciosFactor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosFactor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPreciosFactor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoPreciosFactor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoPreciosFactor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoPreciosFactor=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoPreciosFactor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoPreciosFactor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoPreciosFactor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoPreciosFactor = new GridBagLayout();
		
		this.jPanelCamposProcesoPreciosFactor.setLayout(gridaBagLayoutCamposProcesoPreciosFactor);
		this.jPanelCamposOcultosProcesoPreciosFactor.setLayout(gridaBagLayoutCamposOcultosProcesoPreciosFactor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoPreciosFactor.add(jLabelIdProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoPreciosFactor.add(jLabelidProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProcesoPreciosFactor.add(jLabelid_bodegaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoPreciosFactor.add(jButtonid_bodegaProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProcesoPreciosFactor.add(jButtonid_bodegaProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProcesoPreciosFactor.add(jComboBoxid_bodegaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProcesoPreciosFactor.add(jLabelid_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoPreciosFactor.add(jButtonid_productoProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProcesoPreciosFactor.add(jButtonid_productoProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProcesoPreciosFactor.add(jComboBoxid_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoPreciosFactor.add(jLabelid_empresaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoPreciosFactor.add(jButtonid_empresaProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoPreciosFactor.add(jButtonid_empresaProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoPreciosFactor.add(jComboBoxid_empresaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoPreciosFactor.add(jLabelid_sucursalProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoPreciosFactor.add(jButtonid_sucursalProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoPreciosFactor.add(jButtonid_sucursalProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoPreciosFactor.add(jComboBoxid_sucursalProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProcesoPreciosFactor.add(jLabelid_lineaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoPreciosFactor.add(jButtonid_lineaProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProcesoPreciosFactor.add(jButtonid_lineaProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProcesoPreciosFactor.add(jComboBoxid_lineaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProcesoPreciosFactor.add(jLabelid_linea_grupoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoPreciosFactor.add(jButtonid_linea_grupoProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProcesoPreciosFactor.add(jButtonid_linea_grupoProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProcesoPreciosFactor.add(jComboBoxid_linea_grupoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProcesoPreciosFactor.add(jLabelid_linea_categoriaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoPreciosFactor.add(jButtonid_linea_categoriaProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProcesoPreciosFactor.add(jButtonid_linea_categoriaProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProcesoPreciosFactor.add(jComboBoxid_linea_categoriaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProcesoPreciosFactor.add(jLabelid_linea_marcaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoPreciosFactor.add(jButtonid_linea_marcaProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 3;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProcesoPreciosFactor.add(jButtonid_linea_marcaProcesoPreciosFactorUpdate, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProcesoPreciosFactor.add(jComboBoxid_linea_marcaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoPreciosFactor.add(jLabelcodigoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoPreciosFactor.add(jButtoncodigoProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoPreciosFactor.add(jscrollPanecodigoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesoPreciosFactor.add(jLabelnombreProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesoPreciosFactor.add(jButtonnombreProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesoPreciosFactor.add(jscrollPanenombreProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoProcesoPreciosFactor.add(jLabelcodigo_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoProcesoPreciosFactor.add(jButtoncodigo_productoProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoProcesoPreciosFactor.add(jTextFieldcodigo_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProcesoPreciosFactor.add(jLabelnombre_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProcesoPreciosFactor.add(jButtonnombre_productoProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProcesoPreciosFactor.add(jscrollPanenombre_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProcesoPreciosFactor.add(jLabelprecioProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProcesoPreciosFactor.add(jButtonprecioProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProcesoPreciosFactor.add(jTextFieldprecioProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfactorProcesoPreciosFactor.add(jLabelfactorProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 2;
		this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
		this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfactorProcesoPreciosFactor.add(jButtonfactorProcesoPreciosFactorBusqueda, this.gridBagConstraintsProcesoPreciosFactor);
	}

	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = 1;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfactorProcesoPreciosFactor.add(jTextFieldfactorProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelidProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelid_bodegaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelid_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelid_lineaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelid_linea_grupoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelid_linea_categoriaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelid_linea_marcaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelcodigoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelnombreProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelcodigo_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelnombre_productoProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelprecioProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPreciosFactor.add(this.jPanelfactorProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposProcesoPreciosFactor % 2==0) {
		iXPanelCamposProcesoPreciosFactor=0;
		iYPanelCamposProcesoPreciosFactor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposOcultosProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposOcultosProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoPreciosFactor.add(this.jPanelid_empresaProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposOcultosProcesoPreciosFactor % 2==0) {
		iXPanelCamposOcultosProcesoPreciosFactor=0;
		iYPanelCamposOcultosProcesoPreciosFactor++;
	}
	this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPreciosFactor.gridy = iYPanelCamposOcultosProcesoPreciosFactor;
	this.gridBagConstraintsProcesoPreciosFactor.gridx = iXPanelCamposOcultosProcesoPreciosFactor++;
	this.gridBagConstraintsProcesoPreciosFactor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPreciosFactor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoPreciosFactor.add(this.jPanelid_sucursalProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);



	if(iXPanelCamposOcultosProcesoPreciosFactor % 2==0) {
		iXPanelCamposOcultosProcesoPreciosFactor=0;
		iYPanelCamposOcultosProcesoPreciosFactor++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoPreciosFactor= new GridBagLayout();
		this.jPanelAccionesProcesoPreciosFactor.setLayout(gridaBagLayoutAccionesProcesoPreciosFactor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoPreciosFactor= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoPreciosFactor.setLayout(gridaBagLayoutAccionesFormularioProcesoPreciosFactor);
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoPreciosFactor.add(this.jComboBoxTiposAccionesFormularioProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoPreciosFactor.add(this.jButtonModificarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);							

		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;
		this.gridBagConstraintsProcesoPreciosFactor.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoPreciosFactor.add(this.jButtonEliminarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoPreciosFactor.add(this.jButtonActualizarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);


		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoPreciosFactor.add(this.jButtonGuardarCambiosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);	
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = 0;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoPreciosFactor.add(this.jButtonCancelarProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoPreciosFactor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoPreciosFactor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();						
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;		
			//this.gridBagConstraintsProcesoPreciosFactor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoPreciosFactor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoPreciosFactor.gridx =0;
		this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoPreciosFactor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoPreciosFactor = new ProcesoPreciosFactorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Precios Factor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Precios Factor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Precios Factor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoPreciosFactorModel procesopreciosfactorModel=new ProcesoPreciosFactorModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoPreciosFactorModel.ProcesoPreciosFactorFocusTraversalPolicy procesopreciosfactorFocusTraversalPolicy = procesopreciosfactorModel.new ProcesoPreciosFactorFocusTraversalPolicy(this);
			
			//procesopreciosfactorFocusTraversalPolicy.setprocesopreciosfactorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesopreciosfactorModel);
			
			
			this.jContentPaneDetalleProcesoPreciosFactor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoPreciosFactor = new GridBagLayout();	
			this.jContentPaneDetalleProcesoPreciosFactor.setLayout(gridaBagLayoutDetalleProcesoPreciosFactor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoPreciosFactor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
				this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoPreciosFactor.add(jTtoolBarDetalleProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoPreciosFactor=   new JScrollPane(jContentPaneDetalleProcesoPreciosFactor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoPreciosFactor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	        
			this.jContentPaneDetalleProcesoPreciosFactor.add(jPanelCamposProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);
			
			
			
			
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
						//&& procesopreciosfactorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoPreciosFactor= new GridBagConstraints();
						this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
						this.jContentPaneDetalleProcesoPreciosFactor.add(this.jTabbedPaneRelacionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoPreciosFactor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoPreciosFactor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
					this.gridBagConstraintsProcesoPreciosFactor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoPreciosFactor.add(jPanelCamposOcultosProcesoPreciosFactor, gridBagConstraintsProcesoPreciosFactor);
				
					this.jPanelCamposOcultosProcesoPreciosFactor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	        this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoPreciosFactor.add(this.jPanelAccionesFormularioProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);							
			
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
	        this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoPreciosFactor.add(this.jPanelAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoPreciosFactor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoPreciosFactor=   new JScrollPane(this.jPanelCamposProcesoPreciosFactor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoPreciosFactor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosFactor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPreciosFactor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
			this.gridBagConstraintsProcesoPreciosFactor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoPreciosFactor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoPreciosFactor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);			
			
			this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
			this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
			
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		
			
		this.gridBagConstraintsProcesoPreciosFactor = new GridBagConstraints();
		this.gridBagConstraintsProcesoPreciosFactor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPreciosFactor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoPreciosFactor, this.gridBagConstraintsProcesoPreciosFactor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoPreciosFactor;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoPreciosFactor;
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
