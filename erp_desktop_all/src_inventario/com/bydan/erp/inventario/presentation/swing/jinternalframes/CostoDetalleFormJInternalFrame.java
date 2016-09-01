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
import com.bydan.erp.inventario.util.CostoConstantesFunciones;

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
public class CostoDetalleFormJInternalFrame extends CostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCosto;
	
	protected JMenuBar jmenuBarDetalleCosto;
	
	protected JMenu jmenuDetalleCosto;
	protected JMenu jmenuDetalleArchivoCosto;
	protected JMenu jmenuDetalleAccionesCosto;
	protected JMenu jmenuDetalleDatosCosto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCosto;	
	protected GridBagConstraints gridBagConstraintsCosto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CostoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCosto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallemovimientoinventario="";

	protected TipoCostoBeanSwingJInternalFrame tipocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocosto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public CostoSessionBean costoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	public TipoCostoSessionBean tipocostoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public CostoLogic costoLogic;
	
	public JScrollPane jScrollPanelDatosCosto;
	public JScrollPane jScrollPanelDatosEdicionCosto;
	public JScrollPane jScrollPanelDatosGeneralCosto;
	
	protected JPanel jPanelCamposCosto;    
	protected JPanel jPanelCamposOcultosCosto;    	
	protected JPanel jPanelAccionesCosto;
	protected JPanel jPanelAccionesFormularioCosto;
    
	
	
	protected Integer iXPanelCamposCosto=0;
	protected Integer iYPanelCamposCosto=0;
	
	protected Integer iXPanelCamposOcultosCosto=0;
	protected Integer iYPanelCamposOcultosCosto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCosto;
	public JButton jButtonModificarCosto;
	public JButton jButtonActualizarCosto;
    public JButton jButtonEliminarCosto;
	public JButton jButtonCancelarCosto;
    public JButton jButtonGuardarCambiosCosto;
	public JButton jButtonGuardarCambiosTablaCosto;
	protected JButton jButtonCerrarCosto;
	
	
	protected JButton jButtonProcesarInformacionCosto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCosto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCosto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCosto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCosto;
	protected JButton jButtonModificarToolBarCosto;
	protected JButton jButtonActualizarToolBarCosto;
    protected JButton jButtonEliminarToolBarCosto;
	protected JButton jButtonCancelarToolBarCosto;
    protected JButton jButtonGuardarCambiosToolBarCosto;
	protected JButton jButtonGuardarCambiosTablaToolBarCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarCosto;
	protected JButton jButtonCerrarToolBarCosto;
	
	protected JButton jButtonProcesarInformacionToolBarCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCosto;
	protected JMenuItem jMenuItemModificarCosto;
	protected JMenuItem jMenuItemActualizarCosto;
    protected JMenuItem jMenuItemEliminarCosto;
	protected JMenuItem jMenuItemCancelarCosto;
    protected JMenuItem jMenuItemGuardarCambiosCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCosto;
	protected JMenuItem jMenuItemCerrarCosto;
	protected JMenuItem jMenuItemDetalleCerrarCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCosto;
	
	protected JMenuItem jMenuItemProcesarInformacionCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCosto;
	protected JMenuItem jMenuItemMostrarOcultarCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCosto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCosto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCosto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCosto;
	public JLabel jLabelIdCosto;
	public JLabel jLabelidCosto;
	public JButton jButtonidCostoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteCosto;
	public JLabel jLabelnumero_comprobanteCosto;
	public JTextField jTextFieldnumero_comprobanteCosto;
	public JButton jButtonnumero_comprobanteCostoBusqueda= new JButtonMe();

	public JPanel jPanelfechaCosto;
	public JLabel jLabelfechaCosto;
	//public JFormattedTextField jDateChooserfechaCosto;

	public JDateChooser jDateChooserfechaCosto;
	public JButton jButtonfechaCostoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadCosto;
	public JLabel jLabelcantidadCosto;
	public JTextField jTextFieldcantidadCosto;
	public JButton jButtoncantidadCostoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_unitarioCosto;
	public JLabel jLabelvalor_unitarioCosto;
	public JTextField jTextFieldvalor_unitarioCosto;
	public JButton jButtonvalor_unitarioCostoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_totalCosto;
	public JLabel jLabelvalor_totalCosto;
	public JTextField jTextFieldvalor_totalCosto;
	public JButton jButtonvalor_totalCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCosto;
	public JLabel jLabelid_empresaCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCosto;
	public JButton jButtonid_empresaCosto= new JButtonMe();
	public JButton jButtonid_empresaCostoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCosto;
	public JLabel jLabelid_sucursalCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCosto;
	public JButton jButtonid_sucursalCosto= new JButtonMe();
	public JButton jButtonid_sucursalCostoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaCosto;
	public JLabel jLabelid_bodegaCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaCosto;
	public JButton jButtonid_bodegaCosto= new JButtonMe();
	public JButton jButtonid_bodegaCostoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoCosto;
	public JLabel jLabelid_productoCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoCosto;
	public JButton jButtonid_productoCosto= new JButtonMe();
	public JButton jButtonid_productoCostoUpdate= new JButtonMe();
	public JButton jButtonid_productoCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoCosto;
	public JLabel jLabelid_periodoCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoCosto;
	public JButton jButtonid_periodoCosto= new JButtonMe();
	public JButton jButtonid_periodoCostoUpdate= new JButtonMe();
	public JButton jButtonid_periodoCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCosto;
	public JLabel jLabelid_ejercicioCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCosto;
	public JButton jButtonid_ejercicioCosto= new JButtonMe();
	public JButton jButtonid_ejercicioCostoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_movimiento_inventarioCosto;
	public JLabel jLabelid_detalle_movimiento_inventarioCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_movimiento_inventarioCosto;
	public JButton jButtonid_detalle_movimiento_inventarioCosto= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioCostoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_costoCosto;
	public JLabel jLabelid_tipo_costoCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costoCosto;
	public JButton jButtonid_tipo_costoCosto= new JButtonMe();
	public JButton jButtonid_tipo_costoCostoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costoCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioCosto;
	public JLabel jLabelid_anioCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioCosto;
	public JButton jButtonid_anioCosto= new JButtonMe();
	public JButton jButtonid_anioCostoUpdate= new JButtonMe();
	public JButton jButtonid_anioCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesCosto;
	public JLabel jLabelid_mesCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesCosto;
	public JButton jButtonid_mesCosto= new JButtonMe();
	public JButton jButtonid_mesCostoUpdate= new JButtonMe();
	public JButton jButtonid_mesCostoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCosto;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CostoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCosto=new JPanel();
				this.jPanelAccionesFormularioCosto=new JPanel();
				this.jmenuBarDetalleCosto=new JMenuBar();
				this.jTtoolBarDetalleCosto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CostoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Costo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCosto() {
		return this.jButtonActualizarToolBarCosto;
	}
	
	public JButton getjButtonEliminarToolBarCosto() {
		return this.jButtonEliminarToolBarCosto;
	}
	
	public JButton getjButtonCancelarToolBarCosto() {
		return this.jButtonCancelarToolBarCosto;
	}		
	
	public JButton getjButtonProcesarInformacionCosto() {
		return this.jButtonProcesarInformacionCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCosto)	{
		this.jButtonProcesarInformacionCosto = jButtonProcesarInformacionCosto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCosto() {
		return this.jComboBoxTiposAccionesCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCosto(
			JComboBox jComboBoxTiposRelacionesCosto) {
		this.jComboBoxTiposRelacionesCosto = jComboBoxTiposRelacionesCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCosto(
			JComboBox jComboBoxTiposAccionesCosto) {
		this.jComboBoxTiposAccionesCosto = jComboBoxTiposAccionesCosto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCosto() {
		return this.jComboBoxTiposAccionesFormularioCosto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCosto(
			JComboBox jComboBoxTiposAccionesFormularioCosto) {
		this.jComboBoxTiposAccionesFormularioCosto = jComboBoxTiposAccionesFormularioCosto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.costoSessionBean=new CostoSessionBean();
		
		this.costoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.costoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.costoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Costo MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
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
	
		CostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCosto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCosto=new JButtonMe();
				this.jButtonModificarToolBarCosto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCosto,this.jTtoolBarDetalleCosto,
							"actualizar","actualizar","Actualizar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCosto,this.jTtoolBarDetalleCosto,
							"eliminar","eliminar","Eliminar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCosto,this.jTtoolBarDetalleCosto,
							"cancelar","cancelar","Cancelar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCosto,this.jTtoolBarDetalleCosto,
							"guardarcambios","guardarcambios","Guardar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCosto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCosto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCosto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCosto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCosto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCosto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCosto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCosto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCosto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCosto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCosto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCosto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCosto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCosto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCosto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCosto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCosto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCosto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCosto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCosto.add(this.jMenuItemDetalleCerrarCosto);
		
		this.jmenuDetalleAccionesCosto.add(this.jMenuItemActualizarCosto);
		this.jmenuDetalleAccionesCosto.add(this.jMenuItemEliminarCosto);
		this.jmenuDetalleAccionesCosto.add(this.jMenuItemCancelarCosto);		
		
		//this.jmenuDetalleDatosCosto.add(this.jMenuItemDetalleAbrirOrderByCosto);				
		this.jmenuDetalleDatosCosto.add(this.jMenuItemDetalleMostarOcultarCosto);				
				
		//this.jmenuDetalleAccionesCosto.add(this.jMenuItemGuardarCambiosCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCosto.add(this.jmenuDetalleArchivoCosto);		
		this.jmenuBarDetalleCosto.add(this.jmenuDetalleAccionesCosto);		
		this.jmenuBarDetalleCosto.add(this.jmenuDetalleDatosCosto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCosto);				
	}
	
	
	public void inicializarElementosCamposCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCosto = new JLabelMe();
		jLabelIdCosto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCosto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCosto.setToolTipText(CostoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCosto= new GridBagLayout();

		this.jPanelidCosto.setLayout(this.gridaBagLayoutCosto);

		jLabelidCosto = new JLabel();
		jLabelidCosto.setText("Id");

		jLabelidCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_comprobanteCosto = new JLabelMe();
		this.jLabelnumero_comprobanteCosto.setText(""+CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteCosto.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteCosto.setToolTipText(CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelnumero_comprobanteCosto.setLayout(this.gridaBagLayoutCosto);


		jTextFieldnumero_comprobanteCosto= new JTextFieldMe();
		jTextFieldnumero_comprobanteCosto.setEnabled(false);
		jTextFieldnumero_comprobanteCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_comprobanteCosto.setText("0");

		this.jButtonnumero_comprobanteCostoBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteCostoBusqueda.setText("U");
		this.jButtonnumero_comprobanteCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteCostoBusqueda.setVisible(false);		}


					
		this.jLabelfechaCosto = new JLabelMe();
		this.jLabelfechaCosto.setText(""+CostoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCosto.setToolTipText("Fecha");
		this.jLabelfechaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCosto.setToolTipText(CostoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelfechaCosto.setLayout(this.gridaBagLayoutCosto);


		//jFormattedTextFieldfechaCosto= new JFormattedTextFieldMe();

		jDateChooserfechaCosto= new JDateChooser();
		jDateChooserfechaCosto.setEnabled(false);
		jDateChooserfechaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCosto.setDate(new Date());
		jDateChooserfechaCosto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCosto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCostoBusqueda= new JButtonMe();
		this.jButtonfechaCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCostoBusqueda.setText("U");
		this.jButtonfechaCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCostoBusqueda.setVisible(false);		}


					
		this.jLabelcantidadCosto = new JLabelMe();
		this.jLabelcantidadCosto.setText(""+CostoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadCosto.setToolTipText("Cantidad");
		this.jLabelcantidadCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadCosto.setToolTipText(CostoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelcantidadCosto.setLayout(this.gridaBagLayoutCosto);


		jTextFieldcantidadCosto= new JTextFieldMe();
		jTextFieldcantidadCosto.setEnabled(false);
		jTextFieldcantidadCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadCosto.setText("0");

		this.jButtoncantidadCostoBusqueda= new JButtonMe();
		this.jButtoncantidadCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadCostoBusqueda.setText("U");
		this.jButtoncantidadCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadCostoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_unitarioCosto = new JLabelMe();
		this.jLabelvalor_unitarioCosto.setText(""+CostoConstantesFunciones.LABEL_VALORUNITARIO+" : *");
		this.jLabelvalor_unitarioCosto.setToolTipText("Valor Unitario");
		this.jLabelvalor_unitarioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_unitarioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_unitarioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_unitarioCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_unitarioCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_unitarioCosto.setToolTipText(CostoConstantesFunciones.LABEL_VALORUNITARIO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelvalor_unitarioCosto.setLayout(this.gridaBagLayoutCosto);


		jTextFieldvalor_unitarioCosto= new JTextFieldMe();
		jTextFieldvalor_unitarioCosto.setEnabled(false);
		jTextFieldvalor_unitarioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_unitarioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_unitarioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_unitarioCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_unitarioCosto.setText("0.0");

		this.jButtonvalor_unitarioCostoBusqueda= new JButtonMe();
		this.jButtonvalor_unitarioCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_unitarioCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_unitarioCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_unitarioCostoBusqueda.setText("U");
		this.jButtonvalor_unitarioCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_unitarioCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_unitarioCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_unitarioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_unitarioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_unitarioCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_unitarioCostoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_totalCosto = new JLabelMe();
		this.jLabelvalor_totalCosto.setText(""+CostoConstantesFunciones.LABEL_VALORTOTAL+" : *");
		this.jLabelvalor_totalCosto.setToolTipText("Valor Total");
		this.jLabelvalor_totalCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_totalCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_totalCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_totalCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_totalCosto.setToolTipText(CostoConstantesFunciones.LABEL_VALORTOTAL);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelvalor_totalCosto.setLayout(this.gridaBagLayoutCosto);


		jTextFieldvalor_totalCosto= new JTextFieldMe();
		jTextFieldvalor_totalCosto.setEnabled(false);
		jTextFieldvalor_totalCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_totalCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_totalCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_totalCosto.setText("0.0");

		this.jButtonvalor_totalCostoBusqueda= new JButtonMe();
		this.jButtonvalor_totalCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_totalCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_totalCostoBusqueda.setText("U");
		this.jButtonvalor_totalCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_totalCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_totalCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_totalCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_totalCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_totalCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_totalCostoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCosto = new JLabelMe();
		this.jLabelid_empresaCosto.setText(""+CostoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCosto.setToolTipText("Empresa");
		this.jLabelid_empresaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_empresaCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_empresaCosto= new JComboBoxMe();
		jComboBoxid_empresaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCosto.setEnabled(false);

		this.jButtonid_empresaCosto= new JButtonMe();
		this.jButtonid_empresaCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCosto.setText("Buscar");
		this.jButtonid_empresaCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCosto"));

		this.jButtonid_empresaCostoBusqueda= new JButtonMe();
		this.jButtonid_empresaCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCostoBusqueda.setText("U");
		this.jButtonid_empresaCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCostoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCostoUpdate= new JButtonMe();
		this.jButtonid_empresaCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCostoUpdate.setText("U");
		this.jButtonid_empresaCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCostoUpdate"));



					
		this.jLabelid_sucursalCosto = new JLabelMe();
		this.jLabelid_sucursalCosto.setText(""+CostoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCosto.setToolTipText("Sucursal");
		this.jLabelid_sucursalCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_sucursalCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_sucursalCosto= new JComboBoxMe();
		jComboBoxid_sucursalCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCosto.setEnabled(false);

		this.jButtonid_sucursalCosto= new JButtonMe();
		this.jButtonid_sucursalCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCosto.setText("Buscar");
		this.jButtonid_sucursalCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCosto"));

		this.jButtonid_sucursalCostoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCostoBusqueda.setText("U");
		this.jButtonid_sucursalCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCostoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCostoUpdate= new JButtonMe();
		this.jButtonid_sucursalCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCostoUpdate.setText("U");
		this.jButtonid_sucursalCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCostoUpdate"));



					
		this.jLabelid_bodegaCosto = new JLabelMe();
		this.jLabelid_bodegaCosto.setText(""+CostoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaCosto.setToolTipText("Bodega");
		this.jLabelid_bodegaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_bodegaCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_bodegaCosto= new JComboBoxMe();
		jComboBoxid_bodegaCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaCosto= new JButtonMe();
		this.jButtonid_bodegaCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCosto.setText("Buscar");
		this.jButtonid_bodegaCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCosto"));

		this.jButtonid_bodegaCostoBusqueda= new JButtonMe();
		this.jButtonid_bodegaCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaCostoBusqueda.setText("U");
		this.jButtonid_bodegaCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaCostoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaCostoUpdate= new JButtonMe();
		this.jButtonid_bodegaCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaCostoUpdate.setText("U");
		this.jButtonid_bodegaCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCostoUpdate"));



					
		this.jLabelid_productoCosto = new JLabelMe();
		this.jLabelid_productoCosto.setText(""+CostoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoCosto.setToolTipText("Producto");
		this.jLabelid_productoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_productoCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_productoCosto= new JComboBoxMe();
		jComboBoxid_productoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoCosto= new JButtonMe();
		this.jButtonid_productoCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoCosto.setText("Buscar");
		this.jButtonid_productoCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoCosto"));

		this.jButtonid_productoCostoBusqueda= new JButtonMe();
		this.jButtonid_productoCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoCostoBusqueda.setText("U");
		this.jButtonid_productoCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoCostoBusqueda.setVisible(false);		}

		this.jButtonid_productoCostoUpdate= new JButtonMe();
		this.jButtonid_productoCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoCostoUpdate.setText("U");
		this.jButtonid_productoCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoCostoUpdate"));



					
		this.jLabelid_periodoCosto = new JLabelMe();
		this.jLabelid_periodoCosto.setText(""+CostoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoCosto.setToolTipText("Periodo");
		this.jLabelid_periodoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_periodoCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_periodoCosto= new JComboBoxMe();
		jComboBoxid_periodoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoCosto.setEnabled(false);

		this.jButtonid_periodoCosto= new JButtonMe();
		this.jButtonid_periodoCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCosto.setText("Buscar");
		this.jButtonid_periodoCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCosto"));

		this.jButtonid_periodoCostoBusqueda= new JButtonMe();
		this.jButtonid_periodoCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoCostoBusqueda.setText("U");
		this.jButtonid_periodoCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoCostoBusqueda.setVisible(false);		}

		this.jButtonid_periodoCostoUpdate= new JButtonMe();
		this.jButtonid_periodoCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoCostoUpdate.setText("U");
		this.jButtonid_periodoCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCostoUpdate"));



					
		this.jLabelid_ejercicioCosto = new JLabelMe();
		this.jLabelid_ejercicioCosto.setText(""+CostoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCosto.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_ejercicioCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_ejercicioCosto= new JComboBoxMe();
		jComboBoxid_ejercicioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCosto.setEnabled(false);

		this.jButtonid_ejercicioCosto= new JButtonMe();
		this.jButtonid_ejercicioCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCosto.setText("Buscar");
		this.jButtonid_ejercicioCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCosto"));

		this.jButtonid_ejercicioCostoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCostoBusqueda.setText("U");
		this.jButtonid_ejercicioCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCostoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCostoUpdate= new JButtonMe();
		this.jButtonid_ejercicioCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCostoUpdate.setText("U");
		this.jButtonid_ejercicioCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCostoUpdate"));



					
		this.jLabelid_detalle_movimiento_inventarioCosto = new JLabelMe();
		this.jLabelid_detalle_movimiento_inventarioCosto.setText(""+CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO+" : *");
		this.jLabelid_detalle_movimiento_inventarioCosto.setToolTipText("Detalle Movimiento Inventario");
		this.jLabelid_detalle_movimiento_inventarioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_movimiento_inventarioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_movimiento_inventarioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_movimiento_inventarioCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_movimiento_inventarioCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_movimiento_inventarioCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_detalle_movimiento_inventarioCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_detalle_movimiento_inventarioCosto= new JComboBoxMe();
		jComboBoxid_detalle_movimiento_inventarioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_movimiento_inventarioCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_movimiento_inventarioCosto= new JButtonMe();
		this.jButtonid_detalle_movimiento_inventarioCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_movimiento_inventarioCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_movimiento_inventarioCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_movimiento_inventarioCosto.setText("Buscar");
		this.jButtonid_detalle_movimiento_inventarioCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_movimiento_inventarioCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_movimiento_inventarioCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_movimiento_inventarioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_movimiento_inventarioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_movimiento_inventarioCosto"));

		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda= new JButtonMe();
		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setText("U");
		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_movimiento_inventarioCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_movimiento_inventarioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_movimiento_inventarioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_movimiento_inventarioCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_movimiento_inventarioCostoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_movimiento_inventarioCostoUpdate= new JButtonMe();
		this.jButtonid_detalle_movimiento_inventarioCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_movimiento_inventarioCostoUpdate.setText("U");
		this.jButtonid_detalle_movimiento_inventarioCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_movimiento_inventarioCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_movimiento_inventarioCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_movimiento_inventarioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_movimiento_inventarioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_movimiento_inventarioCostoUpdate"));



					
		this.jLabelid_tipo_costoCosto = new JLabelMe();
		this.jLabelid_tipo_costoCosto.setText(""+CostoConstantesFunciones.LABEL_IDTIPOCOSTO+" : *");
		this.jLabelid_tipo_costoCosto.setToolTipText("Tipo Costo");
		this.jLabelid_tipo_costoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_costoCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_costoCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDTIPOCOSTO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_tipo_costoCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_tipo_costoCosto= new JComboBoxMe();
		jComboBoxid_tipo_costoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costoCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_costoCosto= new JButtonMe();
		this.jButtonid_tipo_costoCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costoCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costoCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costoCosto.setText("Buscar");
		this.jButtonid_tipo_costoCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_costoCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costoCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_costoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costoCosto"));

		this.jButtonid_tipo_costoCostoBusqueda= new JButtonMe();
		this.jButtonid_tipo_costoCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costoCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costoCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costoCostoBusqueda.setText("U");
		this.jButtonid_tipo_costoCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_costoCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costoCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_costoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costoCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_costoCostoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_costoCostoUpdate= new JButtonMe();
		this.jButtonid_tipo_costoCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costoCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costoCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costoCostoUpdate.setText("U");
		this.jButtonid_tipo_costoCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_costoCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costoCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_costoCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costoCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costoCostoUpdate"));



					
		this.jLabelid_anioCosto = new JLabelMe();
		this.jLabelid_anioCosto.setText(""+CostoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioCosto.setToolTipText("Anio");
		this.jLabelid_anioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_anioCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_anioCosto= new JComboBoxMe();
		jComboBoxid_anioCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioCosto.setEnabled(false);

		this.jButtonid_anioCosto= new JButtonMe();
		this.jButtonid_anioCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioCosto.setText("Buscar");
		this.jButtonid_anioCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioCosto"));

		this.jButtonid_anioCostoBusqueda= new JButtonMe();
		this.jButtonid_anioCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioCostoBusqueda.setText("U");
		this.jButtonid_anioCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioCostoBusqueda.setVisible(false);		}

		this.jButtonid_anioCostoUpdate= new JButtonMe();
		this.jButtonid_anioCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioCostoUpdate.setText("U");
		this.jButtonid_anioCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioCostoUpdate"));



					
		this.jLabelid_mesCosto = new JLabelMe();
		this.jLabelid_mesCosto.setText(""+CostoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesCosto.setToolTipText("Mes");
		this.jLabelid_mesCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesCosto.setToolTipText(CostoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutCosto = new GridBagLayout();
		this.jPanelid_mesCosto.setLayout(this.gridaBagLayoutCosto);


		jComboBoxid_mesCosto= new JComboBoxMe();
		jComboBoxid_mesCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesCosto.setEnabled(false);

		this.jButtonid_mesCosto= new JButtonMe();
		this.jButtonid_mesCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCosto.setText("Buscar");
		this.jButtonid_mesCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCosto"));

		this.jButtonid_mesCostoBusqueda= new JButtonMe();
		this.jButtonid_mesCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesCostoBusqueda.setText("U");
		this.jButtonid_mesCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCostoBusqueda"));

		if(this.costoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesCostoBusqueda.setVisible(false);		}

		this.jButtonid_mesCostoUpdate= new JButtonMe();
		this.jButtonid_mesCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesCostoUpdate.setText("U");
		this.jButtonid_mesCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCostoUpdate"));



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
		//this.jInternalFrameDetalleCosto = new CostoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCosto= new GridBagLayout();
		

		
		String sToolTipCosto="";
		sToolTipCosto=CostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCosto+="(Inventario.Costo)";
		}
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCosto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCosto = new JButtonMe();
		this.jButtonModificarCosto = new JButtonMe();
        this.jButtonActualizarCosto = new JButtonMe();
        this.jButtonEliminarCosto = new JButtonMe();
        this.jButtonCancelarCosto = new JButtonMe();
        this.jButtonGuardarCambiosCosto = new JButtonMe();
		this.jButtonGuardarCambiosTablaCosto = new JButtonMe();
		this.jButtonCerrarCosto = new JButtonMe();
		
		this.jScrollPanelDatosCosto = new JScrollPane();   
        this.jScrollPanelDatosEdicionCosto = new JScrollPane();
		this.jScrollPanelDatosGeneralCosto = new JScrollPane();
				
		
		
		this.jPanelCamposCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Costo";
		
		if(!this.costoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCosto.setName("jPanelCamposCosto"); 

		this.jPanelCamposOcultosCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCosto.setName("jPanelCamposOcultosCosto"); 

        this.jPanelAccionesCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCosto.setToolTipText("Acciones");
        this.jPanelAccionesCosto.setName("Acciones"); 

		this.jPanelAccionesFormularioCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCosto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCosto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCosto.setText("Nuevo");
		this.jButtonModificarCosto.setText("Editar");
        this.jButtonActualizarCosto.setText("Actualizar");
        this.jButtonEliminarCosto.setText("Eliminar");
        this.jButtonCancelarCosto.setText("Cancelar");
        this.jButtonGuardarCambiosCosto.setText("Guardar");
		this.jButtonGuardarCambiosTablaCosto.setText("Guardar");
		this.jButtonCerrarCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCosto,"nuevo_button","Nuevo",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCosto,"modificar_button","Editar",this.costoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCosto,"actualizar_button","Actualizar",this.costoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCosto,"eliminar_button","Eliminar",this.costoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCosto,"cancelar_button","Cancelar",this.costoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCosto,"guardarcambios_button","Guardar",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCosto,"guardarcambiostabla_button","Guardar",this.costoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCosto,"cerrar_button","Salir",this.costoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCosto.setToolTipText("Nuevo"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCosto.setToolTipText("Editar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCosto.setToolTipText("Actualizar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCosto.setToolTipText("Eliminar)"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCosto.setToolTipText("Cancelar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCosto.setToolTipText("Guardar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCosto.setToolTipText("Guardar"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCosto.setToolTipText("Salir"+" "+CostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCosto";
		inputMap = this.jButtonNuevoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCosto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCosto";
		inputMap = this.jButtonActualizarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCosto"));
		
		//ELIMINAR
		sMapKey = "EliminarCosto";
		inputMap = this.jButtonEliminarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCosto"));
		
		//CANCELAR	
		sMapKey = "CancelarCosto";
		inputMap = this.jButtonCancelarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCosto"));
		
		//CERRAR		
		sMapKey = "CerrarCosto";
		inputMap = this.jButtonCerrarCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCosto";
		inputMap = this.jButtonGuardarCambiosTablaCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCosto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCosto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCosto.setToolTipText("Nuevo Costo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCosto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCosto.setToolTipText("Sin Cerrar Ventana Costo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCosto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCosto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCosto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCosto.setText("Accion");
		this.jComboBoxTiposAccionesCosto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCosto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCosto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCosto = new JLabelMe();
		
		this.jLabelAccionesCosto.setText("Acciones");		
		this.jLabelAccionesCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCosto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCosto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCosto=new JTabbedPane();
		this.jTabbedPaneRelacionesCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCosto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCosto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCosto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCosto = new GridBagLayout();
		
		this.jPanelCamposCosto.setLayout(gridaBagLayoutCamposCosto);
		this.jPanelCamposOcultosCosto.setLayout(gridaBagLayoutCamposOcultosCosto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCosto.add(jLabelIdCosto, this.gridBagConstraintsCosto);



	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCosto.add(jLabelidCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCosto.add(jLabelid_empresaCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCosto.add(jButtonid_empresaCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCosto.add(jButtonid_empresaCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCosto.add(jComboBoxid_empresaCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCosto.add(jLabelid_sucursalCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCosto.add(jButtonid_sucursalCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCosto.add(jButtonid_sucursalCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCosto.add(jComboBoxid_sucursalCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaCosto.add(jLabelid_bodegaCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaCosto.add(jButtonid_bodegaCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaCosto.add(jButtonid_bodegaCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaCosto.add(jComboBoxid_bodegaCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoCosto.add(jLabelid_productoCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCosto = new GridBagConstraints();
	//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 2;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoCosto.add(jButtonid_productoCosto, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoCosto.add(jButtonid_productoCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 4;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoCosto.add(jButtonid_productoCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoCosto.add(jComboBoxid_productoCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoCosto.add(jLabelid_periodoCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoCosto.add(jButtonid_periodoCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoCosto.add(jButtonid_periodoCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoCosto.add(jComboBoxid_periodoCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioCosto.add(jLabelid_ejercicioCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCosto.add(jButtonid_ejercicioCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCosto.add(jButtonid_ejercicioCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioCosto.add(jComboBoxid_ejercicioCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_movimiento_inventarioCosto.add(jLabelid_detalle_movimiento_inventarioCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_movimiento_inventarioCosto.add(jButtonid_detalle_movimiento_inventarioCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_movimiento_inventarioCosto.add(jButtonid_detalle_movimiento_inventarioCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_movimiento_inventarioCosto.add(jComboBoxid_detalle_movimiento_inventarioCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_costoCosto.add(jLabelid_tipo_costoCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costoCosto.add(jButtonid_tipo_costoCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costoCosto.add(jButtonid_tipo_costoCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_costoCosto.add(jComboBoxid_tipo_costoCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteCosto.add(jLabelnumero_comprobanteCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteCosto.add(jButtonnumero_comprobanteCostoBusqueda, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteCosto.add(jTextFieldnumero_comprobanteCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCosto.add(jLabelfechaCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCosto.add(jButtonfechaCostoBusqueda, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCosto.add(jDateChooserfechaCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadCosto.add(jLabelcantidadCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadCosto.add(jButtoncantidadCostoBusqueda, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadCosto.add(jTextFieldcantidadCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_unitarioCosto.add(jLabelvalor_unitarioCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_unitarioCosto.add(jButtonvalor_unitarioCostoBusqueda, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_unitarioCosto.add(jTextFieldvalor_unitarioCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_totalCosto.add(jLabelvalor_totalCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_totalCosto.add(jButtonvalor_totalCostoBusqueda, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_totalCosto.add(jTextFieldvalor_totalCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioCosto.add(jLabelid_anioCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioCosto.add(jButtonid_anioCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioCosto.add(jButtonid_anioCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioCosto.add(jComboBoxid_anioCosto, this.gridBagConstraintsCosto);


	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 0;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesCosto.add(jLabelid_mesCosto, this.gridBagConstraintsCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 2;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesCosto.add(jButtonid_mesCostoBusqueda, this.gridBagConstraintsCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCosto = new GridBagConstraints();
		//this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = 3;
		this.gridBagConstraintsCosto.ipadx = 0;
		this.gridBagConstraintsCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesCosto.add(jButtonid_mesCostoUpdate, this.gridBagConstraintsCosto);
	}

	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCosto.gridy = 0;
	this.gridBagConstraintsCosto.gridx = 1;
	this.gridBagConstraintsCosto.ipadx = 0;
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesCosto.add(jComboBoxid_mesCosto, this.gridBagConstraintsCosto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelidCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelid_bodegaCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelid_productoCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelid_detalle_movimiento_inventarioCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelid_tipo_costoCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelnumero_comprobanteCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelfechaCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelcantidadCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelvalor_unitarioCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCosto.add(this.jPanelvalor_totalCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposCosto % 2==0) {
		iXPanelCamposCosto=0;
		iYPanelCamposCosto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposOcultosCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposOcultosCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCosto.add(this.jPanelid_empresaCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposOcultosCosto % 2==0) {
		iXPanelCamposOcultosCosto=0;
		iYPanelCamposOcultosCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposOcultosCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposOcultosCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCosto.add(this.jPanelid_sucursalCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposOcultosCosto % 2==0) {
		iXPanelCamposOcultosCosto=0;
		iYPanelCamposOcultosCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposOcultosCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposOcultosCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCosto.add(this.jPanelid_periodoCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposOcultosCosto % 2==0) {
		iXPanelCamposOcultosCosto=0;
		iYPanelCamposOcultosCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposOcultosCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposOcultosCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCosto.add(this.jPanelid_ejercicioCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposOcultosCosto % 2==0) {
		iXPanelCamposOcultosCosto=0;
		iYPanelCamposOcultosCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposOcultosCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposOcultosCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCosto.add(this.jPanelid_anioCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposOcultosCosto % 2==0) {
		iXPanelCamposOcultosCosto=0;
		iYPanelCamposOcultosCosto++;
	}
	this.gridBagConstraintsCosto = new GridBagConstraints();
	this.gridBagConstraintsCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCosto.gridy = iYPanelCamposOcultosCosto;
	this.gridBagConstraintsCosto.gridx = iXPanelCamposOcultosCosto++;
	this.gridBagConstraintsCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCosto.add(this.jPanelid_mesCosto, this.gridBagConstraintsCosto);



	if(iXPanelCamposOcultosCosto % 2==0) {
		iXPanelCamposOcultosCosto=0;
		iYPanelCamposOcultosCosto++;
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
			
		GridBagLayout gridaBagLayoutAccionesCosto= new GridBagLayout();
		this.jPanelAccionesCosto.setLayout(gridaBagLayoutAccionesCosto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCosto= new GridBagLayout();
		this.jPanelAccionesFormularioCosto.setLayout(gridaBagLayoutAccionesFormularioCosto);
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCosto.add(this.jComboBoxTiposAccionesFormularioCosto, this.gridBagConstraintsCosto);

		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCosto.add(this.jCheckBoxPostAccionNuevoCosto, this.gridBagConstraintsCosto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.costoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCosto.add(this.jCheckBoxPostAccionSinCerrarCosto, this.gridBagConstraintsCosto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.costoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.costoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCosto.add(this.jCheckBoxPostAccionSinMensajeCosto, this.gridBagConstraintsCosto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx = iPosXAccion++;
			
		this.jPanelAccionesCosto.add(this.jButtonModificarCosto, this.gridBagConstraintsCosto);							

		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCosto.gridy = 0;
		this.gridBagConstraintsCosto.gridx =iPosXAccion++;
			
		this.jPanelAccionesCosto.add(this.jButtonEliminarCosto, this.gridBagConstraintsCosto);
		
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = 0;		
		this.gridBagConstraintsCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCosto.add(this.jButtonActualizarCosto, this.gridBagConstraintsCosto);


		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = 0;		
		this.gridBagConstraintsCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCosto.add(this.jButtonGuardarCambiosCosto, this.gridBagConstraintsCosto);	
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = 0;		
		this.gridBagConstraintsCosto.gridx =iPosXAccion++;
		
		this.jPanelAccionesCosto.add(this.jButtonCancelarCosto, this.gridBagConstraintsCosto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCosto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.costoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCosto = new GridBagConstraints();						
			this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCosto.gridx = 0;		
			//this.gridBagConstraintsCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCosto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCosto.gridx =0;
		this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCosto, this.gridBagConstraintsCosto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CostoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCosto = new CostoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CostoModel costoModel=new CostoModel(this);
			
			//SI USARA CLASE INTERNA
			//CostoModel.CostoFocusTraversalPolicy costoFocusTraversalPolicy = costoModel.new CostoFocusTraversalPolicy(this);
			
			//costoFocusTraversalPolicy.setcostoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(costoModel);
			
			
			this.jContentPaneDetalleCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCosto = new GridBagLayout();	
			this.jContentPaneDetalleCosto.setLayout(gridaBagLayoutDetalleCosto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCosto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCosto = new GridBagConstraints();
				this.gridBagConstraintsCosto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCosto.gridx = 0;
					
				
				this.jContentPaneDetalleCosto.add(jTtoolBarDetalleCosto, gridBagConstraintsCosto);								
				
}
			
			this.jScrollPanelDatosEdicionCosto=   new JScrollPane(jContentPaneDetalleCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCosto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCosto.gridx = 0;
	        
			this.jContentPaneDetalleCosto.add(jPanelCamposCosto, gridBagConstraintsCosto);
			
			
			
			
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
						&& costoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.costoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCosto= new GridBagConstraints();
						this.gridBagConstraintsCosto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCosto.gridx = 0;
						this.jContentPaneDetalleCosto.add(this.jTabbedPaneRelacionesCosto, this.gridBagConstraintsCosto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCosto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCosto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCosto = new GridBagConstraints();
					this.gridBagConstraintsCosto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCosto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCosto.gridx = 0;
					
				
					this.jContentPaneDetalleCosto.add(jPanelCamposOcultosCosto, gridBagConstraintsCosto);
				
					this.jPanelCamposOcultosCosto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCosto.gridx = 0;
	        this.gridBagConstraintsCosto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCosto.add(this.jPanelAccionesFormularioCosto, this.gridBagConstraintsCosto);							
			
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
	        this.gridBagConstraintsCosto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCosto.gridx = 0;
	        
			
			this.jContentPaneDetalleCosto.add(this.jPanelAccionesCosto, this.gridBagConstraintsCosto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCosto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCosto=   new JScrollPane(this.jPanelCamposCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCosto.gridx = 0;
			this.gridBagConstraintsCosto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCosto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCosto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCosto, this.gridBagConstraintsCosto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCosto, this.gridBagConstraintsCosto);			
			
			this.gridBagConstraintsCosto = new GridBagConstraints();
			this.gridBagConstraintsCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCosto, this.gridBagConstraintsCosto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCosto, this.gridBagConstraintsCosto);
			
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCosto, this.gridBagConstraintsCosto);
		
			
		this.gridBagConstraintsCosto = new GridBagConstraints();
		this.gridBagConstraintsCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCosto, this.gridBagConstraintsCosto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCosto;//jContentPane;
		
		return jScrollPanelDatosEdicionCosto;
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
