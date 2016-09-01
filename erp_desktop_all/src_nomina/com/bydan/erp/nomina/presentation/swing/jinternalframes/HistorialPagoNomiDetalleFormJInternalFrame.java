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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.HistorialPagoNomiConstantesFunciones;

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
public class HistorialPagoNomiDetalleFormJInternalFrame extends HistorialPagoNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHistorialPagoNomi;
	
	protected JMenuBar jmenuBarDetalleHistorialPagoNomi;
	
	protected JMenu jmenuDetalleHistorialPagoNomi;
	protected JMenu jmenuDetalleArchivoHistorialPagoNomi;
	protected JMenu jmenuDetalleAccionesHistorialPagoNomi;
	protected JMenu jmenuDetalleDatosHistorialPagoNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialPagoNomi;	
	protected GridBagConstraints gridBagConstraintsHistorialPagoNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HistorialPagoNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleHistorialPagoNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public HistorialPagoNomiSessionBean historialpagonomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public HistorialPagoNomiLogic historialpagonomiLogic;
	
	public JScrollPane jScrollPanelDatosHistorialPagoNomi;
	public JScrollPane jScrollPanelDatosEdicionHistorialPagoNomi;
	public JScrollPane jScrollPanelDatosGeneralHistorialPagoNomi;
	
	protected JPanel jPanelCamposHistorialPagoNomi;    
	protected JPanel jPanelCamposOcultosHistorialPagoNomi;    	
	protected JPanel jPanelAccionesHistorialPagoNomi;
	protected JPanel jPanelAccionesFormularioHistorialPagoNomi;
    
	
	
	protected Integer iXPanelCamposHistorialPagoNomi=0;
	protected Integer iYPanelCamposHistorialPagoNomi=0;
	
	protected Integer iXPanelCamposOcultosHistorialPagoNomi=0;
	protected Integer iYPanelCamposOcultosHistorialPagoNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHistorialPagoNomi;
	public JButton jButtonModificarHistorialPagoNomi;
	public JButton jButtonActualizarHistorialPagoNomi;
    public JButton jButtonEliminarHistorialPagoNomi;
	public JButton jButtonCancelarHistorialPagoNomi;
    public JButton jButtonGuardarCambiosHistorialPagoNomi;
	public JButton jButtonGuardarCambiosTablaHistorialPagoNomi;
	protected JButton jButtonCerrarHistorialPagoNomi;
	
	
	protected JButton jButtonProcesarInformacionHistorialPagoNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHistorialPagoNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHistorialPagoNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHistorialPagoNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialPagoNomi;
	protected JButton jButtonModificarToolBarHistorialPagoNomi;
	protected JButton jButtonActualizarToolBarHistorialPagoNomi;
    protected JButton jButtonEliminarToolBarHistorialPagoNomi;
	protected JButton jButtonCancelarToolBarHistorialPagoNomi;
    protected JButton jButtonGuardarCambiosToolBarHistorialPagoNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarHistorialPagoNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialPagoNomi;
	protected JButton jButtonCerrarToolBarHistorialPagoNomi;
	
	protected JButton jButtonProcesarInformacionToolBarHistorialPagoNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialPagoNomi;
	protected JMenuItem jMenuItemModificarHistorialPagoNomi;
	protected JMenuItem jMenuItemActualizarHistorialPagoNomi;
    protected JMenuItem jMenuItemEliminarHistorialPagoNomi;
	protected JMenuItem jMenuItemCancelarHistorialPagoNomi;
    protected JMenuItem jMenuItemGuardarCambiosHistorialPagoNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialPagoNomi;
	protected JMenuItem jMenuItemCerrarHistorialPagoNomi;
	protected JMenuItem jMenuItemDetalleCerrarHistorialPagoNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialPagoNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionHistorialPagoNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialPagoNomi;
	protected JMenuItem jMenuItemMostrarOcultarHistorialPagoNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialPagoNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialPagoNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHistorialPagoNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHistorialPagoNomi;
	public JLabel jLabelIdHistorialPagoNomi;
	public JLabel jLabelidHistorialPagoNomi;
	public JButton jButtonidHistorialPagoNomiBusqueda= new JButtonMe();

	public JPanel jPanelvalorHistorialPagoNomi;
	public JLabel jLabelvalorHistorialPagoNomi;
	public JTextField jTextFieldvalorHistorialPagoNomi;
	public JButton jButtonvalorHistorialPagoNomiBusqueda= new JButtonMe();

	public JPanel jPanelfechaHistorialPagoNomi;
	public JLabel jLabelfechaHistorialPagoNomi;
	//public JFormattedTextField jDateChooserfechaHistorialPagoNomi;

	public JDateChooser jDateChooserfechaHistorialPagoNomi;
	public JButton jButtonfechaHistorialPagoNomiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_liquidacionHistorialPagoNomi;
	public JLabel jLabelfecha_liquidacionHistorialPagoNomi;
	//public JFormattedTextField jDateChooserfecha_liquidacionHistorialPagoNomi;

	public JDateChooser jDateChooserfecha_liquidacionHistorialPagoNomi;
	public JButton jButtonfecha_liquidacionHistorialPagoNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHistorialPagoNomi;
	public JLabel jLabelid_empresaHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHistorialPagoNomi;
	public JButton jButtonid_empresaHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_empresaHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaHistorialPagoNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraHistorialPagoNomi;
	public JLabel jLabelid_estructuraHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraHistorialPagoNomi;
	public JButton jButtonid_estructuraHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_estructuraHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_estructuraHistorialPagoNomiBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraHistorialPagoNomiArbol= new JButtonMe();

	public JPanel jPanelid_empleadoHistorialPagoNomi;
	public JLabel jLabelid_empleadoHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoHistorialPagoNomi;
	public JButton jButtonid_empleadoHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_empleadoHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoHistorialPagoNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaHistorialPagoNomi;
	public JLabel jLabelid_rubro_empleaHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaHistorialPagoNomi;
	public JButton jButtonid_rubro_empleaHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_rubro_empleaHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaHistorialPagoNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_mesHistorialPagoNomi;
	public JLabel jLabelid_mesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesHistorialPagoNomi;
	public JButton jButtonid_mesHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_mesHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_mesHistorialPagoNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHistorialPagoNomi;
	
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
	
	public HistorialPagoNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHistorialPagoNomi=new JPanel();
				this.jPanelAccionesFormularioHistorialPagoNomi=new JPanel();
				this.jmenuBarDetalleHistorialPagoNomi=new JMenuBar();
				this.jTtoolBarDetalleHistorialPagoNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HistorialPagoNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHistorialPagoNomi() {
		return this.jButtonActualizarToolBarHistorialPagoNomi;
	}
	
	public JButton getjButtonEliminarToolBarHistorialPagoNomi() {
		return this.jButtonEliminarToolBarHistorialPagoNomi;
	}
	
	public JButton getjButtonCancelarToolBarHistorialPagoNomi() {
		return this.jButtonCancelarToolBarHistorialPagoNomi;
	}		
	
	public JButton getjButtonProcesarInformacionHistorialPagoNomi() {
		return this.jButtonProcesarInformacionHistorialPagoNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialPagoNomi)	{
		this.jButtonProcesarInformacionHistorialPagoNomi = jButtonProcesarInformacionHistorialPagoNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialPagoNomi() {
		return this.jComboBoxTiposAccionesHistorialPagoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialPagoNomi(
			JComboBox jComboBoxTiposRelacionesHistorialPagoNomi) {
		this.jComboBoxTiposRelacionesHistorialPagoNomi = jComboBoxTiposRelacionesHistorialPagoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialPagoNomi(
			JComboBox jComboBoxTiposAccionesHistorialPagoNomi) {
		this.jComboBoxTiposAccionesHistorialPagoNomi = jComboBoxTiposAccionesHistorialPagoNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHistorialPagoNomi() {
		return this.jComboBoxTiposAccionesFormularioHistorialPagoNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHistorialPagoNomi(
			JComboBox jComboBoxTiposAccionesFormularioHistorialPagoNomi) {
		this.jComboBoxTiposAccionesFormularioHistorialPagoNomi = jComboBoxTiposAccionesFormularioHistorialPagoNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		
		this.historialpagonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialpagonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialpagonomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialPagoNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Pago Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
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
	
		HistorialPagoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHistorialPagoNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHistorialPagoNomi=new JButtonMe();
				this.jButtonModificarToolBarHistorialPagoNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHistorialPagoNomi,this.jTtoolBarDetalleHistorialPagoNomi,
							"actualizar","actualizar","Actualizar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHistorialPagoNomi,this.jTtoolBarDetalleHistorialPagoNomi,
							"eliminar","eliminar","Eliminar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHistorialPagoNomi,this.jTtoolBarDetalleHistorialPagoNomi,
							"cancelar","cancelar","Cancelar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHistorialPagoNomi,this.jTtoolBarDetalleHistorialPagoNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHistorialPagoNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHistorialPagoNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHistorialPagoNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHistorialPagoNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHistorialPagoNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialPagoNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialPagoNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialPagoNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHistorialPagoNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHistorialPagoNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHistorialPagoNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHistorialPagoNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHistorialPagoNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHistorialPagoNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHistorialPagoNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHistorialPagoNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHistorialPagoNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHistorialPagoNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHistorialPagoNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHistorialPagoNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHistorialPagoNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialPagoNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialPagoNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialPagoNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialPagoNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialPagoNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHistorialPagoNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHistorialPagoNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHistorialPagoNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialPagoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialPagoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialPagoNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialPagoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialPagoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialPagoNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHistorialPagoNomi.add(this.jMenuItemDetalleCerrarHistorialPagoNomi);
		
		this.jmenuDetalleAccionesHistorialPagoNomi.add(this.jMenuItemActualizarHistorialPagoNomi);
		this.jmenuDetalleAccionesHistorialPagoNomi.add(this.jMenuItemEliminarHistorialPagoNomi);
		this.jmenuDetalleAccionesHistorialPagoNomi.add(this.jMenuItemCancelarHistorialPagoNomi);		
		
		//this.jmenuDetalleDatosHistorialPagoNomi.add(this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi);				
		this.jmenuDetalleDatosHistorialPagoNomi.add(this.jMenuItemDetalleMostarOcultarHistorialPagoNomi);				
				
		//this.jmenuDetalleAccionesHistorialPagoNomi.add(this.jMenuItemGuardarCambiosHistorialPagoNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHistorialPagoNomi.add(this.jmenuDetalleArchivoHistorialPagoNomi);		
		this.jmenuBarDetalleHistorialPagoNomi.add(this.jmenuDetalleAccionesHistorialPagoNomi);		
		this.jmenuBarDetalleHistorialPagoNomi.add(this.jmenuDetalleDatosHistorialPagoNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHistorialPagoNomi);				
	}
	
	
	public void inicializarElementosCamposHistorialPagoNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHistorialPagoNomi = new JLabelMe();
		jLabelIdHistorialPagoNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHistorialPagoNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHistorialPagoNomi= new GridBagLayout();

		this.jPanelidHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);

		jLabelidHistorialPagoNomi = new JLabel();
		jLabelidHistorialPagoNomi.setText("Id");

		jLabelidHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorHistorialPagoNomi = new JLabelMe();
		this.jLabelvalorHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorHistorialPagoNomi.setToolTipText("Valor");
		this.jLabelvalorHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelvalorHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		jTextFieldvalorHistorialPagoNomi= new JTextFieldMe();
		jTextFieldvalorHistorialPagoNomi.setEnabled(false);
		jTextFieldvalorHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorHistorialPagoNomi.setText("0.0");

		this.jButtonvalorHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonvalorHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorHistorialPagoNomiBusqueda.setText("U");
		this.jButtonvalorHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorHistorialPagoNomiBusqueda.setVisible(false);		}


					
		this.jLabelfechaHistorialPagoNomi = new JLabelMe();
		this.jLabelfechaHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaHistorialPagoNomi.setToolTipText("Fecha");
		this.jLabelfechaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelfechaHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		//jFormattedTextFieldfechaHistorialPagoNomi= new JFormattedTextFieldMe();

		jDateChooserfechaHistorialPagoNomi= new JDateChooser();
		jDateChooserfechaHistorialPagoNomi.setEnabled(false);
		jDateChooserfechaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaHistorialPagoNomi.setDate(new Date());
		jDateChooserfechaHistorialPagoNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaHistorialPagoNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonfechaHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaHistorialPagoNomiBusqueda.setText("U");
		this.jButtonfechaHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaHistorialPagoNomiBusqueda.setVisible(false);		}


					
		this.jLabelfecha_liquidacionHistorialPagoNomi = new JLabelMe();
		this.jLabelfecha_liquidacionHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION+" : *");
		this.jLabelfecha_liquidacionHistorialPagoNomi.setToolTipText("Fecha Liquacion");
		this.jLabelfecha_liquidacionHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_liquidacionHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_liquidacionHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_liquidacionHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelfecha_liquidacionHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		//jFormattedTextFieldfecha_liquidacionHistorialPagoNomi= new JFormattedTextFieldMe();

		jDateChooserfecha_liquidacionHistorialPagoNomi= new JDateChooser();
		jDateChooserfecha_liquidacionHistorialPagoNomi.setEnabled(false);
		jDateChooserfecha_liquidacionHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_liquidacionHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_liquidacionHistorialPagoNomi.setDate(new Date());
		jDateChooserfecha_liquidacionHistorialPagoNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_liquidacionHistorialPagoNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setText("U");
		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_liquidacionHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_liquidacionHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_liquidacionHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHistorialPagoNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHistorialPagoNomi = new JLabelMe();
		this.jLabelid_empresaHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHistorialPagoNomi.setToolTipText("Empresa");
		this.jLabelid_empresaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelid_empresaHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		jComboBoxid_empresaHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_empresaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHistorialPagoNomi.setEnabled(false);

		this.jButtonid_empresaHistorialPagoNomi= new JButtonMe();
		this.jButtonid_empresaHistorialPagoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialPagoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialPagoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialPagoNomi.setText("Buscar");
		this.jButtonid_empresaHistorialPagoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHistorialPagoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialPagoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialPagoNomi"));

		this.jButtonid_empresaHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialPagoNomiBusqueda.setText("U");
		this.jButtonid_empresaHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHistorialPagoNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaHistorialPagoNomiUpdate= new JButtonMe();
		this.jButtonid_empresaHistorialPagoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialPagoNomiUpdate.setText("U");
		this.jButtonid_empresaHistorialPagoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHistorialPagoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialPagoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialPagoNomiUpdate"));



					
		this.jLabelid_estructuraHistorialPagoNomi = new JLabelMe();
		this.jLabelid_estructuraHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraHistorialPagoNomi.setToolTipText("Estructura");
		this.jLabelid_estructuraHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelid_estructuraHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		jComboBoxid_estructuraHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_estructuraHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraHistorialPagoNomi= new JButtonMe();
		this.jButtonid_estructuraHistorialPagoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraHistorialPagoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraHistorialPagoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraHistorialPagoNomi.setText("Buscar");
		this.jButtonid_estructuraHistorialPagoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraHistorialPagoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraHistorialPagoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraHistorialPagoNomi"));

		this.jButtonid_estructuraHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonid_estructuraHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraHistorialPagoNomiBusqueda.setText("U");
		this.jButtonid_estructuraHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraHistorialPagoNomiBusqueda.setVisible(false);		}

		this.jButtonid_estructuraHistorialPagoNomiUpdate= new JButtonMe();
		this.jButtonid_estructuraHistorialPagoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraHistorialPagoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraHistorialPagoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraHistorialPagoNomiUpdate.setText("U");
		this.jButtonid_estructuraHistorialPagoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraHistorialPagoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraHistorialPagoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraHistorialPagoNomiUpdate"));


		jButtonid_estructuraHistorialPagoNomiArbol= new JButtonMe();
		jButtonid_estructuraHistorialPagoNomiArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraHistorialPagoNomiArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraHistorialPagoNomiArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraHistorialPagoNomiArbol.setText("Arbol");
		jButtonid_estructuraHistorialPagoNomiArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraHistorialPagoNomiArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraHistorialPagoNomiArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraHistorialPagoNomiArbol"));



					
		this.jLabelid_empleadoHistorialPagoNomi = new JLabelMe();
		this.jLabelid_empleadoHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoHistorialPagoNomi.setToolTipText("Empleado");
		this.jLabelid_empleadoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelid_empleadoHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		jComboBoxid_empleadoHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_empleadoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoHistorialPagoNomi= new JButtonMe();
		this.jButtonid_empleadoHistorialPagoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoHistorialPagoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoHistorialPagoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoHistorialPagoNomi.setText("Buscar");
		this.jButtonid_empleadoHistorialPagoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoHistorialPagoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoHistorialPagoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoHistorialPagoNomi"));

		this.jButtonid_empleadoHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonid_empleadoHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoHistorialPagoNomiBusqueda.setText("U");
		this.jButtonid_empleadoHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoHistorialPagoNomiBusqueda.setVisible(false);		}

		this.jButtonid_empleadoHistorialPagoNomiUpdate= new JButtonMe();
		this.jButtonid_empleadoHistorialPagoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoHistorialPagoNomiUpdate.setText("U");
		this.jButtonid_empleadoHistorialPagoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoHistorialPagoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoHistorialPagoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoHistorialPagoNomiUpdate"));



					
		this.jLabelid_rubro_empleaHistorialPagoNomi = new JLabelMe();
		this.jLabelid_rubro_empleaHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaHistorialPagoNomi.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelid_rubro_empleaHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		jComboBoxid_rubro_empleaHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_rubro_empleaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaHistorialPagoNomi= new JButtonMe();
		this.jButtonid_rubro_empleaHistorialPagoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaHistorialPagoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaHistorialPagoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaHistorialPagoNomi.setText("Buscar");
		this.jButtonid_rubro_empleaHistorialPagoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaHistorialPagoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaHistorialPagoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaHistorialPagoNomi"));

		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setText("U");
		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaHistorialPagoNomiUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaHistorialPagoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaHistorialPagoNomiUpdate.setText("U");
		this.jButtonid_rubro_empleaHistorialPagoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaHistorialPagoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaHistorialPagoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaHistorialPagoNomiUpdate"));



					
		this.jLabelid_mesHistorialPagoNomi = new JLabelMe();
		this.jLabelid_mesHistorialPagoNomi.setText(""+HistorialPagoNomiConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesHistorialPagoNomi.setToolTipText("Mes");
		this.jLabelid_mesHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesHistorialPagoNomi.setToolTipText(HistorialPagoNomiConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		this.jPanelid_mesHistorialPagoNomi.setLayout(this.gridaBagLayoutHistorialPagoNomi);


		jComboBoxid_mesHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_mesHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesHistorialPagoNomi= new JButtonMe();
		this.jButtonid_mesHistorialPagoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialPagoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialPagoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialPagoNomi.setText("Buscar");
		this.jButtonid_mesHistorialPagoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesHistorialPagoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialPagoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialPagoNomi"));

		this.jButtonid_mesHistorialPagoNomiBusqueda= new JButtonMe();
		this.jButtonid_mesHistorialPagoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesHistorialPagoNomiBusqueda.setText("U");
		this.jButtonid_mesHistorialPagoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesHistorialPagoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialPagoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialPagoNomiBusqueda"));

		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesHistorialPagoNomiBusqueda.setVisible(false);		}

		this.jButtonid_mesHistorialPagoNomiUpdate= new JButtonMe();
		this.jButtonid_mesHistorialPagoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesHistorialPagoNomiUpdate.setText("U");
		this.jButtonid_mesHistorialPagoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesHistorialPagoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialPagoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialPagoNomiUpdate"));



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
		//this.jInternalFrameDetalleHistorialPagoNomi = new HistorialPagoNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Historial Pago Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialPagoNomi= new GridBagLayout();
		

		
		String sToolTipHistorialPagoNomi="";
		sToolTipHistorialPagoNomi=HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialPagoNomi+="(Nomina.HistorialPagoNomi)";
		}
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialPagoNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHistorialPagoNomi = new JButtonMe();
		this.jButtonModificarHistorialPagoNomi = new JButtonMe();
        this.jButtonActualizarHistorialPagoNomi = new JButtonMe();
        this.jButtonEliminarHistorialPagoNomi = new JButtonMe();
        this.jButtonCancelarHistorialPagoNomi = new JButtonMe();
        this.jButtonGuardarCambiosHistorialPagoNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaHistorialPagoNomi = new JButtonMe();
		this.jButtonCerrarHistorialPagoNomi = new JButtonMe();
		
		this.jScrollPanelDatosHistorialPagoNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionHistorialPagoNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralHistorialPagoNomi = new JScrollPane();
				
		
		
		this.jPanelCamposHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Pago Nomi";
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialPagoNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHistorialPagoNomi.setName("jPanelCamposHistorialPagoNomi"); 

		this.jPanelCamposOcultosHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHistorialPagoNomi.setName("jPanelCamposOcultosHistorialPagoNomi"); 

        this.jPanelAccionesHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialPagoNomi.setToolTipText("Acciones");
        this.jPanelAccionesHistorialPagoNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHistorialPagoNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHistorialPagoNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHistorialPagoNomi.setText("Nuevo");
		this.jButtonModificarHistorialPagoNomi.setText("Editar");
        this.jButtonActualizarHistorialPagoNomi.setText("Actualizar");
        this.jButtonEliminarHistorialPagoNomi.setText("Eliminar");
        this.jButtonCancelarHistorialPagoNomi.setText("Cancelar");
        this.jButtonGuardarCambiosHistorialPagoNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.setText("Guardar");
		this.jButtonCerrarHistorialPagoNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialPagoNomi,"nuevo_button","Nuevo",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHistorialPagoNomi,"modificar_button","Editar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHistorialPagoNomi,"actualizar_button","Actualizar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHistorialPagoNomi,"eliminar_button","Eliminar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHistorialPagoNomi,"cancelar_button","Cancelar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHistorialPagoNomi,"guardarcambios_button","Guardar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialPagoNomi,"guardarcambiostabla_button","Guardar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialPagoNomi,"cerrar_button","Salir",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHistorialPagoNomi.setToolTipText("Nuevo"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHistorialPagoNomi.setToolTipText("Editar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHistorialPagoNomi.setToolTipText("Actualizar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHistorialPagoNomi.setToolTipText("Eliminar)"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHistorialPagoNomi.setToolTipText("Cancelar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHistorialPagoNomi.setToolTipText("Guardar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.setToolTipText("Guardar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialPagoNomi.setToolTipText("Salir"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialPagoNomi";
		inputMap = this.jButtonNuevoHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialPagoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialPagoNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHistorialPagoNomi";
		inputMap = this.jButtonActualizarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHistorialPagoNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarHistorialPagoNomi";
		inputMap = this.jButtonEliminarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHistorialPagoNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarHistorialPagoNomi";
		inputMap = this.jButtonCancelarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHistorialPagoNomi"));
		
		//CERRAR		
		sMapKey = "CerrarHistorialPagoNomi";
		inputMap = this.jButtonCerrarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialPagoNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialPagoNomi";
		inputMap = this.jButtonGuardarCambiosTablaHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialPagoNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHistorialPagoNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHistorialPagoNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHistorialPagoNomi.setToolTipText("Nuevo HistorialPagoNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHistorialPagoNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHistorialPagoNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHistorialPagoNomi.setToolTipText("Sin Cerrar Ventana HistorialPagoNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHistorialPagoNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHistorialPagoNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHistorialPagoNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialPagoNomi.setText("Accion");
		this.jComboBoxTiposAccionesHistorialPagoNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHistorialPagoNomi = new JLabelMe();
		
		this.jLabelAccionesHistorialPagoNomi.setText("Acciones");		
		this.jLabelAccionesHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHistorialPagoNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHistorialPagoNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHistorialPagoNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHistorialPagoNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHistorialPagoNomi = new GridBagLayout();
		
		this.jPanelCamposHistorialPagoNomi.setLayout(gridaBagLayoutCamposHistorialPagoNomi);
		this.jPanelCamposOcultosHistorialPagoNomi.setLayout(gridaBagLayoutCamposOcultosHistorialPagoNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHistorialPagoNomi.add(jLabelIdHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHistorialPagoNomi.add(jLabelidHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHistorialPagoNomi.add(jLabelid_empresaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialPagoNomi.add(jButtonid_empresaHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialPagoNomi.add(jButtonid_empresaHistorialPagoNomiUpdate, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHistorialPagoNomi.add(jComboBoxid_empresaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraHistorialPagoNomi.add(jLabelid_estructuraHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraHistorialPagoNomi.add(jButtonid_estructuraHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraHistorialPagoNomi.add(jButtonid_estructuraHistorialPagoNomiUpdate, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraHistorialPagoNomi.add(jComboBoxid_estructuraHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoHistorialPagoNomi.add(jLabelid_empleadoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoHistorialPagoNomi.add(jButtonid_empleadoHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoHistorialPagoNomi.add(jButtonid_empleadoHistorialPagoNomiUpdate, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoHistorialPagoNomi.add(jComboBoxid_empleadoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaHistorialPagoNomi.add(jLabelid_rubro_empleaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaHistorialPagoNomi.add(jButtonid_rubro_empleaHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaHistorialPagoNomi.add(jButtonid_rubro_empleaHistorialPagoNomiUpdate, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaHistorialPagoNomi.add(jComboBoxid_rubro_empleaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesHistorialPagoNomi.add(jLabelid_mesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesHistorialPagoNomi.add(jButtonid_mesHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesHistorialPagoNomi.add(jButtonid_mesHistorialPagoNomiUpdate, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesHistorialPagoNomi.add(jComboBoxid_mesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorHistorialPagoNomi.add(jLabelvalorHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorHistorialPagoNomi.add(jButtonvalorHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorHistorialPagoNomi.add(jTextFieldvalorHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaHistorialPagoNomi.add(jLabelfechaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaHistorialPagoNomi.add(jButtonfechaHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaHistorialPagoNomi.add(jDateChooserfechaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_liquidacionHistorialPagoNomi.add(jLabelfecha_liquidacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_liquidacionHistorialPagoNomi.add(jButtonfecha_liquidacionHistorialPagoNomiBusqueda, this.gridBagConstraintsHistorialPagoNomi);
	}

	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_liquidacionHistorialPagoNomi.add(jDateChooserfecha_liquidacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelidHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelid_estructuraHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelid_empleadoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelid_rubro_empleaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelid_mesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelvalorHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelfechaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoNomi.add(this.jPanelfecha_liquidacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposHistorialPagoNomi % 1==0) {
		iXPanelCamposHistorialPagoNomi=0;
		iYPanelCamposHistorialPagoNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoNomi.gridy = iYPanelCamposOcultosHistorialPagoNomi;
	this.gridBagConstraintsHistorialPagoNomi.gridx = iXPanelCamposOcultosHistorialPagoNomi++;
	this.gridBagConstraintsHistorialPagoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialPagoNomi.add(this.jPanelid_empresaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);



	if(iXPanelCamposOcultosHistorialPagoNomi % 1==0) {
		iXPanelCamposOcultosHistorialPagoNomi=0;
		iYPanelCamposOcultosHistorialPagoNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesHistorialPagoNomi= new GridBagLayout();
		this.jPanelAccionesHistorialPagoNomi.setLayout(gridaBagLayoutAccionesHistorialPagoNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHistorialPagoNomi= new GridBagLayout();
		this.jPanelAccionesFormularioHistorialPagoNomi.setLayout(gridaBagLayoutAccionesFormularioHistorialPagoNomi);
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialPagoNomi.add(this.jComboBoxTiposAccionesFormularioHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialPagoNomi.add(this.jCheckBoxPostAccionNuevoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialPagoNomi.add(this.jCheckBoxPostAccionSinCerrarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialPagoNomi.add(this.jCheckBoxPostAccionSinMensajeHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesHistorialPagoNomi.add(this.jButtonModificarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);							

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesHistorialPagoNomi.add(this.jButtonEliminarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialPagoNomi.add(this.jButtonActualizarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialPagoNomi.add(this.jButtonGuardarCambiosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);	
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;		
		this.gridBagConstraintsHistorialPagoNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesHistorialPagoNomi.add(this.jButtonCancelarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialPagoNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();						
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;		
			//this.gridBagConstraintsHistorialPagoNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialPagoNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialPagoNomi.gridx =0;
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialPagoNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHistorialPagoNomi = new HistorialPagoNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Historial Pago Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Historial Pago Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Pago Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HistorialPagoNomiModel historialpagonomiModel=new HistorialPagoNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//HistorialPagoNomiModel.HistorialPagoNomiFocusTraversalPolicy historialpagonomiFocusTraversalPolicy = historialpagonomiModel.new HistorialPagoNomiFocusTraversalPolicy(this);
			
			//historialpagonomiFocusTraversalPolicy.sethistorialpagonomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(historialpagonomiModel);
			
			
			this.jContentPaneDetalleHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHistorialPagoNomi = new GridBagLayout();	
			this.jContentPaneDetalleHistorialPagoNomi.setLayout(gridaBagLayoutDetalleHistorialPagoNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialPagoNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
				this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
					
				
				this.jContentPaneDetalleHistorialPagoNomi.add(jTtoolBarDetalleHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);								
				
}
			
			this.jScrollPanelDatosEdicionHistorialPagoNomi=   new JScrollPane(jContentPaneDetalleHistorialPagoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialPagoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHistorialPagoNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialPagoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	        
			this.jContentPaneDetalleHistorialPagoNomi.add(jPanelCamposHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);
			
			
			
			
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
						&& historialpagonomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHistorialPagoNomi= new GridBagConstraints();
						this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
						this.jContentPaneDetalleHistorialPagoNomi.add(this.jTabbedPaneRelacionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHistorialPagoNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHistorialPagoNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
					this.gridBagConstraintsHistorialPagoNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
					
				
					this.jContentPaneDetalleHistorialPagoNomi.add(jPanelCamposOcultosHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);
				
					this.jPanelCamposOcultosHistorialPagoNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	        this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHistorialPagoNomi.add(this.jPanelAccionesFormularioHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);							
			
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
	        this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleHistorialPagoNomi.add(this.jPanelAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHistorialPagoNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHistorialPagoNomi=   new JScrollPane(this.jPanelCamposHistorialPagoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialPagoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHistorialPagoNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHistorialPagoNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionHistorialPagoNomi;
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
