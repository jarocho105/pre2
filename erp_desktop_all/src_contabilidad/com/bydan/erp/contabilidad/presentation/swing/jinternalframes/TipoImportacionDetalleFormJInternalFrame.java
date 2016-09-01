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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoImportacionConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoImportacionDetalleFormJInternalFrame extends TipoImportacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoImportacion;
	
	protected JMenuBar jmenuBarDetalleTipoImportacion;
	
	protected JMenu jmenuDetalleTipoImportacion;
	protected JMenu jmenuDetalleArchivoTipoImportacion;
	protected JMenu jmenuDetalleAccionesTipoImportacion;
	protected JMenu jmenuDetalleDatosTipoImportacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoImportacion;	
	protected GridBagConstraints gridBagConstraintsTipoImportacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoImportacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoImportacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoImportacionSessionBean tipoimportacionSessionBean;
	
	
	
		
	
	public TipoImportacionLogic tipoimportacionLogic;
	
	public JScrollPane jScrollPanelDatosTipoImportacion;
	public JScrollPane jScrollPanelDatosEdicionTipoImportacion;
	public JScrollPane jScrollPanelDatosGeneralTipoImportacion;
	
	protected JPanel jPanelCamposTipoImportacion;    
	protected JPanel jPanelCamposOcultosTipoImportacion;    	
	protected JPanel jPanelAccionesTipoImportacion;
	protected JPanel jPanelAccionesFormularioTipoImportacion;
    
	
	
	protected Integer iXPanelCamposTipoImportacion=0;
	protected Integer iYPanelCamposTipoImportacion=0;
	
	protected Integer iXPanelCamposOcultosTipoImportacion=0;
	protected Integer iYPanelCamposOcultosTipoImportacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoImportacion;
	public JButton jButtonModificarTipoImportacion;
	public JButton jButtonActualizarTipoImportacion;
    public JButton jButtonEliminarTipoImportacion;
	public JButton jButtonCancelarTipoImportacion;
    public JButton jButtonGuardarCambiosTipoImportacion;
	public JButton jButtonGuardarCambiosTablaTipoImportacion;
	protected JButton jButtonCerrarTipoImportacion;
	
	
	protected JButton jButtonProcesarInformacionTipoImportacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoImportacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoImportacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoImportacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoImportacion;
	protected JButton jButtonModificarToolBarTipoImportacion;
	protected JButton jButtonActualizarToolBarTipoImportacion;
    protected JButton jButtonEliminarToolBarTipoImportacion;
	protected JButton jButtonCancelarToolBarTipoImportacion;
    protected JButton jButtonGuardarCambiosToolBarTipoImportacion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoImportacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoImportacion;
	protected JButton jButtonCerrarToolBarTipoImportacion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoImportacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoImportacion;
	protected JMenuItem jMenuItemModificarTipoImportacion;
	protected JMenuItem jMenuItemActualizarTipoImportacion;
    protected JMenuItem jMenuItemEliminarTipoImportacion;
	protected JMenuItem jMenuItemCancelarTipoImportacion;
    protected JMenuItem jMenuItemGuardarCambiosTipoImportacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoImportacion;
	protected JMenuItem jMenuItemCerrarTipoImportacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoImportacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoImportacion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoImportacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoImportacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoImportacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoImportacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoImportacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoImportacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoImportacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoImportacion;
	public JLabel jLabelIdTipoImportacion;
	public JTextFieldMe jTextFieldidTipoImportacion;
	public JButton jButtonidTipoImportacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoImportacion;
	public JLabel jLabelcodigoTipoImportacion;
	public JTextField jTextFieldcodigoTipoImportacion;
	public JButton jButtoncodigoTipoImportacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoImportacion;
	public JLabel jLabelnombreTipoImportacion;
	public JTextArea jTextAreanombreTipoImportacion;
	public JScrollPane jscrollPanenombreTipoImportacion;
	public JButton jButtonnombreTipoImportacionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoImportacion;
	
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
	
	public TipoImportacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoImportacion=new JPanel();
				this.jPanelAccionesFormularioTipoImportacion=new JPanel();
				this.jmenuBarDetalleTipoImportacion=new JMenuBar();
				this.jTtoolBarDetalleTipoImportacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoImportacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImportacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoImportacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoImportacion() {
		return this.jButtonActualizarToolBarTipoImportacion;
	}
	
	public JButton getjButtonEliminarToolBarTipoImportacion() {
		return this.jButtonEliminarToolBarTipoImportacion;
	}
	
	public JButton getjButtonCancelarToolBarTipoImportacion() {
		return this.jButtonCancelarToolBarTipoImportacion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoImportacion() {
		return this.jButtonProcesarInformacionTipoImportacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoImportacion)	{
		this.jButtonProcesarInformacionTipoImportacion = jButtonProcesarInformacionTipoImportacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoImportacion() {
		return this.jComboBoxTiposAccionesTipoImportacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoImportacion(
			JComboBox jComboBoxTiposRelacionesTipoImportacion) {
		this.jComboBoxTiposRelacionesTipoImportacion = jComboBoxTiposRelacionesTipoImportacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoImportacion(
			JComboBox jComboBoxTiposAccionesTipoImportacion) {
		this.jComboBoxTiposAccionesTipoImportacion = jComboBoxTiposAccionesTipoImportacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoImportacion() {
		return this.jComboBoxTiposAccionesFormularioTipoImportacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoImportacion(
			JComboBox jComboBoxTiposAccionesFormularioTipoImportacion) {
		this.jComboBoxTiposAccionesFormularioTipoImportacion = jComboBoxTiposAccionesFormularioTipoImportacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoimportacionSessionBean=new TipoImportacionSessionBean();
		
		this.tipoimportacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimportacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoimportacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoImportacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoImportacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoImportacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Importacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoImportacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoImportacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoImportacion=new JButtonMe();
				this.jButtonModificarToolBarTipoImportacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoImportacion,this.jTtoolBarDetalleTipoImportacion,
							"actualizar","actualizar","Actualizar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoImportacion,this.jTtoolBarDetalleTipoImportacion,
							"eliminar","eliminar","Eliminar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoImportacion,this.jTtoolBarDetalleTipoImportacion,
							"cancelar","cancelar","Cancelar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoImportacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoImportacion,this.jTtoolBarDetalleTipoImportacion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoImportacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoImportacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoImportacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoImportacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoImportacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoImportacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoImportacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoImportacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoImportacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoImportacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoImportacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoImportacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoImportacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoImportacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoImportacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoImportacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoImportacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoImportacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoImportacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoImportacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoImportacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoImportacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoImportacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoImportacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoImportacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoImportacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoImportacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoImportacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoImportacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoImportacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoImportacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoImportacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoImportacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoImportacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoImportacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoImportacion.add(this.jMenuItemDetalleCerrarTipoImportacion);
		
		this.jmenuDetalleAccionesTipoImportacion.add(this.jMenuItemActualizarTipoImportacion);
		this.jmenuDetalleAccionesTipoImportacion.add(this.jMenuItemEliminarTipoImportacion);
		this.jmenuDetalleAccionesTipoImportacion.add(this.jMenuItemCancelarTipoImportacion);		
		
		//this.jmenuDetalleDatosTipoImportacion.add(this.jMenuItemDetalleAbrirOrderByTipoImportacion);				
		this.jmenuDetalleDatosTipoImportacion.add(this.jMenuItemDetalleMostarOcultarTipoImportacion);				
				
		//this.jmenuDetalleAccionesTipoImportacion.add(this.jMenuItemGuardarCambiosTipoImportacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoImportacion.add(this.jmenuDetalleArchivoTipoImportacion);		
		this.jmenuBarDetalleTipoImportacion.add(this.jmenuDetalleAccionesTipoImportacion);		
		this.jmenuBarDetalleTipoImportacion.add(this.jmenuDetalleDatosTipoImportacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoImportacion);				
	}
	
	
	public void inicializarElementosCamposTipoImportacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoImportacion = new JLabelMe();
		jLabelIdTipoImportacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoImportacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoImportacion.setToolTipText(TipoImportacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoImportacion= new GridBagLayout();

		this.jPanelidTipoImportacion.setLayout(this.gridaBagLayoutTipoImportacion);

		jTextFieldidTipoImportacion = new JTextFieldMe();
		jTextFieldidTipoImportacion.setText("Id");

		jTextFieldidTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoImportacion = new JLabelMe();
		this.jLabelcodigoTipoImportacion.setText(""+TipoImportacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoImportacion.setToolTipText("Codigo");
		this.jLabelcodigoTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoImportacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoImportacion.setToolTipText(TipoImportacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoImportacion = new GridBagLayout();
		this.jPanelcodigoTipoImportacion.setLayout(this.gridaBagLayoutTipoImportacion);


		jTextFieldcodigoTipoImportacion= new JTextFieldMe();

		jTextFieldcodigoTipoImportacion.setEnabled(false);
		jTextFieldcodigoTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoImportacionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoImportacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoImportacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoImportacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoImportacionBusqueda.setText("U");
		this.jButtoncodigoTipoImportacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoImportacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoImportacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoImportacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoImportacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoImportacionBusqueda"));

		if(this.tipoimportacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoImportacionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoImportacion = new JLabelMe();
		this.jLabelnombreTipoImportacion.setText(""+TipoImportacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoImportacion.setToolTipText("Nombre");
		this.jLabelnombreTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoImportacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoImportacion.setToolTipText(TipoImportacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoImportacion = new GridBagLayout();
		this.jPanelnombreTipoImportacion.setLayout(this.gridaBagLayoutTipoImportacion);


		jTextAreanombreTipoImportacion= new JTextAreaMe();
		jTextAreanombreTipoImportacion.setEnabled(false);
		jTextAreanombreTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImportacion.setLineWrap(true);
		jTextAreanombreTipoImportacion.setWrapStyleWord(true);
		jTextAreanombreTipoImportacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoImportacion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoImportacion = new JScrollPane(jTextAreanombreTipoImportacion);
		jscrollPanenombreTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoImportacionBusqueda= new JButtonMe();
		this.jButtonnombreTipoImportacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoImportacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoImportacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoImportacionBusqueda.setText("U");
		this.jButtonnombreTipoImportacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoImportacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoImportacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoImportacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoImportacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoImportacionBusqueda"));

		if(this.tipoimportacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoImportacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoImportacion() {
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
		//this.jInternalFrameDetalleTipoImportacion = new TipoImportacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Importacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoImportacion= new GridBagLayout();
		

		
		String sToolTipTipoImportacion="";
		sToolTipTipoImportacion=TipoImportacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoImportacion+="(Contabilidad.TipoImportacion)";
		}
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoImportacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoImportacion = new JButtonMe();
		this.jButtonModificarTipoImportacion = new JButtonMe();
        this.jButtonActualizarTipoImportacion = new JButtonMe();
        this.jButtonEliminarTipoImportacion = new JButtonMe();
        this.jButtonCancelarTipoImportacion = new JButtonMe();
        this.jButtonGuardarCambiosTipoImportacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoImportacion = new JButtonMe();
		this.jButtonCerrarTipoImportacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoImportacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoImportacion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoImportacion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Importacion";
		
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Importacions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoImportacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoImportacion.setName("jPanelCamposTipoImportacion"); 

		this.jPanelCamposOcultosTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoImportacion.setName("jPanelCamposOcultosTipoImportacion"); 

        this.jPanelAccionesTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoImportacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoImportacion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoImportacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoImportacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoImportacion.setText("Nuevo");
		this.jButtonModificarTipoImportacion.setText("Editar");
        this.jButtonActualizarTipoImportacion.setText("Actualizar");
        this.jButtonEliminarTipoImportacion.setText("Eliminar");
        this.jButtonCancelarTipoImportacion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoImportacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoImportacion.setText("Guardar");
		this.jButtonCerrarTipoImportacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoImportacion,"nuevo_button","Nuevo",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoImportacion,"modificar_button","Editar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoImportacion,"actualizar_button","Actualizar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoImportacion,"eliminar_button","Eliminar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoImportacion,"cancelar_button","Cancelar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoImportacion,"guardarcambios_button","Guardar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoImportacion,"guardarcambiostabla_button","Guardar",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoImportacion,"cerrar_button","Salir",this.tipoimportacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoImportacion.setToolTipText("Nuevo"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoImportacion.setToolTipText("Editar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoImportacion.setToolTipText("Actualizar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoImportacion.setToolTipText("Eliminar)"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoImportacion.setToolTipText("Cancelar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoImportacion.setToolTipText("Guardar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoImportacion.setToolTipText("Guardar"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoImportacion.setToolTipText("Salir"+" "+TipoImportacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoImportacion";
		inputMap = this.jButtonNuevoTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoImportacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoImportacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoImportacion";
		inputMap = this.jButtonActualizarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoImportacion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoImportacion";
		inputMap = this.jButtonEliminarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoImportacion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoImportacion";
		inputMap = this.jButtonCancelarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoImportacion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoImportacion";
		inputMap = this.jButtonCerrarTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoImportacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoImportacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoImportacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoImportacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoImportacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoImportacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoImportacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoImportacion.setToolTipText("Nuevo TipoImportacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoImportacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoImportacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoImportacion.setToolTipText("Sin Cerrar Ventana TipoImportacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoImportacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoImportacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoImportacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoImportacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoImportacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoImportacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoImportacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoImportacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoImportacion = new JLabelMe();
		
		this.jLabelAccionesTipoImportacion.setText("Acciones");		
		this.jLabelAccionesTipoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoImportacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoImportacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoImportacion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoImportacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoImportacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImportacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImportacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoImportacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoImportacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoImportacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoImportacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoImportacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoImportacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoImportacion = new GridBagLayout();
		
		this.jPanelCamposTipoImportacion.setLayout(gridaBagLayoutCamposTipoImportacion);
		this.jPanelCamposOcultosTipoImportacion.setLayout(gridaBagLayoutCamposOcultosTipoImportacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImportacion.gridy = 0;
	this.gridBagConstraintsTipoImportacion.gridx = 0;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoImportacion.add(jLabelIdTipoImportacion, this.gridBagConstraintsTipoImportacion);



	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImportacion.gridy = 0;
	this.gridBagConstraintsTipoImportacion.gridx = 1;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoImportacion.add(jTextFieldidTipoImportacion, this.gridBagConstraintsTipoImportacion);


	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImportacion.gridy = 0;
	this.gridBagConstraintsTipoImportacion.gridx = 0;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoImportacion.add(jLabelcodigoTipoImportacion, this.gridBagConstraintsTipoImportacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = 0;
		this.gridBagConstraintsTipoImportacion.gridx = 2;
		this.gridBagConstraintsTipoImportacion.ipadx = 0;
		this.gridBagConstraintsTipoImportacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoImportacion.add(jButtoncodigoTipoImportacionBusqueda, this.gridBagConstraintsTipoImportacion);
	}

	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImportacion.gridy = 0;
	this.gridBagConstraintsTipoImportacion.gridx = 1;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoImportacion.add(jTextFieldcodigoTipoImportacion, this.gridBagConstraintsTipoImportacion);


	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImportacion.gridy = 0;
	this.gridBagConstraintsTipoImportacion.gridx = 0;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoImportacion.add(jLabelnombreTipoImportacion, this.gridBagConstraintsTipoImportacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImportacion.gridy = 0;
		this.gridBagConstraintsTipoImportacion.gridx = 2;
		this.gridBagConstraintsTipoImportacion.ipadx = 0;
		this.gridBagConstraintsTipoImportacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoImportacion.add(jButtonnombreTipoImportacionBusqueda, this.gridBagConstraintsTipoImportacion);
	}

	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImportacion.gridy = 0;
	this.gridBagConstraintsTipoImportacion.gridx = 1;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoImportacion.add(jscrollPanenombreTipoImportacion, this.gridBagConstraintsTipoImportacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImportacion.gridy = iYPanelCamposTipoImportacion;
	this.gridBagConstraintsTipoImportacion.gridx = iXPanelCamposTipoImportacion++;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImportacion.add(this.jPanelidTipoImportacion, this.gridBagConstraintsTipoImportacion);



	if(iXPanelCamposTipoImportacion % 1==0) {
		iXPanelCamposTipoImportacion=0;
		iYPanelCamposTipoImportacion++;
	}
	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImportacion.gridy = iYPanelCamposTipoImportacion;
	this.gridBagConstraintsTipoImportacion.gridx = iXPanelCamposTipoImportacion++;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImportacion.add(this.jPanelcodigoTipoImportacion, this.gridBagConstraintsTipoImportacion);



	if(iXPanelCamposTipoImportacion % 1==0) {
		iXPanelCamposTipoImportacion=0;
		iYPanelCamposTipoImportacion++;
	}
	this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImportacion.gridy = iYPanelCamposTipoImportacion;
	this.gridBagConstraintsTipoImportacion.gridx = iXPanelCamposTipoImportacion++;
	this.gridBagConstraintsTipoImportacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImportacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImportacion.add(this.jPanelnombreTipoImportacion, this.gridBagConstraintsTipoImportacion);



	if(iXPanelCamposTipoImportacion % 1==0) {
		iXPanelCamposTipoImportacion=0;
		iYPanelCamposTipoImportacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoImportacion= new GridBagLayout();
		this.jPanelAccionesTipoImportacion.setLayout(gridaBagLayoutAccionesTipoImportacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoImportacion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoImportacion.setLayout(gridaBagLayoutAccionesFormularioTipoImportacion);
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoImportacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoImportacion.add(this.jComboBoxTiposAccionesFormularioTipoImportacion, this.gridBagConstraintsTipoImportacion);

		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoImportacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoImportacion.add(this.jCheckBoxPostAccionNuevoTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoImportacion.add(this.jCheckBoxPostAccionSinCerrarTipoImportacion, this.gridBagConstraintsTipoImportacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoimportacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoimportacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoImportacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoImportacion.add(this.jCheckBoxPostAccionSinMensajeTipoImportacion, this.gridBagConstraintsTipoImportacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = 0;
		this.gridBagConstraintsTipoImportacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoImportacion.add(this.jButtonModificarTipoImportacion, this.gridBagConstraintsTipoImportacion);							

		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImportacion.gridy = 0;
		this.gridBagConstraintsTipoImportacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoImportacion.add(this.jButtonEliminarTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
			
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = 0;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoImportacion.add(this.jButtonActualizarTipoImportacion, this.gridBagConstraintsTipoImportacion);


		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = 0;		
		this.gridBagConstraintsTipoImportacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoImportacion.add(this.jButtonGuardarCambiosTipoImportacion, this.gridBagConstraintsTipoImportacion);	
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = 0;		
		this.gridBagConstraintsTipoImportacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoImportacion.add(this.jButtonCancelarTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoImportacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoImportacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoimportacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoImportacion.gridx = 0;		
			//this.gridBagConstraintsTipoImportacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoImportacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoImportacion.gridx =0;
		this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoImportacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoImportacion, this.gridBagConstraintsTipoImportacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoImportacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoImportacion = new TipoImportacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Importacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Importacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Importacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoImportacionModel tipoimportacionModel=new TipoImportacionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoImportacionModel.TipoImportacionFocusTraversalPolicy tipoimportacionFocusTraversalPolicy = tipoimportacionModel.new TipoImportacionFocusTraversalPolicy(this);
			
			//tipoimportacionFocusTraversalPolicy.settipoimportacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoimportacionModel);
			
			
			this.jContentPaneDetalleTipoImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoImportacion = new GridBagLayout();	
			this.jContentPaneDetalleTipoImportacion.setLayout(gridaBagLayoutDetalleTipoImportacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoImportacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
				this.gridBagConstraintsTipoImportacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoImportacion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoImportacion.add(jTtoolBarDetalleTipoImportacion, gridBagConstraintsTipoImportacion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoImportacion=   new JScrollPane(jContentPaneDetalleTipoImportacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoImportacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImportacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImportacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoImportacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoImportacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImportacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImportacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoImportacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoImportacion.gridx = 0;
	        
			this.jContentPaneDetalleTipoImportacion.add(jPanelCamposTipoImportacion, gridBagConstraintsTipoImportacion);
			
			
			
			
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
						&& tipoimportacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoimportacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoImportacion= new GridBagConstraints();
						this.gridBagConstraintsTipoImportacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoImportacion.gridx = 0;
						this.jContentPaneDetalleTipoImportacion.add(this.jTabbedPaneRelacionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoImportacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoImportacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
					this.gridBagConstraintsTipoImportacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoImportacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoImportacion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoImportacion.add(jPanelCamposOcultosTipoImportacion, gridBagConstraintsTipoImportacion);
				
					this.jPanelCamposOcultosTipoImportacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoImportacion.gridx = 0;
	        this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoImportacion.add(this.jPanelAccionesFormularioTipoImportacion, this.gridBagConstraintsTipoImportacion);							
			
			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
	        this.gridBagConstraintsTipoImportacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoImportacion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoImportacion.add(this.jPanelAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoImportacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoImportacion=   new JScrollPane(this.jPanelCamposTipoImportacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoImportacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImportacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImportacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoImportacion.gridx = 0;
			this.gridBagConstraintsTipoImportacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoImportacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoImportacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoImportacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoImportacion, this.gridBagConstraintsTipoImportacion);			
			
			this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
			this.gridBagConstraintsTipoImportacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoImportacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoImportacion, this.gridBagConstraintsTipoImportacion);
			
			
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoImportacion, this.gridBagConstraintsTipoImportacion);
		
			
		this.gridBagConstraintsTipoImportacion = new GridBagConstraints();
		this.gridBagConstraintsTipoImportacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoImportacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoImportacion, this.gridBagConstraintsTipoImportacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoImportacion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoImportacion;
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
