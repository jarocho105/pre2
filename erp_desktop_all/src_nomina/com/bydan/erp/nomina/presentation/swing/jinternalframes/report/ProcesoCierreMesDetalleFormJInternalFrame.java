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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.report.ProcesoCierreMesConstantesFunciones;

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
public class ProcesoCierreMesDetalleFormJInternalFrame extends ProcesoCierreMesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCierreMes;
	
	protected JMenuBar jmenuBarDetalleProcesoCierreMes;
	
	protected JMenu jmenuDetalleProcesoCierreMes;
	protected JMenu jmenuDetalleArchivoProcesoCierreMes;
	protected JMenu jmenuDetalleAccionesProcesoCierreMes;
	protected JMenu jmenuDetalleDatosProcesoCierreMes;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreMes;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreMes;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCierreMesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCierreMes;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public ProcesoCierreMesSessionBean procesocierremesSessionBean;
	
	
	
	
	public MesSessionBean mesSessionBean;
	public EstructuraSessionBean estructuraSessionBean;	
	
	public ProcesoCierreMesLogic procesocierremesLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCierreMes;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreMes;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreMes;
	
	protected JPanel jPanelCamposProcesoCierreMes;    
	protected JPanel jPanelCamposOcultosProcesoCierreMes;    	
	protected JPanel jPanelAccionesProcesoCierreMes;
	protected JPanel jPanelAccionesFormularioProcesoCierreMes;
    
	
	
	protected Integer iXPanelCamposProcesoCierreMes=0;
	protected Integer iYPanelCamposProcesoCierreMes=0;
	
	protected Integer iXPanelCamposOcultosProcesoCierreMes=0;
	protected Integer iYPanelCamposOcultosProcesoCierreMes=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCierreMes;
	public JButton jButtonModificarProcesoCierreMes;
	public JButton jButtonActualizarProcesoCierreMes;
    public JButton jButtonEliminarProcesoCierreMes;
	public JButton jButtonCancelarProcesoCierreMes;
    public JButton jButtonGuardarCambiosProcesoCierreMes;
	public JButton jButtonGuardarCambiosTablaProcesoCierreMes;
	protected JButton jButtonCerrarProcesoCierreMes;
	
	
	protected JButton jButtonProcesarInformacionProcesoCierreMes;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCierreMes;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCierreMes;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCierreMes;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreMes;
	protected JButton jButtonModificarToolBarProcesoCierreMes;
	protected JButton jButtonActualizarToolBarProcesoCierreMes;
    protected JButton jButtonEliminarToolBarProcesoCierreMes;
	protected JButton jButtonCancelarToolBarProcesoCierreMes;
    protected JButton jButtonGuardarCambiosToolBarProcesoCierreMes;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCierreMes;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreMes;
	protected JButton jButtonCerrarToolBarProcesoCierreMes;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreMes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreMes;
	protected JMenuItem jMenuItemModificarProcesoCierreMes;
	protected JMenuItem jMenuItemActualizarProcesoCierreMes;
    protected JMenuItem jMenuItemEliminarProcesoCierreMes;
	protected JMenuItem jMenuItemCancelarProcesoCierreMes;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCierreMes;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreMes;
	protected JMenuItem jMenuItemCerrarProcesoCierreMes;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreMes;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreMes;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreMes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreMes;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreMes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreMes;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreMes;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCierreMes;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCierreMes;
	public JLabel jLabelIdProcesoCierreMes;
	public JLabel jLabelidProcesoCierreMes;
	public JButton jButtonidProcesoCierreMesBusqueda= new JButtonMe();

	public JPanel jPaneles_para_reversionProcesoCierreMes;
	public JLabel jLabeles_para_reversionProcesoCierreMes;
	public JCheckBox jCheckBoxes_para_reversionProcesoCierreMes;
	public JButton jButtones_para_reversionProcesoCierreMesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesProcesoCierreMes;
	public JLabel jLabelid_mesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProcesoCierreMes;
	public JButton jButtonid_mesProcesoCierreMes= new JButtonMe();
	public JButton jButtonid_mesProcesoCierreMesUpdate= new JButtonMe();
	public JButton jButtonid_mesProcesoCierreMesBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraProcesoCierreMes;
	public JLabel jLabelid_estructuraProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraProcesoCierreMes;
	public JButton jButtonid_estructuraProcesoCierreMes= new JButtonMe();
	public JButton jButtonid_estructuraProcesoCierreMesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraProcesoCierreMesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCierreMes;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCierreMesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCierreMes=new JPanel();
				this.jPanelAccionesFormularioProcesoCierreMes=new JPanel();
				this.jmenuBarDetalleProcesoCierreMes=new JMenuBar();
				this.jTtoolBarDetalleProcesoCierreMes=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCierreMesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCierreMes() {
		return this.jButtonActualizarToolBarProcesoCierreMes;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCierreMes() {
		return this.jButtonEliminarToolBarProcesoCierreMes;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCierreMes() {
		return this.jButtonCancelarToolBarProcesoCierreMes;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCierreMes() {
		return this.jButtonProcesarInformacionProcesoCierreMes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreMes)	{
		this.jButtonProcesarInformacionProcesoCierreMes = jButtonProcesarInformacionProcesoCierreMes;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreMes() {
		return this.jComboBoxTiposAccionesProcesoCierreMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreMes(
			JComboBox jComboBoxTiposRelacionesProcesoCierreMes) {
		this.jComboBoxTiposRelacionesProcesoCierreMes = jComboBoxTiposRelacionesProcesoCierreMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreMes(
			JComboBox jComboBoxTiposAccionesProcesoCierreMes) {
		this.jComboBoxTiposAccionesProcesoCierreMes = jComboBoxTiposAccionesProcesoCierreMes;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCierreMes() {
		return this.jComboBoxTiposAccionesFormularioProcesoCierreMes;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCierreMes(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCierreMes) {
		this.jComboBoxTiposAccionesFormularioProcesoCierreMes = jComboBoxTiposAccionesFormularioProcesoCierreMes;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
		
		this.procesocierremesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierremesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierremesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreMesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreMesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreMesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Mes MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCierreMesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCierreMes= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCierreMes=new JButtonMe();
				this.jButtonModificarToolBarProcesoCierreMes=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCierreMes,this.jTtoolBarDetalleProcesoCierreMes,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCierreMes,this.jTtoolBarDetalleProcesoCierreMes,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCierreMes,this.jTtoolBarDetalleProcesoCierreMes,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCierreMes,this.jTtoolBarDetalleProcesoCierreMes,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCierreMes=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCierreMes=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCierreMes=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCierreMes=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCierreMes=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreMes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreMes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreMes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCierreMes= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCierreMes.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCierreMes,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCierreMes= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCierreMes.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCierreMes,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCierreMes= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCierreMes.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCierreMes,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCierreMes= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCierreMes.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCierreMes,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCierreMes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreMes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreMes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreMes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreMes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreMes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCierreMes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCierreMes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCierreMes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreMes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreMes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCierreMes.add(this.jMenuItemDetalleCerrarProcesoCierreMes);
		
		this.jmenuDetalleAccionesProcesoCierreMes.add(this.jMenuItemActualizarProcesoCierreMes);
		this.jmenuDetalleAccionesProcesoCierreMes.add(this.jMenuItemEliminarProcesoCierreMes);
		this.jmenuDetalleAccionesProcesoCierreMes.add(this.jMenuItemCancelarProcesoCierreMes);		
		
		//this.jmenuDetalleDatosProcesoCierreMes.add(this.jMenuItemDetalleAbrirOrderByProcesoCierreMes);				
		this.jmenuDetalleDatosProcesoCierreMes.add(this.jMenuItemDetalleMostarOcultarProcesoCierreMes);				
				
		//this.jmenuDetalleAccionesProcesoCierreMes.add(this.jMenuItemGuardarCambiosProcesoCierreMes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCierreMes.add(this.jmenuDetalleArchivoProcesoCierreMes);		
		this.jmenuBarDetalleProcesoCierreMes.add(this.jmenuDetalleAccionesProcesoCierreMes);		
		this.jmenuBarDetalleProcesoCierreMes.add(this.jmenuDetalleDatosProcesoCierreMes);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCierreMes);				
	}
	
	
	public void inicializarElementosCamposProcesoCierreMes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCierreMes = new JLabelMe();
		jLabelIdProcesoCierreMes.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCierreMes = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCierreMes.setToolTipText(ProcesoCierreMesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCierreMes= new GridBagLayout();

		this.jPanelidProcesoCierreMes.setLayout(this.gridaBagLayoutProcesoCierreMes);

		jLabelidProcesoCierreMes = new JLabel();
		jLabelidProcesoCierreMes.setText("Id");

		jLabelidProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_para_reversionProcesoCierreMes = new JLabelMe();
		this.jLabeles_para_reversionProcesoCierreMes.setText(""+ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION+" : *");
		this.jLabeles_para_reversionProcesoCierreMes.setToolTipText("Es Para Reversion");
		this.jLabeles_para_reversionProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_para_reversionProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_para_reversionProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_para_reversionProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_para_reversionProcesoCierreMes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_para_reversionProcesoCierreMes.setToolTipText(ProcesoCierreMesConstantesFunciones.LABEL_ESPARAREVERSION);
		this.gridaBagLayoutProcesoCierreMes = new GridBagLayout();
		this.jPaneles_para_reversionProcesoCierreMes.setLayout(this.gridaBagLayoutProcesoCierreMes);


		jCheckBoxes_para_reversionProcesoCierreMes= new JCheckBoxMe();
		jCheckBoxes_para_reversionProcesoCierreMes.setEnabled(false);

		jCheckBoxes_para_reversionProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_reversionProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_reversionProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_reversionProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_para_reversionProcesoCierreMesBusqueda= new JButtonMe();
		this.jButtones_para_reversionProcesoCierreMesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_reversionProcesoCierreMesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_reversionProcesoCierreMesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_para_reversionProcesoCierreMesBusqueda.setText("U");
		this.jButtones_para_reversionProcesoCierreMesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_para_reversionProcesoCierreMesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_para_reversionProcesoCierreMesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_para_reversionProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_para_reversionProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_reversionProcesoCierreMesBusqueda"));

		if(this.procesocierremesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_para_reversionProcesoCierreMesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCierreMes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_mesProcesoCierreMes = new JLabelMe();
		this.jLabelid_mesProcesoCierreMes.setText(""+ProcesoCierreMesConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProcesoCierreMes.setToolTipText("Mes");
		this.jLabelid_mesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProcesoCierreMes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProcesoCierreMes.setToolTipText(ProcesoCierreMesConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProcesoCierreMes = new GridBagLayout();
		this.jPanelid_mesProcesoCierreMes.setLayout(this.gridaBagLayoutProcesoCierreMes);


		jComboBoxid_mesProcesoCierreMes= new JComboBoxMe();
		jComboBoxid_mesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProcesoCierreMes= new JButtonMe();
		this.jButtonid_mesProcesoCierreMes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoCierreMes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoCierreMes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoCierreMes.setText("Procesar");
		this.jButtonid_mesProcesoCierreMes.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProcesoCierreMes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoCierreMes,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoCierreMes"));

		this.jButtonid_mesProcesoCierreMesBusqueda= new JButtonMe();
		this.jButtonid_mesProcesoCierreMesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoCierreMesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoCierreMesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoCierreMesBusqueda.setText("U");
		this.jButtonid_mesProcesoCierreMesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProcesoCierreMesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoCierreMesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoCierreMesBusqueda"));

		if(this.procesocierremesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProcesoCierreMesBusqueda.setVisible(false);		}

		this.jButtonid_mesProcesoCierreMesUpdate= new JButtonMe();
		this.jButtonid_mesProcesoCierreMesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoCierreMesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoCierreMesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoCierreMesUpdate.setText("U");
		this.jButtonid_mesProcesoCierreMesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProcesoCierreMesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoCierreMesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoCierreMesUpdate"));



					
		this.jLabelid_estructuraProcesoCierreMes = new JLabelMe();
		this.jLabelid_estructuraProcesoCierreMes.setText(""+ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraProcesoCierreMes.setToolTipText("Estructura");
		this.jLabelid_estructuraProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraProcesoCierreMes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraProcesoCierreMes.setToolTipText(ProcesoCierreMesConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutProcesoCierreMes = new GridBagLayout();
		this.jPanelid_estructuraProcesoCierreMes.setLayout(this.gridaBagLayoutProcesoCierreMes);


		jComboBoxid_estructuraProcesoCierreMes= new JComboBoxMe();
		jComboBoxid_estructuraProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraProcesoCierreMes= new JButtonMe();
		this.jButtonid_estructuraProcesoCierreMes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoCierreMes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoCierreMes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoCierreMes.setText("Procesar");
		this.jButtonid_estructuraProcesoCierreMes.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraProcesoCierreMes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoCierreMes,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoCierreMes"));

		this.jButtonid_estructuraProcesoCierreMesBusqueda= new JButtonMe();
		this.jButtonid_estructuraProcesoCierreMesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreMesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreMesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProcesoCierreMesBusqueda.setText("U");
		this.jButtonid_estructuraProcesoCierreMesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraProcesoCierreMesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoCierreMesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoCierreMesBusqueda"));

		if(this.procesocierremesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraProcesoCierreMesBusqueda.setVisible(false);		}

		this.jButtonid_estructuraProcesoCierreMesUpdate= new JButtonMe();
		this.jButtonid_estructuraProcesoCierreMesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreMesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreMesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProcesoCierreMesUpdate.setText("U");
		this.jButtonid_estructuraProcesoCierreMesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraProcesoCierreMesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoCierreMesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraProcesoCierreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoCierreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoCierreMesUpdate"));



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
		//this.jInternalFrameDetalleProcesoCierreMes = new ProcesoCierreMesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cierre Mes DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreMes= new GridBagLayout();
		

		
		String sToolTipProcesoCierreMes="";
		sToolTipProcesoCierreMes=ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreMes+="(Nomina.ProcesoCierreMes)";
		}
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreMes+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCierreMes = new JButtonMe();
		this.jButtonModificarProcesoCierreMes = new JButtonMe();
        this.jButtonActualizarProcesoCierreMes = new JButtonMe();
        this.jButtonEliminarProcesoCierreMes = new JButtonMe();
        this.jButtonCancelarProcesoCierreMes = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCierreMes = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCierreMes = new JButtonMe();
		this.jButtonCerrarProcesoCierreMes = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreMes = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCierreMes = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCierreMes = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Mes";
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Meses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreMes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCierreMes.setName("jPanelCamposProcesoCierreMes"); 

		this.jPanelCamposOcultosProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCierreMes.setName("jPanelCamposOcultosProcesoCierreMes"); 

        this.jPanelAccionesProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreMes.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreMes.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCierreMes.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCierreMes.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCierreMes.setText("Nuevo");
		this.jButtonModificarProcesoCierreMes.setText("Editar");
        this.jButtonActualizarProcesoCierreMes.setText("Actualizar");
        this.jButtonEliminarProcesoCierreMes.setText("Eliminar");
        this.jButtonCancelarProcesoCierreMes.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCierreMes.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCierreMes.setText("Guardar");
		this.jButtonCerrarProcesoCierreMes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreMes,"nuevo_button","Nuevo",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCierreMes,"modificar_button","Editar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCierreMes,"actualizar_button","Actualizar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCierreMes,"eliminar_button","Eliminar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCierreMes,"cancelar_button","Cancelar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCierreMes,"guardarcambios_button","Guardar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreMes,"guardarcambiostabla_button","Guardar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreMes,"cerrar_button","Salir",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCierreMes.setToolTipText("Nuevo"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCierreMes.setToolTipText("Editar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCierreMes.setToolTipText("Actualizar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCierreMes.setToolTipText("Eliminar)"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCierreMes.setToolTipText("Cancelar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCierreMes.setToolTipText("Guardar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCierreMes.setToolTipText("Guardar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreMes.setToolTipText("Salir"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreMes";
		inputMap = this.jButtonNuevoProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreMes"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCierreMes";
		inputMap = this.jButtonActualizarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCierreMes"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCierreMes";
		inputMap = this.jButtonEliminarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCierreMes"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCierreMes";
		inputMap = this.jButtonCancelarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCierreMes"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreMes";
		inputMap = this.jButtonCerrarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreMes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreMes";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreMes"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCierreMes = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCierreMes.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCierreMes.setToolTipText("Nuevo ProcesoCierreMes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCierreMes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCierreMes.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCierreMes.setToolTipText("Sin Cerrar Ventana ProcesoCierreMes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCierreMes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCierreMes.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCierreMes.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreMes.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreMes.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCierreMes = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreMes.setText("Acciones");		
		this.jLabelAccionesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCierreMes();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCierreMes();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCierreMes=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCierreMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCierreMes = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCierreMes = new GridBagLayout();
		
		this.jPanelCamposProcesoCierreMes.setLayout(gridaBagLayoutCamposProcesoCierreMes);
		this.jPanelCamposOcultosProcesoCierreMes.setLayout(gridaBagLayoutCamposOcultosProcesoCierreMes);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCierreMes.add(jLabelIdProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 1;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCierreMes.add(jLabelidProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);


	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProcesoCierreMes.add(jLabelid_mesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = 2;
		this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
		this.gridBagConstraintsProcesoCierreMes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoCierreMes.add(jButtonid_mesProcesoCierreMesBusqueda, this.gridBagConstraintsProcesoCierreMes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = 3;
		this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
		this.gridBagConstraintsProcesoCierreMes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoCierreMes.add(jButtonid_mesProcesoCierreMesUpdate, this.gridBagConstraintsProcesoCierreMes);
	}

	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 1;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProcesoCierreMes.add(jComboBoxid_mesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);


	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraProcesoCierreMes.add(jLabelid_estructuraProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = 2;
		this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
		this.gridBagConstraintsProcesoCierreMes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProcesoCierreMes.add(jButtonid_estructuraProcesoCierreMesBusqueda, this.gridBagConstraintsProcesoCierreMes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = 3;
		this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
		this.gridBagConstraintsProcesoCierreMes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProcesoCierreMes.add(jButtonid_estructuraProcesoCierreMesUpdate, this.gridBagConstraintsProcesoCierreMes);
	}

	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 1;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraProcesoCierreMes.add(jComboBoxid_estructuraProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);


	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_para_reversionProcesoCierreMes.add(jLabeles_para_reversionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = 2;
		this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
		this.gridBagConstraintsProcesoCierreMes.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_para_reversionProcesoCierreMes.add(jButtones_para_reversionProcesoCierreMesBusqueda, this.gridBagConstraintsProcesoCierreMes);
	}

	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreMes.gridy = 0;
	this.gridBagConstraintsProcesoCierreMes.gridx = 1;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_para_reversionProcesoCierreMes.add(jCheckBoxes_para_reversionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreMes.gridy = iYPanelCamposProcesoCierreMes;
	this.gridBagConstraintsProcesoCierreMes.gridx = iXPanelCamposProcesoCierreMes++;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreMes.add(this.jPanelidProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(iXPanelCamposProcesoCierreMes % 1==0) {
		iXPanelCamposProcesoCierreMes=0;
		iYPanelCamposProcesoCierreMes++;
	}
	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreMes.gridy = iYPanelCamposProcesoCierreMes;
	this.gridBagConstraintsProcesoCierreMes.gridx = iXPanelCamposProcesoCierreMes++;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreMes.add(this.jPanelid_mesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(iXPanelCamposProcesoCierreMes % 1==0) {
		iXPanelCamposProcesoCierreMes=0;
		iYPanelCamposProcesoCierreMes++;
	}
	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreMes.gridy = iYPanelCamposProcesoCierreMes;
	this.gridBagConstraintsProcesoCierreMes.gridx = iXPanelCamposProcesoCierreMes++;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreMes.add(this.jPanelid_estructuraProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(iXPanelCamposProcesoCierreMes % 1==0) {
		iXPanelCamposProcesoCierreMes=0;
		iYPanelCamposProcesoCierreMes++;
	}
	this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreMes.gridy = iYPanelCamposProcesoCierreMes;
	this.gridBagConstraintsProcesoCierreMes.gridx = iXPanelCamposProcesoCierreMes++;
	this.gridBagConstraintsProcesoCierreMes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreMes.add(this.jPaneles_para_reversionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);



	if(iXPanelCamposProcesoCierreMes % 1==0) {
		iXPanelCamposProcesoCierreMes=0;
		iYPanelCamposProcesoCierreMes++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreMes= new GridBagLayout();
		this.jPanelAccionesProcesoCierreMes.setLayout(gridaBagLayoutAccionesProcesoCierreMes);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCierreMes= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCierreMes.setLayout(gridaBagLayoutAccionesFormularioProcesoCierreMes);
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCierreMes.add(this.jComboBoxTiposAccionesFormularioProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreMes.add(this.jButtonModificarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);							

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreMes.add(this.jButtonEliminarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
			
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreMes.add(this.jButtonActualizarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);


		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreMes.add(this.jButtonGuardarCambiosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);	
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;		
		this.gridBagConstraintsProcesoCierreMes.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreMes.add(this.jButtonCancelarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreMes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreMes);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreMes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreMes.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreMes.gridx =0;
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreMes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCierreMes = new ProcesoCierreMesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cierre Mes DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Cierre Mes DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Mes Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCierreMesModel procesocierremesModel=new ProcesoCierreMesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCierreMesModel.ProcesoCierreMesFocusTraversalPolicy procesocierremesFocusTraversalPolicy = procesocierremesModel.new ProcesoCierreMesFocusTraversalPolicy(this);
			
			//procesocierremesFocusTraversalPolicy.setprocesocierremesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocierremesModel);
			
			
			this.jContentPaneDetalleProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCierreMes = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCierreMes.setLayout(gridaBagLayoutDetalleProcesoCierreMes);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreMes = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreMes.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCierreMes.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCierreMes.add(jTtoolBarDetalleProcesoCierreMes, gridBagConstraintsProcesoCierreMes);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCierreMes=   new JScrollPane(jContentPaneDetalleProcesoCierreMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCierreMes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCierreMes.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCierreMes.add(jPanelCamposProcesoCierreMes, gridBagConstraintsProcesoCierreMes);
			
			
			
			
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
						//&& procesocierremesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocierremesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCierreMes= new GridBagConstraints();
						this.gridBagConstraintsProcesoCierreMes.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCierreMes.gridx = 0;
						this.jContentPaneDetalleProcesoCierreMes.add(this.jTabbedPaneRelacionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCierreMes.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCierreMes.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
					this.gridBagConstraintsProcesoCierreMes.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCierreMes.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCierreMes.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCierreMes.add(jPanelCamposOcultosProcesoCierreMes, gridBagConstraintsProcesoCierreMes);
				
					this.jPanelCamposOcultosProcesoCierreMes.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	        this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCierreMes.add(this.jPanelAccionesFormularioProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);							
			
			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCierreMes.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCierreMes.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCierreMes.add(this.jPanelAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCierreMes);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCierreMes=   new JScrollPane(this.jPanelCamposProcesoCierreMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCierreMes.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
			
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCierreMes.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCierreMes.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCierreMes.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCierreMes.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCierreMes.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCierreMes;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCierreMes;
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
