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
import com.bydan.erp.nomina.util.HistorialPagoMesNomiConstantesFunciones;

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
public class HistorialPagoMesNomiDetalleFormJInternalFrame extends HistorialPagoMesNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHistorialPagoMesNomi;
	
	protected JMenuBar jmenuBarDetalleHistorialPagoMesNomi;
	
	protected JMenu jmenuDetalleHistorialPagoMesNomi;
	protected JMenu jmenuDetalleArchivoHistorialPagoMesNomi;
	protected JMenu jmenuDetalleAccionesHistorialPagoMesNomi;
	protected JMenu jmenuDetalleDatosHistorialPagoMesNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialPagoMesNomi;	
	protected GridBagConstraints gridBagConstraintsHistorialPagoMesNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HistorialPagoMesNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleHistorialPagoMesNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public HistorialPagoMesNomiLogic historialpagomesnomiLogic;
	
	public JScrollPane jScrollPanelDatosHistorialPagoMesNomi;
	public JScrollPane jScrollPanelDatosEdicionHistorialPagoMesNomi;
	public JScrollPane jScrollPanelDatosGeneralHistorialPagoMesNomi;
	
	protected JPanel jPanelCamposHistorialPagoMesNomi;    
	protected JPanel jPanelCamposOcultosHistorialPagoMesNomi;    	
	protected JPanel jPanelAccionesHistorialPagoMesNomi;
	protected JPanel jPanelAccionesFormularioHistorialPagoMesNomi;
    
	
	
	protected Integer iXPanelCamposHistorialPagoMesNomi=0;
	protected Integer iYPanelCamposHistorialPagoMesNomi=0;
	
	protected Integer iXPanelCamposOcultosHistorialPagoMesNomi=0;
	protected Integer iYPanelCamposOcultosHistorialPagoMesNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHistorialPagoMesNomi;
	public JButton jButtonModificarHistorialPagoMesNomi;
	public JButton jButtonActualizarHistorialPagoMesNomi;
    public JButton jButtonEliminarHistorialPagoMesNomi;
	public JButton jButtonCancelarHistorialPagoMesNomi;
    public JButton jButtonGuardarCambiosHistorialPagoMesNomi;
	public JButton jButtonGuardarCambiosTablaHistorialPagoMesNomi;
	protected JButton jButtonCerrarHistorialPagoMesNomi;
	
	
	protected JButton jButtonProcesarInformacionHistorialPagoMesNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHistorialPagoMesNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialPagoMesNomi;
	protected JButton jButtonModificarToolBarHistorialPagoMesNomi;
	protected JButton jButtonActualizarToolBarHistorialPagoMesNomi;
    protected JButton jButtonEliminarToolBarHistorialPagoMesNomi;
	protected JButton jButtonCancelarToolBarHistorialPagoMesNomi;
    protected JButton jButtonGuardarCambiosToolBarHistorialPagoMesNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialPagoMesNomi;
	protected JButton jButtonCerrarToolBarHistorialPagoMesNomi;
	
	protected JButton jButtonProcesarInformacionToolBarHistorialPagoMesNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialPagoMesNomi;
	protected JMenuItem jMenuItemModificarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemActualizarHistorialPagoMesNomi;
    protected JMenuItem jMenuItemEliminarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemCancelarHistorialPagoMesNomi;
    protected JMenuItem jMenuItemGuardarCambiosHistorialPagoMesNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialPagoMesNomi;
	protected JMenuItem jMenuItemCerrarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemDetalleCerrarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialPagoMesNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionHistorialPagoMesNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi;
	protected JMenuItem jMenuItemMostrarOcultarHistorialPagoMesNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialPagoMesNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialPagoMesNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHistorialPagoMesNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHistorialPagoMesNomi;
	public JLabel jLabelIdHistorialPagoMesNomi;
	public JLabel jLabelidHistorialPagoMesNomi;
	public JButton jButtonidHistorialPagoMesNomiBusqueda= new JButtonMe();

	public JPanel jPanelvalorHistorialPagoMesNomi;
	public JLabel jLabelvalorHistorialPagoMesNomi;
	public JTextField jTextFieldvalorHistorialPagoMesNomi;
	public JButton jButtonvalorHistorialPagoMesNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHistorialPagoMesNomi;
	public JLabel jLabelid_empresaHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHistorialPagoMesNomi;
	public JButton jButtonid_empresaHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_empresaHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaHistorialPagoMesNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoHistorialPagoMesNomi;
	public JLabel jLabelid_empleadoHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoHistorialPagoMesNomi;
	public JButton jButtonid_empleadoHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_empleadoHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoHistorialPagoMesNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaHistorialPagoMesNomi;
	public JLabel jLabelid_rubro_empleaHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaHistorialPagoMesNomi;
	public JButton jButtonid_rubro_empleaHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_rubro_empleaHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_anioHistorialPagoMesNomi;
	public JLabel jLabelid_anioHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioHistorialPagoMesNomi;
	public JButton jButtonid_anioHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_anioHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_anioHistorialPagoMesNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_mesHistorialPagoMesNomi;
	public JLabel jLabelid_mesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesHistorialPagoMesNomi;
	public JButton jButtonid_mesHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_mesHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_mesHistorialPagoMesNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHistorialPagoMesNomi;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HistorialPagoMesNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHistorialPagoMesNomi=new JPanel();
				this.jPanelAccionesFormularioHistorialPagoMesNomi=new JPanel();
				this.jmenuBarDetalleHistorialPagoMesNomi=new JMenuBar();
				this.jTtoolBarDetalleHistorialPagoMesNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HistorialPagoMesNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHistorialPagoMesNomi() {
		return this.jButtonActualizarToolBarHistorialPagoMesNomi;
	}
	
	public JButton getjButtonEliminarToolBarHistorialPagoMesNomi() {
		return this.jButtonEliminarToolBarHistorialPagoMesNomi;
	}
	
	public JButton getjButtonCancelarToolBarHistorialPagoMesNomi() {
		return this.jButtonCancelarToolBarHistorialPagoMesNomi;
	}		
	
	public JButton getjButtonProcesarInformacionHistorialPagoMesNomi() {
		return this.jButtonProcesarInformacionHistorialPagoMesNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialPagoMesNomi)	{
		this.jButtonProcesarInformacionHistorialPagoMesNomi = jButtonProcesarInformacionHistorialPagoMesNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialPagoMesNomi() {
		return this.jComboBoxTiposAccionesHistorialPagoMesNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposRelacionesHistorialPagoMesNomi) {
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi = jComboBoxTiposRelacionesHistorialPagoMesNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposAccionesHistorialPagoMesNomi) {
		this.jComboBoxTiposAccionesHistorialPagoMesNomi = jComboBoxTiposAccionesHistorialPagoMesNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHistorialPagoMesNomi() {
		return this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHistorialPagoMesNomi(
			JComboBox jComboBoxTiposAccionesFormularioHistorialPagoMesNomi) {
		this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi = jComboBoxTiposAccionesFormularioHistorialPagoMesNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		
		this.historialpagomesnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialpagomesnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialPagoMesNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Pago Mes Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		HistorialPagoMesNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHistorialPagoMesNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHistorialPagoMesNomi=new JButtonMe();
				this.jButtonModificarToolBarHistorialPagoMesNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHistorialPagoMesNomi,this.jTtoolBarDetalleHistorialPagoMesNomi,
							"actualizar","actualizar","Actualizar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHistorialPagoMesNomi,this.jTtoolBarDetalleHistorialPagoMesNomi,
							"eliminar","eliminar","Eliminar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHistorialPagoMesNomi,this.jTtoolBarDetalleHistorialPagoMesNomi,
							"cancelar","cancelar","Cancelar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHistorialPagoMesNomi,this.jTtoolBarDetalleHistorialPagoMesNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHistorialPagoMesNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHistorialPagoMesNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHistorialPagoMesNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHistorialPagoMesNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHistorialPagoMesNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialPagoMesNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialPagoMesNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialPagoMesNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHistorialPagoMesNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHistorialPagoMesNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHistorialPagoMesNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHistorialPagoMesNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHistorialPagoMesNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHistorialPagoMesNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHistorialPagoMesNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHistorialPagoMesNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHistorialPagoMesNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHistorialPagoMesNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHistorialPagoMesNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHistorialPagoMesNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHistorialPagoMesNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialPagoMesNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialPagoMesNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialPagoMesNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialPagoMesNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialPagoMesNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHistorialPagoMesNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHistorialPagoMesNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHistorialPagoMesNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialPagoMesNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialPagoMesNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialPagoMesNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHistorialPagoMesNomi.add(this.jMenuItemDetalleCerrarHistorialPagoMesNomi);
		
		this.jmenuDetalleAccionesHistorialPagoMesNomi.add(this.jMenuItemActualizarHistorialPagoMesNomi);
		this.jmenuDetalleAccionesHistorialPagoMesNomi.add(this.jMenuItemEliminarHistorialPagoMesNomi);
		this.jmenuDetalleAccionesHistorialPagoMesNomi.add(this.jMenuItemCancelarHistorialPagoMesNomi);		
		
		//this.jmenuDetalleDatosHistorialPagoMesNomi.add(this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi);				
		this.jmenuDetalleDatosHistorialPagoMesNomi.add(this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi);				
				
		//this.jmenuDetalleAccionesHistorialPagoMesNomi.add(this.jMenuItemGuardarCambiosHistorialPagoMesNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHistorialPagoMesNomi.add(this.jmenuDetalleArchivoHistorialPagoMesNomi);		
		this.jmenuBarDetalleHistorialPagoMesNomi.add(this.jmenuDetalleAccionesHistorialPagoMesNomi);		
		this.jmenuBarDetalleHistorialPagoMesNomi.add(this.jmenuDetalleDatosHistorialPagoMesNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHistorialPagoMesNomi);				
	}
	
	
	public void inicializarElementosCamposHistorialPagoMesNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHistorialPagoMesNomi = new JLabelMe();
		jLabelIdHistorialPagoMesNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHistorialPagoMesNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHistorialPagoMesNomi= new GridBagLayout();

		this.jPanelidHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);

		jLabelidHistorialPagoMesNomi = new JLabel();
		jLabelidHistorialPagoMesNomi.setText("Id");

		jLabelidHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorHistorialPagoMesNomi = new JLabelMe();
		this.jLabelvalorHistorialPagoMesNomi.setText(""+HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorHistorialPagoMesNomi.setToolTipText("Valor");
		this.jLabelvalorHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		this.jPanelvalorHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);


		jTextFieldvalorHistorialPagoMesNomi= new JTextFieldMe();
		jTextFieldvalorHistorialPagoMesNomi.setEnabled(false);
		jTextFieldvalorHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorHistorialPagoMesNomi.setText("0.0");

		this.jButtonvalorHistorialPagoMesNomiBusqueda= new JButtonMe();
		this.jButtonvalorHistorialPagoMesNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorHistorialPagoMesNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorHistorialPagoMesNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorHistorialPagoMesNomiBusqueda.setText("U");
		this.jButtonvalorHistorialPagoMesNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorHistorialPagoMesNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorHistorialPagoMesNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorHistorialPagoMesNomiBusqueda"));

		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorHistorialPagoMesNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHistorialPagoMesNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHistorialPagoMesNomi = new JLabelMe();
		this.jLabelid_empresaHistorialPagoMesNomi.setText(""+HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHistorialPagoMesNomi.setToolTipText("Empresa");
		this.jLabelid_empresaHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		this.jPanelid_empresaHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);


		jComboBoxid_empresaHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_empresaHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHistorialPagoMesNomi.setEnabled(false);

		this.jButtonid_empresaHistorialPagoMesNomi= new JButtonMe();
		this.jButtonid_empresaHistorialPagoMesNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialPagoMesNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialPagoMesNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHistorialPagoMesNomi.setText("Buscar");
		this.jButtonid_empresaHistorialPagoMesNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHistorialPagoMesNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialPagoMesNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialPagoMesNomi"));

		this.jButtonid_empresaHistorialPagoMesNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setText("U");
		this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialPagoMesNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialPagoMesNomiBusqueda"));

		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHistorialPagoMesNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaHistorialPagoMesNomiUpdate= new JButtonMe();
		this.jButtonid_empresaHistorialPagoMesNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoMesNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHistorialPagoMesNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHistorialPagoMesNomiUpdate.setText("U");
		this.jButtonid_empresaHistorialPagoMesNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHistorialPagoMesNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHistorialPagoMesNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHistorialPagoMesNomiUpdate"));



					
		this.jLabelid_empleadoHistorialPagoMesNomi = new JLabelMe();
		this.jLabelid_empleadoHistorialPagoMesNomi.setText(""+HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoHistorialPagoMesNomi.setToolTipText("Empleado");
		this.jLabelid_empleadoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		this.jPanelid_empleadoHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);


		jComboBoxid_empleadoHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_empleadoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoHistorialPagoMesNomi= new JButtonMe();
		this.jButtonid_empleadoHistorialPagoMesNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoHistorialPagoMesNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoHistorialPagoMesNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoHistorialPagoMesNomi.setText("Buscar");
		this.jButtonid_empleadoHistorialPagoMesNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoHistorialPagoMesNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoHistorialPagoMesNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoHistorialPagoMesNomi"));

		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda= new JButtonMe();
		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setText("U");
		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoHistorialPagoMesNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoHistorialPagoMesNomiBusqueda"));

		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoHistorialPagoMesNomiBusqueda.setVisible(false);		}

		this.jButtonid_empleadoHistorialPagoMesNomiUpdate= new JButtonMe();
		this.jButtonid_empleadoHistorialPagoMesNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoMesNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoHistorialPagoMesNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoHistorialPagoMesNomiUpdate.setText("U");
		this.jButtonid_empleadoHistorialPagoMesNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoHistorialPagoMesNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoHistorialPagoMesNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoHistorialPagoMesNomiUpdate"));



					
		this.jLabelid_rubro_empleaHistorialPagoMesNomi = new JLabelMe();
		this.jLabelid_rubro_empleaHistorialPagoMesNomi.setText(""+HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaHistorialPagoMesNomi.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		this.jPanelid_rubro_empleaHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);


		jComboBoxid_rubro_empleaHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaHistorialPagoMesNomi= new JButtonMe();
		this.jButtonid_rubro_empleaHistorialPagoMesNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaHistorialPagoMesNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaHistorialPagoMesNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaHistorialPagoMesNomi.setText("Buscar");
		this.jButtonid_rubro_empleaHistorialPagoMesNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaHistorialPagoMesNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaHistorialPagoMesNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaHistorialPagoMesNomi"));

		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setText("U");
		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaHistorialPagoMesNomiBusqueda"));

		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.setText("U");
		this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaHistorialPagoMesNomiUpdate"));



					
		this.jLabelid_anioHistorialPagoMesNomi = new JLabelMe();
		this.jLabelid_anioHistorialPagoMesNomi.setText(""+HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioHistorialPagoMesNomi.setToolTipText("Anio");
		this.jLabelid_anioHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		this.jPanelid_anioHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);


		jComboBoxid_anioHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_anioHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioHistorialPagoMesNomi= new JButtonMe();
		this.jButtonid_anioHistorialPagoMesNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioHistorialPagoMesNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioHistorialPagoMesNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioHistorialPagoMesNomi.setText("Buscar");
		this.jButtonid_anioHistorialPagoMesNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioHistorialPagoMesNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioHistorialPagoMesNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioHistorialPagoMesNomi"));

		this.jButtonid_anioHistorialPagoMesNomiBusqueda= new JButtonMe();
		this.jButtonid_anioHistorialPagoMesNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialPagoMesNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialPagoMesNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioHistorialPagoMesNomiBusqueda.setText("U");
		this.jButtonid_anioHistorialPagoMesNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioHistorialPagoMesNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioHistorialPagoMesNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioHistorialPagoMesNomiBusqueda"));

		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioHistorialPagoMesNomiBusqueda.setVisible(false);		}

		this.jButtonid_anioHistorialPagoMesNomiUpdate= new JButtonMe();
		this.jButtonid_anioHistorialPagoMesNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialPagoMesNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioHistorialPagoMesNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioHistorialPagoMesNomiUpdate.setText("U");
		this.jButtonid_anioHistorialPagoMesNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioHistorialPagoMesNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioHistorialPagoMesNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioHistorialPagoMesNomiUpdate"));



					
		this.jLabelid_mesHistorialPagoMesNomi = new JLabelMe();
		this.jLabelid_mesHistorialPagoMesNomi.setText(""+HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesHistorialPagoMesNomi.setToolTipText("Mes");
		this.jLabelid_mesHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesHistorialPagoMesNomi.setToolTipText(HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		this.jPanelid_mesHistorialPagoMesNomi.setLayout(this.gridaBagLayoutHistorialPagoMesNomi);


		jComboBoxid_mesHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_mesHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesHistorialPagoMesNomi= new JButtonMe();
		this.jButtonid_mesHistorialPagoMesNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialPagoMesNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialPagoMesNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesHistorialPagoMesNomi.setText("Buscar");
		this.jButtonid_mesHistorialPagoMesNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesHistorialPagoMesNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialPagoMesNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialPagoMesNomi"));

		this.jButtonid_mesHistorialPagoMesNomiBusqueda= new JButtonMe();
		this.jButtonid_mesHistorialPagoMesNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoMesNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoMesNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesHistorialPagoMesNomiBusqueda.setText("U");
		this.jButtonid_mesHistorialPagoMesNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesHistorialPagoMesNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialPagoMesNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialPagoMesNomiBusqueda"));

		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesHistorialPagoMesNomiBusqueda.setVisible(false);		}

		this.jButtonid_mesHistorialPagoMesNomiUpdate= new JButtonMe();
		this.jButtonid_mesHistorialPagoMesNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoMesNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesHistorialPagoMesNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesHistorialPagoMesNomiUpdate.setText("U");
		this.jButtonid_mesHistorialPagoMesNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesHistorialPagoMesNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesHistorialPagoMesNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesHistorialPagoMesNomiUpdate"));



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
		//this.jInternalFrameDetalleHistorialPagoMesNomi = new HistorialPagoMesNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Historial Pago Mes Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialPagoMesNomi= new GridBagLayout();
		

		
		String sToolTipHistorialPagoMesNomi="";
		sToolTipHistorialPagoMesNomi=HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialPagoMesNomi+="(Nomina.HistorialPagoMesNomi)";
		}
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialPagoMesNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHistorialPagoMesNomi = new JButtonMe();
		this.jButtonModificarHistorialPagoMesNomi = new JButtonMe();
        this.jButtonActualizarHistorialPagoMesNomi = new JButtonMe();
        this.jButtonEliminarHistorialPagoMesNomi = new JButtonMe();
        this.jButtonCancelarHistorialPagoMesNomi = new JButtonMe();
        this.jButtonGuardarCambiosHistorialPagoMesNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi = new JButtonMe();
		this.jButtonCerrarHistorialPagoMesNomi = new JButtonMe();
		
		this.jScrollPanelDatosHistorialPagoMesNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionHistorialPagoMesNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralHistorialPagoMesNomi = new JScrollPane();
				
		
		
		this.jPanelCamposHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Pago Mes Nomi";
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Mes Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialPagoMesNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHistorialPagoMesNomi.setName("jPanelCamposHistorialPagoMesNomi"); 

		this.jPanelCamposOcultosHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHistorialPagoMesNomi.setName("jPanelCamposOcultosHistorialPagoMesNomi"); 

        this.jPanelAccionesHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialPagoMesNomi.setToolTipText("Acciones");
        this.jPanelAccionesHistorialPagoMesNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHistorialPagoMesNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHistorialPagoMesNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHistorialPagoMesNomi.setText("Nuevo");
		this.jButtonModificarHistorialPagoMesNomi.setText("Editar");
        this.jButtonActualizarHistorialPagoMesNomi.setText("Actualizar");
        this.jButtonEliminarHistorialPagoMesNomi.setText("Eliminar");
        this.jButtonCancelarHistorialPagoMesNomi.setText("Cancelar");
        this.jButtonGuardarCambiosHistorialPagoMesNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.setText("Guardar");
		this.jButtonCerrarHistorialPagoMesNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialPagoMesNomi,"nuevo_button","Nuevo",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHistorialPagoMesNomi,"modificar_button","Editar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHistorialPagoMesNomi,"actualizar_button","Actualizar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHistorialPagoMesNomi,"eliminar_button","Eliminar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHistorialPagoMesNomi,"cancelar_button","Cancelar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHistorialPagoMesNomi,"guardarcambios_button","Guardar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialPagoMesNomi,"guardarcambiostabla_button","Guardar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialPagoMesNomi,"cerrar_button","Salir",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHistorialPagoMesNomi.setToolTipText("Nuevo"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHistorialPagoMesNomi.setToolTipText("Editar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHistorialPagoMesNomi.setToolTipText("Actualizar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHistorialPagoMesNomi.setToolTipText("Eliminar)"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHistorialPagoMesNomi.setToolTipText("Cancelar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHistorialPagoMesNomi.setToolTipText("Guardar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.setToolTipText("Guardar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialPagoMesNomi.setToolTipText("Salir"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialPagoMesNomi";
		inputMap = this.jButtonNuevoHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialPagoMesNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialPagoMesNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHistorialPagoMesNomi";
		inputMap = this.jButtonActualizarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHistorialPagoMesNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarHistorialPagoMesNomi";
		inputMap = this.jButtonEliminarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHistorialPagoMesNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarHistorialPagoMesNomi";
		inputMap = this.jButtonCancelarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHistorialPagoMesNomi"));
		
		//CERRAR		
		sMapKey = "CerrarHistorialPagoMesNomi";
		inputMap = this.jButtonCerrarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialPagoMesNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialPagoMesNomi";
		inputMap = this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialPagoMesNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHistorialPagoMesNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHistorialPagoMesNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHistorialPagoMesNomi.setToolTipText("Nuevo HistorialPagoMesNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi.setToolTipText("Sin Cerrar Ventana HistorialPagoMesNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialPagoMesNomi.setText("Accion");
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHistorialPagoMesNomi = new JLabelMe();
		
		this.jLabelAccionesHistorialPagoMesNomi.setText("Acciones");		
		this.jLabelAccionesHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHistorialPagoMesNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHistorialPagoMesNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHistorialPagoMesNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHistorialPagoMesNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHistorialPagoMesNomi = new GridBagLayout();
		
		this.jPanelCamposHistorialPagoMesNomi.setLayout(gridaBagLayoutCamposHistorialPagoMesNomi);
		this.jPanelCamposOcultosHistorialPagoMesNomi.setLayout(gridaBagLayoutCamposOcultosHistorialPagoMesNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHistorialPagoMesNomi.add(jLabelIdHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHistorialPagoMesNomi.add(jLabelidHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHistorialPagoMesNomi.add(jLabelid_empresaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialPagoMesNomi.add(jButtonid_empresaHistorialPagoMesNomiBusqueda, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHistorialPagoMesNomi.add(jButtonid_empresaHistorialPagoMesNomiUpdate, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHistorialPagoMesNomi.add(jComboBoxid_empresaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoHistorialPagoMesNomi.add(jLabelid_empleadoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoHistorialPagoMesNomi.add(jButtonid_empleadoHistorialPagoMesNomiBusqueda, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoHistorialPagoMesNomi.add(jButtonid_empleadoHistorialPagoMesNomiUpdate, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoHistorialPagoMesNomi.add(jComboBoxid_empleadoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaHistorialPagoMesNomi.add(jLabelid_rubro_empleaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaHistorialPagoMesNomi.add(jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaHistorialPagoMesNomi.add(jButtonid_rubro_empleaHistorialPagoMesNomiUpdate, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaHistorialPagoMesNomi.add(jComboBoxid_rubro_empleaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioHistorialPagoMesNomi.add(jLabelid_anioHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioHistorialPagoMesNomi.add(jButtonid_anioHistorialPagoMesNomiBusqueda, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioHistorialPagoMesNomi.add(jButtonid_anioHistorialPagoMesNomiUpdate, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioHistorialPagoMesNomi.add(jComboBoxid_anioHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesHistorialPagoMesNomi.add(jLabelid_mesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesHistorialPagoMesNomi.add(jButtonid_mesHistorialPagoMesNomiBusqueda, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 3;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesHistorialPagoMesNomi.add(jButtonid_mesHistorialPagoMesNomiUpdate, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesHistorialPagoMesNomi.add(jComboBoxid_mesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorHistorialPagoMesNomi.add(jLabelvalorHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 2;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorHistorialPagoMesNomi.add(jButtonvalorHistorialPagoMesNomiBusqueda, this.gridBagConstraintsHistorialPagoMesNomi);
	}

	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorHistorialPagoMesNomi.add(jTextFieldvalorHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoMesNomi.add(this.jPanelidHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposHistorialPagoMesNomi % 1==0) {
		iXPanelCamposHistorialPagoMesNomi=0;
		iYPanelCamposHistorialPagoMesNomi++;
	}
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoMesNomi.add(this.jPanelid_empleadoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposHistorialPagoMesNomi % 1==0) {
		iXPanelCamposHistorialPagoMesNomi=0;
		iYPanelCamposHistorialPagoMesNomi++;
	}
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoMesNomi.add(this.jPanelid_rubro_empleaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposHistorialPagoMesNomi % 1==0) {
		iXPanelCamposHistorialPagoMesNomi=0;
		iYPanelCamposHistorialPagoMesNomi++;
	}
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoMesNomi.add(this.jPanelid_anioHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposHistorialPagoMesNomi % 1==0) {
		iXPanelCamposHistorialPagoMesNomi=0;
		iYPanelCamposHistorialPagoMesNomi++;
	}
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoMesNomi.add(this.jPanelid_mesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposHistorialPagoMesNomi % 1==0) {
		iXPanelCamposHistorialPagoMesNomi=0;
		iYPanelCamposHistorialPagoMesNomi++;
	}
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialPagoMesNomi.add(this.jPanelvalorHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposHistorialPagoMesNomi % 1==0) {
		iXPanelCamposHistorialPagoMesNomi=0;
		iYPanelCamposHistorialPagoMesNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialPagoMesNomi.gridy = iYPanelCamposOcultosHistorialPagoMesNomi;
	this.gridBagConstraintsHistorialPagoMesNomi.gridx = iXPanelCamposOcultosHistorialPagoMesNomi++;
	this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialPagoMesNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialPagoMesNomi.add(this.jPanelid_empresaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);



	if(iXPanelCamposOcultosHistorialPagoMesNomi % 1==0) {
		iXPanelCamposOcultosHistorialPagoMesNomi=0;
		iYPanelCamposOcultosHistorialPagoMesNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesHistorialPagoMesNomi= new GridBagLayout();
		this.jPanelAccionesHistorialPagoMesNomi.setLayout(gridaBagLayoutAccionesHistorialPagoMesNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHistorialPagoMesNomi= new GridBagLayout();
		this.jPanelAccionesFormularioHistorialPagoMesNomi.setLayout(gridaBagLayoutAccionesFormularioHistorialPagoMesNomi);
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialPagoMesNomi.add(this.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialPagoMesNomi.add(this.jCheckBoxPostAccionNuevoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialPagoMesNomi.add(this.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialPagoMesNomi.add(this.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesHistorialPagoMesNomi.add(this.jButtonModificarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);							

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesHistorialPagoMesNomi.add(this.jButtonEliminarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialPagoMesNomi.add(this.jButtonActualizarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialPagoMesNomi.add(this.jButtonGuardarCambiosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);	
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesHistorialPagoMesNomi.add(this.jButtonCancelarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialPagoMesNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();						
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;		
			//this.gridBagConstraintsHistorialPagoMesNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =0;
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialPagoMesNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHistorialPagoMesNomi = new HistorialPagoMesNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Historial Pago Mes Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Historial Pago Mes Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Pago Mes Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HistorialPagoMesNomiModel historialpagomesnomiModel=new HistorialPagoMesNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//HistorialPagoMesNomiModel.HistorialPagoMesNomiFocusTraversalPolicy historialpagomesnomiFocusTraversalPolicy = historialpagomesnomiModel.new HistorialPagoMesNomiFocusTraversalPolicy(this);
			
			//historialpagomesnomiFocusTraversalPolicy.sethistorialpagomesnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(historialpagomesnomiModel);
			
			
			this.jContentPaneDetalleHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHistorialPagoMesNomi = new GridBagLayout();	
			this.jContentPaneDetalleHistorialPagoMesNomi.setLayout(gridaBagLayoutDetalleHistorialPagoMesNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialPagoMesNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
				this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
					
				
				this.jContentPaneDetalleHistorialPagoMesNomi.add(jTtoolBarDetalleHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);								
				
}
			
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi=   new JScrollPane(jContentPaneDetalleHistorialPagoMesNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	        
			this.jContentPaneDetalleHistorialPagoMesNomi.add(jPanelCamposHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);
			
			
			
			
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
						&& historialpagomesnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHistorialPagoMesNomi= new GridBagConstraints();
						this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
						this.jContentPaneDetalleHistorialPagoMesNomi.add(this.jTabbedPaneRelacionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHistorialPagoMesNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHistorialPagoMesNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
					this.gridBagConstraintsHistorialPagoMesNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
					
				
					this.jContentPaneDetalleHistorialPagoMesNomi.add(jPanelCamposOcultosHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);
				
					this.jPanelCamposOcultosHistorialPagoMesNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	        this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHistorialPagoMesNomi.add(this.jPanelAccionesFormularioHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);							
			
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
	        this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleHistorialPagoMesNomi.add(this.jPanelAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHistorialPagoMesNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi=   new JScrollPane(this.jPanelCamposHistorialPagoMesNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHistorialPagoMesNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHistorialPagoMesNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionHistorialPagoMesNomi;
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
