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
import com.bydan.erp.cartera.util.SubPreguntaEvaluacionConstantesFunciones;

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
public class SubPreguntaEvaluacionDetalleFormJInternalFrame extends SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSubPreguntaEvaluacion;
	
	protected JMenuBar jmenuBarDetalleSubPreguntaEvaluacion;
	
	protected JMenu jmenuDetalleSubPreguntaEvaluacion;
	protected JMenu jmenuDetalleArchivoSubPreguntaEvaluacion;
	protected JMenu jmenuDetalleAccionesSubPreguntaEvaluacion;
	protected JMenu jmenuDetalleDatosSubPreguntaEvaluacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubPreguntaEvaluacion;	
	protected GridBagConstraints gridBagConstraintsSubPreguntaEvaluacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleSubPreguntaEvaluacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntaevaluacion="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean;
	
	

	public DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame=null;
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleEvaluacionProveedor=false;
	public DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;	
	
	public SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic;
	
	public JScrollPane jScrollPanelDatosSubPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosEdicionSubPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosGeneralSubPreguntaEvaluacion;
	
	protected JPanel jPanelCamposSubPreguntaEvaluacion;    
	protected JPanel jPanelCamposOcultosSubPreguntaEvaluacion;    	
	protected JPanel jPanelAccionesSubPreguntaEvaluacion;
	protected JPanel jPanelAccionesFormularioSubPreguntaEvaluacion;
    
	
	
	protected Integer iXPanelCamposSubPreguntaEvaluacion=0;
	protected Integer iYPanelCamposSubPreguntaEvaluacion=0;
	
	protected Integer iXPanelCamposOcultosSubPreguntaEvaluacion=0;
	protected Integer iYPanelCamposOcultosSubPreguntaEvaluacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSubPreguntaEvaluacion;
	public JButton jButtonModificarSubPreguntaEvaluacion;
	public JButton jButtonActualizarSubPreguntaEvaluacion;
    public JButton jButtonEliminarSubPreguntaEvaluacion;
	public JButton jButtonCancelarSubPreguntaEvaluacion;
    public JButton jButtonGuardarCambiosSubPreguntaEvaluacion;
	public JButton jButtonGuardarCambiosTablaSubPreguntaEvaluacion;
	protected JButton jButtonCerrarSubPreguntaEvaluacion;
	
	
	protected JButton jButtonProcesarInformacionSubPreguntaEvaluacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSubPreguntaEvaluacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubPreguntaEvaluacion;
	protected JButton jButtonModificarToolBarSubPreguntaEvaluacion;
	protected JButton jButtonActualizarToolBarSubPreguntaEvaluacion;
    protected JButton jButtonEliminarToolBarSubPreguntaEvaluacion;
	protected JButton jButtonCancelarToolBarSubPreguntaEvaluacion;
    protected JButton jButtonGuardarCambiosToolBarSubPreguntaEvaluacion;
	protected JButton jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion;
	protected JButton jButtonMostrarOcultarTablaToolBarSubPreguntaEvaluacion;
	protected JButton jButtonCerrarToolBarSubPreguntaEvaluacion;
	
	protected JButton jButtonProcesarInformacionToolBarSubPreguntaEvaluacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemModificarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemActualizarSubPreguntaEvaluacion;
    protected JMenuItem jMenuItemEliminarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemCancelarSubPreguntaEvaluacion;
    protected JMenuItem jMenuItemGuardarCambiosSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemCerrarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleCerrarSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion;
	
	protected JMenuItem jMenuItemProcesarInformacionSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion;
	protected JMenuItem jMenuItemMostrarOcultarSubPreguntaEvaluacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubPreguntaEvaluacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubPreguntaEvaluacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSubPreguntaEvaluacion;
	public JLabel jLabelIdSubPreguntaEvaluacion;
	public JLabel jLabelidSubPreguntaEvaluacion;
	public JButton jButtonidSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelordenSubPreguntaEvaluacion;
	public JLabel jLabelordenSubPreguntaEvaluacion;
	public JTextField jTextFieldordenSubPreguntaEvaluacion;
	public JButton jButtonordenSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelpreguntaSubPreguntaEvaluacion;
	public JLabel jLabelpreguntaSubPreguntaEvaluacion;
	public JTextArea jTextAreapreguntaSubPreguntaEvaluacion;
	public JScrollPane jscrollPanepreguntaSubPreguntaEvaluacion;
	public JButton jButtonpreguntaSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_siSubPreguntaEvaluacion;
	public JLabel jLabelporcentaje_siSubPreguntaEvaluacion;
	public JTextField jTextFieldporcentaje_siSubPreguntaEvaluacion;
	public JButton jButtonporcentaje_siSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelcon_facturaSubPreguntaEvaluacion;
	public JLabel jLabelcon_facturaSubPreguntaEvaluacion;
	public JCheckBox jCheckBoxcon_facturaSubPreguntaEvaluacion;
	public JButton jButtoncon_facturaSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelcon_orden_compraSubPreguntaEvaluacion;
	public JLabel jLabelcon_orden_compraSubPreguntaEvaluacion;
	public JCheckBox jCheckBoxcon_orden_compraSubPreguntaEvaluacion;
	public JButton jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelcon_completoSubPreguntaEvaluacion;
	public JLabel jLabelcon_completoSubPreguntaEvaluacion;
	public JCheckBox jCheckBoxcon_completoSubPreguntaEvaluacion;
	public JButton jButtoncon_completoSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelcon_a_tiempoSubPreguntaEvaluacion;
	public JLabel jLabelcon_a_tiempoSubPreguntaEvaluacion;
	public JCheckBox jCheckBoxcon_a_tiempoSubPreguntaEvaluacion;
	public JButton jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSubPreguntaEvaluacion;
	public JLabel jLabelid_empresaSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSubPreguntaEvaluacion;
	public JButton jButtonid_empresaSubPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_empresaSubPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSubPreguntaEvaluacion;
	public JLabel jLabelid_sucursalSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSubPreguntaEvaluacion;
	public JButton jButtonid_sucursalSubPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_sucursalSubPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_pregunta_evaluacionSubPreguntaEvaluacion;
	public JLabel jLabelid_pregunta_evaluacionSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion;
	public JButton jButtonid_pregunta_evaluacionSubPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioSubPreguntaEvaluacion;
	public JLabel jLabelid_ejercicioSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioSubPreguntaEvaluacion;
	public JButton jButtonid_ejercicioSubPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_ejercicioSubPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioSubPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoSubPreguntaEvaluacion;
	public JLabel jLabelid_periodoSubPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoSubPreguntaEvaluacion;
	public JButton jButtonid_periodoSubPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_periodoSubPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_periodoSubPreguntaEvaluacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSubPreguntaEvaluacion;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SubPreguntaEvaluacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSubPreguntaEvaluacion=new JPanel();
				this.jPanelAccionesFormularioSubPreguntaEvaluacion=new JPanel();
				this.jmenuBarDetalleSubPreguntaEvaluacion=new JMenuBar();
				this.jTtoolBarDetalleSubPreguntaEvaluacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SubPreguntaEvaluacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubPreguntaEvaluacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubPreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSubPreguntaEvaluacion() {
		return this.jButtonActualizarToolBarSubPreguntaEvaluacion;
	}
	
	public JButton getjButtonEliminarToolBarSubPreguntaEvaluacion() {
		return this.jButtonEliminarToolBarSubPreguntaEvaluacion;
	}
	
	public JButton getjButtonCancelarToolBarSubPreguntaEvaluacion() {
		return this.jButtonCancelarToolBarSubPreguntaEvaluacion;
	}		
	
	public JButton getjButtonProcesarInformacionSubPreguntaEvaluacion() {
		return this.jButtonProcesarInformacionSubPreguntaEvaluacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubPreguntaEvaluacion)	{
		this.jButtonProcesarInformacionSubPreguntaEvaluacion = jButtonProcesarInformacionSubPreguntaEvaluacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubPreguntaEvaluacion() {
		return this.jComboBoxTiposAccionesSubPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposRelacionesSubPreguntaEvaluacion) {
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion = jComboBoxTiposRelacionesSubPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposAccionesSubPreguntaEvaluacion) {
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion = jComboBoxTiposAccionesSubPreguntaEvaluacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSubPreguntaEvaluacion() {
		return this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSubPreguntaEvaluacion(
			JComboBox jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion) {
		this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion = jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		
		this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubPreguntaEvaluacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Pregunta Evaluacion MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
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
	
		SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSubPreguntaEvaluacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSubPreguntaEvaluacion=new JButtonMe();
				this.jButtonModificarToolBarSubPreguntaEvaluacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSubPreguntaEvaluacion,this.jTtoolBarDetalleSubPreguntaEvaluacion,
							"actualizar","actualizar","Actualizar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSubPreguntaEvaluacion,this.jTtoolBarDetalleSubPreguntaEvaluacion,
							"eliminar","eliminar","Eliminar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSubPreguntaEvaluacion,this.jTtoolBarDetalleSubPreguntaEvaluacion,
							"cancelar","cancelar","Cancelar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion,this.jTtoolBarDetalleSubPreguntaEvaluacion,
							"guardarcambios","guardarcambios","Guardar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSubPreguntaEvaluacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSubPreguntaEvaluacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSubPreguntaEvaluacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSubPreguntaEvaluacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSubPreguntaEvaluacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubPreguntaEvaluacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubPreguntaEvaluacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubPreguntaEvaluacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSubPreguntaEvaluacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSubPreguntaEvaluacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSubPreguntaEvaluacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSubPreguntaEvaluacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSubPreguntaEvaluacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSubPreguntaEvaluacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSubPreguntaEvaluacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSubPreguntaEvaluacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSubPreguntaEvaluacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSubPreguntaEvaluacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSubPreguntaEvaluacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSubPreguntaEvaluacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSubPreguntaEvaluacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubPreguntaEvaluacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubPreguntaEvaluacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubPreguntaEvaluacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubPreguntaEvaluacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubPreguntaEvaluacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSubPreguntaEvaluacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSubPreguntaEvaluacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSubPreguntaEvaluacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSubPreguntaEvaluacion.add(this.jMenuItemDetalleCerrarSubPreguntaEvaluacion);
		
		this.jmenuDetalleAccionesSubPreguntaEvaluacion.add(this.jMenuItemActualizarSubPreguntaEvaluacion);
		this.jmenuDetalleAccionesSubPreguntaEvaluacion.add(this.jMenuItemEliminarSubPreguntaEvaluacion);
		this.jmenuDetalleAccionesSubPreguntaEvaluacion.add(this.jMenuItemCancelarSubPreguntaEvaluacion);		
		
		//this.jmenuDetalleDatosSubPreguntaEvaluacion.add(this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion);				
		this.jmenuDetalleDatosSubPreguntaEvaluacion.add(this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion);				
				
		//this.jmenuDetalleAccionesSubPreguntaEvaluacion.add(this.jMenuItemGuardarCambiosSubPreguntaEvaluacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSubPreguntaEvaluacion.add(this.jmenuDetalleArchivoSubPreguntaEvaluacion);		
		this.jmenuBarDetalleSubPreguntaEvaluacion.add(this.jmenuDetalleAccionesSubPreguntaEvaluacion);		
		this.jmenuBarDetalleSubPreguntaEvaluacion.add(this.jmenuDetalleDatosSubPreguntaEvaluacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSubPreguntaEvaluacion.add(this.jmenuDetalleSubPreguntaEvaluacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSubPreguntaEvaluacion);				
	}
	
	
	public void inicializarElementosCamposSubPreguntaEvaluacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSubPreguntaEvaluacion = new JLabelMe();
		jLabelIdSubPreguntaEvaluacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSubPreguntaEvaluacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSubPreguntaEvaluacion= new GridBagLayout();

		this.jPanelidSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);

		jLabelidSubPreguntaEvaluacion = new JLabel();
		jLabelidSubPreguntaEvaluacion.setText("Id");

		jLabelidSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelordenSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelordenSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenSubPreguntaEvaluacion.setToolTipText("Orden");
		this.jLabelordenSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelordenSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jTextFieldordenSubPreguntaEvaluacion= new JTextFieldMe();
		jTextFieldordenSubPreguntaEvaluacion.setEnabled(false);
		jTextFieldordenSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenSubPreguntaEvaluacion.setText("0");

		this.jButtonordenSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonordenSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonordenSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenSubPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelpreguntaSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelpreguntaSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA+" : *");
		this.jLabelpreguntaSubPreguntaEvaluacion.setToolTipText("Pregunta");
		this.jLabelpreguntaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreguntaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreguntaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpreguntaSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpreguntaSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpreguntaSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelpreguntaSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jTextAreapreguntaSubPreguntaEvaluacion= new JTextAreaMe();
		jTextAreapreguntaSubPreguntaEvaluacion.setEnabled(false);
		jTextAreapreguntaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaSubPreguntaEvaluacion.setLineWrap(true);
		jTextAreapreguntaSubPreguntaEvaluacion.setWrapStyleWord(true);
		jTextAreapreguntaSubPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapreguntaSubPreguntaEvaluacion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapreguntaSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepreguntaSubPreguntaEvaluacion = new JScrollPane(jTextAreapreguntaSubPreguntaEvaluacion);
		jscrollPanepreguntaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreguntaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreguntaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpreguntaSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapreguntaSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapreguntaSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"preguntaSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpreguntaSubPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_siSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelporcentaje_siSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI+" : *");
		this.jLabelporcentaje_siSubPreguntaEvaluacion.setToolTipText("Porcentaje Si");
		this.jLabelporcentaje_siSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_siSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_siSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_siSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_siSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_siSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelporcentaje_siSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jTextFieldporcentaje_siSubPreguntaEvaluacion= new JTextFieldMe();
		jTextFieldporcentaje_siSubPreguntaEvaluacion.setEnabled(false);
		jTextFieldporcentaje_siSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_siSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_siSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_siSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_siSubPreguntaEvaluacion.setText("0.0");

		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_siSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_siSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_siSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelcon_facturaSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelcon_facturaSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA+" : *");
		this.jLabelcon_facturaSubPreguntaEvaluacion.setToolTipText("Con Factura");
		this.jLabelcon_facturaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_facturaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_facturaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_facturaSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_facturaSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_facturaSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelcon_facturaSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jCheckBoxcon_facturaSubPreguntaEvaluacion= new JCheckBoxMe();
		jCheckBoxcon_facturaSubPreguntaEvaluacion.setEnabled(false);

		jCheckBoxcon_facturaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_facturaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_facturaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_facturaSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_facturaSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_facturaSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_facturaSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelcon_orden_compraSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelcon_orden_compraSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA+" : *");
		this.jLabelcon_orden_compraSubPreguntaEvaluacion.setToolTipText("Con Orden Compra");
		this.jLabelcon_orden_compraSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_orden_compraSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_orden_compraSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_orden_compraSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_orden_compraSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_orden_compraSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelcon_orden_compraSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jCheckBoxcon_orden_compraSubPreguntaEvaluacion= new JCheckBoxMe();
		jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setEnabled(false);

		jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_orden_compraSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_orden_compraSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_orden_compraSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_orden_compraSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelcon_completoSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelcon_completoSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO+" : *");
		this.jLabelcon_completoSubPreguntaEvaluacion.setToolTipText("Con Completo");
		this.jLabelcon_completoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_completoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_completoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_completoSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_completoSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_completoSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelcon_completoSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jCheckBoxcon_completoSubPreguntaEvaluacion= new JCheckBoxMe();
		jCheckBoxcon_completoSubPreguntaEvaluacion.setEnabled(false);

		jCheckBoxcon_completoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_completoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_completoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_completoSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_completoSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_completoSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_completoSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_completoSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_completoSubPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelcon_a_tiempoSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelcon_a_tiempoSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO+" : *");
		this.jLabelcon_a_tiempoSubPreguntaEvaluacion.setToolTipText("Con A Tiempo");
		this.jLabelcon_a_tiempoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_a_tiempoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_a_tiempoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_a_tiempoSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_a_tiempoSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_a_tiempoSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelcon_a_tiempoSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion= new JCheckBoxMe();
		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setEnabled(false);

		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_a_tiempoSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_a_tiempoSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSubPreguntaEvaluacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_empresaSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSubPreguntaEvaluacion.setToolTipText("Empresa");
		this.jLabelid_empresaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_empresaSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jComboBoxid_empresaSubPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_empresaSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSubPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_empresaSubPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_empresaSubPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_empresaSubPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSubPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubPreguntaEvaluacion"));

		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSubPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaSubPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_empresaSubPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_empresaSubPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSubPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubPreguntaEvaluacionUpdate"));



					
		this.jLabelid_sucursalSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_sucursalSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSubPreguntaEvaluacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_sucursalSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jComboBoxid_sucursalSubPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_sucursalSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSubPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_sucursalSubPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_sucursalSubPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSubPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSubPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSubPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_sucursalSubPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSubPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSubPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSubPreguntaEvaluacion"));

		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSubPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_sucursalSubPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSubPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_sucursalSubPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSubPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSubPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSubPreguntaEvaluacionUpdate"));



					
		this.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION+" : *");
		this.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion.setToolTipText("Pregunta Evaluacion");
		this.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_evaluacionSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_evaluacionSubPreguntaEvaluacion"));

		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_evaluacionSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_evaluacionSubPreguntaEvaluacionUpdate"));



					
		this.jLabelid_ejercicioSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_ejercicioSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioSubPreguntaEvaluacion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_ejercicioSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jComboBoxid_ejercicioSubPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_ejercicioSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioSubPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_ejercicioSubPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_ejercicioSubPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSubPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSubPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSubPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_ejercicioSubPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioSubPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSubPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSubPreguntaEvaluacion"));

		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSubPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSubPreguntaEvaluacionUpdate"));



					
		this.jLabelid_periodoSubPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_periodoSubPreguntaEvaluacion.setText(""+SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoSubPreguntaEvaluacion.setToolTipText("Periodo");
		this.jLabelid_periodoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoSubPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoSubPreguntaEvaluacion.setToolTipText(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_periodoSubPreguntaEvaluacion.setLayout(this.gridaBagLayoutSubPreguntaEvaluacion);


		jComboBoxid_periodoSubPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_periodoSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoSubPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_periodoSubPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_periodoSubPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSubPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSubPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSubPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_periodoSubPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoSubPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSubPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSubPreguntaEvaluacion"));

		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSubPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSubPreguntaEvaluacionBusqueda"));

		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoSubPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_periodoSubPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_periodoSubPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSubPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSubPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoSubPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_periodoSubPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoSubPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSubPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSubPreguntaEvaluacionUpdate"));



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
		//this.jInternalFrameDetalleSubPreguntaEvaluacion = new SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sub Pregunta Evaluacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubPreguntaEvaluacion= new GridBagLayout();
		

		
		String sToolTipSubPreguntaEvaluacion="";
		sToolTipSubPreguntaEvaluacion=SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubPreguntaEvaluacion+="(Cartera.SubPreguntaEvaluacion)";
		}
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubPreguntaEvaluacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonModificarSubPreguntaEvaluacion = new JButtonMe();
        this.jButtonActualizarSubPreguntaEvaluacion = new JButtonMe();
        this.jButtonEliminarSubPreguntaEvaluacion = new JButtonMe();
        this.jButtonCancelarSubPreguntaEvaluacion = new JButtonMe();
        this.jButtonGuardarCambiosSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarSubPreguntaEvaluacion = new JButtonMe();
		
		this.jScrollPanelDatosSubPreguntaEvaluacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionSubPreguntaEvaluacion = new JScrollPane();
		this.jScrollPanelDatosGeneralSubPreguntaEvaluacion = new JScrollPane();
				
		
		
		this.jPanelCamposSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Pregunta Evaluacion";
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Pregunta Evaluaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosSubPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSubPreguntaEvaluacion.setName("jPanelCamposSubPreguntaEvaluacion"); 

		this.jPanelCamposOcultosSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSubPreguntaEvaluacion.setName("jPanelCamposOcultosSubPreguntaEvaluacion"); 

        this.jPanelAccionesSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubPreguntaEvaluacion.setToolTipText("Acciones");
        this.jPanelAccionesSubPreguntaEvaluacion.setName("Acciones"); 

		this.jPanelAccionesFormularioSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSubPreguntaEvaluacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSubPreguntaEvaluacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSubPreguntaEvaluacion.setText("Nuevo");
		this.jButtonModificarSubPreguntaEvaluacion.setText("Editar");
        this.jButtonActualizarSubPreguntaEvaluacion.setText("Actualizar");
        this.jButtonEliminarSubPreguntaEvaluacion.setText("Eliminar");
        this.jButtonCancelarSubPreguntaEvaluacion.setText("Cancelar");
        this.jButtonGuardarCambiosSubPreguntaEvaluacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.setText("Guardar");
		this.jButtonCerrarSubPreguntaEvaluacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubPreguntaEvaluacion,"nuevo_button","Nuevo",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSubPreguntaEvaluacion,"modificar_button","Editar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSubPreguntaEvaluacion,"actualizar_button","Actualizar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSubPreguntaEvaluacion,"eliminar_button","Eliminar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSubPreguntaEvaluacion,"cancelar_button","Cancelar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSubPreguntaEvaluacion,"guardarcambios_button","Guardar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion,"guardarcambiostabla_button","Guardar",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubPreguntaEvaluacion,"cerrar_button","Salir",this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSubPreguntaEvaluacion.setToolTipText("Nuevo"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSubPreguntaEvaluacion.setToolTipText("Editar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSubPreguntaEvaluacion.setToolTipText("Actualizar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSubPreguntaEvaluacion.setToolTipText("Eliminar)"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSubPreguntaEvaluacion.setToolTipText("Cancelar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSubPreguntaEvaluacion.setToolTipText("Guardar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.setToolTipText("Guardar"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubPreguntaEvaluacion.setToolTipText("Salir"+" "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubPreguntaEvaluacion";
		inputMap = this.jButtonNuevoSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubPreguntaEvaluacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSubPreguntaEvaluacion";
		inputMap = this.jButtonActualizarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSubPreguntaEvaluacion"));
		
		//ELIMINAR
		sMapKey = "EliminarSubPreguntaEvaluacion";
		inputMap = this.jButtonEliminarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSubPreguntaEvaluacion"));
		
		//CANCELAR	
		sMapKey = "CancelarSubPreguntaEvaluacion";
		inputMap = this.jButtonCancelarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSubPreguntaEvaluacion"));
		
		//CERRAR		
		sMapKey = "CerrarSubPreguntaEvaluacion";
		inputMap = this.jButtonCerrarSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubPreguntaEvaluacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubPreguntaEvaluacion";
		inputMap = this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubPreguntaEvaluacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion.setToolTipText("Nuevo SubPreguntaEvaluacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion.setToolTipText("Sin Cerrar Ventana SubPreguntaEvaluacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSubPreguntaEvaluacion = new JLabelMe();
		
		this.jLabelAccionesSubPreguntaEvaluacion.setText("Acciones");		
		this.jLabelAccionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSubPreguntaEvaluacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSubPreguntaEvaluacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSubPreguntaEvaluacion=new JTabbedPane();
		this.jTabbedPaneRelacionesSubPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSubPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSubPreguntaEvaluacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSubPreguntaEvaluacion = new GridBagLayout();
		
		this.jPanelCamposSubPreguntaEvaluacion.setLayout(gridaBagLayoutCamposSubPreguntaEvaluacion);
		this.jPanelCamposOcultosSubPreguntaEvaluacion.setLayout(gridaBagLayoutCamposOcultosSubPreguntaEvaluacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSubPreguntaEvaluacion.add(jLabelIdSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSubPreguntaEvaluacion.add(jLabelidSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSubPreguntaEvaluacion.add(jLabelid_empresaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubPreguntaEvaluacion.add(jButtonid_empresaSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubPreguntaEvaluacion.add(jButtonid_empresaSubPreguntaEvaluacionUpdate, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSubPreguntaEvaluacion.add(jComboBoxid_empresaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSubPreguntaEvaluacion.add(jLabelid_sucursalSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSubPreguntaEvaluacion.add(jButtonid_sucursalSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSubPreguntaEvaluacion.add(jButtonid_sucursalSubPreguntaEvaluacionUpdate, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSubPreguntaEvaluacion.add(jComboBoxid_sucursalSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.add(jLabelid_pregunta_evaluacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.add(jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.add(jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.add(jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioSubPreguntaEvaluacion.add(jLabelid_ejercicioSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSubPreguntaEvaluacion.add(jButtonid_ejercicioSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSubPreguntaEvaluacion.add(jButtonid_ejercicioSubPreguntaEvaluacionUpdate, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioSubPreguntaEvaluacion.add(jComboBoxid_ejercicioSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoSubPreguntaEvaluacion.add(jLabelid_periodoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoSubPreguntaEvaluacion.add(jButtonid_periodoSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoSubPreguntaEvaluacion.add(jButtonid_periodoSubPreguntaEvaluacionUpdate, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoSubPreguntaEvaluacion.add(jComboBoxid_periodoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenSubPreguntaEvaluacion.add(jLabelordenSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenSubPreguntaEvaluacion.add(jButtonordenSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenSubPreguntaEvaluacion.add(jTextFieldordenSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpreguntaSubPreguntaEvaluacion.add(jLabelpreguntaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpreguntaSubPreguntaEvaluacion.add(jButtonpreguntaSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpreguntaSubPreguntaEvaluacion.add(jscrollPanepreguntaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_siSubPreguntaEvaluacion.add(jLabelporcentaje_siSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_siSubPreguntaEvaluacion.add(jButtonporcentaje_siSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_siSubPreguntaEvaluacion.add(jTextFieldporcentaje_siSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_facturaSubPreguntaEvaluacion.add(jLabelcon_facturaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_facturaSubPreguntaEvaluacion.add(jButtoncon_facturaSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_facturaSubPreguntaEvaluacion.add(jCheckBoxcon_facturaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_orden_compraSubPreguntaEvaluacion.add(jLabelcon_orden_compraSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_orden_compraSubPreguntaEvaluacion.add(jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_orden_compraSubPreguntaEvaluacion.add(jCheckBoxcon_orden_compraSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_completoSubPreguntaEvaluacion.add(jLabelcon_completoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_completoSubPreguntaEvaluacion.add(jButtoncon_completoSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_completoSubPreguntaEvaluacion.add(jCheckBoxcon_completoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_a_tiempoSubPreguntaEvaluacion.add(jLabelcon_a_tiempoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_a_tiempoSubPreguntaEvaluacion.add(jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda, this.gridBagConstraintsSubPreguntaEvaluacion);
	}

	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_a_tiempoSubPreguntaEvaluacion.add(jCheckBoxcon_a_tiempoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelidSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelordenSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelpreguntaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelporcentaje_siSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelcon_facturaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelcon_orden_compraSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelcon_completoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubPreguntaEvaluacion.add(this.jPanelcon_a_tiempoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposSubPreguntaEvaluacion=0;
		iYPanelCamposSubPreguntaEvaluacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposOcultosSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposOcultosSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubPreguntaEvaluacion.add(this.jPanelid_empresaSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposOcultosSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosSubPreguntaEvaluacion=0;
		iYPanelCamposOcultosSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposOcultosSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposOcultosSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubPreguntaEvaluacion.add(this.jPanelid_sucursalSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposOcultosSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosSubPreguntaEvaluacion=0;
		iYPanelCamposOcultosSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposOcultosSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposOcultosSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubPreguntaEvaluacion.add(this.jPanelid_ejercicioSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposOcultosSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosSubPreguntaEvaluacion=0;
		iYPanelCamposOcultosSubPreguntaEvaluacion++;
	}
	this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iYPanelCamposOcultosSubPreguntaEvaluacion;
	this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iXPanelCamposOcultosSubPreguntaEvaluacion++;
	this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubPreguntaEvaluacion.add(this.jPanelid_periodoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);



	if(iXPanelCamposOcultosSubPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosSubPreguntaEvaluacion=0;
		iYPanelCamposOcultosSubPreguntaEvaluacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesSubPreguntaEvaluacion= new GridBagLayout();
		this.jPanelAccionesSubPreguntaEvaluacion.setLayout(gridaBagLayoutAccionesSubPreguntaEvaluacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSubPreguntaEvaluacion= new GridBagLayout();
		this.jPanelAccionesFormularioSubPreguntaEvaluacion.setLayout(gridaBagLayoutAccionesFormularioSubPreguntaEvaluacion);
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubPreguntaEvaluacion.add(this.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubPreguntaEvaluacion.add(this.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubPreguntaEvaluacion.add(this.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubPreguntaEvaluacion.add(this.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesSubPreguntaEvaluacion.add(this.jButtonModificarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);							

		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesSubPreguntaEvaluacion.add(this.jButtonEliminarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubPreguntaEvaluacion.add(this.jButtonActualizarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);


		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubPreguntaEvaluacion.add(this.jButtonGuardarCambiosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);	
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = 0;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesSubPreguntaEvaluacion.add(this.jButtonCancelarSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubPreguntaEvaluacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubPreguntaEvaluacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();						
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;		
			//this.gridBagConstraintsSubPreguntaEvaluacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubPreguntaEvaluacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =0;
		this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubPreguntaEvaluacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSubPreguntaEvaluacion = new SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sub Pregunta Evaluacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sub Pregunta Evaluacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Pregunta Evaluacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SubPreguntaEvaluacionModel subpreguntaevaluacionModel=new SubPreguntaEvaluacionModel(this);
			
			//SI USARA CLASE INTERNA
			//SubPreguntaEvaluacionModel.SubPreguntaEvaluacionFocusTraversalPolicy subpreguntaevaluacionFocusTraversalPolicy = subpreguntaevaluacionModel.new SubPreguntaEvaluacionFocusTraversalPolicy(this);
			
			//subpreguntaevaluacionFocusTraversalPolicy.setsubpreguntaevaluacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(subpreguntaevaluacionModel);
			
			
			this.jContentPaneDetalleSubPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSubPreguntaEvaluacion = new GridBagLayout();	
			this.jContentPaneDetalleSubPreguntaEvaluacion.setLayout(gridaBagLayoutDetalleSubPreguntaEvaluacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubPreguntaEvaluacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
					
				
				this.jContentPaneDetalleSubPreguntaEvaluacion.add(jTtoolBarDetalleSubPreguntaEvaluacion, gridBagConstraintsSubPreguntaEvaluacion);								
				
}
			
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion=   new JScrollPane(jContentPaneDetalleSubPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	        
			this.jContentPaneDetalleSubPreguntaEvaluacion.add(jPanelCamposSubPreguntaEvaluacion, gridBagConstraintsSubPreguntaEvaluacion);
			
			
			
			
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
						&& subpreguntaevaluacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(this.puedeCargarPorParteDetalleEvaluacionProveedor,false,-1);
					
					if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSubPreguntaEvaluacion= new GridBagConstraints();
						this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
						this.jContentPaneDetalleSubPreguntaEvaluacion.add(this.jTabbedPaneRelacionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSubPreguntaEvaluacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSubPreguntaEvaluacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
					this.gridBagConstraintsSubPreguntaEvaluacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
					
				
					this.jContentPaneDetalleSubPreguntaEvaluacion.add(jPanelCamposOcultosSubPreguntaEvaluacion, gridBagConstraintsSubPreguntaEvaluacion);
				
					this.jPanelCamposOcultosSubPreguntaEvaluacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	        this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSubPreguntaEvaluacion.add(this.jPanelAccionesFormularioSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);							
			
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
	        this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
	        
			
			this.jContentPaneDetalleSubPreguntaEvaluacion.add(this.jPanelAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSubPreguntaEvaluacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion=   new JScrollPane(this.jPanelCamposSubPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
			this.gridBagConstraintsSubPreguntaEvaluacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSubPreguntaEvaluacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSubPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);			
			
			this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
			
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		
			
		this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsSubPreguntaEvaluacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubPreguntaEvaluacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubPreguntaEvaluacion, this.gridBagConstraintsSubPreguntaEvaluacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSubPreguntaEvaluacion;//jContentPane;
		
		return jScrollPanelDatosEdicionSubPreguntaEvaluacion;
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

				DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);

				this.detalleevaluacionproveedorBeanSwingJInternalFrame=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleevaluacionproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleevaluacionproveedorBeanSwingJInternalFrame.setdetalleevaluacionproveedorSessionBean(this.detalleevaluacionproveedorSessionBean);

				//this.gridBagConstraintsSubPreguntaEvaluacion = new GridBagConstraints();
				//this.gridBagConstraintsSubPreguntaEvaluacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubPreguntaEvaluacion.gridx = 0;
				//this.jContentPaneDetalleSubPreguntaEvaluacion.add(this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubPreguntaEvaluacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubPreguntaEvaluacion.add("Detalle Evaluacion Proveedores",this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubPreguntaEvaluacion.setComponentAt(iIndexTab,this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
				this.detalleevaluacionproveedorBeanSwingJInternalFrame=null;//new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleEvaluacionProveedor) {
					this.jTabbedPaneRelacionesSubPreguntaEvaluacion.add("Detalle Evaluacion Proveedores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleEvaluacionProveedorBeanSwingJInternalFrame(List<SubPreguntaEvaluacion> subpreguntaevaluacions,SubPreguntaEvaluacion subpreguntaevaluacion,DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleevaluacionproveedorBeanSwingJInternalFrame=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleevaluacionproveedorBeanSwingJInternalFrame.getDetalleEvaluacionProveedorLogic().setConnexion(this.subpreguntaevaluacionLogic.getConnexion());

					detalleevaluacionproveedorBeanSwingJInternalFrame.setsubpreguntaevaluacionsForeignKey(subpreguntaevaluacions);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setsubpreguntaevaluacionForeignKey(subpreguntaevaluacion);
					detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionSubPreguntaEvaluacion(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setlidSubPreguntaEvaluacionActual(subpreguntaevaluacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleevaluacionproveedorBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleEvaluacionProveedor(detalleevaluacionproveedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubPreguntaEvaluacion(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setid_sub_pregunta_evaluacionFK_IdSubPreguntaEvaluacion(subpreguntaevaluacion.getId());

					if(!this.conCargarFormDetalle) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleevaluacionproveedorBeanSwingJInternalFrame.setSelectedItemCombosFrameSubPreguntaEvaluacionForeignKey(subpreguntaevaluacion,1,false,true,true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleevaluacionproveedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubPreguntaEvaluacion");
					detalleevaluacionproveedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubPreguntaEvaluacion");
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
