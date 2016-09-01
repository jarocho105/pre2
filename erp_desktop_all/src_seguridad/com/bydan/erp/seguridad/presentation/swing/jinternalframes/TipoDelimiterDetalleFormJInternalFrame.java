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
import com.bydan.erp.seguridad.util.TipoDelimiterConstantesFunciones;

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
public class TipoDelimiterDetalleFormJInternalFrame extends TipoDelimiterBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDelimiter;
	
	protected JMenuBar jmenuBarDetalleTipoDelimiter;
	
	protected JMenu jmenuDetalleTipoDelimiter;
	protected JMenu jmenuDetalleArchivoTipoDelimiter;
	protected JMenu jmenuDetalleAccionesTipoDelimiter;
	protected JMenu jmenuDetalleDatosTipoDelimiter;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDelimiter;	
	protected GridBagConstraints gridBagConstraintsTipoDelimiter;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDelimiterBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDelimiter;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDelimiterSessionBean tipodelimiterSessionBean;
	
	
	
		
	
	public TipoDelimiterLogic tipodelimiterLogic;
	
	public JScrollPane jScrollPanelDatosTipoDelimiter;
	public JScrollPane jScrollPanelDatosEdicionTipoDelimiter;
	public JScrollPane jScrollPanelDatosGeneralTipoDelimiter;
	
	protected JPanel jPanelCamposTipoDelimiter;    
	protected JPanel jPanelCamposOcultosTipoDelimiter;    	
	protected JPanel jPanelAccionesTipoDelimiter;
	protected JPanel jPanelAccionesFormularioTipoDelimiter;
    
	
	
	protected Integer iXPanelCamposTipoDelimiter=0;
	protected Integer iYPanelCamposTipoDelimiter=0;
	
	protected Integer iXPanelCamposOcultosTipoDelimiter=0;
	protected Integer iYPanelCamposOcultosTipoDelimiter=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDelimiter;
	public JButton jButtonModificarTipoDelimiter;
	public JButton jButtonActualizarTipoDelimiter;
    public JButton jButtonEliminarTipoDelimiter;
	public JButton jButtonCancelarTipoDelimiter;
    public JButton jButtonGuardarCambiosTipoDelimiter;
	public JButton jButtonGuardarCambiosTablaTipoDelimiter;
	protected JButton jButtonCerrarTipoDelimiter;
	
	
	protected JButton jButtonProcesarInformacionTipoDelimiter;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDelimiter;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDelimiter;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDelimiter;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDelimiter;
	protected JButton jButtonModificarToolBarTipoDelimiter;
	protected JButton jButtonActualizarToolBarTipoDelimiter;
    protected JButton jButtonEliminarToolBarTipoDelimiter;
	protected JButton jButtonCancelarToolBarTipoDelimiter;
    protected JButton jButtonGuardarCambiosToolBarTipoDelimiter;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDelimiter;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDelimiter;
	protected JButton jButtonCerrarToolBarTipoDelimiter;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDelimiter;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDelimiter;
	protected JMenuItem jMenuItemModificarTipoDelimiter;
	protected JMenuItem jMenuItemActualizarTipoDelimiter;
    protected JMenuItem jMenuItemEliminarTipoDelimiter;
	protected JMenuItem jMenuItemCancelarTipoDelimiter;
    protected JMenuItem jMenuItemGuardarCambiosTipoDelimiter;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDelimiter;
	protected JMenuItem jMenuItemCerrarTipoDelimiter;
	protected JMenuItem jMenuItemDetalleCerrarTipoDelimiter;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDelimiter;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDelimiter;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDelimiter;
	protected JMenuItem jMenuItemMostrarOcultarTipoDelimiter;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDelimiter;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDelimiter;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDelimiter;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDelimiter;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDelimiter;
	public JLabel jLabelIdTipoDelimiter;
	public JTextFieldMe jTextFieldidTipoDelimiter;
	public JButton jButtonidTipoDelimiterBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDelimiter;
	public JLabel jLabelcodigoTipoDelimiter;
	public JTextField jTextFieldcodigoTipoDelimiter;
	public JButton jButtoncodigoTipoDelimiterBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDelimiter;
	public JLabel jLabelnombreTipoDelimiter;
	public JTextArea jTextAreanombreTipoDelimiter;
	public JScrollPane jscrollPanenombreTipoDelimiter;
	public JButton jButtonnombreTipoDelimiterBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDelimiter;
	
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
	
	public TipoDelimiterDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDelimiter=new JPanel();
				this.jPanelAccionesFormularioTipoDelimiter=new JPanel();
				this.jmenuBarDetalleTipoDelimiter=new JMenuBar();
				this.jTtoolBarDetalleTipoDelimiter=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDelimiterDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDelimiterDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDelimiter No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDelimiter() {
		return this.jButtonActualizarToolBarTipoDelimiter;
	}
	
	public JButton getjButtonEliminarToolBarTipoDelimiter() {
		return this.jButtonEliminarToolBarTipoDelimiter;
	}
	
	public JButton getjButtonCancelarToolBarTipoDelimiter() {
		return this.jButtonCancelarToolBarTipoDelimiter;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDelimiter() {
		return this.jButtonProcesarInformacionTipoDelimiter;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDelimiter)	{
		this.jButtonProcesarInformacionTipoDelimiter = jButtonProcesarInformacionTipoDelimiter;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDelimiter() {
		return this.jComboBoxTiposAccionesTipoDelimiter;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDelimiter(
			JComboBox jComboBoxTiposRelacionesTipoDelimiter) {
		this.jComboBoxTiposRelacionesTipoDelimiter = jComboBoxTiposRelacionesTipoDelimiter;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDelimiter(
			JComboBox jComboBoxTiposAccionesTipoDelimiter) {
		this.jComboBoxTiposAccionesTipoDelimiter = jComboBoxTiposAccionesTipoDelimiter;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDelimiter() {
		return this.jComboBoxTiposAccionesFormularioTipoDelimiter;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDelimiter(
			JComboBox jComboBoxTiposAccionesFormularioTipoDelimiter) {
		this.jComboBoxTiposAccionesFormularioTipoDelimiter = jComboBoxTiposAccionesFormularioTipoDelimiter;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodelimiterSessionBean=new TipoDelimiterSessionBean();
		
		this.tipodelimiterSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodelimiterSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodelimiterSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDelimiterJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDelimiterJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDelimiterJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Delimiter MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDelimiterJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDelimiter= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDelimiter=new JButtonMe();
				this.jButtonModificarToolBarTipoDelimiter=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDelimiter,this.jTtoolBarDetalleTipoDelimiter,
							"actualizar","actualizar","Actualizar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDelimiter,this.jTtoolBarDetalleTipoDelimiter,
							"eliminar","eliminar","Eliminar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDelimiter,this.jTtoolBarDetalleTipoDelimiter,
							"cancelar","cancelar","Cancelar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDelimiter=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDelimiter,this.jTtoolBarDetalleTipoDelimiter,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDelimiter=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDelimiter=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDelimiter=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDelimiter=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDelimiter=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDelimiter= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDelimiter.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDelimiter,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDelimiter= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDelimiter.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDelimiter,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDelimiter= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDelimiter.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDelimiter,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDelimiter= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDelimiter.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDelimiter,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDelimiter= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDelimiter.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDelimiter,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDelimiter= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDelimiter.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDelimiter,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDelimiter= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDelimiter.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDelimiter,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDelimiter= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDelimiter.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDelimiter,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDelimiter= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDelimiter.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDelimiter,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDelimiter= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDelimiter.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDelimiter,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDelimiter.add(this.jMenuItemDetalleCerrarTipoDelimiter);
		
		this.jmenuDetalleAccionesTipoDelimiter.add(this.jMenuItemActualizarTipoDelimiter);
		this.jmenuDetalleAccionesTipoDelimiter.add(this.jMenuItemEliminarTipoDelimiter);
		this.jmenuDetalleAccionesTipoDelimiter.add(this.jMenuItemCancelarTipoDelimiter);		
		
		//this.jmenuDetalleDatosTipoDelimiter.add(this.jMenuItemDetalleAbrirOrderByTipoDelimiter);				
		this.jmenuDetalleDatosTipoDelimiter.add(this.jMenuItemDetalleMostarOcultarTipoDelimiter);				
				
		//this.jmenuDetalleAccionesTipoDelimiter.add(this.jMenuItemGuardarCambiosTipoDelimiter);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDelimiter.add(this.jmenuDetalleArchivoTipoDelimiter);		
		this.jmenuBarDetalleTipoDelimiter.add(this.jmenuDetalleAccionesTipoDelimiter);		
		this.jmenuBarDetalleTipoDelimiter.add(this.jmenuDetalleDatosTipoDelimiter);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDelimiter);				
	}
	
	
	public void inicializarElementosCamposTipoDelimiter() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDelimiter = new JLabelMe();
		jLabelIdTipoDelimiter.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDelimiter = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDelimiter.setToolTipText(TipoDelimiterConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDelimiter= new GridBagLayout();

		this.jPanelidTipoDelimiter.setLayout(this.gridaBagLayoutTipoDelimiter);

		jTextFieldidTipoDelimiter = new JTextFieldMe();
		jTextFieldidTipoDelimiter.setText("Id");

		jTextFieldidTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDelimiter = new JLabelMe();
		this.jLabelcodigoTipoDelimiter.setText(""+TipoDelimiterConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDelimiter.setToolTipText("Codigo");
		this.jLabelcodigoTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDelimiter=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDelimiter.setToolTipText(TipoDelimiterConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDelimiter = new GridBagLayout();
		this.jPanelcodigoTipoDelimiter.setLayout(this.gridaBagLayoutTipoDelimiter);


		jTextFieldcodigoTipoDelimiter= new JTextFieldMe();

		jTextFieldcodigoTipoDelimiter.setEnabled(false);
		jTextFieldcodigoTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDelimiterBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDelimiterBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDelimiterBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDelimiterBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDelimiterBusqueda.setText("U");
		this.jButtoncodigoTipoDelimiterBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDelimiterBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDelimiterBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDelimiter.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDelimiter.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDelimiterBusqueda"));

		if(this.tipodelimiterSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDelimiterBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDelimiter = new JLabelMe();
		this.jLabelnombreTipoDelimiter.setText(""+TipoDelimiterConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDelimiter.setToolTipText("Nombre");
		this.jLabelnombreTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDelimiter=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDelimiter.setToolTipText(TipoDelimiterConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDelimiter = new GridBagLayout();
		this.jPanelnombreTipoDelimiter.setLayout(this.gridaBagLayoutTipoDelimiter);


		jTextAreanombreTipoDelimiter= new JTextAreaMe();
		jTextAreanombreTipoDelimiter.setEnabled(false);
		jTextAreanombreTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDelimiter.setLineWrap(true);
		jTextAreanombreTipoDelimiter.setWrapStyleWord(true);
		jTextAreanombreTipoDelimiter.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDelimiter.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDelimiter = new JScrollPane(jTextAreanombreTipoDelimiter);
		jscrollPanenombreTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDelimiterBusqueda= new JButtonMe();
		this.jButtonnombreTipoDelimiterBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDelimiterBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDelimiterBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDelimiterBusqueda.setText("U");
		this.jButtonnombreTipoDelimiterBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDelimiterBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDelimiterBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDelimiter.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDelimiter.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDelimiterBusqueda"));

		if(this.tipodelimiterSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDelimiterBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDelimiter() {
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
		//this.jInternalFrameDetalleTipoDelimiter = new TipoDelimiterBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Delimiter DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDelimiter= new GridBagLayout();
		

		
		String sToolTipTipoDelimiter="";
		sToolTipTipoDelimiter=TipoDelimiterConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDelimiter+="(Seguridad.TipoDelimiter)";
		}
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDelimiter+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDelimiter = new JButtonMe();
		this.jButtonModificarTipoDelimiter = new JButtonMe();
        this.jButtonActualizarTipoDelimiter = new JButtonMe();
        this.jButtonEliminarTipoDelimiter = new JButtonMe();
        this.jButtonCancelarTipoDelimiter = new JButtonMe();
        this.jButtonGuardarCambiosTipoDelimiter = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDelimiter = new JButtonMe();
		this.jButtonCerrarTipoDelimiter = new JButtonMe();
		
		this.jScrollPanelDatosTipoDelimiter = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDelimiter = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDelimiter = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Delimiter";
		
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Delimiters" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDelimiter.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDelimiter.setName("jPanelCamposTipoDelimiter"); 

		this.jPanelCamposOcultosTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDelimiter.setName("jPanelCamposOcultosTipoDelimiter"); 

        this.jPanelAccionesTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDelimiter.setToolTipText("Acciones");
        this.jPanelAccionesTipoDelimiter.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDelimiter.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDelimiter.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDelimiter.setText("Nuevo");
		this.jButtonModificarTipoDelimiter.setText("Editar");
        this.jButtonActualizarTipoDelimiter.setText("Actualizar");
        this.jButtonEliminarTipoDelimiter.setText("Eliminar");
        this.jButtonCancelarTipoDelimiter.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDelimiter.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDelimiter.setText("Guardar");
		this.jButtonCerrarTipoDelimiter.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDelimiter,"nuevo_button","Nuevo",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDelimiter,"modificar_button","Editar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDelimiter,"actualizar_button","Actualizar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDelimiter,"eliminar_button","Eliminar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDelimiter,"cancelar_button","Cancelar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDelimiter,"guardarcambios_button","Guardar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDelimiter,"guardarcambiostabla_button","Guardar",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDelimiter,"cerrar_button","Salir",this.tipodelimiterSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDelimiter.setToolTipText("Nuevo"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDelimiter.setToolTipText("Editar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDelimiter.setToolTipText("Actualizar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDelimiter.setToolTipText("Eliminar)"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDelimiter.setToolTipText("Cancelar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDelimiter.setToolTipText("Guardar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDelimiter.setToolTipText("Guardar"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDelimiter.setToolTipText("Salir"+" "+TipoDelimiterConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDelimiter";
		inputMap = this.jButtonNuevoTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDelimiter.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDelimiter"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDelimiter";
		inputMap = this.jButtonActualizarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDelimiter"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDelimiter";
		inputMap = this.jButtonEliminarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDelimiter"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDelimiter";
		inputMap = this.jButtonCancelarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDelimiter"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDelimiter";
		inputMap = this.jButtonCerrarTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDelimiter"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDelimiter";
		inputMap = this.jButtonGuardarCambiosTablaTipoDelimiter.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDelimiter.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDelimiter"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDelimiter = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDelimiter.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDelimiter.setToolTipText("Nuevo TipoDelimiter");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDelimiter = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDelimiter.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDelimiter.setToolTipText("Sin Cerrar Ventana TipoDelimiter");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDelimiter = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDelimiter.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDelimiter.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDelimiter.setText("Accion");
		this.jComboBoxTiposAccionesTipoDelimiter.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDelimiter = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDelimiter.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDelimiter.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDelimiter = new JLabelMe();
		
		this.jLabelAccionesTipoDelimiter.setText("Acciones");		
		this.jLabelAccionesTipoDelimiter.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDelimiter.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDelimiter.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDelimiter();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDelimiter();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDelimiter=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDelimiter.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDelimiter,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDelimiter.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDelimiter.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDelimiter.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDelimiter, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDelimiter.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDelimiter.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDelimiter.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDelimiter, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDelimiter = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDelimiter = new GridBagLayout();
		
		this.jPanelCamposTipoDelimiter.setLayout(gridaBagLayoutCamposTipoDelimiter);
		this.jPanelCamposOcultosTipoDelimiter.setLayout(gridaBagLayoutCamposOcultosTipoDelimiter);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDelimiter.gridy = 0;
	this.gridBagConstraintsTipoDelimiter.gridx = 0;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDelimiter.add(jLabelIdTipoDelimiter, this.gridBagConstraintsTipoDelimiter);



	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDelimiter.gridy = 0;
	this.gridBagConstraintsTipoDelimiter.gridx = 1;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDelimiter.add(jTextFieldidTipoDelimiter, this.gridBagConstraintsTipoDelimiter);


	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDelimiter.gridy = 0;
	this.gridBagConstraintsTipoDelimiter.gridx = 0;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDelimiter.add(jLabelcodigoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		//this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = 0;
		this.gridBagConstraintsTipoDelimiter.gridx = 2;
		this.gridBagConstraintsTipoDelimiter.ipadx = 0;
		this.gridBagConstraintsTipoDelimiter.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDelimiter.add(jButtoncodigoTipoDelimiterBusqueda, this.gridBagConstraintsTipoDelimiter);
	}

	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDelimiter.gridy = 0;
	this.gridBagConstraintsTipoDelimiter.gridx = 1;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDelimiter.add(jTextFieldcodigoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);


	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDelimiter.gridy = 0;
	this.gridBagConstraintsTipoDelimiter.gridx = 0;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDelimiter.add(jLabelnombreTipoDelimiter, this.gridBagConstraintsTipoDelimiter);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		//this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDelimiter.gridy = 0;
		this.gridBagConstraintsTipoDelimiter.gridx = 2;
		this.gridBagConstraintsTipoDelimiter.ipadx = 0;
		this.gridBagConstraintsTipoDelimiter.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDelimiter.add(jButtonnombreTipoDelimiterBusqueda, this.gridBagConstraintsTipoDelimiter);
	}

	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDelimiter.gridy = 0;
	this.gridBagConstraintsTipoDelimiter.gridx = 1;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDelimiter.add(jscrollPanenombreTipoDelimiter, this.gridBagConstraintsTipoDelimiter);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDelimiter.gridy = iYPanelCamposTipoDelimiter;
	this.gridBagConstraintsTipoDelimiter.gridx = iXPanelCamposTipoDelimiter++;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDelimiter.add(this.jPanelidTipoDelimiter, this.gridBagConstraintsTipoDelimiter);



	if(iXPanelCamposTipoDelimiter % 1==0) {
		iXPanelCamposTipoDelimiter=0;
		iYPanelCamposTipoDelimiter++;
	}
	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDelimiter.gridy = iYPanelCamposTipoDelimiter;
	this.gridBagConstraintsTipoDelimiter.gridx = iXPanelCamposTipoDelimiter++;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDelimiter.add(this.jPanelcodigoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);



	if(iXPanelCamposTipoDelimiter % 1==0) {
		iXPanelCamposTipoDelimiter=0;
		iYPanelCamposTipoDelimiter++;
	}
	this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDelimiter.gridy = iYPanelCamposTipoDelimiter;
	this.gridBagConstraintsTipoDelimiter.gridx = iXPanelCamposTipoDelimiter++;
	this.gridBagConstraintsTipoDelimiter.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDelimiter.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDelimiter.add(this.jPanelnombreTipoDelimiter, this.gridBagConstraintsTipoDelimiter);



	if(iXPanelCamposTipoDelimiter % 1==0) {
		iXPanelCamposTipoDelimiter=0;
		iYPanelCamposTipoDelimiter++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDelimiter= new GridBagLayout();
		this.jPanelAccionesTipoDelimiter.setLayout(gridaBagLayoutAccionesTipoDelimiter);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDelimiter= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDelimiter.setLayout(gridaBagLayoutAccionesFormularioTipoDelimiter);
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDelimiter.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDelimiter.add(this.jComboBoxTiposAccionesFormularioTipoDelimiter, this.gridBagConstraintsTipoDelimiter);

		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDelimiter.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDelimiter.add(this.jCheckBoxPostAccionNuevoTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDelimiter.add(this.jCheckBoxPostAccionSinCerrarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodelimiterSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodelimiterSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDelimiter.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDelimiter.add(this.jCheckBoxPostAccionSinMensajeTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = 0;
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDelimiter.add(this.jButtonModificarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);							

		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDelimiter.gridy = 0;
		this.gridBagConstraintsTipoDelimiter.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDelimiter.add(this.jButtonEliminarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
			
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = 0;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDelimiter.add(this.jButtonActualizarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);


		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = 0;		
		this.gridBagConstraintsTipoDelimiter.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDelimiter.add(this.jButtonGuardarCambiosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);	
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = 0;		
		this.gridBagConstraintsTipoDelimiter.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDelimiter.add(this.jButtonCancelarTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDelimiter = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDelimiter);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodelimiterSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();						
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDelimiter.gridx = 0;		
			//this.gridBagConstraintsTipoDelimiter.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDelimiter.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDelimiter.gridx =0;
		this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDelimiter.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDelimiterJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDelimiter = new TipoDelimiterBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Delimiter DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Delimiter DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Delimiter Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDelimiterModel tipodelimiterModel=new TipoDelimiterModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDelimiterModel.TipoDelimiterFocusTraversalPolicy tipodelimiterFocusTraversalPolicy = tipodelimiterModel.new TipoDelimiterFocusTraversalPolicy(this);
			
			//tipodelimiterFocusTraversalPolicy.settipodelimiterJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodelimiterModel);
			
			
			this.jContentPaneDetalleTipoDelimiter = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDelimiter = new GridBagLayout();	
			this.jContentPaneDetalleTipoDelimiter.setLayout(gridaBagLayoutDetalleTipoDelimiter);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDelimiter = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
				this.gridBagConstraintsTipoDelimiter.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDelimiter.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDelimiter.add(jTtoolBarDetalleTipoDelimiter, gridBagConstraintsTipoDelimiter);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDelimiter=   new JScrollPane(jContentPaneDetalleTipoDelimiter,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDelimiter.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDelimiter.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDelimiter.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDelimiter=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDelimiter.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDelimiter.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDelimiter.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDelimiter.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDelimiter.gridx = 0;
	        
			this.jContentPaneDetalleTipoDelimiter.add(jPanelCamposTipoDelimiter, gridBagConstraintsTipoDelimiter);
			
			
			
			
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
						&& tipodelimiterSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipodelimiterSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDelimiter= new GridBagConstraints();
						this.gridBagConstraintsTipoDelimiter.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDelimiter.gridx = 0;
						this.jContentPaneDetalleTipoDelimiter.add(this.jTabbedPaneRelacionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDelimiter.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDelimiter.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
					this.gridBagConstraintsTipoDelimiter.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDelimiter.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDelimiter.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDelimiter.add(jPanelCamposOcultosTipoDelimiter, gridBagConstraintsTipoDelimiter);
				
					this.jPanelCamposOcultosTipoDelimiter.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDelimiter.gridx = 0;
	        this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDelimiter.add(this.jPanelAccionesFormularioTipoDelimiter, this.gridBagConstraintsTipoDelimiter);							
			
			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
	        this.gridBagConstraintsTipoDelimiter.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDelimiter.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDelimiter.add(this.jPanelAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDelimiter);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDelimiter=   new JScrollPane(this.jPanelCamposTipoDelimiter,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDelimiter.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDelimiter.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDelimiter.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDelimiter.gridx = 0;
			this.gridBagConstraintsTipoDelimiter.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDelimiter.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDelimiter.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDelimiter.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDelimiter, this.gridBagConstraintsTipoDelimiter);			
			
			this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
			this.gridBagConstraintsTipoDelimiter.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDelimiter.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
			
			
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		
			
		this.gridBagConstraintsTipoDelimiter = new GridBagConstraints();
		this.gridBagConstraintsTipoDelimiter.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDelimiter.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDelimiter, this.gridBagConstraintsTipoDelimiter);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDelimiter;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDelimiter;
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
