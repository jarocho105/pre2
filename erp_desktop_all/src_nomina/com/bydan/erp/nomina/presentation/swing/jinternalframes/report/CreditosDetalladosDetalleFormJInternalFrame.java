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
import com.bydan.erp.nomina.util.report.CreditosDetalladosConstantesFunciones;

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
public class CreditosDetalladosDetalleFormJInternalFrame extends CreditosDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCreditosDetallados;
	
	protected JMenuBar jmenuBarDetalleCreditosDetallados;
	
	protected JMenu jmenuDetalleCreditosDetallados;
	protected JMenu jmenuDetalleArchivoCreditosDetallados;
	protected JMenu jmenuDetalleAccionesCreditosDetallados;
	protected JMenu jmenuDetalleDatosCreditosDetallados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCreditosDetallados;	
	protected GridBagConstraints gridBagConstraintsCreditosDetallados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CreditosDetalladosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCreditosDetallados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprestamo="";
	
	public CreditosDetalladosSessionBean creditosdetalladosSessionBean;
	
	
	
	
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrestamoSessionBean tipoprestamoSessionBean;	
	
	public CreditosDetalladosLogic creditosdetalladosLogic;
	
	public JScrollPane jScrollPanelDatosCreditosDetallados;
	public JScrollPane jScrollPanelDatosEdicionCreditosDetallados;
	public JScrollPane jScrollPanelDatosGeneralCreditosDetallados;
	
	protected JPanel jPanelCamposCreditosDetallados;    
	protected JPanel jPanelCamposOcultosCreditosDetallados;    	
	protected JPanel jPanelAccionesCreditosDetallados;
	protected JPanel jPanelAccionesFormularioCreditosDetallados;
    
	
	
	protected Integer iXPanelCamposCreditosDetallados=0;
	protected Integer iYPanelCamposCreditosDetallados=0;
	
	protected Integer iXPanelCamposOcultosCreditosDetallados=0;
	protected Integer iYPanelCamposOcultosCreditosDetallados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCreditosDetallados;
	public JButton jButtonModificarCreditosDetallados;
	public JButton jButtonActualizarCreditosDetallados;
    public JButton jButtonEliminarCreditosDetallados;
	public JButton jButtonCancelarCreditosDetallados;
    public JButton jButtonGuardarCambiosCreditosDetallados;
	public JButton jButtonGuardarCambiosTablaCreditosDetallados;
	protected JButton jButtonCerrarCreditosDetallados;
	
	
	protected JButton jButtonProcesarInformacionCreditosDetallados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCreditosDetallados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCreditosDetallados;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCreditosDetallados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCreditosDetallados;
	protected JButton jButtonModificarToolBarCreditosDetallados;
	protected JButton jButtonActualizarToolBarCreditosDetallados;
    protected JButton jButtonEliminarToolBarCreditosDetallados;
	protected JButton jButtonCancelarToolBarCreditosDetallados;
    protected JButton jButtonGuardarCambiosToolBarCreditosDetallados;
	protected JButton jButtonGuardarCambiosTablaToolBarCreditosDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarCreditosDetallados;
	protected JButton jButtonCerrarToolBarCreditosDetallados;
	
	protected JButton jButtonProcesarInformacionToolBarCreditosDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCreditosDetallados;
	protected JMenuItem jMenuItemModificarCreditosDetallados;
	protected JMenuItem jMenuItemActualizarCreditosDetallados;
    protected JMenuItem jMenuItemEliminarCreditosDetallados;
	protected JMenuItem jMenuItemCancelarCreditosDetallados;
    protected JMenuItem jMenuItemGuardarCambiosCreditosDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaCreditosDetallados;
	protected JMenuItem jMenuItemCerrarCreditosDetallados;
	protected JMenuItem jMenuItemDetalleCerrarCreditosDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarCreditosDetallados;
	
	protected JMenuItem jMenuItemProcesarInformacionCreditosDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCreditosDetallados;
	protected JMenuItem jMenuItemMostrarOcultarCreditosDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCreditosDetallados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCreditosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCreditosDetallados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCreditosDetallados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCreditosDetallados;
	public JLabel jLabelIdCreditosDetallados;
	public JLabel jLabelidCreditosDetallados;
	public JButton jButtonidCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_desdeCreditosDetallados;
	public JLabel jLabelfecha_vencimiento_desdeCreditosDetallados;
	//public JFormattedTextField jDateChooserfecha_vencimiento_desdeCreditosDetallados;

	public JDateChooser jDateChooserfecha_vencimiento_desdeCreditosDetallados;
	public JButton jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_hastaCreditosDetallados;
	public JLabel jLabelfecha_vencimiento_hastaCreditosDetallados;
	//public JFormattedTextField jDateChooserfecha_vencimiento_hastaCreditosDetallados;

	public JDateChooser jDateChooserfecha_vencimiento_hastaCreditosDetallados;
	public JButton jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCreditosDetallados;
	public JLabel jLabelcodigoCreditosDetallados;
	public JTextField jTextFieldcodigoCreditosDetallados;
	public JButton jButtoncodigoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCreditosDetallados;
	public JLabel jLabelnombre_completoCreditosDetallados;
	public JTextArea jTextAreanombre_completoCreditosDetallados;
	public JScrollPane jscrollPanenombre_completoCreditosDetallados;
	public JButton jButtonnombre_completoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_prestamoCreditosDetallados;
	public JLabel jLabelcodigo_tipo_prestamoCreditosDetallados;
	public JTextField jTextFieldcodigo_tipo_prestamoCreditosDetallados;
	public JButton jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_prestamoCreditosDetallados;
	public JLabel jLabelcodigo_prestamoCreditosDetallados;
	public JTextField jTextFieldcodigo_prestamoCreditosDetallados;
	public JButton jButtoncodigo_prestamoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfechaCreditosDetallados;
	public JLabel jLabelfechaCreditosDetallados;
	//public JFormattedTextField jDateChooserfechaCreditosDetallados;

	public JDateChooser jDateChooserfechaCreditosDetallados;
	public JButton jButtonfechaCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelmontoCreditosDetallados;
	public JLabel jLabelmontoCreditosDetallados;
	public JTextField jTextFieldmontoCreditosDetallados;
	public JButton jButtonmontoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotasCreditosDetallados;
	public JLabel jLabelnumero_cuotasCreditosDetallados;
	public JTextField jTextFieldnumero_cuotasCreditosDetallados;
	public JButton jButtonnumero_cuotasCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnumeroCreditosDetallados;
	public JLabel jLabelnumeroCreditosDetallados;
	public JTextField jTextFieldnumeroCreditosDetallados;
	public JButton jButtonnumeroCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelmonto_capitalCreditosDetallados;
	public JLabel jLabelmonto_capitalCreditosDetallados;
	public JTextField jTextFieldmonto_capitalCreditosDetallados;
	public JButton jButtonmonto_capitalCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelmonto_interesCreditosDetallados;
	public JLabel jLabelmonto_interesCreditosDetallados;
	public JTextField jTextFieldmonto_interesCreditosDetallados;
	public JButton jButtonmonto_interesCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelvalorCreditosDetallados;
	public JLabel jLabelvalorCreditosDetallados;
	public JTextField jTextFieldvalorCreditosDetallados;
	public JButton jButtonvalorCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelsaldoCreditosDetallados;
	public JLabel jLabelsaldoCreditosDetallados;
	public JTextField jTextFieldsaldoCreditosDetallados;
	public JButton jButtonsaldoCreditosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cargoCreditosDetallados;
	public JLabel jLabelid_cargoCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoCreditosDetallados;
	public JButton jButtonid_cargoCreditosDetallados= new JButtonMe();
	public JButton jButtonid_cargoCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_cargoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraCreditosDetallados;
	public JLabel jLabelid_estructuraCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraCreditosDetallados;
	public JButton jButtonid_estructuraCreditosDetallados= new JButtonMe();
	public JButton jButtonid_estructuraCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_estructuraCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCreditosDetallados;
	public JLabel jLabelid_empresaCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCreditosDetallados;
	public JButton jButtonid_empresaCreditosDetallados= new JButtonMe();
	public JButton jButtonid_empresaCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCreditosDetallados;
	public JLabel jLabelid_empleadoCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCreditosDetallados;
	public JButton jButtonid_empleadoCreditosDetallados= new JButtonMe();
	public JButton jButtonid_empleadoCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCreditosDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_prestamoCreditosDetallados;
	public JLabel jLabelid_tipo_prestamoCreditosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prestamoCreditosDetallados;
	public JButton jButtonid_tipo_prestamoCreditosDetallados= new JButtonMe();
	public JButton jButtonid_tipo_prestamoCreditosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prestamoCreditosDetalladosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCreditosDetallados;
	
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
	public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CreditosDetalladosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCreditosDetallados=new JPanel();
				this.jPanelAccionesFormularioCreditosDetallados=new JPanel();
				this.jmenuBarDetalleCreditosDetallados=new JMenuBar();
				this.jTtoolBarDetalleCreditosDetallados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CreditosDetalladosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosDetalladosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CreditosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCreditosDetallados() {
		return this.jButtonActualizarToolBarCreditosDetallados;
	}
	
	public JButton getjButtonEliminarToolBarCreditosDetallados() {
		return this.jButtonEliminarToolBarCreditosDetallados;
	}
	
	public JButton getjButtonCancelarToolBarCreditosDetallados() {
		return this.jButtonCancelarToolBarCreditosDetallados;
	}		
	
	public JButton getjButtonProcesarInformacionCreditosDetallados() {
		return this.jButtonProcesarInformacionCreditosDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCreditosDetallados)	{
		this.jButtonProcesarInformacionCreditosDetallados = jButtonProcesarInformacionCreditosDetallados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCreditosDetallados() {
		return this.jComboBoxTiposAccionesCreditosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCreditosDetallados(
			JComboBox jComboBoxTiposRelacionesCreditosDetallados) {
		this.jComboBoxTiposRelacionesCreditosDetallados = jComboBoxTiposRelacionesCreditosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCreditosDetallados(
			JComboBox jComboBoxTiposAccionesCreditosDetallados) {
		this.jComboBoxTiposAccionesCreditosDetallados = jComboBoxTiposAccionesCreditosDetallados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCreditosDetallados() {
		return this.jComboBoxTiposAccionesFormularioCreditosDetallados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCreditosDetallados(
			JComboBox jComboBoxTiposAccionesFormularioCreditosDetallados) {
		this.jComboBoxTiposAccionesFormularioCreditosDetallados = jComboBoxTiposAccionesFormularioCreditosDetallados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
		
		this.creditosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.creditosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.creditosdetalladosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CreditosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CreditosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CreditosDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Creditos Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
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
	
		CreditosDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCreditosDetallados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCreditosDetallados=new JButtonMe();
				this.jButtonModificarToolBarCreditosDetallados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCreditosDetallados,this.jTtoolBarDetalleCreditosDetallados,
							"actualizar","actualizar","Actualizar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCreditosDetallados,this.jTtoolBarDetalleCreditosDetallados,
							"eliminar","eliminar","Eliminar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCreditosDetallados,this.jTtoolBarDetalleCreditosDetallados,
							"cancelar","cancelar","Cancelar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCreditosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCreditosDetallados,this.jTtoolBarDetalleCreditosDetallados,
							"guardarcambios","guardarcambios","Guardar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCreditosDetallados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCreditosDetallados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCreditosDetallados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCreditosDetallados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCreditosDetallados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCreditosDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCreditosDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCreditosDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCreditosDetallados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCreditosDetallados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCreditosDetallados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCreditosDetallados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCreditosDetallados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCreditosDetallados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCreditosDetallados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCreditosDetallados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCreditosDetallados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCreditosDetallados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCreditosDetallados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCreditosDetallados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCreditosDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCreditosDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCreditosDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCreditosDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCreditosDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCreditosDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCreditosDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCreditosDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCreditosDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCreditosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCreditosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCreditosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCreditosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCreditosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCreditosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCreditosDetallados.add(this.jMenuItemDetalleCerrarCreditosDetallados);
		
		this.jmenuDetalleAccionesCreditosDetallados.add(this.jMenuItemActualizarCreditosDetallados);
		this.jmenuDetalleAccionesCreditosDetallados.add(this.jMenuItemEliminarCreditosDetallados);
		this.jmenuDetalleAccionesCreditosDetallados.add(this.jMenuItemCancelarCreditosDetallados);		
		
		//this.jmenuDetalleDatosCreditosDetallados.add(this.jMenuItemDetalleAbrirOrderByCreditosDetallados);				
		this.jmenuDetalleDatosCreditosDetallados.add(this.jMenuItemDetalleMostarOcultarCreditosDetallados);				
				
		//this.jmenuDetalleAccionesCreditosDetallados.add(this.jMenuItemGuardarCambiosCreditosDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCreditosDetallados.add(this.jmenuDetalleArchivoCreditosDetallados);		
		this.jmenuBarDetalleCreditosDetallados.add(this.jmenuDetalleAccionesCreditosDetallados);		
		this.jmenuBarDetalleCreditosDetallados.add(this.jmenuDetalleDatosCreditosDetallados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCreditosDetallados);				
	}
	
	
	public void inicializarElementosCamposCreditosDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCreditosDetallados = new JLabelMe();
		jLabelIdCreditosDetallados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCreditosDetallados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCreditosDetallados= new GridBagLayout();

		this.jPanelidCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);

		jLabelidCreditosDetallados = new JLabel();
		jLabelidCreditosDetallados.setText("Id");

		jLabelidCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_vencimiento_desdeCreditosDetallados = new JLabelMe();
		this.jLabelfecha_vencimiento_desdeCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE+" : *");
		this.jLabelfecha_vencimiento_desdeCreditosDetallados.setToolTipText("Fecha Vencimiento Desde");
		this.jLabelfecha_vencimiento_desdeCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_desdeCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_desdeCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_desdeCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_desdeCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_desdeCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelfecha_vencimiento_desdeCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		//jFormattedTextFieldfecha_vencimiento_desdeCreditosDetallados= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_desdeCreditosDetallados= new JDateChooser();
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.setEnabled(false);
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_desdeCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.setDate(new Date());
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_desdeCreditosDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setText("U");
		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_desdeCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_desdeCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimiento_hastaCreditosDetallados = new JLabelMe();
		this.jLabelfecha_vencimiento_hastaCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA+" : *");
		this.jLabelfecha_vencimiento_hastaCreditosDetallados.setToolTipText("Fecha Vencimiento Hasta");
		this.jLabelfecha_vencimiento_hastaCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_hastaCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_hastaCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_hastaCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_hastaCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_hastaCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelfecha_vencimiento_hastaCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		//jFormattedTextFieldfecha_vencimiento_hastaCreditosDetallados= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_hastaCreditosDetallados= new JDateChooser();
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.setEnabled(false);
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_hastaCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.setDate(new Date());
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_hastaCreditosDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setText("U");
		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_hastaCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_hastaCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCreditosDetallados = new JLabelMe();
		this.jLabelcodigoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCreditosDetallados.setToolTipText("Codigo");
		this.jLabelcodigoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelcodigoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldcodigoCreditosDetallados= new JTextFieldMe();

		jTextFieldcodigoCreditosDetallados.setEnabled(false);
		jTextFieldcodigoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtoncodigoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCreditosDetalladosBusqueda.setText("U");
		this.jButtoncodigoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCreditosDetallados = new JLabelMe();
		this.jLabelnombre_completoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCreditosDetallados.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelnombre_completoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextAreanombre_completoCreditosDetallados= new JTextAreaMe();
		jTextAreanombre_completoCreditosDetallados.setEnabled(false);
		jTextAreanombre_completoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCreditosDetallados.setLineWrap(true);
		jTextAreanombre_completoCreditosDetallados.setWrapStyleWord(true);
		jTextAreanombre_completoCreditosDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCreditosDetallados.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCreditosDetallados = new JScrollPane(jTextAreanombre_completoCreditosDetallados);
		jscrollPanenombre_completoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_completoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCreditosDetalladosBusqueda.setText("U");
		this.jButtonnombre_completoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_prestamoCreditosDetallados = new JLabelMe();
		this.jLabelcodigo_tipo_prestamoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO+" : *");
		this.jLabelcodigo_tipo_prestamoCreditosDetallados.setToolTipText("Codigo Tipo Prestamo");
		this.jLabelcodigo_tipo_prestamoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_prestamoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_prestamoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_prestamoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_prestamoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_prestamoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelcodigo_tipo_prestamoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldcodigo_tipo_prestamoCreditosDetallados= new JTextFieldMe();

		jTextFieldcodigo_tipo_prestamoCreditosDetallados.setEnabled(false);
		jTextFieldcodigo_tipo_prestamoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_prestamoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_prestamoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_prestamoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setText("U");
		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_prestamoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_prestamoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_prestamoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_prestamoCreditosDetallados = new JLabelMe();
		this.jLabelcodigo_prestamoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO+" : *");
		this.jLabelcodigo_prestamoCreditosDetallados.setToolTipText("Codigo Prestamo");
		this.jLabelcodigo_prestamoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_prestamoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_prestamoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_prestamoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_prestamoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_prestamoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelcodigo_prestamoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldcodigo_prestamoCreditosDetallados= new JTextFieldMe();

		jTextFieldcodigo_prestamoCreditosDetallados.setEnabled(false);
		jTextFieldcodigo_prestamoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_prestamoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_prestamoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_prestamoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setText("U");
		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_prestamoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_prestamoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_prestamoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_prestamoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_prestamoCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelfechaCreditosDetallados = new JLabelMe();
		this.jLabelfechaCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCreditosDetallados.setToolTipText("Fecha");
		this.jLabelfechaCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelfechaCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		//jFormattedTextFieldfechaCreditosDetallados= new JFormattedTextFieldMe();

		jDateChooserfechaCreditosDetallados= new JDateChooser();
		jDateChooserfechaCreditosDetallados.setEnabled(false);
		jDateChooserfechaCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCreditosDetallados.setDate(new Date());
		jDateChooserfechaCreditosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCreditosDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonfechaCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCreditosDetalladosBusqueda.setText("U");
		this.jButtonfechaCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelmontoCreditosDetallados = new JLabelMe();
		this.jLabelmontoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoCreditosDetallados.setToolTipText("Monto");
		this.jLabelmontoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelmontoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldmontoCreditosDetallados= new JTextFieldMe();
		jTextFieldmontoCreditosDetallados.setEnabled(false);
		jTextFieldmontoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoCreditosDetallados.setText("0.0");

		this.jButtonmontoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonmontoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoCreditosDetalladosBusqueda.setText("U");
		this.jButtonmontoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuotasCreditosDetallados = new JLabelMe();
		this.jLabelnumero_cuotasCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS+" : *");
		this.jLabelnumero_cuotasCreditosDetallados.setToolTipText("Numero Cuotas");
		this.jLabelnumero_cuotasCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotasCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotasCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotasCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelnumero_cuotasCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldnumero_cuotasCreditosDetallados= new JTextFieldMe();
		jTextFieldnumero_cuotasCreditosDetallados.setEnabled(false);
		jTextFieldnumero_cuotasCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotasCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotasCreditosDetallados.setText("0");

		this.jButtonnumero_cuotasCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setText("U");
		this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotasCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotasCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotasCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotasCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotasCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnumeroCreditosDetallados = new JLabelMe();
		this.jLabelnumeroCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroCreditosDetallados.setToolTipText("Numero");
		this.jLabelnumeroCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelnumeroCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldnumeroCreditosDetallados= new JTextFieldMe();
		jTextFieldnumeroCreditosDetallados.setEnabled(false);
		jTextFieldnumeroCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeroCreditosDetallados.setText("0");

		this.jButtonnumeroCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonnumeroCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroCreditosDetalladosBusqueda.setText("U");
		this.jButtonnumeroCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelmonto_capitalCreditosDetallados = new JLabelMe();
		this.jLabelmonto_capitalCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL+" : *");
		this.jLabelmonto_capitalCreditosDetallados.setToolTipText("Monto Capital");
		this.jLabelmonto_capitalCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_capitalCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_capitalCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_capitalCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_capitalCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_capitalCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelmonto_capitalCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldmonto_capitalCreditosDetallados= new JTextFieldMe();
		jTextFieldmonto_capitalCreditosDetallados.setEnabled(false);
		jTextFieldmonto_capitalCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_capitalCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_capitalCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_capitalCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_capitalCreditosDetallados.setText("0.0");

		this.jButtonmonto_capitalCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonmonto_capitalCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_capitalCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_capitalCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_capitalCreditosDetalladosBusqueda.setText("U");
		this.jButtonmonto_capitalCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_capitalCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_capitalCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_capitalCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_capitalCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_capitalCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_capitalCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelmonto_interesCreditosDetallados = new JLabelMe();
		this.jLabelmonto_interesCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES+" : *");
		this.jLabelmonto_interesCreditosDetallados.setToolTipText("Monto Interes");
		this.jLabelmonto_interesCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_interesCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_interesCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_interesCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_interesCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_interesCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelmonto_interesCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldmonto_interesCreditosDetallados= new JTextFieldMe();
		jTextFieldmonto_interesCreditosDetallados.setEnabled(false);
		jTextFieldmonto_interesCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_interesCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_interesCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_interesCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_interesCreditosDetallados.setText("0.0");

		this.jButtonmonto_interesCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonmonto_interesCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_interesCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_interesCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_interesCreditosDetalladosBusqueda.setText("U");
		this.jButtonmonto_interesCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_interesCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_interesCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_interesCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_interesCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_interesCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_interesCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelvalorCreditosDetallados = new JLabelMe();
		this.jLabelvalorCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCreditosDetallados.setToolTipText("Valor");
		this.jLabelvalorCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelvalorCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldvalorCreditosDetallados= new JTextFieldMe();
		jTextFieldvalorCreditosDetallados.setEnabled(false);
		jTextFieldvalorCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCreditosDetallados.setText("0.0");

		this.jButtonvalorCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonvalorCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCreditosDetalladosBusqueda.setText("U");
		this.jButtonvalorCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCreditosDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelsaldoCreditosDetallados = new JLabelMe();
		this.jLabelsaldoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoCreditosDetallados.setToolTipText("Saldo");
		this.jLabelsaldoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelsaldoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jTextFieldsaldoCreditosDetallados= new JTextFieldMe();
		jTextFieldsaldoCreditosDetallados.setEnabled(false);
		jTextFieldsaldoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoCreditosDetallados.setText("0.0");

		this.jButtonsaldoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonsaldoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoCreditosDetalladosBusqueda.setText("U");
		this.jButtonsaldoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoCreditosDetalladosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCreditosDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_cargoCreditosDetallados = new JLabelMe();
		this.jLabelid_cargoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_IDCARGO+" : *");
		this.jLabelid_cargoCreditosDetallados.setToolTipText("Cargo");
		this.jLabelid_cargoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_IDCARGO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelid_cargoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jComboBoxid_cargoCreditosDetallados= new JComboBoxMe();
		jComboBoxid_cargoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargoCreditosDetallados= new JButtonMe();
		this.jButtonid_cargoCreditosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCreditosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCreditosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCreditosDetallados.setText("Buscar");
		this.jButtonid_cargoCreditosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargoCreditosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCreditosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCreditosDetallados"));

		this.jButtonid_cargoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_cargoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoCreditosDetalladosBusqueda.setText("U");
		this.jButtonid_cargoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargoCreditosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_cargoCreditosDetalladosUpdate= new JButtonMe();
		this.jButtonid_cargoCreditosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCreditosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoCreditosDetalladosUpdate.setText("U");
		this.jButtonid_cargoCreditosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargoCreditosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCreditosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCreditosDetalladosUpdate"));



					
		this.jLabelid_estructuraCreditosDetallados = new JLabelMe();
		this.jLabelid_estructuraCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraCreditosDetallados.setToolTipText("Estructura");
		this.jLabelid_estructuraCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelid_estructuraCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jComboBoxid_estructuraCreditosDetallados= new JComboBoxMe();
		jComboBoxid_estructuraCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraCreditosDetallados= new JButtonMe();
		this.jButtonid_estructuraCreditosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCreditosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCreditosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCreditosDetallados.setText("Buscar");
		this.jButtonid_estructuraCreditosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraCreditosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCreditosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCreditosDetallados"));

		this.jButtonid_estructuraCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_estructuraCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCreditosDetalladosBusqueda.setText("U");
		this.jButtonid_estructuraCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraCreditosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_estructuraCreditosDetalladosUpdate= new JButtonMe();
		this.jButtonid_estructuraCreditosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCreditosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCreditosDetalladosUpdate.setText("U");
		this.jButtonid_estructuraCreditosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraCreditosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCreditosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCreditosDetalladosUpdate"));



					
		this.jLabelid_empresaCreditosDetallados = new JLabelMe();
		this.jLabelid_empresaCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCreditosDetallados.setToolTipText("Empresa");
		this.jLabelid_empresaCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelid_empresaCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jComboBoxid_empresaCreditosDetallados= new JComboBoxMe();
		jComboBoxid_empresaCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCreditosDetallados.setEnabled(false);

		this.jButtonid_empresaCreditosDetallados= new JButtonMe();
		this.jButtonid_empresaCreditosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCreditosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCreditosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCreditosDetallados.setText("Buscar");
		this.jButtonid_empresaCreditosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCreditosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCreditosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCreditosDetallados"));

		this.jButtonid_empresaCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_empresaCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCreditosDetalladosBusqueda.setText("U");
		this.jButtonid_empresaCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCreditosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCreditosDetalladosUpdate= new JButtonMe();
		this.jButtonid_empresaCreditosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCreditosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCreditosDetalladosUpdate.setText("U");
		this.jButtonid_empresaCreditosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCreditosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCreditosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCreditosDetalladosUpdate"));



					
		this.jLabelid_empleadoCreditosDetallados = new JLabelMe();
		this.jLabelid_empleadoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCreditosDetallados.setToolTipText("Empleado");
		this.jLabelid_empleadoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelid_empleadoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jComboBoxid_empleadoCreditosDetallados= new JComboBoxMe();
		jComboBoxid_empleadoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCreditosDetallados= new JButtonMe();
		this.jButtonid_empleadoCreditosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCreditosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCreditosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCreditosDetallados.setText("Buscar");
		this.jButtonid_empleadoCreditosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCreditosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCreditosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCreditosDetallados"));

		this.jButtonid_empleadoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_empleadoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCreditosDetalladosBusqueda.setText("U");
		this.jButtonid_empleadoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCreditosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCreditosDetalladosUpdate= new JButtonMe();
		this.jButtonid_empleadoCreditosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCreditosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCreditosDetalladosUpdate.setText("U");
		this.jButtonid_empleadoCreditosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCreditosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCreditosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCreditosDetalladosUpdate"));



					
		this.jLabelid_tipo_prestamoCreditosDetallados = new JLabelMe();
		this.jLabelid_tipo_prestamoCreditosDetallados.setText(""+CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO+" : *");
		this.jLabelid_tipo_prestamoCreditosDetallados.setToolTipText("Tipo Prestamo");
		this.jLabelid_tipo_prestamoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_prestamoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_prestamoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prestamoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_prestamoCreditosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_prestamoCreditosDetallados.setToolTipText(CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO);
		this.gridaBagLayoutCreditosDetallados = new GridBagLayout();
		this.jPanelid_tipo_prestamoCreditosDetallados.setLayout(this.gridaBagLayoutCreditosDetallados);


		jComboBoxid_tipo_prestamoCreditosDetallados= new JComboBoxMe();
		jComboBoxid_tipo_prestamoCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prestamoCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prestamoCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_prestamoCreditosDetallados= new JButtonMe();
		this.jButtonid_tipo_prestamoCreditosDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prestamoCreditosDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prestamoCreditosDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prestamoCreditosDetallados.setText("Buscar");
		this.jButtonid_tipo_prestamoCreditosDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_prestamoCreditosDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prestamoCreditosDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_prestamoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prestamoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prestamoCreditosDetallados"));

		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda= new JButtonMe();
		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setText("U");
		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_prestamoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prestamoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prestamoCreditosDetalladosBusqueda"));

		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_prestamoCreditosDetalladosUpdate= new JButtonMe();
		this.jButtonid_tipo_prestamoCreditosDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoCreditosDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prestamoCreditosDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prestamoCreditosDetalladosUpdate.setText("U");
		this.jButtonid_tipo_prestamoCreditosDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_prestamoCreditosDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prestamoCreditosDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_prestamoCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prestamoCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prestamoCreditosDetalladosUpdate"));



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
		//this.jInternalFrameDetalleCreditosDetallados = new CreditosDetalladosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Creditos Detallados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCreditosDetallados= new GridBagLayout();
		

		
		String sToolTipCreditosDetallados="";
		sToolTipCreditosDetallados=CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCreditosDetallados+="(Nomina.CreditosDetallados)";
		}
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCreditosDetallados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCreditosDetallados = new JButtonMe();
		this.jButtonModificarCreditosDetallados = new JButtonMe();
        this.jButtonActualizarCreditosDetallados = new JButtonMe();
        this.jButtonEliminarCreditosDetallados = new JButtonMe();
        this.jButtonCancelarCreditosDetallados = new JButtonMe();
        this.jButtonGuardarCambiosCreditosDetallados = new JButtonMe();
		this.jButtonGuardarCambiosTablaCreditosDetallados = new JButtonMe();
		this.jButtonCerrarCreditosDetallados = new JButtonMe();
		
		this.jScrollPanelDatosCreditosDetallados = new JScrollPane();   
        this.jScrollPanelDatosEdicionCreditosDetallados = new JScrollPane();
		this.jScrollPanelDatosGeneralCreditosDetallados = new JScrollPane();
				
		
		
		this.jPanelCamposCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Creditos Detallados";
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCreditosDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCreditosDetallados.setName("jPanelCamposCreditosDetallados"); 

		this.jPanelCamposOcultosCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCreditosDetallados.setName("jPanelCamposOcultosCreditosDetallados"); 

        this.jPanelAccionesCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCreditosDetallados.setToolTipText("Acciones");
        this.jPanelAccionesCreditosDetallados.setName("Acciones"); 

		this.jPanelAccionesFormularioCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCreditosDetallados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCreditosDetallados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCreditosDetallados.setText("Nuevo");
		this.jButtonModificarCreditosDetallados.setText("Editar");
        this.jButtonActualizarCreditosDetallados.setText("Actualizar");
        this.jButtonEliminarCreditosDetallados.setText("Eliminar");
        this.jButtonCancelarCreditosDetallados.setText("Cancelar");
        this.jButtonGuardarCambiosCreditosDetallados.setText("Guardar");
		this.jButtonGuardarCambiosTablaCreditosDetallados.setText("Guardar");
		this.jButtonCerrarCreditosDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCreditosDetallados,"nuevo_button","Nuevo",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCreditosDetallados,"modificar_button","Editar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCreditosDetallados,"actualizar_button","Actualizar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCreditosDetallados,"eliminar_button","Eliminar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCreditosDetallados,"cancelar_button","Cancelar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCreditosDetallados,"guardarcambios_button","Guardar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCreditosDetallados,"guardarcambiostabla_button","Guardar",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCreditosDetallados,"cerrar_button","Salir",this.creditosdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCreditosDetallados.setToolTipText("Nuevo"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCreditosDetallados.setToolTipText("Editar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCreditosDetallados.setToolTipText("Actualizar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCreditosDetallados.setToolTipText("Eliminar)"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCreditosDetallados.setToolTipText("Cancelar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCreditosDetallados.setToolTipText("Guardar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCreditosDetallados.setToolTipText("Guardar"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCreditosDetallados.setToolTipText("Salir"+" "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCreditosDetallados";
		inputMap = this.jButtonNuevoCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCreditosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCreditosDetallados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCreditosDetallados";
		inputMap = this.jButtonActualizarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCreditosDetallados"));
		
		//ELIMINAR
		sMapKey = "EliminarCreditosDetallados";
		inputMap = this.jButtonEliminarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCreditosDetallados"));
		
		//CANCELAR	
		sMapKey = "CancelarCreditosDetallados";
		inputMap = this.jButtonCancelarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCreditosDetallados"));
		
		//CERRAR		
		sMapKey = "CerrarCreditosDetallados";
		inputMap = this.jButtonCerrarCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCreditosDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCreditosDetallados";
		inputMap = this.jButtonGuardarCambiosTablaCreditosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCreditosDetallados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCreditosDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCreditosDetallados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCreditosDetallados.setToolTipText("Nuevo CreditosDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCreditosDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCreditosDetallados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCreditosDetallados.setToolTipText("Sin Cerrar Ventana CreditosDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCreditosDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCreditosDetallados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCreditosDetallados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCreditosDetallados.setText("Accion");
		this.jComboBoxTiposAccionesCreditosDetallados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCreditosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCreditosDetallados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCreditosDetallados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCreditosDetallados = new JLabelMe();
		
		this.jLabelAccionesCreditosDetallados.setText("Acciones");		
		this.jLabelAccionesCreditosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCreditosDetallados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCreditosDetallados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCreditosDetallados=new JTabbedPane();
		this.jTabbedPaneRelacionesCreditosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCreditosDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCreditosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCreditosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCreditosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCreditosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCreditosDetallados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCreditosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCreditosDetallados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCreditosDetallados = new GridBagLayout();
		
		this.jPanelCamposCreditosDetallados.setLayout(gridaBagLayoutCamposCreditosDetallados);
		this.jPanelCamposOcultosCreditosDetallados.setLayout(gridaBagLayoutCamposOcultosCreditosDetallados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCreditosDetallados.add(jLabelIdCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCreditosDetallados.add(jLabelidCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargoCreditosDetallados.add(jLabelid_cargoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoCreditosDetallados.add(jButtonid_cargoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 3;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoCreditosDetallados.add(jButtonid_cargoCreditosDetalladosUpdate, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargoCreditosDetallados.add(jComboBoxid_cargoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraCreditosDetallados.add(jLabelid_estructuraCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCreditosDetallados.add(jButtonid_estructuraCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 3;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCreditosDetallados.add(jButtonid_estructuraCreditosDetalladosUpdate, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraCreditosDetallados.add(jComboBoxid_estructuraCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCreditosDetallados.add(jLabelid_empresaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCreditosDetallados.add(jButtonid_empresaCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 3;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCreditosDetallados.add(jButtonid_empresaCreditosDetalladosUpdate, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCreditosDetallados.add(jComboBoxid_empresaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCreditosDetallados.add(jLabelid_empleadoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCreditosDetallados.add(jButtonid_empleadoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 3;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCreditosDetallados.add(jButtonid_empleadoCreditosDetalladosUpdate, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCreditosDetallados.add(jComboBoxid_empleadoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_prestamoCreditosDetallados.add(jLabelid_tipo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prestamoCreditosDetallados.add(jButtonid_tipo_prestamoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 3;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prestamoCreditosDetallados.add(jButtonid_tipo_prestamoCreditosDetalladosUpdate, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_prestamoCreditosDetallados.add(jComboBoxid_tipo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_desdeCreditosDetallados.add(jLabelfecha_vencimiento_desdeCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_desdeCreditosDetallados.add(jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_desdeCreditosDetallados.add(jDateChooserfecha_vencimiento_desdeCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_hastaCreditosDetallados.add(jLabelfecha_vencimiento_hastaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_hastaCreditosDetallados.add(jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_hastaCreditosDetallados.add(jDateChooserfecha_vencimiento_hastaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCreditosDetallados.add(jLabelcodigoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCreditosDetallados.add(jButtoncodigoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCreditosDetallados.add(jTextFieldcodigoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCreditosDetallados.add(jLabelnombre_completoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCreditosDetallados.add(jButtonnombre_completoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCreditosDetallados.add(jscrollPanenombre_completoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_prestamoCreditosDetallados.add(jLabelcodigo_tipo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_prestamoCreditosDetallados.add(jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_prestamoCreditosDetallados.add(jTextFieldcodigo_tipo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_prestamoCreditosDetallados.add(jLabelcodigo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_prestamoCreditosDetallados.add(jButtoncodigo_prestamoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_prestamoCreditosDetallados.add(jTextFieldcodigo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCreditosDetallados.add(jLabelfechaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCreditosDetallados.add(jButtonfechaCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCreditosDetallados.add(jDateChooserfechaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoCreditosDetallados.add(jLabelmontoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoCreditosDetallados.add(jButtonmontoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoCreditosDetallados.add(jTextFieldmontoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotasCreditosDetallados.add(jLabelnumero_cuotasCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotasCreditosDetallados.add(jButtonnumero_cuotasCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotasCreditosDetallados.add(jTextFieldnumero_cuotasCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroCreditosDetallados.add(jLabelnumeroCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroCreditosDetallados.add(jButtonnumeroCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroCreditosDetallados.add(jTextFieldnumeroCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_capitalCreditosDetallados.add(jLabelmonto_capitalCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_capitalCreditosDetallados.add(jButtonmonto_capitalCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_capitalCreditosDetallados.add(jTextFieldmonto_capitalCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_interesCreditosDetallados.add(jLabelmonto_interesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_interesCreditosDetallados.add(jButtonmonto_interesCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_interesCreditosDetallados.add(jTextFieldmonto_interesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCreditosDetallados.add(jLabelvalorCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCreditosDetallados.add(jButtonvalorCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCreditosDetallados.add(jTextFieldvalorCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 0;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoCreditosDetallados.add(jLabelsaldoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = 2;
		this.gridBagConstraintsCreditosDetallados.ipadx = 0;
		this.gridBagConstraintsCreditosDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoCreditosDetallados.add(jButtonsaldoCreditosDetalladosBusqueda, this.gridBagConstraintsCreditosDetallados);
	}

	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCreditosDetallados.gridy = 0;
	this.gridBagConstraintsCreditosDetallados.gridx = 1;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoCreditosDetallados.add(jTextFieldsaldoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelidCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelid_cargoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelid_estructuraCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelid_empleadoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelid_tipo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelfecha_vencimiento_desdeCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelfecha_vencimiento_hastaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelcodigoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelnombre_completoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelcodigo_tipo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelcodigo_prestamoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelfechaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelmontoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelnumero_cuotasCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelnumeroCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelmonto_capitalCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelmonto_interesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelvalorCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCreditosDetallados.add(this.jPanelsaldoCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposCreditosDetallados % 2==0) {
		iXPanelCamposCreditosDetallados=0;
		iYPanelCamposCreditosDetallados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCreditosDetallados.gridy = iYPanelCamposOcultosCreditosDetallados;
	this.gridBagConstraintsCreditosDetallados.gridx = iXPanelCamposOcultosCreditosDetallados++;
	this.gridBagConstraintsCreditosDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCreditosDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCreditosDetallados.add(this.jPanelid_empresaCreditosDetallados, this.gridBagConstraintsCreditosDetallados);



	if(iXPanelCamposOcultosCreditosDetallados % 2==0) {
		iXPanelCamposOcultosCreditosDetallados=0;
		iYPanelCamposOcultosCreditosDetallados++;
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
			
		GridBagLayout gridaBagLayoutAccionesCreditosDetallados= new GridBagLayout();
		this.jPanelAccionesCreditosDetallados.setLayout(gridaBagLayoutAccionesCreditosDetallados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCreditosDetallados= new GridBagLayout();
		this.jPanelAccionesFormularioCreditosDetallados.setLayout(gridaBagLayoutAccionesFormularioCreditosDetallados);
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCreditosDetallados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCreditosDetallados.add(this.jComboBoxTiposAccionesFormularioCreditosDetallados, this.gridBagConstraintsCreditosDetallados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccion++;
			
		this.jPanelAccionesCreditosDetallados.add(this.jButtonModificarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);							

		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosDetallados.gridy = 0;
		this.gridBagConstraintsCreditosDetallados.gridx =iPosXAccion++;
			
		this.jPanelAccionesCreditosDetallados.add(this.jButtonEliminarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = 0;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesCreditosDetallados.add(this.jButtonActualizarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);


		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = 0;		
		this.gridBagConstraintsCreditosDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesCreditosDetallados.add(this.jButtonGuardarCambiosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);	
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = 0;		
		this.gridBagConstraintsCreditosDetallados.gridx =iPosXAccion++;
		
		this.jPanelAccionesCreditosDetallados.add(this.jButtonCancelarCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCreditosDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCreditosDetallados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();						
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCreditosDetallados.gridx = 0;		
			//this.gridBagConstraintsCreditosDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCreditosDetallados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCreditosDetallados.gridx =0;
		this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCreditosDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCreditosDetallados = new CreditosDetalladosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Creditos Detallados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Creditos Detallados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Creditos Detallados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CreditosDetalladosModel creditosdetalladosModel=new CreditosDetalladosModel(this);
			
			//SI USARA CLASE INTERNA
			//CreditosDetalladosModel.CreditosDetalladosFocusTraversalPolicy creditosdetalladosFocusTraversalPolicy = creditosdetalladosModel.new CreditosDetalladosFocusTraversalPolicy(this);
			
			//creditosdetalladosFocusTraversalPolicy.setcreditosdetalladosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(creditosdetalladosModel);
			
			
			this.jContentPaneDetalleCreditosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCreditosDetallados = new GridBagLayout();	
			this.jContentPaneDetalleCreditosDetallados.setLayout(gridaBagLayoutDetalleCreditosDetallados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCreditosDetallados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
				this.gridBagConstraintsCreditosDetallados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCreditosDetallados.gridx = 0;
					
				
				this.jContentPaneDetalleCreditosDetallados.add(jTtoolBarDetalleCreditosDetallados, gridBagConstraintsCreditosDetallados);								
				
}
			
			this.jScrollPanelDatosEdicionCreditosDetallados=   new JScrollPane(jContentPaneDetalleCreditosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCreditosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCreditosDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCreditosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCreditosDetallados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCreditosDetallados.gridx = 0;
	        
			this.jContentPaneDetalleCreditosDetallados.add(jPanelCamposCreditosDetallados, gridBagConstraintsCreditosDetallados);
			
			
			
			
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
						//&& creditosdetalladosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCreditosDetallados= new GridBagConstraints();
						this.gridBagConstraintsCreditosDetallados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCreditosDetallados.gridx = 0;
						this.jContentPaneDetalleCreditosDetallados.add(this.jTabbedPaneRelacionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCreditosDetallados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCreditosDetallados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
					this.gridBagConstraintsCreditosDetallados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCreditosDetallados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCreditosDetallados.gridx = 0;
					
				
					this.jContentPaneDetalleCreditosDetallados.add(jPanelCamposOcultosCreditosDetallados, gridBagConstraintsCreditosDetallados);
				
					this.jPanelCamposOcultosCreditosDetallados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCreditosDetallados.gridx = 0;
	        this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCreditosDetallados.add(this.jPanelAccionesFormularioCreditosDetallados, this.gridBagConstraintsCreditosDetallados);							
			
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
	        this.gridBagConstraintsCreditosDetallados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCreditosDetallados.gridx = 0;
	        
			
			this.jContentPaneDetalleCreditosDetallados.add(this.jPanelAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCreditosDetallados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCreditosDetallados=   new JScrollPane(this.jPanelCamposCreditosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCreditosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCreditosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCreditosDetallados.gridx = 0;
			this.gridBagConstraintsCreditosDetallados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCreditosDetallados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCreditosDetallados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCreditosDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCreditosDetallados, this.gridBagConstraintsCreditosDetallados);			
			
			this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
			this.gridBagConstraintsCreditosDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCreditosDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
			
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		
			
		this.gridBagConstraintsCreditosDetallados = new GridBagConstraints();
		this.gridBagConstraintsCreditosDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCreditosDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCreditosDetallados, this.gridBagConstraintsCreditosDetallados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCreditosDetallados;//jContentPane;
		
		return jScrollPanelDatosEdicionCreditosDetallados;
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
