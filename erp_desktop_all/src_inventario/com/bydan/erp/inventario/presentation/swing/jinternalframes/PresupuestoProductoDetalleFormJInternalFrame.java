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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.PresupuestoProductoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class PresupuestoProductoDetalleFormJInternalFrame extends PresupuestoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresupuestoProducto;
	
	protected JMenuBar jmenuBarDetallePresupuestoProducto;
	
	protected JMenu jmenuDetallePresupuestoProducto;
	protected JMenu jmenuDetalleArchivoPresupuestoProducto;
	protected JMenu jmenuDetalleAccionesPresupuestoProducto;
	protected JMenu jmenuDetalleDatosPresupuestoProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoProducto;	
	protected GridBagConstraints gridBagConstraintsPresupuestoProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresupuestoProductoBeanSwingJInternalFrameAdditional jInternalFrameDetallePresupuestoProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public PresupuestoProductoSessionBean presupuestoproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;	
	
	public PresupuestoProductoLogic presupuestoproductoLogic;
	
	public JScrollPane jScrollPanelDatosPresupuestoProducto;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoProducto;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoProducto;
	
	protected JPanel jPanelCamposPresupuestoProducto;    
	protected JPanel jPanelCamposOcultosPresupuestoProducto;    	
	protected JPanel jPanelAccionesPresupuestoProducto;
	protected JPanel jPanelAccionesFormularioPresupuestoProducto;
    
	
	
	protected Integer iXPanelCamposPresupuestoProducto=0;
	protected Integer iYPanelCamposPresupuestoProducto=0;
	
	protected Integer iXPanelCamposOcultosPresupuestoProducto=0;
	protected Integer iYPanelCamposOcultosPresupuestoProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresupuestoProducto;
	public JButton jButtonModificarPresupuestoProducto;
	public JButton jButtonActualizarPresupuestoProducto;
    public JButton jButtonEliminarPresupuestoProducto;
	public JButton jButtonCancelarPresupuestoProducto;
    public JButton jButtonGuardarCambiosPresupuestoProducto;
	public JButton jButtonGuardarCambiosTablaPresupuestoProducto;
	protected JButton jButtonCerrarPresupuestoProducto;
	
	
	protected JButton jButtonProcesarInformacionPresupuestoProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresupuestoProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresupuestoProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresupuestoProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoProducto;
	protected JButton jButtonModificarToolBarPresupuestoProducto;
	protected JButton jButtonActualizarToolBarPresupuestoProducto;
    protected JButton jButtonEliminarToolBarPresupuestoProducto;
	protected JButton jButtonCancelarToolBarPresupuestoProducto;
    protected JButton jButtonGuardarCambiosToolBarPresupuestoProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarPresupuestoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoProducto;
	protected JButton jButtonCerrarToolBarPresupuestoProducto;
	
	protected JButton jButtonProcesarInformacionToolBarPresupuestoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoProducto;
	protected JMenuItem jMenuItemModificarPresupuestoProducto;
	protected JMenuItem jMenuItemActualizarPresupuestoProducto;
    protected JMenuItem jMenuItemEliminarPresupuestoProducto;
	protected JMenuItem jMenuItemCancelarPresupuestoProducto;
    protected JMenuItem jMenuItemGuardarCambiosPresupuestoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoProducto;
	protected JMenuItem jMenuItemCerrarPresupuestoProducto;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoProducto;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresupuestoProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresupuestoProducto;
	public JLabel jLabelIdPresupuestoProducto;
	public JLabel jLabelidPresupuestoProducto;
	public JButton jButtonidPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_ingresoPresupuestoProducto;
	public JLabel jLabelvalor_ingresoPresupuestoProducto;
	public JTextField jTextFieldvalor_ingresoPresupuestoProducto;
	public JButton jButtonvalor_ingresoPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_egresoPresupuestoProducto;
	public JLabel jLabelvalor_egresoPresupuestoProducto;
	public JTextField jTextFieldvalor_egresoPresupuestoProducto;
	public JButton jButtonvalor_egresoPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_ingresoPresupuestoProducto;
	public JLabel jLabelcantidad_ingresoPresupuestoProducto;
	public JTextField jTextFieldcantidad_ingresoPresupuestoProducto;
	public JButton jButtoncantidad_ingresoPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_egresoPresupuestoProducto;
	public JLabel jLabelcantidad_egresoPresupuestoProducto;
	public JTextField jTextFieldcantidad_egresoPresupuestoProducto;
	public JButton jButtoncantidad_egresoPresupuestoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresupuestoProducto;
	public JLabel jLabelid_empresaPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresupuestoProducto;
	public JButton jButtonid_empresaPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPresupuestoProducto;
	public JLabel jLabelid_sucursalPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPresupuestoProducto;
	public JButton jButtonid_sucursalPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPresupuestoProducto;
	public JLabel jLabelid_ejercicioPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPresupuestoProducto;
	public JButton jButtonid_ejercicioPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPresupuestoProducto;
	public JLabel jLabelid_periodoPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPresupuestoProducto;
	public JButton jButtonid_periodoPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_periodoPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contablePresupuestoProducto;
	public JLabel jLabelid_cuenta_contablePresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contablePresupuestoProducto;
	public JButton jButtonid_cuenta_contablePresupuestoProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresupuestoProductoArbol= new JButtonMe();

	public JPanel jPanelid_bodegaPresupuestoProducto;
	public JLabel jLabelid_bodegaPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaPresupuestoProducto;
	public JButton jButtonid_bodegaPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_bodegaPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaPresupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPresupuestoProducto;
	public JLabel jLabelid_productoPresupuestoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPresupuestoProducto;
	public JButton jButtonid_productoPresupuestoProducto= new JButtonMe();
	public JButton jButtonid_productoPresupuestoProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoPresupuestoProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresupuestoProducto;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresupuestoProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresupuestoProducto=new JPanel();
				this.jPanelAccionesFormularioPresupuestoProducto=new JPanel();
				this.jmenuBarDetallePresupuestoProducto=new JMenuBar();
				this.jTtoolBarDetallePresupuestoProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresupuestoProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresupuestoProducto() {
		return this.jButtonActualizarToolBarPresupuestoProducto;
	}
	
	public JButton getjButtonEliminarToolBarPresupuestoProducto() {
		return this.jButtonEliminarToolBarPresupuestoProducto;
	}
	
	public JButton getjButtonCancelarToolBarPresupuestoProducto() {
		return this.jButtonCancelarToolBarPresupuestoProducto;
	}		
	
	public JButton getjButtonProcesarInformacionPresupuestoProducto() {
		return this.jButtonProcesarInformacionPresupuestoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoProducto)	{
		this.jButtonProcesarInformacionPresupuestoProducto = jButtonProcesarInformacionPresupuestoProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoProducto() {
		return this.jComboBoxTiposAccionesPresupuestoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoProducto(
			JComboBox jComboBoxTiposRelacionesPresupuestoProducto) {
		this.jComboBoxTiposRelacionesPresupuestoProducto = jComboBoxTiposRelacionesPresupuestoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoProducto(
			JComboBox jComboBoxTiposAccionesPresupuestoProducto) {
		this.jComboBoxTiposAccionesPresupuestoProducto = jComboBoxTiposAccionesPresupuestoProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresupuestoProducto() {
		return this.jComboBoxTiposAccionesFormularioPresupuestoProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresupuestoProducto(
			JComboBox jComboBoxTiposAccionesFormularioPresupuestoProducto) {
		this.jComboBoxTiposAccionesFormularioPresupuestoProducto = jComboBoxTiposAccionesFormularioPresupuestoProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		
		this.presupuestoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestoproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Producto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		PresupuestoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresupuestoProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresupuestoProducto=new JButtonMe();
				this.jButtonModificarToolBarPresupuestoProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresupuestoProducto,this.jTtoolBarDetallePresupuestoProducto,
							"actualizar","actualizar","Actualizar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresupuestoProducto,this.jTtoolBarDetallePresupuestoProducto,
							"eliminar","eliminar","Eliminar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresupuestoProducto,this.jTtoolBarDetallePresupuestoProducto,
							"cancelar","cancelar","Cancelar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresupuestoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresupuestoProducto,this.jTtoolBarDetallePresupuestoProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresupuestoProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresupuestoProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresupuestoProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresupuestoProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresupuestoProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresupuestoProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresupuestoProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresupuestoProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresupuestoProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresupuestoProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresupuestoProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresupuestoProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresupuestoProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresupuestoProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresupuestoProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresupuestoProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresupuestoProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresupuestoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresupuestoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresupuestoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresupuestoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresupuestoProducto.add(this.jMenuItemDetalleCerrarPresupuestoProducto);
		
		this.jmenuDetalleAccionesPresupuestoProducto.add(this.jMenuItemActualizarPresupuestoProducto);
		this.jmenuDetalleAccionesPresupuestoProducto.add(this.jMenuItemEliminarPresupuestoProducto);
		this.jmenuDetalleAccionesPresupuestoProducto.add(this.jMenuItemCancelarPresupuestoProducto);		
		
		//this.jmenuDetalleDatosPresupuestoProducto.add(this.jMenuItemDetalleAbrirOrderByPresupuestoProducto);				
		this.jmenuDetalleDatosPresupuestoProducto.add(this.jMenuItemDetalleMostarOcultarPresupuestoProducto);				
				
		//this.jmenuDetalleAccionesPresupuestoProducto.add(this.jMenuItemGuardarCambiosPresupuestoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresupuestoProducto.add(this.jmenuDetalleArchivoPresupuestoProducto);		
		this.jmenuBarDetallePresupuestoProducto.add(this.jmenuDetalleAccionesPresupuestoProducto);		
		this.jmenuBarDetallePresupuestoProducto.add(this.jmenuDetalleDatosPresupuestoProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresupuestoProducto);				
	}
	
	
	public void inicializarElementosCamposPresupuestoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresupuestoProducto = new JLabelMe();
		jLabelIdPresupuestoProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresupuestoProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresupuestoProducto= new GridBagLayout();

		this.jPanelidPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);

		jLabelidPresupuestoProducto = new JLabel();
		jLabelidPresupuestoProducto.setText("Id");

		jLabelidPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_ingresoPresupuestoProducto = new JLabelMe();
		this.jLabelvalor_ingresoPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO+" : *");
		this.jLabelvalor_ingresoPresupuestoProducto.setToolTipText("Valor Ingreso");
		this.jLabelvalor_ingresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ingresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ingresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_ingresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_ingresoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_ingresoPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelvalor_ingresoPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jTextFieldvalor_ingresoPresupuestoProducto= new JTextFieldMe();
		jTextFieldvalor_ingresoPresupuestoProducto.setEnabled(false);
		jTextFieldvalor_ingresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ingresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ingresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_ingresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_ingresoPresupuestoProducto.setText("0.0");

		this.jButtonvalor_ingresoPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setText("U");
		this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_ingresoPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_ingresoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_ingresoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_ingresoPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_ingresoPresupuestoProductoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_egresoPresupuestoProducto = new JLabelMe();
		this.jLabelvalor_egresoPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO+" : *");
		this.jLabelvalor_egresoPresupuestoProducto.setToolTipText("Valor Egreso");
		this.jLabelvalor_egresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_egresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_egresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_egresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_egresoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_egresoPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelvalor_egresoPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jTextFieldvalor_egresoPresupuestoProducto= new JTextFieldMe();
		jTextFieldvalor_egresoPresupuestoProducto.setEnabled(false);
		jTextFieldvalor_egresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_egresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_egresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_egresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_egresoPresupuestoProducto.setText("0.0");

		this.jButtonvalor_egresoPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonvalor_egresoPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_egresoPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_egresoPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_egresoPresupuestoProductoBusqueda.setText("U");
		this.jButtonvalor_egresoPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_egresoPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_egresoPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_egresoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_egresoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_egresoPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_egresoPresupuestoProductoBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_ingresoPresupuestoProducto = new JLabelMe();
		this.jLabelcantidad_ingresoPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO+" : *");
		this.jLabelcantidad_ingresoPresupuestoProducto.setToolTipText("Cantidad Ingreso");
		this.jLabelcantidad_ingresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_ingresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_ingresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_ingresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_ingresoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_ingresoPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelcantidad_ingresoPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jTextFieldcantidad_ingresoPresupuestoProducto= new JTextFieldMe();
		jTextFieldcantidad_ingresoPresupuestoProducto.setEnabled(false);
		jTextFieldcantidad_ingresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_ingresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_ingresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_ingresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_ingresoPresupuestoProducto.setText("0.0");

		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setText("U");
		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_ingresoPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_ingresoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_ingresoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_ingresoPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_ingresoPresupuestoProductoBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_egresoPresupuestoProducto = new JLabelMe();
		this.jLabelcantidad_egresoPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO+" : *");
		this.jLabelcantidad_egresoPresupuestoProducto.setToolTipText("Cantidad Egreso");
		this.jLabelcantidad_egresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_egresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_egresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_egresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_egresoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_egresoPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelcantidad_egresoPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jTextFieldcantidad_egresoPresupuestoProducto= new JTextFieldMe();
		jTextFieldcantidad_egresoPresupuestoProducto.setEnabled(false);
		jTextFieldcantidad_egresoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_egresoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_egresoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_egresoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_egresoPresupuestoProducto.setText("0.0");

		this.jButtoncantidad_egresoPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setText("U");
		this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_egresoPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_egresoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_egresoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_egresoPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_egresoPresupuestoProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresupuestoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresupuestoProducto = new JLabelMe();
		this.jLabelid_empresaPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresupuestoProducto.setToolTipText("Empresa");
		this.jLabelid_empresaPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_empresaPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_empresaPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_empresaPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresupuestoProducto.setEnabled(false);

		this.jButtonid_empresaPresupuestoProducto= new JButtonMe();
		this.jButtonid_empresaPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresupuestoProducto.setText("Buscar");
		this.jButtonid_empresaPresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoProducto"));

		this.jButtonid_empresaPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoProductoBusqueda.setText("U");
		this.jButtonid_empresaPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_empresaPresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresupuestoProductoUpdate.setText("U");
		this.jButtonid_empresaPresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresupuestoProductoUpdate"));



					
		this.jLabelid_sucursalPresupuestoProducto = new JLabelMe();
		this.jLabelid_sucursalPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPresupuestoProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_sucursalPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_sucursalPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_sucursalPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPresupuestoProducto.setEnabled(false);

		this.jButtonid_sucursalPresupuestoProducto= new JButtonMe();
		this.jButtonid_sucursalPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPresupuestoProducto.setText("Buscar");
		this.jButtonid_sucursalPresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoProducto"));

		this.jButtonid_sucursalPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoProductoBusqueda.setText("U");
		this.jButtonid_sucursalPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalPresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPresupuestoProductoUpdate.setText("U");
		this.jButtonid_sucursalPresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPresupuestoProductoUpdate"));



					
		this.jLabelid_ejercicioPresupuestoProducto = new JLabelMe();
		this.jLabelid_ejercicioPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPresupuestoProducto.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_ejercicioPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_ejercicioPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_ejercicioPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPresupuestoProducto.setEnabled(false);

		this.jButtonid_ejercicioPresupuestoProducto= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPresupuestoProducto.setText("Buscar");
		this.jButtonid_ejercicioPresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoProducto"));

		this.jButtonid_ejercicioPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoProductoBusqueda.setText("U");
		this.jButtonid_ejercicioPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_ejercicioPresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPresupuestoProductoUpdate.setText("U");
		this.jButtonid_ejercicioPresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPresupuestoProductoUpdate"));



					
		this.jLabelid_periodoPresupuestoProducto = new JLabelMe();
		this.jLabelid_periodoPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPresupuestoProducto.setToolTipText("Periodo");
		this.jLabelid_periodoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_periodoPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_periodoPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_periodoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPresupuestoProducto.setEnabled(false);

		this.jButtonid_periodoPresupuestoProducto= new JButtonMe();
		this.jButtonid_periodoPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPresupuestoProducto.setText("Buscar");
		this.jButtonid_periodoPresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoProducto"));

		this.jButtonid_periodoPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_periodoPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoProductoBusqueda.setText("U");
		this.jButtonid_periodoPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_periodoPresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_periodoPresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPresupuestoProductoUpdate.setText("U");
		this.jButtonid_periodoPresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPresupuestoProductoUpdate"));



					
		this.jLabelid_cuenta_contablePresupuestoProducto = new JLabelMe();
		this.jLabelid_cuenta_contablePresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contablePresupuestoProducto.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contablePresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contablePresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contablePresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contablePresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_cuenta_contablePresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_cuenta_contablePresupuestoProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contablePresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contablePresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contablePresupuestoProducto= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresupuestoProducto.setText("Buscar");
		this.jButtonid_cuenta_contablePresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contablePresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contablePresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoProducto"));

		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contablePresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contablePresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contablePresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contablePresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresupuestoProductoUpdate.setText("U");
		this.jButtonid_cuenta_contablePresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contablePresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contablePresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoProductoUpdate"));


		jButtonid_cuenta_contablePresupuestoProductoArbol= new JButtonMe();
		jButtonid_cuenta_contablePresupuestoProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresupuestoProductoArbol.setText("Arbol");
		jButtonid_cuenta_contablePresupuestoProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contablePresupuestoProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresupuestoProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contablePresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresupuestoProductoArbol"));



					
		this.jLabelid_bodegaPresupuestoProducto = new JLabelMe();
		this.jLabelid_bodegaPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaPresupuestoProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_bodegaPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_bodegaPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_bodegaPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaPresupuestoProducto= new JButtonMe();
		this.jButtonid_bodegaPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPresupuestoProducto.setText("Buscar");
		this.jButtonid_bodegaPresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaPresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPresupuestoProducto"));

		this.jButtonid_bodegaPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPresupuestoProductoBusqueda.setText("U");
		this.jButtonid_bodegaPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaPresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaPresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaPresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPresupuestoProductoUpdate.setText("U");
		this.jButtonid_bodegaPresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaPresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPresupuestoProductoUpdate"));



					
		this.jLabelid_productoPresupuestoProducto = new JLabelMe();
		this.jLabelid_productoPresupuestoProducto.setText(""+PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPresupuestoProducto.setToolTipText("Producto");
		this.jLabelid_productoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPresupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPresupuestoProducto.setToolTipText(PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		this.jPanelid_productoPresupuestoProducto.setLayout(this.gridaBagLayoutPresupuestoProducto);


		jComboBoxid_productoPresupuestoProducto= new JComboBoxMe();
		jComboBoxid_productoPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPresupuestoProducto= new JButtonMe();
		this.jButtonid_productoPresupuestoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPresupuestoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPresupuestoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPresupuestoProducto.setText("Buscar");
		this.jButtonid_productoPresupuestoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPresupuestoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPresupuestoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPresupuestoProducto"));

		this.jButtonid_productoPresupuestoProductoBusqueda= new JButtonMe();
		this.jButtonid_productoPresupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPresupuestoProductoBusqueda.setText("U");
		this.jButtonid_productoPresupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPresupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPresupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPresupuestoProductoBusqueda"));

		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPresupuestoProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoPresupuestoProductoUpdate= new JButtonMe();
		this.jButtonid_productoPresupuestoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPresupuestoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPresupuestoProductoUpdate.setText("U");
		this.jButtonid_productoPresupuestoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPresupuestoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPresupuestoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPresupuestoProductoUpdate"));



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
		//this.jInternalFrameDetallePresupuestoProducto = new PresupuestoProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Presupuesto Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoProducto= new GridBagLayout();
		

		
		String sToolTipPresupuestoProducto="";
		sToolTipPresupuestoProducto=PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoProducto+="(Inventario.PresupuestoProducto)";
		}
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresupuestoProducto = new JButtonMe();
		this.jButtonModificarPresupuestoProducto = new JButtonMe();
        this.jButtonActualizarPresupuestoProducto = new JButtonMe();
        this.jButtonEliminarPresupuestoProducto = new JButtonMe();
        this.jButtonCancelarPresupuestoProducto = new JButtonMe();
        this.jButtonGuardarCambiosPresupuestoProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresupuestoProducto = new JButtonMe();
		this.jButtonCerrarPresupuestoProducto = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresupuestoProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralPresupuestoProducto = new JScrollPane();
				
		
		
		this.jPanelCamposPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Producto";
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresupuestoProducto.setName("jPanelCamposPresupuestoProducto"); 

		this.jPanelCamposOcultosPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresupuestoProducto.setName("jPanelCamposOcultosPresupuestoProducto"); 

        this.jPanelAccionesPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoProducto.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresupuestoProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresupuestoProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresupuestoProducto.setText("Nuevo");
		this.jButtonModificarPresupuestoProducto.setText("Editar");
        this.jButtonActualizarPresupuestoProducto.setText("Actualizar");
        this.jButtonEliminarPresupuestoProducto.setText("Eliminar");
        this.jButtonCancelarPresupuestoProducto.setText("Cancelar");
        this.jButtonGuardarCambiosPresupuestoProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresupuestoProducto.setText("Guardar");
		this.jButtonCerrarPresupuestoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoProducto,"nuevo_button","Nuevo",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresupuestoProducto,"modificar_button","Editar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresupuestoProducto,"actualizar_button","Actualizar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresupuestoProducto,"eliminar_button","Eliminar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresupuestoProducto,"cancelar_button","Cancelar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresupuestoProducto,"guardarcambios_button","Guardar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoProducto,"guardarcambiostabla_button","Guardar",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoProducto,"cerrar_button","Salir",this.presupuestoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresupuestoProducto.setToolTipText("Nuevo"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresupuestoProducto.setToolTipText("Editar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresupuestoProducto.setToolTipText("Actualizar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresupuestoProducto.setToolTipText("Eliminar)"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresupuestoProducto.setToolTipText("Cancelar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresupuestoProducto.setToolTipText("Guardar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresupuestoProducto.setToolTipText("Guardar"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoProducto.setToolTipText("Salir"+" "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoProducto";
		inputMap = this.jButtonNuevoPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresupuestoProducto";
		inputMap = this.jButtonActualizarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresupuestoProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarPresupuestoProducto";
		inputMap = this.jButtonEliminarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresupuestoProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarPresupuestoProducto";
		inputMap = this.jButtonCancelarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresupuestoProducto"));
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoProducto";
		inputMap = this.jButtonCerrarPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoProducto";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresupuestoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresupuestoProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresupuestoProducto.setToolTipText("Nuevo PresupuestoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresupuestoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresupuestoProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresupuestoProducto.setToolTipText("Sin Cerrar Ventana PresupuestoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresupuestoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresupuestoProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresupuestoProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoProducto.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresupuestoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresupuestoProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresupuestoProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresupuestoProducto = new JLabelMe();
		
		this.jLabelAccionesPresupuestoProducto.setText("Acciones");		
		this.jLabelAccionesPresupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresupuestoProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresupuestoProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresupuestoProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesPresupuestoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresupuestoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresupuestoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresupuestoProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresupuestoProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresupuestoProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresupuestoProducto = new GridBagLayout();
		
		this.jPanelCamposPresupuestoProducto.setLayout(gridaBagLayoutCamposPresupuestoProducto);
		this.jPanelCamposOcultosPresupuestoProducto.setLayout(gridaBagLayoutCamposOcultosPresupuestoProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresupuestoProducto.add(jLabelIdPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresupuestoProducto.add(jLabelidPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresupuestoProducto.add(jLabelid_empresaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoProducto.add(jButtonid_empresaPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresupuestoProducto.add(jButtonid_empresaPresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresupuestoProducto.add(jComboBoxid_empresaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPresupuestoProducto.add(jLabelid_sucursalPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoProducto.add(jButtonid_sucursalPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPresupuestoProducto.add(jButtonid_sucursalPresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPresupuestoProducto.add(jComboBoxid_sucursalPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPresupuestoProducto.add(jLabelid_ejercicioPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoProducto.add(jButtonid_ejercicioPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPresupuestoProducto.add(jButtonid_ejercicioPresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPresupuestoProducto.add(jComboBoxid_ejercicioPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPresupuestoProducto.add(jLabelid_periodoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoProducto.add(jButtonid_periodoPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPresupuestoProducto.add(jButtonid_periodoPresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPresupuestoProducto.add(jComboBoxid_periodoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contablePresupuestoProducto.add(jLabelid_cuenta_contablePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresupuestoProducto.add(jButtonid_cuenta_contablePresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresupuestoProducto.add(jButtonid_cuenta_contablePresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contablePresupuestoProducto.add(jComboBoxid_cuenta_contablePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaPresupuestoProducto.add(jLabelid_bodegaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPresupuestoProducto.add(jButtonid_bodegaPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPresupuestoProducto.add(jButtonid_bodegaPresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaPresupuestoProducto.add(jComboBoxid_bodegaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPresupuestoProducto.add(jLabelid_productoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 2;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoPresupuestoProducto.add(jButtonid_productoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 3;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPresupuestoProducto.add(jButtonid_productoPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 4;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPresupuestoProducto.add(jButtonid_productoPresupuestoProductoUpdate, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPresupuestoProducto.add(jComboBoxid_productoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_ingresoPresupuestoProducto.add(jLabelvalor_ingresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_ingresoPresupuestoProducto.add(jButtonvalor_ingresoPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_ingresoPresupuestoProducto.add(jTextFieldvalor_ingresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_egresoPresupuestoProducto.add(jLabelvalor_egresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_egresoPresupuestoProducto.add(jButtonvalor_egresoPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_egresoPresupuestoProducto.add(jTextFieldvalor_egresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_ingresoPresupuestoProducto.add(jLabelcantidad_ingresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_ingresoPresupuestoProducto.add(jButtoncantidad_ingresoPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_ingresoPresupuestoProducto.add(jTextFieldcantidad_ingresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_egresoPresupuestoProducto.add(jLabelcantidad_egresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = 2;
		this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
		this.gridBagConstraintsPresupuestoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_egresoPresupuestoProducto.add(jButtoncantidad_egresoPresupuestoProductoBusqueda, this.gridBagConstraintsPresupuestoProducto);
	}

	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresupuestoProducto.gridy = 0;
	this.gridBagConstraintsPresupuestoProducto.gridx = 1;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_egresoPresupuestoProducto.add(jTextFieldcantidad_egresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelidPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelid_cuenta_contablePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelid_bodegaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelid_productoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelvalor_ingresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelvalor_egresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelcantidad_ingresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresupuestoProducto.add(this.jPanelcantidad_egresoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposPresupuestoProducto % 1==0) {
		iXPanelCamposPresupuestoProducto=0;
		iYPanelCamposPresupuestoProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposOcultosPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposOcultosPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoProducto.add(this.jPanelid_empresaPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposOcultosPresupuestoProducto % 1==0) {
		iXPanelCamposOcultosPresupuestoProducto=0;
		iYPanelCamposOcultosPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposOcultosPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposOcultosPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoProducto.add(this.jPanelid_sucursalPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposOcultosPresupuestoProducto % 1==0) {
		iXPanelCamposOcultosPresupuestoProducto=0;
		iYPanelCamposOcultosPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposOcultosPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposOcultosPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoProducto.add(this.jPanelid_ejercicioPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposOcultosPresupuestoProducto % 1==0) {
		iXPanelCamposOcultosPresupuestoProducto=0;
		iYPanelCamposOcultosPresupuestoProducto++;
	}
	this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresupuestoProducto.gridy = iYPanelCamposOcultosPresupuestoProducto;
	this.gridBagConstraintsPresupuestoProducto.gridx = iXPanelCamposOcultosPresupuestoProducto++;
	this.gridBagConstraintsPresupuestoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresupuestoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresupuestoProducto.add(this.jPanelid_periodoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);



	if(iXPanelCamposOcultosPresupuestoProducto % 1==0) {
		iXPanelCamposOcultosPresupuestoProducto=0;
		iYPanelCamposOcultosPresupuestoProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoProducto= new GridBagLayout();
		this.jPanelAccionesPresupuestoProducto.setLayout(gridaBagLayoutAccionesPresupuestoProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresupuestoProducto= new GridBagLayout();
		this.jPanelAccionesFormularioPresupuestoProducto.setLayout(gridaBagLayoutAccionesFormularioPresupuestoProducto);
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoProducto.add(this.jComboBoxTiposAccionesFormularioPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresupuestoProducto.add(this.jCheckBoxPostAccionNuevoPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoProducto.add(this.jCheckBoxPostAccionSinCerrarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresupuestoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresupuestoProducto.add(this.jCheckBoxPostAccionSinMensajePresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresupuestoProducto.add(this.jButtonModificarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);							

		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;
		this.gridBagConstraintsPresupuestoProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresupuestoProducto.add(this.jButtonEliminarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoProducto.add(this.jButtonActualizarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);


		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;		
		this.gridBagConstraintsPresupuestoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresupuestoProducto.add(this.jButtonGuardarCambiosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);	
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = 0;		
		this.gridBagConstraintsPresupuestoProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresupuestoProducto.add(this.jButtonCancelarPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;		
			//this.gridBagConstraintsPresupuestoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoProducto.gridx =0;
		this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresupuestoProducto = new PresupuestoProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Presupuesto Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Presupuesto Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresupuestoProductoModel presupuestoproductoModel=new PresupuestoProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//PresupuestoProductoModel.PresupuestoProductoFocusTraversalPolicy presupuestoproductoFocusTraversalPolicy = presupuestoproductoModel.new PresupuestoProductoFocusTraversalPolicy(this);
			
			//presupuestoproductoFocusTraversalPolicy.setpresupuestoproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presupuestoproductoModel);
			
			
			this.jContentPaneDetallePresupuestoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresupuestoProducto = new GridBagLayout();	
			this.jContentPaneDetallePresupuestoProducto.setLayout(gridaBagLayoutDetallePresupuestoProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresupuestoProducto.gridx = 0;
					
				
				this.jContentPaneDetallePresupuestoProducto.add(jTtoolBarDetallePresupuestoProducto, gridBagConstraintsPresupuestoProducto);								
				
}
			
			this.jScrollPanelDatosEdicionPresupuestoProducto=   new JScrollPane(jContentPaneDetallePresupuestoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresupuestoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresupuestoProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	        
			this.jContentPaneDetallePresupuestoProducto.add(jPanelCamposPresupuestoProducto, gridBagConstraintsPresupuestoProducto);
			
			
			
			
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
						&& presupuestoproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresupuestoProducto= new GridBagConstraints();
						this.gridBagConstraintsPresupuestoProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresupuestoProducto.gridx = 0;
						this.jContentPaneDetallePresupuestoProducto.add(this.jTabbedPaneRelacionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresupuestoProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresupuestoProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
					this.gridBagConstraintsPresupuestoProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresupuestoProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresupuestoProducto.gridx = 0;
					
				
					this.jContentPaneDetallePresupuestoProducto.add(jPanelCamposOcultosPresupuestoProducto, gridBagConstraintsPresupuestoProducto);
				
					this.jPanelCamposOcultosPresupuestoProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	        this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresupuestoProducto.add(this.jPanelAccionesFormularioPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);							
			
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
	        this.gridBagConstraintsPresupuestoProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresupuestoProducto.gridx = 0;
	        
			
			this.jContentPaneDetallePresupuestoProducto.add(this.jPanelAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresupuestoProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresupuestoProducto=   new JScrollPane(this.jPanelCamposPresupuestoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresupuestoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresupuestoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;
			this.gridBagConstraintsPresupuestoProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresupuestoProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresupuestoProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);			
			
			this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresupuestoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
			
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		
			
		this.gridBagConstraintsPresupuestoProducto = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoProducto, this.gridBagConstraintsPresupuestoProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresupuestoProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionPresupuestoProducto;
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
