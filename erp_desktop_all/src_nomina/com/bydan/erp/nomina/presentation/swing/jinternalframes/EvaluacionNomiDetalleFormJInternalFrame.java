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
import com.bydan.erp.nomina.util.EvaluacionNomiConstantesFunciones;

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
public class EvaluacionNomiDetalleFormJInternalFrame extends EvaluacionNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEvaluacionNomi;
	
	protected JMenuBar jmenuBarDetalleEvaluacionNomi;
	
	protected JMenu jmenuDetalleEvaluacionNomi;
	protected JMenu jmenuDetalleArchivoEvaluacionNomi;
	protected JMenu jmenuDetalleAccionesEvaluacionNomi;
	protected JMenu jmenuDetalleDatosEvaluacionNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionNomi;	
	protected GridBagConstraints gridBagConstraintsEvaluacionNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EvaluacionNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleEvaluacionNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoevaluadorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoevaluador="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public EvaluacionNomiSessionBean evaluacionnomiSessionBean;
	
	

	public DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;
	public DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleEvaluacionNomi=false;
	public DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoevaluadorSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public EstructuraSessionBean estructuraSessionBean;	
	
	public EvaluacionNomiLogic evaluacionnomiLogic;
	
	public JScrollPane jScrollPanelDatosEvaluacionNomi;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionNomi;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionNomi;
	
	protected JPanel jPanelCamposEvaluacionNomi;    
	protected JPanel jPanelCamposOcultosEvaluacionNomi;    	
	protected JPanel jPanelAccionesEvaluacionNomi;
	protected JPanel jPanelAccionesFormularioEvaluacionNomi;
    
	
	
	protected Integer iXPanelCamposEvaluacionNomi=0;
	protected Integer iYPanelCamposEvaluacionNomi=0;
	
	protected Integer iXPanelCamposOcultosEvaluacionNomi=0;
	protected Integer iYPanelCamposOcultosEvaluacionNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEvaluacionNomi;
	public JButton jButtonModificarEvaluacionNomi;
	public JButton jButtonActualizarEvaluacionNomi;
    public JButton jButtonEliminarEvaluacionNomi;
	public JButton jButtonCancelarEvaluacionNomi;
    public JButton jButtonGuardarCambiosEvaluacionNomi;
	public JButton jButtonGuardarCambiosTablaEvaluacionNomi;
	protected JButton jButtonCerrarEvaluacionNomi;
	
	
	protected JButton jButtonProcesarInformacionEvaluacionNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEvaluacionNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEvaluacionNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEvaluacionNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionNomi;
	protected JButton jButtonModificarToolBarEvaluacionNomi;
	protected JButton jButtonActualizarToolBarEvaluacionNomi;
    protected JButton jButtonEliminarToolBarEvaluacionNomi;
	protected JButton jButtonCancelarToolBarEvaluacionNomi;
    protected JButton jButtonGuardarCambiosToolBarEvaluacionNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarEvaluacionNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionNomi;
	protected JButton jButtonCerrarToolBarEvaluacionNomi;
	
	protected JButton jButtonProcesarInformacionToolBarEvaluacionNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionNomi;
	protected JMenuItem jMenuItemModificarEvaluacionNomi;
	protected JMenuItem jMenuItemActualizarEvaluacionNomi;
    protected JMenuItem jMenuItemEliminarEvaluacionNomi;
	protected JMenuItem jMenuItemCancelarEvaluacionNomi;
    protected JMenuItem jMenuItemGuardarCambiosEvaluacionNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionNomi;
	protected JMenuItem jMenuItemCerrarEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionNomi;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEvaluacionNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEvaluacionNomi;
	public JLabel jLabelIdEvaluacionNomi;
	public JLabel jLabelidEvaluacionNomi;
	public JButton jButtonidEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelfechaEvaluacionNomi;
	public JLabel jLabelfechaEvaluacionNomi;
	//public JFormattedTextField jDateChooserfechaEvaluacionNomi;

	public JDateChooser jDateChooserfechaEvaluacionNomi;
	public JButton jButtonfechaEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelinstruccionesEvaluacionNomi;
	public JLabel jLabelinstruccionesEvaluacionNomi;
	public JTextArea jTextAreainstruccionesEvaluacionNomi;
	public JScrollPane jscrollPaneinstruccionesEvaluacionNomi;
	public JButton jButtoninstruccionesEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEvaluacionNomi;
	public JLabel jLabeldescripcionEvaluacionNomi;
	public JTextArea jTextAreadescripcionEvaluacionNomi;
	public JScrollPane jscrollPanedescripcionEvaluacionNomi;
	public JButton jButtondescripcionEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion2EvaluacionNomi;
	public JLabel jLabeldescripcion2EvaluacionNomi;
	public JTextArea jTextAreadescripcion2EvaluacionNomi;
	public JScrollPane jscrollPanedescripcion2EvaluacionNomi;
	public JButton jButtondescripcion2EvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion3EvaluacionNomi;
	public JLabel jLabeldescripcion3EvaluacionNomi;
	public JTextArea jTextAreadescripcion3EvaluacionNomi;
	public JScrollPane jscrollPanedescripcion3EvaluacionNomi;
	public JButton jButtondescripcion3EvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion4EvaluacionNomi;
	public JLabel jLabeldescripcion4EvaluacionNomi;
	public JTextArea jTextAreadescripcion4EvaluacionNomi;
	public JScrollPane jscrollPanedescripcion4EvaluacionNomi;
	public JButton jButtondescripcion4EvaluacionNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEvaluacionNomi;
	public JLabel jLabelid_empresaEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEvaluacionNomi;
	public JButton jButtonid_empresaEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEvaluacionNomi;
	public JLabel jLabelid_sucursalEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEvaluacionNomi;
	public JButton jButtonid_sucursalEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioEvaluacionNomi;
	public JLabel jLabelid_ejercicioEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioEvaluacionNomi;
	public JButton jButtonid_ejercicioEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoEvaluacionNomi;
	public JLabel jLabelid_periodoEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoEvaluacionNomi;
	public JButton jButtonid_periodoEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_periodoEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_periodoEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEvaluacionNomi;
	public JLabel jLabelid_empleadoEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEvaluacionNomi;
	public JButton jButtonid_empleadoEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_empleadoEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_evaluadorEvaluacionNomi;
	public JLabel jLabelid_empleado_evaluadorEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_evaluadorEvaluacionNomi;
	public JButton jButtonid_empleado_evaluadorEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_empleado_evaluadorEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleado_evaluadorEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomiEvaluacionNomi;
	public JLabel jLabelid_formato_nomiEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiEvaluacionNomi;
	public JButton jButtonid_formato_nomiEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEvaluacionNomi;
	public JLabel jLabelid_estructuraEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEvaluacionNomi;
	public JButton jButtonid_estructuraEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionNomiBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionNomiArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEvaluacionNomi;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EvaluacionNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEvaluacionNomi=new JPanel();
				this.jPanelAccionesFormularioEvaluacionNomi=new JPanel();
				this.jmenuBarDetalleEvaluacionNomi=new JMenuBar();
				this.jTtoolBarDetalleEvaluacionNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEvaluacionNomi() {
		return this.jButtonActualizarToolBarEvaluacionNomi;
	}
	
	public JButton getjButtonEliminarToolBarEvaluacionNomi() {
		return this.jButtonEliminarToolBarEvaluacionNomi;
	}
	
	public JButton getjButtonCancelarToolBarEvaluacionNomi() {
		return this.jButtonCancelarToolBarEvaluacionNomi;
	}		
	
	public JButton getjButtonProcesarInformacionEvaluacionNomi() {
		return this.jButtonProcesarInformacionEvaluacionNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionNomi)	{
		this.jButtonProcesarInformacionEvaluacionNomi = jButtonProcesarInformacionEvaluacionNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionNomi() {
		return this.jComboBoxTiposAccionesEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionNomi(
			JComboBox jComboBoxTiposRelacionesEvaluacionNomi) {
		this.jComboBoxTiposRelacionesEvaluacionNomi = jComboBoxTiposRelacionesEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionNomi(
			JComboBox jComboBoxTiposAccionesEvaluacionNomi) {
		this.jComboBoxTiposAccionesEvaluacionNomi = jComboBoxTiposAccionesEvaluacionNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEvaluacionNomi() {
		return this.jComboBoxTiposAccionesFormularioEvaluacionNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEvaluacionNomi(
			JComboBox jComboBoxTiposAccionesFormularioEvaluacionNomi) {
		this.jComboBoxTiposAccionesFormularioEvaluacionNomi = jComboBoxTiposAccionesFormularioEvaluacionNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		
		this.evaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluacion Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEvaluacionNomi=new JButtonMe();
				this.jButtonModificarToolBarEvaluacionNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"actualizar","actualizar","Actualizar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"eliminar","eliminar","Eliminar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"cancelar","cancelar","Cancelar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEvaluacionNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEvaluacionNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEvaluacionNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEvaluacionNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEvaluacionNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEvaluacionNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEvaluacionNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEvaluacionNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEvaluacionNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEvaluacionNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEvaluacionNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEvaluacionNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEvaluacionNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEvaluacionNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEvaluacionNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEvaluacionNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEvaluacionNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEvaluacionNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEvaluacionNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEvaluacionNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEvaluacionNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEvaluacionNomi.add(this.jMenuItemDetalleCerrarEvaluacionNomi);
		
		this.jmenuDetalleAccionesEvaluacionNomi.add(this.jMenuItemActualizarEvaluacionNomi);
		this.jmenuDetalleAccionesEvaluacionNomi.add(this.jMenuItemEliminarEvaluacionNomi);
		this.jmenuDetalleAccionesEvaluacionNomi.add(this.jMenuItemCancelarEvaluacionNomi);		
		
		//this.jmenuDetalleDatosEvaluacionNomi.add(this.jMenuItemDetalleAbrirOrderByEvaluacionNomi);				
		this.jmenuDetalleDatosEvaluacionNomi.add(this.jMenuItemDetalleMostarOcultarEvaluacionNomi);				
				
		//this.jmenuDetalleAccionesEvaluacionNomi.add(this.jMenuItemGuardarCambiosEvaluacionNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuDetalleArchivoEvaluacionNomi);		
		this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuDetalleAccionesEvaluacionNomi);		
		this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuDetalleDatosEvaluacionNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEvaluacionNomi.add(this.jmenuDetalleEvaluacionNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEvaluacionNomi);				
	}
	
	
	public void inicializarElementosCamposEvaluacionNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEvaluacionNomi = new JLabelMe();
		jLabelIdEvaluacionNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEvaluacionNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEvaluacionNomi= new GridBagLayout();

		this.jPanelidEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);

		jLabelidEvaluacionNomi = new JLabel();
		jLabelidEvaluacionNomi.setText("Id");

		jLabelidEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaEvaluacionNomi = new JLabelMe();
		this.jLabelfechaEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaEvaluacionNomi.setToolTipText("Fecha");
		this.jLabelfechaEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelfechaEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		//jFormattedTextFieldfechaEvaluacionNomi= new JFormattedTextFieldMe();

		jDateChooserfechaEvaluacionNomi= new JDateChooser();
		jDateChooserfechaEvaluacionNomi.setEnabled(false);
		jDateChooserfechaEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaEvaluacionNomi.setDate(new Date());
		jDateChooserfechaEvaluacionNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaEvaluacionNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonfechaEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaEvaluacionNomiBusqueda.setText("U");
		this.jButtonfechaEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelinstruccionesEvaluacionNomi = new JLabelMe();
		this.jLabelinstruccionesEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES+" : *");
		this.jLabelinstruccionesEvaluacionNomi.setToolTipText("Instrucciones");
		this.jLabelinstruccionesEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinstruccionesEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinstruccionesEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinstruccionesEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinstruccionesEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinstruccionesEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelinstruccionesEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jTextAreainstruccionesEvaluacionNomi= new JTextAreaMe();
		jTextAreainstruccionesEvaluacionNomi.setEnabled(false);
		jTextAreainstruccionesEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreainstruccionesEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreainstruccionesEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreainstruccionesEvaluacionNomi.setLineWrap(true);
		jTextAreainstruccionesEvaluacionNomi.setWrapStyleWord(true);
		jTextAreainstruccionesEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreainstruccionesEvaluacionNomi.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreainstruccionesEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneinstruccionesEvaluacionNomi = new JScrollPane(jTextAreainstruccionesEvaluacionNomi);
		jscrollPaneinstruccionesEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneinstruccionesEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneinstruccionesEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtoninstruccionesEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoninstruccionesEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninstruccionesEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninstruccionesEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninstruccionesEvaluacionNomiBusqueda.setText("U");
		this.jButtoninstruccionesEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninstruccionesEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninstruccionesEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreainstruccionesEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreainstruccionesEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"instruccionesEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninstruccionesEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEvaluacionNomi = new JLabelMe();
		this.jLabeldescripcionEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEvaluacionNomi.setToolTipText("Descripcion");
		this.jLabeldescripcionEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPaneldescripcionEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jTextAreadescripcionEvaluacionNomi= new JTextAreaMe();
		jTextAreadescripcionEvaluacionNomi.setEnabled(false);
		jTextAreadescripcionEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEvaluacionNomi.setLineWrap(true);
		jTextAreadescripcionEvaluacionNomi.setWrapStyleWord(true);
		jTextAreadescripcionEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEvaluacionNomi.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEvaluacionNomi = new JScrollPane(jTextAreadescripcionEvaluacionNomi);
		jscrollPanedescripcionEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtondescripcionEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEvaluacionNomiBusqueda.setText("U");
		this.jButtondescripcionEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion2EvaluacionNomi = new JLabelMe();
		this.jLabeldescripcion2EvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2+" : *");
		this.jLabeldescripcion2EvaluacionNomi.setToolTipText("Descripcion2");
		this.jLabeldescripcion2EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion2EvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion2EvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion2EvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPaneldescripcion2EvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jTextAreadescripcion2EvaluacionNomi= new JTextAreaMe();
		jTextAreadescripcion2EvaluacionNomi.setEnabled(false);
		jTextAreadescripcion2EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2EvaluacionNomi.setLineWrap(true);
		jTextAreadescripcion2EvaluacionNomi.setWrapStyleWord(true);
		jTextAreadescripcion2EvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion2EvaluacionNomi.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion2EvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion2EvaluacionNomi = new JScrollPane(jTextAreadescripcion2EvaluacionNomi);
		jscrollPanedescripcion2EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion2EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion2EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion2EvaluacionNomiBusqueda= new JButtonMe();
		this.jButtondescripcion2EvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2EvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2EvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion2EvaluacionNomiBusqueda.setText("U");
		this.jButtondescripcion2EvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion2EvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion2EvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion2EvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion2EvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion2EvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion2EvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion3EvaluacionNomi = new JLabelMe();
		this.jLabeldescripcion3EvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3+" : *");
		this.jLabeldescripcion3EvaluacionNomi.setToolTipText("Descripcion3");
		this.jLabeldescripcion3EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion3EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion3EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion3EvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion3EvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion3EvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPaneldescripcion3EvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jTextAreadescripcion3EvaluacionNomi= new JTextAreaMe();
		jTextAreadescripcion3EvaluacionNomi.setEnabled(false);
		jTextAreadescripcion3EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion3EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion3EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion3EvaluacionNomi.setLineWrap(true);
		jTextAreadescripcion3EvaluacionNomi.setWrapStyleWord(true);
		jTextAreadescripcion3EvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion3EvaluacionNomi.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion3EvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion3EvaluacionNomi = new JScrollPane(jTextAreadescripcion3EvaluacionNomi);
		jscrollPanedescripcion3EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion3EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion3EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion3EvaluacionNomiBusqueda= new JButtonMe();
		this.jButtondescripcion3EvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion3EvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion3EvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion3EvaluacionNomiBusqueda.setText("U");
		this.jButtondescripcion3EvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion3EvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion3EvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion3EvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion3EvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion3EvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion3EvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion4EvaluacionNomi = new JLabelMe();
		this.jLabeldescripcion4EvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4+" : *");
		this.jLabeldescripcion4EvaluacionNomi.setToolTipText("Descripcion4");
		this.jLabeldescripcion4EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion4EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion4EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion4EvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion4EvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion4EvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPaneldescripcion4EvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jTextAreadescripcion4EvaluacionNomi= new JTextAreaMe();
		jTextAreadescripcion4EvaluacionNomi.setEnabled(false);
		jTextAreadescripcion4EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion4EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion4EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion4EvaluacionNomi.setLineWrap(true);
		jTextAreadescripcion4EvaluacionNomi.setWrapStyleWord(true);
		jTextAreadescripcion4EvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion4EvaluacionNomi.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion4EvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion4EvaluacionNomi = new JScrollPane(jTextAreadescripcion4EvaluacionNomi);
		jscrollPanedescripcion4EvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion4EvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion4EvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion4EvaluacionNomiBusqueda= new JButtonMe();
		this.jButtondescripcion4EvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion4EvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion4EvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion4EvaluacionNomiBusqueda.setText("U");
		this.jButtondescripcion4EvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion4EvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion4EvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion4EvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion4EvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion4EvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion4EvaluacionNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEvaluacionNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEvaluacionNomi = new JLabelMe();
		this.jLabelid_empresaEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEvaluacionNomi.setToolTipText("Empresa");
		this.jLabelid_empresaEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_empresaEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_empresaEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_empresaEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEvaluacionNomi.setEnabled(false);

		this.jButtonid_empresaEvaluacionNomi= new JButtonMe();
		this.jButtonid_empresaEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionNomi.setText("Buscar");
		this.jButtonid_empresaEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionNomi"));

		this.jButtonid_empresaEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_empresaEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_empresaEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionNomiUpdate.setText("U");
		this.jButtonid_empresaEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionNomiUpdate"));



					
		this.jLabelid_sucursalEvaluacionNomi = new JLabelMe();
		this.jLabelid_sucursalEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEvaluacionNomi.setToolTipText("Sucursal");
		this.jLabelid_sucursalEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_sucursalEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_sucursalEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_sucursalEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEvaluacionNomi.setEnabled(false);

		this.jButtonid_sucursalEvaluacionNomi= new JButtonMe();
		this.jButtonid_sucursalEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionNomi.setText("Buscar");
		this.jButtonid_sucursalEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionNomi"));

		this.jButtonid_sucursalEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_sucursalEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_sucursalEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_sucursalEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionNomiUpdate.setText("U");
		this.jButtonid_sucursalEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionNomiUpdate"));



					
		this.jLabelid_ejercicioEvaluacionNomi = new JLabelMe();
		this.jLabelid_ejercicioEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioEvaluacionNomi.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_ejercicioEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_ejercicioEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_ejercicioEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioEvaluacionNomi.setEnabled(false);

		this.jButtonid_ejercicioEvaluacionNomi= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionNomi.setText("Buscar");
		this.jButtonid_ejercicioEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionNomi"));

		this.jButtonid_ejercicioEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_ejercicioEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionNomiUpdate.setText("U");
		this.jButtonid_ejercicioEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionNomiUpdate"));



					
		this.jLabelid_periodoEvaluacionNomi = new JLabelMe();
		this.jLabelid_periodoEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoEvaluacionNomi.setToolTipText("Periodo");
		this.jLabelid_periodoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_periodoEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_periodoEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_periodoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoEvaluacionNomi.setEnabled(false);

		this.jButtonid_periodoEvaluacionNomi= new JButtonMe();
		this.jButtonid_periodoEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionNomi.setText("Buscar");
		this.jButtonid_periodoEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionNomi"));

		this.jButtonid_periodoEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_periodoEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_periodoEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_periodoEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_periodoEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEvaluacionNomiUpdate.setText("U");
		this.jButtonid_periodoEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionNomiUpdate"));



					
		this.jLabelid_empleadoEvaluacionNomi = new JLabelMe();
		this.jLabelid_empleadoEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEvaluacionNomi.setToolTipText("Empleado");
		this.jLabelid_empleadoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_empleadoEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_empleadoEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_empleadoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEvaluacionNomi= new JButtonMe();
		this.jButtonid_empleadoEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEvaluacionNomi.setText("Buscar");
		this.jButtonid_empleadoEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEvaluacionNomi"));

		this.jButtonid_empleadoEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_empleadoEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_empleadoEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_empleadoEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEvaluacionNomiUpdate.setText("U");
		this.jButtonid_empleadoEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEvaluacionNomiUpdate"));



					
		this.jLabelid_empleado_evaluadorEvaluacionNomi = new JLabelMe();
		this.jLabelid_empleado_evaluadorEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR+" : *");
		this.jLabelid_empleado_evaluadorEvaluacionNomi.setToolTipText("Empleado Evaluador");
		this.jLabelid_empleado_evaluadorEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_evaluadorEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_evaluadorEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_evaluadorEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_evaluadorEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_evaluadorEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_empleado_evaluadorEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_empleado_evaluadorEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_empleado_evaluadorEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluadorEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluadorEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_evaluadorEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_evaluadorEvaluacionNomi= new JButtonMe();
		this.jButtonid_empleado_evaluadorEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_evaluadorEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_evaluadorEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_evaluadorEvaluacionNomi.setText("Buscar");
		this.jButtonid_empleado_evaluadorEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_evaluadorEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_evaluadorEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_evaluadorEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_evaluadorEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_evaluadorEvaluacionNomi"));

		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_evaluadorEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_evaluadorEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_evaluadorEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.setText("U");
		this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_evaluadorEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_evaluadorEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_evaluadorEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_evaluadorEvaluacionNomiUpdate"));



					
		this.jLabelid_formato_nomiEvaluacionNomi = new JLabelMe();
		this.jLabelid_formato_nomiEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI+" : *");
		this.jLabelid_formato_nomiEvaluacionNomi.setToolTipText("Formato Nomi");
		this.jLabelid_formato_nomiEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomiEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomiEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_formato_nomiEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_formato_nomiEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomiEvaluacionNomi= new JButtonMe();
		this.jButtonid_formato_nomiEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiEvaluacionNomi.setText("Buscar");
		this.jButtonid_formato_nomiEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomiEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomiEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiEvaluacionNomi"));

		this.jButtonid_formato_nomiEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomiEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomiEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomiEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_formato_nomiEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiEvaluacionNomiUpdate.setText("U");
		this.jButtonid_formato_nomiEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomiEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomiEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiEvaluacionNomiUpdate"));



					
		this.jLabelid_estructuraEvaluacionNomi = new JLabelMe();
		this.jLabelid_estructuraEvaluacionNomi.setText(""+EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEvaluacionNomi.setToolTipText("Estructura");
		this.jLabelid_estructuraEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEvaluacionNomi.setToolTipText(EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		this.jPanelid_estructuraEvaluacionNomi.setLayout(this.gridaBagLayoutEvaluacionNomi);


		jComboBoxid_estructuraEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_estructuraEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEvaluacionNomi= new JButtonMe();
		this.jButtonid_estructuraEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionNomi.setText("Buscar");
		this.jButtonid_estructuraEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionNomi"));

		this.jButtonid_estructuraEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_estructuraEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_estructuraEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionNomiBusqueda"));

		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_estructuraEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionNomiUpdate.setText("U");
		this.jButtonid_estructuraEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionNomiUpdate"));


		jButtonid_estructuraEvaluacionNomiArbol= new JButtonMe();
		jButtonid_estructuraEvaluacionNomiArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEvaluacionNomiArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEvaluacionNomiArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEvaluacionNomiArbol.setText("Arbol");
		jButtonid_estructuraEvaluacionNomiArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEvaluacionNomiArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionNomiArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionNomiArbol"));



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
		//this.jInternalFrameDetalleEvaluacionNomi = new EvaluacionNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Evaluacion Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionNomi= new GridBagLayout();
		

		
		String sToolTipEvaluacionNomi="";
		sToolTipEvaluacionNomi=EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionNomi+="(Nomina.EvaluacionNomi)";
		}
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEvaluacionNomi = new JButtonMe();
		this.jButtonModificarEvaluacionNomi = new JButtonMe();
        this.jButtonActualizarEvaluacionNomi = new JButtonMe();
        this.jButtonEliminarEvaluacionNomi = new JButtonMe();
        this.jButtonCancelarEvaluacionNomi = new JButtonMe();
        this.jButtonGuardarCambiosEvaluacionNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarEvaluacionNomi = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionEvaluacionNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralEvaluacionNomi = new JScrollPane();
				
		
		
		this.jPanelCamposEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluacion Nomi";
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEvaluacionNomi.setName("jPanelCamposEvaluacionNomi"); 

		this.jPanelCamposOcultosEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEvaluacionNomi.setName("jPanelCamposOcultosEvaluacionNomi"); 

        this.jPanelAccionesEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionNomi.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEvaluacionNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEvaluacionNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEvaluacionNomi.setText("Nuevo");
		this.jButtonModificarEvaluacionNomi.setText("Editar");
        this.jButtonActualizarEvaluacionNomi.setText("Actualizar");
        this.jButtonEliminarEvaluacionNomi.setText("Eliminar");
        this.jButtonCancelarEvaluacionNomi.setText("Cancelar");
        this.jButtonGuardarCambiosEvaluacionNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaEvaluacionNomi.setText("Guardar");
		this.jButtonCerrarEvaluacionNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionNomi,"nuevo_button","Nuevo",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEvaluacionNomi,"modificar_button","Editar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEvaluacionNomi,"actualizar_button","Actualizar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEvaluacionNomi,"eliminar_button","Eliminar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEvaluacionNomi,"cancelar_button","Cancelar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEvaluacionNomi,"guardarcambios_button","Guardar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionNomi,"guardarcambiostabla_button","Guardar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionNomi,"cerrar_button","Salir",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEvaluacionNomi.setToolTipText("Nuevo"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEvaluacionNomi.setToolTipText("Editar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEvaluacionNomi.setToolTipText("Actualizar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEvaluacionNomi.setToolTipText("Eliminar)"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEvaluacionNomi.setToolTipText("Cancelar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEvaluacionNomi.setToolTipText("Guardar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEvaluacionNomi.setToolTipText("Guardar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionNomi.setToolTipText("Salir"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionNomi";
		inputMap = this.jButtonNuevoEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEvaluacionNomi";
		inputMap = this.jButtonActualizarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEvaluacionNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarEvaluacionNomi";
		inputMap = this.jButtonEliminarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEvaluacionNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarEvaluacionNomi";
		inputMap = this.jButtonCancelarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEvaluacionNomi"));
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionNomi";
		inputMap = this.jButtonCerrarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionNomi";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEvaluacionNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEvaluacionNomi.setToolTipText("Nuevo EvaluacionNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEvaluacionNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEvaluacionNomi.setToolTipText("Sin Cerrar Ventana EvaluacionNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEvaluacionNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEvaluacionNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEvaluacionNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEvaluacionNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEvaluacionNomi = new JLabelMe();
		
		this.jLabelAccionesEvaluacionNomi.setText("Acciones");		
		this.jLabelAccionesEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEvaluacionNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEvaluacionNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEvaluacionNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEvaluacionNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEvaluacionNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEvaluacionNomi = new GridBagLayout();
		
		this.jPanelCamposEvaluacionNomi.setLayout(gridaBagLayoutCamposEvaluacionNomi);
		this.jPanelCamposOcultosEvaluacionNomi.setLayout(gridaBagLayoutCamposOcultosEvaluacionNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEvaluacionNomi.add(jLabelIdEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEvaluacionNomi.add(jLabelidEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEvaluacionNomi.add(jLabelid_empresaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionNomi.add(jButtonid_empresaEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionNomi.add(jButtonid_empresaEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEvaluacionNomi.add(jComboBoxid_empresaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEvaluacionNomi.add(jLabelid_sucursalEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionNomi.add(jButtonid_sucursalEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionNomi.add(jButtonid_sucursalEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEvaluacionNomi.add(jComboBoxid_sucursalEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioEvaluacionNomi.add(jLabelid_ejercicioEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionNomi.add(jButtonid_ejercicioEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionNomi.add(jButtonid_ejercicioEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioEvaluacionNomi.add(jComboBoxid_ejercicioEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoEvaluacionNomi.add(jLabelid_periodoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEvaluacionNomi.add(jButtonid_periodoEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEvaluacionNomi.add(jButtonid_periodoEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoEvaluacionNomi.add(jComboBoxid_periodoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEvaluacionNomi.add(jLabelid_empleadoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEvaluacionNomi.add(jButtonid_empleadoEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEvaluacionNomi.add(jButtonid_empleadoEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEvaluacionNomi.add(jComboBoxid_empleadoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_evaluadorEvaluacionNomi.add(jLabelid_empleado_evaluadorEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_evaluadorEvaluacionNomi.add(jButtonid_empleado_evaluadorEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_evaluadorEvaluacionNomi.add(jButtonid_empleado_evaluadorEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_evaluadorEvaluacionNomi.add(jComboBoxid_empleado_evaluadorEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomiEvaluacionNomi.add(jLabelid_formato_nomiEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiEvaluacionNomi.add(jButtonid_formato_nomiEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiEvaluacionNomi.add(jButtonid_formato_nomiEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomiEvaluacionNomi.add(jComboBoxid_formato_nomiEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEvaluacionNomi.add(jLabelid_estructuraEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionNomi.add(jButtonid_estructuraEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionNomi.add(jButtonid_estructuraEvaluacionNomiUpdate, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEvaluacionNomi.add(jComboBoxid_estructuraEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaEvaluacionNomi.add(jLabelfechaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaEvaluacionNomi.add(jButtonfechaEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaEvaluacionNomi.add(jDateChooserfechaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinstruccionesEvaluacionNomi.add(jLabelinstruccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelinstruccionesEvaluacionNomi.add(jButtoninstruccionesEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinstruccionesEvaluacionNomi.add(jscrollPaneinstruccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEvaluacionNomi.add(jLabeldescripcionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEvaluacionNomi.add(jButtondescripcionEvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEvaluacionNomi.add(jscrollPanedescripcionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion2EvaluacionNomi.add(jLabeldescripcion2EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion2EvaluacionNomi.add(jButtondescripcion2EvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion2EvaluacionNomi.add(jscrollPanedescripcion2EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion3EvaluacionNomi.add(jLabeldescripcion3EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion3EvaluacionNomi.add(jButtondescripcion3EvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion3EvaluacionNomi.add(jscrollPanedescripcion3EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion4EvaluacionNomi.add(jLabeldescripcion4EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion4EvaluacionNomi.add(jButtondescripcion4EvaluacionNomiBusqueda, this.gridBagConstraintsEvaluacionNomi);
	}

	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion4EvaluacionNomi.add(jscrollPanedescripcion4EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelidEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelid_empleadoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelid_empleado_evaluadorEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelid_formato_nomiEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelid_estructuraEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelfechaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPanelinstruccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPaneldescripcionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPaneldescripcion2EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPaneldescripcion3EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionNomi.add(this.jPaneldescripcion4EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposEvaluacionNomi % 2==0) {
		iXPanelCamposEvaluacionNomi=0;
		iYPanelCamposEvaluacionNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposOcultosEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposOcultosEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionNomi.add(this.jPanelid_empresaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposOcultosEvaluacionNomi % 2==0) {
		iXPanelCamposOcultosEvaluacionNomi=0;
		iYPanelCamposOcultosEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposOcultosEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposOcultosEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionNomi.add(this.jPanelid_sucursalEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposOcultosEvaluacionNomi % 2==0) {
		iXPanelCamposOcultosEvaluacionNomi=0;
		iYPanelCamposOcultosEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposOcultosEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposOcultosEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionNomi.add(this.jPanelid_ejercicioEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposOcultosEvaluacionNomi % 2==0) {
		iXPanelCamposOcultosEvaluacionNomi=0;
		iYPanelCamposOcultosEvaluacionNomi++;
	}
	this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionNomi.gridy = iYPanelCamposOcultosEvaluacionNomi;
	this.gridBagConstraintsEvaluacionNomi.gridx = iXPanelCamposOcultosEvaluacionNomi++;
	this.gridBagConstraintsEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionNomi.add(this.jPanelid_periodoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);



	if(iXPanelCamposOcultosEvaluacionNomi % 2==0) {
		iXPanelCamposOcultosEvaluacionNomi=0;
		iYPanelCamposOcultosEvaluacionNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionNomi= new GridBagLayout();
		this.jPanelAccionesEvaluacionNomi.setLayout(gridaBagLayoutAccionesEvaluacionNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEvaluacionNomi= new GridBagLayout();
		this.jPanelAccionesFormularioEvaluacionNomi.setLayout(gridaBagLayoutAccionesFormularioEvaluacionNomi);
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionNomi.add(this.jComboBoxTiposAccionesFormularioEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionNomi.add(this.jCheckBoxPostAccionNuevoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEvaluacionNomi.add(this.jCheckBoxPostAccionSinCerrarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEvaluacionNomi.add(this.jCheckBoxPostAccionSinMensajeEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesEvaluacionNomi.add(this.jButtonModificarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);							

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesEvaluacionNomi.add(this.jButtonEliminarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
			
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionNomi.add(this.jButtonActualizarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);


		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionNomi.add(this.jButtonGuardarCambiosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);	
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;		
		this.gridBagConstraintsEvaluacionNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesEvaluacionNomi.add(this.jButtonCancelarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;		
			//this.gridBagConstraintsEvaluacionNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionNomi.gridx =0;
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEvaluacionNomi = new EvaluacionNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Evaluacion Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Evaluacion Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluacion Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EvaluacionNomiModel evaluacionnomiModel=new EvaluacionNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//EvaluacionNomiModel.EvaluacionNomiFocusTraversalPolicy evaluacionnomiFocusTraversalPolicy = evaluacionnomiModel.new EvaluacionNomiFocusTraversalPolicy(this);
			
			//evaluacionnomiFocusTraversalPolicy.setevaluacionnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(evaluacionnomiModel);
			
			
			this.jContentPaneDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();	
			this.jContentPaneDetalleEvaluacionNomi.setLayout(gridaBagLayoutDetalleEvaluacionNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEvaluacionNomi.gridx = 0;
					
				
				this.jContentPaneDetalleEvaluacionNomi.add(jTtoolBarDetalleEvaluacionNomi, gridBagConstraintsEvaluacionNomi);								
				
}
			
			this.jScrollPanelDatosEdicionEvaluacionNomi=   new JScrollPane(jContentPaneDetalleEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEvaluacionNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	        
			this.jContentPaneDetalleEvaluacionNomi.add(jPanelCamposEvaluacionNomi, gridBagConstraintsEvaluacionNomi);
			
			
			
			
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
						&& evaluacionnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(this.puedeCargarPorParteDetalleEvaluacionNomi,false,-1);
					
					if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEvaluacionNomi= new GridBagConstraints();
						this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEvaluacionNomi.gridx = 0;
						this.jContentPaneDetalleEvaluacionNomi.add(this.jTabbedPaneRelacionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEvaluacionNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEvaluacionNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
					this.gridBagConstraintsEvaluacionNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEvaluacionNomi.gridx = 0;
					
				
					this.jContentPaneDetalleEvaluacionNomi.add(jPanelCamposOcultosEvaluacionNomi, gridBagConstraintsEvaluacionNomi);
				
					this.jPanelCamposOcultosEvaluacionNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	        this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEvaluacionNomi.add(this.jPanelAccionesFormularioEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);							
			
			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
	        this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEvaluacionNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleEvaluacionNomi.add(this.jPanelAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEvaluacionNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEvaluacionNomi=   new JScrollPane(this.jPanelCamposEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEvaluacionNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
			
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
			
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEvaluacionNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionEvaluacionNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(false);
		this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);

		this.detalleevaluacionnomiBeanSwingJInternalFrame=null;//new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleevaluacionnomiBeanSwingJInternalFramePopup=new DetalleEvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleevaluacionnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {

				DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);

				this.detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleevaluacionnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleevaluacionnomiBeanSwingJInternalFrame.setdetalleevaluacionnomiSessionBean(this.detalleevaluacionnomiSessionBean);

				//this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
				//this.gridBagConstraintsEvaluacionNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEvaluacionNomi.gridx = 0;
				//this.jContentPaneDetalleEvaluacionNomi.add(this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEvaluacionNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEvaluacionNomi.add("Detalle Evaluacion Nomis",this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEvaluacionNomi.setComponentAt(iIndexTab,this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				this.detalleevaluacionnomiBeanSwingJInternalFrame=null;//new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleEvaluacionNomi) {
					this.jTabbedPaneRelacionesEvaluacionNomi.add("Detalle Evaluacion Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleEvaluacionNomiBeanSwingJInternalFrame(List<EvaluacionNomi> evaluacionnomis,EvaluacionNomi evaluacionnomi,DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleevaluacionnomiBeanSwingJInternalFrame.getDetalleEvaluacionNomiLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

					detalleevaluacionnomiBeanSwingJInternalFrame.setevaluacionnomisForeignKey(evaluacionnomis);
					detalleevaluacionnomiBeanSwingJInternalFrame.setevaluacionnomiForeignKey(evaluacionnomi);
					detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionEvaluacionNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setlidEvaluacionNomiActual(evaluacionnomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleevaluacionnomiBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleEvaluacionNomi(detalleevaluacionnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleevaluacionnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEvaluacionNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setid_evaluacion_nomiFK_IdEvaluacionNomi(evaluacionnomi.getId());

					if(!this.conCargarFormDetalle) {
						detalleevaluacionnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleevaluacionnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEvaluacionNomiForeignKey(evaluacionnomi,1,false,true,true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleevaluacionnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEvaluacionNomi");
					detalleevaluacionnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEvaluacionNomi");
					detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n",detalleevaluacionnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleevaluacionnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleevaluacionnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("relacionado");
					} else {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("no_relacionado");
					}

					detalleevaluacionnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleEvaluacionNomi().setVisible(false);

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
