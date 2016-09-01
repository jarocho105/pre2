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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoBienConstantesFunciones;

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
public class TipoBienDetalleFormJInternalFrame extends TipoBienBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoBien;
	
	protected JMenuBar jmenuBarDetalleTipoBien;
	
	protected JMenu jmenuDetalleTipoBien;
	protected JMenu jmenuDetalleArchivoTipoBien;
	protected JMenu jmenuDetalleAccionesTipoBien;
	protected JMenu jmenuDetalleDatosTipoBien;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBien;	
	protected GridBagConstraints gridBagConstraintsTipoBien;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoBienBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoBien;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBienSessionBean tipobienSessionBean;
	
	

	public BienBeanSwingJInternalFrame bienBeanSwingJInternalFrame=null;
	public BienBeanSwingJInternalFrame bienBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBien=false;
	public BienSessionBean bienSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoBienLogic tipobienLogic;
	
	public JScrollPane jScrollPanelDatosTipoBien;
	public JScrollPane jScrollPanelDatosEdicionTipoBien;
	public JScrollPane jScrollPanelDatosGeneralTipoBien;
	
	protected JPanel jPanelCamposTipoBien;    
	protected JPanel jPanelCamposOcultosTipoBien;    	
	protected JPanel jPanelAccionesTipoBien;
	protected JPanel jPanelAccionesFormularioTipoBien;
    
	
	
	protected Integer iXPanelCamposTipoBien=0;
	protected Integer iYPanelCamposTipoBien=0;
	
	protected Integer iXPanelCamposOcultosTipoBien=0;
	protected Integer iYPanelCamposOcultosTipoBien=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoBien;
	public JButton jButtonModificarTipoBien;
	public JButton jButtonActualizarTipoBien;
    public JButton jButtonEliminarTipoBien;
	public JButton jButtonCancelarTipoBien;
    public JButton jButtonGuardarCambiosTipoBien;
	public JButton jButtonGuardarCambiosTablaTipoBien;
	protected JButton jButtonCerrarTipoBien;
	
	
	protected JButton jButtonProcesarInformacionTipoBien;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoBien;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoBien;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoBien;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBien;
	protected JButton jButtonModificarToolBarTipoBien;
	protected JButton jButtonActualizarToolBarTipoBien;
    protected JButton jButtonEliminarToolBarTipoBien;
	protected JButton jButtonCancelarToolBarTipoBien;
    protected JButton jButtonGuardarCambiosToolBarTipoBien;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoBien;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBien;
	protected JButton jButtonCerrarToolBarTipoBien;
	
	protected JButton jButtonProcesarInformacionToolBarTipoBien;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBien;
	protected JMenuItem jMenuItemModificarTipoBien;
	protected JMenuItem jMenuItemActualizarTipoBien;
    protected JMenuItem jMenuItemEliminarTipoBien;
	protected JMenuItem jMenuItemCancelarTipoBien;
    protected JMenuItem jMenuItemGuardarCambiosTipoBien;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBien;
	protected JMenuItem jMenuItemCerrarTipoBien;
	protected JMenuItem jMenuItemDetalleCerrarTipoBien;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBien;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoBien;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBien;
	protected JMenuItem jMenuItemMostrarOcultarTipoBien;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBien;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBien;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoBien;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoBien;
	public JLabel jLabelIdTipoBien;
	public JLabel jLabelidTipoBien;
	public JButton jButtonidTipoBienBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoBien;
	public JLabel jLabelcodigoTipoBien;
	public JTextField jTextFieldcodigoTipoBien;
	public JButton jButtoncodigoTipoBienBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoBien;
	public JLabel jLabelnombreTipoBien;
	public JTextArea jTextAreanombreTipoBien;
	public JScrollPane jscrollPanenombreTipoBien;
	public JButton jButtonnombreTipoBienBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoBien;
	public JLabel jLabelid_empresaTipoBien;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoBien;
	public JButton jButtonid_empresaTipoBien= new JButtonMe();
	public JButton jButtonid_empresaTipoBienUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoBienBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoBien;
	
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
	
	public TipoBienDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoBien=new JPanel();
				this.jPanelAccionesFormularioTipoBien=new JPanel();
				this.jmenuBarDetalleTipoBien=new JMenuBar();
				this.jTtoolBarDetalleTipoBien=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoBienDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoBien() {
		return this.jButtonActualizarToolBarTipoBien;
	}
	
	public JButton getjButtonEliminarToolBarTipoBien() {
		return this.jButtonEliminarToolBarTipoBien;
	}
	
	public JButton getjButtonCancelarToolBarTipoBien() {
		return this.jButtonCancelarToolBarTipoBien;
	}		
	
	public JButton getjButtonProcesarInformacionTipoBien() {
		return this.jButtonProcesarInformacionTipoBien;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBien)	{
		this.jButtonProcesarInformacionTipoBien = jButtonProcesarInformacionTipoBien;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBien() {
		return this.jComboBoxTiposAccionesTipoBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBien(
			JComboBox jComboBoxTiposRelacionesTipoBien) {
		this.jComboBoxTiposRelacionesTipoBien = jComboBoxTiposRelacionesTipoBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBien(
			JComboBox jComboBoxTiposAccionesTipoBien) {
		this.jComboBoxTiposAccionesTipoBien = jComboBoxTiposAccionesTipoBien;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoBien() {
		return this.jComboBoxTiposAccionesFormularioTipoBien;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoBien(
			JComboBox jComboBoxTiposAccionesFormularioTipoBien) {
		this.jComboBoxTiposAccionesFormularioTipoBien = jComboBoxTiposAccionesFormularioTipoBien;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipobienSessionBean=new TipoBienSessionBean();
		
		this.tipobienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobienSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bienSessionBean=new BienSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBienJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Bien MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoBienJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoBien= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoBien=new JButtonMe();
				this.jButtonModificarToolBarTipoBien=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoBien,this.jTtoolBarDetalleTipoBien,
							"actualizar","actualizar","Actualizar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoBien,this.jTtoolBarDetalleTipoBien,
							"eliminar","eliminar","Eliminar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoBien,this.jTtoolBarDetalleTipoBien,
							"cancelar","cancelar","Cancelar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoBien,this.jTtoolBarDetalleTipoBien,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoBien=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoBien=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoBien=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoBien=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoBien=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBien= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBien.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBien,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoBien= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoBien.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoBien,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoBien= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoBien.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoBien,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoBien= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoBien.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoBien,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoBien= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoBien.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoBien,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoBien= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBien.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBien,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBien= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBien.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBien,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoBien= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoBien.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoBien,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBien,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBien,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoBien.add(this.jMenuItemDetalleCerrarTipoBien);
		
		this.jmenuDetalleAccionesTipoBien.add(this.jMenuItemActualizarTipoBien);
		this.jmenuDetalleAccionesTipoBien.add(this.jMenuItemEliminarTipoBien);
		this.jmenuDetalleAccionesTipoBien.add(this.jMenuItemCancelarTipoBien);		
		
		//this.jmenuDetalleDatosTipoBien.add(this.jMenuItemDetalleAbrirOrderByTipoBien);				
		this.jmenuDetalleDatosTipoBien.add(this.jMenuItemDetalleMostarOcultarTipoBien);				
				
		//this.jmenuDetalleAccionesTipoBien.add(this.jMenuItemGuardarCambiosTipoBien);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoBien.add(this.jmenuDetalleArchivoTipoBien);		
		this.jmenuBarDetalleTipoBien.add(this.jmenuDetalleAccionesTipoBien);		
		this.jmenuBarDetalleTipoBien.add(this.jmenuDetalleDatosTipoBien);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoBien.add(this.jmenuDetalleTipoBien);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoBien);				
	}
	
	
	public void inicializarElementosCamposTipoBien() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoBien = new JLabelMe();
		jLabelIdTipoBien.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoBien = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoBien.setToolTipText(TipoBienConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoBien= new GridBagLayout();

		this.jPanelidTipoBien.setLayout(this.gridaBagLayoutTipoBien);

		jLabelidTipoBien = new JLabel();
		jLabelidTipoBien.setText("Id");

		jLabelidTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoBien = new JLabelMe();
		this.jLabelcodigoTipoBien.setText(""+TipoBienConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoBien.setToolTipText("Codigo");
		this.jLabelcodigoTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoBien.setToolTipText(TipoBienConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoBien = new GridBagLayout();
		this.jPanelcodigoTipoBien.setLayout(this.gridaBagLayoutTipoBien);


		jTextFieldcodigoTipoBien= new JTextFieldMe();

		jTextFieldcodigoTipoBien.setEnabled(false);
		jTextFieldcodigoTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoBienBusqueda= new JButtonMe();
		this.jButtoncodigoTipoBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoBienBusqueda.setText("U");
		this.jButtoncodigoTipoBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoBienBusqueda"));

		if(this.tipobienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoBienBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoBien = new JLabelMe();
		this.jLabelnombreTipoBien.setText(""+TipoBienConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoBien.setToolTipText("Nombre");
		this.jLabelnombreTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoBien.setToolTipText(TipoBienConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoBien = new GridBagLayout();
		this.jPanelnombreTipoBien.setLayout(this.gridaBagLayoutTipoBien);


		jTextAreanombreTipoBien= new JTextAreaMe();
		jTextAreanombreTipoBien.setEnabled(false);
		jTextAreanombreTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBien.setLineWrap(true);
		jTextAreanombreTipoBien.setWrapStyleWord(true);
		jTextAreanombreTipoBien.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoBien.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoBien = new JScrollPane(jTextAreanombreTipoBien);
		jscrollPanenombreTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoBienBusqueda= new JButtonMe();
		this.jButtonnombreTipoBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoBienBusqueda.setText("U");
		this.jButtonnombreTipoBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoBienBusqueda"));

		if(this.tipobienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoBienBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoBien() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoBien = new JLabelMe();
		this.jLabelid_empresaTipoBien.setText(""+TipoBienConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoBien.setToolTipText("Empresa");
		this.jLabelid_empresaTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoBien.setToolTipText(TipoBienConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoBien = new GridBagLayout();
		this.jPanelid_empresaTipoBien.setLayout(this.gridaBagLayoutTipoBien);


		jComboBoxid_empresaTipoBien= new JComboBoxMe();
		jComboBoxid_empresaTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoBien.setEnabled(false);

		this.jButtonid_empresaTipoBien= new JButtonMe();
		this.jButtonid_empresaTipoBien.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBien.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBien.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBien.setText("Buscar");
		this.jButtonid_empresaTipoBien.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoBien.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBien,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBien"));

		this.jButtonid_empresaTipoBienBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBienBusqueda.setText("U");
		this.jButtonid_empresaTipoBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBienBusqueda"));

		if(this.tipobienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoBienBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoBienUpdate= new JButtonMe();
		this.jButtonid_empresaTipoBienUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBienUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBienUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBienUpdate.setText("U");
		this.jButtonid_empresaTipoBienUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoBienUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBienUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBienUpdate"));



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
		//this.jInternalFrameDetalleTipoBien = new TipoBienBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Bien DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBien= new GridBagLayout();
		

		
		String sToolTipTipoBien="";
		sToolTipTipoBien=TipoBienConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBien+="(Cartera.TipoBien)";
		}
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBien+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoBien = new JButtonMe();
		this.jButtonModificarTipoBien = new JButtonMe();
        this.jButtonActualizarTipoBien = new JButtonMe();
        this.jButtonEliminarTipoBien = new JButtonMe();
        this.jButtonCancelarTipoBien = new JButtonMe();
        this.jButtonGuardarCambiosTipoBien = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoBien = new JButtonMe();
		this.jButtonCerrarTipoBien = new JButtonMe();
		
		this.jScrollPanelDatosTipoBien = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoBien = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoBien = new JScrollPane();
				
		
		
		this.jPanelCamposTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Bien";
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bienes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBien.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoBien.setName("jPanelCamposTipoBien"); 

		this.jPanelCamposOcultosTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoBien.setName("jPanelCamposOcultosTipoBien"); 

        this.jPanelAccionesTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBien.setToolTipText("Acciones");
        this.jPanelAccionesTipoBien.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoBien.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoBien.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoBien.setText("Nuevo");
		this.jButtonModificarTipoBien.setText("Editar");
        this.jButtonActualizarTipoBien.setText("Actualizar");
        this.jButtonEliminarTipoBien.setText("Eliminar");
        this.jButtonCancelarTipoBien.setText("Cancelar");
        this.jButtonGuardarCambiosTipoBien.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoBien.setText("Guardar");
		this.jButtonCerrarTipoBien.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBien,"nuevo_button","Nuevo",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoBien,"modificar_button","Editar",this.tipobienSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoBien,"actualizar_button","Actualizar",this.tipobienSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoBien,"eliminar_button","Eliminar",this.tipobienSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoBien,"cancelar_button","Cancelar",this.tipobienSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoBien,"guardarcambios_button","Guardar",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBien,"guardarcambiostabla_button","Guardar",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBien,"cerrar_button","Salir",this.tipobienSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoBien.setToolTipText("Nuevo"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoBien.setToolTipText("Editar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoBien.setToolTipText("Actualizar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoBien.setToolTipText("Eliminar)"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoBien.setToolTipText("Cancelar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoBien.setToolTipText("Guardar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoBien.setToolTipText("Guardar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBien.setToolTipText("Salir"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBien";
		inputMap = this.jButtonNuevoTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBien"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoBien";
		inputMap = this.jButtonActualizarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoBien"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoBien";
		inputMap = this.jButtonEliminarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoBien"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoBien";
		inputMap = this.jButtonCancelarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoBien"));
		
		//CERRAR		
		sMapKey = "CerrarTipoBien";
		inputMap = this.jButtonCerrarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBien"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBien";
		inputMap = this.jButtonGuardarCambiosTablaTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBien"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoBien = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoBien.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoBien.setToolTipText("Nuevo TipoBien");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoBien = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoBien.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoBien.setToolTipText("Sin Cerrar Ventana TipoBien");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoBien = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoBien.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoBien.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBien.setText("Accion");
		this.jComboBoxTiposAccionesTipoBien.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoBien.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoBien.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoBien = new JLabelMe();
		
		this.jLabelAccionesTipoBien.setText("Acciones");		
		this.jLabelAccionesTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoBien();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoBien();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoBien=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoBien,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoBien.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBien.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBien.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoBien = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoBien = new GridBagLayout();
		
		this.jPanelCamposTipoBien.setLayout(gridaBagLayoutCamposTipoBien);
		this.jPanelCamposOcultosTipoBien.setLayout(gridaBagLayoutCamposOcultosTipoBien);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 0;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoBien.add(jLabelIdTipoBien, this.gridBagConstraintsTipoBien);



	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 1;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoBien.add(jLabelidTipoBien, this.gridBagConstraintsTipoBien);


	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 0;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoBien.add(jLabelid_empresaTipoBien, this.gridBagConstraintsTipoBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		//this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx = 2;
		this.gridBagConstraintsTipoBien.ipadx = 0;
		this.gridBagConstraintsTipoBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBien.add(jButtonid_empresaTipoBienBusqueda, this.gridBagConstraintsTipoBien);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		//this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx = 3;
		this.gridBagConstraintsTipoBien.ipadx = 0;
		this.gridBagConstraintsTipoBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBien.add(jButtonid_empresaTipoBienUpdate, this.gridBagConstraintsTipoBien);
	}

	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 1;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoBien.add(jComboBoxid_empresaTipoBien, this.gridBagConstraintsTipoBien);


	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 0;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoBien.add(jLabelcodigoTipoBien, this.gridBagConstraintsTipoBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		//this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx = 2;
		this.gridBagConstraintsTipoBien.ipadx = 0;
		this.gridBagConstraintsTipoBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoBien.add(jButtoncodigoTipoBienBusqueda, this.gridBagConstraintsTipoBien);
	}

	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 1;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoBien.add(jTextFieldcodigoTipoBien, this.gridBagConstraintsTipoBien);


	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 0;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoBien.add(jLabelnombreTipoBien, this.gridBagConstraintsTipoBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		//this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx = 2;
		this.gridBagConstraintsTipoBien.ipadx = 0;
		this.gridBagConstraintsTipoBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoBien.add(jButtonnombreTipoBienBusqueda, this.gridBagConstraintsTipoBien);
	}

	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBien.gridy = 0;
	this.gridBagConstraintsTipoBien.gridx = 1;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoBien.add(jscrollPanenombreTipoBien, this.gridBagConstraintsTipoBien);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBien.gridy = iYPanelCamposTipoBien;
	this.gridBagConstraintsTipoBien.gridx = iXPanelCamposTipoBien++;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBien.add(this.jPanelidTipoBien, this.gridBagConstraintsTipoBien);



	if(iXPanelCamposTipoBien % 1==0) {
		iXPanelCamposTipoBien=0;
		iYPanelCamposTipoBien++;
	}
	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBien.gridy = iYPanelCamposTipoBien;
	this.gridBagConstraintsTipoBien.gridx = iXPanelCamposTipoBien++;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBien.add(this.jPanelcodigoTipoBien, this.gridBagConstraintsTipoBien);



	if(iXPanelCamposTipoBien % 1==0) {
		iXPanelCamposTipoBien=0;
		iYPanelCamposTipoBien++;
	}
	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBien.gridy = iYPanelCamposTipoBien;
	this.gridBagConstraintsTipoBien.gridx = iXPanelCamposTipoBien++;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBien.add(this.jPanelnombreTipoBien, this.gridBagConstraintsTipoBien);



	if(iXPanelCamposTipoBien % 1==0) {
		iXPanelCamposTipoBien=0;
		iYPanelCamposTipoBien++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoBien = new GridBagConstraints();
	this.gridBagConstraintsTipoBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBien.gridy = iYPanelCamposOcultosTipoBien;
	this.gridBagConstraintsTipoBien.gridx = iXPanelCamposOcultosTipoBien++;
	this.gridBagConstraintsTipoBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoBien.add(this.jPanelid_empresaTipoBien, this.gridBagConstraintsTipoBien);



	if(iXPanelCamposOcultosTipoBien % 1==0) {
		iXPanelCamposOcultosTipoBien=0;
		iYPanelCamposOcultosTipoBien++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoBien= new GridBagLayout();
		this.jPanelAccionesTipoBien.setLayout(gridaBagLayoutAccionesTipoBien);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoBien= new GridBagLayout();
		this.jPanelAccionesFormularioTipoBien.setLayout(gridaBagLayoutAccionesFormularioTipoBien);
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBien.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBien.add(this.jComboBoxTiposAccionesFormularioTipoBien, this.gridBagConstraintsTipoBien);

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBien.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBien.add(this.jCheckBoxPostAccionNuevoTipoBien, this.gridBagConstraintsTipoBien);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBien.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBien.add(this.jCheckBoxPostAccionSinCerrarTipoBien, this.gridBagConstraintsTipoBien);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipobienSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBien.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBien.add(this.jCheckBoxPostAccionSinMensajeTipoBien, this.gridBagConstraintsTipoBien);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoBien.add(this.jButtonModificarTipoBien, this.gridBagConstraintsTipoBien);							

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoBien.add(this.jButtonEliminarTipoBien, this.gridBagConstraintsTipoBien);
		
			
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = 0;		
		this.gridBagConstraintsTipoBien.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBien.add(this.jButtonActualizarTipoBien, this.gridBagConstraintsTipoBien);


		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = 0;		
		this.gridBagConstraintsTipoBien.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBien.add(this.jButtonGuardarCambiosTipoBien, this.gridBagConstraintsTipoBien);	
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = 0;		
		this.gridBagConstraintsTipoBien.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoBien.add(this.jButtonCancelarTipoBien, this.gridBagConstraintsTipoBien);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBien = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBien);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBien = new GridBagConstraints();						
			this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBien.gridx = 0;		
			//this.gridBagConstraintsTipoBien.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBien.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBien.gridx =0;
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBien.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBien, this.gridBagConstraintsTipoBien);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoBienJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoBien = new TipoBienBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Bien DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Bien DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Bien Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoBienModel tipobienModel=new TipoBienModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoBienModel.TipoBienFocusTraversalPolicy tipobienFocusTraversalPolicy = tipobienModel.new TipoBienFocusTraversalPolicy(this);
			
			//tipobienFocusTraversalPolicy.settipobienJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipobienModel);
			
			
			this.jContentPaneDetalleTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoBien = new GridBagLayout();	
			this.jContentPaneDetalleTipoBien.setLayout(gridaBagLayoutDetalleTipoBien);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBien = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoBien = new GridBagConstraints();
				this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoBien.gridx = 0;
					
				
				this.jContentPaneDetalleTipoBien.add(jTtoolBarDetalleTipoBien, gridBagConstraintsTipoBien);								
				
}
			
			this.jScrollPanelDatosEdicionTipoBien=   new JScrollPane(jContentPaneDetalleTipoBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoBien=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoBien.gridx = 0;
	        
			this.jContentPaneDetalleTipoBien.add(jPanelCamposTipoBien, gridBagConstraintsTipoBien);
			
			
			
			
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
						&& tipobienSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBien(this.puedeCargarPorParteBien,false,-1);
					
					if(this.tipobienSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoBien= new GridBagConstraints();
						this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoBien.gridx = 0;
						this.jContentPaneDetalleTipoBien.add(this.jTabbedPaneRelacionesTipoBien, this.gridBagConstraintsTipoBien);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoBien.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBien(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoBien.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoBien = new GridBagConstraints();
					this.gridBagConstraintsTipoBien.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoBien.gridx = 0;
					
				
					this.jContentPaneDetalleTipoBien.add(jPanelCamposOcultosTipoBien, gridBagConstraintsTipoBien);
				
					this.jPanelCamposOcultosTipoBien.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoBien.gridx = 0;
	        this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoBien.add(this.jPanelAccionesFormularioTipoBien, this.gridBagConstraintsTipoBien);							
			
			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
	        this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoBien.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoBien.add(this.jPanelAccionesTipoBien, this.gridBagConstraintsTipoBien);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoBien);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoBien=   new JScrollPane(this.jPanelCamposTipoBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoBien.gridx = 0;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoBien.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoBien, this.gridBagConstraintsTipoBien);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBien.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoBien, this.gridBagConstraintsTipoBien);			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBien.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoBien, this.gridBagConstraintsTipoBien);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBien, this.gridBagConstraintsTipoBien);
			
			
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBien, this.gridBagConstraintsTipoBien);
		
			
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBien, this.gridBagConstraintsTipoBien);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoBien;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoBien;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBien(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bienSessionBean=new BienSessionBean();
		this.bienSessionBean.setConGuardarRelaciones(false);
		this.bienSessionBean.setEsGuardarRelacionado(true);

		this.bienBeanSwingJInternalFrame=null;//new BienBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bienBeanSwingJInternalFramePopup=new BienBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bienBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bienSessionBean.getEsGuardarRelacionado()) {

				BienJInternalFrame.STIPO_TAMANIO_GENERAL=TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL;
				BienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bienSessionBean.setEsGuardarRelacionado(true);

				this.bienBeanSwingJInternalFrame=new BienBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bienBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bienBeanSwingJInternalFrame.setbienSessionBean(this.bienSessionBean);

				//this.gridBagConstraintsTipoBien = new GridBagConstraints();
				//this.gridBagConstraintsTipoBien.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoBien.gridx = 0;
				//this.jContentPaneDetalleTipoBien.add(this.bienBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoBien);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoBien.add("Bienes",this.bienBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoBien.setComponentAt(iIndexTab,this.bienBeanSwingJInternalFrame.getContentPane());
				}

				//BienJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bienSessionBean.setEsGuardarRelacionado(false);
				this.bienBeanSwingJInternalFrame=null;//new BienBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bienSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBien) {
					this.jTabbedPaneRelacionesTipoBien.add("Bienes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBienBeanSwingJInternalFrame(List<TipoBien> tipobiens,TipoBien tipobien,BienBeanSwingJInternalFrame bienBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bienBeanSwingJInternalFrame=new BienBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bienBeanSwingJInternalFrame.getBienLogic().setConnexion(this.tipobienLogic.getConnexion());

					bienBeanSwingJInternalFrame.settipobiensForeignKey(tipobiens);
					bienBeanSwingJInternalFrame.settipobienForeignKey(tipobien);
					bienBeanSwingJInternalFrame.bienSessionBean.setisBusquedaDesdeForeignKeySesionTipoBien(true);
					bienBeanSwingJInternalFrame.bienSessionBean.setlidTipoBienActual(tipobien.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bienBeanSwingJInternalFrame.cargarCombosForeignKeyBien(bienBeanSwingJInternalFrame.isCargarCombosDependencia);
					bienBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoBien(true);
					bienBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bienBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoBien");
					bienBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoBien");
					bienBeanSwingJInternalFrame.inicializarActualizarBindingTablaBien(true);
					bienBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBien("n",bienBeanSwingJInternalFrame.isGuardarCambiosEnLote, bienBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bienBeanSwingJInternalFrame.setAutoscrolls(true);
					bienBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bienBeanSwingJInternalFrame.actualizarEstadoPanelsBien("relacionado");
					} else {
						bienBeanSwingJInternalFrame.actualizarEstadoPanelsBien("no_relacionado");
					}

					bienBeanSwingJInternalFrame.getjButtonRecargarInformacionBien().setVisible(false);

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
