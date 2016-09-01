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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.VehiculoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class VehiculoDetalleFormJInternalFrame extends VehiculoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVehiculo;
	
	protected JMenuBar jmenuBarDetalleVehiculo;
	
	protected JMenu jmenuDetalleVehiculo;
	protected JMenu jmenuDetalleArchivoVehiculo;
	protected JMenu jmenuDetalleAccionesVehiculo;
	protected JMenu jmenuDetalleDatosVehiculo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVehiculo;	
	protected GridBagConstraints gridBagConstraintsVehiculo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VehiculoBeanSwingJInternalFrameAdditional jInternalFrameDetalleVehiculo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected AseguradoraBeanSwingJInternalFrame aseguradoraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_aseguradora="";
	
	public VehiculoSessionBean vehiculoSessionBean;
	
	

	public ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=null;
	public ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteServicioTransporte=false;
	public ServicioTransporteSessionBean serviciotransporteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public AseguradoraSessionBean aseguradoraSessionBean;	
	
	public VehiculoLogic vehiculoLogic;
	
	public JScrollPane jScrollPanelDatosVehiculo;
	public JScrollPane jScrollPanelDatosEdicionVehiculo;
	public JScrollPane jScrollPanelDatosGeneralVehiculo;
	
	protected JPanel jPanelCamposVehiculo;    
	protected JPanel jPanelCamposOcultosVehiculo;    	
	protected JPanel jPanelAccionesVehiculo;
	protected JPanel jPanelAccionesFormularioVehiculo;
    
	
	
	protected Integer iXPanelCamposVehiculo=0;
	protected Integer iYPanelCamposVehiculo=0;
	
	protected Integer iXPanelCamposOcultosVehiculo=0;
	protected Integer iYPanelCamposOcultosVehiculo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVehiculo;
	public JButton jButtonModificarVehiculo;
	public JButton jButtonActualizarVehiculo;
    public JButton jButtonEliminarVehiculo;
	public JButton jButtonCancelarVehiculo;
    public JButton jButtonGuardarCambiosVehiculo;
	public JButton jButtonGuardarCambiosTablaVehiculo;
	protected JButton jButtonCerrarVehiculo;
	
	
	protected JButton jButtonProcesarInformacionVehiculo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVehiculo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVehiculo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVehiculo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVehiculo;
	protected JButton jButtonModificarToolBarVehiculo;
	protected JButton jButtonActualizarToolBarVehiculo;
    protected JButton jButtonEliminarToolBarVehiculo;
	protected JButton jButtonCancelarToolBarVehiculo;
    protected JButton jButtonGuardarCambiosToolBarVehiculo;
	protected JButton jButtonGuardarCambiosTablaToolBarVehiculo;
	protected JButton jButtonMostrarOcultarTablaToolBarVehiculo;
	protected JButton jButtonCerrarToolBarVehiculo;
	
	protected JButton jButtonProcesarInformacionToolBarVehiculo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVehiculo;
	protected JMenuItem jMenuItemModificarVehiculo;
	protected JMenuItem jMenuItemActualizarVehiculo;
    protected JMenuItem jMenuItemEliminarVehiculo;
	protected JMenuItem jMenuItemCancelarVehiculo;
    protected JMenuItem jMenuItemGuardarCambiosVehiculo;
	protected JMenuItem jMenuItemGuardarCambiosTablaVehiculo;
	protected JMenuItem jMenuItemCerrarVehiculo;
	protected JMenuItem jMenuItemDetalleCerrarVehiculo;
	protected JMenuItem jMenuItemDetalleMostarOcultarVehiculo;
	
	protected JMenuItem jMenuItemProcesarInformacionVehiculo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVehiculo;
	protected JMenuItem jMenuItemMostrarOcultarVehiculo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVehiculo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVehiculo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVehiculo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVehiculo;
	public JLabel jLabelIdVehiculo;
	public JLabel jLabelidVehiculo;
	public JButton jButtonidVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_polizaVehiculo;
	public JLabel jLabelnumero_polizaVehiculo;
	public JTextField jTextFieldnumero_polizaVehiculo;
	public JButton jButtonnumero_polizaVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionVehiculo;
	public JLabel jLabelfecha_emisionVehiculo;
	//public JFormattedTextField jDateChooserfecha_emisionVehiculo;

	public JDateChooser jDateChooserfecha_emisionVehiculo;
	public JButton jButtonfecha_emisionVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoVehiculo;
	public JLabel jLabelfecha_vencimientoVehiculo;
	//public JFormattedTextField jDateChooserfecha_vencimientoVehiculo;

	public JDateChooser jDateChooserfecha_vencimientoVehiculo;
	public JButton jButtonfecha_vencimientoVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_aseguradoVehiculo;
	public JLabel jLabelvalor_aseguradoVehiculo;
	public JTextField jTextFieldvalor_aseguradoVehiculo;
	public JButton jButtonvalor_aseguradoVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_deducibleVehiculo;
	public JLabel jLabelvalor_deducibleVehiculo;
	public JTextField jTextFieldvalor_deducibleVehiculo;
	public JButton jButtonvalor_deducibleVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_matriculaVehiculo;
	public JLabel jLabelnumero_matriculaVehiculo;
	public JTextField jTextFieldnumero_matriculaVehiculo;
	public JButton jButtonnumero_matriculaVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_motorVehiculo;
	public JLabel jLabelnumero_motorVehiculo;
	public JTextField jTextFieldnumero_motorVehiculo;
	public JButton jButtonnumero_motorVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chasisVehiculo;
	public JLabel jLabelnumero_chasisVehiculo;
	public JTextField jTextFieldnumero_chasisVehiculo;
	public JButton jButtonnumero_chasisVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_placaVehiculo;
	public JLabel jLabelnumero_placaVehiculo;
	public JTextField jTextFieldnumero_placaVehiculo;
	public JButton jButtonnumero_placaVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_comercialVehiculo;
	public JLabel jLabelvalor_comercialVehiculo;
	public JTextField jTextFieldvalor_comercialVehiculo;
	public JButton jButtonvalor_comercialVehiculoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionVehiculo;
	public JLabel jLabeldescripcionVehiculo;
	public JTextArea jTextAreadescripcionVehiculo;
	public JScrollPane jscrollPanedescripcionVehiculo;
	public JButton jButtondescripcionVehiculoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVehiculo;
	public JLabel jLabelid_empresaVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVehiculo;
	public JButton jButtonid_empresaVehiculo= new JButtonMe();
	public JButton jButtonid_empresaVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_empresaVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVehiculo;
	public JLabel jLabelid_sucursalVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVehiculo;
	public JButton jButtonid_sucursalVehiculo= new JButtonMe();
	public JButton jButtonid_sucursalVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoVehiculo;
	public JLabel jLabelid_detalle_activo_fijoVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoVehiculo;
	public JButton jButtonid_detalle_activo_fijoVehiculo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelid_aseguradoraVehiculo;
	public JLabel jLabelid_aseguradoraVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_aseguradoraVehiculo;
	public JButton jButtonid_aseguradoraVehiculo= new JButtonMe();
	public JButton jButtonid_aseguradoraVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_aseguradoraVehiculoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVehiculo;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VehiculoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVehiculo=new JPanel();
				this.jPanelAccionesFormularioVehiculo=new JPanel();
				this.jmenuBarDetalleVehiculo=new JMenuBar();
				this.jTtoolBarDetalleVehiculo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VehiculoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Vehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVehiculo() {
		return this.jButtonActualizarToolBarVehiculo;
	}
	
	public JButton getjButtonEliminarToolBarVehiculo() {
		return this.jButtonEliminarToolBarVehiculo;
	}
	
	public JButton getjButtonCancelarToolBarVehiculo() {
		return this.jButtonCancelarToolBarVehiculo;
	}		
	
	public JButton getjButtonProcesarInformacionVehiculo() {
		return this.jButtonProcesarInformacionVehiculo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVehiculo)	{
		this.jButtonProcesarInformacionVehiculo = jButtonProcesarInformacionVehiculo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVehiculo() {
		return this.jComboBoxTiposAccionesVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVehiculo(
			JComboBox jComboBoxTiposRelacionesVehiculo) {
		this.jComboBoxTiposRelacionesVehiculo = jComboBoxTiposRelacionesVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVehiculo(
			JComboBox jComboBoxTiposAccionesVehiculo) {
		this.jComboBoxTiposAccionesVehiculo = jComboBoxTiposAccionesVehiculo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVehiculo() {
		return this.jComboBoxTiposAccionesFormularioVehiculo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVehiculo(
			JComboBox jComboBoxTiposAccionesFormularioVehiculo) {
		this.jComboBoxTiposAccionesFormularioVehiculo = jComboBoxTiposAccionesFormularioVehiculo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vehiculoSessionBean=new VehiculoSessionBean();
		
		this.vehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vehiculoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VehiculoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vehiculo MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
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
	
		VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVehiculo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVehiculo=new JButtonMe();
				this.jButtonModificarToolBarVehiculo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVehiculo,this.jTtoolBarDetalleVehiculo,
							"actualizar","actualizar","Actualizar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVehiculo,this.jTtoolBarDetalleVehiculo,
							"eliminar","eliminar","Eliminar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVehiculo,this.jTtoolBarDetalleVehiculo,
							"cancelar","cancelar","Cancelar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVehiculo,this.jTtoolBarDetalleVehiculo,
							"guardarcambios","guardarcambios","Guardar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVehiculo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVehiculo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVehiculo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVehiculo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVehiculo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVehiculo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVehiculo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVehiculo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVehiculo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVehiculo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVehiculo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVehiculo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVehiculo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVehiculo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVehiculo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVehiculo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVehiculo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVehiculo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVehiculo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVehiculo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVehiculo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVehiculo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVehiculo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVehiculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVehiculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVehiculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVehiculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVehiculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVehiculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVehiculo.add(this.jMenuItemDetalleCerrarVehiculo);
		
		this.jmenuDetalleAccionesVehiculo.add(this.jMenuItemActualizarVehiculo);
		this.jmenuDetalleAccionesVehiculo.add(this.jMenuItemEliminarVehiculo);
		this.jmenuDetalleAccionesVehiculo.add(this.jMenuItemCancelarVehiculo);		
		
		//this.jmenuDetalleDatosVehiculo.add(this.jMenuItemDetalleAbrirOrderByVehiculo);				
		this.jmenuDetalleDatosVehiculo.add(this.jMenuItemDetalleMostarOcultarVehiculo);				
				
		//this.jmenuDetalleAccionesVehiculo.add(this.jMenuItemGuardarCambiosVehiculo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVehiculo.add(this.jmenuDetalleArchivoVehiculo);		
		this.jmenuBarDetalleVehiculo.add(this.jmenuDetalleAccionesVehiculo);		
		this.jmenuBarDetalleVehiculo.add(this.jmenuDetalleDatosVehiculo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleVehiculo.add(this.jmenuDetalleVehiculo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVehiculo);				
	}
	
	
	public void inicializarElementosCamposVehiculo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVehiculo = new JLabelMe();
		jLabelIdVehiculo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVehiculo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVehiculo= new GridBagLayout();

		this.jPanelidVehiculo.setLayout(this.gridaBagLayoutVehiculo);

		jLabelidVehiculo = new JLabel();
		jLabelidVehiculo.setText("Id");

		jLabelidVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_polizaVehiculo = new JLabelMe();
		this.jLabelnumero_polizaVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA+" : *");
		this.jLabelnumero_polizaVehiculo.setToolTipText("Numero Poliza");
		this.jLabelnumero_polizaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_polizaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_polizaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_polizaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_polizaVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_polizaVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelnumero_polizaVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldnumero_polizaVehiculo= new JTextFieldMe();

		jTextFieldnumero_polizaVehiculo.setEnabled(false);
		jTextFieldnumero_polizaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_polizaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_polizaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_polizaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_polizaVehiculoBusqueda= new JButtonMe();
		this.jButtonnumero_polizaVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_polizaVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_polizaVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_polizaVehiculoBusqueda.setText("U");
		this.jButtonnumero_polizaVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_polizaVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_polizaVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_polizaVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_polizaVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_polizaVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_polizaVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionVehiculo = new JLabelMe();
		this.jLabelfecha_emisionVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionVehiculo.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelfecha_emisionVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		//jFormattedTextFieldfecha_emisionVehiculo= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionVehiculo= new JDateChooser();
		jDateChooserfecha_emisionVehiculo.setEnabled(false);
		jDateChooserfecha_emisionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionVehiculo.setDate(new Date());
		jDateChooserfecha_emisionVehiculo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionVehiculo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionVehiculoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionVehiculoBusqueda.setText("U");
		this.jButtonfecha_emisionVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoVehiculo = new JLabelMe();
		this.jLabelfecha_vencimientoVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoVehiculo.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelfecha_vencimientoVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		//jFormattedTextFieldfecha_vencimientoVehiculo= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoVehiculo= new JDateChooser();
		jDateChooserfecha_vencimientoVehiculo.setEnabled(false);
		jDateChooserfecha_vencimientoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoVehiculo.setDate(new Date());
		jDateChooserfecha_vencimientoVehiculo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoVehiculo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoVehiculoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoVehiculoBusqueda.setText("U");
		this.jButtonfecha_vencimientoVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_aseguradoVehiculo = new JLabelMe();
		this.jLabelvalor_aseguradoVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_VALORASEGURADO+" : *");
		this.jLabelvalor_aseguradoVehiculo.setToolTipText("Valor Asegurado");
		this.jLabelvalor_aseguradoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_aseguradoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_aseguradoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_aseguradoVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_aseguradoVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_aseguradoVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_VALORASEGURADO);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelvalor_aseguradoVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldvalor_aseguradoVehiculo= new JTextFieldMe();
		jTextFieldvalor_aseguradoVehiculo.setEnabled(false);
		jTextFieldvalor_aseguradoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_aseguradoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_aseguradoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_aseguradoVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_aseguradoVehiculo.setText("0.0");

		this.jButtonvalor_aseguradoVehiculoBusqueda= new JButtonMe();
		this.jButtonvalor_aseguradoVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_aseguradoVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_aseguradoVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_aseguradoVehiculoBusqueda.setText("U");
		this.jButtonvalor_aseguradoVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_aseguradoVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_aseguradoVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_aseguradoVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_aseguradoVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_aseguradoVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_aseguradoVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_deducibleVehiculo = new JLabelMe();
		this.jLabelvalor_deducibleVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE+" : *");
		this.jLabelvalor_deducibleVehiculo.setToolTipText("Valor Deducible");
		this.jLabelvalor_deducibleVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_deducibleVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_deducibleVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_deducibleVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_deducibleVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_deducibleVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelvalor_deducibleVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldvalor_deducibleVehiculo= new JTextFieldMe();
		jTextFieldvalor_deducibleVehiculo.setEnabled(false);
		jTextFieldvalor_deducibleVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_deducibleVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_deducibleVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_deducibleVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_deducibleVehiculo.setText("0.0");

		this.jButtonvalor_deducibleVehiculoBusqueda= new JButtonMe();
		this.jButtonvalor_deducibleVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_deducibleVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_deducibleVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_deducibleVehiculoBusqueda.setText("U");
		this.jButtonvalor_deducibleVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_deducibleVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_deducibleVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_deducibleVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_deducibleVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_deducibleVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_deducibleVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_matriculaVehiculo = new JLabelMe();
		this.jLabelnumero_matriculaVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA+" : *");
		this.jLabelnumero_matriculaVehiculo.setToolTipText("Numero Matricula");
		this.jLabelnumero_matriculaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_matriculaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_matriculaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_matriculaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_matriculaVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_matriculaVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelnumero_matriculaVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldnumero_matriculaVehiculo= new JTextFieldMe();

		jTextFieldnumero_matriculaVehiculo.setEnabled(false);
		jTextFieldnumero_matriculaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_matriculaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_matriculaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_matriculaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_matriculaVehiculoBusqueda= new JButtonMe();
		this.jButtonnumero_matriculaVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_matriculaVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_matriculaVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_matriculaVehiculoBusqueda.setText("U");
		this.jButtonnumero_matriculaVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_matriculaVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_matriculaVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_matriculaVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_matriculaVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_matriculaVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_matriculaVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_motorVehiculo = new JLabelMe();
		this.jLabelnumero_motorVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_NUMEROMOTOR+" : *");
		this.jLabelnumero_motorVehiculo.setToolTipText("Numero Motor");
		this.jLabelnumero_motorVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_motorVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_motorVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_motorVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_motorVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_motorVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelnumero_motorVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldnumero_motorVehiculo= new JTextFieldMe();

		jTextFieldnumero_motorVehiculo.setEnabled(false);
		jTextFieldnumero_motorVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_motorVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_motorVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_motorVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_motorVehiculoBusqueda= new JButtonMe();
		this.jButtonnumero_motorVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_motorVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_motorVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_motorVehiculoBusqueda.setText("U");
		this.jButtonnumero_motorVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_motorVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_motorVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_motorVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_motorVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_motorVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_motorVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chasisVehiculo = new JLabelMe();
		this.jLabelnumero_chasisVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_NUMEROCHASIS+" : *");
		this.jLabelnumero_chasisVehiculo.setToolTipText("Numero Chasis");
		this.jLabelnumero_chasisVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chasisVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chasisVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chasisVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chasisVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chasisVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelnumero_chasisVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldnumero_chasisVehiculo= new JTextFieldMe();

		jTextFieldnumero_chasisVehiculo.setEnabled(false);
		jTextFieldnumero_chasisVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chasisVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chasisVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chasisVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chasisVehiculoBusqueda= new JButtonMe();
		this.jButtonnumero_chasisVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chasisVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chasisVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chasisVehiculoBusqueda.setText("U");
		this.jButtonnumero_chasisVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chasisVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chasisVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chasisVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chasisVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chasisVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chasisVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_placaVehiculo = new JLabelMe();
		this.jLabelnumero_placaVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_NUMEROPLACA+" : *");
		this.jLabelnumero_placaVehiculo.setToolTipText("Numero Placa");
		this.jLabelnumero_placaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_placaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_placaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_placaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_placaVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_placaVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_NUMEROPLACA);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelnumero_placaVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldnumero_placaVehiculo= new JTextFieldMe();

		jTextFieldnumero_placaVehiculo.setEnabled(false);
		jTextFieldnumero_placaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_placaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_placaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_placaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_placaVehiculoBusqueda= new JButtonMe();
		this.jButtonnumero_placaVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_placaVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_placaVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_placaVehiculoBusqueda.setText("U");
		this.jButtonnumero_placaVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_placaVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_placaVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_placaVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_placaVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_placaVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_placaVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_comercialVehiculo = new JLabelMe();
		this.jLabelvalor_comercialVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL+" : *");
		this.jLabelvalor_comercialVehiculo.setToolTipText("Valor Comercial");
		this.jLabelvalor_comercialVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comercialVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_comercialVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_comercialVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_comercialVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_comercialVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelvalor_comercialVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextFieldvalor_comercialVehiculo= new JTextFieldMe();
		jTextFieldvalor_comercialVehiculo.setEnabled(false);
		jTextFieldvalor_comercialVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comercialVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comercialVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_comercialVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_comercialVehiculo.setText("0.0");

		this.jButtonvalor_comercialVehiculoBusqueda= new JButtonMe();
		this.jButtonvalor_comercialVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comercialVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comercialVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_comercialVehiculoBusqueda.setText("U");
		this.jButtonvalor_comercialVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_comercialVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_comercialVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_comercialVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_comercialVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_comercialVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_comercialVehiculoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionVehiculo = new JLabelMe();
		this.jLabeldescripcionVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionVehiculo.setToolTipText("Descripcion");
		this.jLabeldescripcionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPaneldescripcionVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jTextAreadescripcionVehiculo= new JTextAreaMe();
		jTextAreadescripcionVehiculo.setEnabled(false);
		jTextAreadescripcionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVehiculo.setLineWrap(true);
		jTextAreadescripcionVehiculo.setWrapStyleWord(true);
		jTextAreadescripcionVehiculo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionVehiculo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionVehiculo = new JScrollPane(jTextAreadescripcionVehiculo);
		jscrollPanedescripcionVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionVehiculoBusqueda= new JButtonMe();
		this.jButtondescripcionVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionVehiculoBusqueda.setText("U");
		this.jButtondescripcionVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionVehiculoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVehiculo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVehiculo = new JLabelMe();
		this.jLabelid_empresaVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVehiculo.setToolTipText("Empresa");
		this.jLabelid_empresaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelid_empresaVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jComboBoxid_empresaVehiculo= new JComboBoxMe();
		jComboBoxid_empresaVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVehiculo.setEnabled(false);

		this.jButtonid_empresaVehiculo= new JButtonMe();
		this.jButtonid_empresaVehiculo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVehiculo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVehiculo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVehiculo.setText("Buscar");
		this.jButtonid_empresaVehiculo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVehiculo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVehiculo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVehiculo"));

		this.jButtonid_empresaVehiculoBusqueda= new JButtonMe();
		this.jButtonid_empresaVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVehiculoBusqueda.setText("U");
		this.jButtonid_empresaVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVehiculoBusqueda.setVisible(false);		}

		this.jButtonid_empresaVehiculoUpdate= new JButtonMe();
		this.jButtonid_empresaVehiculoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVehiculoUpdate.setText("U");
		this.jButtonid_empresaVehiculoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVehiculoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVehiculoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVehiculoUpdate"));



					
		this.jLabelid_sucursalVehiculo = new JLabelMe();
		this.jLabelid_sucursalVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVehiculo.setToolTipText("Sucursal");
		this.jLabelid_sucursalVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelid_sucursalVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jComboBoxid_sucursalVehiculo= new JComboBoxMe();
		jComboBoxid_sucursalVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVehiculo.setEnabled(false);

		this.jButtonid_sucursalVehiculo= new JButtonMe();
		this.jButtonid_sucursalVehiculo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVehiculo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVehiculo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVehiculo.setText("Buscar");
		this.jButtonid_sucursalVehiculo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVehiculo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVehiculo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVehiculo"));

		this.jButtonid_sucursalVehiculoBusqueda= new JButtonMe();
		this.jButtonid_sucursalVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVehiculoBusqueda.setText("U");
		this.jButtonid_sucursalVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVehiculoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVehiculoUpdate= new JButtonMe();
		this.jButtonid_sucursalVehiculoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVehiculoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVehiculoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVehiculoUpdate.setText("U");
		this.jButtonid_sucursalVehiculoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVehiculoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVehiculoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVehiculoUpdate"));



					
		this.jLabelid_detalle_activo_fijoVehiculo = new JLabelMe();
		this.jLabelid_detalle_activo_fijoVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoVehiculo.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jComboBoxid_detalle_activo_fijoVehiculo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoVehiculo= new JButtonMe();
		this.jButtonid_detalle_activo_fijoVehiculo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoVehiculo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoVehiculo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoVehiculo.setText("Buscar");
		this.jButtonid_detalle_activo_fijoVehiculo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoVehiculo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoVehiculo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoVehiculo"));

		this.jButtonid_detalle_activo_fijoVehiculoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoVehiculoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoVehiculoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoVehiculoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoVehiculoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoVehiculoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoVehiculoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoVehiculoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoVehiculoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoVehiculoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoVehiculoUpdate"));



					
		this.jLabelid_aseguradoraVehiculo = new JLabelMe();
		this.jLabelid_aseguradoraVehiculo.setText(""+VehiculoConstantesFunciones.LABEL_IDASEGURADORA+" : *");
		this.jLabelid_aseguradoraVehiculo.setToolTipText("Aseguradora");
		this.jLabelid_aseguradoraVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_aseguradoraVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_aseguradoraVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_aseguradoraVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_aseguradoraVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_aseguradoraVehiculo.setToolTipText(VehiculoConstantesFunciones.LABEL_IDASEGURADORA);
		this.gridaBagLayoutVehiculo = new GridBagLayout();
		this.jPanelid_aseguradoraVehiculo.setLayout(this.gridaBagLayoutVehiculo);


		jComboBoxid_aseguradoraVehiculo= new JComboBoxMe();
		jComboBoxid_aseguradoraVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_aseguradoraVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_aseguradoraVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_aseguradoraVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_aseguradoraVehiculo= new JButtonMe();
		this.jButtonid_aseguradoraVehiculo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_aseguradoraVehiculo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_aseguradoraVehiculo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_aseguradoraVehiculo.setText("Buscar");
		this.jButtonid_aseguradoraVehiculo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_aseguradoraVehiculo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_aseguradoraVehiculo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_aseguradoraVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_aseguradoraVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_aseguradoraVehiculo"));

		this.jButtonid_aseguradoraVehiculoBusqueda= new JButtonMe();
		this.jButtonid_aseguradoraVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_aseguradoraVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_aseguradoraVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_aseguradoraVehiculoBusqueda.setText("U");
		this.jButtonid_aseguradoraVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_aseguradoraVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_aseguradoraVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_aseguradoraVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_aseguradoraVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_aseguradoraVehiculoBusqueda"));

		if(this.vehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_aseguradoraVehiculoBusqueda.setVisible(false);		}

		this.jButtonid_aseguradoraVehiculoUpdate= new JButtonMe();
		this.jButtonid_aseguradoraVehiculoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_aseguradoraVehiculoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_aseguradoraVehiculoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_aseguradoraVehiculoUpdate.setText("U");
		this.jButtonid_aseguradoraVehiculoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_aseguradoraVehiculoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_aseguradoraVehiculoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_aseguradoraVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_aseguradoraVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_aseguradoraVehiculoUpdate"));



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
		//this.jInternalFrameDetalleVehiculo = new VehiculoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vehiculo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVehiculo= new GridBagLayout();
		

		
		String sToolTipVehiculo="";
		sToolTipVehiculo=VehiculoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVehiculo+="(ActivosFijos.Vehiculo)";
		}
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			sToolTipVehiculo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVehiculo = new JButtonMe();
		this.jButtonModificarVehiculo = new JButtonMe();
        this.jButtonActualizarVehiculo = new JButtonMe();
        this.jButtonEliminarVehiculo = new JButtonMe();
        this.jButtonCancelarVehiculo = new JButtonMe();
        this.jButtonGuardarCambiosVehiculo = new JButtonMe();
		this.jButtonGuardarCambiosTablaVehiculo = new JButtonMe();
		this.jButtonCerrarVehiculo = new JButtonMe();
		
		this.jScrollPanelDatosVehiculo = new JScrollPane();   
        this.jScrollPanelDatosEdicionVehiculo = new JScrollPane();
		this.jScrollPanelDatosGeneralVehiculo = new JScrollPane();
				
		
		
		this.jPanelCamposVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vehiculo";
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculos" + this.sPath));
		} else {
			this.jScrollPanelDatosVehiculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVehiculo.setName("jPanelCamposVehiculo"); 

		this.jPanelCamposOcultosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVehiculo.setName("jPanelCamposOcultosVehiculo"); 

        this.jPanelAccionesVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVehiculo.setToolTipText("Acciones");
        this.jPanelAccionesVehiculo.setName("Acciones"); 

		this.jPanelAccionesFormularioVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVehiculo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVehiculo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVehiculo.setText("Nuevo");
		this.jButtonModificarVehiculo.setText("Editar");
        this.jButtonActualizarVehiculo.setText("Actualizar");
        this.jButtonEliminarVehiculo.setText("Eliminar");
        this.jButtonCancelarVehiculo.setText("Cancelar");
        this.jButtonGuardarCambiosVehiculo.setText("Guardar");
		this.jButtonGuardarCambiosTablaVehiculo.setText("Guardar");
		this.jButtonCerrarVehiculo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVehiculo,"nuevo_button","Nuevo",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVehiculo,"modificar_button","Editar",this.vehiculoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVehiculo,"actualizar_button","Actualizar",this.vehiculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVehiculo,"eliminar_button","Eliminar",this.vehiculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVehiculo,"cancelar_button","Cancelar",this.vehiculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVehiculo,"guardarcambios_button","Guardar",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVehiculo,"guardarcambiostabla_button","Guardar",this.vehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVehiculo,"cerrar_button","Salir",this.vehiculoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVehiculo.setToolTipText("Nuevo"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVehiculo.setToolTipText("Editar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVehiculo.setToolTipText("Actualizar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVehiculo.setToolTipText("Eliminar)"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVehiculo.setToolTipText("Cancelar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVehiculo.setToolTipText("Guardar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVehiculo.setToolTipText("Guardar"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVehiculo.setToolTipText("Salir"+" "+VehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVehiculo";
		inputMap = this.jButtonNuevoVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVehiculo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVehiculo";
		inputMap = this.jButtonActualizarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVehiculo"));
		
		//ELIMINAR
		sMapKey = "EliminarVehiculo";
		inputMap = this.jButtonEliminarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVehiculo"));
		
		//CANCELAR	
		sMapKey = "CancelarVehiculo";
		inputMap = this.jButtonCancelarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVehiculo"));
		
		//CERRAR		
		sMapKey = "CerrarVehiculo";
		inputMap = this.jButtonCerrarVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVehiculo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVehiculo";
		inputMap = this.jButtonGuardarCambiosTablaVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVehiculo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVehiculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVehiculo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVehiculo.setToolTipText("Nuevo Vehiculo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVehiculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVehiculo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVehiculo.setToolTipText("Sin Cerrar Ventana Vehiculo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVehiculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVehiculo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVehiculo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVehiculo.setText("Accion");
		this.jComboBoxTiposAccionesVehiculo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVehiculo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVehiculo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVehiculo = new JLabelMe();
		
		this.jLabelAccionesVehiculo.setText("Acciones");		
		this.jLabelAccionesVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVehiculo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVehiculo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVehiculo=new JTabbedPane();
		this.jTabbedPaneRelacionesVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVehiculo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVehiculo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVehiculo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVehiculo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVehiculo = new GridBagLayout();
		
		this.jPanelCamposVehiculo.setLayout(gridaBagLayoutCamposVehiculo);
		this.jPanelCamposOcultosVehiculo.setLayout(gridaBagLayoutCamposOcultosVehiculo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVehiculo.add(jLabelIdVehiculo, this.gridBagConstraintsVehiculo);



	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVehiculo.add(jLabelidVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVehiculo.add(jLabelid_empresaVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVehiculo.add(jButtonid_empresaVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 3;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVehiculo.add(jButtonid_empresaVehiculoUpdate, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVehiculo.add(jComboBoxid_empresaVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVehiculo.add(jLabelid_sucursalVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVehiculo.add(jButtonid_sucursalVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 3;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVehiculo.add(jButtonid_sucursalVehiculoUpdate, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVehiculo.add(jComboBoxid_sucursalVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoVehiculo.add(jLabelid_detalle_activo_fijoVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoVehiculo.add(jButtonid_detalle_activo_fijoVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 3;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoVehiculo.add(jButtonid_detalle_activo_fijoVehiculoUpdate, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoVehiculo.add(jComboBoxid_detalle_activo_fijoVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_aseguradoraVehiculo.add(jLabelid_aseguradoraVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_aseguradoraVehiculo.add(jButtonid_aseguradoraVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 3;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_aseguradoraVehiculo.add(jButtonid_aseguradoraVehiculoUpdate, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_aseguradoraVehiculo.add(jComboBoxid_aseguradoraVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_polizaVehiculo.add(jLabelnumero_polizaVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_polizaVehiculo.add(jButtonnumero_polizaVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_polizaVehiculo.add(jTextFieldnumero_polizaVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionVehiculo.add(jLabelfecha_emisionVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionVehiculo.add(jButtonfecha_emisionVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionVehiculo.add(jDateChooserfecha_emisionVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoVehiculo.add(jLabelfecha_vencimientoVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoVehiculo.add(jButtonfecha_vencimientoVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoVehiculo.add(jDateChooserfecha_vencimientoVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_aseguradoVehiculo.add(jLabelvalor_aseguradoVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_aseguradoVehiculo.add(jButtonvalor_aseguradoVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_aseguradoVehiculo.add(jTextFieldvalor_aseguradoVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_deducibleVehiculo.add(jLabelvalor_deducibleVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_deducibleVehiculo.add(jButtonvalor_deducibleVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_deducibleVehiculo.add(jTextFieldvalor_deducibleVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_matriculaVehiculo.add(jLabelnumero_matriculaVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_matriculaVehiculo.add(jButtonnumero_matriculaVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_matriculaVehiculo.add(jTextFieldnumero_matriculaVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_motorVehiculo.add(jLabelnumero_motorVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_motorVehiculo.add(jButtonnumero_motorVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_motorVehiculo.add(jTextFieldnumero_motorVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chasisVehiculo.add(jLabelnumero_chasisVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chasisVehiculo.add(jButtonnumero_chasisVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chasisVehiculo.add(jTextFieldnumero_chasisVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_placaVehiculo.add(jLabelnumero_placaVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_placaVehiculo.add(jButtonnumero_placaVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_placaVehiculo.add(jTextFieldnumero_placaVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_comercialVehiculo.add(jLabelvalor_comercialVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_comercialVehiculo.add(jButtonvalor_comercialVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_comercialVehiculo.add(jTextFieldvalor_comercialVehiculo, this.gridBagConstraintsVehiculo);


	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 0;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionVehiculo.add(jLabeldescripcionVehiculo, this.gridBagConstraintsVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = 2;
		this.gridBagConstraintsVehiculo.ipadx = 0;
		this.gridBagConstraintsVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionVehiculo.add(jButtondescripcionVehiculoBusqueda, this.gridBagConstraintsVehiculo);
	}

	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculo.gridy = 0;
	this.gridBagConstraintsVehiculo.gridx = 1;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionVehiculo.add(jscrollPanedescripcionVehiculo, this.gridBagConstraintsVehiculo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelidVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelid_detalle_activo_fijoVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelid_aseguradoraVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelnumero_polizaVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelfecha_emisionVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelfecha_vencimientoVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelvalor_aseguradoVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelvalor_deducibleVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelnumero_matriculaVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelnumero_motorVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelnumero_chasisVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelnumero_placaVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPanelvalor_comercialVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculo.add(this.jPaneldescripcionVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposVehiculo % 2==0) {
		iXPanelCamposVehiculo=0;
		iYPanelCamposVehiculo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposOcultosVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposOcultosVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVehiculo.add(this.jPanelid_empresaVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposOcultosVehiculo % 2==0) {
		iXPanelCamposOcultosVehiculo=0;
		iYPanelCamposOcultosVehiculo++;
	}
	this.gridBagConstraintsVehiculo = new GridBagConstraints();
	this.gridBagConstraintsVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculo.gridy = iYPanelCamposOcultosVehiculo;
	this.gridBagConstraintsVehiculo.gridx = iXPanelCamposOcultosVehiculo++;
	this.gridBagConstraintsVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVehiculo.add(this.jPanelid_sucursalVehiculo, this.gridBagConstraintsVehiculo);



	if(iXPanelCamposOcultosVehiculo % 2==0) {
		iXPanelCamposOcultosVehiculo=0;
		iYPanelCamposOcultosVehiculo++;
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
			
		GridBagLayout gridaBagLayoutAccionesVehiculo= new GridBagLayout();
		this.jPanelAccionesVehiculo.setLayout(gridaBagLayoutAccionesVehiculo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVehiculo= new GridBagLayout();
		this.jPanelAccionesFormularioVehiculo.setLayout(gridaBagLayoutAccionesFormularioVehiculo);
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVehiculo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVehiculo.add(this.jComboBoxTiposAccionesFormularioVehiculo, this.gridBagConstraintsVehiculo);

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVehiculo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVehiculo.add(this.jCheckBoxPostAccionNuevoVehiculo, this.gridBagConstraintsVehiculo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVehiculo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVehiculo.add(this.jCheckBoxPostAccionSinCerrarVehiculo, this.gridBagConstraintsVehiculo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVehiculo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVehiculo.add(this.jCheckBoxPostAccionSinMensajeVehiculo, this.gridBagConstraintsVehiculo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx = iPosXAccion++;
			
		this.jPanelAccionesVehiculo.add(this.jButtonModificarVehiculo, this.gridBagConstraintsVehiculo);							

		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculo.gridy = 0;
		this.gridBagConstraintsVehiculo.gridx =iPosXAccion++;
			
		this.jPanelAccionesVehiculo.add(this.jButtonEliminarVehiculo, this.gridBagConstraintsVehiculo);
		
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = 0;		
		this.gridBagConstraintsVehiculo.gridx = iPosXAccion++;
		
		this.jPanelAccionesVehiculo.add(this.jButtonActualizarVehiculo, this.gridBagConstraintsVehiculo);


		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = 0;		
		this.gridBagConstraintsVehiculo.gridx = iPosXAccion++;
		
		this.jPanelAccionesVehiculo.add(this.jButtonGuardarCambiosVehiculo, this.gridBagConstraintsVehiculo);	
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = 0;		
		this.gridBagConstraintsVehiculo.gridx =iPosXAccion++;
		
		this.jPanelAccionesVehiculo.add(this.jButtonCancelarVehiculo, this.gridBagConstraintsVehiculo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVehiculo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVehiculo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVehiculo = new GridBagConstraints();						
			this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVehiculo.gridx = 0;		
			//this.gridBagConstraintsVehiculo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVehiculo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVehiculo.gridx =0;
		this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVehiculo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVehiculo, this.gridBagConstraintsVehiculo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VehiculoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVehiculo = new VehiculoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vehiculo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vehiculo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vehiculo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VehiculoModel vehiculoModel=new VehiculoModel(this);
			
			//SI USARA CLASE INTERNA
			//VehiculoModel.VehiculoFocusTraversalPolicy vehiculoFocusTraversalPolicy = vehiculoModel.new VehiculoFocusTraversalPolicy(this);
			
			//vehiculoFocusTraversalPolicy.setvehiculoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vehiculoModel);
			
			
			this.jContentPaneDetalleVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVehiculo = new GridBagLayout();	
			this.jContentPaneDetalleVehiculo.setLayout(gridaBagLayoutDetalleVehiculo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVehiculo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVehiculo = new GridBagConstraints();
				this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVehiculo.gridx = 0;
					
				
				this.jContentPaneDetalleVehiculo.add(jTtoolBarDetalleVehiculo, gridBagConstraintsVehiculo);								
				
}
			
			this.jScrollPanelDatosEdicionVehiculo=   new JScrollPane(jContentPaneDetalleVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVehiculo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVehiculo.gridx = 0;
	        
			this.jContentPaneDetalleVehiculo.add(jPanelCamposVehiculo, gridBagConstraintsVehiculo);
			
			
			
			
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
						&& vehiculoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameServicioTransporte(this.puedeCargarPorParteServicioTransporte,false,-1);
					
					if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVehiculo= new GridBagConstraints();
						this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVehiculo.gridx = 0;
						this.jContentPaneDetalleVehiculo.add(this.jTabbedPaneRelacionesVehiculo, this.gridBagConstraintsVehiculo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVehiculo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameServicioTransporte(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVehiculo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVehiculo = new GridBagConstraints();
					this.gridBagConstraintsVehiculo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVehiculo.gridx = 0;
					
				
					this.jContentPaneDetalleVehiculo.add(jPanelCamposOcultosVehiculo, gridBagConstraintsVehiculo);
				
					this.jPanelCamposOcultosVehiculo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsVehiculo.gridx = 0;
	        this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVehiculo.add(this.jPanelAccionesFormularioVehiculo, this.gridBagConstraintsVehiculo);							
			
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
	        this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsVehiculo.gridx = 0;
	        
			
			this.jContentPaneDetalleVehiculo.add(this.jPanelAccionesVehiculo, this.gridBagConstraintsVehiculo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVehiculo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVehiculo=   new JScrollPane(this.jPanelCamposVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVehiculo.gridx = 0;
			this.gridBagConstraintsVehiculo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVehiculo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVehiculo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVehiculo, this.gridBagConstraintsVehiculo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVehiculo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVehiculo, this.gridBagConstraintsVehiculo);			
			
			this.gridBagConstraintsVehiculo = new GridBagConstraints();
			this.gridBagConstraintsVehiculo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVehiculo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVehiculo, this.gridBagConstraintsVehiculo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVehiculo, this.gridBagConstraintsVehiculo);
			
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVehiculo, this.gridBagConstraintsVehiculo);
		
			
		this.gridBagConstraintsVehiculo = new GridBagConstraints();
		this.gridBagConstraintsVehiculo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVehiculo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVehiculo, this.gridBagConstraintsVehiculo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVehiculo;//jContentPane;
		
		return jScrollPanelDatosEdicionVehiculo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameServicioTransporte(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		this.serviciotransporteSessionBean.setConGuardarRelaciones(false);
		this.serviciotransporteSessionBean.setEsGuardarRelacionado(true);

		this.serviciotransporteBeanSwingJInternalFrame=null;//new ServicioTransporteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.serviciotransporteBeanSwingJInternalFramePopup=new ServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.serviciotransporteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {

				ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.serviciotransporteSessionBean.setEsGuardarRelacionado(true);

				this.serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.serviciotransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.serviciotransporteBeanSwingJInternalFrame.setserviciotransporteSessionBean(this.serviciotransporteSessionBean);

				//this.gridBagConstraintsVehiculo = new GridBagConstraints();
				//this.gridBagConstraintsVehiculo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVehiculo.gridx = 0;
				//this.jContentPaneDetalleVehiculo.add(this.serviciotransporteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVehiculo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVehiculo.add("Servicio Transportes",this.serviciotransporteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVehiculo.setComponentAt(iIndexTab,this.serviciotransporteBeanSwingJInternalFrame.getContentPane());
				}

				//ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
				this.serviciotransporteBeanSwingJInternalFrame=null;//new ServicioTransporteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteServicioTransporte) {
					this.jTabbedPaneRelacionesVehiculo.add("Servicio Transportes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarServicioTransporteBeanSwingJInternalFrame(List<Vehiculo> vehiculos,Vehiculo vehiculo,ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					serviciotransporteBeanSwingJInternalFrame.getServicioTransporteLogic().setConnexion(this.vehiculoLogic.getConnexion());

					serviciotransporteBeanSwingJInternalFrame.setvehiculosForeignKey(vehiculos);
					serviciotransporteBeanSwingJInternalFrame.setvehiculoForeignKey(vehiculo);
					serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionVehiculo(true);
					serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setlidVehiculoActual(vehiculo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					serviciotransporteBeanSwingJInternalFrame.cargarCombosForeignKeyServicioTransporte(serviciotransporteBeanSwingJInternalFrame.isCargarCombosDependencia);
					serviciotransporteBeanSwingJInternalFrame.setVisibilidadBusquedasParaVehiculo(true);
					serviciotransporteBeanSwingJInternalFrame.setid_vehiculoFK_IdVehiculo(vehiculo.getId());

					if(!this.conCargarFormDetalle) {
						serviciotransporteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					serviciotransporteBeanSwingJInternalFrame.setSelectedItemCombosFrameVehiculoForeignKey(vehiculo,1,false,true,true);
					serviciotransporteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					serviciotransporteBeanSwingJInternalFrame.procesarBusqueda("FK_IdVehiculo");
					serviciotransporteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVehiculo");
					serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(true);
					serviciotransporteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesServicioTransporte("n",serviciotransporteBeanSwingJInternalFrame.isGuardarCambiosEnLote, serviciotransporteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					serviciotransporteBeanSwingJInternalFrame.setAutoscrolls(true);
					serviciotransporteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("relacionado");
					} else {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("no_relacionado");
					}

					serviciotransporteBeanSwingJInternalFrame.getjButtonRecargarInformacionServicioTransporte().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
