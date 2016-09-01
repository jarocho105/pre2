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


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


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
import com.bydan.erp.seguridad.util.TipoOperacionConstantesFunciones;

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
public class TipoOperacionDetalleFormJInternalFrame extends TipoOperacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoOperacion;
	
	protected JMenuBar jmenuBarDetalleTipoOperacion;
	
	protected JMenu jmenuDetalleTipoOperacion;
	protected JMenu jmenuDetalleArchivoTipoOperacion;
	protected JMenu jmenuDetalleAccionesTipoOperacion;
	protected JMenu jmenuDetalleDatosTipoOperacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoOperacion;	
	protected GridBagConstraints gridBagConstraintsTipoOperacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoOperacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoOperacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoOperacionSessionBean tipooperacionSessionBean;
	
	
	
		
	
	public TipoOperacionLogic tipooperacionLogic;
	
	public JScrollPane jScrollPanelDatosTipoOperacion;
	public JScrollPane jScrollPanelDatosEdicionTipoOperacion;
	public JScrollPane jScrollPanelDatosGeneralTipoOperacion;
	
	protected JPanel jPanelCamposTipoOperacion;    
	protected JPanel jPanelCamposOcultosTipoOperacion;    	
	protected JPanel jPanelAccionesTipoOperacion;
	protected JPanel jPanelAccionesFormularioTipoOperacion;
    
	
	
	protected Integer iXPanelCamposTipoOperacion=0;
	protected Integer iYPanelCamposTipoOperacion=0;
	
	protected Integer iXPanelCamposOcultosTipoOperacion=0;
	protected Integer iYPanelCamposOcultosTipoOperacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoOperacion;
	public JButton jButtonModificarTipoOperacion;
	public JButton jButtonActualizarTipoOperacion;
    public JButton jButtonEliminarTipoOperacion;
	public JButton jButtonCancelarTipoOperacion;
    public JButton jButtonGuardarCambiosTipoOperacion;
	public JButton jButtonGuardarCambiosTablaTipoOperacion;
	protected JButton jButtonCerrarTipoOperacion;
	
	
	protected JButton jButtonProcesarInformacionTipoOperacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoOperacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoOperacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoOperacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoOperacion;
	protected JButton jButtonModificarToolBarTipoOperacion;
	protected JButton jButtonActualizarToolBarTipoOperacion;
    protected JButton jButtonEliminarToolBarTipoOperacion;
	protected JButton jButtonCancelarToolBarTipoOperacion;
    protected JButton jButtonGuardarCambiosToolBarTipoOperacion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoOperacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoOperacion;
	protected JButton jButtonCerrarToolBarTipoOperacion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoOperacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoOperacion;
	protected JMenuItem jMenuItemModificarTipoOperacion;
	protected JMenuItem jMenuItemActualizarTipoOperacion;
    protected JMenuItem jMenuItemEliminarTipoOperacion;
	protected JMenuItem jMenuItemCancelarTipoOperacion;
    protected JMenuItem jMenuItemGuardarCambiosTipoOperacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoOperacion;
	protected JMenuItem jMenuItemCerrarTipoOperacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoOperacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoOperacion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoOperacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoOperacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoOperacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoOperacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoOperacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoOperacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoOperacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoOperacion;
	public JLabel jLabelIdTipoOperacion;
	public JTextFieldMe jTextFieldidTipoOperacion;
	public JButton jButtonidTipoOperacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoOperacion;
	public JLabel jLabelcodigoTipoOperacion;
	public JTextField jTextFieldcodigoTipoOperacion;
	public JButton jButtoncodigoTipoOperacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoOperacion;
	public JLabel jLabelnombreTipoOperacion;
	public JTextArea jTextAreanombreTipoOperacion;
	public JScrollPane jscrollPanenombreTipoOperacion;
	public JButton jButtonnombreTipoOperacionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoOperacion;
	
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
	
	public TipoOperacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoOperacion=new JPanel();
				this.jPanelAccionesFormularioTipoOperacion=new JPanel();
				this.jmenuBarDetalleTipoOperacion=new JMenuBar();
				this.jTtoolBarDetalleTipoOperacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoOperacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoOperacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoOperacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoOperacion() {
		return this.jButtonActualizarToolBarTipoOperacion;
	}
	
	public JButton getjButtonEliminarToolBarTipoOperacion() {
		return this.jButtonEliminarToolBarTipoOperacion;
	}
	
	public JButton getjButtonCancelarToolBarTipoOperacion() {
		return this.jButtonCancelarToolBarTipoOperacion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoOperacion() {
		return this.jButtonProcesarInformacionTipoOperacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoOperacion)	{
		this.jButtonProcesarInformacionTipoOperacion = jButtonProcesarInformacionTipoOperacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoOperacion() {
		return this.jComboBoxTiposAccionesTipoOperacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoOperacion(
			JComboBox jComboBoxTiposRelacionesTipoOperacion) {
		this.jComboBoxTiposRelacionesTipoOperacion = jComboBoxTiposRelacionesTipoOperacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoOperacion(
			JComboBox jComboBoxTiposAccionesTipoOperacion) {
		this.jComboBoxTiposAccionesTipoOperacion = jComboBoxTiposAccionesTipoOperacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoOperacion() {
		return this.jComboBoxTiposAccionesFormularioTipoOperacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoOperacion(
			JComboBox jComboBoxTiposAccionesFormularioTipoOperacion) {
		this.jComboBoxTiposAccionesFormularioTipoOperacion = jComboBoxTiposAccionesFormularioTipoOperacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipooperacionSessionBean=new TipoOperacionSessionBean();
		
		this.tipooperacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipooperacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipooperacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoOperacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoOperacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoOperacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Operacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoOperacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoOperacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoOperacion=new JButtonMe();
				this.jButtonModificarToolBarTipoOperacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoOperacion,this.jTtoolBarDetalleTipoOperacion,
							"actualizar","actualizar","Actualizar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoOperacion,this.jTtoolBarDetalleTipoOperacion,
							"eliminar","eliminar","Eliminar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoOperacion,this.jTtoolBarDetalleTipoOperacion,
							"cancelar","cancelar","Cancelar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoOperacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoOperacion,this.jTtoolBarDetalleTipoOperacion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoOperacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoOperacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoOperacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoOperacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoOperacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoOperacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoOperacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoOperacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoOperacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoOperacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoOperacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoOperacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoOperacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoOperacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoOperacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoOperacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoOperacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoOperacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoOperacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoOperacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoOperacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoOperacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoOperacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoOperacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoOperacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoOperacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoOperacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoOperacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoOperacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoOperacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoOperacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoOperacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoOperacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoOperacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoOperacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoOperacion.add(this.jMenuItemDetalleCerrarTipoOperacion);
		
		this.jmenuDetalleAccionesTipoOperacion.add(this.jMenuItemActualizarTipoOperacion);
		this.jmenuDetalleAccionesTipoOperacion.add(this.jMenuItemEliminarTipoOperacion);
		this.jmenuDetalleAccionesTipoOperacion.add(this.jMenuItemCancelarTipoOperacion);		
		
		//this.jmenuDetalleDatosTipoOperacion.add(this.jMenuItemDetalleAbrirOrderByTipoOperacion);				
		this.jmenuDetalleDatosTipoOperacion.add(this.jMenuItemDetalleMostarOcultarTipoOperacion);				
				
		//this.jmenuDetalleAccionesTipoOperacion.add(this.jMenuItemGuardarCambiosTipoOperacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoOperacion.add(this.jmenuDetalleArchivoTipoOperacion);		
		this.jmenuBarDetalleTipoOperacion.add(this.jmenuDetalleAccionesTipoOperacion);		
		this.jmenuBarDetalleTipoOperacion.add(this.jmenuDetalleDatosTipoOperacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoOperacion);				
	}
	
	
	public void inicializarElementosCamposTipoOperacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoOperacion = new JLabelMe();
		jLabelIdTipoOperacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoOperacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoOperacion.setToolTipText(TipoOperacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoOperacion= new GridBagLayout();

		this.jPanelidTipoOperacion.setLayout(this.gridaBagLayoutTipoOperacion);

		jTextFieldidTipoOperacion = new JTextFieldMe();
		jTextFieldidTipoOperacion.setText("Id");

		jTextFieldidTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoOperacion = new JLabelMe();
		this.jLabelcodigoTipoOperacion.setText(""+TipoOperacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoOperacion.setToolTipText("Codigo");
		this.jLabelcodigoTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoOperacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoOperacion.setToolTipText(TipoOperacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoOperacion = new GridBagLayout();
		this.jPanelcodigoTipoOperacion.setLayout(this.gridaBagLayoutTipoOperacion);


		jTextFieldcodigoTipoOperacion= new JTextFieldMe();

		jTextFieldcodigoTipoOperacion.setEnabled(false);
		jTextFieldcodigoTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoOperacionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoOperacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoOperacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoOperacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoOperacionBusqueda.setText("U");
		this.jButtoncodigoTipoOperacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoOperacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoOperacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoOperacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoOperacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoOperacionBusqueda"));

		if(this.tipooperacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoOperacionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoOperacion = new JLabelMe();
		this.jLabelnombreTipoOperacion.setText(""+TipoOperacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoOperacion.setToolTipText("Nombre");
		this.jLabelnombreTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoOperacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoOperacion.setToolTipText(TipoOperacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoOperacion = new GridBagLayout();
		this.jPanelnombreTipoOperacion.setLayout(this.gridaBagLayoutTipoOperacion);


		jTextAreanombreTipoOperacion= new JTextAreaMe();
		jTextAreanombreTipoOperacion.setEnabled(false);
		jTextAreanombreTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoOperacion.setLineWrap(true);
		jTextAreanombreTipoOperacion.setWrapStyleWord(true);
		jTextAreanombreTipoOperacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoOperacion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoOperacion = new JScrollPane(jTextAreanombreTipoOperacion);
		jscrollPanenombreTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoOperacionBusqueda= new JButtonMe();
		this.jButtonnombreTipoOperacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoOperacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoOperacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoOperacionBusqueda.setText("U");
		this.jButtonnombreTipoOperacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoOperacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoOperacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoOperacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoOperacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoOperacionBusqueda"));

		if(this.tipooperacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoOperacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoOperacion() {
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
		//this.jInternalFrameDetalleTipoOperacion = new TipoOperacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Operacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoOperacion= new GridBagLayout();
		

		
		String sToolTipTipoOperacion="";
		sToolTipTipoOperacion=TipoOperacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoOperacion+="(Seguridad.TipoOperacion)";
		}
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoOperacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoOperacion = new JButtonMe();
		this.jButtonModificarTipoOperacion = new JButtonMe();
        this.jButtonActualizarTipoOperacion = new JButtonMe();
        this.jButtonEliminarTipoOperacion = new JButtonMe();
        this.jButtonCancelarTipoOperacion = new JButtonMe();
        this.jButtonGuardarCambiosTipoOperacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoOperacion = new JButtonMe();
		this.jButtonCerrarTipoOperacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoOperacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoOperacion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoOperacion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Operacion";
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Operacions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoOperacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoOperacion.setName("jPanelCamposTipoOperacion"); 

		this.jPanelCamposOcultosTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoOperacion.setName("jPanelCamposOcultosTipoOperacion"); 

        this.jPanelAccionesTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoOperacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoOperacion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoOperacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoOperacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoOperacion.setText("Nuevo");
		this.jButtonModificarTipoOperacion.setText("Editar");
        this.jButtonActualizarTipoOperacion.setText("Actualizar");
        this.jButtonEliminarTipoOperacion.setText("Eliminar");
        this.jButtonCancelarTipoOperacion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoOperacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoOperacion.setText("Guardar");
		this.jButtonCerrarTipoOperacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoOperacion,"nuevo_button","Nuevo",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoOperacion,"modificar_button","Editar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoOperacion,"actualizar_button","Actualizar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoOperacion,"eliminar_button","Eliminar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoOperacion,"cancelar_button","Cancelar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoOperacion,"guardarcambios_button","Guardar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoOperacion,"guardarcambiostabla_button","Guardar",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoOperacion,"cerrar_button","Salir",this.tipooperacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoOperacion.setToolTipText("Nuevo"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoOperacion.setToolTipText("Editar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoOperacion.setToolTipText("Actualizar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoOperacion.setToolTipText("Eliminar)"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoOperacion.setToolTipText("Cancelar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoOperacion.setToolTipText("Guardar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoOperacion.setToolTipText("Guardar"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoOperacion.setToolTipText("Salir"+" "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoOperacion";
		inputMap = this.jButtonNuevoTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoOperacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoOperacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoOperacion";
		inputMap = this.jButtonActualizarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoOperacion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoOperacion";
		inputMap = this.jButtonEliminarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoOperacion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoOperacion";
		inputMap = this.jButtonCancelarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoOperacion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoOperacion";
		inputMap = this.jButtonCerrarTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoOperacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoOperacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoOperacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoOperacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoOperacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoOperacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoOperacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoOperacion.setToolTipText("Nuevo TipoOperacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoOperacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoOperacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoOperacion.setToolTipText("Sin Cerrar Ventana TipoOperacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoOperacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoOperacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoOperacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoOperacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoOperacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoOperacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoOperacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoOperacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoOperacion = new JLabelMe();
		
		this.jLabelAccionesTipoOperacion.setText("Acciones");		
		this.jLabelAccionesTipoOperacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoOperacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoOperacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoOperacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoOperacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoOperacion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoOperacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoOperacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoOperacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoOperacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoOperacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoOperacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoOperacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoOperacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoOperacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoOperacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoOperacion = new GridBagLayout();
		
		this.jPanelCamposTipoOperacion.setLayout(gridaBagLayoutCamposTipoOperacion);
		this.jPanelCamposOcultosTipoOperacion.setLayout(gridaBagLayoutCamposOcultosTipoOperacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoOperacion.gridy = 0;
	this.gridBagConstraintsTipoOperacion.gridx = 0;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoOperacion.add(jLabelIdTipoOperacion, this.gridBagConstraintsTipoOperacion);



	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoOperacion.gridy = 0;
	this.gridBagConstraintsTipoOperacion.gridx = 1;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoOperacion.add(jTextFieldidTipoOperacion, this.gridBagConstraintsTipoOperacion);


	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoOperacion.gridy = 0;
	this.gridBagConstraintsTipoOperacion.gridx = 0;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoOperacion.add(jLabelcodigoTipoOperacion, this.gridBagConstraintsTipoOperacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = 0;
		this.gridBagConstraintsTipoOperacion.gridx = 2;
		this.gridBagConstraintsTipoOperacion.ipadx = 0;
		this.gridBagConstraintsTipoOperacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoOperacion.add(jButtoncodigoTipoOperacionBusqueda, this.gridBagConstraintsTipoOperacion);
	}

	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoOperacion.gridy = 0;
	this.gridBagConstraintsTipoOperacion.gridx = 1;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoOperacion.add(jTextFieldcodigoTipoOperacion, this.gridBagConstraintsTipoOperacion);


	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoOperacion.gridy = 0;
	this.gridBagConstraintsTipoOperacion.gridx = 0;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoOperacion.add(jLabelnombreTipoOperacion, this.gridBagConstraintsTipoOperacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoOperacion.gridy = 0;
		this.gridBagConstraintsTipoOperacion.gridx = 2;
		this.gridBagConstraintsTipoOperacion.ipadx = 0;
		this.gridBagConstraintsTipoOperacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoOperacion.add(jButtonnombreTipoOperacionBusqueda, this.gridBagConstraintsTipoOperacion);
	}

	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoOperacion.gridy = 0;
	this.gridBagConstraintsTipoOperacion.gridx = 1;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoOperacion.add(jscrollPanenombreTipoOperacion, this.gridBagConstraintsTipoOperacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoOperacion.gridy = iYPanelCamposTipoOperacion;
	this.gridBagConstraintsTipoOperacion.gridx = iXPanelCamposTipoOperacion++;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoOperacion.add(this.jPanelidTipoOperacion, this.gridBagConstraintsTipoOperacion);



	if(iXPanelCamposTipoOperacion % 1==0) {
		iXPanelCamposTipoOperacion=0;
		iYPanelCamposTipoOperacion++;
	}
	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoOperacion.gridy = iYPanelCamposTipoOperacion;
	this.gridBagConstraintsTipoOperacion.gridx = iXPanelCamposTipoOperacion++;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoOperacion.add(this.jPanelcodigoTipoOperacion, this.gridBagConstraintsTipoOperacion);



	if(iXPanelCamposTipoOperacion % 1==0) {
		iXPanelCamposTipoOperacion=0;
		iYPanelCamposTipoOperacion++;
	}
	this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoOperacion.gridy = iYPanelCamposTipoOperacion;
	this.gridBagConstraintsTipoOperacion.gridx = iXPanelCamposTipoOperacion++;
	this.gridBagConstraintsTipoOperacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoOperacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoOperacion.add(this.jPanelnombreTipoOperacion, this.gridBagConstraintsTipoOperacion);



	if(iXPanelCamposTipoOperacion % 1==0) {
		iXPanelCamposTipoOperacion=0;
		iYPanelCamposTipoOperacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoOperacion= new GridBagLayout();
		this.jPanelAccionesTipoOperacion.setLayout(gridaBagLayoutAccionesTipoOperacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoOperacion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoOperacion.setLayout(gridaBagLayoutAccionesFormularioTipoOperacion);
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoOperacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoOperacion.add(this.jComboBoxTiposAccionesFormularioTipoOperacion, this.gridBagConstraintsTipoOperacion);

		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoOperacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoOperacion.add(this.jCheckBoxPostAccionNuevoTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipooperacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoOperacion.add(this.jCheckBoxPostAccionSinCerrarTipoOperacion, this.gridBagConstraintsTipoOperacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipooperacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoOperacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoOperacion.add(this.jCheckBoxPostAccionSinMensajeTipoOperacion, this.gridBagConstraintsTipoOperacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = 0;
		this.gridBagConstraintsTipoOperacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoOperacion.add(this.jButtonModificarTipoOperacion, this.gridBagConstraintsTipoOperacion);							

		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoOperacion.gridy = 0;
		this.gridBagConstraintsTipoOperacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoOperacion.add(this.jButtonEliminarTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
			
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = 0;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoOperacion.add(this.jButtonActualizarTipoOperacion, this.gridBagConstraintsTipoOperacion);


		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = 0;		
		this.gridBagConstraintsTipoOperacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoOperacion.add(this.jButtonGuardarCambiosTipoOperacion, this.gridBagConstraintsTipoOperacion);	
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = 0;		
		this.gridBagConstraintsTipoOperacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoOperacion.add(this.jButtonCancelarTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoOperacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoOperacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoOperacion.gridx = 0;		
			//this.gridBagConstraintsTipoOperacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoOperacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoOperacion.gridx =0;
		this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoOperacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoOperacion, this.gridBagConstraintsTipoOperacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoOperacion = new TipoOperacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Operacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Operacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Operacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoOperacionModel tipooperacionModel=new TipoOperacionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoOperacionModel.TipoOperacionFocusTraversalPolicy tipooperacionFocusTraversalPolicy = tipooperacionModel.new TipoOperacionFocusTraversalPolicy(this);
			
			//tipooperacionFocusTraversalPolicy.settipooperacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipooperacionModel);
			
			
			this.jContentPaneDetalleTipoOperacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoOperacion = new GridBagLayout();	
			this.jContentPaneDetalleTipoOperacion.setLayout(gridaBagLayoutDetalleTipoOperacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoOperacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
				this.gridBagConstraintsTipoOperacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoOperacion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoOperacion.add(jTtoolBarDetalleTipoOperacion, gridBagConstraintsTipoOperacion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoOperacion=   new JScrollPane(jContentPaneDetalleTipoOperacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoOperacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoOperacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoOperacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoOperacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoOperacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoOperacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoOperacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoOperacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoOperacion.gridx = 0;
	        
			this.jContentPaneDetalleTipoOperacion.add(jPanelCamposTipoOperacion, gridBagConstraintsTipoOperacion);
			
			
			
			
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
						&& tipooperacionSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoOperacion= new GridBagConstraints();
						this.gridBagConstraintsTipoOperacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoOperacion.gridx = 0;
						this.jContentPaneDetalleTipoOperacion.add(this.jTabbedPaneRelacionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoOperacion.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoOperacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
					this.gridBagConstraintsTipoOperacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoOperacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoOperacion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoOperacion.add(jPanelCamposOcultosTipoOperacion, gridBagConstraintsTipoOperacion);
				
					this.jPanelCamposOcultosTipoOperacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoOperacion.gridx = 0;
	        this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoOperacion.add(this.jPanelAccionesFormularioTipoOperacion, this.gridBagConstraintsTipoOperacion);							
			
			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
	        this.gridBagConstraintsTipoOperacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoOperacion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoOperacion.add(this.jPanelAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoOperacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoOperacion=   new JScrollPane(this.jPanelCamposTipoOperacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoOperacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoOperacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoOperacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoOperacion.gridx = 0;
			this.gridBagConstraintsTipoOperacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoOperacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoOperacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoOperacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoOperacion, this.gridBagConstraintsTipoOperacion);			
			
			this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
			this.gridBagConstraintsTipoOperacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoOperacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoOperacion, this.gridBagConstraintsTipoOperacion);
			
			
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoOperacion, this.gridBagConstraintsTipoOperacion);
		
			
		this.gridBagConstraintsTipoOperacion = new GridBagConstraints();
		this.gridBagConstraintsTipoOperacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoOperacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoOperacion, this.gridBagConstraintsTipoOperacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoOperacion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoOperacion;
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
