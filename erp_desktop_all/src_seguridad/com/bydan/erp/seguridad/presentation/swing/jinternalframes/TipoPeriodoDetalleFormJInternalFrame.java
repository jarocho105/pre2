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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.TipoPeriodoConstantesFunciones;

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
public class TipoPeriodoDetalleFormJInternalFrame extends TipoPeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPeriodo;
	
	protected JMenuBar jmenuBarDetalleTipoPeriodo;
	
	protected JMenu jmenuDetalleTipoPeriodo;
	protected JMenu jmenuDetalleArchivoTipoPeriodo;
	protected JMenu jmenuDetalleAccionesTipoPeriodo;
	protected JMenu jmenuDetalleDatosTipoPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPeriodo;	
	protected GridBagConstraints gridBagConstraintsTipoPeriodo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPeriodoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPeriodo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPeriodoSessionBean tipoperiodoSessionBean;
	
	
	
		
	
	public TipoPeriodoLogic tipoperiodoLogic;
	
	public JScrollPane jScrollPanelDatosTipoPeriodo;
	public JScrollPane jScrollPanelDatosEdicionTipoPeriodo;
	public JScrollPane jScrollPanelDatosGeneralTipoPeriodo;
	
	protected JPanel jPanelCamposTipoPeriodo;    
	protected JPanel jPanelCamposOcultosTipoPeriodo;    	
	protected JPanel jPanelAccionesTipoPeriodo;
	protected JPanel jPanelAccionesFormularioTipoPeriodo;
    
	
	
	protected Integer iXPanelCamposTipoPeriodo=0;
	protected Integer iYPanelCamposTipoPeriodo=0;
	
	protected Integer iXPanelCamposOcultosTipoPeriodo=0;
	protected Integer iYPanelCamposOcultosTipoPeriodo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPeriodo;
	public JButton jButtonModificarTipoPeriodo;
	public JButton jButtonActualizarTipoPeriodo;
    public JButton jButtonEliminarTipoPeriodo;
	public JButton jButtonCancelarTipoPeriodo;
    public JButton jButtonGuardarCambiosTipoPeriodo;
	public JButton jButtonGuardarCambiosTablaTipoPeriodo;
	protected JButton jButtonCerrarTipoPeriodo;
	
	
	protected JButton jButtonProcesarInformacionTipoPeriodo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPeriodo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPeriodo;
	protected JButton jButtonModificarToolBarTipoPeriodo;
	protected JButton jButtonActualizarToolBarTipoPeriodo;
    protected JButton jButtonEliminarToolBarTipoPeriodo;
	protected JButton jButtonCancelarToolBarTipoPeriodo;
    protected JButton jButtonGuardarCambiosToolBarTipoPeriodo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPeriodo;
	protected JButton jButtonCerrarToolBarTipoPeriodo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPeriodo;
	protected JMenuItem jMenuItemModificarTipoPeriodo;
	protected JMenuItem jMenuItemActualizarTipoPeriodo;
    protected JMenuItem jMenuItemEliminarTipoPeriodo;
	protected JMenuItem jMenuItemCancelarTipoPeriodo;
    protected JMenuItem jMenuItemGuardarCambiosTipoPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPeriodo;
	protected JMenuItem jMenuItemCerrarTipoPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarTipoPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPeriodo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarTipoPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPeriodo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPeriodo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPeriodo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPeriodo;
	public JLabel jLabelIdTipoPeriodo;
	public JTextFieldMe jTextFieldidTipoPeriodo;
	public JButton jButtonidTipoPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPeriodo;
	public JLabel jLabelcodigoTipoPeriodo;
	public JTextField jTextFieldcodigoTipoPeriodo;
	public JButton jButtoncodigoTipoPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPeriodo;
	public JLabel jLabelnombreTipoPeriodo;
	public JTextArea jTextAreanombreTipoPeriodo;
	public JScrollPane jscrollPanenombreTipoPeriodo;
	public JButton jButtonnombreTipoPeriodoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPeriodo;
	
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
	
	public TipoPeriodoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPeriodo=new JPanel();
				this.jPanelAccionesFormularioTipoPeriodo=new JPanel();
				this.jmenuBarDetalleTipoPeriodo=new JMenuBar();
				this.jTtoolBarDetalleTipoPeriodo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPeriodoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPeriodoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPeriodo() {
		return this.jButtonActualizarToolBarTipoPeriodo;
	}
	
	public JButton getjButtonEliminarToolBarTipoPeriodo() {
		return this.jButtonEliminarToolBarTipoPeriodo;
	}
	
	public JButton getjButtonCancelarToolBarTipoPeriodo() {
		return this.jButtonCancelarToolBarTipoPeriodo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPeriodo() {
		return this.jButtonProcesarInformacionTipoPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPeriodo)	{
		this.jButtonProcesarInformacionTipoPeriodo = jButtonProcesarInformacionTipoPeriodo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPeriodo() {
		return this.jComboBoxTiposAccionesTipoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPeriodo(
			JComboBox jComboBoxTiposRelacionesTipoPeriodo) {
		this.jComboBoxTiposRelacionesTipoPeriodo = jComboBoxTiposRelacionesTipoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPeriodo(
			JComboBox jComboBoxTiposAccionesTipoPeriodo) {
		this.jComboBoxTiposAccionesTipoPeriodo = jComboBoxTiposAccionesTipoPeriodo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPeriodo() {
		return this.jComboBoxTiposAccionesFormularioTipoPeriodo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPeriodo(
			JComboBox jComboBoxTiposAccionesFormularioTipoPeriodo) {
		this.jComboBoxTiposAccionesFormularioTipoPeriodo = jComboBoxTiposAccionesFormularioTipoPeriodo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoperiodoSessionBean=new TipoPeriodoSessionBean();
		
		this.tipoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoperiodoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPeriodo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPeriodo=new JButtonMe();
				this.jButtonModificarToolBarTipoPeriodo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPeriodo,this.jTtoolBarDetalleTipoPeriodo,
							"actualizar","actualizar","Actualizar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPeriodo,this.jTtoolBarDetalleTipoPeriodo,
							"eliminar","eliminar","Eliminar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPeriodo,this.jTtoolBarDetalleTipoPeriodo,
							"cancelar","cancelar","Cancelar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPeriodo,this.jTtoolBarDetalleTipoPeriodo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPeriodo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPeriodo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPeriodo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPeriodo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPeriodo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPeriodo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPeriodo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPeriodo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPeriodo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPeriodo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPeriodo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPeriodo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPeriodo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPeriodo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPeriodo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPeriodo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPeriodo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPeriodo.add(this.jMenuItemDetalleCerrarTipoPeriodo);
		
		this.jmenuDetalleAccionesTipoPeriodo.add(this.jMenuItemActualizarTipoPeriodo);
		this.jmenuDetalleAccionesTipoPeriodo.add(this.jMenuItemEliminarTipoPeriodo);
		this.jmenuDetalleAccionesTipoPeriodo.add(this.jMenuItemCancelarTipoPeriodo);		
		
		//this.jmenuDetalleDatosTipoPeriodo.add(this.jMenuItemDetalleAbrirOrderByTipoPeriodo);				
		this.jmenuDetalleDatosTipoPeriodo.add(this.jMenuItemDetalleMostarOcultarTipoPeriodo);				
				
		//this.jmenuDetalleAccionesTipoPeriodo.add(this.jMenuItemGuardarCambiosTipoPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPeriodo.add(this.jmenuDetalleArchivoTipoPeriodo);		
		this.jmenuBarDetalleTipoPeriodo.add(this.jmenuDetalleAccionesTipoPeriodo);		
		this.jmenuBarDetalleTipoPeriodo.add(this.jmenuDetalleDatosTipoPeriodo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPeriodo);				
	}
	
	
	public void inicializarElementosCamposTipoPeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPeriodo = new JLabelMe();
		jLabelIdTipoPeriodo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPeriodo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPeriodo.setToolTipText(TipoPeriodoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPeriodo= new GridBagLayout();

		this.jPanelidTipoPeriodo.setLayout(this.gridaBagLayoutTipoPeriodo);

		jTextFieldidTipoPeriodo = new JTextFieldMe();
		jTextFieldidTipoPeriodo.setText("Id");

		jTextFieldidTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPeriodo = new JLabelMe();
		this.jLabelcodigoTipoPeriodo.setText(""+TipoPeriodoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPeriodo.setToolTipText("Codigo");
		this.jLabelcodigoTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPeriodo.setToolTipText(TipoPeriodoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPeriodo = new GridBagLayout();
		this.jPanelcodigoTipoPeriodo.setLayout(this.gridaBagLayoutTipoPeriodo);


		jTextFieldcodigoTipoPeriodo= new JTextFieldMe();

		jTextFieldcodigoTipoPeriodo.setEnabled(false);
		jTextFieldcodigoTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPeriodoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPeriodoBusqueda.setText("U");
		this.jButtoncodigoTipoPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPeriodoBusqueda"));

		if(this.tipoperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPeriodoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPeriodo = new JLabelMe();
		this.jLabelnombreTipoPeriodo.setText(""+TipoPeriodoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPeriodo.setToolTipText("Nombre");
		this.jLabelnombreTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPeriodo.setToolTipText(TipoPeriodoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPeriodo = new GridBagLayout();
		this.jPanelnombreTipoPeriodo.setLayout(this.gridaBagLayoutTipoPeriodo);


		jTextAreanombreTipoPeriodo= new JTextAreaMe();
		jTextAreanombreTipoPeriodo.setEnabled(false);
		jTextAreanombreTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPeriodo.setLineWrap(true);
		jTextAreanombreTipoPeriodo.setWrapStyleWord(true);
		jTextAreanombreTipoPeriodo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPeriodo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPeriodo = new JScrollPane(jTextAreanombreTipoPeriodo);
		jscrollPanenombreTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPeriodoBusqueda= new JButtonMe();
		this.jButtonnombreTipoPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPeriodoBusqueda.setText("U");
		this.jButtonnombreTipoPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPeriodoBusqueda"));

		if(this.tipoperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPeriodoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPeriodo() {
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
		//this.jInternalFrameDetalleTipoPeriodo = new TipoPeriodoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Periodo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPeriodo= new GridBagLayout();
		

		
		String sToolTipTipoPeriodo="";
		sToolTipTipoPeriodo=TipoPeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPeriodo+="(Seguridad.TipoPeriodo)";
		}
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPeriodo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPeriodo = new JButtonMe();
		this.jButtonModificarTipoPeriodo = new JButtonMe();
        this.jButtonActualizarTipoPeriodo = new JButtonMe();
        this.jButtonEliminarTipoPeriodo = new JButtonMe();
        this.jButtonCancelarTipoPeriodo = new JButtonMe();
        this.jButtonGuardarCambiosTipoPeriodo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPeriodo = new JButtonMe();
		this.jButtonCerrarTipoPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosTipoPeriodo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPeriodo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPeriodo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Periodo";
		
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPeriodo.setName("jPanelCamposTipoPeriodo"); 

		this.jPanelCamposOcultosTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPeriodo.setName("jPanelCamposOcultosTipoPeriodo"); 

        this.jPanelAccionesTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesTipoPeriodo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPeriodo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPeriodo.setText("Nuevo");
		this.jButtonModificarTipoPeriodo.setText("Editar");
        this.jButtonActualizarTipoPeriodo.setText("Actualizar");
        this.jButtonEliminarTipoPeriodo.setText("Eliminar");
        this.jButtonCancelarTipoPeriodo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPeriodo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPeriodo.setText("Guardar");
		this.jButtonCerrarTipoPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPeriodo,"nuevo_button","Nuevo",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPeriodo,"modificar_button","Editar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPeriodo,"actualizar_button","Actualizar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPeriodo,"eliminar_button","Eliminar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPeriodo,"cancelar_button","Cancelar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPeriodo,"guardarcambios_button","Guardar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPeriodo,"guardarcambiostabla_button","Guardar",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPeriodo,"cerrar_button","Salir",this.tipoperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPeriodo.setToolTipText("Nuevo"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPeriodo.setToolTipText("Editar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPeriodo.setToolTipText("Actualizar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPeriodo.setToolTipText("Eliminar)"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPeriodo.setToolTipText("Cancelar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPeriodo.setToolTipText("Guardar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPeriodo.setToolTipText("Guardar"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPeriodo.setToolTipText("Salir"+" "+TipoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPeriodo";
		inputMap = this.jButtonNuevoTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPeriodo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPeriodo";
		inputMap = this.jButtonActualizarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPeriodo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPeriodo";
		inputMap = this.jButtonEliminarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPeriodo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPeriodo";
		inputMap = this.jButtonCancelarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPeriodo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPeriodo";
		inputMap = this.jButtonCerrarTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaTipoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPeriodo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPeriodo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPeriodo.setToolTipText("Nuevo TipoPeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPeriodo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPeriodo.setToolTipText("Sin Cerrar Ventana TipoPeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPeriodo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPeriodo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesTipoPeriodo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPeriodo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPeriodo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPeriodo = new JLabelMe();
		
		this.jLabelAccionesTipoPeriodo.setText("Acciones");		
		this.jLabelAccionesTipoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPeriodo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPeriodo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPeriodo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPeriodo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPeriodo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPeriodo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPeriodo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPeriodo = new GridBagLayout();
		
		this.jPanelCamposTipoPeriodo.setLayout(gridaBagLayoutCamposTipoPeriodo);
		this.jPanelCamposOcultosTipoPeriodo.setLayout(gridaBagLayoutCamposOcultosTipoPeriodo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPeriodo.gridy = 0;
	this.gridBagConstraintsTipoPeriodo.gridx = 0;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPeriodo.add(jLabelIdTipoPeriodo, this.gridBagConstraintsTipoPeriodo);



	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPeriodo.gridy = 0;
	this.gridBagConstraintsTipoPeriodo.gridx = 1;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPeriodo.add(jTextFieldidTipoPeriodo, this.gridBagConstraintsTipoPeriodo);


	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPeriodo.gridy = 0;
	this.gridBagConstraintsTipoPeriodo.gridx = 0;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPeriodo.add(jLabelcodigoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = 0;
		this.gridBagConstraintsTipoPeriodo.gridx = 2;
		this.gridBagConstraintsTipoPeriodo.ipadx = 0;
		this.gridBagConstraintsTipoPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPeriodo.add(jButtoncodigoTipoPeriodoBusqueda, this.gridBagConstraintsTipoPeriodo);
	}

	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPeriodo.gridy = 0;
	this.gridBagConstraintsTipoPeriodo.gridx = 1;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPeriodo.add(jTextFieldcodigoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);


	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPeriodo.gridy = 0;
	this.gridBagConstraintsTipoPeriodo.gridx = 0;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPeriodo.add(jLabelnombreTipoPeriodo, this.gridBagConstraintsTipoPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPeriodo.gridy = 0;
		this.gridBagConstraintsTipoPeriodo.gridx = 2;
		this.gridBagConstraintsTipoPeriodo.ipadx = 0;
		this.gridBagConstraintsTipoPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPeriodo.add(jButtonnombreTipoPeriodoBusqueda, this.gridBagConstraintsTipoPeriodo);
	}

	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPeriodo.gridy = 0;
	this.gridBagConstraintsTipoPeriodo.gridx = 1;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPeriodo.add(jscrollPanenombreTipoPeriodo, this.gridBagConstraintsTipoPeriodo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPeriodo.gridy = iYPanelCamposTipoPeriodo;
	this.gridBagConstraintsTipoPeriodo.gridx = iXPanelCamposTipoPeriodo++;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPeriodo.add(this.jPanelidTipoPeriodo, this.gridBagConstraintsTipoPeriodo);



	if(iXPanelCamposTipoPeriodo % 1==0) {
		iXPanelCamposTipoPeriodo=0;
		iYPanelCamposTipoPeriodo++;
	}
	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPeriodo.gridy = iYPanelCamposTipoPeriodo;
	this.gridBagConstraintsTipoPeriodo.gridx = iXPanelCamposTipoPeriodo++;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPeriodo.add(this.jPanelcodigoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);



	if(iXPanelCamposTipoPeriodo % 1==0) {
		iXPanelCamposTipoPeriodo=0;
		iYPanelCamposTipoPeriodo++;
	}
	this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPeriodo.gridy = iYPanelCamposTipoPeriodo;
	this.gridBagConstraintsTipoPeriodo.gridx = iXPanelCamposTipoPeriodo++;
	this.gridBagConstraintsTipoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPeriodo.add(this.jPanelnombreTipoPeriodo, this.gridBagConstraintsTipoPeriodo);



	if(iXPanelCamposTipoPeriodo % 1==0) {
		iXPanelCamposTipoPeriodo=0;
		iYPanelCamposTipoPeriodo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPeriodo= new GridBagLayout();
		this.jPanelAccionesTipoPeriodo.setLayout(gridaBagLayoutAccionesTipoPeriodo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPeriodo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPeriodo.setLayout(gridaBagLayoutAccionesFormularioTipoPeriodo);
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPeriodo.add(this.jComboBoxTiposAccionesFormularioTipoPeriodo, this.gridBagConstraintsTipoPeriodo);

		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPeriodo.add(this.jCheckBoxPostAccionNuevoTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPeriodo.add(this.jCheckBoxPostAccionSinCerrarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoperiodoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPeriodo.add(this.jCheckBoxPostAccionSinMensajeTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = 0;
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPeriodo.add(this.jButtonModificarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);							

		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPeriodo.gridy = 0;
		this.gridBagConstraintsTipoPeriodo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPeriodo.add(this.jButtonEliminarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
			
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = 0;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPeriodo.add(this.jButtonActualizarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);


		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = 0;		
		this.gridBagConstraintsTipoPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPeriodo.add(this.jButtonGuardarCambiosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);	
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = 0;		
		this.gridBagConstraintsTipoPeriodo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPeriodo.add(this.jButtonCancelarTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPeriodo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPeriodo.gridx = 0;		
			//this.gridBagConstraintsTipoPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPeriodo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPeriodo.gridx =0;
		this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPeriodoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPeriodo = new TipoPeriodoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Periodo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Periodo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Periodo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPeriodoModel tipoperiodoModel=new TipoPeriodoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPeriodoModel.TipoPeriodoFocusTraversalPolicy tipoperiodoFocusTraversalPolicy = tipoperiodoModel.new TipoPeriodoFocusTraversalPolicy(this);
			
			//tipoperiodoFocusTraversalPolicy.settipoperiodoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoperiodoModel);
			
			
			this.jContentPaneDetalleTipoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPeriodo = new GridBagLayout();	
			this.jContentPaneDetalleTipoPeriodo.setLayout(gridaBagLayoutDetalleTipoPeriodo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPeriodo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
				this.gridBagConstraintsTipoPeriodo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPeriodo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPeriodo.add(jTtoolBarDetalleTipoPeriodo, gridBagConstraintsTipoPeriodo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPeriodo=   new JScrollPane(jContentPaneDetalleTipoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPeriodo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPeriodo.gridx = 0;
	        
			this.jContentPaneDetalleTipoPeriodo.add(jPanelCamposTipoPeriodo, gridBagConstraintsTipoPeriodo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoperiodoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoperiodoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPeriodo= new GridBagConstraints();
						this.gridBagConstraintsTipoPeriodo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPeriodo.gridx = 0;
						this.jContentPaneDetalleTipoPeriodo.add(this.jTabbedPaneRelacionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPeriodo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPeriodo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
					this.gridBagConstraintsTipoPeriodo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPeriodo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPeriodo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPeriodo.add(jPanelCamposOcultosTipoPeriodo, gridBagConstraintsTipoPeriodo);
				
					this.jPanelCamposOcultosTipoPeriodo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoPeriodo.gridx = 0;
	        this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPeriodo.add(this.jPanelAccionesFormularioTipoPeriodo, this.gridBagConstraintsTipoPeriodo);							
			
			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
	        this.gridBagConstraintsTipoPeriodo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoPeriodo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPeriodo.add(this.jPanelAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPeriodo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPeriodo=   new JScrollPane(this.jPanelCamposTipoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPeriodo.gridx = 0;
			this.gridBagConstraintsTipoPeriodo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPeriodo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPeriodo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPeriodo, this.gridBagConstraintsTipoPeriodo);			
			
			this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsTipoPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
			
			
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		
			
		this.gridBagConstraintsTipoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsTipoPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPeriodo, this.gridBagConstraintsTipoPeriodo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPeriodo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPeriodo;
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
