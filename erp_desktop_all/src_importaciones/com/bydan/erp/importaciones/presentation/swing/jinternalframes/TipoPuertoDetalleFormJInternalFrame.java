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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoPuertoConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoPuertoDetalleFormJInternalFrame extends TipoPuertoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPuerto;
	
	protected JMenuBar jmenuBarDetalleTipoPuerto;
	
	protected JMenu jmenuDetalleTipoPuerto;
	protected JMenu jmenuDetalleArchivoTipoPuerto;
	protected JMenu jmenuDetalleAccionesTipoPuerto;
	protected JMenu jmenuDetalleDatosTipoPuerto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPuerto;	
	protected GridBagConstraints gridBagConstraintsTipoPuerto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPuertoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPuerto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPuertoSessionBean tipopuertoSessionBean;
	
	
	
		
	
	public TipoPuertoLogic tipopuertoLogic;
	
	public JScrollPane jScrollPanelDatosTipoPuerto;
	public JScrollPane jScrollPanelDatosEdicionTipoPuerto;
	public JScrollPane jScrollPanelDatosGeneralTipoPuerto;
	
	protected JPanel jPanelCamposTipoPuerto;    
	protected JPanel jPanelCamposOcultosTipoPuerto;    	
	protected JPanel jPanelAccionesTipoPuerto;
	protected JPanel jPanelAccionesFormularioTipoPuerto;
    
	
	
	protected Integer iXPanelCamposTipoPuerto=0;
	protected Integer iYPanelCamposTipoPuerto=0;
	
	protected Integer iXPanelCamposOcultosTipoPuerto=0;
	protected Integer iYPanelCamposOcultosTipoPuerto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPuerto;
	public JButton jButtonModificarTipoPuerto;
	public JButton jButtonActualizarTipoPuerto;
    public JButton jButtonEliminarTipoPuerto;
	public JButton jButtonCancelarTipoPuerto;
    public JButton jButtonGuardarCambiosTipoPuerto;
	public JButton jButtonGuardarCambiosTablaTipoPuerto;
	protected JButton jButtonCerrarTipoPuerto;
	
	
	protected JButton jButtonProcesarInformacionTipoPuerto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPuerto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPuerto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPuerto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPuerto;
	protected JButton jButtonModificarToolBarTipoPuerto;
	protected JButton jButtonActualizarToolBarTipoPuerto;
    protected JButton jButtonEliminarToolBarTipoPuerto;
	protected JButton jButtonCancelarToolBarTipoPuerto;
    protected JButton jButtonGuardarCambiosToolBarTipoPuerto;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPuerto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPuerto;
	protected JButton jButtonCerrarToolBarTipoPuerto;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPuerto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPuerto;
	protected JMenuItem jMenuItemModificarTipoPuerto;
	protected JMenuItem jMenuItemActualizarTipoPuerto;
    protected JMenuItem jMenuItemEliminarTipoPuerto;
	protected JMenuItem jMenuItemCancelarTipoPuerto;
    protected JMenuItem jMenuItemGuardarCambiosTipoPuerto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPuerto;
	protected JMenuItem jMenuItemCerrarTipoPuerto;
	protected JMenuItem jMenuItemDetalleCerrarTipoPuerto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPuerto;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPuerto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPuerto;
	protected JMenuItem jMenuItemMostrarOcultarTipoPuerto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPuerto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPuerto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPuerto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPuerto;
	public JLabel jLabelIdTipoPuerto;
	public JTextFieldMe jTextFieldidTipoPuerto;
	public JButton jButtonidTipoPuertoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPuerto;
	public JLabel jLabelcodigoTipoPuerto;
	public JTextField jTextFieldcodigoTipoPuerto;
	public JButton jButtoncodigoTipoPuertoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPuerto;
	public JLabel jLabelnombreTipoPuerto;
	public JTextArea jTextAreanombreTipoPuerto;
	public JScrollPane jscrollPanenombreTipoPuerto;
	public JButton jButtonnombreTipoPuertoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPuerto;
	
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
	
	public TipoPuertoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPuerto=new JPanel();
				this.jPanelAccionesFormularioTipoPuerto=new JPanel();
				this.jmenuBarDetalleTipoPuerto=new JMenuBar();
				this.jTtoolBarDetalleTipoPuerto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPuertoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPuerto() {
		return this.jButtonActualizarToolBarTipoPuerto;
	}
	
	public JButton getjButtonEliminarToolBarTipoPuerto() {
		return this.jButtonEliminarToolBarTipoPuerto;
	}
	
	public JButton getjButtonCancelarToolBarTipoPuerto() {
		return this.jButtonCancelarToolBarTipoPuerto;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPuerto() {
		return this.jButtonProcesarInformacionTipoPuerto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPuerto)	{
		this.jButtonProcesarInformacionTipoPuerto = jButtonProcesarInformacionTipoPuerto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPuerto() {
		return this.jComboBoxTiposAccionesTipoPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPuerto(
			JComboBox jComboBoxTiposRelacionesTipoPuerto) {
		this.jComboBoxTiposRelacionesTipoPuerto = jComboBoxTiposRelacionesTipoPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPuerto(
			JComboBox jComboBoxTiposAccionesTipoPuerto) {
		this.jComboBoxTiposAccionesTipoPuerto = jComboBoxTiposAccionesTipoPuerto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPuerto() {
		return this.jComboBoxTiposAccionesFormularioTipoPuerto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPuerto(
			JComboBox jComboBoxTiposAccionesFormularioTipoPuerto) {
		this.jComboBoxTiposAccionesFormularioTipoPuerto = jComboBoxTiposAccionesFormularioTipoPuerto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipopuertoSessionBean=new TipoPuertoSessionBean();
		
		this.tipopuertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopuertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopuertoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPuertoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPuertoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPuertoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Puerto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPuertoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPuerto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPuerto=new JButtonMe();
				this.jButtonModificarToolBarTipoPuerto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPuerto,this.jTtoolBarDetalleTipoPuerto,
							"actualizar","actualizar","Actualizar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPuerto,this.jTtoolBarDetalleTipoPuerto,
							"eliminar","eliminar","Eliminar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPuerto,this.jTtoolBarDetalleTipoPuerto,
							"cancelar","cancelar","Cancelar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPuerto,this.jTtoolBarDetalleTipoPuerto,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPuerto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPuerto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPuerto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPuerto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPuerto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPuerto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPuerto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPuerto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPuerto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPuerto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPuerto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPuerto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPuerto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPuerto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPuerto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPuerto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPuerto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPuerto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPuerto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPuerto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPuerto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPuerto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPuerto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPuerto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPuerto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPuerto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPuerto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPuerto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPuerto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPuerto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPuerto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPuerto.add(this.jMenuItemDetalleCerrarTipoPuerto);
		
		this.jmenuDetalleAccionesTipoPuerto.add(this.jMenuItemActualizarTipoPuerto);
		this.jmenuDetalleAccionesTipoPuerto.add(this.jMenuItemEliminarTipoPuerto);
		this.jmenuDetalleAccionesTipoPuerto.add(this.jMenuItemCancelarTipoPuerto);		
		
		//this.jmenuDetalleDatosTipoPuerto.add(this.jMenuItemDetalleAbrirOrderByTipoPuerto);				
		this.jmenuDetalleDatosTipoPuerto.add(this.jMenuItemDetalleMostarOcultarTipoPuerto);				
				
		//this.jmenuDetalleAccionesTipoPuerto.add(this.jMenuItemGuardarCambiosTipoPuerto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPuerto.add(this.jmenuDetalleArchivoTipoPuerto);		
		this.jmenuBarDetalleTipoPuerto.add(this.jmenuDetalleAccionesTipoPuerto);		
		this.jmenuBarDetalleTipoPuerto.add(this.jmenuDetalleDatosTipoPuerto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPuerto);				
	}
	
	
	public void inicializarElementosCamposTipoPuerto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPuerto = new JLabelMe();
		jLabelIdTipoPuerto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPuerto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPuerto.setToolTipText(TipoPuertoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPuerto= new GridBagLayout();

		this.jPanelidTipoPuerto.setLayout(this.gridaBagLayoutTipoPuerto);

		jTextFieldidTipoPuerto = new JTextFieldMe();
		jTextFieldidTipoPuerto.setText("Id");

		jTextFieldidTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPuerto = new JLabelMe();
		this.jLabelcodigoTipoPuerto.setText(""+TipoPuertoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPuerto.setToolTipText("Codigo");
		this.jLabelcodigoTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPuerto.setToolTipText(TipoPuertoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPuerto = new GridBagLayout();
		this.jPanelcodigoTipoPuerto.setLayout(this.gridaBagLayoutTipoPuerto);


		jTextFieldcodigoTipoPuerto= new JTextFieldMe();

		jTextFieldcodigoTipoPuerto.setEnabled(false);
		jTextFieldcodigoTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPuertoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPuertoBusqueda.setText("U");
		this.jButtoncodigoTipoPuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPuertoBusqueda"));

		if(this.tipopuertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPuertoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPuerto = new JLabelMe();
		this.jLabelnombreTipoPuerto.setText(""+TipoPuertoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPuerto.setToolTipText("Nombre");
		this.jLabelnombreTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPuerto.setToolTipText(TipoPuertoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPuerto = new GridBagLayout();
		this.jPanelnombreTipoPuerto.setLayout(this.gridaBagLayoutTipoPuerto);


		jTextAreanombreTipoPuerto= new JTextAreaMe();
		jTextAreanombreTipoPuerto.setEnabled(false);
		jTextAreanombreTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPuerto.setLineWrap(true);
		jTextAreanombreTipoPuerto.setWrapStyleWord(true);
		jTextAreanombreTipoPuerto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPuerto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPuerto = new JScrollPane(jTextAreanombreTipoPuerto);
		jscrollPanenombreTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPuertoBusqueda= new JButtonMe();
		this.jButtonnombreTipoPuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPuertoBusqueda.setText("U");
		this.jButtonnombreTipoPuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPuertoBusqueda"));

		if(this.tipopuertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPuertoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPuerto() {
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
		//this.jInternalFrameDetalleTipoPuerto = new TipoPuertoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Puerto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPuerto= new GridBagLayout();
		

		
		String sToolTipTipoPuerto="";
		sToolTipTipoPuerto=TipoPuertoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPuerto+="(Importaciones.TipoPuerto)";
		}
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPuerto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPuerto = new JButtonMe();
		this.jButtonModificarTipoPuerto = new JButtonMe();
        this.jButtonActualizarTipoPuerto = new JButtonMe();
        this.jButtonEliminarTipoPuerto = new JButtonMe();
        this.jButtonCancelarTipoPuerto = new JButtonMe();
        this.jButtonGuardarCambiosTipoPuerto = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPuerto = new JButtonMe();
		this.jButtonCerrarTipoPuerto = new JButtonMe();
		
		this.jScrollPanelDatosTipoPuerto = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPuerto = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPuerto = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Puerto";
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Puertos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPuerto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPuerto.setName("jPanelCamposTipoPuerto"); 

		this.jPanelCamposOcultosTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPuerto.setName("jPanelCamposOcultosTipoPuerto"); 

        this.jPanelAccionesTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPuerto.setToolTipText("Acciones");
        this.jPanelAccionesTipoPuerto.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPuerto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPuerto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPuerto.setText("Nuevo");
		this.jButtonModificarTipoPuerto.setText("Editar");
        this.jButtonActualizarTipoPuerto.setText("Actualizar");
        this.jButtonEliminarTipoPuerto.setText("Eliminar");
        this.jButtonCancelarTipoPuerto.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPuerto.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPuerto.setText("Guardar");
		this.jButtonCerrarTipoPuerto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPuerto,"nuevo_button","Nuevo",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPuerto,"modificar_button","Editar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPuerto,"actualizar_button","Actualizar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPuerto,"eliminar_button","Eliminar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPuerto,"cancelar_button","Cancelar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPuerto,"guardarcambios_button","Guardar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPuerto,"guardarcambiostabla_button","Guardar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPuerto,"cerrar_button","Salir",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPuerto.setToolTipText("Nuevo"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPuerto.setToolTipText("Editar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPuerto.setToolTipText("Actualizar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPuerto.setToolTipText("Eliminar)"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPuerto.setToolTipText("Cancelar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPuerto.setToolTipText("Guardar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPuerto.setToolTipText("Guardar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPuerto.setToolTipText("Salir"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPuerto";
		inputMap = this.jButtonNuevoTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPuerto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPuerto";
		inputMap = this.jButtonActualizarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPuerto"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPuerto";
		inputMap = this.jButtonEliminarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPuerto"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPuerto";
		inputMap = this.jButtonCancelarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPuerto"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPuerto";
		inputMap = this.jButtonCerrarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPuerto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPuerto";
		inputMap = this.jButtonGuardarCambiosTablaTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPuerto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPuerto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPuerto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPuerto.setToolTipText("Nuevo TipoPuerto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPuerto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPuerto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPuerto.setToolTipText("Sin Cerrar Ventana TipoPuerto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPuerto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPuerto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPuerto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPuerto.setText("Accion");
		this.jComboBoxTiposAccionesTipoPuerto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPuerto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPuerto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPuerto = new JLabelMe();
		
		this.jLabelAccionesTipoPuerto.setText("Acciones");		
		this.jLabelAccionesTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPuerto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPuerto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPuerto=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPuerto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPuerto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPuerto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPuerto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPuerto = new GridBagLayout();
		
		this.jPanelCamposTipoPuerto.setLayout(gridaBagLayoutCamposTipoPuerto);
		this.jPanelCamposOcultosTipoPuerto.setLayout(gridaBagLayoutCamposOcultosTipoPuerto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPuerto.gridy = 0;
	this.gridBagConstraintsTipoPuerto.gridx = 0;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPuerto.add(jLabelIdTipoPuerto, this.gridBagConstraintsTipoPuerto);



	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPuerto.gridy = 0;
	this.gridBagConstraintsTipoPuerto.gridx = 1;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPuerto.add(jTextFieldidTipoPuerto, this.gridBagConstraintsTipoPuerto);


	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPuerto.gridy = 0;
	this.gridBagConstraintsTipoPuerto.gridx = 0;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPuerto.add(jLabelcodigoTipoPuerto, this.gridBagConstraintsTipoPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		//this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = 0;
		this.gridBagConstraintsTipoPuerto.gridx = 2;
		this.gridBagConstraintsTipoPuerto.ipadx = 0;
		this.gridBagConstraintsTipoPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPuerto.add(jButtoncodigoTipoPuertoBusqueda, this.gridBagConstraintsTipoPuerto);
	}

	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPuerto.gridy = 0;
	this.gridBagConstraintsTipoPuerto.gridx = 1;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPuerto.add(jTextFieldcodigoTipoPuerto, this.gridBagConstraintsTipoPuerto);


	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPuerto.gridy = 0;
	this.gridBagConstraintsTipoPuerto.gridx = 0;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPuerto.add(jLabelnombreTipoPuerto, this.gridBagConstraintsTipoPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		//this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = 0;
		this.gridBagConstraintsTipoPuerto.gridx = 2;
		this.gridBagConstraintsTipoPuerto.ipadx = 0;
		this.gridBagConstraintsTipoPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPuerto.add(jButtonnombreTipoPuertoBusqueda, this.gridBagConstraintsTipoPuerto);
	}

	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPuerto.gridy = 0;
	this.gridBagConstraintsTipoPuerto.gridx = 1;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPuerto.add(jscrollPanenombreTipoPuerto, this.gridBagConstraintsTipoPuerto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPuerto.gridy = iYPanelCamposTipoPuerto;
	this.gridBagConstraintsTipoPuerto.gridx = iXPanelCamposTipoPuerto++;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPuerto.add(this.jPanelidTipoPuerto, this.gridBagConstraintsTipoPuerto);



	if(iXPanelCamposTipoPuerto % 1==0) {
		iXPanelCamposTipoPuerto=0;
		iYPanelCamposTipoPuerto++;
	}
	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPuerto.gridy = iYPanelCamposTipoPuerto;
	this.gridBagConstraintsTipoPuerto.gridx = iXPanelCamposTipoPuerto++;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPuerto.add(this.jPanelcodigoTipoPuerto, this.gridBagConstraintsTipoPuerto);



	if(iXPanelCamposTipoPuerto % 1==0) {
		iXPanelCamposTipoPuerto=0;
		iYPanelCamposTipoPuerto++;
	}
	this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPuerto.gridy = iYPanelCamposTipoPuerto;
	this.gridBagConstraintsTipoPuerto.gridx = iXPanelCamposTipoPuerto++;
	this.gridBagConstraintsTipoPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPuerto.add(this.jPanelnombreTipoPuerto, this.gridBagConstraintsTipoPuerto);



	if(iXPanelCamposTipoPuerto % 1==0) {
		iXPanelCamposTipoPuerto=0;
		iYPanelCamposTipoPuerto++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPuerto= new GridBagLayout();
		this.jPanelAccionesTipoPuerto.setLayout(gridaBagLayoutAccionesTipoPuerto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPuerto= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPuerto.setLayout(gridaBagLayoutAccionesFormularioTipoPuerto);
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPuerto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPuerto.add(this.jComboBoxTiposAccionesFormularioTipoPuerto, this.gridBagConstraintsTipoPuerto);

		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPuerto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPuerto.add(this.jCheckBoxPostAccionNuevoTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipopuertoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPuerto.add(this.jCheckBoxPostAccionSinCerrarTipoPuerto, this.gridBagConstraintsTipoPuerto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipopuertoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPuerto.add(this.jCheckBoxPostAccionSinMensajeTipoPuerto, this.gridBagConstraintsTipoPuerto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = 0;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPuerto.add(this.jButtonModificarTipoPuerto, this.gridBagConstraintsTipoPuerto);							

		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = 0;
		this.gridBagConstraintsTipoPuerto.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPuerto.add(this.jButtonEliminarTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
			
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = 0;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPuerto.add(this.jButtonActualizarTipoPuerto, this.gridBagConstraintsTipoPuerto);


		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = 0;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPuerto.add(this.jButtonGuardarCambiosTipoPuerto, this.gridBagConstraintsTipoPuerto);	
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = 0;		
		this.gridBagConstraintsTipoPuerto.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPuerto.add(this.jButtonCancelarTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPuerto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPuerto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();						
			this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPuerto.gridx = 0;		
			//this.gridBagConstraintsTipoPuerto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPuerto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPuerto.gridx =0;
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPuerto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPuerto, this.gridBagConstraintsTipoPuerto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPuerto = new TipoPuertoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Puerto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Puerto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Puerto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPuertoModel tipopuertoModel=new TipoPuertoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPuertoModel.TipoPuertoFocusTraversalPolicy tipopuertoFocusTraversalPolicy = tipopuertoModel.new TipoPuertoFocusTraversalPolicy(this);
			
			//tipopuertoFocusTraversalPolicy.settipopuertoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipopuertoModel);
			
			
			this.jContentPaneDetalleTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPuerto = new GridBagLayout();	
			this.jContentPaneDetalleTipoPuerto.setLayout(gridaBagLayoutDetalleTipoPuerto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPuerto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
				this.gridBagConstraintsTipoPuerto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPuerto.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPuerto.add(jTtoolBarDetalleTipoPuerto, gridBagConstraintsTipoPuerto);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPuerto=   new JScrollPane(jContentPaneDetalleTipoPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPuerto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPuerto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPuerto.gridx = 0;
	        
			this.jContentPaneDetalleTipoPuerto.add(jPanelCamposTipoPuerto, gridBagConstraintsTipoPuerto);
			
			
			
			
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
						&& tipopuertoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPuerto= new GridBagConstraints();
						this.gridBagConstraintsTipoPuerto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPuerto.gridx = 0;
						this.jContentPaneDetalleTipoPuerto.add(this.jTabbedPaneRelacionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPuerto.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPuerto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
					this.gridBagConstraintsTipoPuerto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPuerto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPuerto.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPuerto.add(jPanelCamposOcultosTipoPuerto, gridBagConstraintsTipoPuerto);
				
					this.jPanelCamposOcultosTipoPuerto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoPuerto.gridx = 0;
	        this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPuerto.add(this.jPanelAccionesFormularioTipoPuerto, this.gridBagConstraintsTipoPuerto);							
			
			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
	        this.gridBagConstraintsTipoPuerto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoPuerto.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPuerto.add(this.jPanelAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPuerto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPuerto=   new JScrollPane(this.jPanelCamposTipoPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPuerto.gridx = 0;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPuerto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPuerto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPuerto, this.gridBagConstraintsTipoPuerto);			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPuerto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
			
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
			
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPuerto;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPuerto;
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
