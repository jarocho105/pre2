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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.TipoArchivoConstantesFunciones;

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
public class TipoArchivoDetalleFormJInternalFrame extends TipoArchivoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoArchivo;
	
	protected JMenuBar jmenuBarDetalleTipoArchivo;
	
	protected JMenu jmenuDetalleTipoArchivo;
	protected JMenu jmenuDetalleArchivoTipoArchivo;
	protected JMenu jmenuDetalleAccionesTipoArchivo;
	protected JMenu jmenuDetalleDatosTipoArchivo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoArchivo;	
	protected GridBagConstraints gridBagConstraintsTipoArchivo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoArchivoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoArchivo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoArchivoSessionBean tipoarchivoSessionBean;
	
	
	
		
	
	public TipoArchivoLogic tipoarchivoLogic;
	
	public JScrollPane jScrollPanelDatosTipoArchivo;
	public JScrollPane jScrollPanelDatosEdicionTipoArchivo;
	public JScrollPane jScrollPanelDatosGeneralTipoArchivo;
	
	protected JPanel jPanelCamposTipoArchivo;    
	protected JPanel jPanelCamposOcultosTipoArchivo;    	
	protected JPanel jPanelAccionesTipoArchivo;
	protected JPanel jPanelAccionesFormularioTipoArchivo;
    
	
	
	protected Integer iXPanelCamposTipoArchivo=0;
	protected Integer iYPanelCamposTipoArchivo=0;
	
	protected Integer iXPanelCamposOcultosTipoArchivo=0;
	protected Integer iYPanelCamposOcultosTipoArchivo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoArchivo;
	public JButton jButtonModificarTipoArchivo;
	public JButton jButtonActualizarTipoArchivo;
    public JButton jButtonEliminarTipoArchivo;
	public JButton jButtonCancelarTipoArchivo;
    public JButton jButtonGuardarCambiosTipoArchivo;
	public JButton jButtonGuardarCambiosTablaTipoArchivo;
	protected JButton jButtonCerrarTipoArchivo;
	
	
	protected JButton jButtonProcesarInformacionTipoArchivo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoArchivo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoArchivo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoArchivo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoArchivo;
	protected JButton jButtonModificarToolBarTipoArchivo;
	protected JButton jButtonActualizarToolBarTipoArchivo;
    protected JButton jButtonEliminarToolBarTipoArchivo;
	protected JButton jButtonCancelarToolBarTipoArchivo;
    protected JButton jButtonGuardarCambiosToolBarTipoArchivo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoArchivo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoArchivo;
	protected JButton jButtonCerrarToolBarTipoArchivo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoArchivo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoArchivo;
	protected JMenuItem jMenuItemModificarTipoArchivo;
	protected JMenuItem jMenuItemActualizarTipoArchivo;
    protected JMenuItem jMenuItemEliminarTipoArchivo;
	protected JMenuItem jMenuItemCancelarTipoArchivo;
    protected JMenuItem jMenuItemGuardarCambiosTipoArchivo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoArchivo;
	protected JMenuItem jMenuItemCerrarTipoArchivo;
	protected JMenuItem jMenuItemDetalleCerrarTipoArchivo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoArchivo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoArchivo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoArchivo;
	protected JMenuItem jMenuItemMostrarOcultarTipoArchivo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoArchivo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoArchivo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoArchivo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoArchivo;
	public JLabel jLabelIdTipoArchivo;
	public JTextFieldMe jTextFieldidTipoArchivo;
	public JButton jButtonidTipoArchivoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoArchivo;
	public JLabel jLabelcodigoTipoArchivo;
	public JTextField jTextFieldcodigoTipoArchivo;
	public JButton jButtoncodigoTipoArchivoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoArchivo;
	public JLabel jLabelnombreTipoArchivo;
	public JTextArea jTextAreanombreTipoArchivo;
	public JScrollPane jscrollPanenombreTipoArchivo;
	public JButton jButtonnombreTipoArchivoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoArchivo;
	
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
	
	public TipoArchivoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoArchivo=new JPanel();
				this.jPanelAccionesFormularioTipoArchivo=new JPanel();
				this.jmenuBarDetalleTipoArchivo=new JMenuBar();
				this.jTtoolBarDetalleTipoArchivo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoArchivoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoArchivoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoArchivo() {
		return this.jButtonActualizarToolBarTipoArchivo;
	}
	
	public JButton getjButtonEliminarToolBarTipoArchivo() {
		return this.jButtonEliminarToolBarTipoArchivo;
	}
	
	public JButton getjButtonCancelarToolBarTipoArchivo() {
		return this.jButtonCancelarToolBarTipoArchivo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoArchivo() {
		return this.jButtonProcesarInformacionTipoArchivo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoArchivo)	{
		this.jButtonProcesarInformacionTipoArchivo = jButtonProcesarInformacionTipoArchivo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoArchivo() {
		return this.jComboBoxTiposAccionesTipoArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoArchivo(
			JComboBox jComboBoxTiposRelacionesTipoArchivo) {
		this.jComboBoxTiposRelacionesTipoArchivo = jComboBoxTiposRelacionesTipoArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoArchivo(
			JComboBox jComboBoxTiposAccionesTipoArchivo) {
		this.jComboBoxTiposAccionesTipoArchivo = jComboBoxTiposAccionesTipoArchivo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoArchivo() {
		return this.jComboBoxTiposAccionesFormularioTipoArchivo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoArchivo(
			JComboBox jComboBoxTiposAccionesFormularioTipoArchivo) {
		this.jComboBoxTiposAccionesFormularioTipoArchivo = jComboBoxTiposAccionesFormularioTipoArchivo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoarchivoSessionBean=new TipoArchivoSessionBean();
		
		this.tipoarchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoarchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoarchivoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoArchivoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoArchivoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Archivo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoArchivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoArchivo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoArchivo=new JButtonMe();
				this.jButtonModificarToolBarTipoArchivo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoArchivo,this.jTtoolBarDetalleTipoArchivo,
							"actualizar","actualizar","Actualizar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoArchivo,this.jTtoolBarDetalleTipoArchivo,
							"eliminar","eliminar","Eliminar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoArchivo,this.jTtoolBarDetalleTipoArchivo,
							"cancelar","cancelar","Cancelar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoArchivo,this.jTtoolBarDetalleTipoArchivo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoArchivo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoArchivo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoArchivo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoArchivo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoArchivo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoArchivo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoArchivo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoArchivo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoArchivo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoArchivo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoArchivo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoArchivo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoArchivo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoArchivo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoArchivo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoArchivo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoArchivo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoArchivo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoArchivo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoArchivo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoArchivo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoArchivo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoArchivo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoArchivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoArchivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoArchivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoArchivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoArchivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoArchivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoArchivo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoArchivo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoArchivo.add(this.jMenuItemDetalleCerrarTipoArchivo);
		
		this.jmenuDetalleAccionesTipoArchivo.add(this.jMenuItemActualizarTipoArchivo);
		this.jmenuDetalleAccionesTipoArchivo.add(this.jMenuItemEliminarTipoArchivo);
		this.jmenuDetalleAccionesTipoArchivo.add(this.jMenuItemCancelarTipoArchivo);		
		
		//this.jmenuDetalleDatosTipoArchivo.add(this.jMenuItemDetalleAbrirOrderByTipoArchivo);				
		this.jmenuDetalleDatosTipoArchivo.add(this.jMenuItemDetalleMostarOcultarTipoArchivo);				
				
		//this.jmenuDetalleAccionesTipoArchivo.add(this.jMenuItemGuardarCambiosTipoArchivo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoArchivo.add(this.jmenuDetalleArchivoTipoArchivo);		
		this.jmenuBarDetalleTipoArchivo.add(this.jmenuDetalleAccionesTipoArchivo);		
		this.jmenuBarDetalleTipoArchivo.add(this.jmenuDetalleDatosTipoArchivo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoArchivo);				
	}
	
	
	public void inicializarElementosCamposTipoArchivo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoArchivo = new JLabelMe();
		jLabelIdTipoArchivo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoArchivo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoArchivo.setToolTipText(TipoArchivoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoArchivo= new GridBagLayout();

		this.jPanelidTipoArchivo.setLayout(this.gridaBagLayoutTipoArchivo);

		jTextFieldidTipoArchivo = new JTextFieldMe();
		jTextFieldidTipoArchivo.setText("Id");

		jTextFieldidTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoArchivo = new JLabelMe();
		this.jLabelcodigoTipoArchivo.setText(""+TipoArchivoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoArchivo.setToolTipText("Codigo");
		this.jLabelcodigoTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoArchivo.setToolTipText(TipoArchivoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoArchivo = new GridBagLayout();
		this.jPanelcodigoTipoArchivo.setLayout(this.gridaBagLayoutTipoArchivo);


		jTextFieldcodigoTipoArchivo= new JTextFieldMe();

		jTextFieldcodigoTipoArchivo.setEnabled(false);
		jTextFieldcodigoTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoArchivoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoArchivoBusqueda.setText("U");
		this.jButtoncodigoTipoArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoArchivoBusqueda"));

		if(this.tipoarchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoArchivoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoArchivo = new JLabelMe();
		this.jLabelnombreTipoArchivo.setText(""+TipoArchivoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoArchivo.setToolTipText("Nombre");
		this.jLabelnombreTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoArchivo.setToolTipText(TipoArchivoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoArchivo = new GridBagLayout();
		this.jPanelnombreTipoArchivo.setLayout(this.gridaBagLayoutTipoArchivo);


		jTextAreanombreTipoArchivo= new JTextAreaMe();
		jTextAreanombreTipoArchivo.setEnabled(false);
		jTextAreanombreTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoArchivo.setLineWrap(true);
		jTextAreanombreTipoArchivo.setWrapStyleWord(true);
		jTextAreanombreTipoArchivo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoArchivo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoArchivo = new JScrollPane(jTextAreanombreTipoArchivo);
		jscrollPanenombreTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoArchivoBusqueda= new JButtonMe();
		this.jButtonnombreTipoArchivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoArchivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoArchivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoArchivoBusqueda.setText("U");
		this.jButtonnombreTipoArchivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoArchivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoArchivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoArchivoBusqueda"));

		if(this.tipoarchivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoArchivoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoArchivo() {
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
		//this.jInternalFrameDetalleTipoArchivo = new TipoArchivoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Archivo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoArchivo= new GridBagLayout();
		

		
		String sToolTipTipoArchivo="";
		sToolTipTipoArchivo=TipoArchivoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoArchivo+="(Seguridad.TipoArchivo)";
		}
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoArchivo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoArchivo = new JButtonMe();
		this.jButtonModificarTipoArchivo = new JButtonMe();
        this.jButtonActualizarTipoArchivo = new JButtonMe();
        this.jButtonEliminarTipoArchivo = new JButtonMe();
        this.jButtonCancelarTipoArchivo = new JButtonMe();
        this.jButtonGuardarCambiosTipoArchivo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoArchivo = new JButtonMe();
		this.jButtonCerrarTipoArchivo = new JButtonMe();
		
		this.jScrollPanelDatosTipoArchivo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoArchivo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoArchivo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Archivo";
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Archivos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoArchivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoArchivo.setName("jPanelCamposTipoArchivo"); 

		this.jPanelCamposOcultosTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoArchivo.setName("jPanelCamposOcultosTipoArchivo"); 

        this.jPanelAccionesTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoArchivo.setToolTipText("Acciones");
        this.jPanelAccionesTipoArchivo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoArchivo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoArchivo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoArchivo.setText("Nuevo");
		this.jButtonModificarTipoArchivo.setText("Editar");
        this.jButtonActualizarTipoArchivo.setText("Actualizar");
        this.jButtonEliminarTipoArchivo.setText("Eliminar");
        this.jButtonCancelarTipoArchivo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoArchivo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoArchivo.setText("Guardar");
		this.jButtonCerrarTipoArchivo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoArchivo,"nuevo_button","Nuevo",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoArchivo,"modificar_button","Editar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoArchivo,"actualizar_button","Actualizar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoArchivo,"eliminar_button","Eliminar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoArchivo,"cancelar_button","Cancelar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoArchivo,"guardarcambios_button","Guardar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoArchivo,"guardarcambiostabla_button","Guardar",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoArchivo,"cerrar_button","Salir",this.tipoarchivoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoArchivo.setToolTipText("Nuevo"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoArchivo.setToolTipText("Editar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoArchivo.setToolTipText("Actualizar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoArchivo.setToolTipText("Eliminar)"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoArchivo.setToolTipText("Cancelar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoArchivo.setToolTipText("Guardar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoArchivo.setToolTipText("Guardar"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoArchivo.setToolTipText("Salir"+" "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoArchivo";
		inputMap = this.jButtonNuevoTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoArchivo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoArchivo";
		inputMap = this.jButtonActualizarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoArchivo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoArchivo";
		inputMap = this.jButtonEliminarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoArchivo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoArchivo";
		inputMap = this.jButtonCancelarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoArchivo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoArchivo";
		inputMap = this.jButtonCerrarTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoArchivo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoArchivo";
		inputMap = this.jButtonGuardarCambiosTablaTipoArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoArchivo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoArchivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoArchivo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoArchivo.setToolTipText("Nuevo TipoArchivo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoArchivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoArchivo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoArchivo.setToolTipText("Sin Cerrar Ventana TipoArchivo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoArchivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoArchivo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoArchivo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoArchivo.setText("Accion");
		this.jComboBoxTiposAccionesTipoArchivo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoArchivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoArchivo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoArchivo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoArchivo = new JLabelMe();
		
		this.jLabelAccionesTipoArchivo.setText("Acciones");		
		this.jLabelAccionesTipoArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoArchivo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoArchivo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoArchivo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoArchivo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoArchivo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoArchivo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoArchivo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoArchivo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoArchivo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoArchivo = new GridBagLayout();
		
		this.jPanelCamposTipoArchivo.setLayout(gridaBagLayoutCamposTipoArchivo);
		this.jPanelCamposOcultosTipoArchivo.setLayout(gridaBagLayoutCamposOcultosTipoArchivo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoArchivo.gridy = 0;
	this.gridBagConstraintsTipoArchivo.gridx = 0;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoArchivo.add(jLabelIdTipoArchivo, this.gridBagConstraintsTipoArchivo);



	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoArchivo.gridy = 0;
	this.gridBagConstraintsTipoArchivo.gridx = 1;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoArchivo.add(jTextFieldidTipoArchivo, this.gridBagConstraintsTipoArchivo);


	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoArchivo.gridy = 0;
	this.gridBagConstraintsTipoArchivo.gridx = 0;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoArchivo.add(jLabelcodigoTipoArchivo, this.gridBagConstraintsTipoArchivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = 0;
		this.gridBagConstraintsTipoArchivo.gridx = 2;
		this.gridBagConstraintsTipoArchivo.ipadx = 0;
		this.gridBagConstraintsTipoArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoArchivo.add(jButtoncodigoTipoArchivoBusqueda, this.gridBagConstraintsTipoArchivo);
	}

	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoArchivo.gridy = 0;
	this.gridBagConstraintsTipoArchivo.gridx = 1;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoArchivo.add(jTextFieldcodigoTipoArchivo, this.gridBagConstraintsTipoArchivo);


	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoArchivo.gridy = 0;
	this.gridBagConstraintsTipoArchivo.gridx = 0;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoArchivo.add(jLabelnombreTipoArchivo, this.gridBagConstraintsTipoArchivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoArchivo.gridy = 0;
		this.gridBagConstraintsTipoArchivo.gridx = 2;
		this.gridBagConstraintsTipoArchivo.ipadx = 0;
		this.gridBagConstraintsTipoArchivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoArchivo.add(jButtonnombreTipoArchivoBusqueda, this.gridBagConstraintsTipoArchivo);
	}

	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoArchivo.gridy = 0;
	this.gridBagConstraintsTipoArchivo.gridx = 1;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoArchivo.add(jscrollPanenombreTipoArchivo, this.gridBagConstraintsTipoArchivo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoArchivo.gridy = iYPanelCamposTipoArchivo;
	this.gridBagConstraintsTipoArchivo.gridx = iXPanelCamposTipoArchivo++;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoArchivo.add(this.jPanelidTipoArchivo, this.gridBagConstraintsTipoArchivo);



	if(iXPanelCamposTipoArchivo % 1==0) {
		iXPanelCamposTipoArchivo=0;
		iYPanelCamposTipoArchivo++;
	}
	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoArchivo.gridy = iYPanelCamposTipoArchivo;
	this.gridBagConstraintsTipoArchivo.gridx = iXPanelCamposTipoArchivo++;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoArchivo.add(this.jPanelcodigoTipoArchivo, this.gridBagConstraintsTipoArchivo);



	if(iXPanelCamposTipoArchivo % 1==0) {
		iXPanelCamposTipoArchivo=0;
		iYPanelCamposTipoArchivo++;
	}
	this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoArchivo.gridy = iYPanelCamposTipoArchivo;
	this.gridBagConstraintsTipoArchivo.gridx = iXPanelCamposTipoArchivo++;
	this.gridBagConstraintsTipoArchivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoArchivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoArchivo.add(this.jPanelnombreTipoArchivo, this.gridBagConstraintsTipoArchivo);



	if(iXPanelCamposTipoArchivo % 1==0) {
		iXPanelCamposTipoArchivo=0;
		iYPanelCamposTipoArchivo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoArchivo= new GridBagLayout();
		this.jPanelAccionesTipoArchivo.setLayout(gridaBagLayoutAccionesTipoArchivo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoArchivo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoArchivo.setLayout(gridaBagLayoutAccionesFormularioTipoArchivo);
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoArchivo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoArchivo.add(this.jComboBoxTiposAccionesFormularioTipoArchivo, this.gridBagConstraintsTipoArchivo);

		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoArchivo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoArchivo.add(this.jCheckBoxPostAccionNuevoTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoArchivo.add(this.jCheckBoxPostAccionSinCerrarTipoArchivo, this.gridBagConstraintsTipoArchivo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoArchivo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoArchivo.add(this.jCheckBoxPostAccionSinMensajeTipoArchivo, this.gridBagConstraintsTipoArchivo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = 0;
		this.gridBagConstraintsTipoArchivo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoArchivo.add(this.jButtonModificarTipoArchivo, this.gridBagConstraintsTipoArchivo);							

		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoArchivo.gridy = 0;
		this.gridBagConstraintsTipoArchivo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoArchivo.add(this.jButtonEliminarTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
			
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = 0;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoArchivo.add(this.jButtonActualizarTipoArchivo, this.gridBagConstraintsTipoArchivo);


		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = 0;		
		this.gridBagConstraintsTipoArchivo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoArchivo.add(this.jButtonGuardarCambiosTipoArchivo, this.gridBagConstraintsTipoArchivo);	
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = 0;		
		this.gridBagConstraintsTipoArchivo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoArchivo.add(this.jButtonCancelarTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoArchivo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoArchivo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();						
			this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoArchivo.gridx = 0;		
			//this.gridBagConstraintsTipoArchivo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoArchivo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoArchivo.gridx =0;
		this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoArchivo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoArchivo, this.gridBagConstraintsTipoArchivo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoArchivo = new TipoArchivoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Archivo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Archivo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Archivo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoArchivoModel tipoarchivoModel=new TipoArchivoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoArchivoModel.TipoArchivoFocusTraversalPolicy tipoarchivoFocusTraversalPolicy = tipoarchivoModel.new TipoArchivoFocusTraversalPolicy(this);
			
			//tipoarchivoFocusTraversalPolicy.settipoarchivoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoarchivoModel);
			
			
			this.jContentPaneDetalleTipoArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoArchivo = new GridBagLayout();	
			this.jContentPaneDetalleTipoArchivo.setLayout(gridaBagLayoutDetalleTipoArchivo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoArchivo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
				this.gridBagConstraintsTipoArchivo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoArchivo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoArchivo.add(jTtoolBarDetalleTipoArchivo, gridBagConstraintsTipoArchivo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoArchivo=   new JScrollPane(jContentPaneDetalleTipoArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoArchivo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoArchivo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoArchivo.gridx = 0;
	        
			this.jContentPaneDetalleTipoArchivo.add(jPanelCamposTipoArchivo, gridBagConstraintsTipoArchivo);
			
			
			
			
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
						&& tipoarchivoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoArchivo= new GridBagConstraints();
						this.gridBagConstraintsTipoArchivo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoArchivo.gridx = 0;
						this.jContentPaneDetalleTipoArchivo.add(this.jTabbedPaneRelacionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoArchivo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoArchivo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
					this.gridBagConstraintsTipoArchivo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoArchivo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoArchivo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoArchivo.add(jPanelCamposOcultosTipoArchivo, gridBagConstraintsTipoArchivo);
				
					this.jPanelCamposOcultosTipoArchivo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoArchivo.gridx = 0;
	        this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoArchivo.add(this.jPanelAccionesFormularioTipoArchivo, this.gridBagConstraintsTipoArchivo);							
			
			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
	        this.gridBagConstraintsTipoArchivo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoArchivo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoArchivo.add(this.jPanelAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoArchivo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoArchivo=   new JScrollPane(this.jPanelCamposTipoArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoArchivo.gridx = 0;
			this.gridBagConstraintsTipoArchivo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoArchivo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoArchivo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoArchivo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoArchivo, this.gridBagConstraintsTipoArchivo);			
			
			this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
			this.gridBagConstraintsTipoArchivo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoArchivo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoArchivo, this.gridBagConstraintsTipoArchivo);
			
			
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoArchivo, this.gridBagConstraintsTipoArchivo);
		
			
		this.gridBagConstraintsTipoArchivo = new GridBagConstraints();
		this.gridBagConstraintsTipoArchivo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoArchivo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoArchivo, this.gridBagConstraintsTipoArchivo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoArchivo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoArchivo;
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
