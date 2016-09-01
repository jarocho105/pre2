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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.PrestamoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class PrestamoDetalleFormJInternalFrame extends PrestamoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePrestamo;
	
	protected JMenuBar jmenuBarDetallePrestamo;
	
	protected JMenu jmenuDetallePrestamo;
	protected JMenu jmenuDetalleArchivoPrestamo;
	protected JMenu jmenuDetalleAccionesPrestamo;
	protected JMenu jmenuDetalleDatosPrestamo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPrestamo;	
	protected GridBagConstraints gridBagConstraintsPrestamo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PrestamoBeanSwingJInternalFrameAdditional jInternalFrameDetallePrestamo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprestamo="";

	protected TipoCuotaBeanSwingJInternalFrame tipocuotaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuota="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public PrestamoSessionBean prestamoSessionBean;
	
	

	public AbonoPrestamoBeanSwingJInternalFrame abonoprestamoBeanSwingJInternalFrame=null;
	public AbonoPrestamoBeanSwingJInternalFrame abonoprestamoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAbonoPrestamo=false;
	public AbonoPrestamoSessionBean abonoprestamoSessionBean;

	public CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;
	public CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuota=false;
	public CuotaSessionBean cuotaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrestamoSessionBean tipoprestamoSessionBean;
	public TipoCuotaSessionBean tipocuotaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public PrestamoLogic prestamoLogic;
	
	public JScrollPane jScrollPanelDatosPrestamo;
	public JScrollPane jScrollPanelDatosEdicionPrestamo;
	public JScrollPane jScrollPanelDatosGeneralPrestamo;
	
	protected JPanel jPanelCamposPrestamo;    
	protected JPanel jPanelCamposOcultosPrestamo;    	
	protected JPanel jPanelAccionesPrestamo;
	protected JPanel jPanelAccionesFormularioPrestamo;
    
	
	
	protected Integer iXPanelCamposPrestamo=0;
	protected Integer iYPanelCamposPrestamo=0;
	
	protected Integer iXPanelCamposOcultosPrestamo=0;
	protected Integer iYPanelCamposOcultosPrestamo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPrestamo;
	public JButton jButtonModificarPrestamo;
	public JButton jButtonActualizarPrestamo;
    public JButton jButtonEliminarPrestamo;
	public JButton jButtonCancelarPrestamo;
    public JButton jButtonGuardarCambiosPrestamo;
	public JButton jButtonGuardarCambiosTablaPrestamo;
	protected JButton jButtonCerrarPrestamo;
	
	
	protected JButton jButtonProcesarInformacionPrestamo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPrestamo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPrestamo;
	protected JCheckBox jCheckBoxPostAccionSinMensajePrestamo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPrestamo;
	protected JButton jButtonModificarToolBarPrestamo;
	protected JButton jButtonActualizarToolBarPrestamo;
    protected JButton jButtonEliminarToolBarPrestamo;
	protected JButton jButtonCancelarToolBarPrestamo;
    protected JButton jButtonGuardarCambiosToolBarPrestamo;
	protected JButton jButtonGuardarCambiosTablaToolBarPrestamo;
	protected JButton jButtonMostrarOcultarTablaToolBarPrestamo;
	protected JButton jButtonCerrarToolBarPrestamo;
	
	protected JButton jButtonProcesarInformacionToolBarPrestamo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPrestamo;
	protected JMenuItem jMenuItemModificarPrestamo;
	protected JMenuItem jMenuItemActualizarPrestamo;
    protected JMenuItem jMenuItemEliminarPrestamo;
	protected JMenuItem jMenuItemCancelarPrestamo;
    protected JMenuItem jMenuItemGuardarCambiosPrestamo;
	protected JMenuItem jMenuItemGuardarCambiosTablaPrestamo;
	protected JMenuItem jMenuItemCerrarPrestamo;
	protected JMenuItem jMenuItemDetalleCerrarPrestamo;
	protected JMenuItem jMenuItemDetalleMostarOcultarPrestamo;
	
	protected JMenuItem jMenuItemProcesarInformacionPrestamo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPrestamo;
	protected JMenuItem jMenuItemMostrarOcultarPrestamo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPrestamo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPrestamo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPrestamo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPrestamo;
	public JLabel jLabelIdPrestamo;
	public JLabel jLabelidPrestamo;
	public JButton jButtonidPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPrestamo;
	public JLabel jLabelcodigoPrestamo;
	public JTextField jTextFieldcodigoPrestamo;
	public JButton jButtoncodigoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoPrestamo;
	public JLabel jLabelnumero_pre_impresoPrestamo;
	public JTextField jTextFieldnumero_pre_impresoPrestamo;
	public JButton jButtonnumero_pre_impresoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelfechaPrestamo;
	public JLabel jLabelfechaPrestamo;
	//public JFormattedTextField jDateChooserfechaPrestamo;

	public JDateChooser jDateChooserfechaPrestamo;
	public JButton jButtonfechaPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelmontoPrestamo;
	public JLabel jLabelmontoPrestamo;
	public JTextField jTextFieldmontoPrestamo;
	public JButton jButtonmontoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotasPrestamo;
	public JLabel jLabelnumero_cuotasPrestamo;
	public JTextField jTextFieldnumero_cuotasPrestamo;
	public JButton jButtonnumero_cuotasPrestamoBusqueda= new JButtonMe();

	public JPanel jPaneltasaPrestamo;
	public JLabel jLabeltasaPrestamo;
	public JTextField jTextFieldtasaPrestamo;
	public JButton jButtontasaPrestamoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPrestamo;
	public JLabel jLabeldescripcionPrestamo;
	public JTextArea jTextAreadescripcionPrestamo;
	public JScrollPane jscrollPanedescripcionPrestamo;
	public JButton jButtondescripcionPrestamoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPrestamo;
	public JLabel jLabelid_empresaPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPrestamo;
	public JButton jButtonid_empresaPrestamo= new JButtonMe();
	public JButton jButtonid_empresaPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPrestamo;
	public JLabel jLabelid_empleadoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPrestamo;
	public JButton jButtonid_empleadoPrestamo= new JButtonMe();
	public JButton jButtonid_empleadoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_prestamoPrestamo;
	public JLabel jLabelid_tipo_prestamoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prestamoPrestamo;
	public JButton jButtonid_tipo_prestamoPrestamo= new JButtonMe();
	public JButton jButtonid_tipo_prestamoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prestamoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuotaPrestamo;
	public JLabel jLabelid_tipo_cuotaPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuotaPrestamo;
	public JButton jButtonid_tipo_cuotaPrestamo= new JButtonMe();
	public JButton jButtonid_tipo_cuotaPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuotaPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contablePrestamo;
	public JLabel jLabelid_asiento_contablePrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contablePrestamo;
	public JButton jButtonid_asiento_contablePrestamo= new JButtonMe();
	public JButton jButtonid_asiento_contablePrestamoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contablePrestamoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPrestamo;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PrestamoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPrestamo=new JPanel();
				this.jPanelAccionesFormularioPrestamo=new JPanel();
				this.jmenuBarDetallePrestamo=new JMenuBar();
				this.jTtoolBarDetallePrestamo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PrestamoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrestamoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Prestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarPrestamo() {
		return this.jButtonActualizarToolBarPrestamo;
	}
	
	public JButton getjButtonEliminarToolBarPrestamo() {
		return this.jButtonEliminarToolBarPrestamo;
	}
	
	public JButton getjButtonCancelarToolBarPrestamo() {
		return this.jButtonCancelarToolBarPrestamo;
	}		
	
	public JButton getjButtonProcesarInformacionPrestamo() {
		return this.jButtonProcesarInformacionPrestamo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPrestamo)	{
		this.jButtonProcesarInformacionPrestamo = jButtonProcesarInformacionPrestamo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPrestamo() {
		return this.jComboBoxTiposAccionesPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPrestamo(
			JComboBox jComboBoxTiposRelacionesPrestamo) {
		this.jComboBoxTiposRelacionesPrestamo = jComboBoxTiposRelacionesPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPrestamo(
			JComboBox jComboBoxTiposAccionesPrestamo) {
		this.jComboBoxTiposAccionesPrestamo = jComboBoxTiposAccionesPrestamo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPrestamo() {
		return this.jComboBoxTiposAccionesFormularioPrestamo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPrestamo(
			JComboBox jComboBoxTiposAccionesFormularioPrestamo) {
		this.jComboBoxTiposAccionesFormularioPrestamo = jComboBoxTiposAccionesFormularioPrestamo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.prestamoSessionBean=new PrestamoSessionBean();
		
		this.prestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.prestamoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		//this.cuotaSessionBean=new CuotaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PrestamoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Prestamo MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
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
	
		PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePrestamo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPrestamo=new JButtonMe();
				this.jButtonModificarToolBarPrestamo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPrestamo,this.jTtoolBarDetallePrestamo,
							"actualizar","actualizar","Actualizar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPrestamo,this.jTtoolBarDetallePrestamo,
							"eliminar","eliminar","Eliminar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPrestamo,this.jTtoolBarDetallePrestamo,
							"cancelar","cancelar","Cancelar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPrestamo,this.jTtoolBarDetallePrestamo,
							"guardarcambios","guardarcambios","Guardar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePrestamo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePrestamo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPrestamo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPrestamo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPrestamo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPrestamo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPrestamo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPrestamo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPrestamo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPrestamo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPrestamo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPrestamo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPrestamo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPrestamo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPrestamo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPrestamo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPrestamo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPrestamo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPrestamo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPrestamo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPrestamo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPrestamo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPrestamo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPrestamo.add(this.jMenuItemDetalleCerrarPrestamo);
		
		this.jmenuDetalleAccionesPrestamo.add(this.jMenuItemActualizarPrestamo);
		this.jmenuDetalleAccionesPrestamo.add(this.jMenuItemEliminarPrestamo);
		this.jmenuDetalleAccionesPrestamo.add(this.jMenuItemCancelarPrestamo);		
		
		//this.jmenuDetalleDatosPrestamo.add(this.jMenuItemDetalleAbrirOrderByPrestamo);				
		this.jmenuDetalleDatosPrestamo.add(this.jMenuItemDetalleMostarOcultarPrestamo);				
				
		//this.jmenuDetalleAccionesPrestamo.add(this.jMenuItemGuardarCambiosPrestamo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePrestamo.add(this.jmenuDetalleArchivoPrestamo);		
		this.jmenuBarDetallePrestamo.add(this.jmenuDetalleAccionesPrestamo);		
		this.jmenuBarDetallePrestamo.add(this.jmenuDetalleDatosPrestamo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePrestamo.add(this.jmenuDetallePrestamo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePrestamo);				
	}
	
	
	public void inicializarElementosCamposPrestamo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPrestamo = new JLabelMe();
		jLabelIdPrestamo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPrestamo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPrestamo= new GridBagLayout();

		this.jPanelidPrestamo.setLayout(this.gridaBagLayoutPrestamo);

		jLabelidPrestamo = new JLabel();
		jLabelidPrestamo.setText("Id");

		jLabelidPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPrestamo = new JLabelMe();
		this.jLabelcodigoPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPrestamo.setToolTipText("Codigo");
		this.jLabelcodigoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelcodigoPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jTextFieldcodigoPrestamo= new JTextFieldMe();

		jTextFieldcodigoPrestamo.setEnabled(false);
		jTextFieldcodigoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPrestamoBusqueda= new JButtonMe();
		this.jButtoncodigoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPrestamoBusqueda.setText("U");
		this.jButtoncodigoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoPrestamo = new JLabelMe();
		this.jLabelnumero_pre_impresoPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoPrestamo.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelnumero_pre_impresoPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jTextFieldnumero_pre_impresoPrestamo= new JTextFieldMe();

		jTextFieldnumero_pre_impresoPrestamo.setEnabled(false);
		jTextFieldnumero_pre_impresoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoPrestamoBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoPrestamoBusqueda.setText("U");
		this.jButtonnumero_pre_impresoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelfechaPrestamo = new JLabelMe();
		this.jLabelfechaPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPrestamo.setToolTipText("Fecha");
		this.jLabelfechaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelfechaPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		//jFormattedTextFieldfechaPrestamo= new JFormattedTextFieldMe();

		jDateChooserfechaPrestamo= new JDateChooser();
		jDateChooserfechaPrestamo.setEnabled(false);
		jDateChooserfechaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPrestamo.setDate(new Date());
		jDateChooserfechaPrestamo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPrestamo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPrestamoBusqueda= new JButtonMe();
		this.jButtonfechaPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPrestamoBusqueda.setText("U");
		this.jButtonfechaPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelmontoPrestamo = new JLabelMe();
		this.jLabelmontoPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoPrestamo.setToolTipText("Monto");
		this.jLabelmontoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelmontoPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jTextFieldmontoPrestamo= new JTextFieldMe();
		jTextFieldmontoPrestamo.setEnabled(false);
		jTextFieldmontoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoPrestamo.setText("0.0");

		this.jButtonmontoPrestamoBusqueda= new JButtonMe();
		this.jButtonmontoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoPrestamoBusqueda.setText("U");
		this.jButtonmontoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuotasPrestamo = new JLabelMe();
		this.jLabelnumero_cuotasPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS+" : *");
		this.jLabelnumero_cuotasPrestamo.setToolTipText("Numero Cuotas");
		this.jLabelnumero_cuotasPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotasPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotasPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotasPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelnumero_cuotasPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jTextFieldnumero_cuotasPrestamo= new JTextFieldMe();
		jTextFieldnumero_cuotasPrestamo.setEnabled(false);
		jTextFieldnumero_cuotasPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotasPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotasPrestamo.setText("0");

		this.jButtonnumero_cuotasPrestamoBusqueda= new JButtonMe();
		this.jButtonnumero_cuotasPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotasPrestamoBusqueda.setText("U");
		this.jButtonnumero_cuotasPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotasPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotasPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotasPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotasPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotasPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotasPrestamoBusqueda.setVisible(false);		}


					
		this.jLabeltasaPrestamo = new JLabelMe();
		this.jLabeltasaPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_TASA+" : *");
		this.jLabeltasaPrestamo.setToolTipText("Tasa");
		this.jLabeltasaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltasaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltasaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltasaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltasaPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltasaPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_TASA);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPaneltasaPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jTextFieldtasaPrestamo= new JTextFieldMe();
		jTextFieldtasaPrestamo.setEnabled(false);
		jTextFieldtasaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtasaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtasaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtasaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtasaPrestamo.setText("0.0");

		this.jButtontasaPrestamoBusqueda= new JButtonMe();
		this.jButtontasaPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontasaPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontasaPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontasaPrestamoBusqueda.setText("U");
		this.jButtontasaPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontasaPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontasaPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtasaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtasaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tasaPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontasaPrestamoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPrestamo = new JLabelMe();
		this.jLabeldescripcionPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPrestamo.setToolTipText("Descripcion");
		this.jLabeldescripcionPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPaneldescripcionPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jTextAreadescripcionPrestamo= new JTextAreaMe();
		jTextAreadescripcionPrestamo.setEnabled(false);
		jTextAreadescripcionPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPrestamo.setLineWrap(true);
		jTextAreadescripcionPrestamo.setWrapStyleWord(true);
		jTextAreadescripcionPrestamo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPrestamo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPrestamo = new JScrollPane(jTextAreadescripcionPrestamo);
		jscrollPanedescripcionPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionPrestamoBusqueda= new JButtonMe();
		this.jButtondescripcionPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPrestamoBusqueda.setText("U");
		this.jButtondescripcionPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPrestamoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPrestamo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPrestamo = new JLabelMe();
		this.jLabelid_empresaPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPrestamo.setToolTipText("Empresa");
		this.jLabelid_empresaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelid_empresaPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jComboBoxid_empresaPrestamo= new JComboBoxMe();
		jComboBoxid_empresaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPrestamo.setEnabled(false);

		this.jButtonid_empresaPrestamo= new JButtonMe();
		this.jButtonid_empresaPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrestamo.setText("Buscar");
		this.jButtonid_empresaPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrestamo"));

		this.jButtonid_empresaPrestamoBusqueda= new JButtonMe();
		this.jButtonid_empresaPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPrestamoBusqueda.setText("U");
		this.jButtonid_empresaPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPrestamoUpdate= new JButtonMe();
		this.jButtonid_empresaPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPrestamoUpdate.setText("U");
		this.jButtonid_empresaPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrestamoUpdate"));



					
		this.jLabelid_empleadoPrestamo = new JLabelMe();
		this.jLabelid_empleadoPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPrestamo.setToolTipText("Empleado");
		this.jLabelid_empleadoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelid_empleadoPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jComboBoxid_empleadoPrestamo= new JComboBoxMe();
		jComboBoxid_empleadoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPrestamo= new JButtonMe();
		this.jButtonid_empleadoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPrestamo.setText("Buscar");
		this.jButtonid_empleadoPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPrestamo"));

		this.jButtonid_empleadoPrestamoBusqueda= new JButtonMe();
		this.jButtonid_empleadoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPrestamoBusqueda.setText("U");
		this.jButtonid_empleadoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPrestamoUpdate= new JButtonMe();
		this.jButtonid_empleadoPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPrestamoUpdate.setText("U");
		this.jButtonid_empleadoPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPrestamoUpdate"));



					
		this.jLabelid_tipo_prestamoPrestamo = new JLabelMe();
		this.jLabelid_tipo_prestamoPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO+" : *");
		this.jLabelid_tipo_prestamoPrestamo.setToolTipText("Tipo Prestamo");
		this.jLabelid_tipo_prestamoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_prestamoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_prestamoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prestamoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_prestamoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_prestamoPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelid_tipo_prestamoPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jComboBoxid_tipo_prestamoPrestamo= new JComboBoxMe();
		jComboBoxid_tipo_prestamoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prestamoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_prestamoPrestamo= new JButtonMe();
		this.jButtonid_tipo_prestamoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prestamoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prestamoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prestamoPrestamo.setText("Buscar");
		this.jButtonid_tipo_prestamoPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_prestamoPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prestamoPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_prestamoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prestamoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prestamoPrestamo"));

		this.jButtonid_tipo_prestamoPrestamoBusqueda= new JButtonMe();
		this.jButtonid_tipo_prestamoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prestamoPrestamoBusqueda.setText("U");
		this.jButtonid_tipo_prestamoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_prestamoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prestamoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_prestamoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prestamoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prestamoPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_prestamoPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_prestamoPrestamoUpdate= new JButtonMe();
		this.jButtonid_tipo_prestamoPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prestamoPrestamoUpdate.setText("U");
		this.jButtonid_tipo_prestamoPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_prestamoPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prestamoPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_prestamoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prestamoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prestamoPrestamoUpdate"));



					
		this.jLabelid_tipo_cuotaPrestamo = new JLabelMe();
		this.jLabelid_tipo_cuotaPrestamo.setText(""+PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA+" : *");
		this.jLabelid_tipo_cuotaPrestamo.setToolTipText("Tipo Cuota");
		this.jLabelid_tipo_cuotaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cuotaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cuotaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuotaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuotaPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuotaPrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelid_tipo_cuotaPrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jComboBoxid_tipo_cuotaPrestamo= new JComboBoxMe();
		jComboBoxid_tipo_cuotaPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuotaPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuotaPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuotaPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuotaPrestamo= new JButtonMe();
		this.jButtonid_tipo_cuotaPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuotaPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuotaPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuotaPrestamo.setText("Buscar");
		this.jButtonid_tipo_cuotaPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuotaPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuotaPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuotaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuotaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuotaPrestamo"));

		this.jButtonid_tipo_cuotaPrestamoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuotaPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuotaPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuotaPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuotaPrestamoBusqueda.setText("U");
		this.jButtonid_tipo_cuotaPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuotaPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuotaPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuotaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuotaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuotaPrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuotaPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuotaPrestamoUpdate= new JButtonMe();
		this.jButtonid_tipo_cuotaPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuotaPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuotaPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuotaPrestamoUpdate.setText("U");
		this.jButtonid_tipo_cuotaPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuotaPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuotaPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuotaPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuotaPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuotaPrestamoUpdate"));



					
		this.jLabelid_asiento_contablePrestamo = new JLabelMe();
		this.jLabelid_asiento_contablePrestamo.setText(""+PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contablePrestamo.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contablePrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contablePrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contablePrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contablePrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contablePrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contablePrestamo.setToolTipText(PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutPrestamo = new GridBagLayout();
		this.jPanelid_asiento_contablePrestamo.setLayout(this.gridaBagLayoutPrestamo);


		jComboBoxid_asiento_contablePrestamo= new JComboBoxMe();
		jComboBoxid_asiento_contablePrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contablePrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contablePrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contablePrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contablePrestamo= new JButtonMe();
		this.jButtonid_asiento_contablePrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contablePrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contablePrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contablePrestamo.setText("Buscar");
		this.jButtonid_asiento_contablePrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contablePrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contablePrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contablePrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contablePrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contablePrestamo"));

		this.jButtonid_asiento_contablePrestamoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contablePrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contablePrestamoBusqueda.setText("U");
		this.jButtonid_asiento_contablePrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contablePrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contablePrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contablePrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contablePrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contablePrestamoBusqueda"));

		if(this.prestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contablePrestamoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contablePrestamoUpdate= new JButtonMe();
		this.jButtonid_asiento_contablePrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contablePrestamoUpdate.setText("U");
		this.jButtonid_asiento_contablePrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contablePrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contablePrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contablePrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contablePrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contablePrestamoUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetallePrestamo = new PrestamoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Prestamo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPrestamo= new GridBagLayout();
		

		
		String sToolTipPrestamo="";
		sToolTipPrestamo=PrestamoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPrestamo+="(Nomina.Prestamo)";
		}
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPrestamo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPrestamo = new JButtonMe();
		this.jButtonModificarPrestamo = new JButtonMe();
        this.jButtonActualizarPrestamo = new JButtonMe();
        this.jButtonEliminarPrestamo = new JButtonMe();
        this.jButtonCancelarPrestamo = new JButtonMe();
        this.jButtonGuardarCambiosPrestamo = new JButtonMe();
		this.jButtonGuardarCambiosTablaPrestamo = new JButtonMe();
		this.jButtonCerrarPrestamo = new JButtonMe();
		
		this.jScrollPanelDatosPrestamo = new JScrollPane();   
        this.jScrollPanelDatosEdicionPrestamo = new JScrollPane();
		this.jScrollPanelDatosGeneralPrestamo = new JScrollPane();
				
		
		
		this.jPanelCamposPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Prestamo";
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prestamos" + this.sPath));
		} else {
			this.jScrollPanelDatosPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposPrestamo.setName("jPanelCamposPrestamo"); 

		this.jPanelCamposOcultosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPrestamo.setName("jPanelCamposOcultosPrestamo"); 

        this.jPanelAccionesPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesPrestamo.setName("Acciones"); 

		this.jPanelAccionesFormularioPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPrestamo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPrestamo.setText("Nuevo");
		this.jButtonModificarPrestamo.setText("Editar");
        this.jButtonActualizarPrestamo.setText("Actualizar");
        this.jButtonEliminarPrestamo.setText("Eliminar");
        this.jButtonCancelarPrestamo.setText("Cancelar");
        this.jButtonGuardarCambiosPrestamo.setText("Guardar");
		this.jButtonGuardarCambiosTablaPrestamo.setText("Guardar");
		this.jButtonCerrarPrestamo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPrestamo,"nuevo_button","Nuevo",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPrestamo,"modificar_button","Editar",this.prestamoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPrestamo,"actualizar_button","Actualizar",this.prestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPrestamo,"eliminar_button","Eliminar",this.prestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPrestamo,"cancelar_button","Cancelar",this.prestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPrestamo,"guardarcambios_button","Guardar",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPrestamo,"guardarcambiostabla_button","Guardar",this.prestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPrestamo,"cerrar_button","Salir",this.prestamoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPrestamo.setToolTipText("Nuevo"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPrestamo.setToolTipText("Editar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPrestamo.setToolTipText("Actualizar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPrestamo.setToolTipText("Eliminar)"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPrestamo.setToolTipText("Cancelar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPrestamo.setToolTipText("Guardar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPrestamo.setToolTipText("Guardar"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPrestamo.setToolTipText("Salir"+" "+PrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPrestamo";
		inputMap = this.jButtonNuevoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPrestamo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPrestamo";
		inputMap = this.jButtonActualizarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPrestamo"));
		
		//ELIMINAR
		sMapKey = "EliminarPrestamo";
		inputMap = this.jButtonEliminarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPrestamo"));
		
		//CANCELAR	
		sMapKey = "CancelarPrestamo";
		inputMap = this.jButtonCancelarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPrestamo"));
		
		//CERRAR		
		sMapKey = "CerrarPrestamo";
		inputMap = this.jButtonCerrarPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPrestamo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPrestamo";
		inputMap = this.jButtonGuardarCambiosTablaPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPrestamo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPrestamo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPrestamo.setToolTipText("Nuevo Prestamo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPrestamo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPrestamo.setToolTipText("Sin Cerrar Ventana Prestamo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePrestamo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePrestamo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePrestamo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPrestamo.setText("Accion");
		this.jComboBoxTiposAccionesPrestamo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPrestamo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPrestamo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPrestamo = new JLabelMe();
		
		this.jLabelAccionesPrestamo.setText("Acciones");		
		this.jLabelAccionesPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPrestamo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPrestamo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPrestamo=new JTabbedPane();
		this.jTabbedPaneRelacionesPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPrestamo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPrestamo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPrestamo = new GridBagLayout();
		
		this.jPanelCamposPrestamo.setLayout(gridaBagLayoutCamposPrestamo);
		this.jPanelCamposOcultosPrestamo.setLayout(gridaBagLayoutCamposOcultosPrestamo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPrestamo.add(jLabelIdPrestamo, this.gridBagConstraintsPrestamo);



	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPrestamo.add(jLabelidPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPrestamo.add(jLabelid_empresaPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPrestamo.add(jButtonid_empresaPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 3;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPrestamo.add(jButtonid_empresaPrestamoUpdate, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPrestamo.add(jComboBoxid_empresaPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPrestamo.add(jLabelid_empleadoPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 2;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPrestamo.add(jButtonid_empleadoPrestamo, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 3;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPrestamo.add(jButtonid_empleadoPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 4;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPrestamo.add(jButtonid_empleadoPrestamoUpdate, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPrestamo.add(jComboBoxid_empleadoPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_prestamoPrestamo.add(jLabelid_tipo_prestamoPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prestamoPrestamo.add(jButtonid_tipo_prestamoPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 3;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prestamoPrestamo.add(jButtonid_tipo_prestamoPrestamoUpdate, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_prestamoPrestamo.add(jComboBoxid_tipo_prestamoPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuotaPrestamo.add(jLabelid_tipo_cuotaPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuotaPrestamo.add(jButtonid_tipo_cuotaPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 3;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuotaPrestamo.add(jButtonid_tipo_cuotaPrestamoUpdate, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuotaPrestamo.add(jComboBoxid_tipo_cuotaPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contablePrestamo.add(jLabelid_asiento_contablePrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 2;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contablePrestamo.add(jButtonid_asiento_contablePrestamo, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 3;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contablePrestamo.add(jButtonid_asiento_contablePrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 4;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contablePrestamo.add(jButtonid_asiento_contablePrestamoUpdate, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contablePrestamo.add(jComboBoxid_asiento_contablePrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPrestamo.add(jLabelcodigoPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPrestamo.add(jButtoncodigoPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPrestamo.add(jTextFieldcodigoPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoPrestamo.add(jLabelnumero_pre_impresoPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoPrestamo.add(jButtonnumero_pre_impresoPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoPrestamo.add(jTextFieldnumero_pre_impresoPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPrestamo.add(jLabelfechaPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPrestamo.add(jButtonfechaPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPrestamo.add(jDateChooserfechaPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoPrestamo.add(jLabelmontoPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoPrestamo.add(jButtonmontoPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoPrestamo.add(jTextFieldmontoPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotasPrestamo.add(jLabelnumero_cuotasPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotasPrestamo.add(jButtonnumero_cuotasPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotasPrestamo.add(jTextFieldnumero_cuotasPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltasaPrestamo.add(jLabeltasaPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPaneltasaPrestamo.add(jButtontasaPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltasaPrestamo.add(jTextFieldtasaPrestamo, this.gridBagConstraintsPrestamo);


	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 0;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPrestamo.add(jLabeldescripcionPrestamo, this.gridBagConstraintsPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = 2;
		this.gridBagConstraintsPrestamo.ipadx = 0;
		this.gridBagConstraintsPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPrestamo.add(jButtondescripcionPrestamoBusqueda, this.gridBagConstraintsPrestamo);
	}

	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrestamo.gridy = 0;
	this.gridBagConstraintsPrestamo.gridx = 1;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPrestamo.add(jscrollPanedescripcionPrestamo, this.gridBagConstraintsPrestamo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelidPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelid_empleadoPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelid_tipo_prestamoPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelid_tipo_cuotaPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelid_asiento_contablePrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelcodigoPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelnumero_pre_impresoPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelfechaPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelmontoPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPanelnumero_cuotasPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPaneltasaPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrestamo.add(this.jPaneldescripcionPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposPrestamo % 2==0) {
		iXPanelCamposPrestamo=0;
		iYPanelCamposPrestamo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPrestamo = new GridBagConstraints();
	this.gridBagConstraintsPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrestamo.gridy = iYPanelCamposOcultosPrestamo;
	this.gridBagConstraintsPrestamo.gridx = iXPanelCamposOcultosPrestamo++;
	this.gridBagConstraintsPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPrestamo.add(this.jPanelid_empresaPrestamo, this.gridBagConstraintsPrestamo);



	if(iXPanelCamposOcultosPrestamo % 2==0) {
		iXPanelCamposOcultosPrestamo=0;
		iYPanelCamposOcultosPrestamo++;
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
			
		GridBagLayout gridaBagLayoutAccionesPrestamo= new GridBagLayout();
		this.jPanelAccionesPrestamo.setLayout(gridaBagLayoutAccionesPrestamo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPrestamo= new GridBagLayout();
		this.jPanelAccionesFormularioPrestamo.setLayout(gridaBagLayoutAccionesFormularioPrestamo);
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPrestamo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPrestamo.add(this.jComboBoxTiposAccionesFormularioPrestamo, this.gridBagConstraintsPrestamo);

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPrestamo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPrestamo.add(this.jCheckBoxPostAccionNuevoPrestamo, this.gridBagConstraintsPrestamo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPrestamo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPrestamo.add(this.jCheckBoxPostAccionSinCerrarPrestamo, this.gridBagConstraintsPrestamo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPrestamo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPrestamo.add(this.jCheckBoxPostAccionSinMensajePrestamo, this.gridBagConstraintsPrestamo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx = iPosXAccion++;
			
		this.jPanelAccionesPrestamo.add(this.jButtonModificarPrestamo, this.gridBagConstraintsPrestamo);							

		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrestamo.gridy = 0;
		this.gridBagConstraintsPrestamo.gridx =iPosXAccion++;
			
		this.jPanelAccionesPrestamo.add(this.jButtonEliminarPrestamo, this.gridBagConstraintsPrestamo);
		
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = 0;		
		this.gridBagConstraintsPrestamo.gridx = iPosXAccion++;
		
		this.jPanelAccionesPrestamo.add(this.jButtonActualizarPrestamo, this.gridBagConstraintsPrestamo);


		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = 0;		
		this.gridBagConstraintsPrestamo.gridx = iPosXAccion++;
		
		this.jPanelAccionesPrestamo.add(this.jButtonGuardarCambiosPrestamo, this.gridBagConstraintsPrestamo);	
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = 0;		
		this.gridBagConstraintsPrestamo.gridx =iPosXAccion++;
		
		this.jPanelAccionesPrestamo.add(this.jButtonCancelarPrestamo, this.gridBagConstraintsPrestamo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPrestamo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPrestamo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPrestamo = new GridBagConstraints();						
			this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrestamo.gridx = 0;		
			//this.gridBagConstraintsPrestamo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPrestamo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPrestamo.gridx =0;
		this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPrestamo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPrestamo, this.gridBagConstraintsPrestamo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PrestamoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePrestamo = new PrestamoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Prestamo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Prestamo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Prestamo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PrestamoModel prestamoModel=new PrestamoModel(this);
			
			//SI USARA CLASE INTERNA
			//PrestamoModel.PrestamoFocusTraversalPolicy prestamoFocusTraversalPolicy = prestamoModel.new PrestamoFocusTraversalPolicy(this);
			
			//prestamoFocusTraversalPolicy.setprestamoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(prestamoModel);
			
			
			this.jContentPaneDetallePrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePrestamo = new GridBagLayout();	
			this.jContentPaneDetallePrestamo.setLayout(gridaBagLayoutDetallePrestamo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPrestamo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPrestamo = new GridBagConstraints();
				this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPrestamo.gridx = 0;
					
				
				this.jContentPaneDetallePrestamo.add(jTtoolBarDetallePrestamo, gridBagConstraintsPrestamo);								
				
}
			
			this.jScrollPanelDatosEdicionPrestamo=   new JScrollPane(jContentPaneDetallePrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPrestamo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPrestamo.gridx = 0;
	        
			this.jContentPaneDetallePrestamo.add(jPanelCamposPrestamo, gridBagConstraintsPrestamo);
			
			
			
			
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
						&& prestamoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAbonoPrestamo(this.puedeCargarPorParteAbonoPrestamo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuota(this.puedeCargarPorParteCuota,false,-1);
					
					if(this.prestamoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPrestamo= new GridBagConstraints();
						this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPrestamo.gridx = 0;
						this.jContentPaneDetallePrestamo.add(this.jTabbedPaneRelacionesPrestamo, this.gridBagConstraintsPrestamo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPrestamo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAbonoPrestamo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuota(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPrestamo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPrestamo = new GridBagConstraints();
					this.gridBagConstraintsPrestamo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPrestamo.gridx = 0;
					
				
					this.jContentPaneDetallePrestamo.add(jPanelCamposOcultosPrestamo, gridBagConstraintsPrestamo);
				
					this.jPanelCamposOcultosPrestamo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsPrestamo.gridx = 0;
	        this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePrestamo.add(this.jPanelAccionesFormularioPrestamo, this.gridBagConstraintsPrestamo);							
			
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsPrestamo.gridx = 0;
	        
			
			this.jContentPaneDetallePrestamo.add(this.jPanelAccionesPrestamo, this.gridBagConstraintsPrestamo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPrestamo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPrestamo=   new JScrollPane(this.jPanelCamposPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPrestamo.gridx = 0;
			this.gridBagConstraintsPrestamo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPrestamo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPrestamo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPrestamo, this.gridBagConstraintsPrestamo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPrestamo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPrestamo, this.gridBagConstraintsPrestamo);			
			
			this.gridBagConstraintsPrestamo = new GridBagConstraints();
			this.gridBagConstraintsPrestamo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPrestamo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPrestamo, this.gridBagConstraintsPrestamo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPrestamo, this.gridBagConstraintsPrestamo);
			
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPrestamo, this.gridBagConstraintsPrestamo);
		
			
		this.gridBagConstraintsPrestamo = new GridBagConstraints();
		this.gridBagConstraintsPrestamo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPrestamo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPrestamo, this.gridBagConstraintsPrestamo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPrestamo;//jContentPane;
		
		return jScrollPanelDatosEdicionPrestamo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAbonoPrestamo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		this.abonoprestamoSessionBean.setConGuardarRelaciones(false);
		this.abonoprestamoSessionBean.setEsGuardarRelacionado(true);

		this.abonoprestamoBeanSwingJInternalFrame=null;//new AbonoPrestamoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.abonoprestamoBeanSwingJInternalFramePopup=new AbonoPrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.abonoprestamoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {

				AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AbonoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.abonoprestamoSessionBean.setEsGuardarRelacionado(true);

				this.abonoprestamoBeanSwingJInternalFrame=new AbonoPrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.abonoprestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.abonoprestamoBeanSwingJInternalFrame.setabonoprestamoSessionBean(this.abonoprestamoSessionBean);

				//this.gridBagConstraintsPrestamo = new GridBagConstraints();
				//this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPrestamo.gridx = 0;
				//this.jContentPaneDetallePrestamo.add(this.abonoprestamoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPrestamo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPrestamo.add("Abono Prestamos",this.abonoprestamoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPrestamo.setComponentAt(iIndexTab,this.abonoprestamoBeanSwingJInternalFrame.getContentPane());
				}

				//AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.abonoprestamoSessionBean.setEsGuardarRelacionado(false);
				this.abonoprestamoBeanSwingJInternalFrame=null;//new AbonoPrestamoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAbonoPrestamo) {
					this.jTabbedPaneRelacionesPrestamo.add("Abono Prestamos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCuota(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuotaSessionBean=new CuotaSessionBean();
		this.cuotaSessionBean.setConGuardarRelaciones(false);
		this.cuotaSessionBean.setEsGuardarRelacionado(true);

		this.cuotaBeanSwingJInternalFrame=null;//new CuotaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuotaBeanSwingJInternalFramePopup=new CuotaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuotaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {

				CuotaJInternalFrame.STIPO_TAMANIO_GENERAL=PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuotaSessionBean.setEsGuardarRelacionado(true);

				this.cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuotaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuotaBeanSwingJInternalFrame.setcuotaSessionBean(this.cuotaSessionBean);

				//this.gridBagConstraintsPrestamo = new GridBagConstraints();
				//this.gridBagConstraintsPrestamo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPrestamo.gridx = 0;
				//this.jContentPaneDetallePrestamo.add(this.cuotaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPrestamo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPrestamo.add("Cuotas",this.cuotaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPrestamo.setComponentAt(iIndexTab,this.cuotaBeanSwingJInternalFrame.getContentPane());
				}

				//CuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuotaSessionBean.setEsGuardarRelacionado(false);
				this.cuotaBeanSwingJInternalFrame=null;//new CuotaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuota) {
					this.jTabbedPaneRelacionesPrestamo.add("Cuotas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAbonoPrestamoBeanSwingJInternalFrame(List<Prestamo> prestamos,Prestamo prestamo,AbonoPrestamoBeanSwingJInternalFrame abonoprestamoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//abonoprestamoBeanSwingJInternalFrame=new AbonoPrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					abonoprestamoBeanSwingJInternalFrame.getAbonoPrestamoLogic().setConnexion(this.prestamoLogic.getConnexion());

					abonoprestamoBeanSwingJInternalFrame.setprestamosForeignKey(prestamos);
					abonoprestamoBeanSwingJInternalFrame.setprestamoForeignKey(prestamo);
					abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.setisBusquedaDesdeForeignKeySesionPrestamo(true);
					abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.setlidPrestamoActual(prestamo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					abonoprestamoBeanSwingJInternalFrame.cargarCombosForeignKeyAbonoPrestamo(abonoprestamoBeanSwingJInternalFrame.isCargarCombosDependencia);
					abonoprestamoBeanSwingJInternalFrame.setVisibilidadBusquedasParaPrestamo(true);
					abonoprestamoBeanSwingJInternalFrame.setid_prestamoFK_IdPrestamo(prestamo.getId());

					if(!this.conCargarFormDetalle) {
						abonoprestamoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					abonoprestamoBeanSwingJInternalFrame.setSelectedItemCombosFramePrestamoForeignKey(prestamo,1,false,true,true);
					abonoprestamoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					abonoprestamoBeanSwingJInternalFrame.procesarBusqueda("FK_IdPrestamo");
					abonoprestamoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPrestamo");
					abonoprestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAbonoPrestamo(true);
					abonoprestamoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAbonoPrestamo("n",abonoprestamoBeanSwingJInternalFrame.isGuardarCambiosEnLote, abonoprestamoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					abonoprestamoBeanSwingJInternalFrame.setAutoscrolls(true);
					abonoprestamoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						abonoprestamoBeanSwingJInternalFrame.actualizarEstadoPanelsAbonoPrestamo("relacionado");
					} else {
						abonoprestamoBeanSwingJInternalFrame.actualizarEstadoPanelsAbonoPrestamo("no_relacionado");
					}

					abonoprestamoBeanSwingJInternalFrame.getjButtonRecargarInformacionAbonoPrestamo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCuotaBeanSwingJInternalFrame(List<Prestamo> prestamos,Prestamo prestamo,CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuotaBeanSwingJInternalFrame.getCuotaLogic().setConnexion(this.prestamoLogic.getConnexion());

					cuotaBeanSwingJInternalFrame.setprestamosForeignKey(prestamos);
					cuotaBeanSwingJInternalFrame.setprestamoForeignKey(prestamo);
					cuotaBeanSwingJInternalFrame.cuotaSessionBean.setisBusquedaDesdeForeignKeySesionPrestamo(true);
					cuotaBeanSwingJInternalFrame.cuotaSessionBean.setlidPrestamoActual(prestamo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuotaBeanSwingJInternalFrame.cargarCombosForeignKeyCuota(cuotaBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuotaBeanSwingJInternalFrame.setVisibilidadBusquedasParaPrestamo(true);
					cuotaBeanSwingJInternalFrame.setid_prestamoFK_IdPrestamo(prestamo.getId());

					if(!this.conCargarFormDetalle) {
						cuotaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuotaBeanSwingJInternalFrame.setSelectedItemCombosFramePrestamoForeignKey(prestamo,1,false,true,true);
					cuotaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuotaBeanSwingJInternalFrame.procesarBusqueda("FK_IdPrestamo");
					cuotaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPrestamo");
					cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(true);
					cuotaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuota("n",cuotaBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuotaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuotaBeanSwingJInternalFrame.setAutoscrolls(true);
					cuotaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("relacionado");
					} else {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("no_relacionado");
					}

					cuotaBeanSwingJInternalFrame.getjButtonRecargarInformacionCuota().setVisible(false);

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
