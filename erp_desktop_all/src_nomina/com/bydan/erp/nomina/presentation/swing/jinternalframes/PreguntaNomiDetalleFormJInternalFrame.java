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
import com.bydan.erp.nomina.util.PreguntaNomiConstantesFunciones;

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
public class PreguntaNomiDetalleFormJInternalFrame extends PreguntaNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePreguntaNomi;
	
	protected JMenuBar jmenuBarDetallePreguntaNomi;
	
	protected JMenu jmenuDetallePreguntaNomi;
	protected JMenu jmenuDetalleArchivoPreguntaNomi;
	protected JMenu jmenuDetalleAccionesPreguntaNomi;
	protected JMenu jmenuDetalleDatosPreguntaNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreguntaNomi;	
	protected GridBagConstraints gridBagConstraintsPreguntaNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PreguntaNomiBeanSwingJInternalFrameAdditional jInternalFrameDetallePreguntaNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factornomi="";
	
	public PreguntaNomiSessionBean preguntanomiSessionBean;
	
	

	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomiPreguntaNomi=false;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;

	public DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;
	public DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleEvaluacionNomi=false;
	public DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public FactorNomiSessionBean factornomiSessionBean;	
	
	public PreguntaNomiLogic preguntanomiLogic;
	
	public JScrollPane jScrollPanelDatosPreguntaNomi;
	public JScrollPane jScrollPanelDatosEdicionPreguntaNomi;
	public JScrollPane jScrollPanelDatosGeneralPreguntaNomi;
	
	protected JPanel jPanelCamposPreguntaNomi;    
	protected JPanel jPanelCamposOcultosPreguntaNomi;    	
	protected JPanel jPanelAccionesPreguntaNomi;
	protected JPanel jPanelAccionesFormularioPreguntaNomi;
    
	
	
	protected Integer iXPanelCamposPreguntaNomi=0;
	protected Integer iYPanelCamposPreguntaNomi=0;
	
	protected Integer iXPanelCamposOcultosPreguntaNomi=0;
	protected Integer iYPanelCamposOcultosPreguntaNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPreguntaNomi;
	public JButton jButtonModificarPreguntaNomi;
	public JButton jButtonActualizarPreguntaNomi;
    public JButton jButtonEliminarPreguntaNomi;
	public JButton jButtonCancelarPreguntaNomi;
    public JButton jButtonGuardarCambiosPreguntaNomi;
	public JButton jButtonGuardarCambiosTablaPreguntaNomi;
	protected JButton jButtonCerrarPreguntaNomi;
	
	
	protected JButton jButtonProcesarInformacionPreguntaNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPreguntaNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPreguntaNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajePreguntaNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreguntaNomi;
	protected JButton jButtonModificarToolBarPreguntaNomi;
	protected JButton jButtonActualizarToolBarPreguntaNomi;
    protected JButton jButtonEliminarToolBarPreguntaNomi;
	protected JButton jButtonCancelarToolBarPreguntaNomi;
    protected JButton jButtonGuardarCambiosToolBarPreguntaNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarPreguntaNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarPreguntaNomi;
	protected JButton jButtonCerrarToolBarPreguntaNomi;
	
	protected JButton jButtonProcesarInformacionToolBarPreguntaNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreguntaNomi;
	protected JMenuItem jMenuItemModificarPreguntaNomi;
	protected JMenuItem jMenuItemActualizarPreguntaNomi;
    protected JMenuItem jMenuItemEliminarPreguntaNomi;
	protected JMenuItem jMenuItemCancelarPreguntaNomi;
    protected JMenuItem jMenuItemGuardarCambiosPreguntaNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreguntaNomi;
	protected JMenuItem jMenuItemCerrarPreguntaNomi;
	protected JMenuItem jMenuItemDetalleCerrarPreguntaNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreguntaNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionPreguntaNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreguntaNomi;
	protected JMenuItem jMenuItemMostrarOcultarPreguntaNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreguntaNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreguntaNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPreguntaNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPreguntaNomi;
	public JLabel jLabelIdPreguntaNomi;
	public JLabel jLabelidPreguntaNomi;
	public JButton jButtonidPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelpreguntaPreguntaNomi;
	public JLabel jLabelpreguntaPreguntaNomi;
	public JTextArea jTextAreapreguntaPreguntaNomi;
	public JScrollPane jscrollPanepreguntaPreguntaNomi;
	public JButton jButtonpreguntaPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelordenPreguntaNomi;
	public JLabel jLabelordenPreguntaNomi;
	public JTextField jTextFieldordenPreguntaNomi;
	public JButton jButtonordenPreguntaNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPreguntaNomi;
	public JLabel jLabelid_empresaPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPreguntaNomi;
	public JButton jButtonid_empresaPreguntaNomi= new JButtonMe();
	public JButton jButtonid_empresaPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_factor_nomiPreguntaNomi;
	public JLabel jLabelid_factor_nomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factor_nomiPreguntaNomi;
	public JButton jButtonid_factor_nomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_factor_nomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_factor_nomiPreguntaNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPreguntaNomi;
	
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
	
	public PreguntaNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPreguntaNomi=new JPanel();
				this.jPanelAccionesFormularioPreguntaNomi=new JPanel();
				this.jmenuBarDetallePreguntaNomi=new JMenuBar();
				this.jTtoolBarDetallePreguntaNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PreguntaNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPreguntaNomi() {
		return this.jButtonActualizarToolBarPreguntaNomi;
	}
	
	public JButton getjButtonEliminarToolBarPreguntaNomi() {
		return this.jButtonEliminarToolBarPreguntaNomi;
	}
	
	public JButton getjButtonCancelarToolBarPreguntaNomi() {
		return this.jButtonCancelarToolBarPreguntaNomi;
	}		
	
	public JButton getjButtonProcesarInformacionPreguntaNomi() {
		return this.jButtonProcesarInformacionPreguntaNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreguntaNomi)	{
		this.jButtonProcesarInformacionPreguntaNomi = jButtonProcesarInformacionPreguntaNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreguntaNomi() {
		return this.jComboBoxTiposAccionesPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreguntaNomi(
			JComboBox jComboBoxTiposRelacionesPreguntaNomi) {
		this.jComboBoxTiposRelacionesPreguntaNomi = jComboBoxTiposRelacionesPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreguntaNomi(
			JComboBox jComboBoxTiposAccionesPreguntaNomi) {
		this.jComboBoxTiposAccionesPreguntaNomi = jComboBoxTiposAccionesPreguntaNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPreguntaNomi() {
		return this.jComboBoxTiposAccionesFormularioPreguntaNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPreguntaNomi(
			JComboBox jComboBoxTiposAccionesFormularioPreguntaNomi) {
		this.jComboBoxTiposAccionesFormularioPreguntaNomi = jComboBoxTiposAccionesFormularioPreguntaNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
		
		this.preguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.preguntanomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		//this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreguntaNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pregunta Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
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
	
		PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePreguntaNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPreguntaNomi=new JButtonMe();
				this.jButtonModificarToolBarPreguntaNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPreguntaNomi,this.jTtoolBarDetallePreguntaNomi,
							"actualizar","actualizar","Actualizar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPreguntaNomi,this.jTtoolBarDetallePreguntaNomi,
							"eliminar","eliminar","Eliminar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPreguntaNomi,this.jTtoolBarDetallePreguntaNomi,
							"cancelar","cancelar","Cancelar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPreguntaNomi,this.jTtoolBarDetallePreguntaNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePreguntaNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePreguntaNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPreguntaNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPreguntaNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPreguntaNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreguntaNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreguntaNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreguntaNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPreguntaNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPreguntaNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPreguntaNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPreguntaNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPreguntaNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPreguntaNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPreguntaNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPreguntaNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPreguntaNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPreguntaNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPreguntaNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPreguntaNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPreguntaNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreguntaNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreguntaNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreguntaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreguntaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreguntaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPreguntaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPreguntaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPreguntaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPreguntaNomi.add(this.jMenuItemDetalleCerrarPreguntaNomi);
		
		this.jmenuDetalleAccionesPreguntaNomi.add(this.jMenuItemActualizarPreguntaNomi);
		this.jmenuDetalleAccionesPreguntaNomi.add(this.jMenuItemEliminarPreguntaNomi);
		this.jmenuDetalleAccionesPreguntaNomi.add(this.jMenuItemCancelarPreguntaNomi);		
		
		//this.jmenuDetalleDatosPreguntaNomi.add(this.jMenuItemDetalleAbrirOrderByPreguntaNomi);				
		this.jmenuDetalleDatosPreguntaNomi.add(this.jMenuItemDetalleMostarOcultarPreguntaNomi);				
				
		//this.jmenuDetalleAccionesPreguntaNomi.add(this.jMenuItemGuardarCambiosPreguntaNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePreguntaNomi.add(this.jmenuDetalleArchivoPreguntaNomi);		
		this.jmenuBarDetallePreguntaNomi.add(this.jmenuDetalleAccionesPreguntaNomi);		
		this.jmenuBarDetallePreguntaNomi.add(this.jmenuDetalleDatosPreguntaNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePreguntaNomi.add(this.jmenuDetallePreguntaNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePreguntaNomi);				
	}
	
	
	public void inicializarElementosCamposPreguntaNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPreguntaNomi = new JLabelMe();
		jLabelIdPreguntaNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPreguntaNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPreguntaNomi.setToolTipText(PreguntaNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPreguntaNomi= new GridBagLayout();

		this.jPanelidPreguntaNomi.setLayout(this.gridaBagLayoutPreguntaNomi);

		jLabelidPreguntaNomi = new JLabel();
		jLabelidPreguntaNomi.setText("Id");

		jLabelidPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelpreguntaPreguntaNomi = new JLabelMe();
		this.jLabelpreguntaPreguntaNomi.setText(""+PreguntaNomiConstantesFunciones.LABEL_PREGUNTA+" : *");
		this.jLabelpreguntaPreguntaNomi.setToolTipText("Pregunta");
		this.jLabelpreguntaPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreguntaPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreguntaPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpreguntaPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpreguntaPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpreguntaPreguntaNomi.setToolTipText(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA);
		this.gridaBagLayoutPreguntaNomi = new GridBagLayout();
		this.jPanelpreguntaPreguntaNomi.setLayout(this.gridaBagLayoutPreguntaNomi);


		jTextAreapreguntaPreguntaNomi= new JTextAreaMe();
		jTextAreapreguntaPreguntaNomi.setEnabled(false);
		jTextAreapreguntaPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaPreguntaNomi.setLineWrap(true);
		jTextAreapreguntaPreguntaNomi.setWrapStyleWord(true);
		jTextAreapreguntaPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapreguntaPreguntaNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapreguntaPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepreguntaPreguntaNomi = new JScrollPane(jTextAreapreguntaPreguntaNomi);
		jscrollPanepreguntaPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreguntaPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreguntaPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpreguntaPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonpreguntaPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreguntaPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreguntaPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpreguntaPreguntaNomiBusqueda.setText("U");
		this.jButtonpreguntaPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpreguntaPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpreguntaPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapreguntaPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapreguntaPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"preguntaPreguntaNomiBusqueda"));

		if(this.preguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpreguntaPreguntaNomiBusqueda.setVisible(false);		}


					
		this.jLabelordenPreguntaNomi = new JLabelMe();
		this.jLabelordenPreguntaNomi.setText(""+PreguntaNomiConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenPreguntaNomi.setToolTipText("Orden");
		this.jLabelordenPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPreguntaNomi.setToolTipText(PreguntaNomiConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPreguntaNomi = new GridBagLayout();
		this.jPanelordenPreguntaNomi.setLayout(this.gridaBagLayoutPreguntaNomi);


		jTextFieldordenPreguntaNomi= new JTextFieldMe();
		jTextFieldordenPreguntaNomi.setEnabled(false);
		jTextFieldordenPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenPreguntaNomi.setText("0");

		this.jButtonordenPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonordenPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPreguntaNomiBusqueda.setText("U");
		this.jButtonordenPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPreguntaNomiBusqueda"));

		if(this.preguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPreguntaNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPreguntaNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPreguntaNomi = new JLabelMe();
		this.jLabelid_empresaPreguntaNomi.setText(""+PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPreguntaNomi.setToolTipText("Empresa");
		this.jLabelid_empresaPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPreguntaNomi.setToolTipText(PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPreguntaNomi = new GridBagLayout();
		this.jPanelid_empresaPreguntaNomi.setLayout(this.gridaBagLayoutPreguntaNomi);


		jComboBoxid_empresaPreguntaNomi= new JComboBoxMe();
		jComboBoxid_empresaPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPreguntaNomi.setEnabled(false);

		this.jButtonid_empresaPreguntaNomi= new JButtonMe();
		this.jButtonid_empresaPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaNomi.setText("Buscar");
		this.jButtonid_empresaPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaNomi"));

		this.jButtonid_empresaPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreguntaNomiBusqueda.setText("U");
		this.jButtonid_empresaPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaNomiBusqueda"));

		if(this.preguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_empresaPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreguntaNomiUpdate.setText("U");
		this.jButtonid_empresaPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaNomiUpdate"));



					
		this.jLabelid_factor_nomiPreguntaNomi = new JLabelMe();
		this.jLabelid_factor_nomiPreguntaNomi.setText(""+PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI+" : *");
		this.jLabelid_factor_nomiPreguntaNomi.setToolTipText("Factor Nomi");
		this.jLabelid_factor_nomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factor_nomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factor_nomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factor_nomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factor_nomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factor_nomiPreguntaNomi.setToolTipText(PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
		this.gridaBagLayoutPreguntaNomi = new GridBagLayout();
		this.jPanelid_factor_nomiPreguntaNomi.setLayout(this.gridaBagLayoutPreguntaNomi);


		jComboBoxid_factor_nomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_factor_nomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factor_nomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factor_nomiPreguntaNomi= new JButtonMe();
		this.jButtonid_factor_nomiPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiPreguntaNomi.setText("Buscar");
		this.jButtonid_factor_nomiPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factor_nomiPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factor_nomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiPreguntaNomi"));

		this.jButtonid_factor_nomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_factor_nomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factor_nomiPreguntaNomiBusqueda.setText("U");
		this.jButtonid_factor_nomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factor_nomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factor_nomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiPreguntaNomiBusqueda"));

		if(this.preguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factor_nomiPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_factor_nomiPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_factor_nomiPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factor_nomiPreguntaNomiUpdate.setText("U");
		this.jButtonid_factor_nomiPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factor_nomiPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factor_nomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiPreguntaNomiUpdate"));



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
		//this.jInternalFrameDetallePreguntaNomi = new PreguntaNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pregunta Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreguntaNomi= new GridBagLayout();
		

		
		String sToolTipPreguntaNomi="";
		sToolTipPreguntaNomi=PreguntaNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreguntaNomi+="(Nomina.PreguntaNomi)";
		}
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreguntaNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPreguntaNomi = new JButtonMe();
		this.jButtonModificarPreguntaNomi = new JButtonMe();
        this.jButtonActualizarPreguntaNomi = new JButtonMe();
        this.jButtonEliminarPreguntaNomi = new JButtonMe();
        this.jButtonCancelarPreguntaNomi = new JButtonMe();
        this.jButtonGuardarCambiosPreguntaNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaPreguntaNomi = new JButtonMe();
		this.jButtonCerrarPreguntaNomi = new JButtonMe();
		
		this.jScrollPanelDatosPreguntaNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionPreguntaNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralPreguntaNomi = new JScrollPane();
				
		
		
		this.jPanelCamposPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pregunta Nomi";
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPreguntaNomi.setName("jPanelCamposPreguntaNomi"); 

		this.jPanelCamposOcultosPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPreguntaNomi.setName("jPanelCamposOcultosPreguntaNomi"); 

        this.jPanelAccionesPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreguntaNomi.setToolTipText("Acciones");
        this.jPanelAccionesPreguntaNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPreguntaNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPreguntaNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPreguntaNomi.setText("Nuevo");
		this.jButtonModificarPreguntaNomi.setText("Editar");
        this.jButtonActualizarPreguntaNomi.setText("Actualizar");
        this.jButtonEliminarPreguntaNomi.setText("Eliminar");
        this.jButtonCancelarPreguntaNomi.setText("Cancelar");
        this.jButtonGuardarCambiosPreguntaNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaPreguntaNomi.setText("Guardar");
		this.jButtonCerrarPreguntaNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreguntaNomi,"nuevo_button","Nuevo",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPreguntaNomi,"modificar_button","Editar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPreguntaNomi,"actualizar_button","Actualizar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPreguntaNomi,"eliminar_button","Eliminar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPreguntaNomi,"cancelar_button","Cancelar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPreguntaNomi,"guardarcambios_button","Guardar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreguntaNomi,"guardarcambiostabla_button","Guardar",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreguntaNomi,"cerrar_button","Salir",this.preguntanomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPreguntaNomi.setToolTipText("Nuevo"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPreguntaNomi.setToolTipText("Editar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPreguntaNomi.setToolTipText("Actualizar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPreguntaNomi.setToolTipText("Eliminar)"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPreguntaNomi.setToolTipText("Cancelar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPreguntaNomi.setToolTipText("Guardar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPreguntaNomi.setToolTipText("Guardar"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreguntaNomi.setToolTipText("Salir"+" "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreguntaNomi";
		inputMap = this.jButtonNuevoPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreguntaNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPreguntaNomi";
		inputMap = this.jButtonActualizarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPreguntaNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarPreguntaNomi";
		inputMap = this.jButtonEliminarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPreguntaNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarPreguntaNomi";
		inputMap = this.jButtonCancelarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPreguntaNomi"));
		
		//CERRAR		
		sMapKey = "CerrarPreguntaNomi";
		inputMap = this.jButtonCerrarPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreguntaNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreguntaNomi";
		inputMap = this.jButtonGuardarCambiosTablaPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreguntaNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPreguntaNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPreguntaNomi.setToolTipText("Nuevo PreguntaNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPreguntaNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPreguntaNomi.setToolTipText("Sin Cerrar Ventana PreguntaNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePreguntaNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePreguntaNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreguntaNomi.setText("Accion");
		this.jComboBoxTiposAccionesPreguntaNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPreguntaNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPreguntaNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPreguntaNomi = new JLabelMe();
		
		this.jLabelAccionesPreguntaNomi.setText("Acciones");		
		this.jLabelAccionesPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPreguntaNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPreguntaNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPreguntaNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPreguntaNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreguntaNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreguntaNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPreguntaNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPreguntaNomi = new GridBagLayout();
		
		this.jPanelCamposPreguntaNomi.setLayout(gridaBagLayoutCamposPreguntaNomi);
		this.jPanelCamposOcultosPreguntaNomi.setLayout(gridaBagLayoutCamposOcultosPreguntaNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 0;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPreguntaNomi.add(jLabelIdPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 1;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPreguntaNomi.add(jLabelidPreguntaNomi, this.gridBagConstraintsPreguntaNomi);


	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 0;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPreguntaNomi.add(jLabelid_empresaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 2;
		this.gridBagConstraintsPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreguntaNomi.add(jButtonid_empresaPreguntaNomiBusqueda, this.gridBagConstraintsPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 3;
		this.gridBagConstraintsPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreguntaNomi.add(jButtonid_empresaPreguntaNomiUpdate, this.gridBagConstraintsPreguntaNomi);
	}

	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 1;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPreguntaNomi.add(jComboBoxid_empresaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);


	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 0;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factor_nomiPreguntaNomi.add(jLabelid_factor_nomiPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 2;
		this.gridBagConstraintsPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factor_nomiPreguntaNomi.add(jButtonid_factor_nomiPreguntaNomiBusqueda, this.gridBagConstraintsPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 3;
		this.gridBagConstraintsPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factor_nomiPreguntaNomi.add(jButtonid_factor_nomiPreguntaNomiUpdate, this.gridBagConstraintsPreguntaNomi);
	}

	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 1;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factor_nomiPreguntaNomi.add(jComboBoxid_factor_nomiPreguntaNomi, this.gridBagConstraintsPreguntaNomi);


	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 0;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpreguntaPreguntaNomi.add(jLabelpreguntaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 2;
		this.gridBagConstraintsPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelpreguntaPreguntaNomi.add(jButtonpreguntaPreguntaNomiBusqueda, this.gridBagConstraintsPreguntaNomi);
	}

	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 1;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpreguntaPreguntaNomi.add(jscrollPanepreguntaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);


	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 0;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPreguntaNomi.add(jLabelordenPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = 2;
		this.gridBagConstraintsPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPreguntaNomi.add(jButtonordenPreguntaNomiBusqueda, this.gridBagConstraintsPreguntaNomi);
	}

	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaNomi.gridy = 0;
	this.gridBagConstraintsPreguntaNomi.gridx = 1;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPreguntaNomi.add(jTextFieldordenPreguntaNomi, this.gridBagConstraintsPreguntaNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaNomi.gridy = iYPanelCamposPreguntaNomi;
	this.gridBagConstraintsPreguntaNomi.gridx = iXPanelCamposPreguntaNomi++;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaNomi.add(this.jPanelidPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(iXPanelCamposPreguntaNomi % 1==0) {
		iXPanelCamposPreguntaNomi=0;
		iYPanelCamposPreguntaNomi++;
	}
	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaNomi.gridy = iYPanelCamposPreguntaNomi;
	this.gridBagConstraintsPreguntaNomi.gridx = iXPanelCamposPreguntaNomi++;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaNomi.add(this.jPanelid_factor_nomiPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(iXPanelCamposPreguntaNomi % 1==0) {
		iXPanelCamposPreguntaNomi=0;
		iYPanelCamposPreguntaNomi++;
	}
	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaNomi.gridy = iYPanelCamposPreguntaNomi;
	this.gridBagConstraintsPreguntaNomi.gridx = iXPanelCamposPreguntaNomi++;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaNomi.add(this.jPanelpreguntaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(iXPanelCamposPreguntaNomi % 1==0) {
		iXPanelCamposPreguntaNomi=0;
		iYPanelCamposPreguntaNomi++;
	}
	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaNomi.gridy = iYPanelCamposPreguntaNomi;
	this.gridBagConstraintsPreguntaNomi.gridx = iXPanelCamposPreguntaNomi++;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaNomi.add(this.jPanelordenPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(iXPanelCamposPreguntaNomi % 1==0) {
		iXPanelCamposPreguntaNomi=0;
		iYPanelCamposPreguntaNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaNomi.gridy = iYPanelCamposOcultosPreguntaNomi;
	this.gridBagConstraintsPreguntaNomi.gridx = iXPanelCamposOcultosPreguntaNomi++;
	this.gridBagConstraintsPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaNomi.add(this.jPanelid_empresaPreguntaNomi, this.gridBagConstraintsPreguntaNomi);



	if(iXPanelCamposOcultosPreguntaNomi % 1==0) {
		iXPanelCamposOcultosPreguntaNomi=0;
		iYPanelCamposOcultosPreguntaNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesPreguntaNomi= new GridBagLayout();
		this.jPanelAccionesPreguntaNomi.setLayout(gridaBagLayoutAccionesPreguntaNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPreguntaNomi= new GridBagLayout();
		this.jPanelAccionesFormularioPreguntaNomi.setLayout(gridaBagLayoutAccionesFormularioPreguntaNomi);
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreguntaNomi.add(this.jComboBoxTiposAccionesFormularioPreguntaNomi, this.gridBagConstraintsPreguntaNomi);

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreguntaNomi.add(this.jCheckBoxPostAccionNuevoPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPreguntaNomi.add(this.jCheckBoxPostAccionSinCerrarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPreguntaNomi.add(this.jCheckBoxPostAccionSinMensajePreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesPreguntaNomi.add(this.jButtonModificarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);							

		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaNomi.gridy = 0;
		this.gridBagConstraintsPreguntaNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesPreguntaNomi.add(this.jButtonEliminarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
			
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = 0;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreguntaNomi.add(this.jButtonActualizarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);


		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = 0;		
		this.gridBagConstraintsPreguntaNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreguntaNomi.add(this.jButtonGuardarCambiosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);	
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = 0;		
		this.gridBagConstraintsPreguntaNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesPreguntaNomi.add(this.jButtonCancelarPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreguntaNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreguntaNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();						
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaNomi.gridx = 0;		
			//this.gridBagConstraintsPreguntaNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreguntaNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreguntaNomi.gridx =0;
		this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreguntaNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePreguntaNomi = new PreguntaNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pregunta Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pregunta Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pregunta Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PreguntaNomiModel preguntanomiModel=new PreguntaNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//PreguntaNomiModel.PreguntaNomiFocusTraversalPolicy preguntanomiFocusTraversalPolicy = preguntanomiModel.new PreguntaNomiFocusTraversalPolicy(this);
			
			//preguntanomiFocusTraversalPolicy.setpreguntanomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(preguntanomiModel);
			
			
			this.jContentPaneDetallePreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePreguntaNomi = new GridBagLayout();	
			this.jContentPaneDetallePreguntaNomi.setLayout(gridaBagLayoutDetallePreguntaNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreguntaNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPreguntaNomi.gridx = 0;
					
				
				this.jContentPaneDetallePreguntaNomi.add(jTtoolBarDetallePreguntaNomi, gridBagConstraintsPreguntaNomi);								
				
}
			
			this.jScrollPanelDatosEdicionPreguntaNomi=   new JScrollPane(jContentPaneDetallePreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPreguntaNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPreguntaNomi.gridx = 0;
	        
			this.jContentPaneDetallePreguntaNomi.add(jPanelCamposPreguntaNomi, gridBagConstraintsPreguntaNomi);
			
			
			
			
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
						&& preguntanomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(this.puedeCargarPorParteDetalleEvaluacionNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(this.puedeCargarPorParteFormatoNomiPreguntaNomi,false,-1);
					
					if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPreguntaNomi= new GridBagConstraints();
						this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPreguntaNomi.gridx = 0;
						this.jContentPaneDetallePreguntaNomi.add(this.jTabbedPaneRelacionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPreguntaNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPreguntaNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
					this.gridBagConstraintsPreguntaNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPreguntaNomi.gridx = 0;
					
				
					this.jContentPaneDetallePreguntaNomi.add(jPanelCamposOcultosPreguntaNomi, gridBagConstraintsPreguntaNomi);
				
					this.jPanelCamposOcultosPreguntaNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsPreguntaNomi.gridx = 0;
	        this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePreguntaNomi.add(this.jPanelAccionesFormularioPreguntaNomi, this.gridBagConstraintsPreguntaNomi);							
			
			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
	        this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsPreguntaNomi.gridx = 0;
	        
			
			this.jContentPaneDetallePreguntaNomi.add(this.jPanelAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPreguntaNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPreguntaNomi=   new JScrollPane(this.jPanelCamposPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaNomi.gridx = 0;
			this.gridBagConstraintsPreguntaNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPreguntaNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPreguntaNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPreguntaNomi, this.gridBagConstraintsPreguntaNomi);			
			
			this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsPreguntaNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
			
			
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		
			
		this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsPreguntaNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreguntaNomi, this.gridBagConstraintsPreguntaNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPreguntaNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionPreguntaNomi;
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

				DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);

				this.detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleevaluacionnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleevaluacionnomiBeanSwingJInternalFrame.setdetalleevaluacionnomiSessionBean(this.detalleevaluacionnomiSessionBean);

				//this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
				//this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPreguntaNomi.gridx = 0;
				//this.jContentPaneDetallePreguntaNomi.add(this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPreguntaNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPreguntaNomi.add("Detalle Evaluacion Nomis",this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPreguntaNomi.setComponentAt(iIndexTab,this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				this.detalleevaluacionnomiBeanSwingJInternalFrame=null;//new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleEvaluacionNomi) {
					this.jTabbedPaneRelacionesPreguntaNomi.add("Detalle Evaluacion Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomipreguntanomiBeanSwingJInternalFrame=null;//new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomipreguntanomiBeanSwingJInternalFramePopup=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomipreguntanomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomipreguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomipreguntanomiBeanSwingJInternalFrame.setformatonomipreguntanomiSessionBean(this.formatonomipreguntanomiSessionBean);

				//this.gridBagConstraintsPreguntaNomi = new GridBagConstraints();
				//this.gridBagConstraintsPreguntaNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPreguntaNomi.gridx = 0;
				//this.jContentPaneDetallePreguntaNomi.add(this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPreguntaNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPreguntaNomi.add("Formato Nomi Pregunta Nomis",this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPreguntaNomi.setComponentAt(iIndexTab,this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomipreguntanomiBeanSwingJInternalFrame=null;//new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomiPreguntaNomi) {
					this.jTabbedPaneRelacionesPreguntaNomi.add("Formato Nomi Pregunta Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormatoNomiPreguntaNomiBeanSwingJInternalFrame(List<PreguntaNomi> preguntanomis,PreguntaNomi preguntanomi,FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomipreguntanomiBeanSwingJInternalFrame.getFormatoNomiPreguntaNomiLogic().setConnexion(this.preguntanomiLogic.getConnexion());

					formatonomipreguntanomiBeanSwingJInternalFrame.setpreguntanomisForeignKey(preguntanomis);
					formatonomipreguntanomiBeanSwingJInternalFrame.setpreguntanomiForeignKey(preguntanomi);
					formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setlidPreguntaNomiActual(preguntanomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomipreguntanomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomipreguntanomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaPreguntaNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setid_pregunta_nomiFK_IdPreguntaNomi(preguntanomi.getId());

					if(!this.conCargarFormDetalle) {
						formatonomipreguntanomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomipreguntanomiBeanSwingJInternalFrame.setSelectedItemCombosFramePreguntaNomiForeignKey(preguntanomi,1,false,true,true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomipreguntanomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdPreguntaNomi");
					formatonomipreguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPreguntaNomi");
					formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n",formatonomipreguntanomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomipreguntanomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomipreguntanomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("relacionado");
					} else {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("no_relacionado");
					}

					formatonomipreguntanomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomiPreguntaNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleEvaluacionNomiBeanSwingJInternalFrame(List<PreguntaNomi> preguntanomis,PreguntaNomi preguntanomi,DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleevaluacionnomiBeanSwingJInternalFrame.getDetalleEvaluacionNomiLogic().setConnexion(this.preguntanomiLogic.getConnexion());

					detalleevaluacionnomiBeanSwingJInternalFrame.setpreguntanomisForeignKey(preguntanomis);
					detalleevaluacionnomiBeanSwingJInternalFrame.setpreguntanomiForeignKey(preguntanomi);
					detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setlidPreguntaNomiActual(preguntanomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleevaluacionnomiBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleEvaluacionNomi(detalleevaluacionnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleevaluacionnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaPreguntaNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setid_pregunta_nomiFK_IdPreguntaNomi(preguntanomi.getId());

					if(!this.conCargarFormDetalle) {
						detalleevaluacionnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleevaluacionnomiBeanSwingJInternalFrame.setSelectedItemCombosFramePreguntaNomiForeignKey(preguntanomi,1,false,true,true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleevaluacionnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdPreguntaNomi");
					detalleevaluacionnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPreguntaNomi");
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
