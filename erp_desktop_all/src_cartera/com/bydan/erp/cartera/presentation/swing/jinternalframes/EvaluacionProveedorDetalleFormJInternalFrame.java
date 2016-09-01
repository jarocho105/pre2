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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.EvaluacionProveedorConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class EvaluacionProveedorDetalleFormJInternalFrame extends EvaluacionProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEvaluacionProveedor;
	
	protected JMenuBar jmenuBarDetalleEvaluacionProveedor;
	
	protected JMenu jmenuDetalleEvaluacionProveedor;
	protected JMenu jmenuDetalleArchivoEvaluacionProveedor;
	protected JMenu jmenuDetalleAccionesEvaluacionProveedor;
	protected JMenu jmenuDetalleDatosEvaluacionProveedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionProveedor;	
	protected GridBagConstraints gridBagConstraintsEvaluacionProveedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EvaluacionProveedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleEvaluacionProveedor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public EvaluacionProveedorSessionBean evaluacionproveedorSessionBean;
	
	

	public DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame=null;
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleEvaluacionProveedor=false;
	public DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public EvaluacionProveedorLogic evaluacionproveedorLogic;
	
	public JScrollPane jScrollPanelDatosEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionProveedor;
	
	protected JPanel jPanelCamposEvaluacionProveedor;    
	protected JPanel jPanelCamposOcultosEvaluacionProveedor;    	
	protected JPanel jPanelAccionesEvaluacionProveedor;
	protected JPanel jPanelAccionesFormularioEvaluacionProveedor;
    
	
	
	protected Integer iXPanelCamposEvaluacionProveedor=0;
	protected Integer iYPanelCamposEvaluacionProveedor=0;
	
	protected Integer iXPanelCamposOcultosEvaluacionProveedor=0;
	protected Integer iYPanelCamposOcultosEvaluacionProveedor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEvaluacionProveedor;
	public JButton jButtonModificarEvaluacionProveedor;
	public JButton jButtonActualizarEvaluacionProveedor;
    public JButton jButtonEliminarEvaluacionProveedor;
	public JButton jButtonCancelarEvaluacionProveedor;
    public JButton jButtonGuardarCambiosEvaluacionProveedor;
	public JButton jButtonGuardarCambiosTablaEvaluacionProveedor;
	protected JButton jButtonCerrarEvaluacionProveedor;
	
	
	protected JButton jButtonProcesarInformacionEvaluacionProveedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEvaluacionProveedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEvaluacionProveedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEvaluacionProveedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionProveedor;
	protected JButton jButtonModificarToolBarEvaluacionProveedor;
	protected JButton jButtonActualizarToolBarEvaluacionProveedor;
    protected JButton jButtonEliminarToolBarEvaluacionProveedor;
	protected JButton jButtonCancelarToolBarEvaluacionProveedor;
    protected JButton jButtonGuardarCambiosToolBarEvaluacionProveedor;
	protected JButton jButtonGuardarCambiosTablaToolBarEvaluacionProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionProveedor;
	protected JButton jButtonCerrarToolBarEvaluacionProveedor;
	
	protected JButton jButtonProcesarInformacionToolBarEvaluacionProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionProveedor;
	protected JMenuItem jMenuItemModificarEvaluacionProveedor;
	protected JMenuItem jMenuItemActualizarEvaluacionProveedor;
    protected JMenuItem jMenuItemEliminarEvaluacionProveedor;
	protected JMenuItem jMenuItemCancelarEvaluacionProveedor;
    protected JMenuItem jMenuItemGuardarCambiosEvaluacionProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionProveedor;
	protected JMenuItem jMenuItemCerrarEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionProveedor;
	
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionProveedor;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionProveedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionProveedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEvaluacionProveedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEvaluacionProveedor;
	public JLabel jLabelIdEvaluacionProveedor;
	public JLabel jLabelidEvaluacionProveedor;
	public JButton jButtonidEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfechaEvaluacionProveedor;
	public JLabel jLabelfechaEvaluacionProveedor;
	//public JFormattedTextField jDateChooserfechaEvaluacionProveedor;

	public JDateChooser jDateChooserfechaEvaluacionProveedor;
	public JButton jButtonfechaEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcontactoEvaluacionProveedor;
	public JLabel jLabelcontactoEvaluacionProveedor;
	public JTextArea jTextAreacontactoEvaluacionProveedor;
	public JScrollPane jscrollPanecontactoEvaluacionProveedor;
	public JButton jButtoncontactoEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelevaluadoEvaluacionProveedor;
	public JLabel jLabelevaluadoEvaluacionProveedor;
	public JTextArea jTextAreaevaluadoEvaluacionProveedor;
	public JScrollPane jscrollPaneevaluadoEvaluacionProveedor;
	public JButton jButtonevaluadoEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelresultadoEvaluacionProveedor;
	public JLabel jLabelresultadoEvaluacionProveedor;
	public JTextArea jTextArearesultadoEvaluacionProveedor;
	public JScrollPane jscrollPaneresultadoEvaluacionProveedor;
	public JButton jButtonresultadoEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelresponsableEvaluacionProveedor;
	public JLabel jLabelresponsableEvaluacionProveedor;
	public JTextArea jTextArearesponsableEvaluacionProveedor;
	public JScrollPane jscrollPaneresponsableEvaluacionProveedor;
	public JButton jButtonresponsableEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeEvaluacionProveedor;
	public JLabel jLabelfecha_desdeEvaluacionProveedor;
	//public JFormattedTextField jDateChooserfecha_desdeEvaluacionProveedor;

	public JDateChooser jDateChooserfecha_desdeEvaluacionProveedor;
	public JButton jButtonfecha_desdeEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaEvaluacionProveedor;
	public JLabel jLabelfecha_hastaEvaluacionProveedor;
	//public JFormattedTextField jDateChooserfecha_hastaEvaluacionProveedor;

	public JDateChooser jDateChooserfecha_hastaEvaluacionProveedor;
	public JButton jButtonfecha_hastaEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelobservacionEvaluacionProveedor;
	public JLabel jLabelobservacionEvaluacionProveedor;
	public JTextArea jTextAreaobservacionEvaluacionProveedor;
	public JScrollPane jscrollPaneobservacionEvaluacionProveedor;
	public JButton jButtonobservacionEvaluacionProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEvaluacionProveedor;
	public JLabel jLabelid_empresaEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEvaluacionProveedor;
	public JButton jButtonid_empresaEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEvaluacionProveedor;
	public JLabel jLabelid_sucursalEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEvaluacionProveedor;
	public JButton jButtonid_sucursalEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioEvaluacionProveedor;
	public JLabel jLabelid_ejercicioEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioEvaluacionProveedor;
	public JButton jButtonid_ejercicioEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoEvaluacionProveedor;
	public JLabel jLabelid_periodoEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoEvaluacionProveedor;
	public JButton jButtonid_periodoEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_periodoEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_periodoEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteEvaluacionProveedor;
	public JLabel jLabelid_clienteEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteEvaluacionProveedor;
	public JButton jButtonid_clienteEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_clienteEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_clienteEvaluacionProveedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEvaluacionProveedor;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EvaluacionProveedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEvaluacionProveedor=new JPanel();
				this.jPanelAccionesFormularioEvaluacionProveedor=new JPanel();
				this.jmenuBarDetalleEvaluacionProveedor=new JMenuBar();
				this.jTtoolBarDetalleEvaluacionProveedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionProveedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEvaluacionProveedor() {
		return this.jButtonActualizarToolBarEvaluacionProveedor;
	}
	
	public JButton getjButtonEliminarToolBarEvaluacionProveedor() {
		return this.jButtonEliminarToolBarEvaluacionProveedor;
	}
	
	public JButton getjButtonCancelarToolBarEvaluacionProveedor() {
		return this.jButtonCancelarToolBarEvaluacionProveedor;
	}		
	
	public JButton getjButtonProcesarInformacionEvaluacionProveedor() {
		return this.jButtonProcesarInformacionEvaluacionProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionProveedor)	{
		this.jButtonProcesarInformacionEvaluacionProveedor = jButtonProcesarInformacionEvaluacionProveedor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionProveedor() {
		return this.jComboBoxTiposAccionesEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionProveedor(
			JComboBox jComboBoxTiposRelacionesEvaluacionProveedor) {
		this.jComboBoxTiposRelacionesEvaluacionProveedor = jComboBoxTiposRelacionesEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionProveedor(
			JComboBox jComboBoxTiposAccionesEvaluacionProveedor) {
		this.jComboBoxTiposAccionesEvaluacionProveedor = jComboBoxTiposAccionesEvaluacionProveedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEvaluacionProveedor() {
		return this.jComboBoxTiposAccionesFormularioEvaluacionProveedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEvaluacionProveedor(
			JComboBox jComboBoxTiposAccionesFormularioEvaluacionProveedor) {
		this.jComboBoxTiposAccionesFormularioEvaluacionProveedor = jComboBoxTiposAccionesFormularioEvaluacionProveedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
		
		this.evaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionproveedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluacion Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
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
	
		EvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionProveedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEvaluacionProveedor=new JButtonMe();
				this.jButtonModificarToolBarEvaluacionProveedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"actualizar","actualizar","Actualizar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"eliminar","eliminar","Eliminar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"cancelar","cancelar","Cancelar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor,
							"guardarcambios","guardarcambios","Guardar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEvaluacionProveedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEvaluacionProveedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEvaluacionProveedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEvaluacionProveedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEvaluacionProveedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEvaluacionProveedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEvaluacionProveedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEvaluacionProveedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEvaluacionProveedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEvaluacionProveedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEvaluacionProveedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEvaluacionProveedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEvaluacionProveedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEvaluacionProveedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEvaluacionProveedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEvaluacionProveedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEvaluacionProveedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEvaluacionProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEvaluacionProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEvaluacionProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEvaluacionProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEvaluacionProveedor.add(this.jMenuItemDetalleCerrarEvaluacionProveedor);
		
		this.jmenuDetalleAccionesEvaluacionProveedor.add(this.jMenuItemActualizarEvaluacionProveedor);
		this.jmenuDetalleAccionesEvaluacionProveedor.add(this.jMenuItemEliminarEvaluacionProveedor);
		this.jmenuDetalleAccionesEvaluacionProveedor.add(this.jMenuItemCancelarEvaluacionProveedor);		
		
		//this.jmenuDetalleDatosEvaluacionProveedor.add(this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor);				
		this.jmenuDetalleDatosEvaluacionProveedor.add(this.jMenuItemDetalleMostarOcultarEvaluacionProveedor);				
				
		//this.jmenuDetalleAccionesEvaluacionProveedor.add(this.jMenuItemGuardarCambiosEvaluacionProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuDetalleArchivoEvaluacionProveedor);		
		this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuDetalleAccionesEvaluacionProveedor);		
		this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuDetalleDatosEvaluacionProveedor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEvaluacionProveedor.add(this.jmenuDetalleEvaluacionProveedor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEvaluacionProveedor);				
	}
	
	
	public void inicializarElementosCamposEvaluacionProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEvaluacionProveedor = new JLabelMe();
		jLabelIdEvaluacionProveedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEvaluacionProveedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEvaluacionProveedor= new GridBagLayout();

		this.jPanelidEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);

		jLabelidEvaluacionProveedor = new JLabel();
		jLabelidEvaluacionProveedor.setText("Id");

		jLabelidEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaEvaluacionProveedor = new JLabelMe();
		this.jLabelfechaEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaEvaluacionProveedor.setToolTipText("Fecha");
		this.jLabelfechaEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelfechaEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		//jFormattedTextFieldfechaEvaluacionProveedor= new JFormattedTextFieldMe();

		jDateChooserfechaEvaluacionProveedor= new JDateChooser();
		jDateChooserfechaEvaluacionProveedor.setEnabled(false);
		jDateChooserfechaEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaEvaluacionProveedor.setDate(new Date());
		jDateChooserfechaEvaluacionProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaEvaluacionProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonfechaEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaEvaluacionProveedorBusqueda.setText("U");
		this.jButtonfechaEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcontactoEvaluacionProveedor = new JLabelMe();
		this.jLabelcontactoEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO+" : *");
		this.jLabelcontactoEvaluacionProveedor.setToolTipText("Contacto");
		this.jLabelcontactoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontactoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontactoEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontactoEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelcontactoEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jTextAreacontactoEvaluacionProveedor= new JTextAreaMe();
		jTextAreacontactoEvaluacionProveedor.setEnabled(false);
		jTextAreacontactoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoEvaluacionProveedor.setLineWrap(true);
		jTextAreacontactoEvaluacionProveedor.setWrapStyleWord(true);
		jTextAreacontactoEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacontactoEvaluacionProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacontactoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecontactoEvaluacionProveedor = new JScrollPane(jTextAreacontactoEvaluacionProveedor);
		jscrollPanecontactoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncontactoEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtoncontactoEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontactoEvaluacionProveedorBusqueda.setText("U");
		this.jButtoncontactoEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontactoEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontactoEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacontactoEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacontactoEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contactoEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontactoEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelevaluadoEvaluacionProveedor = new JLabelMe();
		this.jLabelevaluadoEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO+" : *");
		this.jLabelevaluadoEvaluacionProveedor.setToolTipText("Evaluado");
		this.jLabelevaluadoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelevaluadoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelevaluadoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelevaluadoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelevaluadoEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelevaluadoEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelevaluadoEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jTextAreaevaluadoEvaluacionProveedor= new JTextAreaMe();
		jTextAreaevaluadoEvaluacionProveedor.setEnabled(false);
		jTextAreaevaluadoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaevaluadoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaevaluadoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaevaluadoEvaluacionProveedor.setLineWrap(true);
		jTextAreaevaluadoEvaluacionProveedor.setWrapStyleWord(true);
		jTextAreaevaluadoEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaevaluadoEvaluacionProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaevaluadoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneevaluadoEvaluacionProveedor = new JScrollPane(jTextAreaevaluadoEvaluacionProveedor);
		jscrollPaneevaluadoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneevaluadoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneevaluadoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonevaluadoEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonevaluadoEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonevaluadoEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonevaluadoEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonevaluadoEvaluacionProveedorBusqueda.setText("U");
		this.jButtonevaluadoEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonevaluadoEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonevaluadoEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaevaluadoEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaevaluadoEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"evaluadoEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonevaluadoEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelresultadoEvaluacionProveedor = new JLabelMe();
		this.jLabelresultadoEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO+" : *");
		this.jLabelresultadoEvaluacionProveedor.setToolTipText("Resultado");
		this.jLabelresultadoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresultadoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresultadoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresultadoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresultadoEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresultadoEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelresultadoEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jTextArearesultadoEvaluacionProveedor= new JTextAreaMe();
		jTextArearesultadoEvaluacionProveedor.setEnabled(false);
		jTextArearesultadoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesultadoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesultadoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesultadoEvaluacionProveedor.setLineWrap(true);
		jTextArearesultadoEvaluacionProveedor.setWrapStyleWord(true);
		jTextArearesultadoEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesultadoEvaluacionProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearesultadoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresultadoEvaluacionProveedor = new JScrollPane(jTextArearesultadoEvaluacionProveedor);
		jscrollPaneresultadoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresultadoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresultadoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonresultadoEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonresultadoEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresultadoEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresultadoEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresultadoEvaluacionProveedorBusqueda.setText("U");
		this.jButtonresultadoEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresultadoEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresultadoEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesultadoEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesultadoEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"resultadoEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresultadoEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelresponsableEvaluacionProveedor = new JLabelMe();
		this.jLabelresponsableEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsableEvaluacionProveedor.setToolTipText("Responsable");
		this.jLabelresponsableEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelresponsableEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jTextArearesponsableEvaluacionProveedor= new JTextAreaMe();
		jTextArearesponsableEvaluacionProveedor.setEnabled(false);
		jTextArearesponsableEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableEvaluacionProveedor.setLineWrap(true);
		jTextArearesponsableEvaluacionProveedor.setWrapStyleWord(true);
		jTextArearesponsableEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableEvaluacionProveedor.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableEvaluacionProveedor = new JScrollPane(jTextArearesponsableEvaluacionProveedor);
		jscrollPaneresponsableEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresponsableEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresponsableEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonresponsableEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonresponsableEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableEvaluacionProveedorBusqueda.setText("U");
		this.jButtonresponsableEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_desdeEvaluacionProveedor = new JLabelMe();
		this.jLabelfecha_desdeEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeEvaluacionProveedor.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelfecha_desdeEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		//jFormattedTextFieldfecha_desdeEvaluacionProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeEvaluacionProveedor= new JDateChooser();
		jDateChooserfecha_desdeEvaluacionProveedor.setEnabled(false);
		jDateChooserfecha_desdeEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeEvaluacionProveedor.setDate(new Date());
		jDateChooserfecha_desdeEvaluacionProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeEvaluacionProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setText("U");
		this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaEvaluacionProveedor = new JLabelMe();
		this.jLabelfecha_hastaEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaEvaluacionProveedor.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelfecha_hastaEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		//jFormattedTextFieldfecha_hastaEvaluacionProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaEvaluacionProveedor= new JDateChooser();
		jDateChooserfecha_hastaEvaluacionProveedor.setEnabled(false);
		jDateChooserfecha_hastaEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaEvaluacionProveedor.setDate(new Date());
		jDateChooserfecha_hastaEvaluacionProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaEvaluacionProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setText("U");
		this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaEvaluacionProveedorBusqueda.setVisible(false);		}


					
		this.jLabelobservacionEvaluacionProveedor = new JLabelMe();
		this.jLabelobservacionEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionEvaluacionProveedor.setToolTipText("Observacion");
		this.jLabelobservacionEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelobservacionEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jTextAreaobservacionEvaluacionProveedor= new JTextAreaMe();
		jTextAreaobservacionEvaluacionProveedor.setEnabled(false);
		jTextAreaobservacionEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionEvaluacionProveedor.setLineWrap(true);
		jTextAreaobservacionEvaluacionProveedor.setWrapStyleWord(true);
		jTextAreaobservacionEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionEvaluacionProveedor.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionEvaluacionProveedor = new JScrollPane(jTextAreaobservacionEvaluacionProveedor);
		jscrollPaneobservacionEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonobservacionEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionEvaluacionProveedorBusqueda.setText("U");
		this.jButtonobservacionEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionEvaluacionProveedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEvaluacionProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEvaluacionProveedor = new JLabelMe();
		this.jLabelid_empresaEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEvaluacionProveedor.setToolTipText("Empresa");
		this.jLabelid_empresaEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_empresaEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jComboBoxid_empresaEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_empresaEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEvaluacionProveedor.setEnabled(false);

		this.jButtonid_empresaEvaluacionProveedor= new JButtonMe();
		this.jButtonid_empresaEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionProveedor.setText("Buscar");
		this.jButtonid_empresaEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionProveedor"));

		this.jButtonid_empresaEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_empresaEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_empresaEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_empresaEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_empresaEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionProveedorUpdate"));



					
		this.jLabelid_sucursalEvaluacionProveedor = new JLabelMe();
		this.jLabelid_sucursalEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEvaluacionProveedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_sucursalEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jComboBoxid_sucursalEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_sucursalEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEvaluacionProveedor.setEnabled(false);

		this.jButtonid_sucursalEvaluacionProveedor= new JButtonMe();
		this.jButtonid_sucursalEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionProveedor.setText("Buscar");
		this.jButtonid_sucursalEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionProveedor"));

		this.jButtonid_sucursalEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_sucursalEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_sucursalEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_sucursalEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionProveedorUpdate"));



					
		this.jLabelid_ejercicioEvaluacionProveedor = new JLabelMe();
		this.jLabelid_ejercicioEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioEvaluacionProveedor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_ejercicioEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jComboBoxid_ejercicioEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_ejercicioEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioEvaluacionProveedor.setEnabled(false);

		this.jButtonid_ejercicioEvaluacionProveedor= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionProveedor.setText("Buscar");
		this.jButtonid_ejercicioEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionProveedor"));

		this.jButtonid_ejercicioEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_ejercicioEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionProveedorUpdate"));



					
		this.jLabelid_periodoEvaluacionProveedor = new JLabelMe();
		this.jLabelid_periodoEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoEvaluacionProveedor.setToolTipText("Periodo");
		this.jLabelid_periodoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_periodoEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jComboBoxid_periodoEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_periodoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoEvaluacionProveedor.setEnabled(false);

		this.jButtonid_periodoEvaluacionProveedor= new JButtonMe();
		this.jButtonid_periodoEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionProveedor.setText("Buscar");
		this.jButtonid_periodoEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionProveedor"));

		this.jButtonid_periodoEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_periodoEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_periodoEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_periodoEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_periodoEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_periodoEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionProveedorUpdate"));



					
		this.jLabelid_clienteEvaluacionProveedor = new JLabelMe();
		this.jLabelid_clienteEvaluacionProveedor.setText(""+EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteEvaluacionProveedor.setToolTipText("Cliente");
		this.jLabelid_clienteEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteEvaluacionProveedor.setToolTipText(EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_clienteEvaluacionProveedor.setLayout(this.gridaBagLayoutEvaluacionProveedor);


		jComboBoxid_clienteEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_clienteEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteEvaluacionProveedor= new JButtonMe();
		this.jButtonid_clienteEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteEvaluacionProveedor.setText("Buscar");
		this.jButtonid_clienteEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteEvaluacionProveedor"));

		this.jButtonid_clienteEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_clienteEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_clienteEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteEvaluacionProveedorBusqueda"));

		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_clienteEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_clienteEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_clienteEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteEvaluacionProveedorUpdate"));



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
		//this.jInternalFrameDetalleEvaluacionProveedor = new EvaluacionProveedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Evaluacion Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionProveedor= new GridBagLayout();
		

		
		String sToolTipEvaluacionProveedor="";
		sToolTipEvaluacionProveedor=EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionProveedor+="(Cartera.EvaluacionProveedor)";
		}
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionProveedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEvaluacionProveedor = new JButtonMe();
		this.jButtonModificarEvaluacionProveedor = new JButtonMe();
        this.jButtonActualizarEvaluacionProveedor = new JButtonMe();
        this.jButtonEliminarEvaluacionProveedor = new JButtonMe();
        this.jButtonCancelarEvaluacionProveedor = new JButtonMe();
        this.jButtonGuardarCambiosEvaluacionProveedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarEvaluacionProveedor = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionProveedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionEvaluacionProveedor = new JScrollPane();
		this.jScrollPanelDatosGeneralEvaluacionProveedor = new JScrollPane();
				
		
		
		this.jPanelCamposEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluacion Proveedor";
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Proveedores" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEvaluacionProveedor.setName("jPanelCamposEvaluacionProveedor"); 

		this.jPanelCamposOcultosEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEvaluacionProveedor.setName("jPanelCamposOcultosEvaluacionProveedor"); 

        this.jPanelAccionesEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionProveedor.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionProveedor.setName("Acciones"); 

		this.jPanelAccionesFormularioEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEvaluacionProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEvaluacionProveedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEvaluacionProveedor.setText("Nuevo");
		this.jButtonModificarEvaluacionProveedor.setText("Editar");
        this.jButtonActualizarEvaluacionProveedor.setText("Actualizar");
        this.jButtonEliminarEvaluacionProveedor.setText("Eliminar");
        this.jButtonCancelarEvaluacionProveedor.setText("Cancelar");
        this.jButtonGuardarCambiosEvaluacionProveedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.setText("Guardar");
		this.jButtonCerrarEvaluacionProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionProveedor,"nuevo_button","Nuevo",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEvaluacionProveedor,"modificar_button","Editar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEvaluacionProveedor,"actualizar_button","Actualizar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEvaluacionProveedor,"eliminar_button","Eliminar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEvaluacionProveedor,"cancelar_button","Cancelar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEvaluacionProveedor,"guardarcambios_button","Guardar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionProveedor,"guardarcambiostabla_button","Guardar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionProveedor,"cerrar_button","Salir",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEvaluacionProveedor.setToolTipText("Nuevo"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEvaluacionProveedor.setToolTipText("Editar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEvaluacionProveedor.setToolTipText("Actualizar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEvaluacionProveedor.setToolTipText("Eliminar)"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEvaluacionProveedor.setToolTipText("Cancelar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEvaluacionProveedor.setToolTipText("Guardar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.setToolTipText("Guardar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionProveedor.setToolTipText("Salir"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionProveedor";
		inputMap = this.jButtonNuevoEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionProveedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEvaluacionProveedor";
		inputMap = this.jButtonActualizarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEvaluacionProveedor"));
		
		//ELIMINAR
		sMapKey = "EliminarEvaluacionProveedor";
		inputMap = this.jButtonEliminarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEvaluacionProveedor"));
		
		//CANCELAR	
		sMapKey = "CancelarEvaluacionProveedor";
		inputMap = this.jButtonCancelarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEvaluacionProveedor"));
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionProveedor";
		inputMap = this.jButtonCerrarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionProveedor";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionProveedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEvaluacionProveedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEvaluacionProveedor.setToolTipText("Nuevo EvaluacionProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEvaluacionProveedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEvaluacionProveedor.setToolTipText("Sin Cerrar Ventana EvaluacionProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEvaluacionProveedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEvaluacionProveedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionProveedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEvaluacionProveedor = new JLabelMe();
		
		this.jLabelAccionesEvaluacionProveedor.setText("Acciones");		
		this.jLabelAccionesEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEvaluacionProveedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEvaluacionProveedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEvaluacionProveedor=new JTabbedPane();
		this.jTabbedPaneRelacionesEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEvaluacionProveedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEvaluacionProveedor = new GridBagLayout();
		
		this.jPanelCamposEvaluacionProveedor.setLayout(gridaBagLayoutCamposEvaluacionProveedor);
		this.jPanelCamposOcultosEvaluacionProveedor.setLayout(gridaBagLayoutCamposOcultosEvaluacionProveedor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEvaluacionProveedor.add(jLabelIdEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEvaluacionProveedor.add(jLabelidEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEvaluacionProveedor.add(jLabelid_empresaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionProveedor.add(jButtonid_empresaEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionProveedor.add(jButtonid_empresaEvaluacionProveedorUpdate, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEvaluacionProveedor.add(jComboBoxid_empresaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEvaluacionProveedor.add(jLabelid_sucursalEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionProveedor.add(jButtonid_sucursalEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionProveedor.add(jButtonid_sucursalEvaluacionProveedorUpdate, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEvaluacionProveedor.add(jComboBoxid_sucursalEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioEvaluacionProveedor.add(jLabelid_ejercicioEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionProveedor.add(jButtonid_ejercicioEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionProveedor.add(jButtonid_ejercicioEvaluacionProveedorUpdate, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioEvaluacionProveedor.add(jComboBoxid_ejercicioEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoEvaluacionProveedor.add(jLabelid_periodoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEvaluacionProveedor.add(jButtonid_periodoEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEvaluacionProveedor.add(jButtonid_periodoEvaluacionProveedorUpdate, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoEvaluacionProveedor.add(jComboBoxid_periodoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteEvaluacionProveedor.add(jLabelid_clienteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteEvaluacionProveedor.add(jButtonid_clienteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteEvaluacionProveedor.add(jButtonid_clienteEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 4;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteEvaluacionProveedor.add(jButtonid_clienteEvaluacionProveedorUpdate, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteEvaluacionProveedor.add(jComboBoxid_clienteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaEvaluacionProveedor.add(jLabelfechaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaEvaluacionProveedor.add(jButtonfechaEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaEvaluacionProveedor.add(jDateChooserfechaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontactoEvaluacionProveedor.add(jLabelcontactoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontactoEvaluacionProveedor.add(jButtoncontactoEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontactoEvaluacionProveedor.add(jscrollPanecontactoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelevaluadoEvaluacionProveedor.add(jLabelevaluadoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelevaluadoEvaluacionProveedor.add(jButtonevaluadoEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelevaluadoEvaluacionProveedor.add(jscrollPaneevaluadoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresultadoEvaluacionProveedor.add(jLabelresultadoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelresultadoEvaluacionProveedor.add(jButtonresultadoEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresultadoEvaluacionProveedor.add(jscrollPaneresultadoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableEvaluacionProveedor.add(jLabelresponsableEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableEvaluacionProveedor.add(jButtonresponsableEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableEvaluacionProveedor.add(jscrollPaneresponsableEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeEvaluacionProveedor.add(jLabelfecha_desdeEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeEvaluacionProveedor.add(jButtonfecha_desdeEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeEvaluacionProveedor.add(jDateChooserfecha_desdeEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaEvaluacionProveedor.add(jLabelfecha_hastaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaEvaluacionProveedor.add(jButtonfecha_hastaEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaEvaluacionProveedor.add(jDateChooserfecha_hastaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionEvaluacionProveedor.add(jLabelobservacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionEvaluacionProveedor.add(jButtonobservacionEvaluacionProveedorBusqueda, this.gridBagConstraintsEvaluacionProveedor);
	}

	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionEvaluacionProveedor.add(jscrollPaneobservacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelidEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelid_clienteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelfechaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelcontactoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelevaluadoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelresultadoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelresponsableEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelfecha_desdeEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelfecha_hastaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionProveedor.add(this.jPanelobservacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposEvaluacionProveedor % 1==0) {
		iXPanelCamposEvaluacionProveedor=0;
		iYPanelCamposEvaluacionProveedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposOcultosEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposOcultosEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionProveedor.add(this.jPanelid_empresaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposOcultosEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosEvaluacionProveedor=0;
		iYPanelCamposOcultosEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposOcultosEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposOcultosEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionProveedor.add(this.jPanelid_sucursalEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposOcultosEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosEvaluacionProveedor=0;
		iYPanelCamposOcultosEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposOcultosEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposOcultosEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionProveedor.add(this.jPanelid_ejercicioEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposOcultosEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosEvaluacionProveedor=0;
		iYPanelCamposOcultosEvaluacionProveedor++;
	}
	this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionProveedor.gridy = iYPanelCamposOcultosEvaluacionProveedor;
	this.gridBagConstraintsEvaluacionProveedor.gridx = iXPanelCamposOcultosEvaluacionProveedor++;
	this.gridBagConstraintsEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionProveedor.add(this.jPanelid_periodoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);



	if(iXPanelCamposOcultosEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosEvaluacionProveedor=0;
		iYPanelCamposOcultosEvaluacionProveedor++;
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
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionProveedor= new GridBagLayout();
		this.jPanelAccionesEvaluacionProveedor.setLayout(gridaBagLayoutAccionesEvaluacionProveedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEvaluacionProveedor= new GridBagLayout();
		this.jPanelAccionesFormularioEvaluacionProveedor.setLayout(gridaBagLayoutAccionesFormularioEvaluacionProveedor);
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionProveedor.add(this.jComboBoxTiposAccionesFormularioEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionProveedor.add(this.jCheckBoxPostAccionNuevoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEvaluacionProveedor.add(this.jCheckBoxPostAccionSinCerrarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEvaluacionProveedor.add(this.jCheckBoxPostAccionSinMensajeEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesEvaluacionProveedor.add(this.jButtonModificarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);							

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesEvaluacionProveedor.add(this.jButtonEliminarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
			
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionProveedor.add(this.jButtonActualizarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);


		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionProveedor.add(this.jButtonGuardarCambiosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);	
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;		
		this.gridBagConstraintsEvaluacionProveedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesEvaluacionProveedor.add(this.jButtonCancelarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionProveedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;		
			//this.gridBagConstraintsEvaluacionProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionProveedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionProveedor.gridx =0;
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEvaluacionProveedor = new EvaluacionProveedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Evaluacion Proveedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Evaluacion Proveedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluacion Proveedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EvaluacionProveedorModel evaluacionproveedorModel=new EvaluacionProveedorModel(this);
			
			//SI USARA CLASE INTERNA
			//EvaluacionProveedorModel.EvaluacionProveedorFocusTraversalPolicy evaluacionproveedorFocusTraversalPolicy = evaluacionproveedorModel.new EvaluacionProveedorFocusTraversalPolicy(this);
			
			//evaluacionproveedorFocusTraversalPolicy.setevaluacionproveedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(evaluacionproveedorModel);
			
			
			this.jContentPaneDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();	
			this.jContentPaneDetalleEvaluacionProveedor.setLayout(gridaBagLayoutDetalleEvaluacionProveedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionProveedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
					
				
				this.jContentPaneDetalleEvaluacionProveedor.add(jTtoolBarDetalleEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);								
				
}
			
			this.jScrollPanelDatosEdicionEvaluacionProveedor=   new JScrollPane(jContentPaneDetalleEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEvaluacionProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	        
			this.jContentPaneDetalleEvaluacionProveedor.add(jPanelCamposEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);
			
			
			
			
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
						&& evaluacionproveedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(this.puedeCargarPorParteDetalleEvaluacionProveedor,false,-1);
					
					if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEvaluacionProveedor= new GridBagConstraints();
						this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
						this.jContentPaneDetalleEvaluacionProveedor.add(this.jTabbedPaneRelacionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEvaluacionProveedor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEvaluacionProveedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
					this.gridBagConstraintsEvaluacionProveedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
					
				
					this.jContentPaneDetalleEvaluacionProveedor.add(jPanelCamposOcultosEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);
				
					this.jPanelCamposOcultosEvaluacionProveedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	        this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEvaluacionProveedor.add(this.jPanelAccionesFormularioEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);							
			
			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
	        this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
	        
			
			this.jContentPaneDetalleEvaluacionProveedor.add(this.jPanelAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEvaluacionProveedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEvaluacionProveedor=   new JScrollPane(this.jPanelCamposEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEvaluacionProveedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
			
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
			
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEvaluacionProveedor;//jContentPane;
		
		return jScrollPanelDatosEdicionEvaluacionProveedor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(false);
		this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);

		this.detalleevaluacionproveedorBeanSwingJInternalFrame=null;//new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleevaluacionproveedorBeanSwingJInternalFramePopup=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleevaluacionproveedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {

				DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);

				this.detalleevaluacionproveedorBeanSwingJInternalFrame=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleevaluacionproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleevaluacionproveedorBeanSwingJInternalFrame.setdetalleevaluacionproveedorSessionBean(this.detalleevaluacionproveedorSessionBean);

				//this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
				//this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
				//this.jContentPaneDetalleEvaluacionProveedor.add(this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEvaluacionProveedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEvaluacionProveedor.add("Detalle Evaluacion Proveedores",this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEvaluacionProveedor.setComponentAt(iIndexTab,this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
				this.detalleevaluacionproveedorBeanSwingJInternalFrame=null;//new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleEvaluacionProveedor) {
					this.jTabbedPaneRelacionesEvaluacionProveedor.add("Detalle Evaluacion Proveedores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleEvaluacionProveedorBeanSwingJInternalFrame(List<EvaluacionProveedor> evaluacionproveedors,EvaluacionProveedor evaluacionproveedor,DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleevaluacionproveedorBeanSwingJInternalFrame=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleevaluacionproveedorBeanSwingJInternalFrame.getDetalleEvaluacionProveedorLogic().setConnexion(this.evaluacionproveedorLogic.getConnexion());

					detalleevaluacionproveedorBeanSwingJInternalFrame.setevaluacionproveedorsForeignKey(evaluacionproveedors);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setevaluacionproveedorForeignKey(evaluacionproveedor);
					detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionEvaluacionProveedor(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setlidEvaluacionProveedorActual(evaluacionproveedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleevaluacionproveedorBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleEvaluacionProveedor(detalleevaluacionproveedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaEvaluacionProveedor(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setid_evaluacion_proveedorFK_IdEvaluacionProveedor(evaluacionproveedor.getId());

					if(!this.conCargarFormDetalle) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleevaluacionproveedorBeanSwingJInternalFrame.setSelectedItemCombosFrameEvaluacionProveedorForeignKey(evaluacionproveedor,1,false,true,true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleevaluacionproveedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdEvaluacionProveedor");
					detalleevaluacionproveedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEvaluacionProveedor");
					detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n",detalleevaluacionproveedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleevaluacionproveedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("relacionado");
					} else {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("no_relacionado");
					}

					detalleevaluacionproveedorBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleEvaluacionProveedor().setVisible(false);

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
