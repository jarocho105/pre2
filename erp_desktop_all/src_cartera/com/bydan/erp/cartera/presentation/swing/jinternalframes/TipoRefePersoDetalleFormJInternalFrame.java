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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.cartera.util.TipoRefePersoConstantesFunciones;

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
public class TipoRefePersoDetalleFormJInternalFrame extends TipoRefePersoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRefePerso;
	
	protected JMenuBar jmenuBarDetalleTipoRefePerso;
	
	protected JMenu jmenuDetalleTipoRefePerso;
	protected JMenu jmenuDetalleArchivoTipoRefePerso;
	protected JMenu jmenuDetalleAccionesTipoRefePerso;
	protected JMenu jmenuDetalleDatosTipoRefePerso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRefePerso;	
	protected GridBagConstraints gridBagConstraintsTipoRefePerso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRefePersoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRefePerso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRefePersoSessionBean tiporefepersoSessionBean;
	
	

	public ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFrame=null;
	public ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaPersonal=false;
	public ReferenciaPersonalSessionBean referenciapersonalSessionBean;
	
		
	
	public TipoRefePersoLogic tiporefepersoLogic;
	
	public JScrollPane jScrollPanelDatosTipoRefePerso;
	public JScrollPane jScrollPanelDatosEdicionTipoRefePerso;
	public JScrollPane jScrollPanelDatosGeneralTipoRefePerso;
	
	protected JPanel jPanelCamposTipoRefePerso;    
	protected JPanel jPanelCamposOcultosTipoRefePerso;    	
	protected JPanel jPanelAccionesTipoRefePerso;
	protected JPanel jPanelAccionesFormularioTipoRefePerso;
    
	
	
	protected Integer iXPanelCamposTipoRefePerso=0;
	protected Integer iYPanelCamposTipoRefePerso=0;
	
	protected Integer iXPanelCamposOcultosTipoRefePerso=0;
	protected Integer iYPanelCamposOcultosTipoRefePerso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRefePerso;
	public JButton jButtonModificarTipoRefePerso;
	public JButton jButtonActualizarTipoRefePerso;
    public JButton jButtonEliminarTipoRefePerso;
	public JButton jButtonCancelarTipoRefePerso;
    public JButton jButtonGuardarCambiosTipoRefePerso;
	public JButton jButtonGuardarCambiosTablaTipoRefePerso;
	protected JButton jButtonCerrarTipoRefePerso;
	
	
	protected JButton jButtonProcesarInformacionTipoRefePerso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRefePerso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRefePerso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRefePerso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRefePerso;
	protected JButton jButtonModificarToolBarTipoRefePerso;
	protected JButton jButtonActualizarToolBarTipoRefePerso;
    protected JButton jButtonEliminarToolBarTipoRefePerso;
	protected JButton jButtonCancelarToolBarTipoRefePerso;
    protected JButton jButtonGuardarCambiosToolBarTipoRefePerso;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRefePerso;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRefePerso;
	protected JButton jButtonCerrarToolBarTipoRefePerso;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRefePerso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRefePerso;
	protected JMenuItem jMenuItemModificarTipoRefePerso;
	protected JMenuItem jMenuItemActualizarTipoRefePerso;
    protected JMenuItem jMenuItemEliminarTipoRefePerso;
	protected JMenuItem jMenuItemCancelarTipoRefePerso;
    protected JMenuItem jMenuItemGuardarCambiosTipoRefePerso;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRefePerso;
	protected JMenuItem jMenuItemCerrarTipoRefePerso;
	protected JMenuItem jMenuItemDetalleCerrarTipoRefePerso;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRefePerso;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRefePerso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRefePerso;
	protected JMenuItem jMenuItemMostrarOcultarTipoRefePerso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRefePerso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRefePerso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRefePerso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRefePerso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRefePerso;
	public JLabel jLabelIdTipoRefePerso;
	public JTextFieldMe jTextFieldidTipoRefePerso;
	public JButton jButtonidTipoRefePersoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRefePerso;
	public JLabel jLabelcodigoTipoRefePerso;
	public JTextField jTextFieldcodigoTipoRefePerso;
	public JButton jButtoncodigoTipoRefePersoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRefePerso;
	public JLabel jLabelnombreTipoRefePerso;
	public JTextArea jTextAreanombreTipoRefePerso;
	public JScrollPane jscrollPanenombreTipoRefePerso;
	public JButton jButtonnombreTipoRefePersoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRefePerso;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRefePersoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRefePerso=new JPanel();
				this.jPanelAccionesFormularioTipoRefePerso=new JPanel();
				this.jmenuBarDetalleTipoRefePerso=new JMenuBar();
				this.jTtoolBarDetalleTipoRefePerso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRefePersoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRefePersoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRefePerso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRefePerso() {
		return this.jButtonActualizarToolBarTipoRefePerso;
	}
	
	public JButton getjButtonEliminarToolBarTipoRefePerso() {
		return this.jButtonEliminarToolBarTipoRefePerso;
	}
	
	public JButton getjButtonCancelarToolBarTipoRefePerso() {
		return this.jButtonCancelarToolBarTipoRefePerso;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRefePerso() {
		return this.jButtonProcesarInformacionTipoRefePerso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRefePerso)	{
		this.jButtonProcesarInformacionTipoRefePerso = jButtonProcesarInformacionTipoRefePerso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRefePerso() {
		return this.jComboBoxTiposAccionesTipoRefePerso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRefePerso(
			JComboBox jComboBoxTiposRelacionesTipoRefePerso) {
		this.jComboBoxTiposRelacionesTipoRefePerso = jComboBoxTiposRelacionesTipoRefePerso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRefePerso(
			JComboBox jComboBoxTiposAccionesTipoRefePerso) {
		this.jComboBoxTiposAccionesTipoRefePerso = jComboBoxTiposAccionesTipoRefePerso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRefePerso() {
		return this.jComboBoxTiposAccionesFormularioTipoRefePerso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRefePerso(
			JComboBox jComboBoxTiposAccionesFormularioTipoRefePerso) {
		this.jComboBoxTiposAccionesFormularioTipoRefePerso = jComboBoxTiposAccionesFormularioTipoRefePerso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
		
		this.tiporefepersoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporefepersoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporefepersoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRefePersoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Refe Perso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRefePersoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRefePerso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRefePerso=new JButtonMe();
				this.jButtonModificarToolBarTipoRefePerso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRefePerso,this.jTtoolBarDetalleTipoRefePerso,
							"actualizar","actualizar","Actualizar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRefePerso,this.jTtoolBarDetalleTipoRefePerso,
							"eliminar","eliminar","Eliminar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRefePerso,this.jTtoolBarDetalleTipoRefePerso,
							"cancelar","cancelar","Cancelar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRefePerso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRefePerso,this.jTtoolBarDetalleTipoRefePerso,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRefePerso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRefePerso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRefePerso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRefePerso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRefePerso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRefePerso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRefePerso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRefePerso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRefePerso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRefePerso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRefePerso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRefePerso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRefePerso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRefePerso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRefePerso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRefePerso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRefePerso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRefePerso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRefePerso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRefePerso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRefePerso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRefePerso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRefePerso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRefePerso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRefePerso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRefePerso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRefePerso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRefePerso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRefePerso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRefePerso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRefePerso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRefePerso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRefePerso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRefePerso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRefePerso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRefePerso.add(this.jMenuItemDetalleCerrarTipoRefePerso);
		
		this.jmenuDetalleAccionesTipoRefePerso.add(this.jMenuItemActualizarTipoRefePerso);
		this.jmenuDetalleAccionesTipoRefePerso.add(this.jMenuItemEliminarTipoRefePerso);
		this.jmenuDetalleAccionesTipoRefePerso.add(this.jMenuItemCancelarTipoRefePerso);		
		
		//this.jmenuDetalleDatosTipoRefePerso.add(this.jMenuItemDetalleAbrirOrderByTipoRefePerso);				
		this.jmenuDetalleDatosTipoRefePerso.add(this.jMenuItemDetalleMostarOcultarTipoRefePerso);				
				
		//this.jmenuDetalleAccionesTipoRefePerso.add(this.jMenuItemGuardarCambiosTipoRefePerso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRefePerso.add(this.jmenuDetalleArchivoTipoRefePerso);		
		this.jmenuBarDetalleTipoRefePerso.add(this.jmenuDetalleAccionesTipoRefePerso);		
		this.jmenuBarDetalleTipoRefePerso.add(this.jmenuDetalleDatosTipoRefePerso);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRefePerso.add(this.jmenuDetalleTipoRefePerso);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRefePerso);				
	}
	
	
	public void inicializarElementosCamposTipoRefePerso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRefePerso = new JLabelMe();
		jLabelIdTipoRefePerso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRefePerso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRefePerso.setToolTipText(TipoRefePersoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRefePerso= new GridBagLayout();

		this.jPanelidTipoRefePerso.setLayout(this.gridaBagLayoutTipoRefePerso);

		jTextFieldidTipoRefePerso = new JTextFieldMe();
		jTextFieldidTipoRefePerso.setText("Id");

		jTextFieldidTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRefePerso = new JLabelMe();
		this.jLabelcodigoTipoRefePerso.setText(""+TipoRefePersoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRefePerso.setToolTipText("Codigo");
		this.jLabelcodigoTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRefePerso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRefePerso.setToolTipText(TipoRefePersoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRefePerso = new GridBagLayout();
		this.jPanelcodigoTipoRefePerso.setLayout(this.gridaBagLayoutTipoRefePerso);


		jTextFieldcodigoTipoRefePerso= new JTextFieldMe();

		jTextFieldcodigoTipoRefePerso.setEnabled(false);
		jTextFieldcodigoTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRefePersoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRefePersoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRefePersoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRefePersoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRefePersoBusqueda.setText("U");
		this.jButtoncodigoTipoRefePersoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRefePersoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRefePersoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRefePerso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRefePerso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRefePersoBusqueda"));

		if(this.tiporefepersoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRefePersoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRefePerso = new JLabelMe();
		this.jLabelnombreTipoRefePerso.setText(""+TipoRefePersoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRefePerso.setToolTipText("Nombre");
		this.jLabelnombreTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRefePerso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRefePerso.setToolTipText(TipoRefePersoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRefePerso = new GridBagLayout();
		this.jPanelnombreTipoRefePerso.setLayout(this.gridaBagLayoutTipoRefePerso);


		jTextAreanombreTipoRefePerso= new JTextAreaMe();
		jTextAreanombreTipoRefePerso.setEnabled(false);
		jTextAreanombreTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRefePerso.setLineWrap(true);
		jTextAreanombreTipoRefePerso.setWrapStyleWord(true);
		jTextAreanombreTipoRefePerso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRefePerso.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRefePerso = new JScrollPane(jTextAreanombreTipoRefePerso);
		jscrollPanenombreTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRefePersoBusqueda= new JButtonMe();
		this.jButtonnombreTipoRefePersoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRefePersoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRefePersoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRefePersoBusqueda.setText("U");
		this.jButtonnombreTipoRefePersoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRefePersoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRefePersoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRefePerso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRefePerso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRefePersoBusqueda"));

		if(this.tiporefepersoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRefePersoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRefePerso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoRefePerso = new TipoRefePersoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Refe Perso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRefePerso= new GridBagLayout();
		

		
		String sToolTipTipoRefePerso="";
		sToolTipTipoRefePerso=TipoRefePersoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRefePerso+="(Cartera.TipoRefePerso)";
		}
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRefePerso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRefePerso = new JButtonMe();
		this.jButtonModificarTipoRefePerso = new JButtonMe();
        this.jButtonActualizarTipoRefePerso = new JButtonMe();
        this.jButtonEliminarTipoRefePerso = new JButtonMe();
        this.jButtonCancelarTipoRefePerso = new JButtonMe();
        this.jButtonGuardarCambiosTipoRefePerso = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRefePerso = new JButtonMe();
		this.jButtonCerrarTipoRefePerso = new JButtonMe();
		
		this.jScrollPanelDatosTipoRefePerso = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRefePerso = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRefePerso = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Refe Perso";
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Refe Persos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRefePerso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRefePerso.setName("jPanelCamposTipoRefePerso"); 

		this.jPanelCamposOcultosTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRefePerso.setName("jPanelCamposOcultosTipoRefePerso"); 

        this.jPanelAccionesTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRefePerso.setToolTipText("Acciones");
        this.jPanelAccionesTipoRefePerso.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRefePerso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRefePerso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRefePerso.setText("Nuevo");
		this.jButtonModificarTipoRefePerso.setText("Editar");
        this.jButtonActualizarTipoRefePerso.setText("Actualizar");
        this.jButtonEliminarTipoRefePerso.setText("Eliminar");
        this.jButtonCancelarTipoRefePerso.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRefePerso.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRefePerso.setText("Guardar");
		this.jButtonCerrarTipoRefePerso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRefePerso,"nuevo_button","Nuevo",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRefePerso,"modificar_button","Editar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRefePerso,"actualizar_button","Actualizar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRefePerso,"eliminar_button","Eliminar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRefePerso,"cancelar_button","Cancelar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRefePerso,"guardarcambios_button","Guardar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRefePerso,"guardarcambiostabla_button","Guardar",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRefePerso,"cerrar_button","Salir",this.tiporefepersoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRefePerso.setToolTipText("Nuevo"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRefePerso.setToolTipText("Editar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRefePerso.setToolTipText("Actualizar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRefePerso.setToolTipText("Eliminar)"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRefePerso.setToolTipText("Cancelar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRefePerso.setToolTipText("Guardar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRefePerso.setToolTipText("Guardar"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRefePerso.setToolTipText("Salir"+" "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRefePerso";
		inputMap = this.jButtonNuevoTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRefePerso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRefePerso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRefePerso";
		inputMap = this.jButtonActualizarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRefePerso"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRefePerso";
		inputMap = this.jButtonEliminarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRefePerso"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRefePerso";
		inputMap = this.jButtonCancelarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRefePerso"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRefePerso";
		inputMap = this.jButtonCerrarTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRefePerso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRefePerso";
		inputMap = this.jButtonGuardarCambiosTablaTipoRefePerso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRefePerso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRefePerso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRefePerso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRefePerso.setToolTipText("Nuevo TipoRefePerso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRefePerso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRefePerso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRefePerso.setToolTipText("Sin Cerrar Ventana TipoRefePerso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRefePerso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRefePerso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRefePerso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRefePerso.setText("Accion");
		this.jComboBoxTiposAccionesTipoRefePerso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRefePerso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRefePerso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRefePerso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRefePerso = new JLabelMe();
		
		this.jLabelAccionesTipoRefePerso.setText("Acciones");		
		this.jLabelAccionesTipoRefePerso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRefePerso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRefePerso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRefePerso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRefePerso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRefePerso=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRefePerso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRefePerso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRefePerso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRefePerso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRefePerso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRefePerso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRefePerso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRefePerso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRefePerso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRefePerso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRefePerso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRefePerso = new GridBagLayout();
		
		this.jPanelCamposTipoRefePerso.setLayout(gridaBagLayoutCamposTipoRefePerso);
		this.jPanelCamposOcultosTipoRefePerso.setLayout(gridaBagLayoutCamposOcultosTipoRefePerso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRefePerso.gridy = 0;
	this.gridBagConstraintsTipoRefePerso.gridx = 0;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRefePerso.add(jLabelIdTipoRefePerso, this.gridBagConstraintsTipoRefePerso);



	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRefePerso.gridy = 0;
	this.gridBagConstraintsTipoRefePerso.gridx = 1;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRefePerso.add(jTextFieldidTipoRefePerso, this.gridBagConstraintsTipoRefePerso);


	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRefePerso.gridy = 0;
	this.gridBagConstraintsTipoRefePerso.gridx = 0;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRefePerso.add(jLabelcodigoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		//this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = 0;
		this.gridBagConstraintsTipoRefePerso.gridx = 2;
		this.gridBagConstraintsTipoRefePerso.ipadx = 0;
		this.gridBagConstraintsTipoRefePerso.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRefePerso.add(jButtoncodigoTipoRefePersoBusqueda, this.gridBagConstraintsTipoRefePerso);
	}

	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRefePerso.gridy = 0;
	this.gridBagConstraintsTipoRefePerso.gridx = 1;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRefePerso.add(jTextFieldcodigoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);


	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRefePerso.gridy = 0;
	this.gridBagConstraintsTipoRefePerso.gridx = 0;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRefePerso.add(jLabelnombreTipoRefePerso, this.gridBagConstraintsTipoRefePerso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		//this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRefePerso.gridy = 0;
		this.gridBagConstraintsTipoRefePerso.gridx = 2;
		this.gridBagConstraintsTipoRefePerso.ipadx = 0;
		this.gridBagConstraintsTipoRefePerso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRefePerso.add(jButtonnombreTipoRefePersoBusqueda, this.gridBagConstraintsTipoRefePerso);
	}

	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRefePerso.gridy = 0;
	this.gridBagConstraintsTipoRefePerso.gridx = 1;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRefePerso.add(jscrollPanenombreTipoRefePerso, this.gridBagConstraintsTipoRefePerso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRefePerso.gridy = iYPanelCamposTipoRefePerso;
	this.gridBagConstraintsTipoRefePerso.gridx = iXPanelCamposTipoRefePerso++;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRefePerso.add(this.jPanelidTipoRefePerso, this.gridBagConstraintsTipoRefePerso);



	if(iXPanelCamposTipoRefePerso % 1==0) {
		iXPanelCamposTipoRefePerso=0;
		iYPanelCamposTipoRefePerso++;
	}
	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRefePerso.gridy = iYPanelCamposTipoRefePerso;
	this.gridBagConstraintsTipoRefePerso.gridx = iXPanelCamposTipoRefePerso++;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRefePerso.add(this.jPanelcodigoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);



	if(iXPanelCamposTipoRefePerso % 1==0) {
		iXPanelCamposTipoRefePerso=0;
		iYPanelCamposTipoRefePerso++;
	}
	this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRefePerso.gridy = iYPanelCamposTipoRefePerso;
	this.gridBagConstraintsTipoRefePerso.gridx = iXPanelCamposTipoRefePerso++;
	this.gridBagConstraintsTipoRefePerso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRefePerso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRefePerso.add(this.jPanelnombreTipoRefePerso, this.gridBagConstraintsTipoRefePerso);



	if(iXPanelCamposTipoRefePerso % 1==0) {
		iXPanelCamposTipoRefePerso=0;
		iYPanelCamposTipoRefePerso++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRefePerso= new GridBagLayout();
		this.jPanelAccionesTipoRefePerso.setLayout(gridaBagLayoutAccionesTipoRefePerso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRefePerso= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRefePerso.setLayout(gridaBagLayoutAccionesFormularioTipoRefePerso);
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRefePerso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRefePerso.add(this.jComboBoxTiposAccionesFormularioTipoRefePerso, this.gridBagConstraintsTipoRefePerso);

		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRefePerso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRefePerso.add(this.jCheckBoxPostAccionNuevoTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRefePerso.add(this.jCheckBoxPostAccionSinCerrarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRefePerso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRefePerso.add(this.jCheckBoxPostAccionSinMensajeTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = 0;
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRefePerso.add(this.jButtonModificarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);							

		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRefePerso.gridy = 0;
		this.gridBagConstraintsTipoRefePerso.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRefePerso.add(this.jButtonEliminarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
			
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = 0;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRefePerso.add(this.jButtonActualizarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);


		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = 0;		
		this.gridBagConstraintsTipoRefePerso.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRefePerso.add(this.jButtonGuardarCambiosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);	
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = 0;		
		this.gridBagConstraintsTipoRefePerso.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRefePerso.add(this.jButtonCancelarTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRefePerso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRefePerso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();						
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRefePerso.gridx = 0;		
			//this.gridBagConstraintsTipoRefePerso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRefePerso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRefePerso.gridx =0;
		this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRefePerso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRefePerso = new TipoRefePersoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Refe Perso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Refe Perso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Refe Perso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRefePersoModel tiporefepersoModel=new TipoRefePersoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRefePersoModel.TipoRefePersoFocusTraversalPolicy tiporefepersoFocusTraversalPolicy = tiporefepersoModel.new TipoRefePersoFocusTraversalPolicy(this);
			
			//tiporefepersoFocusTraversalPolicy.settiporefepersoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporefepersoModel);
			
			
			this.jContentPaneDetalleTipoRefePerso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRefePerso = new GridBagLayout();	
			this.jContentPaneDetalleTipoRefePerso.setLayout(gridaBagLayoutDetalleTipoRefePerso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRefePerso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
				this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRefePerso.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRefePerso.add(jTtoolBarDetalleTipoRefePerso, gridBagConstraintsTipoRefePerso);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRefePerso=   new JScrollPane(jContentPaneDetalleTipoRefePerso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRefePerso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRefePerso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRefePerso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRefePerso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRefePerso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRefePerso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRefePerso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRefePerso.gridx = 0;
	        
			this.jContentPaneDetalleTipoRefePerso.add(jPanelCamposTipoRefePerso, gridBagConstraintsTipoRefePerso);
			
			
			
			
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
						&& tiporefepersoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(this.puedeCargarPorParteReferenciaPersonal,false,-1);
					
					if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRefePerso= new GridBagConstraints();
						this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRefePerso.gridx = 0;
						this.jContentPaneDetalleTipoRefePerso.add(this.jTabbedPaneRelacionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRefePerso.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRefePerso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
					this.gridBagConstraintsTipoRefePerso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRefePerso.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRefePerso.add(jPanelCamposOcultosTipoRefePerso, gridBagConstraintsTipoRefePerso);
				
					this.jPanelCamposOcultosTipoRefePerso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoRefePerso.gridx = 0;
	        this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRefePerso.add(this.jPanelAccionesFormularioTipoRefePerso, this.gridBagConstraintsTipoRefePerso);							
			
			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
	        this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoRefePerso.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRefePerso.add(this.jPanelAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRefePerso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRefePerso=   new JScrollPane(this.jPanelCamposTipoRefePerso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRefePerso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRefePerso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRefePerso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRefePerso.gridx = 0;
			this.gridBagConstraintsTipoRefePerso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRefePerso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRefePerso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRefePerso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRefePerso, this.gridBagConstraintsTipoRefePerso);			
			
			this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
			this.gridBagConstraintsTipoRefePerso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRefePerso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
			
			
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		
			
		this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
		this.gridBagConstraintsTipoRefePerso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRefePerso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRefePerso, this.gridBagConstraintsTipoRefePerso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRefePerso;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRefePerso;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		this.referenciapersonalSessionBean.setConGuardarRelaciones(false);
		this.referenciapersonalSessionBean.setEsGuardarRelacionado(true);

		this.referenciapersonalBeanSwingJInternalFrame=null;//new ReferenciaPersonalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciapersonalBeanSwingJInternalFramePopup=new ReferenciaPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciapersonalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {

				ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRefePersoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciapersonalSessionBean.setEsGuardarRelacionado(true);

				this.referenciapersonalBeanSwingJInternalFrame=new ReferenciaPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciapersonalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciapersonalBeanSwingJInternalFrame.setreferenciapersonalSessionBean(this.referenciapersonalSessionBean);

				//this.gridBagConstraintsTipoRefePerso = new GridBagConstraints();
				//this.gridBagConstraintsTipoRefePerso.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRefePerso.gridx = 0;
				//this.jContentPaneDetalleTipoRefePerso.add(this.referenciapersonalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRefePerso);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRefePerso.add("Referencia Personales",this.referenciapersonalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRefePerso.setComponentAt(iIndexTab,this.referenciapersonalBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciapersonalSessionBean.setEsGuardarRelacionado(false);
				this.referenciapersonalBeanSwingJInternalFrame=null;//new ReferenciaPersonalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaPersonal) {
					this.jTabbedPaneRelacionesTipoRefePerso.add("Referencia Personales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarReferenciaPersonalBeanSwingJInternalFrame(List<TipoRefePerso> tiporefepersos,TipoRefePerso tiporefeperso,ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciapersonalBeanSwingJInternalFrame=new ReferenciaPersonalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciapersonalBeanSwingJInternalFrame.getReferenciaPersonalLogic().setConnexion(this.tiporefepersoLogic.getConnexion());

					referenciapersonalBeanSwingJInternalFrame.settiporefepersosForeignKey(tiporefepersos);
					referenciapersonalBeanSwingJInternalFrame.settiporefepersoForeignKey(tiporefeperso);
					referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setisBusquedaDesdeForeignKeySesionTipoRefePerso(true);
					referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setlidTipoRefePersoActual(tiporefeperso.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciapersonalBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaPersonal(referenciapersonalBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciapersonalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRefePerso(true);
					referenciapersonalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciapersonalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRefePerso");
					referenciapersonalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRefePerso");
					referenciapersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaPersonal(true);
					referenciapersonalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaPersonal("n",referenciapersonalBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciapersonalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciapersonalBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciapersonalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciapersonalBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaPersonal("relacionado");
					} else {
						referenciapersonalBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaPersonal("no_relacionado");
					}

					referenciapersonalBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaPersonal().setVisible(false);

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
