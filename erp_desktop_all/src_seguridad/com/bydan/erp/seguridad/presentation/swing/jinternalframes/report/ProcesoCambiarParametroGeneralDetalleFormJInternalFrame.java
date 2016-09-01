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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.report.*;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarParametroGeneralConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.report.*;
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
public class ProcesoCambiarParametroGeneralDetalleFormJInternalFrame extends ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCambiarParametroGeneral;
	
	protected JMenuBar jmenuBarDetalleProcesoCambiarParametroGeneral;
	
	protected JMenu jmenuDetalleProcesoCambiarParametroGeneral;
	protected JMenu jmenuDetalleArchivoProcesoCambiarParametroGeneral;
	protected JMenu jmenuDetalleAccionesProcesoCambiarParametroGeneral;
	protected JMenu jmenuDetalleDatosProcesoCambiarParametroGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCambiarParametroGeneral;	
	protected GridBagConstraints gridBagConstraintsProcesoCambiarParametroGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCambiarParametroGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoVisualBeanSwingJInternalFrame tipovisualBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovisual="";

	protected TipoFondoBeanSwingJInternalFrame tipofondoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondo="";

	protected TipoFondoBeanSwingJInternalFrame tipofondobordeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondoborde="";

	protected TipoFondoControlBeanSwingJInternalFrame tipofondocontrolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondocontrol="";

	protected TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotamaniocontrol="";

	protected TipoExportarBeanSwingJInternalFrame tipoexportarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoexportar="";

	protected TipoDelimiterBeanSwingJInternalFrame tipodelimiterBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodelimiter="";
	
	public ProcesoCambiarParametroGeneralSessionBean procesocambiarparametrogeneralSessionBean;
	
	
	
	
	public TipoVisualSessionBean tipovisualSessionBean;
	public TipoFondoSessionBean tipofondoSessionBean;
	public TipoFondoSessionBean tipofondobordeSessionBean;
	public TipoFondoControlSessionBean tipofondocontrolSessionBean;
	public TipoTamanioControlSessionBean tipotamaniocontrolSessionBean;
	public TipoExportarSessionBean tipoexportarSessionBean;
	public TipoDelimiterSessionBean tipodelimiterSessionBean;	
	
	public ProcesoCambiarParametroGeneralLogic procesocambiarparametrogeneralLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCambiarParametroGeneral;
	public JScrollPane jScrollPanelDatosEdicionProcesoCambiarParametroGeneral;
	public JScrollPane jScrollPanelDatosGeneralProcesoCambiarParametroGeneral;
	
	protected JPanel jPanelCamposProcesoCambiarParametroGeneral;    
	protected JPanel jPanelCamposOcultosProcesoCambiarParametroGeneral;    	
	protected JPanel jPanelAccionesProcesoCambiarParametroGeneral;
	protected JPanel jPanelAccionesFormularioProcesoCambiarParametroGeneral;
    
	
	
	protected Integer iXPanelCamposProcesoCambiarParametroGeneral=0;
	protected Integer iYPanelCamposProcesoCambiarParametroGeneral=0;
	
	protected Integer iXPanelCamposOcultosProcesoCambiarParametroGeneral=0;
	protected Integer iYPanelCamposOcultosProcesoCambiarParametroGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCambiarParametroGeneral;
	public JButton jButtonModificarProcesoCambiarParametroGeneral;
	public JButton jButtonActualizarProcesoCambiarParametroGeneral;
    public JButton jButtonEliminarProcesoCambiarParametroGeneral;
	public JButton jButtonCancelarProcesoCambiarParametroGeneral;
    public JButton jButtonGuardarCambiosProcesoCambiarParametroGeneral;
	public JButton jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral;
	protected JButton jButtonCerrarProcesoCambiarParametroGeneral;
	
	
	protected JButton jButtonProcesarInformacionProcesoCambiarParametroGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonModificarToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonActualizarToolBarProcesoCambiarParametroGeneral;
    protected JButton jButtonEliminarToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonCancelarToolBarProcesoCambiarParametroGeneral;
    protected JButton jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCambiarParametroGeneral;
	protected JButton jButtonCerrarToolBarProcesoCambiarParametroGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCambiarParametroGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemModificarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemActualizarProcesoCambiarParametroGeneral;
    protected JMenuItem jMenuItemEliminarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemCancelarProcesoCambiarParametroGeneral;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemCerrarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCambiarParametroGeneral;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCambiarParametroGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCambiarParametroGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCambiarParametroGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCambiarParametroGeneral;
	public JLabel jLabelIdProcesoCambiarParametroGeneral;
	public JLabel jLabelidProcesoCambiarParametroGeneral;
	public JButton jButtonidProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral;
	public JLabel jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral;
	public JCheckBox jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral;
	public JButton jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcon_botones_tool_barProcesoCambiarParametroGeneral;
	public JLabel jLabelcon_botones_tool_barProcesoCambiarParametroGeneral;
	public JCheckBox jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral;
	public JButton jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral;
	public JLabel jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral;
	public JCheckBox jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral;
	public JButton jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelpath_exportarProcesoCambiarParametroGeneral;
	public JLabel jLabelpath_exportarProcesoCambiarParametroGeneral;
	public JTextArea jTextAreapath_exportarProcesoCambiarParametroGeneral;
	public JScrollPane jscrollPanepath_exportarProcesoCambiarParametroGeneral;
	public JButton jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_visualProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_visualProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_visualProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_visualProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fondoProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_fondoProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_fondoProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_exportarProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_exportarProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_exportarProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_delimiterProcesoCambiarParametroGeneral;
	public JLabel jLabelid_tipo_delimiterProcesoCambiarParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral;
	public JButton jButtonid_tipo_delimiterProcesoCambiarParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCambiarParametroGeneral;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCambiarParametroGeneral=new JPanel();
				this.jPanelAccionesFormularioProcesoCambiarParametroGeneral=new JPanel();
				this.jmenuBarDetalleProcesoCambiarParametroGeneral=new JMenuBar();
				this.jTtoolBarDetalleProcesoCambiarParametroGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarParametroGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCambiarParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCambiarParametroGeneral() {
		return this.jButtonActualizarToolBarProcesoCambiarParametroGeneral;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCambiarParametroGeneral() {
		return this.jButtonEliminarToolBarProcesoCambiarParametroGeneral;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCambiarParametroGeneral() {
		return this.jButtonCancelarToolBarProcesoCambiarParametroGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCambiarParametroGeneral() {
		return this.jButtonProcesarInformacionProcesoCambiarParametroGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCambiarParametroGeneral)	{
		this.jButtonProcesarInformacionProcesoCambiarParametroGeneral = jButtonProcesarInformacionProcesoCambiarParametroGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposRelacionesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposRelacionesProcesoCambiarParametroGeneral = jComboBoxTiposRelacionesProcesoCambiarParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposAccionesProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral = jComboBoxTiposAccionesProcesoCambiarParametroGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral() {
		return this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral) {
		this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral = jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocambiarparametrogeneralSessionBean=new ProcesoCambiarParametroGeneralSessionBean();
		
		this.procesocambiarparametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarparametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCambiarParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCambiarParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCambiarParametroGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cambiar Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCambiarParametroGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCambiarParametroGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCambiarParametroGeneral=new JButtonMe();
				this.jButtonModificarToolBarProcesoCambiarParametroGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCambiarParametroGeneral,this.jTtoolBarDetalleProcesoCambiarParametroGeneral,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCambiarParametroGeneral,this.jTtoolBarDetalleProcesoCambiarParametroGeneral,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCambiarParametroGeneral,this.jTtoolBarDetalleProcesoCambiarParametroGeneral,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCambiarParametroGeneral,this.jTtoolBarDetalleProcesoCambiarParametroGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCambiarParametroGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCambiarParametroGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCambiarParametroGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCambiarParametroGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCambiarParametroGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCambiarParametroGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCambiarParametroGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCambiarParametroGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCambiarParametroGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCambiarParametroGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCambiarParametroGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCambiarParametroGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCambiarParametroGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCambiarParametroGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCambiarParametroGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCambiarParametroGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCambiarParametroGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCambiarParametroGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCambiarParametroGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCambiarParametroGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCambiarParametroGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCambiarParametroGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCambiarParametroGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCambiarParametroGeneral.add(this.jMenuItemDetalleCerrarProcesoCambiarParametroGeneral);
		
		this.jmenuDetalleAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemActualizarProcesoCambiarParametroGeneral);
		this.jmenuDetalleAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemEliminarProcesoCambiarParametroGeneral);
		this.jmenuDetalleAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemCancelarProcesoCambiarParametroGeneral);		
		
		//this.jmenuDetalleDatosProcesoCambiarParametroGeneral.add(this.jMenuItemDetalleAbrirOrderByProcesoCambiarParametroGeneral);				
		this.jmenuDetalleDatosProcesoCambiarParametroGeneral.add(this.jMenuItemDetalleMostarOcultarProcesoCambiarParametroGeneral);				
				
		//this.jmenuDetalleAccionesProcesoCambiarParametroGeneral.add(this.jMenuItemGuardarCambiosProcesoCambiarParametroGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCambiarParametroGeneral.add(this.jmenuDetalleArchivoProcesoCambiarParametroGeneral);		
		this.jmenuBarDetalleProcesoCambiarParametroGeneral.add(this.jmenuDetalleAccionesProcesoCambiarParametroGeneral);		
		this.jmenuBarDetalleProcesoCambiarParametroGeneral.add(this.jmenuDetalleDatosProcesoCambiarParametroGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCambiarParametroGeneral);				
	}
	
	
	public void inicializarElementosCamposProcesoCambiarParametroGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCambiarParametroGeneral = new JLabelMe();
		jLabelIdProcesoCambiarParametroGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCambiarParametroGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCambiarParametroGeneral= new GridBagLayout();

		this.jPanelidProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);

		jLabelidProcesoCambiarParametroGeneral = new JLabel();
		jLabelidProcesoCambiarParametroGeneral.setText("Id");

		jLabelidProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION+" : *");
		this.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setToolTipText("Con Mensaje Confirmacion");
		this.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONMENSAJECONFIRMACION);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral= new JCheckBoxMe();
		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setEnabled(false);

		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR+" : *");
		this.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral.setToolTipText("Con Botones Tool Bar");
		this.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_botones_tool_barProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_botones_tool_barProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONBOTONESTOOLBAR);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral= new JCheckBoxMe();
		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setEnabled(false);

		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_botones_tool_barProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA+" : *");
		this.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setToolTipText("Con Exportar Cabecera");
		this.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_CONEXPORTARCABECERA);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral= new JCheckBoxMe();
		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setEnabled(false);

		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelpath_exportarProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelpath_exportarProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR+" : *");
		this.jLabelpath_exportarProcesoCambiarParametroGeneral.setToolTipText("Path Exportar");
		this.jLabelpath_exportarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_exportarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_exportarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_exportarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_exportarProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_exportarProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_PATHEXPORTAR);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelpath_exportarProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jTextAreapath_exportarProcesoCambiarParametroGeneral= new JTextAreaMe();
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setEnabled(false);
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setLineWrap(true);
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setWrapStyleWord(true);
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_exportarProcesoCambiarParametroGeneral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreapath_exportarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_exportarProcesoCambiarParametroGeneral = new JScrollPane(jTextAreapath_exportarProcesoCambiarParametroGeneral);
		jscrollPanepath_exportarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_exportarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_exportarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_exportarProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_exportarProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_exportarProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCambiarParametroGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_visualProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_visualProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL+" : *");
		this.jLabelid_tipo_visualProcesoCambiarParametroGeneral.setToolTipText("Tipo Visual");
		this.jLabelid_tipo_visualProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_visualProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_visualProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_visualProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_visualProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_visualProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOVISUAL);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_visualProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_visualProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_visualProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_visualProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_visualProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_visualProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_visualProcesoCambiarParametroGeneralUpdate"));



					
		this.jLabelid_tipo_fondoProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_fondoProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO+" : *");
		this.jLabelid_tipo_fondoProcesoCambiarParametroGeneral.setToolTipText("Tipo Fondo");
		this.jLabelid_tipo_fondoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_fondoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_fondoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondoProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDO);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondoProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoProcesoCambiarParametroGeneralUpdate"));



					
		this.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE+" : *");
		this.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setToolTipText("Tipo Fondo Borde");
		this.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOBORDE);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate"));



					
		this.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL+" : *");
		this.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setToolTipText("Tipo Fondo Control");
		this.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOFONDOCONTROL);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate"));



					
		this.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL+" : *");
		this.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setToolTipText("Tipo Tamanio Control");
		this.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROL);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate"));



					
		this.jLabelid_tipo_exportarProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_exportarProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR+" : *");
		this.jLabelid_tipo_exportarProcesoCambiarParametroGeneral.setToolTipText("Tipo Exportar");
		this.jLabelid_tipo_exportarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_exportarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_exportarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_exportarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPOEXPORTAR);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_exportarProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_exportarProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_exportarProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_exportarProcesoCambiarParametroGeneralUpdate"));



					
		this.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral.setText(""+ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER+" : *");
		this.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral.setToolTipText("Tipo Delimiter");
		this.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_delimiterProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_delimiterProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.setToolTipText(ProcesoCambiarParametroGeneralConstantesFunciones.LABEL_IDTIPODELIMITER);
		this.gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.setLayout(this.gridaBagLayoutProcesoCambiarParametroGeneral);


		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral.setText("Procesar");
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneral,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_delimiterProcesoCambiarParametroGeneral"));

		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_delimiterProcesoCambiarParametroGeneralBusqueda"));

		if(this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_delimiterProcesoCambiarParametroGeneralUpdate"));



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
		//this.jInternalFrameDetalleProcesoCambiarParametroGeneral = new ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cambiar Parametro General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCambiarParametroGeneral= new GridBagLayout();
		

		
		String sToolTipProcesoCambiarParametroGeneral="";
		sToolTipProcesoCambiarParametroGeneral=ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCambiarParametroGeneral+="(Seguridad.ProcesoCambiarParametroGeneral)";
		}
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCambiarParametroGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonModificarProcesoCambiarParametroGeneral = new JButtonMe();
        this.jButtonActualizarProcesoCambiarParametroGeneral = new JButtonMe();
        this.jButtonEliminarProcesoCambiarParametroGeneral = new JButtonMe();
        this.jButtonCancelarProcesoCambiarParametroGeneral = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral = new JButtonMe();
		this.jButtonCerrarProcesoCambiarParametroGeneral = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cambiar Parametro General";
		
		if(!this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Parametro Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCambiarParametroGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCambiarParametroGeneral.setName("jPanelCamposProcesoCambiarParametroGeneral"); 

		this.jPanelCamposOcultosProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCambiarParametroGeneral.setName("jPanelCamposOcultosProcesoCambiarParametroGeneral"); 

        this.jPanelAccionesProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCambiarParametroGeneral.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCambiarParametroGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCambiarParametroGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCambiarParametroGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCambiarParametroGeneral.setText("Nuevo");
		this.jButtonModificarProcesoCambiarParametroGeneral.setText("Editar");
        this.jButtonActualizarProcesoCambiarParametroGeneral.setText("Actualizar");
        this.jButtonEliminarProcesoCambiarParametroGeneral.setText("Eliminar");
        this.jButtonCancelarProcesoCambiarParametroGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCambiarParametroGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.setText("Guardar");
		this.jButtonCerrarProcesoCambiarParametroGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCambiarParametroGeneral,"nuevo_button","Nuevo",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCambiarParametroGeneral,"modificar_button","Editar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCambiarParametroGeneral,"actualizar_button","Actualizar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCambiarParametroGeneral,"eliminar_button","Eliminar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCambiarParametroGeneral,"cancelar_button","Cancelar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCambiarParametroGeneral,"guardarcambios_button","Guardar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral,"guardarcambiostabla_button","Guardar",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCambiarParametroGeneral,"cerrar_button","Salir",this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCambiarParametroGeneral.setToolTipText("Nuevo"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCambiarParametroGeneral.setToolTipText("Editar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCambiarParametroGeneral.setToolTipText("Actualizar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCambiarParametroGeneral.setToolTipText("Eliminar)"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCambiarParametroGeneral.setToolTipText("Cancelar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCambiarParametroGeneral.setToolTipText("Guardar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.setToolTipText("Guardar"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCambiarParametroGeneral.setToolTipText("Salir"+" "+ProcesoCambiarParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCambiarParametroGeneral";
		inputMap = this.jButtonNuevoProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCambiarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCambiarParametroGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonActualizarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCambiarParametroGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonEliminarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCambiarParametroGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonCancelarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCambiarParametroGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCambiarParametroGeneral";
		inputMap = this.jButtonCerrarProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCambiarParametroGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCambiarParametroGeneral";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCambiarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCambiarParametroGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral.setToolTipText("Nuevo ProcesoCambiarParametroGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral.setToolTipText("Sin Cerrar Ventana ProcesoCambiarParametroGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCambiarParametroGeneral = new JLabelMe();
		
		this.jLabelAccionesProcesoCambiarParametroGeneral.setText("Acciones");		
		this.jLabelAccionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCambiarParametroGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCambiarParametroGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCambiarParametroGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCambiarParametroGeneral = new GridBagLayout();
		
		this.jPanelCamposProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutCamposProcesoCambiarParametroGeneral);
		this.jPanelCamposOcultosProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutCamposOcultosProcesoCambiarParametroGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCambiarParametroGeneral.add(jLabelIdProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCambiarParametroGeneral.add(jLabelidProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_visualProcesoCambiarParametroGeneral.add(jLabelid_tipo_visualProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_visualProcesoCambiarParametroGeneral.add(jButtonid_tipo_visualProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_visualProcesoCambiarParametroGeneral.add(jButtonid_tipo_visualProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_visualProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_visualProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.add(jLabelid_tipo_fondoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.add(jButtonid_tipo_fondoProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.add(jButtonid_tipo_fondoProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_fondoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.add(jLabelid_tipo_fondo_bordeProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.add(jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.add(jButtonid_tipo_fondo_bordeProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_fondo_bordeProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.add(jLabelid_tipo_fondo_controlProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.add(jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.add(jButtonid_tipo_fondo_controlProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_fondo_controlProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.add(jLabelid_tipo_tamanio_controlProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.add(jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.add(jButtonid_tipo_tamanio_controlProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_tamanio_controlProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.add(jLabelcon_mensaje_confirmacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.add(jButtoncon_mensaje_confirmacionProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral.add(jCheckBoxcon_mensaje_confirmacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral.add(jLabelcon_botones_tool_barProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral.add(jButtoncon_botones_tool_barProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral.add(jCheckBoxcon_botones_tool_barProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.add(jLabelid_tipo_exportarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.add(jButtonid_tipo_exportarProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.add(jButtonid_tipo_exportarProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_exportarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.add(jLabelid_tipo_delimiterProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.add(jButtonid_tipo_delimiterProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 3;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.add(jButtonid_tipo_delimiterProcesoCambiarParametroGeneralUpdate, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral.add(jComboBoxid_tipo_delimiterProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral.add(jLabelcon_exportar_cabeceraProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral.add(jButtoncon_exportar_cabeceraProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral.add(jCheckBoxcon_exportar_cabeceraProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_exportarProcesoCambiarParametroGeneral.add(jLabelpath_exportarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 2;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_exportarProcesoCambiarParametroGeneral.add(jButtonpath_exportarProcesoCambiarParametroGeneralBusqueda, this.gridBagConstraintsProcesoCambiarParametroGeneral);
	}

	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 1;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_exportarProcesoCambiarParametroGeneral.add(jscrollPanepath_exportarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelidProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_visualProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_fondoProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_fondo_bordeProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_fondo_controlProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_tamanio_controlProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelcon_mensaje_confirmacionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelcon_botones_tool_barProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_exportarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelid_tipo_delimiterProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelcon_exportar_cabeceraProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
	this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iYPanelCamposProcesoCambiarParametroGeneral;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iXPanelCamposProcesoCambiarParametroGeneral++;
	this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarParametroGeneral.add(this.jPanelpath_exportarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);



	if(iXPanelCamposProcesoCambiarParametroGeneral % 1==0) {
		iXPanelCamposProcesoCambiarParametroGeneral=0;
		iYPanelCamposProcesoCambiarParametroGeneral++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCambiarParametroGeneral= new GridBagLayout();
		this.jPanelAccionesProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutAccionesProcesoCambiarParametroGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCambiarParametroGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutAccionesFormularioProcesoCambiarParametroGeneral);
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCambiarParametroGeneral.add(this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCambiarParametroGeneral.add(this.jButtonModificarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);							

		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCambiarParametroGeneral.add(this.jButtonEliminarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
			
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarParametroGeneral.add(this.jButtonActualizarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);


		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarParametroGeneral.add(this.jButtonGuardarCambiosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);	
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarParametroGeneral.add(this.jButtonCancelarProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCambiarParametroGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCambiarParametroGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocambiarparametrogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;		
			//this.gridBagConstraintsProcesoCambiarParametroGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCambiarParametroGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =0;
		this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCambiarParametroGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCambiarParametroGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCambiarParametroGeneral = new ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cambiar Parametro General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Cambiar Parametro General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cambiar Parametro General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCambiarParametroGeneralModel procesocambiarparametrogeneralModel=new ProcesoCambiarParametroGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCambiarParametroGeneralModel.ProcesoCambiarParametroGeneralFocusTraversalPolicy procesocambiarparametrogeneralFocusTraversalPolicy = procesocambiarparametrogeneralModel.new ProcesoCambiarParametroGeneralFocusTraversalPolicy(this);
			
			//procesocambiarparametrogeneralFocusTraversalPolicy.setprocesocambiarparametrogeneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocambiarparametrogeneralModel);
			
			
			this.jContentPaneDetalleProcesoCambiarParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCambiarParametroGeneral = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCambiarParametroGeneral.setLayout(gridaBagLayoutDetalleProcesoCambiarParametroGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCambiarParametroGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
				this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCambiarParametroGeneral.add(jTtoolBarDetalleProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral=   new JScrollPane(jContentPaneDetalleProcesoCambiarParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCambiarParametroGeneral.add(jPanelCamposProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);
			
			
			
			
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
						//&& procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocambiarparametrogeneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCambiarParametroGeneral= new GridBagConstraints();
						this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
						this.jContentPaneDetalleProcesoCambiarParametroGeneral.add(this.jTabbedPaneRelacionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCambiarParametroGeneral.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCambiarParametroGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
					this.gridBagConstraintsProcesoCambiarParametroGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCambiarParametroGeneral.add(jPanelCamposOcultosProcesoCambiarParametroGeneral, gridBagConstraintsProcesoCambiarParametroGeneral);
				
					this.jPanelCamposOcultosProcesoCambiarParametroGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	        this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCambiarParametroGeneral.add(this.jPanelAccionesFormularioProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);							
			
			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCambiarParametroGeneral.add(this.jPanelAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCambiarParametroGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral=   new JScrollPane(this.jPanelCamposProcesoCambiarParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCambiarParametroGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);			
			
			this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
			
			
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		
			
		this.gridBagConstraintsProcesoCambiarParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarParametroGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCambiarParametroGeneral, this.gridBagConstraintsProcesoCambiarParametroGeneral);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCambiarParametroGeneral.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCambiarParametroGeneral.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarParametroGeneral.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCambiarParametroGeneral.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCambiarParametroGeneral.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCambiarParametroGeneral.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCambiarParametroGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCambiarParametroGeneral;
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
