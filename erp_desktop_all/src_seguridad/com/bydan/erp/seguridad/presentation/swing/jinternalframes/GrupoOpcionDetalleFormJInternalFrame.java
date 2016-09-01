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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.GrupoOpcionConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class GrupoOpcionDetalleFormJInternalFrame extends GrupoOpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGrupoOpcion;
	
	protected JMenuBar jmenuBarDetalleGrupoOpcion;
	
	protected JMenu jmenuDetalleGrupoOpcion;
	protected JMenu jmenuDetalleArchivoGrupoOpcion;
	protected JMenu jmenuDetalleAccionesGrupoOpcion;
	protected JMenu jmenuDetalleDatosGrupoOpcion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoOpcion;	
	protected GridBagConstraints gridBagConstraintsGrupoOpcion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GrupoOpcionBeanSwingJInternalFrameAdditional jInternalFrameDetalleGrupoOpcion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	
	

	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;
	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUsuarioOpcion=false;
	public UsuarioOpcionSessionBean usuarioopcionSessionBean;

	public OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;
	public OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOpcion=false;
	public OpcionSessionBean opcionSessionBean;

	public PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;
	public PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilOpcion=false;
	public PerfilOpcionSessionBean perfilopcionSessionBean;
	
	
	public ModuloSessionBean moduloSessionBean;	
	
	public GrupoOpcionLogic grupoopcionLogic;
	
	public JScrollPane jScrollPanelDatosGrupoOpcion;
	public JScrollPane jScrollPanelDatosEdicionGrupoOpcion;
	public JScrollPane jScrollPanelDatosGeneralGrupoOpcion;
	
	protected JPanel jPanelCamposGrupoOpcion;    
	protected JPanel jPanelCamposOcultosGrupoOpcion;    	
	protected JPanel jPanelAccionesGrupoOpcion;
	protected JPanel jPanelAccionesFormularioGrupoOpcion;
    
	
	
	protected Integer iXPanelCamposGrupoOpcion=0;
	protected Integer iYPanelCamposGrupoOpcion=0;
	
	protected Integer iXPanelCamposOcultosGrupoOpcion=0;
	protected Integer iYPanelCamposOcultosGrupoOpcion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGrupoOpcion;
	public JButton jButtonModificarGrupoOpcion;
	public JButton jButtonActualizarGrupoOpcion;
    public JButton jButtonEliminarGrupoOpcion;
	public JButton jButtonCancelarGrupoOpcion;
    public JButton jButtonGuardarCambiosGrupoOpcion;
	public JButton jButtonGuardarCambiosTablaGrupoOpcion;
	protected JButton jButtonCerrarGrupoOpcion;
	
	
	protected JButton jButtonProcesarInformacionGrupoOpcion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGrupoOpcion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGrupoOpcion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGrupoOpcion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoOpcion;
	protected JButton jButtonModificarToolBarGrupoOpcion;
	protected JButton jButtonActualizarToolBarGrupoOpcion;
    protected JButton jButtonEliminarToolBarGrupoOpcion;
	protected JButton jButtonCancelarToolBarGrupoOpcion;
    protected JButton jButtonGuardarCambiosToolBarGrupoOpcion;
	protected JButton jButtonGuardarCambiosTablaToolBarGrupoOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoOpcion;
	protected JButton jButtonCerrarToolBarGrupoOpcion;
	
	protected JButton jButtonProcesarInformacionToolBarGrupoOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoOpcion;
	protected JMenuItem jMenuItemModificarGrupoOpcion;
	protected JMenuItem jMenuItemActualizarGrupoOpcion;
    protected JMenuItem jMenuItemEliminarGrupoOpcion;
	protected JMenuItem jMenuItemCancelarGrupoOpcion;
    protected JMenuItem jMenuItemGuardarCambiosGrupoOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoOpcion;
	protected JMenuItem jMenuItemCerrarGrupoOpcion;
	protected JMenuItem jMenuItemDetalleCerrarGrupoOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoOpcion;
	
	protected JMenuItem jMenuItemProcesarInformacionGrupoOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoOpcion;
	protected JMenuItem jMenuItemMostrarOcultarGrupoOpcion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoOpcion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoOpcion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGrupoOpcion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGrupoOpcion;
	public JLabel jLabelIdGrupoOpcion;
	public JLabel jLabelidGrupoOpcion;
	public JButton jButtonidGrupoOpcionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoGrupoOpcion;
	public JLabel jLabelcodigoGrupoOpcion;
	public JTextField jTextFieldcodigoGrupoOpcion;
	public JButton jButtoncodigoGrupoOpcionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_principalGrupoOpcion;
	public JLabel jLabelnombre_principalGrupoOpcion;
	public JTextArea jTextAreanombre_principalGrupoOpcion;
	public JScrollPane jscrollPanenombre_principalGrupoOpcion;
	public JButton jButtonnombre_principalGrupoOpcionBusqueda= new JButtonMe();

	public JPanel jPanelordenGrupoOpcion;
	public JLabel jLabelordenGrupoOpcion;
	public JTextField jTextFieldordenGrupoOpcion;
	public JButton jButtonordenGrupoOpcionBusqueda= new JButtonMe();

	public JPanel jPanelestadoGrupoOpcion;
	public JLabel jLabelestadoGrupoOpcion;
	public JCheckBox jCheckBoxestadoGrupoOpcion;
	public JButton jButtonestadoGrupoOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloGrupoOpcion;
	public JLabel jLabelid_moduloGrupoOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloGrupoOpcion;
	public JButton jButtonid_moduloGrupoOpcion= new JButtonMe();
	public JButton jButtonid_moduloGrupoOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloGrupoOpcionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGrupoOpcion;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GrupoOpcionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGrupoOpcion=new JPanel();
				this.jPanelAccionesFormularioGrupoOpcion=new JPanel();
				this.jmenuBarDetalleGrupoOpcion=new JMenuBar();
				this.jTtoolBarDetalleGrupoOpcion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GrupoOpcionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoOpcionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGrupoOpcion() {
		return this.jButtonActualizarToolBarGrupoOpcion;
	}
	
	public JButton getjButtonEliminarToolBarGrupoOpcion() {
		return this.jButtonEliminarToolBarGrupoOpcion;
	}
	
	public JButton getjButtonCancelarToolBarGrupoOpcion() {
		return this.jButtonCancelarToolBarGrupoOpcion;
	}		
	
	public JButton getjButtonProcesarInformacionGrupoOpcion() {
		return this.jButtonProcesarInformacionGrupoOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoOpcion)	{
		this.jButtonProcesarInformacionGrupoOpcion = jButtonProcesarInformacionGrupoOpcion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoOpcion() {
		return this.jComboBoxTiposAccionesGrupoOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoOpcion(
			JComboBox jComboBoxTiposRelacionesGrupoOpcion) {
		this.jComboBoxTiposRelacionesGrupoOpcion = jComboBoxTiposRelacionesGrupoOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoOpcion(
			JComboBox jComboBoxTiposAccionesGrupoOpcion) {
		this.jComboBoxTiposAccionesGrupoOpcion = jComboBoxTiposAccionesGrupoOpcion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGrupoOpcion() {
		return this.jComboBoxTiposAccionesFormularioGrupoOpcion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGrupoOpcion(
			JComboBox jComboBoxTiposAccionesFormularioGrupoOpcion) {
		this.jComboBoxTiposAccionesFormularioGrupoOpcion = jComboBoxTiposAccionesFormularioGrupoOpcion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
		
		this.grupoopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoopcionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		//this.opcionSessionBean=new OpcionSessionBean();
		//this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoOpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
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
	
		GrupoOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoOpcion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGrupoOpcion=new JButtonMe();
				this.jButtonModificarToolBarGrupoOpcion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGrupoOpcion,this.jTtoolBarDetalleGrupoOpcion,
							"actualizar","actualizar","Actualizar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGrupoOpcion,this.jTtoolBarDetalleGrupoOpcion,
							"eliminar","eliminar","Eliminar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGrupoOpcion,this.jTtoolBarDetalleGrupoOpcion,
							"cancelar","cancelar","Cancelar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGrupoOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGrupoOpcion,this.jTtoolBarDetalleGrupoOpcion,
							"guardarcambios","guardarcambios","Guardar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGrupoOpcion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGrupoOpcion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGrupoOpcion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGrupoOpcion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGrupoOpcion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGrupoOpcion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGrupoOpcion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGrupoOpcion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGrupoOpcion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGrupoOpcion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGrupoOpcion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGrupoOpcion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGrupoOpcion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGrupoOpcion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGrupoOpcion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGrupoOpcion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGrupoOpcion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGrupoOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGrupoOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGrupoOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGrupoOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGrupoOpcion.add(this.jMenuItemDetalleCerrarGrupoOpcion);
		
		this.jmenuDetalleAccionesGrupoOpcion.add(this.jMenuItemActualizarGrupoOpcion);
		this.jmenuDetalleAccionesGrupoOpcion.add(this.jMenuItemEliminarGrupoOpcion);
		this.jmenuDetalleAccionesGrupoOpcion.add(this.jMenuItemCancelarGrupoOpcion);		
		
		//this.jmenuDetalleDatosGrupoOpcion.add(this.jMenuItemDetalleAbrirOrderByGrupoOpcion);				
		this.jmenuDetalleDatosGrupoOpcion.add(this.jMenuItemDetalleMostarOcultarGrupoOpcion);				
				
		//this.jmenuDetalleAccionesGrupoOpcion.add(this.jMenuItemGuardarCambiosGrupoOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGrupoOpcion.add(this.jmenuDetalleArchivoGrupoOpcion);		
		this.jmenuBarDetalleGrupoOpcion.add(this.jmenuDetalleAccionesGrupoOpcion);		
		this.jmenuBarDetalleGrupoOpcion.add(this.jmenuDetalleDatosGrupoOpcion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGrupoOpcion.add(this.jmenuDetalleGrupoOpcion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGrupoOpcion);				
	}
	
	
	public void inicializarElementosCamposGrupoOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGrupoOpcion = new JLabelMe();
		jLabelIdGrupoOpcion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGrupoOpcion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGrupoOpcion.setToolTipText(GrupoOpcionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGrupoOpcion= new GridBagLayout();

		this.jPanelidGrupoOpcion.setLayout(this.gridaBagLayoutGrupoOpcion);

		jLabelidGrupoOpcion = new JLabel();
		jLabelidGrupoOpcion.setText("Id");

		jLabelidGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoGrupoOpcion = new JLabelMe();
		this.jLabelcodigoGrupoOpcion.setText(""+GrupoOpcionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoGrupoOpcion.setToolTipText("Codigo");
		this.jLabelcodigoGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoGrupoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoGrupoOpcion.setToolTipText(GrupoOpcionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutGrupoOpcion = new GridBagLayout();
		this.jPanelcodigoGrupoOpcion.setLayout(this.gridaBagLayoutGrupoOpcion);


		jTextFieldcodigoGrupoOpcion= new JTextFieldMe();

		jTextFieldcodigoGrupoOpcion.setEnabled(false);
		jTextFieldcodigoGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoGrupoOpcionBusqueda= new JButtonMe();
		this.jButtoncodigoGrupoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoGrupoOpcionBusqueda.setText("U");
		this.jButtoncodigoGrupoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoGrupoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoGrupoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoGrupoOpcionBusqueda"));

		if(this.grupoopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoGrupoOpcionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_principalGrupoOpcion = new JLabelMe();
		this.jLabelnombre_principalGrupoOpcion.setText(""+GrupoOpcionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombre_principalGrupoOpcion.setToolTipText("Nombre Principal");
		this.jLabelnombre_principalGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_principalGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_principalGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_principalGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_principalGrupoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_principalGrupoOpcion.setToolTipText(GrupoOpcionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutGrupoOpcion = new GridBagLayout();
		this.jPanelnombre_principalGrupoOpcion.setLayout(this.gridaBagLayoutGrupoOpcion);


		jTextAreanombre_principalGrupoOpcion= new JTextAreaMe();
		jTextAreanombre_principalGrupoOpcion.setEnabled(false);
		jTextAreanombre_principalGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalGrupoOpcion.setLineWrap(true);
		jTextAreanombre_principalGrupoOpcion.setWrapStyleWord(true);
		jTextAreanombre_principalGrupoOpcion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_principalGrupoOpcion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_principalGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_principalGrupoOpcion = new JScrollPane(jTextAreanombre_principalGrupoOpcion);
		jscrollPanenombre_principalGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_principalGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_principalGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_principalGrupoOpcionBusqueda= new JButtonMe();
		this.jButtonnombre_principalGrupoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_principalGrupoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_principalGrupoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_principalGrupoOpcionBusqueda.setText("U");
		this.jButtonnombre_principalGrupoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_principalGrupoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_principalGrupoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_principalGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_principalGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_principalGrupoOpcionBusqueda"));

		if(this.grupoopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_principalGrupoOpcionBusqueda.setVisible(false);		}


					
		this.jLabelordenGrupoOpcion = new JLabelMe();
		this.jLabelordenGrupoOpcion.setText(""+GrupoOpcionConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenGrupoOpcion.setToolTipText("Orden");
		this.jLabelordenGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenGrupoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenGrupoOpcion.setToolTipText(GrupoOpcionConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutGrupoOpcion = new GridBagLayout();
		this.jPanelordenGrupoOpcion.setLayout(this.gridaBagLayoutGrupoOpcion);


		jTextFieldordenGrupoOpcion= new JTextFieldMe();
		jTextFieldordenGrupoOpcion.setEnabled(false);
		jTextFieldordenGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenGrupoOpcion.setText("0");

		this.jButtonordenGrupoOpcionBusqueda= new JButtonMe();
		this.jButtonordenGrupoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenGrupoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenGrupoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenGrupoOpcionBusqueda.setText("U");
		this.jButtonordenGrupoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenGrupoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenGrupoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenGrupoOpcionBusqueda"));

		if(this.grupoopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenGrupoOpcionBusqueda.setVisible(false);		}


					
		this.jLabelestadoGrupoOpcion = new JLabelMe();
		this.jLabelestadoGrupoOpcion.setText(""+GrupoOpcionConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoGrupoOpcion.setToolTipText("Estado");
		this.jLabelestadoGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoGrupoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoGrupoOpcion.setToolTipText(GrupoOpcionConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutGrupoOpcion = new GridBagLayout();
		this.jPanelestadoGrupoOpcion.setLayout(this.gridaBagLayoutGrupoOpcion);


		jCheckBoxestadoGrupoOpcion= new JCheckBoxMe();
		jCheckBoxestadoGrupoOpcion.setEnabled(false);

		jCheckBoxestadoGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoGrupoOpcionBusqueda= new JButtonMe();
		this.jButtonestadoGrupoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoGrupoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoGrupoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoGrupoOpcionBusqueda.setText("U");
		this.jButtonestadoGrupoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoGrupoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoGrupoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoGrupoOpcionBusqueda"));

		if(this.grupoopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoGrupoOpcionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGrupoOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_moduloGrupoOpcion = new JLabelMe();
		this.jLabelid_moduloGrupoOpcion.setText(""+GrupoOpcionConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloGrupoOpcion.setToolTipText("Modulo");
		this.jLabelid_moduloGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloGrupoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloGrupoOpcion.setToolTipText(GrupoOpcionConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutGrupoOpcion = new GridBagLayout();
		this.jPanelid_moduloGrupoOpcion.setLayout(this.gridaBagLayoutGrupoOpcion);


		jComboBoxid_moduloGrupoOpcion= new JComboBoxMe();
		jComboBoxid_moduloGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloGrupoOpcion.setEnabled(false);

		this.jButtonid_moduloGrupoOpcion= new JButtonMe();
		this.jButtonid_moduloGrupoOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloGrupoOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloGrupoOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloGrupoOpcion.setText("Buscar");
		this.jButtonid_moduloGrupoOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloGrupoOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloGrupoOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloGrupoOpcion"));

		this.jButtonid_moduloGrupoOpcionBusqueda= new JButtonMe();
		this.jButtonid_moduloGrupoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloGrupoOpcionBusqueda.setText("U");
		this.jButtonid_moduloGrupoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloGrupoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloGrupoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloGrupoOpcionBusqueda"));

		if(this.grupoopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloGrupoOpcionBusqueda.setVisible(false);		}

		this.jButtonid_moduloGrupoOpcionUpdate= new JButtonMe();
		this.jButtonid_moduloGrupoOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloGrupoOpcionUpdate.setText("U");
		this.jButtonid_moduloGrupoOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloGrupoOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloGrupoOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloGrupoOpcionUpdate"));



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
		//this.jInternalFrameDetalleGrupoOpcion = new GrupoOpcionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Grupo Opcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoOpcion= new GridBagLayout();
		

		
		String sToolTipGrupoOpcion="";
		sToolTipGrupoOpcion=GrupoOpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoOpcion+="(Seguridad.GrupoOpcion)";
		}
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoOpcion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGrupoOpcion = new JButtonMe();
		this.jButtonModificarGrupoOpcion = new JButtonMe();
        this.jButtonActualizarGrupoOpcion = new JButtonMe();
        this.jButtonEliminarGrupoOpcion = new JButtonMe();
        this.jButtonCancelarGrupoOpcion = new JButtonMe();
        this.jButtonGuardarCambiosGrupoOpcion = new JButtonMe();
		this.jButtonGuardarCambiosTablaGrupoOpcion = new JButtonMe();
		this.jButtonCerrarGrupoOpcion = new JButtonMe();
		
		this.jScrollPanelDatosGrupoOpcion = new JScrollPane();   
        this.jScrollPanelDatosEdicionGrupoOpcion = new JScrollPane();
		this.jScrollPanelDatosGeneralGrupoOpcion = new JScrollPane();
				
		
		
		this.jPanelCamposGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Opcion";
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Opcions" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGrupoOpcion.setName("jPanelCamposGrupoOpcion"); 

		this.jPanelCamposOcultosGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGrupoOpcion.setName("jPanelCamposOcultosGrupoOpcion"); 

        this.jPanelAccionesGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoOpcion.setToolTipText("Acciones");
        this.jPanelAccionesGrupoOpcion.setName("Acciones"); 

		this.jPanelAccionesFormularioGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGrupoOpcion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGrupoOpcion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGrupoOpcion.setText("Nuevo");
		this.jButtonModificarGrupoOpcion.setText("Editar");
        this.jButtonActualizarGrupoOpcion.setText("Actualizar");
        this.jButtonEliminarGrupoOpcion.setText("Eliminar");
        this.jButtonCancelarGrupoOpcion.setText("Cancelar");
        this.jButtonGuardarCambiosGrupoOpcion.setText("Guardar");
		this.jButtonGuardarCambiosTablaGrupoOpcion.setText("Guardar");
		this.jButtonCerrarGrupoOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoOpcion,"nuevo_button","Nuevo",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGrupoOpcion,"modificar_button","Editar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGrupoOpcion,"actualizar_button","Actualizar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGrupoOpcion,"eliminar_button","Eliminar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGrupoOpcion,"cancelar_button","Cancelar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGrupoOpcion,"guardarcambios_button","Guardar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoOpcion,"guardarcambiostabla_button","Guardar",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoOpcion,"cerrar_button","Salir",this.grupoopcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGrupoOpcion.setToolTipText("Nuevo"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGrupoOpcion.setToolTipText("Editar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGrupoOpcion.setToolTipText("Actualizar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGrupoOpcion.setToolTipText("Eliminar)"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGrupoOpcion.setToolTipText("Cancelar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGrupoOpcion.setToolTipText("Guardar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGrupoOpcion.setToolTipText("Guardar"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoOpcion.setToolTipText("Salir"+" "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoOpcion";
		inputMap = this.jButtonNuevoGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoOpcion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGrupoOpcion";
		inputMap = this.jButtonActualizarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGrupoOpcion"));
		
		//ELIMINAR
		sMapKey = "EliminarGrupoOpcion";
		inputMap = this.jButtonEliminarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGrupoOpcion"));
		
		//CANCELAR	
		sMapKey = "CancelarGrupoOpcion";
		inputMap = this.jButtonCancelarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGrupoOpcion"));
		
		//CERRAR		
		sMapKey = "CerrarGrupoOpcion";
		inputMap = this.jButtonCerrarGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoOpcion";
		inputMap = this.jButtonGuardarCambiosTablaGrupoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoOpcion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGrupoOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGrupoOpcion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGrupoOpcion.setToolTipText("Nuevo GrupoOpcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGrupoOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGrupoOpcion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGrupoOpcion.setToolTipText("Sin Cerrar Ventana GrupoOpcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGrupoOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGrupoOpcion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGrupoOpcion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoOpcion.setText("Accion");
		this.jComboBoxTiposAccionesGrupoOpcion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGrupoOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGrupoOpcion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGrupoOpcion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGrupoOpcion = new JLabelMe();
		
		this.jLabelAccionesGrupoOpcion.setText("Acciones");		
		this.jLabelAccionesGrupoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGrupoOpcion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGrupoOpcion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGrupoOpcion=new JTabbedPane();
		this.jTabbedPaneRelacionesGrupoOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGrupoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGrupoOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGrupoOpcion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoOpcion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoOpcion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGrupoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGrupoOpcion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGrupoOpcion = new GridBagLayout();
		
		this.jPanelCamposGrupoOpcion.setLayout(gridaBagLayoutCamposGrupoOpcion);
		this.jPanelCamposOcultosGrupoOpcion.setLayout(gridaBagLayoutCamposOcultosGrupoOpcion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 0;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGrupoOpcion.add(jLabelIdGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 1;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGrupoOpcion.add(jLabelidGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 0;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloGrupoOpcion.add(jLabelid_moduloGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 2;
		this.gridBagConstraintsGrupoOpcion.ipadx = 0;
		this.gridBagConstraintsGrupoOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloGrupoOpcion.add(jButtonid_moduloGrupoOpcionBusqueda, this.gridBagConstraintsGrupoOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 3;
		this.gridBagConstraintsGrupoOpcion.ipadx = 0;
		this.gridBagConstraintsGrupoOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloGrupoOpcion.add(jButtonid_moduloGrupoOpcionUpdate, this.gridBagConstraintsGrupoOpcion);
	}

	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 1;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloGrupoOpcion.add(jComboBoxid_moduloGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 0;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoGrupoOpcion.add(jLabelcodigoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 2;
		this.gridBagConstraintsGrupoOpcion.ipadx = 0;
		this.gridBagConstraintsGrupoOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoGrupoOpcion.add(jButtoncodigoGrupoOpcionBusqueda, this.gridBagConstraintsGrupoOpcion);
	}

	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 1;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoGrupoOpcion.add(jTextFieldcodigoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 0;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_principalGrupoOpcion.add(jLabelnombre_principalGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 2;
		this.gridBagConstraintsGrupoOpcion.ipadx = 0;
		this.gridBagConstraintsGrupoOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_principalGrupoOpcion.add(jButtonnombre_principalGrupoOpcionBusqueda, this.gridBagConstraintsGrupoOpcion);
	}

	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 1;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_principalGrupoOpcion.add(jscrollPanenombre_principalGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 0;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenGrupoOpcion.add(jLabelordenGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 2;
		this.gridBagConstraintsGrupoOpcion.ipadx = 0;
		this.gridBagConstraintsGrupoOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenGrupoOpcion.add(jButtonordenGrupoOpcionBusqueda, this.gridBagConstraintsGrupoOpcion);
	}

	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 1;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenGrupoOpcion.add(jTextFieldordenGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 0;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoGrupoOpcion.add(jLabelestadoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		//this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = 2;
		this.gridBagConstraintsGrupoOpcion.ipadx = 0;
		this.gridBagConstraintsGrupoOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoGrupoOpcion.add(jButtonestadoGrupoOpcionBusqueda, this.gridBagConstraintsGrupoOpcion);
	}

	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoOpcion.gridy = 0;
	this.gridBagConstraintsGrupoOpcion.gridx = 1;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoGrupoOpcion.add(jCheckBoxestadoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoOpcion.gridy = iYPanelCamposGrupoOpcion;
	this.gridBagConstraintsGrupoOpcion.gridx = iXPanelCamposGrupoOpcion++;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoOpcion.add(this.jPanelidGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(iXPanelCamposGrupoOpcion % 1==0) {
		iXPanelCamposGrupoOpcion=0;
		iYPanelCamposGrupoOpcion++;
	}
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoOpcion.gridy = iYPanelCamposGrupoOpcion;
	this.gridBagConstraintsGrupoOpcion.gridx = iXPanelCamposGrupoOpcion++;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoOpcion.add(this.jPanelcodigoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(iXPanelCamposGrupoOpcion % 1==0) {
		iXPanelCamposGrupoOpcion=0;
		iYPanelCamposGrupoOpcion++;
	}
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoOpcion.gridy = iYPanelCamposGrupoOpcion;
	this.gridBagConstraintsGrupoOpcion.gridx = iXPanelCamposGrupoOpcion++;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoOpcion.add(this.jPanelnombre_principalGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(iXPanelCamposGrupoOpcion % 1==0) {
		iXPanelCamposGrupoOpcion=0;
		iYPanelCamposGrupoOpcion++;
	}
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoOpcion.gridy = iYPanelCamposGrupoOpcion;
	this.gridBagConstraintsGrupoOpcion.gridx = iXPanelCamposGrupoOpcion++;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoOpcion.add(this.jPanelordenGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(iXPanelCamposGrupoOpcion % 1==0) {
		iXPanelCamposGrupoOpcion=0;
		iYPanelCamposGrupoOpcion++;
	}
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoOpcion.gridy = iYPanelCamposGrupoOpcion;
	this.gridBagConstraintsGrupoOpcion.gridx = iXPanelCamposGrupoOpcion++;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoOpcion.add(this.jPanelestadoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(iXPanelCamposGrupoOpcion % 1==0) {
		iXPanelCamposGrupoOpcion=0;
		iYPanelCamposGrupoOpcion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoOpcion.gridy = iYPanelCamposOcultosGrupoOpcion;
	this.gridBagConstraintsGrupoOpcion.gridx = iXPanelCamposOcultosGrupoOpcion++;
	this.gridBagConstraintsGrupoOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoOpcion.add(this.jPanelid_moduloGrupoOpcion, this.gridBagConstraintsGrupoOpcion);



	if(iXPanelCamposOcultosGrupoOpcion % 1==0) {
		iXPanelCamposOcultosGrupoOpcion=0;
		iYPanelCamposOcultosGrupoOpcion++;
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
			
		GridBagLayout gridaBagLayoutAccionesGrupoOpcion= new GridBagLayout();
		this.jPanelAccionesGrupoOpcion.setLayout(gridaBagLayoutAccionesGrupoOpcion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGrupoOpcion= new GridBagLayout();
		this.jPanelAccionesFormularioGrupoOpcion.setLayout(gridaBagLayoutAccionesFormularioGrupoOpcion);
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoOpcion.add(this.jComboBoxTiposAccionesFormularioGrupoOpcion, this.gridBagConstraintsGrupoOpcion);

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoOpcion.add(this.jCheckBoxPostAccionNuevoGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoOpcion.add(this.jCheckBoxPostAccionSinCerrarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoOpcion.add(this.jCheckBoxPostAccionSinMensajeGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccion++;
			
		this.jPanelAccionesGrupoOpcion.add(this.jButtonModificarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);							

		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoOpcion.gridy = 0;
		this.gridBagConstraintsGrupoOpcion.gridx =iPosXAccion++;
			
		this.jPanelAccionesGrupoOpcion.add(this.jButtonEliminarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
			
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = 0;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoOpcion.add(this.jButtonActualizarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);


		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = 0;		
		this.gridBagConstraintsGrupoOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoOpcion.add(this.jButtonGuardarCambiosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);	
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = 0;		
		this.gridBagConstraintsGrupoOpcion.gridx =iPosXAccion++;
		
		this.jPanelAccionesGrupoOpcion.add(this.jButtonCancelarGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoOpcion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();						
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoOpcion.gridx = 0;		
			//this.gridBagConstraintsGrupoOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoOpcion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoOpcion.gridx =0;
		this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGrupoOpcion = new GrupoOpcionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Grupo Opcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Grupo Opcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Opcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GrupoOpcionModel grupoopcionModel=new GrupoOpcionModel(this);
			
			//SI USARA CLASE INTERNA
			//GrupoOpcionModel.GrupoOpcionFocusTraversalPolicy grupoopcionFocusTraversalPolicy = grupoopcionModel.new GrupoOpcionFocusTraversalPolicy(this);
			
			//grupoopcionFocusTraversalPolicy.setgrupoopcionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(grupoopcionModel);
			
			
			this.jContentPaneDetalleGrupoOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGrupoOpcion = new GridBagLayout();	
			this.jContentPaneDetalleGrupoOpcion.setLayout(gridaBagLayoutDetalleGrupoOpcion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoOpcion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGrupoOpcion.gridx = 0;
					
				
				this.jContentPaneDetalleGrupoOpcion.add(jTtoolBarDetalleGrupoOpcion, gridBagConstraintsGrupoOpcion);								
				
}
			
			this.jScrollPanelDatosEdicionGrupoOpcion=   new JScrollPane(jContentPaneDetalleGrupoOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGrupoOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGrupoOpcion.gridx = 0;
	        
			this.jContentPaneDetalleGrupoOpcion.add(jPanelCamposGrupoOpcion, gridBagConstraintsGrupoOpcion);
			
			
			
			
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
						&& grupoopcionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameOpcion(this.puedeCargarPorParteOpcion,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilOpcion(this.puedeCargarPorPartePerfilOpcion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(this.puedeCargarPorParteUsuarioOpcion,false,-1);
					
					if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGrupoOpcion= new GridBagConstraints();
						this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGrupoOpcion.gridx = 0;
						this.jContentPaneDetalleGrupoOpcion.add(this.jTabbedPaneRelacionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGrupoOpcion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGrupoOpcion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
					this.gridBagConstraintsGrupoOpcion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGrupoOpcion.gridx = 0;
					
				
					this.jContentPaneDetalleGrupoOpcion.add(jPanelCamposOcultosGrupoOpcion, gridBagConstraintsGrupoOpcion);
				
					this.jPanelCamposOcultosGrupoOpcion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsGrupoOpcion.gridx = 0;
	        this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGrupoOpcion.add(this.jPanelAccionesFormularioGrupoOpcion, this.gridBagConstraintsGrupoOpcion);							
			
			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
	        this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsGrupoOpcion.gridx = 0;
	        
			
			this.jContentPaneDetalleGrupoOpcion.add(this.jPanelAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGrupoOpcion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGrupoOpcion=   new JScrollPane(this.jPanelCamposGrupoOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGrupoOpcion.gridx = 0;
			this.gridBagConstraintsGrupoOpcion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGrupoOpcion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGrupoOpcion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGrupoOpcion, this.gridBagConstraintsGrupoOpcion);			
			
			this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
			this.gridBagConstraintsGrupoOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
			
			
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		
			
		this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
		this.gridBagConstraintsGrupoOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoOpcion, this.gridBagConstraintsGrupoOpcion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGrupoOpcion;//jContentPane;
		
		return jScrollPanelDatosEdicionGrupoOpcion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.opcionSessionBean=new OpcionSessionBean();
		this.opcionSessionBean.setConGuardarRelaciones(false);
		this.opcionSessionBean.setEsGuardarRelacionado(true);

		this.opcionBeanSwingJInternalFrame=null;//new OpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.opcionBeanSwingJInternalFramePopup=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.opcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.opcionSessionBean.getEsGuardarRelacionado()) {

				OpcionJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				OpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.opcionSessionBean.setEsGuardarRelacionado(true);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.opcionBeanSwingJInternalFrame.setopcionSessionBean(this.opcionSessionBean);

				//this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				//this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoOpcion.gridx = 0;
				//this.jContentPaneDetalleGrupoOpcion.add(this.opcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoOpcion.add("Opciones",this.opcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoOpcion.setComponentAt(iIndexTab,this.opcionBeanSwingJInternalFrame.getContentPane());
				}

				//OpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.opcionSessionBean.setEsGuardarRelacionado(false);
				this.opcionBeanSwingJInternalFrame=null;//new OpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOpcion) {
					this.jTabbedPaneRelacionesGrupoOpcion.add("Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePerfilOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		this.perfilopcionSessionBean.setConGuardarRelaciones(false);
		this.perfilopcionSessionBean.setEsGuardarRelacionado(true);

		this.perfilopcionBeanSwingJInternalFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilopcionBeanSwingJInternalFramePopup=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {

				PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilopcionSessionBean.setEsGuardarRelacionado(true);

				this.perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilopcionBeanSwingJInternalFrame.setperfilopcionSessionBean(this.perfilopcionSessionBean);

				//this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				//this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoOpcion.gridx = 0;
				//this.jContentPaneDetalleGrupoOpcion.add(this.perfilopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoOpcion.add("Perfil Opciones",this.perfilopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoOpcion.setComponentAt(iIndexTab,this.perfilopcionBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilopcionSessionBean.setEsGuardarRelacionado(false);
				this.perfilopcionBeanSwingJInternalFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilOpcion) {
					this.jTabbedPaneRelacionesGrupoOpcion.add("Perfil Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		this.usuarioopcionSessionBean.setConGuardarRelaciones(false);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

		this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.usuarioopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {

				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

				this.usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.usuarioopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.usuarioopcionBeanSwingJInternalFrame.setusuarioopcionSessionBean(this.usuarioopcionSessionBean);

				//this.gridBagConstraintsGrupoOpcion = new GridBagConstraints();
				//this.gridBagConstraintsGrupoOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoOpcion.gridx = 0;
				//this.jContentPaneDetalleGrupoOpcion.add(this.usuarioopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoOpcion.add("Usuario Opciones",this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoOpcion.setComponentAt(iIndexTab,this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				}

				//UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUsuarioOpcion) {
					this.jTabbedPaneRelacionesGrupoOpcion.add("Usuario Opciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarUsuarioOpcionBeanSwingJInternalFrame(List<GrupoOpcion> grupoopcions,GrupoOpcion grupoopcion,UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					usuarioopcionBeanSwingJInternalFrame.getUsuarioOpcionLogic().setConnexion(this.grupoopcionLogic.getConnexion());

					usuarioopcionBeanSwingJInternalFrame.setgrupoopcionsForeignKey(grupoopcions);
					usuarioopcionBeanSwingJInternalFrame.setgrupoopcionForeignKey(grupoopcion);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionGrupoOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setlidGrupoOpcionActual(grupoopcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					usuarioopcionBeanSwingJInternalFrame.cargarCombosForeignKeyUsuarioOpcion(usuarioopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					usuarioopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.setid_grupo_opcionFK_IdGrupoOpcion(grupoopcion.getId());

					if(!this.conCargarFormDetalle) {
						usuarioopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					usuarioopcionBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoOpcionForeignKey(grupoopcion,1,false,true,true);
					usuarioopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					usuarioopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoOpcion");
					usuarioopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoOpcion");
					usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUsuarioOpcion("n",usuarioopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, usuarioopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					usuarioopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					usuarioopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("relacionado");
					} else {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");
					}

					usuarioopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionUsuarioOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarOpcionBeanSwingJInternalFrame(List<GrupoOpcion> grupoopcions,GrupoOpcion grupoopcion,OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.grupoopcionLogic.getConnexion());

					opcionBeanSwingJInternalFrame.setgrupoopcionsForeignKey(grupoopcions);
					opcionBeanSwingJInternalFrame.setgrupoopcionForeignKey(grupoopcion);
					opcionBeanSwingJInternalFrame.opcionSessionBean.setisBusquedaDesdeForeignKeySesionGrupoOpcion(true);
					opcionBeanSwingJInternalFrame.opcionSessionBean.setlidGrupoOpcionActual(grupoopcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					opcionBeanSwingJInternalFrame.cargarCombosForeignKeyOpcion(opcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					opcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoOpcion(true);
					opcionBeanSwingJInternalFrame.setid_grupo_opcionFK_IdGrupoOpcion(grupoopcion.getId());

					if(!this.conCargarFormDetalle) {
						opcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					opcionBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoOpcionForeignKey(grupoopcion,1,false,true,true);
					opcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					opcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoOpcion");
					opcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoOpcion");
					opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(true);
					opcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOpcion("n",opcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, opcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					opcionBeanSwingJInternalFrame.setAutoscrolls(true);
					opcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("relacionado");
					} else {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("no_relacionado");
					}

					opcionBeanSwingJInternalFrame.getjButtonRecargarInformacionOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPerfilOpcionBeanSwingJInternalFrame(List<GrupoOpcion> grupoopcions,GrupoOpcion grupoopcion,PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilopcionBeanSwingJInternalFrame.getPerfilOpcionLogic().setConnexion(this.grupoopcionLogic.getConnexion());

					perfilopcionBeanSwingJInternalFrame.setgrupoopcionsForeignKey(grupoopcions);
					perfilopcionBeanSwingJInternalFrame.setgrupoopcionForeignKey(grupoopcion);
					perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionGrupoOpcion(true);
					perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setlidGrupoOpcionActual(grupoopcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilopcionBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilOpcion(perfilopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoOpcion(true);
					perfilopcionBeanSwingJInternalFrame.setid_grupo_opcionFK_IdGrupoOpcion(grupoopcion.getId());

					if(!this.conCargarFormDetalle) {
						perfilopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilopcionBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoOpcionForeignKey(grupoopcion,1,false,true,true);
					perfilopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoOpcion");
					perfilopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoOpcion");
					perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(true);
					perfilopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilOpcion("n",perfilopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("relacionado");
					} else {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("no_relacionado");
					}

					perfilopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilOpcion().setVisible(false);

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
