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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoServicioConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoServicioDetalleFormJInternalFrame extends TipoServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoServicio;
	
	protected JMenuBar jmenuBarDetalleTipoServicio;
	
	protected JMenu jmenuDetalleTipoServicio;
	protected JMenu jmenuDetalleArchivoTipoServicio;
	protected JMenu jmenuDetalleAccionesTipoServicio;
	protected JMenu jmenuDetalleDatosTipoServicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoServicio;	
	protected GridBagConstraints gridBagConstraintsTipoServicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoServicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoServicio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoServicioSessionBean tiposervicioSessionBean;
	
	

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
		
	
	public TipoServicioLogic tiposervicioLogic;
	
	public JScrollPane jScrollPanelDatosTipoServicio;
	public JScrollPane jScrollPanelDatosEdicionTipoServicio;
	public JScrollPane jScrollPanelDatosGeneralTipoServicio;
	
	protected JPanel jPanelCamposTipoServicio;    
	protected JPanel jPanelCamposOcultosTipoServicio;    	
	protected JPanel jPanelAccionesTipoServicio;
	protected JPanel jPanelAccionesFormularioTipoServicio;
    
	
	
	protected Integer iXPanelCamposTipoServicio=0;
	protected Integer iYPanelCamposTipoServicio=0;
	
	protected Integer iXPanelCamposOcultosTipoServicio=0;
	protected Integer iYPanelCamposOcultosTipoServicio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoServicio;
	public JButton jButtonModificarTipoServicio;
	public JButton jButtonActualizarTipoServicio;
    public JButton jButtonEliminarTipoServicio;
	public JButton jButtonCancelarTipoServicio;
    public JButton jButtonGuardarCambiosTipoServicio;
	public JButton jButtonGuardarCambiosTablaTipoServicio;
	protected JButton jButtonCerrarTipoServicio;
	
	
	protected JButton jButtonProcesarInformacionTipoServicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoServicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoServicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoServicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoServicio;
	protected JButton jButtonModificarToolBarTipoServicio;
	protected JButton jButtonActualizarToolBarTipoServicio;
    protected JButton jButtonEliminarToolBarTipoServicio;
	protected JButton jButtonCancelarToolBarTipoServicio;
    protected JButton jButtonGuardarCambiosToolBarTipoServicio;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoServicio;
	protected JButton jButtonCerrarToolBarTipoServicio;
	
	protected JButton jButtonProcesarInformacionToolBarTipoServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoServicio;
	protected JMenuItem jMenuItemModificarTipoServicio;
	protected JMenuItem jMenuItemActualizarTipoServicio;
    protected JMenuItem jMenuItemEliminarTipoServicio;
	protected JMenuItem jMenuItemCancelarTipoServicio;
    protected JMenuItem jMenuItemGuardarCambiosTipoServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoServicio;
	protected JMenuItem jMenuItemCerrarTipoServicio;
	protected JMenuItem jMenuItemDetalleCerrarTipoServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoServicio;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoServicio;
	protected JMenuItem jMenuItemMostrarOcultarTipoServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoServicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoServicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoServicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoServicio;
	public JLabel jLabelIdTipoServicio;
	public JTextFieldMe jTextFieldidTipoServicio;
	public JButton jButtonidTipoServicioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoServicio;
	public JLabel jLabelcodigoTipoServicio;
	public JTextField jTextFieldcodigoTipoServicio;
	public JButton jButtoncodigoTipoServicioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoServicio;
	public JLabel jLabelnombreTipoServicio;
	public JTextField jTextFieldnombreTipoServicio;
	public JButton jButtonnombreTipoServicioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoServicio;
	
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
	
	public TipoServicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoServicio=new JPanel();
				this.jPanelAccionesFormularioTipoServicio=new JPanel();
				this.jmenuBarDetalleTipoServicio=new JMenuBar();
				this.jTtoolBarDetalleTipoServicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoServicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoServicio() {
		return this.jButtonActualizarToolBarTipoServicio;
	}
	
	public JButton getjButtonEliminarToolBarTipoServicio() {
		return this.jButtonEliminarToolBarTipoServicio;
	}
	
	public JButton getjButtonCancelarToolBarTipoServicio() {
		return this.jButtonCancelarToolBarTipoServicio;
	}		
	
	public JButton getjButtonProcesarInformacionTipoServicio() {
		return this.jButtonProcesarInformacionTipoServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoServicio)	{
		this.jButtonProcesarInformacionTipoServicio = jButtonProcesarInformacionTipoServicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoServicio() {
		return this.jComboBoxTiposAccionesTipoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoServicio(
			JComboBox jComboBoxTiposRelacionesTipoServicio) {
		this.jComboBoxTiposRelacionesTipoServicio = jComboBoxTiposRelacionesTipoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoServicio(
			JComboBox jComboBoxTiposAccionesTipoServicio) {
		this.jComboBoxTiposAccionesTipoServicio = jComboBoxTiposAccionesTipoServicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoServicio() {
		return this.jComboBoxTiposAccionesFormularioTipoServicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoServicio(
			JComboBox jComboBoxTiposAccionesFormularioTipoServicio) {
		this.jComboBoxTiposAccionesFormularioTipoServicio = jComboBoxTiposAccionesFormularioTipoServicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiposervicioSessionBean=new TipoServicioSessionBean();
		
		this.tiposervicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposervicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposervicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoServicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoServicio=new JButtonMe();
				this.jButtonModificarToolBarTipoServicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoServicio,this.jTtoolBarDetalleTipoServicio,
							"actualizar","actualizar","Actualizar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoServicio,this.jTtoolBarDetalleTipoServicio,
							"eliminar","eliminar","Eliminar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoServicio,this.jTtoolBarDetalleTipoServicio,
							"cancelar","cancelar","Cancelar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoServicio,this.jTtoolBarDetalleTipoServicio,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoServicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoServicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoServicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoServicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoServicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoServicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoServicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoServicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoServicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoServicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoServicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoServicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoServicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoServicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoServicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoServicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoServicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoServicio.add(this.jMenuItemDetalleCerrarTipoServicio);
		
		this.jmenuDetalleAccionesTipoServicio.add(this.jMenuItemActualizarTipoServicio);
		this.jmenuDetalleAccionesTipoServicio.add(this.jMenuItemEliminarTipoServicio);
		this.jmenuDetalleAccionesTipoServicio.add(this.jMenuItemCancelarTipoServicio);		
		
		//this.jmenuDetalleDatosTipoServicio.add(this.jMenuItemDetalleAbrirOrderByTipoServicio);				
		this.jmenuDetalleDatosTipoServicio.add(this.jMenuItemDetalleMostarOcultarTipoServicio);				
				
		//this.jmenuDetalleAccionesTipoServicio.add(this.jMenuItemGuardarCambiosTipoServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoServicio.add(this.jmenuDetalleArchivoTipoServicio);		
		this.jmenuBarDetalleTipoServicio.add(this.jmenuDetalleAccionesTipoServicio);		
		this.jmenuBarDetalleTipoServicio.add(this.jmenuDetalleDatosTipoServicio);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoServicio.add(this.jmenuDetalleTipoServicio);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoServicio);				
	}
	
	
	public void inicializarElementosCamposTipoServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoServicio = new JLabelMe();
		jLabelIdTipoServicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoServicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoServicio.setToolTipText(TipoServicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoServicio= new GridBagLayout();

		this.jPanelidTipoServicio.setLayout(this.gridaBagLayoutTipoServicio);

		jTextFieldidTipoServicio = new JTextFieldMe();
		jTextFieldidTipoServicio.setText("Id");

		jTextFieldidTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoServicio = new JLabelMe();
		this.jLabelcodigoTipoServicio.setText(""+TipoServicioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoServicio.setToolTipText("Codigo");
		this.jLabelcodigoTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoServicio.setToolTipText(TipoServicioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoServicio = new GridBagLayout();
		this.jPanelcodigoTipoServicio.setLayout(this.gridaBagLayoutTipoServicio);


		jTextFieldcodigoTipoServicio= new JTextFieldMe();

		jTextFieldcodigoTipoServicio.setEnabled(false);
		jTextFieldcodigoTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoServicioBusqueda= new JButtonMe();
		this.jButtoncodigoTipoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoServicioBusqueda.setText("U");
		this.jButtoncodigoTipoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoServicioBusqueda"));

		if(this.tiposervicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoServicioBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoServicio = new JLabelMe();
		this.jLabelnombreTipoServicio.setText(""+TipoServicioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoServicio.setToolTipText("Nombre");
		this.jLabelnombreTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoServicio.setToolTipText(TipoServicioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoServicio = new GridBagLayout();
		this.jPanelnombreTipoServicio.setLayout(this.gridaBagLayoutTipoServicio);


		jTextFieldnombreTipoServicio= new JTextFieldMe();

		jTextFieldnombreTipoServicio.setEnabled(false);
		jTextFieldnombreTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoServicioBusqueda= new JButtonMe();
		this.jButtonnombreTipoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoServicioBusqueda.setText("U");
		this.jButtonnombreTipoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoServicioBusqueda"));

		if(this.tiposervicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoServicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoServicio() {
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
		//this.jInternalFrameDetalleTipoServicio = new TipoServicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Servicio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoServicio= new GridBagLayout();
		

		
		String sToolTipTipoServicio="";
		sToolTipTipoServicio=TipoServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoServicio+="(Inventario.TipoServicio)";
		}
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoServicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoServicio = new JButtonMe();
		this.jButtonModificarTipoServicio = new JButtonMe();
        this.jButtonActualizarTipoServicio = new JButtonMe();
        this.jButtonEliminarTipoServicio = new JButtonMe();
        this.jButtonCancelarTipoServicio = new JButtonMe();
        this.jButtonGuardarCambiosTipoServicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoServicio = new JButtonMe();
		this.jButtonCerrarTipoServicio = new JButtonMe();
		
		this.jScrollPanelDatosTipoServicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoServicio = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoServicio = new JScrollPane();
				
		
		
		this.jPanelCamposTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Servicio";
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Servicioes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoServicio.setName("jPanelCamposTipoServicio"); 

		this.jPanelCamposOcultosTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoServicio.setName("jPanelCamposOcultosTipoServicio"); 

        this.jPanelAccionesTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoServicio.setToolTipText("Acciones");
        this.jPanelAccionesTipoServicio.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoServicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoServicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoServicio.setText("Nuevo");
		this.jButtonModificarTipoServicio.setText("Editar");
        this.jButtonActualizarTipoServicio.setText("Actualizar");
        this.jButtonEliminarTipoServicio.setText("Eliminar");
        this.jButtonCancelarTipoServicio.setText("Cancelar");
        this.jButtonGuardarCambiosTipoServicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoServicio.setText("Guardar");
		this.jButtonCerrarTipoServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoServicio,"nuevo_button","Nuevo",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoServicio,"modificar_button","Editar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoServicio,"actualizar_button","Actualizar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoServicio,"eliminar_button","Eliminar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoServicio,"cancelar_button","Cancelar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoServicio,"guardarcambios_button","Guardar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoServicio,"guardarcambiostabla_button","Guardar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoServicio,"cerrar_button","Salir",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoServicio.setToolTipText("Nuevo"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoServicio.setToolTipText("Editar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoServicio.setToolTipText("Actualizar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoServicio.setToolTipText("Eliminar)"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoServicio.setToolTipText("Cancelar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoServicio.setToolTipText("Guardar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoServicio.setToolTipText("Guardar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoServicio.setToolTipText("Salir"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoServicio";
		inputMap = this.jButtonNuevoTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoServicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoServicio";
		inputMap = this.jButtonActualizarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoServicio"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoServicio";
		inputMap = this.jButtonEliminarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoServicio"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoServicio";
		inputMap = this.jButtonCancelarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoServicio"));
		
		//CERRAR		
		sMapKey = "CerrarTipoServicio";
		inputMap = this.jButtonCerrarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoServicio";
		inputMap = this.jButtonGuardarCambiosTablaTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoServicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoServicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoServicio.setToolTipText("Nuevo TipoServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoServicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoServicio.setToolTipText("Sin Cerrar Ventana TipoServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoServicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoServicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoServicio.setText("Accion");
		this.jComboBoxTiposAccionesTipoServicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoServicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoServicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoServicio = new JLabelMe();
		
		this.jLabelAccionesTipoServicio.setText("Acciones");		
		this.jLabelAccionesTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoServicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoServicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoServicio=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoServicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoServicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoServicio = new GridBagLayout();
		
		this.jPanelCamposTipoServicio.setLayout(gridaBagLayoutCamposTipoServicio);
		this.jPanelCamposOcultosTipoServicio.setLayout(gridaBagLayoutCamposOcultosTipoServicio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoServicio.gridy = 0;
	this.gridBagConstraintsTipoServicio.gridx = 0;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoServicio.add(jLabelIdTipoServicio, this.gridBagConstraintsTipoServicio);



	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoServicio.gridy = 0;
	this.gridBagConstraintsTipoServicio.gridx = 1;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoServicio.add(jTextFieldidTipoServicio, this.gridBagConstraintsTipoServicio);


	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoServicio.gridy = 0;
	this.gridBagConstraintsTipoServicio.gridx = 0;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoServicio.add(jLabelcodigoTipoServicio, this.gridBagConstraintsTipoServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		//this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = 0;
		this.gridBagConstraintsTipoServicio.gridx = 2;
		this.gridBagConstraintsTipoServicio.ipadx = 0;
		this.gridBagConstraintsTipoServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoServicio.add(jButtoncodigoTipoServicioBusqueda, this.gridBagConstraintsTipoServicio);
	}

	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoServicio.gridy = 0;
	this.gridBagConstraintsTipoServicio.gridx = 1;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoServicio.add(jTextFieldcodigoTipoServicio, this.gridBagConstraintsTipoServicio);


	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoServicio.gridy = 0;
	this.gridBagConstraintsTipoServicio.gridx = 0;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoServicio.add(jLabelnombreTipoServicio, this.gridBagConstraintsTipoServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		//this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = 0;
		this.gridBagConstraintsTipoServicio.gridx = 2;
		this.gridBagConstraintsTipoServicio.ipadx = 0;
		this.gridBagConstraintsTipoServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoServicio.add(jButtonnombreTipoServicioBusqueda, this.gridBagConstraintsTipoServicio);
	}

	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoServicio.gridy = 0;
	this.gridBagConstraintsTipoServicio.gridx = 1;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoServicio.add(jTextFieldnombreTipoServicio, this.gridBagConstraintsTipoServicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoServicio.gridy = iYPanelCamposTipoServicio;
	this.gridBagConstraintsTipoServicio.gridx = iXPanelCamposTipoServicio++;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoServicio.add(this.jPanelidTipoServicio, this.gridBagConstraintsTipoServicio);



	if(iXPanelCamposTipoServicio % 1==0) {
		iXPanelCamposTipoServicio=0;
		iYPanelCamposTipoServicio++;
	}
	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoServicio.gridy = iYPanelCamposTipoServicio;
	this.gridBagConstraintsTipoServicio.gridx = iXPanelCamposTipoServicio++;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoServicio.add(this.jPanelcodigoTipoServicio, this.gridBagConstraintsTipoServicio);



	if(iXPanelCamposTipoServicio % 1==0) {
		iXPanelCamposTipoServicio=0;
		iYPanelCamposTipoServicio++;
	}
	this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoServicio.gridy = iYPanelCamposTipoServicio;
	this.gridBagConstraintsTipoServicio.gridx = iXPanelCamposTipoServicio++;
	this.gridBagConstraintsTipoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoServicio.add(this.jPanelnombreTipoServicio, this.gridBagConstraintsTipoServicio);



	if(iXPanelCamposTipoServicio % 1==0) {
		iXPanelCamposTipoServicio=0;
		iYPanelCamposTipoServicio++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoServicio= new GridBagLayout();
		this.jPanelAccionesTipoServicio.setLayout(gridaBagLayoutAccionesTipoServicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoServicio= new GridBagLayout();
		this.jPanelAccionesFormularioTipoServicio.setLayout(gridaBagLayoutAccionesFormularioTipoServicio);
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoServicio.add(this.jComboBoxTiposAccionesFormularioTipoServicio, this.gridBagConstraintsTipoServicio);

		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoServicio.add(this.jCheckBoxPostAccionNuevoTipoServicio, this.gridBagConstraintsTipoServicio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoServicio.add(this.jCheckBoxPostAccionSinCerrarTipoServicio, this.gridBagConstraintsTipoServicio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiposervicioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoServicio.add(this.jCheckBoxPostAccionSinMensajeTipoServicio, this.gridBagConstraintsTipoServicio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = 0;
		this.gridBagConstraintsTipoServicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoServicio.add(this.jButtonModificarTipoServicio, this.gridBagConstraintsTipoServicio);							

		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = 0;
		this.gridBagConstraintsTipoServicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoServicio.add(this.jButtonEliminarTipoServicio, this.gridBagConstraintsTipoServicio);
		
			
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = 0;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoServicio.add(this.jButtonActualizarTipoServicio, this.gridBagConstraintsTipoServicio);


		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = 0;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoServicio.add(this.jButtonGuardarCambiosTipoServicio, this.gridBagConstraintsTipoServicio);	
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = 0;		
		this.gridBagConstraintsTipoServicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoServicio.add(this.jButtonCancelarTipoServicio, this.gridBagConstraintsTipoServicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoServicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();						
			this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoServicio.gridx = 0;		
			//this.gridBagConstraintsTipoServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoServicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoServicio.gridx =0;
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoServicio, this.gridBagConstraintsTipoServicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoServicio = new TipoServicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Servicio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Servicio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Servicio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoServicioModel tiposervicioModel=new TipoServicioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoServicioModel.TipoServicioFocusTraversalPolicy tiposervicioFocusTraversalPolicy = tiposervicioModel.new TipoServicioFocusTraversalPolicy(this);
			
			//tiposervicioFocusTraversalPolicy.settiposervicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiposervicioModel);
			
			
			this.jContentPaneDetalleTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoServicio = new GridBagLayout();	
			this.jContentPaneDetalleTipoServicio.setLayout(gridaBagLayoutDetalleTipoServicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoServicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoServicio.gridx = 0;
					
				
				this.jContentPaneDetalleTipoServicio.add(jTtoolBarDetalleTipoServicio, gridBagConstraintsTipoServicio);								
				
}
			
			this.jScrollPanelDatosEdicionTipoServicio=   new JScrollPane(jContentPaneDetalleTipoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoServicio.gridx = 0;
	        
			this.jContentPaneDetalleTipoServicio.add(jPanelCamposTipoServicio, gridBagConstraintsTipoServicio);
			
			
			
			
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
						&& tiposervicioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.tiposervicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoServicio= new GridBagConstraints();
						this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoServicio.gridx = 0;
						this.jContentPaneDetalleTipoServicio.add(this.jTabbedPaneRelacionesTipoServicio, this.gridBagConstraintsTipoServicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoServicio.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoServicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoServicio = new GridBagConstraints();
					this.gridBagConstraintsTipoServicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoServicio.gridx = 0;
					
				
					this.jContentPaneDetalleTipoServicio.add(jPanelCamposOcultosTipoServicio, gridBagConstraintsTipoServicio);
				
					this.jPanelCamposOcultosTipoServicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoServicio.gridx = 0;
	        this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoServicio.add(this.jPanelAccionesFormularioTipoServicio, this.gridBagConstraintsTipoServicio);							
			
			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
	        this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoServicio.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoServicio.add(this.jPanelAccionesTipoServicio, this.gridBagConstraintsTipoServicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoServicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoServicio=   new JScrollPane(this.jPanelCamposTipoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoServicio.gridx = 0;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoServicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoServicio, this.gridBagConstraintsTipoServicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoServicio, this.gridBagConstraintsTipoServicio);			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoServicio, this.gridBagConstraintsTipoServicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoServicio, this.gridBagConstraintsTipoServicio);
			
			
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoServicio, this.gridBagConstraintsTipoServicio);
		
			
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoServicio, this.gridBagConstraintsTipoServicio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoServicio;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoServicio;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsTipoServicio = new GridBagConstraints();
				//this.gridBagConstraintsTipoServicio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoServicio.gridx = 0;
				//this.jContentPaneDetalleTipoServicio.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoServicio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoServicio.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoServicio.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesTipoServicio.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<TipoServicio> tiposervicios,TipoServicio tiposervicio,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.tiposervicioLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.settiposerviciosForeignKey(tiposervicios);
					parametroinventariodefectoBeanSwingJInternalFrame.settiposervicioForeignKey(tiposervicio);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoServicio(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidTipoServicioActual(tiposervicio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoServicio(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_tipo_servicioFK_IdTipoServicio(tiposervicio.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoServicioForeignKey(tiposervicio,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoServicio");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoServicio");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

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
