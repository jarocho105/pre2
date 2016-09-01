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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.ColorGeneralConstantesFunciones;

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
public class ColorGeneralDetalleFormJInternalFrame extends ColorGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleColorGeneral;
	
	protected JMenuBar jmenuBarDetalleColorGeneral;
	
	protected JMenu jmenuDetalleColorGeneral;
	protected JMenu jmenuDetalleArchivoColorGeneral;
	protected JMenu jmenuDetalleAccionesColorGeneral;
	protected JMenu jmenuDetalleDatosColorGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutColorGeneral;	
	protected GridBagConstraints gridBagConstraintsColorGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ColorGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleColorGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ColorGeneralSessionBean colorgeneralSessionBean;
	
	
	
		
	
	public ColorGeneralLogic colorgeneralLogic;
	
	public JScrollPane jScrollPanelDatosColorGeneral;
	public JScrollPane jScrollPanelDatosEdicionColorGeneral;
	public JScrollPane jScrollPanelDatosGeneralColorGeneral;
	
	protected JPanel jPanelCamposColorGeneral;    
	protected JPanel jPanelCamposOcultosColorGeneral;    	
	protected JPanel jPanelAccionesColorGeneral;
	protected JPanel jPanelAccionesFormularioColorGeneral;
    
	
	
	protected Integer iXPanelCamposColorGeneral=0;
	protected Integer iYPanelCamposColorGeneral=0;
	
	protected Integer iXPanelCamposOcultosColorGeneral=0;
	protected Integer iYPanelCamposOcultosColorGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoColorGeneral;
	public JButton jButtonModificarColorGeneral;
	public JButton jButtonActualizarColorGeneral;
    public JButton jButtonEliminarColorGeneral;
	public JButton jButtonCancelarColorGeneral;
    public JButton jButtonGuardarCambiosColorGeneral;
	public JButton jButtonGuardarCambiosTablaColorGeneral;
	protected JButton jButtonCerrarColorGeneral;
	
	
	protected JButton jButtonProcesarInformacionColorGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoColorGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarColorGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeColorGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarColorGeneral;
	protected JButton jButtonModificarToolBarColorGeneral;
	protected JButton jButtonActualizarToolBarColorGeneral;
    protected JButton jButtonEliminarToolBarColorGeneral;
	protected JButton jButtonCancelarToolBarColorGeneral;
    protected JButton jButtonGuardarCambiosToolBarColorGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarColorGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarColorGeneral;
	protected JButton jButtonCerrarToolBarColorGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarColorGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoColorGeneral;
	protected JMenuItem jMenuItemModificarColorGeneral;
	protected JMenuItem jMenuItemActualizarColorGeneral;
    protected JMenuItem jMenuItemEliminarColorGeneral;
	protected JMenuItem jMenuItemCancelarColorGeneral;
    protected JMenuItem jMenuItemGuardarCambiosColorGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaColorGeneral;
	protected JMenuItem jMenuItemCerrarColorGeneral;
	protected JMenuItem jMenuItemDetalleCerrarColorGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarColorGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionColorGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosColorGeneral;
	protected JMenuItem jMenuItemMostrarOcultarColorGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesColorGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesColorGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesColorGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioColorGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidColorGeneral;
	public JLabel jLabelIdColorGeneral;
	public JTextFieldMe jTextFieldidColorGeneral;
	public JButton jButtonidColorGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnombreColorGeneral;
	public JLabel jLabelnombreColorGeneral;
	public JTextField jTextFieldnombreColorGeneral;
	public JButton jButtonnombreColorGeneralBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesColorGeneral;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ColorGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposColorGeneral=new JPanel();
				this.jPanelAccionesFormularioColorGeneral=new JPanel();
				this.jmenuBarDetalleColorGeneral=new JMenuBar();
				this.jTtoolBarDetalleColorGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ColorGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarColorGeneral() {
		return this.jButtonActualizarToolBarColorGeneral;
	}
	
	public JButton getjButtonEliminarToolBarColorGeneral() {
		return this.jButtonEliminarToolBarColorGeneral;
	}
	
	public JButton getjButtonCancelarToolBarColorGeneral() {
		return this.jButtonCancelarToolBarColorGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionColorGeneral() {
		return this.jButtonProcesarInformacionColorGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionColorGeneral)	{
		this.jButtonProcesarInformacionColorGeneral = jButtonProcesarInformacionColorGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesColorGeneral() {
		return this.jComboBoxTiposAccionesColorGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesColorGeneral(
			JComboBox jComboBoxTiposRelacionesColorGeneral) {
		this.jComboBoxTiposRelacionesColorGeneral = jComboBoxTiposRelacionesColorGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesColorGeneral(
			JComboBox jComboBoxTiposAccionesColorGeneral) {
		this.jComboBoxTiposAccionesColorGeneral = jComboBoxTiposAccionesColorGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioColorGeneral() {
		return this.jComboBoxTiposAccionesFormularioColorGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioColorGeneral(
			JComboBox jComboBoxTiposAccionesFormularioColorGeneral) {
		this.jComboBoxTiposAccionesFormularioColorGeneral = jComboBoxTiposAccionesFormularioColorGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.colorgeneralSessionBean=new ColorGeneralSessionBean();
		
		this.colorgeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.colorgeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.colorgeneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ColorGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ColorGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ColorGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Color MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
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
	
		ColorGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleColorGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarColorGeneral=new JButtonMe();
				this.jButtonModificarToolBarColorGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarColorGeneral,this.jTtoolBarDetalleColorGeneral,
							"actualizar","actualizar","Actualizar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarColorGeneral,this.jTtoolBarDetalleColorGeneral,
							"eliminar","eliminar","Eliminar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarColorGeneral,this.jTtoolBarDetalleColorGeneral,
							"cancelar","cancelar","Cancelar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarColorGeneral,this.jTtoolBarDetalleColorGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleColorGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleColorGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoColorGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesColorGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosColorGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoColorGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoColorGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoColorGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarColorGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarColorGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarColorGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarColorGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarColorGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarColorGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarColorGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarColorGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarColorGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarColorGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarColorGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarColorGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosColorGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosColorGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosColorGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarColorGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarColorGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarColorGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarColorGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarColorGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarColorGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarColorGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarColorGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarColorGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarColorGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarColorGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarColorGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoColorGeneral.add(this.jMenuItemDetalleCerrarColorGeneral);
		
		this.jmenuDetalleAccionesColorGeneral.add(this.jMenuItemActualizarColorGeneral);
		this.jmenuDetalleAccionesColorGeneral.add(this.jMenuItemEliminarColorGeneral);
		this.jmenuDetalleAccionesColorGeneral.add(this.jMenuItemCancelarColorGeneral);		
		
		//this.jmenuDetalleDatosColorGeneral.add(this.jMenuItemDetalleAbrirOrderByColorGeneral);				
		this.jmenuDetalleDatosColorGeneral.add(this.jMenuItemDetalleMostarOcultarColorGeneral);				
				
		//this.jmenuDetalleAccionesColorGeneral.add(this.jMenuItemGuardarCambiosColorGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleColorGeneral.add(this.jmenuDetalleArchivoColorGeneral);		
		this.jmenuBarDetalleColorGeneral.add(this.jmenuDetalleAccionesColorGeneral);		
		this.jmenuBarDetalleColorGeneral.add(this.jmenuDetalleDatosColorGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleColorGeneral);				
	}
	
	
	public void inicializarElementosCamposColorGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdColorGeneral = new JLabelMe();
		jLabelIdColorGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidColorGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidColorGeneral.setToolTipText(ColorGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutColorGeneral= new GridBagLayout();

		this.jPanelidColorGeneral.setLayout(this.gridaBagLayoutColorGeneral);

		jTextFieldidColorGeneral = new JTextFieldMe();
		jTextFieldidColorGeneral.setText("Id");

		jTextFieldidColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreColorGeneral = new JLabelMe();
		this.jLabelnombreColorGeneral.setText(""+ColorGeneralConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreColorGeneral.setToolTipText("Nombre");
		this.jLabelnombreColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreColorGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreColorGeneral.setToolTipText(ColorGeneralConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutColorGeneral = new GridBagLayout();
		this.jPanelnombreColorGeneral.setLayout(this.gridaBagLayoutColorGeneral);


		jTextFieldnombreColorGeneral= new JTextFieldMe();

		jTextFieldnombreColorGeneral.setEnabled(false);
		jTextFieldnombreColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreColorGeneralBusqueda= new JButtonMe();
		this.jButtonnombreColorGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreColorGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreColorGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreColorGeneralBusqueda.setText("U");
		this.jButtonnombreColorGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreColorGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreColorGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreColorGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreColorGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreColorGeneralBusqueda"));

		if(this.colorgeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreColorGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysColorGeneral() {
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
		//this.jInternalFrameDetalleColorGeneral = new ColorGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Color DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutColorGeneral= new GridBagLayout();
		

		
		String sToolTipColorGeneral="";
		sToolTipColorGeneral=ColorGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipColorGeneral+="(Seguridad.ColorGeneral)";
		}
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipColorGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoColorGeneral = new JButtonMe();
		this.jButtonModificarColorGeneral = new JButtonMe();
        this.jButtonActualizarColorGeneral = new JButtonMe();
        this.jButtonEliminarColorGeneral = new JButtonMe();
        this.jButtonCancelarColorGeneral = new JButtonMe();
        this.jButtonGuardarCambiosColorGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaColorGeneral = new JButtonMe();
		this.jButtonCerrarColorGeneral = new JButtonMe();
		
		this.jScrollPanelDatosColorGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionColorGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralColorGeneral = new JScrollPane();
				
		
		
		this.jPanelCamposColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Color";
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Colores" + this.sPath));
		} else {
			this.jScrollPanelDatosColorGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposColorGeneral.setName("jPanelCamposColorGeneral"); 

		this.jPanelCamposOcultosColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosColorGeneral.setName("jPanelCamposOcultosColorGeneral"); 

        this.jPanelAccionesColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesColorGeneral.setToolTipText("Acciones");
        this.jPanelAccionesColorGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioColorGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioColorGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoColorGeneral.setText("Nuevo");
		this.jButtonModificarColorGeneral.setText("Editar");
        this.jButtonActualizarColorGeneral.setText("Actualizar");
        this.jButtonEliminarColorGeneral.setText("Eliminar");
        this.jButtonCancelarColorGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosColorGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaColorGeneral.setText("Guardar");
		this.jButtonCerrarColorGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoColorGeneral,"nuevo_button","Nuevo",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarColorGeneral,"modificar_button","Editar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarColorGeneral,"actualizar_button","Actualizar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarColorGeneral,"eliminar_button","Eliminar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarColorGeneral,"cancelar_button","Cancelar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosColorGeneral,"guardarcambios_button","Guardar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaColorGeneral,"guardarcambiostabla_button","Guardar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarColorGeneral,"cerrar_button","Salir",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoColorGeneral.setToolTipText("Nuevo"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarColorGeneral.setToolTipText("Editar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarColorGeneral.setToolTipText("Actualizar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarColorGeneral.setToolTipText("Eliminar)"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarColorGeneral.setToolTipText("Cancelar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosColorGeneral.setToolTipText("Guardar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaColorGeneral.setToolTipText("Guardar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarColorGeneral.setToolTipText("Salir"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoColorGeneral";
		inputMap = this.jButtonNuevoColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoColorGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoColorGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarColorGeneral";
		inputMap = this.jButtonActualizarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarColorGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarColorGeneral";
		inputMap = this.jButtonEliminarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarColorGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarColorGeneral";
		inputMap = this.jButtonCancelarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarColorGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarColorGeneral";
		inputMap = this.jButtonCerrarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarColorGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaColorGeneral";
		inputMap = this.jButtonGuardarCambiosTablaColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaColorGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoColorGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoColorGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoColorGeneral.setToolTipText("Nuevo ColorGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarColorGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarColorGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarColorGeneral.setToolTipText("Sin Cerrar Ventana ColorGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeColorGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeColorGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeColorGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesColorGeneral.setText("Accion");
		this.jComboBoxTiposAccionesColorGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioColorGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioColorGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesColorGeneral = new JLabelMe();
		
		this.jLabelAccionesColorGeneral.setText("Acciones");		
		this.jLabelAccionesColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposColorGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysColorGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesColorGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesColorGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesColorGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioColorGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioColorGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioColorGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposColorGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosColorGeneral = new GridBagLayout();
		
		this.jPanelCamposColorGeneral.setLayout(gridaBagLayoutCamposColorGeneral);
		this.jPanelCamposOcultosColorGeneral.setLayout(gridaBagLayoutCamposOcultosColorGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorGeneral.gridy = 0;
	this.gridBagConstraintsColorGeneral.gridx = 0;
	this.gridBagConstraintsColorGeneral.ipadx = 0;
	this.gridBagConstraintsColorGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidColorGeneral.add(jLabelIdColorGeneral, this.gridBagConstraintsColorGeneral);



	this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorGeneral.gridy = 0;
	this.gridBagConstraintsColorGeneral.gridx = 1;
	this.gridBagConstraintsColorGeneral.ipadx = 0;
	this.gridBagConstraintsColorGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidColorGeneral.add(jTextFieldidColorGeneral, this.gridBagConstraintsColorGeneral);


	this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorGeneral.gridy = 0;
	this.gridBagConstraintsColorGeneral.gridx = 0;
	this.gridBagConstraintsColorGeneral.ipadx = 0;
	this.gridBagConstraintsColorGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreColorGeneral.add(jLabelnombreColorGeneral, this.gridBagConstraintsColorGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		//this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = 0;
		this.gridBagConstraintsColorGeneral.gridx = 2;
		this.gridBagConstraintsColorGeneral.ipadx = 0;
		this.gridBagConstraintsColorGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreColorGeneral.add(jButtonnombreColorGeneralBusqueda, this.gridBagConstraintsColorGeneral);
	}

	this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsColorGeneral.gridy = 0;
	this.gridBagConstraintsColorGeneral.gridx = 1;
	this.gridBagConstraintsColorGeneral.ipadx = 0;
	this.gridBagConstraintsColorGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreColorGeneral.add(jTextFieldnombreColorGeneral, this.gridBagConstraintsColorGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorGeneral.gridy = iYPanelCamposColorGeneral;
	this.gridBagConstraintsColorGeneral.gridx = iXPanelCamposColorGeneral++;
	this.gridBagConstraintsColorGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorGeneral.add(this.jPanelidColorGeneral, this.gridBagConstraintsColorGeneral);



	if(iXPanelCamposColorGeneral % 1==0) {
		iXPanelCamposColorGeneral=0;
		iYPanelCamposColorGeneral++;
	}
	this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsColorGeneral.gridy = iYPanelCamposColorGeneral;
	this.gridBagConstraintsColorGeneral.gridx = iXPanelCamposColorGeneral++;
	this.gridBagConstraintsColorGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsColorGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposColorGeneral.add(this.jPanelnombreColorGeneral, this.gridBagConstraintsColorGeneral);



	if(iXPanelCamposColorGeneral % 1==0) {
		iXPanelCamposColorGeneral=0;
		iYPanelCamposColorGeneral++;
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
			
		GridBagLayout gridaBagLayoutAccionesColorGeneral= new GridBagLayout();
		this.jPanelAccionesColorGeneral.setLayout(gridaBagLayoutAccionesColorGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioColorGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioColorGeneral.setLayout(gridaBagLayoutAccionesFormularioColorGeneral);
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsColorGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioColorGeneral.add(this.jComboBoxTiposAccionesFormularioColorGeneral, this.gridBagConstraintsColorGeneral);

		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsColorGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioColorGeneral.add(this.jCheckBoxPostAccionNuevoColorGeneral, this.gridBagConstraintsColorGeneral);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.colorgeneralSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsColorGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioColorGeneral.add(this.jCheckBoxPostAccionSinCerrarColorGeneral, this.gridBagConstraintsColorGeneral);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.colorgeneralSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsColorGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioColorGeneral.add(this.jCheckBoxPostAccionSinMensajeColorGeneral, this.gridBagConstraintsColorGeneral);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = 0;
		this.gridBagConstraintsColorGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesColorGeneral.add(this.jButtonModificarColorGeneral, this.gridBagConstraintsColorGeneral);							

		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = 0;
		this.gridBagConstraintsColorGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesColorGeneral.add(this.jButtonEliminarColorGeneral, this.gridBagConstraintsColorGeneral);
		
			
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = 0;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesColorGeneral.add(this.jButtonActualizarColorGeneral, this.gridBagConstraintsColorGeneral);


		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = 0;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesColorGeneral.add(this.jButtonGuardarCambiosColorGeneral, this.gridBagConstraintsColorGeneral);	
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = 0;		
		this.gridBagConstraintsColorGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesColorGeneral.add(this.jButtonCancelarColorGeneral, this.gridBagConstraintsColorGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutColorGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutColorGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();						
			this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsColorGeneral.gridx = 0;		
			//this.gridBagConstraintsColorGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsColorGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsColorGeneral.gridx =0;
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsColorGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosColorGeneral, this.gridBagConstraintsColorGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleColorGeneral = new ColorGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Color DATOS");
			
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
			
	        //this.setTitle("[FOR] - Color DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Color Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ColorGeneralModel colorgeneralModel=new ColorGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//ColorGeneralModel.ColorGeneralFocusTraversalPolicy colorgeneralFocusTraversalPolicy = colorgeneralModel.new ColorGeneralFocusTraversalPolicy(this);
			
			//colorgeneralFocusTraversalPolicy.setcolorgeneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(colorgeneralModel);
			
			
			this.jContentPaneDetalleColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleColorGeneral = new GridBagLayout();	
			this.jContentPaneDetalleColorGeneral.setLayout(gridaBagLayoutDetalleColorGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosColorGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsColorGeneral = new GridBagConstraints();
				this.gridBagConstraintsColorGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsColorGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleColorGeneral.add(jTtoolBarDetalleColorGeneral, gridBagConstraintsColorGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionColorGeneral=   new JScrollPane(jContentPaneDetalleColorGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionColorGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralColorGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralColorGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsColorGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsColorGeneral.gridx = 0;
	        
			this.jContentPaneDetalleColorGeneral.add(jPanelCamposColorGeneral, gridBagConstraintsColorGeneral);
			
			
			
			
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
						&& colorgeneralSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsColorGeneral= new GridBagConstraints();
						this.gridBagConstraintsColorGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsColorGeneral.gridx = 0;
						this.jContentPaneDetalleColorGeneral.add(this.jTabbedPaneRelacionesColorGeneral, this.gridBagConstraintsColorGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesColorGeneral.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosColorGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsColorGeneral = new GridBagConstraints();
					this.gridBagConstraintsColorGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsColorGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsColorGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleColorGeneral.add(jPanelCamposOcultosColorGeneral, gridBagConstraintsColorGeneral);
				
					this.jPanelCamposOcultosColorGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsColorGeneral.gridx = 0;
	        this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleColorGeneral.add(this.jPanelAccionesFormularioColorGeneral, this.gridBagConstraintsColorGeneral);							
			
			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
	        this.gridBagConstraintsColorGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsColorGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleColorGeneral.add(this.jPanelAccionesColorGeneral, this.gridBagConstraintsColorGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionColorGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionColorGeneral=   new JScrollPane(this.jPanelCamposColorGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionColorGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionColorGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsColorGeneral.gridx = 0;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsColorGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionColorGeneral, this.gridBagConstraintsColorGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsColorGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioColorGeneral, this.gridBagConstraintsColorGeneral);			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsColorGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesColorGeneral, this.gridBagConstraintsColorGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposColorGeneral, this.gridBagConstraintsColorGeneral);
			
			
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosColorGeneral, this.gridBagConstraintsColorGeneral);
		
			
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesColorGeneral, this.gridBagConstraintsColorGeneral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralColorGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionColorGeneral;
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
