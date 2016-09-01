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
import com.bydan.erp.puntoventa.util.report.EstadisticaProductosConstantesFunciones;

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
public class EstadisticaProductosDetalleFormJInternalFrame extends EstadisticaProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadisticaProductos;
	
	protected JMenuBar jmenuBarDetalleEstadisticaProductos;
	
	protected JMenu jmenuDetalleEstadisticaProductos;
	protected JMenu jmenuDetalleArchivoEstadisticaProductos;
	protected JMenu jmenuDetalleAccionesEstadisticaProductos;
	protected JMenu jmenuDetalleDatosEstadisticaProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadisticaProductos;	
	protected GridBagConstraints gridBagConstraintsEstadisticaProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadisticaProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadisticaProductos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public EstadisticaProductosSessionBean estadisticaproductosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public EstadisticaProductosLogic estadisticaproductosLogic;
	
	public JScrollPane jScrollPanelDatosEstadisticaProductos;
	public JScrollPane jScrollPanelDatosEdicionEstadisticaProductos;
	public JScrollPane jScrollPanelDatosGeneralEstadisticaProductos;
	
	protected JPanel jPanelCamposEstadisticaProductos;    
	protected JPanel jPanelCamposOcultosEstadisticaProductos;    	
	protected JPanel jPanelAccionesEstadisticaProductos;
	protected JPanel jPanelAccionesFormularioEstadisticaProductos;
    
	
	
	protected Integer iXPanelCamposEstadisticaProductos=0;
	protected Integer iYPanelCamposEstadisticaProductos=0;
	
	protected Integer iXPanelCamposOcultosEstadisticaProductos=0;
	protected Integer iYPanelCamposOcultosEstadisticaProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadisticaProductos;
	public JButton jButtonModificarEstadisticaProductos;
	public JButton jButtonActualizarEstadisticaProductos;
    public JButton jButtonEliminarEstadisticaProductos;
	public JButton jButtonCancelarEstadisticaProductos;
    public JButton jButtonGuardarCambiosEstadisticaProductos;
	public JButton jButtonGuardarCambiosTablaEstadisticaProductos;
	protected JButton jButtonCerrarEstadisticaProductos;
	
	
	protected JButton jButtonProcesarInformacionEstadisticaProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadisticaProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadisticaProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadisticaProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadisticaProductos;
	protected JButton jButtonModificarToolBarEstadisticaProductos;
	protected JButton jButtonActualizarToolBarEstadisticaProductos;
    protected JButton jButtonEliminarToolBarEstadisticaProductos;
	protected JButton jButtonCancelarToolBarEstadisticaProductos;
    protected JButton jButtonGuardarCambiosToolBarEstadisticaProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadisticaProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadisticaProductos;
	protected JButton jButtonCerrarToolBarEstadisticaProductos;
	
	protected JButton jButtonProcesarInformacionToolBarEstadisticaProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadisticaProductos;
	protected JMenuItem jMenuItemModificarEstadisticaProductos;
	protected JMenuItem jMenuItemActualizarEstadisticaProductos;
    protected JMenuItem jMenuItemEliminarEstadisticaProductos;
	protected JMenuItem jMenuItemCancelarEstadisticaProductos;
    protected JMenuItem jMenuItemGuardarCambiosEstadisticaProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadisticaProductos;
	protected JMenuItem jMenuItemCerrarEstadisticaProductos;
	protected JMenuItem jMenuItemDetalleCerrarEstadisticaProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadisticaProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadisticaProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadisticaProductos;
	protected JMenuItem jMenuItemMostrarOcultarEstadisticaProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadisticaProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadisticaProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadisticaProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadisticaProductos;
	public JLabel jLabelIdEstadisticaProductos;
	public JLabel jLabelidEstadisticaProductos;
	public JButton jButtonidEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioEstadisticaProductos;
	public JLabel jLabelfecha_inicioEstadisticaProductos;
	//public JFormattedTextField jDateChooserfecha_inicioEstadisticaProductos;

	public JDateChooser jDateChooserfecha_inicioEstadisticaProductos;
	public JButton jButtonfecha_inicioEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finEstadisticaProductos;
	public JLabel jLabelfecha_finEstadisticaProductos;
	//public JFormattedTextField jDateChooserfecha_finEstadisticaProductos;

	public JDateChooser jDateChooserfecha_finEstadisticaProductos;
	public JButton jButtonfecha_finEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoEstadisticaProductos;
	public JLabel jLabelcodigo_productoEstadisticaProductos;
	public JTextField jTextFieldcodigo_productoEstadisticaProductos;
	public JButton jButtoncodigo_productoEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoEstadisticaProductos;
	public JLabel jLabelnombre_productoEstadisticaProductos;
	public JTextArea jTextAreanombre_productoEstadisticaProductos;
	public JScrollPane jscrollPanenombre_productoEstadisticaProductos;
	public JButton jButtonnombre_productoEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_precioEstadisticaProductos;
	public JLabel jLabelcantidad_precioEstadisticaProductos;
	public JTextField jTextFieldcantidad_precioEstadisticaProductos;
	public JButton jButtoncantidad_precioEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelcantidadEstadisticaProductos;
	public JLabel jLabelcantidadEstadisticaProductos;
	public JTextField jTextFieldcantidadEstadisticaProductos;
	public JButton jButtoncantidadEstadisticaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstadisticaProductos;
	public JLabel jLabelid_empresaEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstadisticaProductos;
	public JButton jButtonid_empresaEstadisticaProductos= new JButtonMe();
	public JButton jButtonid_empresaEstadisticaProductosUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEstadisticaProductos;
	public JLabel jLabelid_sucursalEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEstadisticaProductos;
	public JButton jButtonid_sucursalEstadisticaProductos= new JButtonMe();
	public JButton jButtonid_sucursalEstadisticaProductosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEstadisticaProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_productoEstadisticaProductos;
	public JLabel jLabelid_productoEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoEstadisticaProductos;
	public JButton jButtonid_productoEstadisticaProductos= new JButtonMe();
	public JButton jButtonid_productoEstadisticaProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoEstadisticaProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadisticaProductos;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadisticaProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadisticaProductos=new JPanel();
				this.jPanelAccionesFormularioEstadisticaProductos=new JPanel();
				this.jmenuBarDetalleEstadisticaProductos=new JMenuBar();
				this.jTtoolBarDetalleEstadisticaProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadisticaProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadisticaProductos() {
		return this.jButtonActualizarToolBarEstadisticaProductos;
	}
	
	public JButton getjButtonEliminarToolBarEstadisticaProductos() {
		return this.jButtonEliminarToolBarEstadisticaProductos;
	}
	
	public JButton getjButtonCancelarToolBarEstadisticaProductos() {
		return this.jButtonCancelarToolBarEstadisticaProductos;
	}		
	
	public JButton getjButtonProcesarInformacionEstadisticaProductos() {
		return this.jButtonProcesarInformacionEstadisticaProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadisticaProductos)	{
		this.jButtonProcesarInformacionEstadisticaProductos = jButtonProcesarInformacionEstadisticaProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadisticaProductos() {
		return this.jComboBoxTiposAccionesEstadisticaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadisticaProductos(
			JComboBox jComboBoxTiposRelacionesEstadisticaProductos) {
		this.jComboBoxTiposRelacionesEstadisticaProductos = jComboBoxTiposRelacionesEstadisticaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadisticaProductos(
			JComboBox jComboBoxTiposAccionesEstadisticaProductos) {
		this.jComboBoxTiposAccionesEstadisticaProductos = jComboBoxTiposAccionesEstadisticaProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadisticaProductos() {
		return this.jComboBoxTiposAccionesFormularioEstadisticaProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadisticaProductos(
			JComboBox jComboBoxTiposAccionesFormularioEstadisticaProductos) {
		this.jComboBoxTiposAccionesFormularioEstadisticaProductos = jComboBoxTiposAccionesFormularioEstadisticaProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
		
		this.estadisticaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadisticaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadisticaproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadisticaProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadisticaProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadisticaProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estadistica Productos MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadisticaProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadisticaProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadisticaProductos=new JButtonMe();
				this.jButtonModificarToolBarEstadisticaProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadisticaProductos,this.jTtoolBarDetalleEstadisticaProductos,
							"actualizar","actualizar","Actualizar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadisticaProductos,this.jTtoolBarDetalleEstadisticaProductos,
							"eliminar","eliminar","Eliminar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadisticaProductos,this.jTtoolBarDetalleEstadisticaProductos,
							"cancelar","cancelar","Cancelar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadisticaProductos,this.jTtoolBarDetalleEstadisticaProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadisticaProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadisticaProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadisticaProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadisticaProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadisticaProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadisticaProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadisticaProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadisticaProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadisticaProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadisticaProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadisticaProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadisticaProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadisticaProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadisticaProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadisticaProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadisticaProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadisticaProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadisticaProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadisticaProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadisticaProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadisticaProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadisticaProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadisticaProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadisticaProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadisticaProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadisticaProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadisticaProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadisticaProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadisticaProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadisticaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadisticaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadisticaProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadisticaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadisticaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadisticaProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadisticaProductos.add(this.jMenuItemDetalleCerrarEstadisticaProductos);
		
		this.jmenuDetalleAccionesEstadisticaProductos.add(this.jMenuItemActualizarEstadisticaProductos);
		this.jmenuDetalleAccionesEstadisticaProductos.add(this.jMenuItemEliminarEstadisticaProductos);
		this.jmenuDetalleAccionesEstadisticaProductos.add(this.jMenuItemCancelarEstadisticaProductos);		
		
		//this.jmenuDetalleDatosEstadisticaProductos.add(this.jMenuItemDetalleAbrirOrderByEstadisticaProductos);				
		this.jmenuDetalleDatosEstadisticaProductos.add(this.jMenuItemDetalleMostarOcultarEstadisticaProductos);				
				
		//this.jmenuDetalleAccionesEstadisticaProductos.add(this.jMenuItemGuardarCambiosEstadisticaProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadisticaProductos.add(this.jmenuDetalleArchivoEstadisticaProductos);		
		this.jmenuBarDetalleEstadisticaProductos.add(this.jmenuDetalleAccionesEstadisticaProductos);		
		this.jmenuBarDetalleEstadisticaProductos.add(this.jmenuDetalleDatosEstadisticaProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadisticaProductos);				
	}
	
	
	public void inicializarElementosCamposEstadisticaProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadisticaProductos = new JLabelMe();
		jLabelIdEstadisticaProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadisticaProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadisticaProductos= new GridBagLayout();

		this.jPanelidEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);

		jLabelidEstadisticaProductos = new JLabel();
		jLabelidEstadisticaProductos.setText("Id");

		jLabelidEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioEstadisticaProductos = new JLabelMe();
		this.jLabelfecha_inicioEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioEstadisticaProductos.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelfecha_inicioEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		//jFormattedTextFieldfecha_inicioEstadisticaProductos= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioEstadisticaProductos= new JDateChooser();
		jDateChooserfecha_inicioEstadisticaProductos.setEnabled(false);
		jDateChooserfecha_inicioEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioEstadisticaProductos.setDate(new Date());
		jDateChooserfecha_inicioEstadisticaProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioEstadisticaProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtonfecha_inicioEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioEstadisticaProductosBusqueda.setText("U");
		this.jButtonfecha_inicioEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioEstadisticaProductosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finEstadisticaProductos = new JLabelMe();
		this.jLabelfecha_finEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finEstadisticaProductos.setToolTipText("Fecha Fin");
		this.jLabelfecha_finEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelfecha_finEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		//jFormattedTextFieldfecha_finEstadisticaProductos= new JFormattedTextFieldMe();

		jDateChooserfecha_finEstadisticaProductos= new JDateChooser();
		jDateChooserfecha_finEstadisticaProductos.setEnabled(false);
		jDateChooserfecha_finEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finEstadisticaProductos.setDate(new Date());
		jDateChooserfecha_finEstadisticaProductos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finEstadisticaProductos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtonfecha_finEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finEstadisticaProductosBusqueda.setText("U");
		this.jButtonfecha_finEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finEstadisticaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoEstadisticaProductos = new JLabelMe();
		this.jLabelcodigo_productoEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoEstadisticaProductos.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelcodigo_productoEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jTextFieldcodigo_productoEstadisticaProductos= new JTextFieldMe();

		jTextFieldcodigo_productoEstadisticaProductos.setEnabled(false);
		jTextFieldcodigo_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtoncodigo_productoEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoEstadisticaProductosBusqueda.setText("U");
		this.jButtoncodigo_productoEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoEstadisticaProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoEstadisticaProductos = new JLabelMe();
		this.jLabelnombre_productoEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoEstadisticaProductos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelnombre_productoEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jTextAreanombre_productoEstadisticaProductos= new JTextAreaMe();
		jTextAreanombre_productoEstadisticaProductos.setEnabled(false);
		jTextAreanombre_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoEstadisticaProductos.setLineWrap(true);
		jTextAreanombre_productoEstadisticaProductos.setWrapStyleWord(true);
		jTextAreanombre_productoEstadisticaProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoEstadisticaProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoEstadisticaProductos = new JScrollPane(jTextAreanombre_productoEstadisticaProductos);
		jscrollPanenombre_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtonnombre_productoEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoEstadisticaProductosBusqueda.setText("U");
		this.jButtonnombre_productoEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoEstadisticaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_precioEstadisticaProductos = new JLabelMe();
		this.jLabelcantidad_precioEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO+" : *");
		this.jLabelcantidad_precioEstadisticaProductos.setToolTipText("Cantad Precio");
		this.jLabelcantidad_precioEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_precioEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_precioEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_precioEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_precioEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_precioEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelcantidad_precioEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jTextFieldcantidad_precioEstadisticaProductos= new JTextFieldMe();
		jTextFieldcantidad_precioEstadisticaProductos.setEnabled(false);
		jTextFieldcantidad_precioEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_precioEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_precioEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_precioEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_precioEstadisticaProductos.setText("0.0");

		this.jButtoncantidad_precioEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtoncantidad_precioEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_precioEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_precioEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_precioEstadisticaProductosBusqueda.setText("U");
		this.jButtoncantidad_precioEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_precioEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_precioEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_precioEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_precioEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_precioEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_precioEstadisticaProductosBusqueda.setVisible(false);		}


					
		this.jLabelcantidadEstadisticaProductos = new JLabelMe();
		this.jLabelcantidadEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadEstadisticaProductos.setToolTipText("Cantad");
		this.jLabelcantidadEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelcantidadEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jTextFieldcantidadEstadisticaProductos= new JTextFieldMe();
		jTextFieldcantidadEstadisticaProductos.setEnabled(false);
		jTextFieldcantidadEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadEstadisticaProductos.setText("0");

		this.jButtoncantidadEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtoncantidadEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadEstadisticaProductosBusqueda.setText("U");
		this.jButtoncantidadEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadEstadisticaProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadisticaProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstadisticaProductos = new JLabelMe();
		this.jLabelid_empresaEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstadisticaProductos.setToolTipText("Empresa");
		this.jLabelid_empresaEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelid_empresaEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jComboBoxid_empresaEstadisticaProductos= new JComboBoxMe();
		jComboBoxid_empresaEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstadisticaProductos.setEnabled(false);

		this.jButtonid_empresaEstadisticaProductos= new JButtonMe();
		this.jButtonid_empresaEstadisticaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadisticaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadisticaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadisticaProductos.setText("Buscar");
		this.jButtonid_empresaEstadisticaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstadisticaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadisticaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadisticaProductos"));

		this.jButtonid_empresaEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtonid_empresaEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadisticaProductosBusqueda.setText("U");
		this.jButtonid_empresaEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstadisticaProductosBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstadisticaProductosUpdate= new JButtonMe();
		this.jButtonid_empresaEstadisticaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadisticaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadisticaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadisticaProductosUpdate.setText("U");
		this.jButtonid_empresaEstadisticaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstadisticaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadisticaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadisticaProductosUpdate"));



					
		this.jLabelid_sucursalEstadisticaProductos = new JLabelMe();
		this.jLabelid_sucursalEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEstadisticaProductos.setToolTipText("Sucursal");
		this.jLabelid_sucursalEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelid_sucursalEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jComboBoxid_sucursalEstadisticaProductos= new JComboBoxMe();
		jComboBoxid_sucursalEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEstadisticaProductos.setEnabled(false);

		this.jButtonid_sucursalEstadisticaProductos= new JButtonMe();
		this.jButtonid_sucursalEstadisticaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEstadisticaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEstadisticaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEstadisticaProductos.setText("Buscar");
		this.jButtonid_sucursalEstadisticaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEstadisticaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEstadisticaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEstadisticaProductos"));

		this.jButtonid_sucursalEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtonid_sucursalEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEstadisticaProductosBusqueda.setText("U");
		this.jButtonid_sucursalEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEstadisticaProductosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEstadisticaProductosUpdate= new JButtonMe();
		this.jButtonid_sucursalEstadisticaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstadisticaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstadisticaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEstadisticaProductosUpdate.setText("U");
		this.jButtonid_sucursalEstadisticaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEstadisticaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEstadisticaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEstadisticaProductosUpdate"));



					
		this.jLabelid_productoEstadisticaProductos = new JLabelMe();
		this.jLabelid_productoEstadisticaProductos.setText(""+EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoEstadisticaProductos.setToolTipText("Producto");
		this.jLabelid_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoEstadisticaProductos.setToolTipText(EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		this.jPanelid_productoEstadisticaProductos.setLayout(this.gridaBagLayoutEstadisticaProductos);


		jComboBoxid_productoEstadisticaProductos= new JComboBoxMe();
		jComboBoxid_productoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoEstadisticaProductos= new JButtonMe();
		this.jButtonid_productoEstadisticaProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoEstadisticaProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoEstadisticaProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoEstadisticaProductos.setText("Buscar");
		this.jButtonid_productoEstadisticaProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoEstadisticaProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoEstadisticaProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoEstadisticaProductos"));

		this.jButtonid_productoEstadisticaProductosBusqueda= new JButtonMe();
		this.jButtonid_productoEstadisticaProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoEstadisticaProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoEstadisticaProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoEstadisticaProductosBusqueda.setText("U");
		this.jButtonid_productoEstadisticaProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoEstadisticaProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoEstadisticaProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoEstadisticaProductosBusqueda"));

		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoEstadisticaProductosBusqueda.setVisible(false);		}

		this.jButtonid_productoEstadisticaProductosUpdate= new JButtonMe();
		this.jButtonid_productoEstadisticaProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoEstadisticaProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoEstadisticaProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoEstadisticaProductosUpdate.setText("U");
		this.jButtonid_productoEstadisticaProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoEstadisticaProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoEstadisticaProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoEstadisticaProductosUpdate"));



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
		//this.jInternalFrameDetalleEstadisticaProductos = new EstadisticaProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estadistica Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadisticaProductos= new GridBagLayout();
		

		
		String sToolTipEstadisticaProductos="";
		sToolTipEstadisticaProductos=EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadisticaProductos+="(PuntoVenta.EstadisticaProductos)";
		}
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadisticaProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadisticaProductos = new JButtonMe();
		this.jButtonModificarEstadisticaProductos = new JButtonMe();
        this.jButtonActualizarEstadisticaProductos = new JButtonMe();
        this.jButtonEliminarEstadisticaProductos = new JButtonMe();
        this.jButtonCancelarEstadisticaProductos = new JButtonMe();
        this.jButtonGuardarCambiosEstadisticaProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadisticaProductos = new JButtonMe();
		this.jButtonCerrarEstadisticaProductos = new JButtonMe();
		
		this.jScrollPanelDatosEstadisticaProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadisticaProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadisticaProductos = new JScrollPane();
				
		
		
		this.jPanelCamposEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estadistica Productos";
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadistica Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadisticaProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadisticaProductos.setName("jPanelCamposEstadisticaProductos"); 

		this.jPanelCamposOcultosEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadisticaProductos.setName("jPanelCamposOcultosEstadisticaProductos"); 

        this.jPanelAccionesEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadisticaProductos.setToolTipText("Acciones");
        this.jPanelAccionesEstadisticaProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadisticaProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadisticaProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadisticaProductos.setText("Nuevo");
		this.jButtonModificarEstadisticaProductos.setText("Editar");
        this.jButtonActualizarEstadisticaProductos.setText("Actualizar");
        this.jButtonEliminarEstadisticaProductos.setText("Eliminar");
        this.jButtonCancelarEstadisticaProductos.setText("Cancelar");
        this.jButtonGuardarCambiosEstadisticaProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadisticaProductos.setText("Guardar");
		this.jButtonCerrarEstadisticaProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadisticaProductos,"nuevo_button","Nuevo",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadisticaProductos,"modificar_button","Editar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadisticaProductos,"actualizar_button","Actualizar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadisticaProductos,"eliminar_button","Eliminar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadisticaProductos,"cancelar_button","Cancelar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadisticaProductos,"guardarcambios_button","Guardar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadisticaProductos,"guardarcambiostabla_button","Guardar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadisticaProductos,"cerrar_button","Salir",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadisticaProductos.setToolTipText("Nuevo"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadisticaProductos.setToolTipText("Editar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadisticaProductos.setToolTipText("Actualizar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadisticaProductos.setToolTipText("Eliminar)"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadisticaProductos.setToolTipText("Cancelar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadisticaProductos.setToolTipText("Guardar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadisticaProductos.setToolTipText("Guardar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadisticaProductos.setToolTipText("Salir"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadisticaProductos";
		inputMap = this.jButtonNuevoEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadisticaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadisticaProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadisticaProductos";
		inputMap = this.jButtonActualizarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadisticaProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadisticaProductos";
		inputMap = this.jButtonEliminarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadisticaProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadisticaProductos";
		inputMap = this.jButtonCancelarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadisticaProductos"));
		
		//CERRAR		
		sMapKey = "CerrarEstadisticaProductos";
		inputMap = this.jButtonCerrarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadisticaProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadisticaProductos";
		inputMap = this.jButtonGuardarCambiosTablaEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadisticaProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadisticaProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadisticaProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadisticaProductos.setToolTipText("Nuevo EstadisticaProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadisticaProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadisticaProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadisticaProductos.setToolTipText("Sin Cerrar Ventana EstadisticaProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadisticaProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadisticaProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadisticaProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadisticaProductos.setText("Accion");
		this.jComboBoxTiposAccionesEstadisticaProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadisticaProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadisticaProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadisticaProductos = new JLabelMe();
		
		this.jLabelAccionesEstadisticaProductos.setText("Acciones");		
		this.jLabelAccionesEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadisticaProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadisticaProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadisticaProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadisticaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadisticaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadisticaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadisticaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadisticaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadisticaProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadisticaProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadisticaProductos = new GridBagLayout();
		
		this.jPanelCamposEstadisticaProductos.setLayout(gridaBagLayoutCamposEstadisticaProductos);
		this.jPanelCamposOcultosEstadisticaProductos.setLayout(gridaBagLayoutCamposOcultosEstadisticaProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadisticaProductos.add(jLabelIdEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadisticaProductos.add(jLabelidEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstadisticaProductos.add(jLabelid_empresaEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadisticaProductos.add(jButtonid_empresaEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 3;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadisticaProductos.add(jButtonid_empresaEstadisticaProductosUpdate, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstadisticaProductos.add(jComboBoxid_empresaEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEstadisticaProductos.add(jLabelid_sucursalEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEstadisticaProductos.add(jButtonid_sucursalEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 3;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEstadisticaProductos.add(jButtonid_sucursalEstadisticaProductosUpdate, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEstadisticaProductos.add(jComboBoxid_sucursalEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoEstadisticaProductos.add(jLabelid_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoEstadisticaProductos.add(jButtonid_productoEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 3;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoEstadisticaProductos.add(jButtonid_productoEstadisticaProductosUpdate, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoEstadisticaProductos.add(jComboBoxid_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioEstadisticaProductos.add(jLabelfecha_inicioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioEstadisticaProductos.add(jButtonfecha_inicioEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioEstadisticaProductos.add(jDateChooserfecha_inicioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finEstadisticaProductos.add(jLabelfecha_finEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finEstadisticaProductos.add(jButtonfecha_finEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finEstadisticaProductos.add(jDateChooserfecha_finEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoEstadisticaProductos.add(jLabelcodigo_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoEstadisticaProductos.add(jButtoncodigo_productoEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoEstadisticaProductos.add(jTextFieldcodigo_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoEstadisticaProductos.add(jLabelnombre_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoEstadisticaProductos.add(jButtonnombre_productoEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoEstadisticaProductos.add(jscrollPanenombre_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_precioEstadisticaProductos.add(jLabelcantidad_precioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_precioEstadisticaProductos.add(jButtoncantidad_precioEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_precioEstadisticaProductos.add(jTextFieldcantidad_precioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadEstadisticaProductos.add(jLabelcantidadEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 2;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
		this.gridBagConstraintsEstadisticaProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadEstadisticaProductos.add(jButtoncantidadEstadisticaProductosBusqueda, this.gridBagConstraintsEstadisticaProductos);
	}

	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadisticaProductos.gridy = 0;
	this.gridBagConstraintsEstadisticaProductos.gridx = 1;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadEstadisticaProductos.add(jTextFieldcantidadEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelidEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelid_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelfecha_inicioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelfecha_finEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelcodigo_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelnombre_productoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelcantidad_precioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadisticaProductos.add(this.jPanelcantidadEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposEstadisticaProductos % 1==0) {
		iXPanelCamposEstadisticaProductos=0;
		iYPanelCamposEstadisticaProductos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposOcultosEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposOcultosEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadisticaProductos.add(this.jPanelid_empresaEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposOcultosEstadisticaProductos % 1==0) {
		iXPanelCamposOcultosEstadisticaProductos=0;
		iYPanelCamposOcultosEstadisticaProductos++;
	}
	this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadisticaProductos.gridy = iYPanelCamposOcultosEstadisticaProductos;
	this.gridBagConstraintsEstadisticaProductos.gridx = iXPanelCamposOcultosEstadisticaProductos++;
	this.gridBagConstraintsEstadisticaProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadisticaProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadisticaProductos.add(this.jPanelid_sucursalEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);



	if(iXPanelCamposOcultosEstadisticaProductos % 1==0) {
		iXPanelCamposOcultosEstadisticaProductos=0;
		iYPanelCamposOcultosEstadisticaProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadisticaProductos= new GridBagLayout();
		this.jPanelAccionesEstadisticaProductos.setLayout(gridaBagLayoutAccionesEstadisticaProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadisticaProductos= new GridBagLayout();
		this.jPanelAccionesFormularioEstadisticaProductos.setLayout(gridaBagLayoutAccionesFormularioEstadisticaProductos);
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadisticaProductos.add(this.jComboBoxTiposAccionesFormularioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadisticaProductos.add(this.jButtonModificarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);							

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadisticaProductos.add(this.jButtonEliminarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadisticaProductos.add(this.jButtonActualizarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadisticaProductos.add(this.jButtonGuardarCambiosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);	
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;		
		this.gridBagConstraintsEstadisticaProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadisticaProductos.add(this.jButtonCancelarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadisticaProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();						
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;		
			//this.gridBagConstraintsEstadisticaProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadisticaProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadisticaProductos.gridx =0;
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadisticaProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadisticaProductos = new EstadisticaProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estadistica Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estadistica Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estadistica Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadisticaProductosModel estadisticaproductosModel=new EstadisticaProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadisticaProductosModel.EstadisticaProductosFocusTraversalPolicy estadisticaproductosFocusTraversalPolicy = estadisticaproductosModel.new EstadisticaProductosFocusTraversalPolicy(this);
			
			//estadisticaproductosFocusTraversalPolicy.setestadisticaproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadisticaproductosModel);
			
			
			this.jContentPaneDetalleEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadisticaProductos = new GridBagLayout();	
			this.jContentPaneDetalleEstadisticaProductos.setLayout(gridaBagLayoutDetalleEstadisticaProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadisticaProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
				this.gridBagConstraintsEstadisticaProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadisticaProductos.gridx = 0;
					
				
				this.jContentPaneDetalleEstadisticaProductos.add(jTtoolBarDetalleEstadisticaProductos, gridBagConstraintsEstadisticaProductos);								
				
}
			
			this.jScrollPanelDatosEdicionEstadisticaProductos=   new JScrollPane(jContentPaneDetalleEstadisticaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadisticaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadisticaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadisticaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadisticaProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadisticaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadisticaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadisticaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadisticaProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	        
			this.jContentPaneDetalleEstadisticaProductos.add(jPanelCamposEstadisticaProductos, gridBagConstraintsEstadisticaProductos);
			
			
			
			
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
						//&& estadisticaproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadisticaProductos= new GridBagConstraints();
						this.gridBagConstraintsEstadisticaProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadisticaProductos.gridx = 0;
						this.jContentPaneDetalleEstadisticaProductos.add(this.jTabbedPaneRelacionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadisticaProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadisticaProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
					this.gridBagConstraintsEstadisticaProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadisticaProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadisticaProductos.gridx = 0;
					
				
					this.jContentPaneDetalleEstadisticaProductos.add(jPanelCamposOcultosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);
				
					this.jPanelCamposOcultosEstadisticaProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	        this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadisticaProductos.add(this.jPanelAccionesFormularioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);							
			
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
	        this.gridBagConstraintsEstadisticaProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadisticaProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadisticaProductos.add(this.jPanelAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadisticaProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadisticaProductos=   new JScrollPane(this.jPanelCamposEstadisticaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadisticaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadisticaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadisticaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadisticaProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadisticaProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadisticaProductos;
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
