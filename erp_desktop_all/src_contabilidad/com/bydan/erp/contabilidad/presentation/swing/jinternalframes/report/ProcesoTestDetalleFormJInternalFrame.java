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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoTestConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoTestDetalleFormJInternalFrame extends ProcesoTestBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoTest;
	
	protected JMenuBar jmenuBarDetalleProcesoTest;
	
	protected JMenu jmenuDetalleProcesoTest;
	protected JMenu jmenuDetalleArchivoProcesoTest;
	protected JMenu jmenuDetalleAccionesProcesoTest;
	protected JMenu jmenuDetalleDatosProcesoTest;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoTest;	
	protected GridBagConstraints gridBagConstraintsProcesoTest;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoTestBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoTest;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public ProcesoTestSessionBean procesotestSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;	
	
	public ProcesoTestLogic procesotestLogic;
	
	public JScrollPane jScrollPanelDatosProcesoTest;
	public JScrollPane jScrollPanelDatosEdicionProcesoTest;
	public JScrollPane jScrollPanelDatosGeneralProcesoTest;
	
	protected JPanel jPanelCamposProcesoTest;    
	protected JPanel jPanelCamposOcultosProcesoTest;    	
	protected JPanel jPanelAccionesProcesoTest;
	protected JPanel jPanelAccionesFormularioProcesoTest;
    
	
	
	protected Integer iXPanelCamposProcesoTest=0;
	protected Integer iYPanelCamposProcesoTest=0;
	
	protected Integer iXPanelCamposOcultosProcesoTest=0;
	protected Integer iYPanelCamposOcultosProcesoTest=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoTest;
	public JButton jButtonModificarProcesoTest;
	public JButton jButtonActualizarProcesoTest;
    public JButton jButtonEliminarProcesoTest;
	public JButton jButtonCancelarProcesoTest;
    public JButton jButtonGuardarCambiosProcesoTest;
	public JButton jButtonGuardarCambiosTablaProcesoTest;
	protected JButton jButtonCerrarProcesoTest;
	
	
	protected JButton jButtonProcesarInformacionProcesoTest;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoTest;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoTest;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoTest;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoTest;
	protected JButton jButtonModificarToolBarProcesoTest;
	protected JButton jButtonActualizarToolBarProcesoTest;
    protected JButton jButtonEliminarToolBarProcesoTest;
	protected JButton jButtonCancelarToolBarProcesoTest;
    protected JButton jButtonGuardarCambiosToolBarProcesoTest;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoTest;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoTest;
	protected JButton jButtonCerrarToolBarProcesoTest;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoTest;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoTest;
	protected JMenuItem jMenuItemModificarProcesoTest;
	protected JMenuItem jMenuItemActualizarProcesoTest;
    protected JMenuItem jMenuItemEliminarProcesoTest;
	protected JMenuItem jMenuItemCancelarProcesoTest;
    protected JMenuItem jMenuItemGuardarCambiosProcesoTest;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoTest;
	protected JMenuItem jMenuItemCerrarProcesoTest;
	protected JMenuItem jMenuItemDetalleCerrarProcesoTest;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoTest;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoTest;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoTest;
	protected JMenuItem jMenuItemMostrarOcultarProcesoTest;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoTest;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoTest;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoTest;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoTest;
	public JLabel jLabelIdProcesoTest;
	public JLabel jLabelidProcesoTest;
	public JButton jButtonidProcesoTestBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesoTest;
	public JLabel jLabelnombreProcesoTest;
	public JTextField jTextFieldnombreProcesoTest;
	public JButton jButtonnombreProcesoTestBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProcesoTest;
	public JLabel jLabelid_empresaProcesoTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoTest;
	public JButton jButtonid_empresaProcesoTest= new JButtonMe();
	public JButton jButtonid_empresaProcesoTestUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoTestBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloProcesoTest;
	public JLabel jLabelid_moduloProcesoTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloProcesoTest;
	public JButton jButtonid_moduloProcesoTest= new JButtonMe();
	public JButton jButtonid_moduloProcesoTestUpdate= new JButtonMe();
	public JButton jButtonid_moduloProcesoTestBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoTest;
	
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
	
	public ProcesoTestDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoTest=new JPanel();
				this.jPanelAccionesFormularioProcesoTest=new JPanel();
				this.jmenuBarDetalleProcesoTest=new JMenuBar();
				this.jTtoolBarDetalleProcesoTest=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoTestDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoTestDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoTest() {
		return this.jButtonActualizarToolBarProcesoTest;
	}
	
	public JButton getjButtonEliminarToolBarProcesoTest() {
		return this.jButtonEliminarToolBarProcesoTest;
	}
	
	public JButton getjButtonCancelarToolBarProcesoTest() {
		return this.jButtonCancelarToolBarProcesoTest;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoTest() {
		return this.jButtonProcesarInformacionProcesoTest;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoTest)	{
		this.jButtonProcesarInformacionProcesoTest = jButtonProcesarInformacionProcesoTest;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoTest() {
		return this.jComboBoxTiposAccionesProcesoTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoTest(
			JComboBox jComboBoxTiposRelacionesProcesoTest) {
		this.jComboBoxTiposRelacionesProcesoTest = jComboBoxTiposRelacionesProcesoTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoTest(
			JComboBox jComboBoxTiposAccionesProcesoTest) {
		this.jComboBoxTiposAccionesProcesoTest = jComboBoxTiposAccionesProcesoTest;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoTest() {
		return this.jComboBoxTiposAccionesFormularioProcesoTest;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoTest(
			JComboBox jComboBoxTiposAccionesFormularioProcesoTest) {
		this.jComboBoxTiposAccionesFormularioProcesoTest = jComboBoxTiposAccionesFormularioProcesoTest;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesotestSessionBean=new ProcesoTestSessionBean();
		
		this.procesotestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesotestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesotestSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoTestJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoTestJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoTestJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Test MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoTestJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoTest= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoTest=new JButtonMe();
				this.jButtonModificarToolBarProcesoTest=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoTest,this.jTtoolBarDetalleProcesoTest,
							"actualizar","actualizar","Actualizar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoTest,this.jTtoolBarDetalleProcesoTest,
							"eliminar","eliminar","Eliminar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoTest,this.jTtoolBarDetalleProcesoTest,
							"cancelar","cancelar","Cancelar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoTest,this.jTtoolBarDetalleProcesoTest,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoTest=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoTest=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoTest=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoTest=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoTest=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoTest= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoTest.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoTest,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoTest= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoTest.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoTest,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoTest= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoTest.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoTest,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoTest= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoTest.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoTest,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoTest= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoTest.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoTest,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoTest= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoTest.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoTest,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoTest= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoTest.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoTest,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoTest= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoTest.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoTest,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoTest,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoTest,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoTest.add(this.jMenuItemDetalleCerrarProcesoTest);
		
		this.jmenuDetalleAccionesProcesoTest.add(this.jMenuItemActualizarProcesoTest);
		this.jmenuDetalleAccionesProcesoTest.add(this.jMenuItemEliminarProcesoTest);
		this.jmenuDetalleAccionesProcesoTest.add(this.jMenuItemCancelarProcesoTest);		
		
		//this.jmenuDetalleDatosProcesoTest.add(this.jMenuItemDetalleAbrirOrderByProcesoTest);				
		this.jmenuDetalleDatosProcesoTest.add(this.jMenuItemDetalleMostarOcultarProcesoTest);				
				
		//this.jmenuDetalleAccionesProcesoTest.add(this.jMenuItemGuardarCambiosProcesoTest);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoTest.add(this.jmenuDetalleArchivoProcesoTest);		
		this.jmenuBarDetalleProcesoTest.add(this.jmenuDetalleAccionesProcesoTest);		
		this.jmenuBarDetalleProcesoTest.add(this.jmenuDetalleDatosProcesoTest);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoTest);				
	}
	
	
	public void inicializarElementosCamposProcesoTest() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoTest = new JLabelMe();
		jLabelIdProcesoTest.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoTest = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoTest.setToolTipText(ProcesoTestConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoTest= new GridBagLayout();

		this.jPanelidProcesoTest.setLayout(this.gridaBagLayoutProcesoTest);

		jLabelidProcesoTest = new JLabel();
		jLabelidProcesoTest.setText("Id");

		jLabelidProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreProcesoTest = new JLabelMe();
		this.jLabelnombreProcesoTest.setText(""+ProcesoTestConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesoTest.setToolTipText("Nombre");
		this.jLabelnombreProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesoTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesoTest.setToolTipText(ProcesoTestConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesoTest = new GridBagLayout();
		this.jPanelnombreProcesoTest.setLayout(this.gridaBagLayoutProcesoTest);


		jTextFieldnombreProcesoTest= new JTextFieldMe();

		jTextFieldnombreProcesoTest.setEnabled(false);
		jTextFieldnombreProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreProcesoTestBusqueda= new JButtonMe();
		this.jButtonnombreProcesoTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesoTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesoTestBusqueda.setText("U");
		this.jButtonnombreProcesoTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesoTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesoTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesoTestBusqueda"));

		if(this.procesotestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesoTestBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoTest() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProcesoTest = new JLabelMe();
		this.jLabelid_empresaProcesoTest.setText(""+ProcesoTestConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoTest.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoTest.setToolTipText(ProcesoTestConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoTest = new GridBagLayout();
		this.jPanelid_empresaProcesoTest.setLayout(this.gridaBagLayoutProcesoTest);


		jComboBoxid_empresaProcesoTest= new JComboBoxMe();
		jComboBoxid_empresaProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoTest.setEnabled(false);

		this.jButtonid_empresaProcesoTest= new JButtonMe();
		this.jButtonid_empresaProcesoTest.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoTest.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoTest.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoTest.setText("Buscar");
		this.jButtonid_empresaProcesoTest.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoTest.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoTest,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoTest"));

		this.jButtonid_empresaProcesoTestBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoTestBusqueda.setText("U");
		this.jButtonid_empresaProcesoTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoTestBusqueda"));

		if(this.procesotestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoTestBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoTestUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoTestUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoTestUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoTestUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoTestUpdate.setText("U");
		this.jButtonid_empresaProcesoTestUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoTestUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoTestUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoTestUpdate"));



					
		this.jLabelid_moduloProcesoTest = new JLabelMe();
		this.jLabelid_moduloProcesoTest.setText(""+ProcesoTestConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloProcesoTest.setToolTipText("Modulo");
		this.jLabelid_moduloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloProcesoTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloProcesoTest.setToolTipText(ProcesoTestConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutProcesoTest = new GridBagLayout();
		this.jPanelid_moduloProcesoTest.setLayout(this.gridaBagLayoutProcesoTest);


		jComboBoxid_moduloProcesoTest= new JComboBoxMe();
		jComboBoxid_moduloProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloProcesoTest.setEnabled(false);

		this.jButtonid_moduloProcesoTest= new JButtonMe();
		this.jButtonid_moduloProcesoTest.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloProcesoTest.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloProcesoTest.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloProcesoTest.setText("Buscar");
		this.jButtonid_moduloProcesoTest.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloProcesoTest.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloProcesoTest,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloProcesoTest"));

		this.jButtonid_moduloProcesoTestBusqueda= new JButtonMe();
		this.jButtonid_moduloProcesoTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloProcesoTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloProcesoTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloProcesoTestBusqueda.setText("U");
		this.jButtonid_moduloProcesoTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloProcesoTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloProcesoTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloProcesoTestBusqueda"));

		if(this.procesotestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloProcesoTestBusqueda.setVisible(false);		}

		this.jButtonid_moduloProcesoTestUpdate= new JButtonMe();
		this.jButtonid_moduloProcesoTestUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloProcesoTestUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloProcesoTestUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloProcesoTestUpdate.setText("U");
		this.jButtonid_moduloProcesoTestUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloProcesoTestUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloProcesoTestUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloProcesoTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloProcesoTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloProcesoTestUpdate"));



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
		//this.jInternalFrameDetalleProcesoTest = new ProcesoTestBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Test DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoTest= new GridBagLayout();
		

		
		String sToolTipProcesoTest="";
		sToolTipProcesoTest=ProcesoTestConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoTest+="(Contabilidad.ProcesoTest)";
		}
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoTest+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoTest = new JButtonMe();
		this.jButtonModificarProcesoTest = new JButtonMe();
        this.jButtonActualizarProcesoTest = new JButtonMe();
        this.jButtonEliminarProcesoTest = new JButtonMe();
        this.jButtonCancelarProcesoTest = new JButtonMe();
        this.jButtonGuardarCambiosProcesoTest = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoTest = new JButtonMe();
		this.jButtonCerrarProcesoTest = new JButtonMe();
		
		this.jScrollPanelDatosProcesoTest = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoTest = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoTest = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Test";
		
		if(!this.procesotestSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Testes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoTest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoTest.setName("jPanelCamposProcesoTest"); 

		this.jPanelCamposOcultosProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoTest.setName("jPanelCamposOcultosProcesoTest"); 

        this.jPanelAccionesProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoTest.setToolTipText("Acciones");
        this.jPanelAccionesProcesoTest.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoTest.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoTest.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoTest.setText("Nuevo");
		this.jButtonModificarProcesoTest.setText("Editar");
        this.jButtonActualizarProcesoTest.setText("Actualizar");
        this.jButtonEliminarProcesoTest.setText("Eliminar");
        this.jButtonCancelarProcesoTest.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoTest.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoTest.setText("Guardar");
		this.jButtonCerrarProcesoTest.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoTest,"nuevo_button","Nuevo",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoTest,"modificar_button","Editar",this.procesotestSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoTest,"actualizar_button","Actualizar",this.procesotestSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoTest,"eliminar_button","Eliminar",this.procesotestSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoTest,"cancelar_button","Cancelar",this.procesotestSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoTest,"guardarcambios_button","Guardar",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoTest,"guardarcambiostabla_button","Guardar",this.procesotestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoTest,"cerrar_button","Salir",this.procesotestSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoTest.setToolTipText("Nuevo"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoTest.setToolTipText("Editar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoTest.setToolTipText("Actualizar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoTest.setToolTipText("Eliminar)"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoTest.setToolTipText("Cancelar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoTest.setToolTipText("Guardar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoTest.setToolTipText("Guardar"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoTest.setToolTipText("Salir"+" "+ProcesoTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoTest";
		inputMap = this.jButtonNuevoProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoTest"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoTest";
		inputMap = this.jButtonActualizarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoTest"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoTest";
		inputMap = this.jButtonEliminarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoTest"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoTest";
		inputMap = this.jButtonCancelarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoTest"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoTest";
		inputMap = this.jButtonCerrarProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoTest"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoTest";
		inputMap = this.jButtonGuardarCambiosTablaProcesoTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoTest"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoTest = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoTest.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoTest.setToolTipText("Nuevo ProcesoTest");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoTest = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoTest.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoTest.setToolTipText("Sin Cerrar Ventana ProcesoTest");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoTest = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoTest.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoTest.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoTest.setText("Accion");
		this.jComboBoxTiposAccionesProcesoTest.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoTest = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoTest.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoTest.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoTest = new JLabelMe();
		
		this.jLabelAccionesProcesoTest.setText("Acciones");		
		this.jLabelAccionesProcesoTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoTest();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoTest();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoTest=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoTest,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoTest.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoTest.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoTest.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoTest, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoTest = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoTest = new GridBagLayout();
		
		this.jPanelCamposProcesoTest.setLayout(gridaBagLayoutCamposProcesoTest);
		this.jPanelCamposOcultosProcesoTest.setLayout(gridaBagLayoutCamposOcultosProcesoTest);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 0;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoTest.add(jLabelIdProcesoTest, this.gridBagConstraintsProcesoTest);



	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 1;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoTest.add(jLabelidProcesoTest, this.gridBagConstraintsProcesoTest);


	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 0;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoTest.add(jLabelid_empresaProcesoTest, this.gridBagConstraintsProcesoTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = 2;
		this.gridBagConstraintsProcesoTest.ipadx = 0;
		this.gridBagConstraintsProcesoTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoTest.add(jButtonid_empresaProcesoTestBusqueda, this.gridBagConstraintsProcesoTest);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = 3;
		this.gridBagConstraintsProcesoTest.ipadx = 0;
		this.gridBagConstraintsProcesoTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoTest.add(jButtonid_empresaProcesoTestUpdate, this.gridBagConstraintsProcesoTest);
	}

	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 1;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoTest.add(jComboBoxid_empresaProcesoTest, this.gridBagConstraintsProcesoTest);


	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 0;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloProcesoTest.add(jLabelid_moduloProcesoTest, this.gridBagConstraintsProcesoTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = 2;
		this.gridBagConstraintsProcesoTest.ipadx = 0;
		this.gridBagConstraintsProcesoTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloProcesoTest.add(jButtonid_moduloProcesoTestBusqueda, this.gridBagConstraintsProcesoTest);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = 3;
		this.gridBagConstraintsProcesoTest.ipadx = 0;
		this.gridBagConstraintsProcesoTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloProcesoTest.add(jButtonid_moduloProcesoTestUpdate, this.gridBagConstraintsProcesoTest);
	}

	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 1;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloProcesoTest.add(jComboBoxid_moduloProcesoTest, this.gridBagConstraintsProcesoTest);


	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 0;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesoTest.add(jLabelnombreProcesoTest, this.gridBagConstraintsProcesoTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		//this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = 2;
		this.gridBagConstraintsProcesoTest.ipadx = 0;
		this.gridBagConstraintsProcesoTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesoTest.add(jButtonnombreProcesoTestBusqueda, this.gridBagConstraintsProcesoTest);
	}

	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoTest.gridy = 0;
	this.gridBagConstraintsProcesoTest.gridx = 1;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesoTest.add(jTextFieldnombreProcesoTest, this.gridBagConstraintsProcesoTest);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTest.gridy = iYPanelCamposProcesoTest;
	this.gridBagConstraintsProcesoTest.gridx = iXPanelCamposProcesoTest++;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoTest.add(this.jPanelidProcesoTest, this.gridBagConstraintsProcesoTest);



	if(iXPanelCamposProcesoTest % 1==0) {
		iXPanelCamposProcesoTest=0;
		iYPanelCamposProcesoTest++;
	}
	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTest.gridy = iYPanelCamposProcesoTest;
	this.gridBagConstraintsProcesoTest.gridx = iXPanelCamposProcesoTest++;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoTest.add(this.jPanelnombreProcesoTest, this.gridBagConstraintsProcesoTest);



	if(iXPanelCamposProcesoTest % 1==0) {
		iXPanelCamposProcesoTest=0;
		iYPanelCamposProcesoTest++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTest.gridy = iYPanelCamposOcultosProcesoTest;
	this.gridBagConstraintsProcesoTest.gridx = iXPanelCamposOcultosProcesoTest++;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoTest.add(this.jPanelid_empresaProcesoTest, this.gridBagConstraintsProcesoTest);



	if(iXPanelCamposOcultosProcesoTest % 1==0) {
		iXPanelCamposOcultosProcesoTest=0;
		iYPanelCamposOcultosProcesoTest++;
	}
	this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoTest.gridy = iYPanelCamposOcultosProcesoTest;
	this.gridBagConstraintsProcesoTest.gridx = iXPanelCamposOcultosProcesoTest++;
	this.gridBagConstraintsProcesoTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoTest.add(this.jPanelid_moduloProcesoTest, this.gridBagConstraintsProcesoTest);



	if(iXPanelCamposOcultosProcesoTest % 1==0) {
		iXPanelCamposOcultosProcesoTest=0;
		iYPanelCamposOcultosProcesoTest++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoTest= new GridBagLayout();
		this.jPanelAccionesProcesoTest.setLayout(gridaBagLayoutAccionesProcesoTest);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoTest= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoTest.setLayout(gridaBagLayoutAccionesFormularioProcesoTest);
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoTest.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoTest.add(this.jComboBoxTiposAccionesFormularioProcesoTest, this.gridBagConstraintsProcesoTest);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoTest.add(this.jButtonModificarProcesoTest, this.gridBagConstraintsProcesoTest);							

		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoTest.gridy = 0;
		this.gridBagConstraintsProcesoTest.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoTest.add(this.jButtonEliminarProcesoTest, this.gridBagConstraintsProcesoTest);
		
			
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = 0;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoTest.add(this.jButtonActualizarProcesoTest, this.gridBagConstraintsProcesoTest);


		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = 0;		
		this.gridBagConstraintsProcesoTest.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoTest.add(this.jButtonGuardarCambiosProcesoTest, this.gridBagConstraintsProcesoTest);	
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = 0;		
		this.gridBagConstraintsProcesoTest.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoTest.add(this.jButtonCancelarProcesoTest, this.gridBagConstraintsProcesoTest);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoTest = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoTest);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesotestSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();						
			this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoTest.gridx = 0;		
			//this.gridBagConstraintsProcesoTest.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoTest.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoTest.gridx =0;
		this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoTest.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoTest, this.gridBagConstraintsProcesoTest);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoTestJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoTest = new ProcesoTestBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Test DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Test DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Test Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoTestModel procesotestModel=new ProcesoTestModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoTestModel.ProcesoTestFocusTraversalPolicy procesotestFocusTraversalPolicy = procesotestModel.new ProcesoTestFocusTraversalPolicy(this);
			
			//procesotestFocusTraversalPolicy.setprocesotestJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesotestModel);
			
			
			this.jContentPaneDetalleProcesoTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoTest = new GridBagLayout();	
			this.jContentPaneDetalleProcesoTest.setLayout(gridaBagLayoutDetalleProcesoTest);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoTest = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoTest = new GridBagConstraints();
				this.gridBagConstraintsProcesoTest.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoTest.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoTest.add(jTtoolBarDetalleProcesoTest, gridBagConstraintsProcesoTest);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoTest=   new JScrollPane(jContentPaneDetalleProcesoTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoTest=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoTest.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoTest.gridx = 0;
	        
			this.jContentPaneDetalleProcesoTest.add(jPanelCamposProcesoTest, gridBagConstraintsProcesoTest);
			
			
			
			
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
						//&& procesotestSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesotestSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoTest= new GridBagConstraints();
						this.gridBagConstraintsProcesoTest.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoTest.gridx = 0;
						this.jContentPaneDetalleProcesoTest.add(this.jTabbedPaneRelacionesProcesoTest, this.gridBagConstraintsProcesoTest);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoTest.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoTest.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoTest = new GridBagConstraints();
					this.gridBagConstraintsProcesoTest.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoTest.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoTest.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoTest.add(jPanelCamposOcultosProcesoTest, gridBagConstraintsProcesoTest);
				
					this.jPanelCamposOcultosProcesoTest.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoTest.gridx = 0;
	        this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoTest.add(this.jPanelAccionesFormularioProcesoTest, this.gridBagConstraintsProcesoTest);							
			
			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
	        this.gridBagConstraintsProcesoTest.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoTest.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoTest.add(this.jPanelAccionesProcesoTest, this.gridBagConstraintsProcesoTest);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoTest);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoTest=   new JScrollPane(this.jPanelCamposProcesoTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoTest.gridx = 0;
			this.gridBagConstraintsProcesoTest.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoTest.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoTest.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoTest, this.gridBagConstraintsProcesoTest);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoTest.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoTest, this.gridBagConstraintsProcesoTest);			
			
			this.gridBagConstraintsProcesoTest = new GridBagConstraints();
			this.gridBagConstraintsProcesoTest.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoTest.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoTest, this.gridBagConstraintsProcesoTest);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoTest, this.gridBagConstraintsProcesoTest);
			
			
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoTest, this.gridBagConstraintsProcesoTest);
		
			
		this.gridBagConstraintsProcesoTest = new GridBagConstraints();
		this.gridBagConstraintsProcesoTest.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoTest.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoTest, this.gridBagConstraintsProcesoTest);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoTest.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoTest.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoTest.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoTest.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoTest.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoTest.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoTest;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoTest;
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
