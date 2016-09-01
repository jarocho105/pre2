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
import com.bydan.erp.nomina.util.TurnoConstantesFunciones;

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
public class TurnoDetalleFormJInternalFrame extends TurnoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTurno;
	
	protected JMenuBar jmenuBarDetalleTurno;
	
	protected JMenu jmenuDetalleTurno;
	protected JMenu jmenuDetalleArchivoTurno;
	protected JMenu jmenuDetalleAccionesTurno;
	protected JMenu jmenuDetalleDatosTurno;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTurno;	
	protected GridBagConstraints gridBagConstraintsTurno;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TurnoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTurno;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TurnoSessionBean turnoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TurnoLogic turnoLogic;
	
	public JScrollPane jScrollPanelDatosTurno;
	public JScrollPane jScrollPanelDatosEdicionTurno;
	public JScrollPane jScrollPanelDatosGeneralTurno;
	
	protected JPanel jPanelCamposTurno;    
	protected JPanel jPanelCamposOcultosTurno;    	
	protected JPanel jPanelAccionesTurno;
	protected JPanel jPanelAccionesFormularioTurno;
    
	
	
	protected Integer iXPanelCamposTurno=0;
	protected Integer iYPanelCamposTurno=0;
	
	protected Integer iXPanelCamposOcultosTurno=0;
	protected Integer iYPanelCamposOcultosTurno=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTurno;
	public JButton jButtonModificarTurno;
	public JButton jButtonActualizarTurno;
    public JButton jButtonEliminarTurno;
	public JButton jButtonCancelarTurno;
    public JButton jButtonGuardarCambiosTurno;
	public JButton jButtonGuardarCambiosTablaTurno;
	protected JButton jButtonCerrarTurno;
	
	
	protected JButton jButtonProcesarInformacionTurno;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTurno;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTurno;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTurno;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTurno;
	protected JButton jButtonModificarToolBarTurno;
	protected JButton jButtonActualizarToolBarTurno;
    protected JButton jButtonEliminarToolBarTurno;
	protected JButton jButtonCancelarToolBarTurno;
    protected JButton jButtonGuardarCambiosToolBarTurno;
	protected JButton jButtonGuardarCambiosTablaToolBarTurno;
	protected JButton jButtonMostrarOcultarTablaToolBarTurno;
	protected JButton jButtonCerrarToolBarTurno;
	
	protected JButton jButtonProcesarInformacionToolBarTurno;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTurno;
	protected JMenuItem jMenuItemModificarTurno;
	protected JMenuItem jMenuItemActualizarTurno;
    protected JMenuItem jMenuItemEliminarTurno;
	protected JMenuItem jMenuItemCancelarTurno;
    protected JMenuItem jMenuItemGuardarCambiosTurno;
	protected JMenuItem jMenuItemGuardarCambiosTablaTurno;
	protected JMenuItem jMenuItemCerrarTurno;
	protected JMenuItem jMenuItemDetalleCerrarTurno;
	protected JMenuItem jMenuItemDetalleMostarOcultarTurno;
	
	protected JMenuItem jMenuItemProcesarInformacionTurno;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTurno;
	protected JMenuItem jMenuItemMostrarOcultarTurno;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTurno;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTurno;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTurno;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTurno;
	public JLabel jLabelIdTurno;
	public JLabel jLabelidTurno;
	public JButton jButtonidTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_entradaTurno;
	public JLabel jLabelhora_entradaTurno;
	public JSpinner jSpinnerhora_entradaTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_entradaTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salidaTurno;
	public JLabel jLabelhora_salidaTurno;
	public JSpinner jSpinnerhora_salidaTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salidaTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_ingreso_recesoTurno;
	public JLabel jLabelhora_ingreso_recesoTurno;
	public JSpinner jSpinnerhora_ingreso_recesoTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_ingreso_recesoTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salida_recesoTurno;
	public JLabel jLabelhora_salida_recesoTurno;
	public JSpinner jSpinnerhora_salida_recesoTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salida_recesoTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_durante_recesoTurno;
	public JLabel jLabelhora_durante_recesoTurno;
	public JSpinner jSpinnerhora_durante_recesoTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_durante_recesoTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_ingreso_almuerzoTurno;
	public JLabel jLabelhora_ingreso_almuerzoTurno;
	public JSpinner jSpinnerhora_ingreso_almuerzoTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_ingreso_almuerzoTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salida_almuerzoTurno;
	public JLabel jLabelhora_salida_almuerzoTurno;
	public JSpinner jSpinnerhora_salida_almuerzoTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salida_almuerzoTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_durante_almuerzoTurno;
	public JLabel jLabelhora_durante_almuerzoTurno;
	public JSpinner jSpinnerhora_durante_almuerzoTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_durante_almuerzoTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_ingreso25Turno;
	public JLabel jLabelhora_ingreso25Turno;
	public JSpinner jSpinnerhora_ingreso25Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_ingreso25TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salida25Turno;
	public JLabel jLabelhora_salida25Turno;
	public JSpinner jSpinnerhora_salida25Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salida25TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_ingreso50Turno;
	public JLabel jLabelhora_ingreso50Turno;
	public JSpinner jSpinnerhora_ingreso50Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_ingreso50TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salida50Turno;
	public JLabel jLabelhora_salida50Turno;
	public JSpinner jSpinnerhora_salida50Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salida50TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_ingreso100Turno;
	public JLabel jLabelhora_ingreso100Turno;
	public JSpinner jSpinnerhora_ingreso100Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_ingreso100TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salida100Turno;
	public JLabel jLabelhora_salida100Turno;
	public JSpinner jSpinnerhora_salida100Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salida100TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_ingreso200Turno;
	public JLabel jLabelhora_ingreso200Turno;
	public JSpinner jSpinnerhora_ingreso200Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_ingreso200TurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_salida200Turno;
	public JLabel jLabelhora_salida200Turno;
	public JSpinner jSpinnerhora_salida200Turno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_salida200TurnoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTurno;
	public JLabel jLabelid_empresaTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTurno;
	public JButton jButtonid_empresaTurno= new JButtonMe();
	public JButton jButtonid_empresaTurnoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTurnoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTurno;
	
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
	public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TurnoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTurno=new JPanel();
				this.jPanelAccionesFormularioTurno=new JPanel();
				this.jmenuBarDetalleTurno=new JMenuBar();
				this.jTtoolBarDetalleTurno=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TurnoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Turno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTurno() {
		return this.jButtonActualizarToolBarTurno;
	}
	
	public JButton getjButtonEliminarToolBarTurno() {
		return this.jButtonEliminarToolBarTurno;
	}
	
	public JButton getjButtonCancelarToolBarTurno() {
		return this.jButtonCancelarToolBarTurno;
	}		
	
	public JButton getjButtonProcesarInformacionTurno() {
		return this.jButtonProcesarInformacionTurno;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTurno)	{
		this.jButtonProcesarInformacionTurno = jButtonProcesarInformacionTurno;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTurno() {
		return this.jComboBoxTiposAccionesTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTurno(
			JComboBox jComboBoxTiposRelacionesTurno) {
		this.jComboBoxTiposRelacionesTurno = jComboBoxTiposRelacionesTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTurno(
			JComboBox jComboBoxTiposAccionesTurno) {
		this.jComboBoxTiposAccionesTurno = jComboBoxTiposAccionesTurno;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTurno() {
		return this.jComboBoxTiposAccionesFormularioTurno;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTurno(
			JComboBox jComboBoxTiposAccionesFormularioTurno) {
		this.jComboBoxTiposAccionesFormularioTurno = jComboBoxTiposAccionesFormularioTurno;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.turnoSessionBean=new TurnoSessionBean();
		
		this.turnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.turnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.turnoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TurnoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TurnoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Turno MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
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
	
		TurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTurno= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTurno=new JButtonMe();
				this.jButtonModificarToolBarTurno=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTurno,this.jTtoolBarDetalleTurno,
							"actualizar","actualizar","Actualizar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTurno,this.jTtoolBarDetalleTurno,
							"eliminar","eliminar","Eliminar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTurno,this.jTtoolBarDetalleTurno,
							"cancelar","cancelar","Cancelar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTurno,this.jTtoolBarDetalleTurno,
							"guardarcambios","guardarcambios","Guardar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTurno,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTurno=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTurno=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTurno=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTurno=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTurno=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTurno= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTurno.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTurno,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTurno= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTurno.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTurno,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTurno= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTurno.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTurno,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTurno= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTurno.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTurno,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTurno= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTurno.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTurno,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTurno= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTurno.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTurno,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTurno= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTurno.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTurno,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTurno= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTurno.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTurno,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTurno,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTurno,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTurno, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTurno.add(this.jMenuItemDetalleCerrarTurno);
		
		this.jmenuDetalleAccionesTurno.add(this.jMenuItemActualizarTurno);
		this.jmenuDetalleAccionesTurno.add(this.jMenuItemEliminarTurno);
		this.jmenuDetalleAccionesTurno.add(this.jMenuItemCancelarTurno);		
		
		//this.jmenuDetalleDatosTurno.add(this.jMenuItemDetalleAbrirOrderByTurno);				
		this.jmenuDetalleDatosTurno.add(this.jMenuItemDetalleMostarOcultarTurno);				
				
		//this.jmenuDetalleAccionesTurno.add(this.jMenuItemGuardarCambiosTurno);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTurno.add(this.jmenuDetalleArchivoTurno);		
		this.jmenuBarDetalleTurno.add(this.jmenuDetalleAccionesTurno);		
		this.jmenuBarDetalleTurno.add(this.jmenuDetalleDatosTurno);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTurno);				
	}
	
	
	public void inicializarElementosCamposTurno() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTurno = new JLabelMe();
		jLabelIdTurno.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTurno = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTurno.setToolTipText(TurnoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTurno= new GridBagLayout();

		this.jPanelidTurno.setLayout(this.gridaBagLayoutTurno);

		jLabelidTurno = new JLabel();
		jLabelidTurno.setText("Id");

		jLabelidTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelhora_entradaTurno = new JLabelMe();
		this.jLabelhora_entradaTurno.setText(""+TurnoConstantesFunciones.LABEL_HORAENTRADA+" : *");
		this.jLabelhora_entradaTurno.setToolTipText("Hora Entrada");
		this.jLabelhora_entradaTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_entradaTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_entradaTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_entradaTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_entradaTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_entradaTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAENTRADA);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_entradaTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_entradaTurno= new JFormattedTextFieldMe();

		jSpinnerhora_entradaTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_entradaTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_entradaTurno = new JSpinner.DateEditor(jSpinnerhora_entradaTurno, "HH:mm:ss");

		jSpinnerhora_entradaTurno.setEditor(timeEditorhora_entradaTurno);

		jSpinnerhora_entradaTurno.setValue(new Date());

		jSpinnerhora_entradaTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_entradaTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_entradaTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_entradaTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_entradaTurno.setValue(new Date());
		//jSpinnerhora_entradaTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_entradaTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_entradaTurnoBusqueda= new JButtonMe();
		this.jButtonhora_entradaTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_entradaTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_entradaTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_entradaTurnoBusqueda.setText("U");
		this.jButtonhora_entradaTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_entradaTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_entradaTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_entradaTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_entradaTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_entradaTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_entradaTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salidaTurno = new JLabelMe();
		this.jLabelhora_salidaTurno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDA+" : *");
		this.jLabelhora_salidaTurno.setToolTipText("Hora Salida");
		this.jLabelhora_salidaTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salidaTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salidaTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salidaTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salidaTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salidaTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDA);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salidaTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salidaTurno= new JFormattedTextFieldMe();

		jSpinnerhora_salidaTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salidaTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salidaTurno = new JSpinner.DateEditor(jSpinnerhora_salidaTurno, "HH:mm:ss");

		jSpinnerhora_salidaTurno.setEditor(timeEditorhora_salidaTurno);

		jSpinnerhora_salidaTurno.setValue(new Date());

		jSpinnerhora_salidaTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salidaTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salidaTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salidaTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salidaTurno.setValue(new Date());
		//jSpinnerhora_salidaTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salidaTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salidaTurnoBusqueda= new JButtonMe();
		this.jButtonhora_salidaTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salidaTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salidaTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salidaTurnoBusqueda.setText("U");
		this.jButtonhora_salidaTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salidaTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salidaTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salidaTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salidaTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salidaTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salidaTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_ingreso_recesoTurno = new JLabelMe();
		this.jLabelhora_ingreso_recesoTurno.setText(""+TurnoConstantesFunciones.LABEL_HORAINGRESORECESO+" : *");
		this.jLabelhora_ingreso_recesoTurno.setToolTipText("Hora Ingreso Receso");
		this.jLabelhora_ingreso_recesoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_ingreso_recesoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_ingreso_recesoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_ingreso_recesoTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_ingreso_recesoTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_ingreso_recesoTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_ingreso_recesoTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_ingreso_recesoTurno= new JFormattedTextFieldMe();

		jSpinnerhora_ingreso_recesoTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_ingreso_recesoTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_ingreso_recesoTurno = new JSpinner.DateEditor(jSpinnerhora_ingreso_recesoTurno, "HH:mm:ss");

		jSpinnerhora_ingreso_recesoTurno.setEditor(timeEditorhora_ingreso_recesoTurno);

		jSpinnerhora_ingreso_recesoTurno.setValue(new Date());

		jSpinnerhora_ingreso_recesoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso_recesoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso_recesoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_ingreso_recesoTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_ingreso_recesoTurno.setValue(new Date());
		//jSpinnerhora_ingreso_recesoTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_ingreso_recesoTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_ingreso_recesoTurnoBusqueda= new JButtonMe();
		this.jButtonhora_ingreso_recesoTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso_recesoTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso_recesoTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_ingreso_recesoTurnoBusqueda.setText("U");
		this.jButtonhora_ingreso_recesoTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_ingreso_recesoTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_ingreso_recesoTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_ingreso_recesoTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_ingreso_recesoTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_ingreso_recesoTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_ingreso_recesoTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salida_recesoTurno = new JLabelMe();
		this.jLabelhora_salida_recesoTurno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDARECESO+" : *");
		this.jLabelhora_salida_recesoTurno.setToolTipText("Hora Salida Receso");
		this.jLabelhora_salida_recesoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_salida_recesoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_salida_recesoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salida_recesoTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salida_recesoTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salida_recesoTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDARECESO);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salida_recesoTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salida_recesoTurno= new JFormattedTextFieldMe();

		jSpinnerhora_salida_recesoTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salida_recesoTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salida_recesoTurno = new JSpinner.DateEditor(jSpinnerhora_salida_recesoTurno, "HH:mm:ss");

		jSpinnerhora_salida_recesoTurno.setEditor(timeEditorhora_salida_recesoTurno);

		jSpinnerhora_salida_recesoTurno.setValue(new Date());

		jSpinnerhora_salida_recesoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida_recesoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida_recesoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salida_recesoTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salida_recesoTurno.setValue(new Date());
		//jSpinnerhora_salida_recesoTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salida_recesoTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salida_recesoTurnoBusqueda= new JButtonMe();
		this.jButtonhora_salida_recesoTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida_recesoTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida_recesoTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salida_recesoTurnoBusqueda.setText("U");
		this.jButtonhora_salida_recesoTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salida_recesoTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salida_recesoTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salida_recesoTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salida_recesoTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salida_recesoTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salida_recesoTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_durante_recesoTurno = new JLabelMe();
		this.jLabelhora_durante_recesoTurno.setText(""+TurnoConstantesFunciones.LABEL_HORADURANTERECESO+" : *");
		this.jLabelhora_durante_recesoTurno.setToolTipText("Hora Durante Receso");
		this.jLabelhora_durante_recesoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_durante_recesoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_durante_recesoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_durante_recesoTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_durante_recesoTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_durante_recesoTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORADURANTERECESO);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_durante_recesoTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_durante_recesoTurno= new JFormattedTextFieldMe();

		jSpinnerhora_durante_recesoTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_durante_recesoTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_durante_recesoTurno = new JSpinner.DateEditor(jSpinnerhora_durante_recesoTurno, "HH:mm:ss");

		jSpinnerhora_durante_recesoTurno.setEditor(timeEditorhora_durante_recesoTurno);

		jSpinnerhora_durante_recesoTurno.setValue(new Date());

		jSpinnerhora_durante_recesoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_durante_recesoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_durante_recesoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_durante_recesoTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_durante_recesoTurno.setValue(new Date());
		//jSpinnerhora_durante_recesoTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_durante_recesoTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_durante_recesoTurnoBusqueda= new JButtonMe();
		this.jButtonhora_durante_recesoTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_durante_recesoTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_durante_recesoTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_durante_recesoTurnoBusqueda.setText("U");
		this.jButtonhora_durante_recesoTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_durante_recesoTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_durante_recesoTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_durante_recesoTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_durante_recesoTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_durante_recesoTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_durante_recesoTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_ingreso_almuerzoTurno = new JLabelMe();
		this.jLabelhora_ingreso_almuerzoTurno.setText(""+TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO+" : *");
		this.jLabelhora_ingreso_almuerzoTurno.setToolTipText("Hora Ingreso Almuerzo");
		this.jLabelhora_ingreso_almuerzoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelhora_ingreso_almuerzoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelhora_ingreso_almuerzoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_ingreso_almuerzoTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_ingreso_almuerzoTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_ingreso_almuerzoTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_ingreso_almuerzoTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_ingreso_almuerzoTurno= new JFormattedTextFieldMe();

		jSpinnerhora_ingreso_almuerzoTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_ingreso_almuerzoTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_ingreso_almuerzoTurno = new JSpinner.DateEditor(jSpinnerhora_ingreso_almuerzoTurno, "HH:mm:ss");

		jSpinnerhora_ingreso_almuerzoTurno.setEditor(timeEditorhora_ingreso_almuerzoTurno);

		jSpinnerhora_ingreso_almuerzoTurno.setValue(new Date());

		jSpinnerhora_ingreso_almuerzoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso_almuerzoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso_almuerzoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_ingreso_almuerzoTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_ingreso_almuerzoTurno.setValue(new Date());
		//jSpinnerhora_ingreso_almuerzoTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_ingreso_almuerzoTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_ingreso_almuerzoTurnoBusqueda= new JButtonMe();
		this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setText("U");
		this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_ingreso_almuerzoTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_ingreso_almuerzoTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_ingreso_almuerzoTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_ingreso_almuerzoTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_ingreso_almuerzoTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salida_almuerzoTurno = new JLabelMe();
		this.jLabelhora_salida_almuerzoTurno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO+" : *");
		this.jLabelhora_salida_almuerzoTurno.setToolTipText("Hora Salida Almuerzo");
		this.jLabelhora_salida_almuerzoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelhora_salida_almuerzoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelhora_salida_almuerzoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salida_almuerzoTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salida_almuerzoTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salida_almuerzoTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salida_almuerzoTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salida_almuerzoTurno= new JFormattedTextFieldMe();

		jSpinnerhora_salida_almuerzoTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salida_almuerzoTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salida_almuerzoTurno = new JSpinner.DateEditor(jSpinnerhora_salida_almuerzoTurno, "HH:mm:ss");

		jSpinnerhora_salida_almuerzoTurno.setEditor(timeEditorhora_salida_almuerzoTurno);

		jSpinnerhora_salida_almuerzoTurno.setValue(new Date());

		jSpinnerhora_salida_almuerzoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida_almuerzoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida_almuerzoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salida_almuerzoTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salida_almuerzoTurno.setValue(new Date());
		//jSpinnerhora_salida_almuerzoTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salida_almuerzoTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salida_almuerzoTurnoBusqueda= new JButtonMe();
		this.jButtonhora_salida_almuerzoTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida_almuerzoTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida_almuerzoTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salida_almuerzoTurnoBusqueda.setText("U");
		this.jButtonhora_salida_almuerzoTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salida_almuerzoTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salida_almuerzoTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salida_almuerzoTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salida_almuerzoTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salida_almuerzoTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salida_almuerzoTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_durante_almuerzoTurno = new JLabelMe();
		this.jLabelhora_durante_almuerzoTurno.setText(""+TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO+" : *");
		this.jLabelhora_durante_almuerzoTurno.setToolTipText("Hora Durante Almuerzo");
		this.jLabelhora_durante_almuerzoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelhora_durante_almuerzoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelhora_durante_almuerzoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_durante_almuerzoTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_durante_almuerzoTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_durante_almuerzoTurno.setToolTipText(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_durante_almuerzoTurno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_durante_almuerzoTurno= new JFormattedTextFieldMe();

		jSpinnerhora_durante_almuerzoTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_durante_almuerzoTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_durante_almuerzoTurno = new JSpinner.DateEditor(jSpinnerhora_durante_almuerzoTurno, "HH:mm:ss");

		jSpinnerhora_durante_almuerzoTurno.setEditor(timeEditorhora_durante_almuerzoTurno);

		jSpinnerhora_durante_almuerzoTurno.setValue(new Date());

		jSpinnerhora_durante_almuerzoTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_durante_almuerzoTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_durante_almuerzoTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_durante_almuerzoTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_durante_almuerzoTurno.setValue(new Date());
		//jSpinnerhora_durante_almuerzoTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_durante_almuerzoTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_durante_almuerzoTurnoBusqueda= new JButtonMe();
		this.jButtonhora_durante_almuerzoTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_durante_almuerzoTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_durante_almuerzoTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_durante_almuerzoTurnoBusqueda.setText("U");
		this.jButtonhora_durante_almuerzoTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_durante_almuerzoTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_durante_almuerzoTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_durante_almuerzoTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_durante_almuerzoTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_durante_almuerzoTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_durante_almuerzoTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_ingreso25Turno = new JLabelMe();
		this.jLabelhora_ingreso25Turno.setText(""+TurnoConstantesFunciones.LABEL_HORAINGRESO25+" : *");
		this.jLabelhora_ingreso25Turno.setToolTipText("Hora Ingreso25");
		this.jLabelhora_ingreso25Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_ingreso25Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_ingreso25Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_ingreso25Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_ingreso25Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_ingreso25Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAINGRESO25);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_ingreso25Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_ingreso25Turno= new JFormattedTextFieldMe();

		jSpinnerhora_ingreso25Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_ingreso25Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_ingreso25Turno = new JSpinner.DateEditor(jSpinnerhora_ingreso25Turno, "HH:mm:ss");

		jSpinnerhora_ingreso25Turno.setEditor(timeEditorhora_ingreso25Turno);

		jSpinnerhora_ingreso25Turno.setValue(new Date());

		jSpinnerhora_ingreso25Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso25Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso25Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_ingreso25Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_ingreso25Turno.setValue(new Date());
		//jSpinnerhora_ingreso25Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_ingreso25Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_ingreso25TurnoBusqueda= new JButtonMe();
		this.jButtonhora_ingreso25TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso25TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso25TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_ingreso25TurnoBusqueda.setText("U");
		this.jButtonhora_ingreso25TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_ingreso25TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_ingreso25TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_ingreso25Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_ingreso25Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_ingreso25TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_ingreso25TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salida25Turno = new JLabelMe();
		this.jLabelhora_salida25Turno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDA25+" : *");
		this.jLabelhora_salida25Turno.setToolTipText("Hora Salida25");
		this.jLabelhora_salida25Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida25Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida25Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salida25Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salida25Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salida25Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDA25);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salida25Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salida25Turno= new JFormattedTextFieldMe();

		jSpinnerhora_salida25Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salida25Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salida25Turno = new JSpinner.DateEditor(jSpinnerhora_salida25Turno, "HH:mm:ss");

		jSpinnerhora_salida25Turno.setEditor(timeEditorhora_salida25Turno);

		jSpinnerhora_salida25Turno.setValue(new Date());

		jSpinnerhora_salida25Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida25Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida25Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salida25Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salida25Turno.setValue(new Date());
		//jSpinnerhora_salida25Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salida25Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salida25TurnoBusqueda= new JButtonMe();
		this.jButtonhora_salida25TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida25TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida25TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salida25TurnoBusqueda.setText("U");
		this.jButtonhora_salida25TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salida25TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salida25TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salida25Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salida25Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salida25TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salida25TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_ingreso50Turno = new JLabelMe();
		this.jLabelhora_ingreso50Turno.setText(""+TurnoConstantesFunciones.LABEL_HORAINGRESO50+" : *");
		this.jLabelhora_ingreso50Turno.setToolTipText("Hora Ingreso50");
		this.jLabelhora_ingreso50Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_ingreso50Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_ingreso50Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_ingreso50Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_ingreso50Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_ingreso50Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAINGRESO50);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_ingreso50Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_ingreso50Turno= new JFormattedTextFieldMe();

		jSpinnerhora_ingreso50Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_ingreso50Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_ingreso50Turno = new JSpinner.DateEditor(jSpinnerhora_ingreso50Turno, "HH:mm:ss");

		jSpinnerhora_ingreso50Turno.setEditor(timeEditorhora_ingreso50Turno);

		jSpinnerhora_ingreso50Turno.setValue(new Date());

		jSpinnerhora_ingreso50Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso50Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso50Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_ingreso50Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_ingreso50Turno.setValue(new Date());
		//jSpinnerhora_ingreso50Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_ingreso50Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_ingreso50TurnoBusqueda= new JButtonMe();
		this.jButtonhora_ingreso50TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso50TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso50TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_ingreso50TurnoBusqueda.setText("U");
		this.jButtonhora_ingreso50TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_ingreso50TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_ingreso50TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_ingreso50Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_ingreso50Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_ingreso50TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_ingreso50TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salida50Turno = new JLabelMe();
		this.jLabelhora_salida50Turno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDA50+" : *");
		this.jLabelhora_salida50Turno.setToolTipText("Hora Salida50");
		this.jLabelhora_salida50Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida50Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida50Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salida50Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salida50Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salida50Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDA50);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salida50Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salida50Turno= new JFormattedTextFieldMe();

		jSpinnerhora_salida50Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salida50Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salida50Turno = new JSpinner.DateEditor(jSpinnerhora_salida50Turno, "HH:mm:ss");

		jSpinnerhora_salida50Turno.setEditor(timeEditorhora_salida50Turno);

		jSpinnerhora_salida50Turno.setValue(new Date());

		jSpinnerhora_salida50Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida50Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida50Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salida50Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salida50Turno.setValue(new Date());
		//jSpinnerhora_salida50Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salida50Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salida50TurnoBusqueda= new JButtonMe();
		this.jButtonhora_salida50TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida50TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida50TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salida50TurnoBusqueda.setText("U");
		this.jButtonhora_salida50TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salida50TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salida50TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salida50Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salida50Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salida50TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salida50TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_ingreso100Turno = new JLabelMe();
		this.jLabelhora_ingreso100Turno.setText(""+TurnoConstantesFunciones.LABEL_HORAINGRESO100+" : *");
		this.jLabelhora_ingreso100Turno.setToolTipText("Hora Ingreso100");
		this.jLabelhora_ingreso100Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_ingreso100Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_ingreso100Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_ingreso100Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_ingreso100Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_ingreso100Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAINGRESO100);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_ingreso100Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_ingreso100Turno= new JFormattedTextFieldMe();

		jSpinnerhora_ingreso100Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_ingreso100Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_ingreso100Turno = new JSpinner.DateEditor(jSpinnerhora_ingreso100Turno, "HH:mm:ss");

		jSpinnerhora_ingreso100Turno.setEditor(timeEditorhora_ingreso100Turno);

		jSpinnerhora_ingreso100Turno.setValue(new Date());

		jSpinnerhora_ingreso100Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso100Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso100Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_ingreso100Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_ingreso100Turno.setValue(new Date());
		//jSpinnerhora_ingreso100Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_ingreso100Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_ingreso100TurnoBusqueda= new JButtonMe();
		this.jButtonhora_ingreso100TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso100TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso100TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_ingreso100TurnoBusqueda.setText("U");
		this.jButtonhora_ingreso100TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_ingreso100TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_ingreso100TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_ingreso100Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_ingreso100Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_ingreso100TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_ingreso100TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salida100Turno = new JLabelMe();
		this.jLabelhora_salida100Turno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDA100+" : *");
		this.jLabelhora_salida100Turno.setToolTipText("Hora Salida100");
		this.jLabelhora_salida100Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida100Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida100Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salida100Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salida100Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salida100Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDA100);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salida100Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salida100Turno= new JFormattedTextFieldMe();

		jSpinnerhora_salida100Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salida100Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salida100Turno = new JSpinner.DateEditor(jSpinnerhora_salida100Turno, "HH:mm:ss");

		jSpinnerhora_salida100Turno.setEditor(timeEditorhora_salida100Turno);

		jSpinnerhora_salida100Turno.setValue(new Date());

		jSpinnerhora_salida100Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida100Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida100Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salida100Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salida100Turno.setValue(new Date());
		//jSpinnerhora_salida100Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salida100Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salida100TurnoBusqueda= new JButtonMe();
		this.jButtonhora_salida100TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida100TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida100TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salida100TurnoBusqueda.setText("U");
		this.jButtonhora_salida100TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salida100TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salida100TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salida100Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salida100Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salida100TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salida100TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_ingreso200Turno = new JLabelMe();
		this.jLabelhora_ingreso200Turno.setText(""+TurnoConstantesFunciones.LABEL_HORAINGRESO200+" : *");
		this.jLabelhora_ingreso200Turno.setToolTipText("Hora Ingreso200");
		this.jLabelhora_ingreso200Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_ingreso200Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhora_ingreso200Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_ingreso200Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_ingreso200Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_ingreso200Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORAINGRESO200);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_ingreso200Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_ingreso200Turno= new JFormattedTextFieldMe();

		jSpinnerhora_ingreso200Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_ingreso200Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_ingreso200Turno = new JSpinner.DateEditor(jSpinnerhora_ingreso200Turno, "HH:mm:ss");

		jSpinnerhora_ingreso200Turno.setEditor(timeEditorhora_ingreso200Turno);

		jSpinnerhora_ingreso200Turno.setValue(new Date());

		jSpinnerhora_ingreso200Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso200Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_ingreso200Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_ingreso200Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_ingreso200Turno.setValue(new Date());
		//jSpinnerhora_ingreso200Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_ingreso200Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_ingreso200TurnoBusqueda= new JButtonMe();
		this.jButtonhora_ingreso200TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso200TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_ingreso200TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_ingreso200TurnoBusqueda.setText("U");
		this.jButtonhora_ingreso200TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_ingreso200TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_ingreso200TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_ingreso200Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_ingreso200Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_ingreso200TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_ingreso200TurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_salida200Turno = new JLabelMe();
		this.jLabelhora_salida200Turno.setText(""+TurnoConstantesFunciones.LABEL_HORASALIDA200+" : *");
		this.jLabelhora_salida200Turno.setToolTipText("Hora Salida200");
		this.jLabelhora_salida200Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida200Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_salida200Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_salida200Turno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_salida200Turno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_salida200Turno.setToolTipText(TurnoConstantesFunciones.LABEL_HORASALIDA200);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelhora_salida200Turno.setLayout(this.gridaBagLayoutTurno);


		//jFormattedTextFieldhora_salida200Turno= new JFormattedTextFieldMe();

		jSpinnerhora_salida200Turno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_salida200Turno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_salida200Turno = new JSpinner.DateEditor(jSpinnerhora_salida200Turno, "HH:mm:ss");

		jSpinnerhora_salida200Turno.setEditor(timeEditorhora_salida200Turno);

		jSpinnerhora_salida200Turno.setValue(new Date());

		jSpinnerhora_salida200Turno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida200Turno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_salida200Turno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_salida200Turno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_salida200Turno.setValue(new Date());
		//jSpinnerhora_salida200Turno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_salida200Turno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_salida200TurnoBusqueda= new JButtonMe();
		this.jButtonhora_salida200TurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida200TurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_salida200TurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_salida200TurnoBusqueda.setText("U");
		this.jButtonhora_salida200TurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_salida200TurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_salida200TurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_salida200Turno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_salida200Turno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_salida200TurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_salida200TurnoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTurno() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTurno = new JLabelMe();
		this.jLabelid_empresaTurno.setText(""+TurnoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTurno.setToolTipText("Empresa");
		this.jLabelid_empresaTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTurno.setToolTipText(TurnoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTurno = new GridBagLayout();
		this.jPanelid_empresaTurno.setLayout(this.gridaBagLayoutTurno);


		jComboBoxid_empresaTurno= new JComboBoxMe();
		jComboBoxid_empresaTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTurno.setEnabled(false);

		this.jButtonid_empresaTurno= new JButtonMe();
		this.jButtonid_empresaTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTurno.setText("Buscar");
		this.jButtonid_empresaTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTurno"));

		this.jButtonid_empresaTurnoBusqueda= new JButtonMe();
		this.jButtonid_empresaTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTurnoBusqueda.setText("U");
		this.jButtonid_empresaTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTurnoBusqueda"));

		if(this.turnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTurnoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTurnoUpdate= new JButtonMe();
		this.jButtonid_empresaTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTurnoUpdate.setText("U");
		this.jButtonid_empresaTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTurnoUpdate"));



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
		//this.jInternalFrameDetalleTurno = new TurnoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Turno DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTurno= new GridBagLayout();
		

		
		String sToolTipTurno="";
		sToolTipTurno=TurnoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTurno+="(Nomina.Turno)";
		}
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTurno+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTurno = new JButtonMe();
		this.jButtonModificarTurno = new JButtonMe();
        this.jButtonActualizarTurno = new JButtonMe();
        this.jButtonEliminarTurno = new JButtonMe();
        this.jButtonCancelarTurno = new JButtonMe();
        this.jButtonGuardarCambiosTurno = new JButtonMe();
		this.jButtonGuardarCambiosTablaTurno = new JButtonMe();
		this.jButtonCerrarTurno = new JButtonMe();
		
		this.jScrollPanelDatosTurno = new JScrollPane();   
        this.jScrollPanelDatosEdicionTurno = new JScrollPane();
		this.jScrollPanelDatosGeneralTurno = new JScrollPane();
				
		
		
		this.jPanelCamposTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Turno";
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turnos" + this.sPath));
		} else {
			this.jScrollPanelDatosTurno.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTurno.setName("jPanelCamposTurno"); 

		this.jPanelCamposOcultosTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTurno.setName("jPanelCamposOcultosTurno"); 

        this.jPanelAccionesTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTurno.setToolTipText("Acciones");
        this.jPanelAccionesTurno.setName("Acciones"); 

		this.jPanelAccionesFormularioTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTurno.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTurno.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTurno, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTurno, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTurno, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTurno.setText("Nuevo");
		this.jButtonModificarTurno.setText("Editar");
        this.jButtonActualizarTurno.setText("Actualizar");
        this.jButtonEliminarTurno.setText("Eliminar");
        this.jButtonCancelarTurno.setText("Cancelar");
        this.jButtonGuardarCambiosTurno.setText("Guardar");
		this.jButtonGuardarCambiosTablaTurno.setText("Guardar");
		this.jButtonCerrarTurno.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTurno,"nuevo_button","Nuevo",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTurno,"modificar_button","Editar",this.turnoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTurno,"actualizar_button","Actualizar",this.turnoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTurno,"eliminar_button","Eliminar",this.turnoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTurno,"cancelar_button","Cancelar",this.turnoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTurno,"guardarcambios_button","Guardar",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTurno,"guardarcambiostabla_button","Guardar",this.turnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTurno,"cerrar_button","Salir",this.turnoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTurno.setToolTipText("Nuevo"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTurno.setToolTipText("Editar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTurno.setToolTipText("Actualizar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTurno.setToolTipText("Eliminar)"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTurno.setToolTipText("Cancelar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTurno.setToolTipText("Guardar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTurno.setToolTipText("Guardar"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTurno.setToolTipText("Salir"+" "+TurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTurno";
		inputMap = this.jButtonNuevoTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTurno"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTurno";
		inputMap = this.jButtonActualizarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTurno"));
		
		//ELIMINAR
		sMapKey = "EliminarTurno";
		inputMap = this.jButtonEliminarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTurno"));
		
		//CANCELAR	
		sMapKey = "CancelarTurno";
		inputMap = this.jButtonCancelarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTurno"));
		
		//CERRAR		
		sMapKey = "CerrarTurno";
		inputMap = this.jButtonCerrarTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTurno"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTurno";
		inputMap = this.jButtonGuardarCambiosTablaTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTurno"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTurno = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTurno.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTurno.setToolTipText("Nuevo Turno");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTurno, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTurno = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTurno.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTurno.setToolTipText("Sin Cerrar Ventana Turno");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTurno, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTurno = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTurno.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTurno.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTurno, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTurno = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTurno.setText("Accion");
		this.jComboBoxTiposAccionesTurno.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTurno = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTurno.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTurno.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTurno = new JLabelMe();
		
		this.jLabelAccionesTurno.setText("Acciones");		
		this.jLabelAccionesTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTurno();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTurno();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTurno=new JTabbedPane();
		this.jTabbedPaneRelacionesTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTurno.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTurno.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTurno.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTurno, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTurno = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTurno = new GridBagLayout();
		
		this.jPanelCamposTurno.setLayout(gridaBagLayoutCamposTurno);
		this.jPanelCamposOcultosTurno.setLayout(gridaBagLayoutCamposOcultosTurno);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTurno.add(jLabelIdTurno, this.gridBagConstraintsTurno);



	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTurno.add(jLabelidTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTurno.add(jLabelid_empresaTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTurno.add(jButtonid_empresaTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 3;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTurno.add(jButtonid_empresaTurnoUpdate, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTurno.add(jComboBoxid_empresaTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_entradaTurno.add(jLabelhora_entradaTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_entradaTurno.add(jButtonhora_entradaTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_entradaTurno.add(jSpinnerhora_entradaTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salidaTurno.add(jLabelhora_salidaTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salidaTurno.add(jButtonhora_salidaTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salidaTurno.add(jSpinnerhora_salidaTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_ingreso_recesoTurno.add(jLabelhora_ingreso_recesoTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_ingreso_recesoTurno.add(jButtonhora_ingreso_recesoTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_ingreso_recesoTurno.add(jSpinnerhora_ingreso_recesoTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salida_recesoTurno.add(jLabelhora_salida_recesoTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salida_recesoTurno.add(jButtonhora_salida_recesoTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salida_recesoTurno.add(jSpinnerhora_salida_recesoTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_durante_recesoTurno.add(jLabelhora_durante_recesoTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_durante_recesoTurno.add(jButtonhora_durante_recesoTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_durante_recesoTurno.add(jSpinnerhora_durante_recesoTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_ingreso_almuerzoTurno.add(jLabelhora_ingreso_almuerzoTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_ingreso_almuerzoTurno.add(jButtonhora_ingreso_almuerzoTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_ingreso_almuerzoTurno.add(jSpinnerhora_ingreso_almuerzoTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salida_almuerzoTurno.add(jLabelhora_salida_almuerzoTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salida_almuerzoTurno.add(jButtonhora_salida_almuerzoTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salida_almuerzoTurno.add(jSpinnerhora_salida_almuerzoTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_durante_almuerzoTurno.add(jLabelhora_durante_almuerzoTurno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_durante_almuerzoTurno.add(jButtonhora_durante_almuerzoTurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_durante_almuerzoTurno.add(jSpinnerhora_durante_almuerzoTurno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_ingreso25Turno.add(jLabelhora_ingreso25Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_ingreso25Turno.add(jButtonhora_ingreso25TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_ingreso25Turno.add(jSpinnerhora_ingreso25Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salida25Turno.add(jLabelhora_salida25Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salida25Turno.add(jButtonhora_salida25TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salida25Turno.add(jSpinnerhora_salida25Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_ingreso50Turno.add(jLabelhora_ingreso50Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_ingreso50Turno.add(jButtonhora_ingreso50TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_ingreso50Turno.add(jSpinnerhora_ingreso50Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salida50Turno.add(jLabelhora_salida50Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salida50Turno.add(jButtonhora_salida50TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salida50Turno.add(jSpinnerhora_salida50Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_ingreso100Turno.add(jLabelhora_ingreso100Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_ingreso100Turno.add(jButtonhora_ingreso100TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_ingreso100Turno.add(jSpinnerhora_ingreso100Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salida100Turno.add(jLabelhora_salida100Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salida100Turno.add(jButtonhora_salida100TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salida100Turno.add(jSpinnerhora_salida100Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_ingreso200Turno.add(jLabelhora_ingreso200Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_ingreso200Turno.add(jButtonhora_ingreso200TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_ingreso200Turno.add(jSpinnerhora_ingreso200Turno, this.gridBagConstraintsTurno);


	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 0;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_salida200Turno.add(jLabelhora_salida200Turno, this.gridBagConstraintsTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurno = new GridBagConstraints();
		//this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = 2;
		this.gridBagConstraintsTurno.ipadx = 0;
		this.gridBagConstraintsTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_salida200Turno.add(jButtonhora_salida200TurnoBusqueda, this.gridBagConstraintsTurno);
	}

	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurno.gridy = 0;
	this.gridBagConstraintsTurno.gridx = 1;
	this.gridBagConstraintsTurno.ipadx = 0;
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_salida200Turno.add(jSpinnerhora_salida200Turno, this.gridBagConstraintsTurno);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelidTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_entradaTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salidaTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_ingreso_recesoTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salida_recesoTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_durante_recesoTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_ingreso_almuerzoTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salida_almuerzoTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_durante_almuerzoTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_ingreso25Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salida25Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_ingreso50Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salida50Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_ingreso100Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salida100Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_ingreso200Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurno.add(this.jPanelhora_salida200Turno, this.gridBagConstraintsTurno);



	if(iXPanelCamposTurno % 2==0) {
		iXPanelCamposTurno=0;
		iYPanelCamposTurno++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTurno = new GridBagConstraints();
	this.gridBagConstraintsTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurno.gridy = iYPanelCamposOcultosTurno;
	this.gridBagConstraintsTurno.gridx = iXPanelCamposOcultosTurno++;
	this.gridBagConstraintsTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTurno.add(this.jPanelid_empresaTurno, this.gridBagConstraintsTurno);



	if(iXPanelCamposOcultosTurno % 2==0) {
		iXPanelCamposOcultosTurno=0;
		iYPanelCamposOcultosTurno++;
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
			
		GridBagLayout gridaBagLayoutAccionesTurno= new GridBagLayout();
		this.jPanelAccionesTurno.setLayout(gridaBagLayoutAccionesTurno);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTurno= new GridBagLayout();
		this.jPanelAccionesFormularioTurno.setLayout(gridaBagLayoutAccionesFormularioTurno);
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTurno.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTurno.add(this.jComboBoxTiposAccionesFormularioTurno, this.gridBagConstraintsTurno);

		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTurno.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTurno.add(this.jCheckBoxPostAccionNuevoTurno, this.gridBagConstraintsTurno);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.turnoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTurno.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTurno.add(this.jCheckBoxPostAccionSinCerrarTurno, this.gridBagConstraintsTurno);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.turnoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.turnoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTurno.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTurno.add(this.jCheckBoxPostAccionSinMensajeTurno, this.gridBagConstraintsTurno);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx = iPosXAccion++;
			
		this.jPanelAccionesTurno.add(this.jButtonModificarTurno, this.gridBagConstraintsTurno);							

		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurno.gridy = 0;
		this.gridBagConstraintsTurno.gridx =iPosXAccion++;
			
		this.jPanelAccionesTurno.add(this.jButtonEliminarTurno, this.gridBagConstraintsTurno);
		
			
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = 0;		
		this.gridBagConstraintsTurno.gridx = iPosXAccion++;
		
		this.jPanelAccionesTurno.add(this.jButtonActualizarTurno, this.gridBagConstraintsTurno);


		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = 0;		
		this.gridBagConstraintsTurno.gridx = iPosXAccion++;
		
		this.jPanelAccionesTurno.add(this.jButtonGuardarCambiosTurno, this.gridBagConstraintsTurno);	
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = 0;		
		this.gridBagConstraintsTurno.gridx =iPosXAccion++;
		
		this.jPanelAccionesTurno.add(this.jButtonCancelarTurno, this.gridBagConstraintsTurno);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTurno = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTurno);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.turnoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTurno = new GridBagConstraints();						
			this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTurno.gridx = 0;		
			//this.gridBagConstraintsTurno.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTurno.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTurno.gridx =0;
		this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTurno.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTurno, this.gridBagConstraintsTurno);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TurnoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTurno = new TurnoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Turno DATOS");
			
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
			
	        //this.setTitle("[FOR] - Turno DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Turno Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TurnoModel turnoModel=new TurnoModel(this);
			
			//SI USARA CLASE INTERNA
			//TurnoModel.TurnoFocusTraversalPolicy turnoFocusTraversalPolicy = turnoModel.new TurnoFocusTraversalPolicy(this);
			
			//turnoFocusTraversalPolicy.setturnoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(turnoModel);
			
			
			this.jContentPaneDetalleTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTurno = new GridBagLayout();	
			this.jContentPaneDetalleTurno.setLayout(gridaBagLayoutDetalleTurno);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTurno = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTurno = new GridBagConstraints();
				this.gridBagConstraintsTurno.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTurno.gridx = 0;
					
				
				this.jContentPaneDetalleTurno.add(jTtoolBarDetalleTurno, gridBagConstraintsTurno);								
				
}
			
			this.jScrollPanelDatosEdicionTurno=   new JScrollPane(jContentPaneDetalleTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTurno=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTurno.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTurno.gridx = 0;
	        
			this.jContentPaneDetalleTurno.add(jPanelCamposTurno, gridBagConstraintsTurno);
			
			
			
			
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
						&& turnoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.turnoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTurno= new GridBagConstraints();
						this.gridBagConstraintsTurno.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTurno.gridx = 0;
						this.jContentPaneDetalleTurno.add(this.jTabbedPaneRelacionesTurno, this.gridBagConstraintsTurno);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTurno.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTurno.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTurno = new GridBagConstraints();
					this.gridBagConstraintsTurno.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTurno.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTurno.gridx = 0;
					
				
					this.jContentPaneDetalleTurno.add(jPanelCamposOcultosTurno, gridBagConstraintsTurno);
				
					this.jPanelCamposOcultosTurno.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTurno.gridx = 0;
	        this.gridBagConstraintsTurno.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTurno.add(this.jPanelAccionesFormularioTurno, this.gridBagConstraintsTurno);							
			
			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
	        this.gridBagConstraintsTurno.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTurno.gridx = 0;
	        
			
			this.jContentPaneDetalleTurno.add(this.jPanelAccionesTurno, this.gridBagConstraintsTurno);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTurno);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTurno=   new JScrollPane(this.jPanelCamposTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTurno.gridx = 0;
			this.gridBagConstraintsTurno.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTurno.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTurno.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTurno, this.gridBagConstraintsTurno);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTurno.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTurno, this.gridBagConstraintsTurno);			
			
			this.gridBagConstraintsTurno = new GridBagConstraints();
			this.gridBagConstraintsTurno.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTurno.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTurno, this.gridBagConstraintsTurno);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTurno, this.gridBagConstraintsTurno);
			
			
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTurno, this.gridBagConstraintsTurno);
		
			
		this.gridBagConstraintsTurno = new GridBagConstraints();
		this.gridBagConstraintsTurno.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTurno.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTurno, this.gridBagConstraintsTurno);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTurno;//jContentPane;
		
		return jScrollPanelDatosEdicionTurno;
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
