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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.CreditosPendientesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class CreditosPendientesDetalleFormJInternalFrame extends CreditosPendientesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCreditosPendientes;
	
	protected JMenuBar jmenuBarDetalleCreditosPendientes;
	
	protected JMenu jmenuDetalleCreditosPendientes;
	protected JMenu jmenuDetalleArchivoCreditosPendientes;
	protected JMenu jmenuDetalleAccionesCreditosPendientes;
	protected JMenu jmenuDetalleDatosCreditosPendientes;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCreditosPendientes;	
	protected GridBagConstraints gridBagConstraintsCreditosPendientes;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CreditosPendientesBeanSwingJInternalFrameAdditional jInternalFrameDetalleCreditosPendientes;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public CreditosPendientesSessionBean creditospendientesSessionBean;
	
	
	
	
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public CreditosPendientesLogic creditospendientesLogic;
	
	public JScrollPane jScrollPanelDatosCreditosPendientes;
	public JScrollPane jScrollPanelDatosEdicionCreditosPendientes;
	public JScrollPane jScrollPanelDatosGeneralCreditosPendientes;
	
	protected JPanel jPanelCamposCreditosPendientes;    
	protected JPanel jPanelCamposOcultosCreditosPendientes;    	
	protected JPanel jPanelAccionesCreditosPendientes;
	protected JPanel jPanelAccionesFormularioCreditosPendientes;
    
	
	
	protected Integer iXPanelCamposCreditosPendientes=0;
	protected Integer iYPanelCamposCreditosPendientes=0;
	
	protected Integer iXPanelCamposOcultosCreditosPendientes=0;
	protected Integer iYPanelCamposOcultosCreditosPendientes=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCreditosPendientes;
	public JButton jButtonModificarCreditosPendientes;
	public JButton jButtonActualizarCreditosPendientes;
    public JButton jButtonEliminarCreditosPendientes;
	public JButton jButtonCancelarCreditosPendientes;
    public JButton jButtonGuardarCambiosCreditosPendientes;
	public JButton jButtonGuardarCambiosTablaCreditosPendientes;
	protected JButton jButtonCerrarCreditosPendientes;
	
	
	protected JButton jButtonProcesarInformacionCreditosPendientes;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCreditosPendientes;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCreditosPendientes;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCreditosPendientes;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCreditosPendientes;
	protected JButton jButtonModificarToolBarCreditosPendientes;
	protected JButton jButtonActualizarToolBarCreditosPendientes;
    protected JButton jButtonEliminarToolBarCreditosPendientes;
	protected JButton jButtonCancelarToolBarCreditosPendientes;
    protected JButton jButtonGuardarCambiosToolBarCreditosPendientes;
	protected JButton jButtonGuardarCambiosTablaToolBarCreditosPendientes;
	protected JButton jButtonMostrarOcultarTablaToolBarCreditosPendientes;
	protected JButton jButtonCerrarToolBarCreditosPendientes;
	
	protected JButton jButtonProcesarInformacionToolBarCreditosPendientes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCreditosPendientes;
	protected JMenuItem jMenuItemModificarCreditosPendientes;
	protected JMenuItem jMenuItemActualizarCreditosPendientes;
    protected JMenuItem jMenuItemEliminarCreditosPendientes;
	protected JMenuItem jMenuItemCancelarCreditosPendientes;
    protected JMenuItem jMenuItemGuardarCambiosCreditosPendientes;
	protected JMenuItem jMenuItemGuardarCambiosTablaCreditosPendientes;
	protected JMenuItem jMenuItemCerrarCreditosPendientes;
	protected JMenuItem jMenuItemDetalleCerrarCreditosPendientes;
	protected JMenuItem jMenuItemDetalleMostarOcultarCreditosPendientes;
	
	protected JMenuItem jMenuItemProcesarInformacionCreditosPendientes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCreditosPendientes;
	protected JMenuItem jMenuItemMostrarOcultarCreditosPendientes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCreditosPendientes;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCreditosPendientes;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCreditosPendientes;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCreditosPendientes;
	public JLabel jLabelIdCreditosPendientes;
	public JLabel jLabelidCreditosPendientes;
	public JButton jButtonidCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_desdeCreditosPendientes;
	public JLabel jLabelfecha_vencimiento_desdeCreditosPendientes;
	//public JFormattedTextField jDateChooserfecha_vencimiento_desdeCreditosPendientes;

	public JDateChooser jDateChooserfecha_vencimiento_desdeCreditosPendientes;
	public JButton jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_hastaCreditosPendientes;
	public JLabel jLabelfecha_vencimiento_hastaCreditosPendientes;
	//public JFormattedTextField jDateChooserfecha_vencimiento_hastaCreditosPendientes;

	public JDateChooser jDateChooserfecha_vencimiento_hastaCreditosPendientes;
	public JButton jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCreditosPendientes;
	public JLabel jLabelcodigoCreditosPendientes;
	public JTextField jTextFieldcodigoCreditosPendientes;
	public JButton jButtoncodigoCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCreditosPendientes;
	public JLabel jLabelnombre_completoCreditosPendientes;
	public JTextArea jTextAreanombre_completoCreditosPendientes;
	public JScrollPane jscrollPanenombre_completoCreditosPendientes;
	public JButton jButtonnombre_completoCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_prestamoCreditosPendientes;
	public JLabel jLabelcodigo_tipo_prestamoCreditosPendientes;
	public JTextField jTextFieldcodigo_tipo_prestamoCreditosPendientes;
	public JButton jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_prestamoCreditosPendientes;
	public JLabel jLabelcodigo_prestamoCreditosPendientes;
	public JTextField jTextFieldcodigo_prestamoCreditosPendientes;
	public JButton jButtoncodigo_prestamoCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelnumeroCreditosPendientes;
	public JLabel jLabelnumeroCreditosPendientes;
	public JTextField jTextFieldnumeroCreditosPendientes;
	public JButton jButtonnumeroCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelmonto_capitalCreditosPendientes;
	public JLabel jLabelmonto_capitalCreditosPendientes;
	public JTextField jTextFieldmonto_capitalCreditosPendientes;
	public JButton jButtonmonto_capitalCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelmonto_interesCreditosPendientes;
	public JLabel jLabelmonto_interesCreditosPendientes;
	public JTextField jTextFieldmonto_interesCreditosPendientes;
	public JButton jButtonmonto_interesCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelvalorCreditosPendientes;
	public JLabel jLabelvalorCreditosPendientes;
	public JTextField jTextFieldvalorCreditosPendientes;
	public JButton jButtonvalorCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelsaldoCreditosPendientes;
	public JLabel jLabelsaldoCreditosPendientes;
	public JTextField jTextFieldsaldoCreditosPendientes;
	public JButton jButtonsaldoCreditosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cargoCreditosPendientes;
	public JLabel jLabelid_cargoCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoCreditosPendientes;
	public JButton jButtonid_cargoCreditosPendientes= new JButtonMe();
	public JButton jButtonid_cargoCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_cargoCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraCreditosPendientes;
	public JLabel jLabelid_estructuraCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraCreditosPendientes;
	public JButton jButtonid_estructuraCreditosPendientes= new JButtonMe();
	public JButton jButtonid_estructuraCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCreditosPendientes;
	public JLabel jLabelid_empresaCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCreditosPendientes;
	public JButton jButtonid_empresaCreditosPendientes= new JButtonMe();
	public JButton jButtonid_empresaCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_empresaCreditosPendientesBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCreditosPendientes;
	public JLabel jLabelid_empleadoCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCreditosPendientes;
	public JButton jButtonid_empleadoCreditosPendientes= new JButtonMe();
	public JButton jButtonid_empleadoCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCreditosPendientesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCreditosPendientes;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CreditosPendientesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCreditosPendientes=new JPanel();
				this.jPanelAccionesFormularioCreditosPendientes=new JPanel();
				this.jmenuBarDetalleCreditosPendientes=new JMenuBar();
				this.jTtoolBarDetalleCreditosPendientes=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CreditosPendientesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCreditosPendientes() {
		return this.jButtonActualizarToolBarCreditosPendientes;
	}
	
	public JButton getjButtonEliminarToolBarCreditosPendientes() {
		return this.jButtonEliminarToolBarCreditosPendientes;
	}
	
	public JButton getjButtonCancelarToolBarCreditosPendientes() {
		return this.jButtonCancelarToolBarCreditosPendientes;
	}		
	
	public JButton getjButtonProcesarInformacionCreditosPendientes() {
		return this.jButtonProcesarInformacionCreditosPendientes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCreditosPendientes)	{
		this.jButtonProcesarInformacionCreditosPendientes = jButtonProcesarInformacionCreditosPendientes;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCreditosPendientes() {
		return this.jComboBoxTiposAccionesCreditosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCreditosPendientes(
			JComboBox jComboBoxTiposRelacionesCreditosPendientes) {
		this.jComboBoxTiposRelacionesCreditosPendientes = jComboBoxTiposRelacionesCreditosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCreditosPendientes(
			JComboBox jComboBoxTiposAccionesCreditosPendientes) {
		this.jComboBoxTiposAccionesCreditosPendientes = jComboBoxTiposAccionesCreditosPendientes;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCreditosPendientes() {
		return this.jComboBoxTiposAccionesFormularioCreditosPendientes;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCreditosPendientes(
			JComboBox jComboBoxTiposAccionesFormularioCreditosPendientes) {
		this.jComboBoxTiposAccionesFormularioCreditosPendientes = jComboBoxTiposAccionesFormularioCreditosPendientes;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
		
		this.creditospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.creditospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.creditospendientesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CreditosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CreditosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CreditosPendientesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Creditos Pendientes MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
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
	
		CreditosPendientesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCreditosPendientes= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCreditosPendientes=new JButtonMe();
				this.jButtonModificarToolBarCreditosPendientes=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCreditosPendientes,this.jTtoolBarDetalleCreditosPendientes,
							"actualizar","actualizar","Actualizar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCreditosPendientes,this.jTtoolBarDetalleCreditosPendientes,
							"eliminar","eliminar","Eliminar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCreditosPendientes,this.jTtoolBarDetalleCreditosPendientes,
							"cancelar","cancelar","Cancelar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCreditosPendientes,this.jTtoolBarDetalleCreditosPendientes,
							"guardarcambios","guardarcambios","Guardar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCreditosPendientes=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCreditosPendientes=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCreditosPendientes=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCreditosPendientes=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCreditosPendientes=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCreditosPendientes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCreditosPendientes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCreditosPendientes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCreditosPendientes= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCreditosPendientes.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCreditosPendientes,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCreditosPendientes= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCreditosPendientes.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCreditosPendientes,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCreditosPendientes= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCreditosPendientes.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCreditosPendientes,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCreditosPendientes= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCreditosPendientes.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCreditosPendientes,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCreditosPendientes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCreditosPendientes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCreditosPendientes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCreditosPendientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCreditosPendientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCreditosPendientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCreditosPendientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCreditosPendientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCreditosPendientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCreditosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCreditosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCreditosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCreditosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCreditosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCreditosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCreditosPendientes.add(this.jMenuItemDetalleCerrarCreditosPendientes);
		
		this.jmenuDetalleAccionesCreditosPendientes.add(this.jMenuItemActualizarCreditosPendientes);
		this.jmenuDetalleAccionesCreditosPendientes.add(this.jMenuItemEliminarCreditosPendientes);
		this.jmenuDetalleAccionesCreditosPendientes.add(this.jMenuItemCancelarCreditosPendientes);		
		
		//this.jmenuDetalleDatosCreditosPendientes.add(this.jMenuItemDetalleAbrirOrderByCreditosPendientes);				
		this.jmenuDetalleDatosCreditosPendientes.add(this.jMenuItemDetalleMostarOcultarCreditosPendientes);				
				
		//this.jmenuDetalleAccionesCreditosPendientes.add(this.jMenuItemGuardarCambiosCreditosPendientes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCreditosPendientes.add(this.jmenuDetalleArchivoCreditosPendientes);		
		this.jmenuBarDetalleCreditosPendientes.add(this.jmenuDetalleAccionesCreditosPendientes);		
		this.jmenuBarDetalleCreditosPendientes.add(this.jmenuDetalleDatosCreditosPendientes);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCreditosPendientes);				
	}
	
	
	public void inicializarElementosCamposCreditosPendientes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCreditosPendientes = new JLabelMe();
		jLabelIdCreditosPendientes.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCreditosPendientes = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCreditosPendientes= new GridBagLayout();

		this.jPanelidCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);

		jLabelidCreditosPendientes = new JLabel();
		jLabelidCreditosPendientes.setText("Id");

		jLabelidCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_vencimiento_desdeCreditosPendientes = new JLabelMe();
		this.jLabelfecha_vencimiento_desdeCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE+" : *");
		this.jLabelfecha_vencimiento_desdeCreditosPendientes.setToolTipText("Fecha Vencimiento Desde");
		this.jLabelfecha_vencimiento_desdeCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_desdeCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_desdeCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_desdeCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_desdeCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_desdeCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelfecha_vencimiento_desdeCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		//jFormattedTextFieldfecha_vencimiento_desdeCreditosPendientes= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_desdeCreditosPendientes= new JDateChooser();
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.setEnabled(false);
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_desdeCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.setDate(new Date());
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_desdeCreditosPendientes.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setText("U");
		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_desdeCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_desdeCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimiento_hastaCreditosPendientes = new JLabelMe();
		this.jLabelfecha_vencimiento_hastaCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA+" : *");
		this.jLabelfecha_vencimiento_hastaCreditosPendientes.setToolTipText("Fecha Vencimiento Hasta");
		this.jLabelfecha_vencimiento_hastaCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_hastaCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_hastaCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_hastaCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_hastaCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_hastaCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelfecha_vencimiento_hastaCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		//jFormattedTextFieldfecha_vencimiento_hastaCreditosPendientes= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_hastaCreditosPendientes= new JDateChooser();
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.setEnabled(false);
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_hastaCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.setDate(new Date());
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_hastaCreditosPendientes.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setText("U");
		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_hastaCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_hastaCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCreditosPendientes = new JLabelMe();
		this.jLabelcodigoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCreditosPendientes.setToolTipText("Codigo");
		this.jLabelcodigoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelcodigoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldcodigoCreditosPendientes= new JTextFieldMe();

		jTextFieldcodigoCreditosPendientes.setEnabled(false);
		jTextFieldcodigoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtoncodigoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCreditosPendientesBusqueda.setText("U");
		this.jButtoncodigoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCreditosPendientes = new JLabelMe();
		this.jLabelnombre_completoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCreditosPendientes.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelnombre_completoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextAreanombre_completoCreditosPendientes= new JTextAreaMe();
		jTextAreanombre_completoCreditosPendientes.setEnabled(false);
		jTextAreanombre_completoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCreditosPendientes.setLineWrap(true);
		jTextAreanombre_completoCreditosPendientes.setWrapStyleWord(true);
		jTextAreanombre_completoCreditosPendientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCreditosPendientes.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCreditosPendientes = new JScrollPane(jTextAreanombre_completoCreditosPendientes);
		jscrollPanenombre_completoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonnombre_completoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCreditosPendientesBusqueda.setText("U");
		this.jButtonnombre_completoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_prestamoCreditosPendientes = new JLabelMe();
		this.jLabelcodigo_tipo_prestamoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO+" : *");
		this.jLabelcodigo_tipo_prestamoCreditosPendientes.setToolTipText("Codigo Tipo Prestamo");
		this.jLabelcodigo_tipo_prestamoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_prestamoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_prestamoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_prestamoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_prestamoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_prestamoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelcodigo_tipo_prestamoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldcodigo_tipo_prestamoCreditosPendientes= new JTextFieldMe();

		jTextFieldcodigo_tipo_prestamoCreditosPendientes.setEnabled(false);
		jTextFieldcodigo_tipo_prestamoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_prestamoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_prestamoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_prestamoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setText("U");
		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_prestamoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_prestamoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_prestamoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_prestamoCreditosPendientes = new JLabelMe();
		this.jLabelcodigo_prestamoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO+" : *");
		this.jLabelcodigo_prestamoCreditosPendientes.setToolTipText("Codigo Prestamo");
		this.jLabelcodigo_prestamoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_prestamoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_prestamoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_prestamoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_prestamoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_prestamoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelcodigo_prestamoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldcodigo_prestamoCreditosPendientes= new JTextFieldMe();

		jTextFieldcodigo_prestamoCreditosPendientes.setEnabled(false);
		jTextFieldcodigo_prestamoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_prestamoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_prestamoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_prestamoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_prestamoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setText("U");
		this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_prestamoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_prestamoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_prestamoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_prestamoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_prestamoCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelnumeroCreditosPendientes = new JLabelMe();
		this.jLabelnumeroCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroCreditosPendientes.setToolTipText("Numero");
		this.jLabelnumeroCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelnumeroCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldnumeroCreditosPendientes= new JTextFieldMe();
		jTextFieldnumeroCreditosPendientes.setEnabled(false);
		jTextFieldnumeroCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeroCreditosPendientes.setText("0");

		this.jButtonnumeroCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonnumeroCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroCreditosPendientesBusqueda.setText("U");
		this.jButtonnumeroCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelmonto_capitalCreditosPendientes = new JLabelMe();
		this.jLabelmonto_capitalCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL+" : *");
		this.jLabelmonto_capitalCreditosPendientes.setToolTipText("Monto Capital");
		this.jLabelmonto_capitalCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_capitalCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_capitalCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_capitalCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_capitalCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_capitalCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelmonto_capitalCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldmonto_capitalCreditosPendientes= new JTextFieldMe();
		jTextFieldmonto_capitalCreditosPendientes.setEnabled(false);
		jTextFieldmonto_capitalCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_capitalCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_capitalCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_capitalCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_capitalCreditosPendientes.setText("0.0");

		this.jButtonmonto_capitalCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonmonto_capitalCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_capitalCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_capitalCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_capitalCreditosPendientesBusqueda.setText("U");
		this.jButtonmonto_capitalCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_capitalCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_capitalCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_capitalCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_capitalCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_capitalCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_capitalCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelmonto_interesCreditosPendientes = new JLabelMe();
		this.jLabelmonto_interesCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES+" : *");
		this.jLabelmonto_interesCreditosPendientes.setToolTipText("Monto Interes");
		this.jLabelmonto_interesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_interesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_interesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_interesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_interesCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_interesCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelmonto_interesCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldmonto_interesCreditosPendientes= new JTextFieldMe();
		jTextFieldmonto_interesCreditosPendientes.setEnabled(false);
		jTextFieldmonto_interesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_interesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_interesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_interesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_interesCreditosPendientes.setText("0.0");

		this.jButtonmonto_interesCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonmonto_interesCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_interesCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_interesCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_interesCreditosPendientesBusqueda.setText("U");
		this.jButtonmonto_interesCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_interesCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_interesCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_interesCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_interesCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_interesCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_interesCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelvalorCreditosPendientes = new JLabelMe();
		this.jLabelvalorCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCreditosPendientes.setToolTipText("Valor");
		this.jLabelvalorCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelvalorCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldvalorCreditosPendientes= new JTextFieldMe();
		jTextFieldvalorCreditosPendientes.setEnabled(false);
		jTextFieldvalorCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCreditosPendientes.setText("0.0");

		this.jButtonvalorCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonvalorCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCreditosPendientesBusqueda.setText("U");
		this.jButtonvalorCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCreditosPendientesBusqueda.setVisible(false);		}


					
		this.jLabelsaldoCreditosPendientes = new JLabelMe();
		this.jLabelsaldoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoCreditosPendientes.setToolTipText("Saldo");
		this.jLabelsaldoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelsaldoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jTextFieldsaldoCreditosPendientes= new JTextFieldMe();
		jTextFieldsaldoCreditosPendientes.setEnabled(false);
		jTextFieldsaldoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoCreditosPendientes.setText("0.0");

		this.jButtonsaldoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonsaldoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoCreditosPendientesBusqueda.setText("U");
		this.jButtonsaldoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoCreditosPendientesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCreditosPendientes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_cargoCreditosPendientes = new JLabelMe();
		this.jLabelid_cargoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_IDCARGO+" : *");
		this.jLabelid_cargoCreditosPendientes.setToolTipText("Cargo");
		this.jLabelid_cargoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_IDCARGO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelid_cargoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jComboBoxid_cargoCreditosPendientes= new JComboBoxMe();
		jComboBoxid_cargoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargoCreditosPendientes= new JButtonMe();
		this.jButtonid_cargoCreditosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCreditosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCreditosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCreditosPendientes.setText("Buscar");
		this.jButtonid_cargoCreditosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargoCreditosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCreditosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCreditosPendientes"));

		this.jButtonid_cargoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonid_cargoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoCreditosPendientesBusqueda.setText("U");
		this.jButtonid_cargoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargoCreditosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_cargoCreditosPendientesUpdate= new JButtonMe();
		this.jButtonid_cargoCreditosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoCreditosPendientesUpdate.setText("U");
		this.jButtonid_cargoCreditosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargoCreditosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCreditosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCreditosPendientesUpdate"));



					
		this.jLabelid_estructuraCreditosPendientes = new JLabelMe();
		this.jLabelid_estructuraCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraCreditosPendientes.setToolTipText("Estructura");
		this.jLabelid_estructuraCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelid_estructuraCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jComboBoxid_estructuraCreditosPendientes= new JComboBoxMe();
		jComboBoxid_estructuraCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraCreditosPendientes= new JButtonMe();
		this.jButtonid_estructuraCreditosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCreditosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCreditosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCreditosPendientes.setText("Buscar");
		this.jButtonid_estructuraCreditosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraCreditosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCreditosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCreditosPendientes"));

		this.jButtonid_estructuraCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonid_estructuraCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCreditosPendientesBusqueda.setText("U");
		this.jButtonid_estructuraCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraCreditosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_estructuraCreditosPendientesUpdate= new JButtonMe();
		this.jButtonid_estructuraCreditosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCreditosPendientesUpdate.setText("U");
		this.jButtonid_estructuraCreditosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraCreditosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCreditosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCreditosPendientesUpdate"));



					
		this.jLabelid_empresaCreditosPendientes = new JLabelMe();
		this.jLabelid_empresaCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCreditosPendientes.setToolTipText("Empresa");
		this.jLabelid_empresaCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelid_empresaCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jComboBoxid_empresaCreditosPendientes= new JComboBoxMe();
		jComboBoxid_empresaCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCreditosPendientes.setEnabled(false);

		this.jButtonid_empresaCreditosPendientes= new JButtonMe();
		this.jButtonid_empresaCreditosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCreditosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCreditosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCreditosPendientes.setText("Buscar");
		this.jButtonid_empresaCreditosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCreditosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCreditosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCreditosPendientes"));

		this.jButtonid_empresaCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonid_empresaCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCreditosPendientesBusqueda.setText("U");
		this.jButtonid_empresaCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCreditosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_empresaCreditosPendientesUpdate= new JButtonMe();
		this.jButtonid_empresaCreditosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCreditosPendientesUpdate.setText("U");
		this.jButtonid_empresaCreditosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCreditosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCreditosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCreditosPendientesUpdate"));



					
		this.jLabelid_empleadoCreditosPendientes = new JLabelMe();
		this.jLabelid_empleadoCreditosPendientes.setText(""+CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCreditosPendientes.setToolTipText("Empleado");
		this.jLabelid_empleadoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCreditosPendientes.setToolTipText(CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCreditosPendientes = new GridBagLayout();
		this.jPanelid_empleadoCreditosPendientes.setLayout(this.gridaBagLayoutCreditosPendientes);


		jComboBoxid_empleadoCreditosPendientes= new JComboBoxMe();
		jComboBoxid_empleadoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCreditosPendientes= new JButtonMe();
		this.jButtonid_empleadoCreditosPendientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCreditosPendientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCreditosPendientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCreditosPendientes.setText("Buscar");
		this.jButtonid_empleadoCreditosPendientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCreditosPendientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCreditosPendientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCreditosPendientes"));

		this.jButtonid_empleadoCreditosPendientesBusqueda= new JButtonMe();
		this.jButtonid_empleadoCreditosPendientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosPendientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosPendientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCreditosPendientesBusqueda.setText("U");
		this.jButtonid_empleadoCreditosPendientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCreditosPendientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCreditosPendientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCreditosPendientesBusqueda"));

		if(this.creditospendientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCreditosPendientesBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCreditosPendientesUpdate= new JButtonMe();
		this.jButtonid_empleadoCreditosPendientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosPendientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosPendientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCreditosPendientesUpdate.setText("U");
		this.jButtonid_empleadoCreditosPendientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCreditosPendientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCreditosPendientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCreditosPendientesUpdate"));



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
		//this.jInternalFrameDetalleCreditosPendientes = new CreditosPendientesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Creditos Pendientes DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCreditosPendientes= new GridBagLayout();
		

		
		String sToolTipCreditosPendientes="";
		sToolTipCreditosPendientes=CreditosPendientesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCreditosPendientes+="(Nomina.CreditosPendientes)";
		}
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			sToolTipCreditosPendientes+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCreditosPendientes = new JButtonMe();
		this.jButtonModificarCreditosPendientes = new JButtonMe();
        this.jButtonActualizarCreditosPendientes = new JButtonMe();
        this.jButtonEliminarCreditosPendientes = new JButtonMe();
        this.jButtonCancelarCreditosPendientes = new JButtonMe();
        this.jButtonGuardarCambiosCreditosPendientes = new JButtonMe();
		this.jButtonGuardarCambiosTablaCreditosPendientes = new JButtonMe();
		this.jButtonCerrarCreditosPendientes = new JButtonMe();
		
		this.jScrollPanelDatosCreditosPendientes = new JScrollPane();   
        this.jScrollPanelDatosEdicionCreditosPendientes = new JScrollPane();
		this.jScrollPanelDatosGeneralCreditosPendientes = new JScrollPane();
				
		
		
		this.jPanelCamposCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Creditos Pendientes";
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Pendienteses" + this.sPath));
		} else {
			this.jScrollPanelDatosCreditosPendientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCreditosPendientes.setName("jPanelCamposCreditosPendientes"); 

		this.jPanelCamposOcultosCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCreditosPendientes.setName("jPanelCamposOcultosCreditosPendientes"); 

        this.jPanelAccionesCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCreditosPendientes.setToolTipText("Acciones");
        this.jPanelAccionesCreditosPendientes.setName("Acciones"); 

		this.jPanelAccionesFormularioCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCreditosPendientes.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCreditosPendientes.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCreditosPendientes.setText("Nuevo");
		this.jButtonModificarCreditosPendientes.setText("Editar");
        this.jButtonActualizarCreditosPendientes.setText("Actualizar");
        this.jButtonEliminarCreditosPendientes.setText("Eliminar");
        this.jButtonCancelarCreditosPendientes.setText("Cancelar");
        this.jButtonGuardarCambiosCreditosPendientes.setText("Guardar");
		this.jButtonGuardarCambiosTablaCreditosPendientes.setText("Guardar");
		this.jButtonCerrarCreditosPendientes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCreditosPendientes,"nuevo_button","Nuevo",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCreditosPendientes,"modificar_button","Editar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCreditosPendientes,"actualizar_button","Actualizar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCreditosPendientes,"eliminar_button","Eliminar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCreditosPendientes,"cancelar_button","Cancelar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCreditosPendientes,"guardarcambios_button","Guardar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCreditosPendientes,"guardarcambiostabla_button","Guardar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCreditosPendientes,"cerrar_button","Salir",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCreditosPendientes.setToolTipText("Nuevo"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCreditosPendientes.setToolTipText("Editar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCreditosPendientes.setToolTipText("Actualizar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCreditosPendientes.setToolTipText("Eliminar)"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCreditosPendientes.setToolTipText("Cancelar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCreditosPendientes.setToolTipText("Guardar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCreditosPendientes.setToolTipText("Guardar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCreditosPendientes.setToolTipText("Salir"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCreditosPendientes";
		inputMap = this.jButtonNuevoCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCreditosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCreditosPendientes"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCreditosPendientes";
		inputMap = this.jButtonActualizarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCreditosPendientes"));
		
		//ELIMINAR
		sMapKey = "EliminarCreditosPendientes";
		inputMap = this.jButtonEliminarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCreditosPendientes"));
		
		//CANCELAR	
		sMapKey = "CancelarCreditosPendientes";
		inputMap = this.jButtonCancelarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCreditosPendientes"));
		
		//CERRAR		
		sMapKey = "CerrarCreditosPendientes";
		inputMap = this.jButtonCerrarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCreditosPendientes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCreditosPendientes";
		inputMap = this.jButtonGuardarCambiosTablaCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCreditosPendientes"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCreditosPendientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCreditosPendientes.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCreditosPendientes.setToolTipText("Nuevo CreditosPendientes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCreditosPendientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCreditosPendientes.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCreditosPendientes.setToolTipText("Sin Cerrar Ventana CreditosPendientes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCreditosPendientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCreditosPendientes.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCreditosPendientes.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCreditosPendientes.setText("Accion");
		this.jComboBoxTiposAccionesCreditosPendientes.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCreditosPendientes.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCreditosPendientes.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCreditosPendientes = new JLabelMe();
		
		this.jLabelAccionesCreditosPendientes.setText("Acciones");		
		this.jLabelAccionesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCreditosPendientes();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCreditosPendientes();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCreditosPendientes=new JTabbedPane();
		this.jTabbedPaneRelacionesCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCreditosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCreditosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCreditosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCreditosPendientes.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCreditosPendientes = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCreditosPendientes = new GridBagLayout();
		
		this.jPanelCamposCreditosPendientes.setLayout(gridaBagLayoutCamposCreditosPendientes);
		this.jPanelCamposOcultosCreditosPendientes.setLayout(gridaBagLayoutCamposOcultosCreditosPendientes);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCreditosPendientes.add(jLabelIdCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCreditosPendientes.add(jLabelidCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargoCreditosPendientes.add(jLabelid_cargoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoCreditosPendientes.add(jButtonid_cargoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 3;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoCreditosPendientes.add(jButtonid_cargoCreditosPendientesUpdate, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargoCreditosPendientes.add(jComboBoxid_cargoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraCreditosPendientes.add(jLabelid_estructuraCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCreditosPendientes.add(jButtonid_estructuraCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 3;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCreditosPendientes.add(jButtonid_estructuraCreditosPendientesUpdate, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraCreditosPendientes.add(jComboBoxid_estructuraCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCreditosPendientes.add(jLabelid_empresaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCreditosPendientes.add(jButtonid_empresaCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 3;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCreditosPendientes.add(jButtonid_empresaCreditosPendientesUpdate, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCreditosPendientes.add(jComboBoxid_empresaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCreditosPendientes.add(jLabelid_empleadoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCreditosPendientes.add(jButtonid_empleadoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 3;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCreditosPendientes.add(jButtonid_empleadoCreditosPendientesUpdate, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCreditosPendientes.add(jComboBoxid_empleadoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_desdeCreditosPendientes.add(jLabelfecha_vencimiento_desdeCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_desdeCreditosPendientes.add(jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_desdeCreditosPendientes.add(jDateChooserfecha_vencimiento_desdeCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_hastaCreditosPendientes.add(jLabelfecha_vencimiento_hastaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_hastaCreditosPendientes.add(jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_hastaCreditosPendientes.add(jDateChooserfecha_vencimiento_hastaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCreditosPendientes.add(jLabelcodigoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCreditosPendientes.add(jButtoncodigoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCreditosPendientes.add(jTextFieldcodigoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCreditosPendientes.add(jLabelnombre_completoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCreditosPendientes.add(jButtonnombre_completoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCreditosPendientes.add(jscrollPanenombre_completoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_prestamoCreditosPendientes.add(jLabelcodigo_tipo_prestamoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_prestamoCreditosPendientes.add(jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_prestamoCreditosPendientes.add(jTextFieldcodigo_tipo_prestamoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_prestamoCreditosPendientes.add(jLabelcodigo_prestamoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_prestamoCreditosPendientes.add(jButtoncodigo_prestamoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_prestamoCreditosPendientes.add(jTextFieldcodigo_prestamoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroCreditosPendientes.add(jLabelnumeroCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroCreditosPendientes.add(jButtonnumeroCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroCreditosPendientes.add(jTextFieldnumeroCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_capitalCreditosPendientes.add(jLabelmonto_capitalCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_capitalCreditosPendientes.add(jButtonmonto_capitalCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_capitalCreditosPendientes.add(jTextFieldmonto_capitalCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_interesCreditosPendientes.add(jLabelmonto_interesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_interesCreditosPendientes.add(jButtonmonto_interesCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_interesCreditosPendientes.add(jTextFieldmonto_interesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCreditosPendientes.add(jLabelvalorCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCreditosPendientes.add(jButtonvalorCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCreditosPendientes.add(jTextFieldvalorCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 0;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoCreditosPendientes.add(jLabelsaldoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 2;
		this.gridBagConstraintsCreditosPendientes.ipadx = 0;
		this.gridBagConstraintsCreditosPendientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoCreditosPendientes.add(jButtonsaldoCreditosPendientesBusqueda, this.gridBagConstraintsCreditosPendientes);
	}

	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosPendientes.gridy = 0;
	this.gridBagConstraintsCreditosPendientes.gridx = 1;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoCreditosPendientes.add(jTextFieldsaldoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelidCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelid_cargoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelid_estructuraCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelid_empleadoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelfecha_vencimiento_desdeCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelfecha_vencimiento_hastaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelcodigoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelnombre_completoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelcodigo_tipo_prestamoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelcodigo_prestamoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelnumeroCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelmonto_capitalCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelmonto_interesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelvalorCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosPendientes.add(this.jPanelsaldoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposCreditosPendientes % 2==0) {
		iXPanelCamposCreditosPendientes=0;
		iYPanelCamposCreditosPendientes++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosPendientes.gridy = iYPanelCamposOcultosCreditosPendientes;
	this.gridBagConstraintsCreditosPendientes.gridx = iXPanelCamposOcultosCreditosPendientes++;
	this.gridBagConstraintsCreditosPendientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosPendientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCreditosPendientes.add(this.jPanelid_empresaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);



	if(iXPanelCamposOcultosCreditosPendientes % 2==0) {
		iXPanelCamposOcultosCreditosPendientes=0;
		iYPanelCamposOcultosCreditosPendientes++;
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
			
		GridBagLayout gridaBagLayoutAccionesCreditosPendientes= new GridBagLayout();
		this.jPanelAccionesCreditosPendientes.setLayout(gridaBagLayoutAccionesCreditosPendientes);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCreditosPendientes= new GridBagLayout();
		this.jPanelAccionesFormularioCreditosPendientes.setLayout(gridaBagLayoutAccionesFormularioCreditosPendientes);
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCreditosPendientes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCreditosPendientes.add(this.jComboBoxTiposAccionesFormularioCreditosPendientes, this.gridBagConstraintsCreditosPendientes);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccion++;
			
		this.jPanelAccionesCreditosPendientes.add(this.jButtonModificarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);							

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx =iPosXAccion++;
			
		this.jPanelAccionesCreditosPendientes.add(this.jButtonEliminarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = 0;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccion++;
		
		this.jPanelAccionesCreditosPendientes.add(this.jButtonActualizarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = 0;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccion++;
		
		this.jPanelAccionesCreditosPendientes.add(this.jButtonGuardarCambiosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);	
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = 0;		
		this.gridBagConstraintsCreditosPendientes.gridx =iPosXAccion++;
		
		this.jPanelAccionesCreditosPendientes.add(this.jButtonCancelarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCreditosPendientes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCreditosPendientes);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();						
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCreditosPendientes.gridx = 0;		
			//this.gridBagConstraintsCreditosPendientes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCreditosPendientes.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCreditosPendientes.gridx =0;
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCreditosPendientes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCreditosPendientes = new CreditosPendientesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Creditos Pendientes DATOS");
			
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
			
	        //this.setTitle("[FOR] - Creditos Pendientes DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Creditos Pendientes Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CreditosPendientesModel creditospendientesModel=new CreditosPendientesModel(this);
			
			//SI USARA CLASE INTERNA
			//CreditosPendientesModel.CreditosPendientesFocusTraversalPolicy creditospendientesFocusTraversalPolicy = creditospendientesModel.new CreditosPendientesFocusTraversalPolicy(this);
			
			//creditospendientesFocusTraversalPolicy.setcreditospendientesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(creditospendientesModel);
			
			
			this.jContentPaneDetalleCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCreditosPendientes = new GridBagLayout();	
			this.jContentPaneDetalleCreditosPendientes.setLayout(gridaBagLayoutDetalleCreditosPendientes);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCreditosPendientes = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
				this.gridBagConstraintsCreditosPendientes.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCreditosPendientes.gridx = 0;
					
				
				this.jContentPaneDetalleCreditosPendientes.add(jTtoolBarDetalleCreditosPendientes, gridBagConstraintsCreditosPendientes);								
				
}
			
			this.jScrollPanelDatosEdicionCreditosPendientes=   new JScrollPane(jContentPaneDetalleCreditosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCreditosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCreditosPendientes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCreditosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCreditosPendientes.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCreditosPendientes.gridx = 0;
	        
			this.jContentPaneDetalleCreditosPendientes.add(jPanelCamposCreditosPendientes, gridBagConstraintsCreditosPendientes);
			
			
			
			
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
						//&& creditospendientesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCreditosPendientes= new GridBagConstraints();
						this.gridBagConstraintsCreditosPendientes.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCreditosPendientes.gridx = 0;
						this.jContentPaneDetalleCreditosPendientes.add(this.jTabbedPaneRelacionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCreditosPendientes.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCreditosPendientes.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
					this.gridBagConstraintsCreditosPendientes.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCreditosPendientes.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCreditosPendientes.gridx = 0;
					
				
					this.jContentPaneDetalleCreditosPendientes.add(jPanelCamposOcultosCreditosPendientes, gridBagConstraintsCreditosPendientes);
				
					this.jPanelCamposOcultosCreditosPendientes.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCreditosPendientes.gridx = 0;
	        this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCreditosPendientes.add(this.jPanelAccionesFormularioCreditosPendientes, this.gridBagConstraintsCreditosPendientes);							
			
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
	        this.gridBagConstraintsCreditosPendientes.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCreditosPendientes.gridx = 0;
	        
			
			this.jContentPaneDetalleCreditosPendientes.add(this.jPanelAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCreditosPendientes);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCreditosPendientes=   new JScrollPane(this.jPanelCamposCreditosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCreditosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCreditosPendientes.gridx = 0;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCreditosPendientes.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCreditosPendientes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCreditosPendientes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCreditosPendientes;//jContentPane;
		
		return jScrollPanelDatosEdicionCreditosPendientes;
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
