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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoDevolucionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoDevolucionDetalleFormJInternalFrame extends TipoDevolucionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDevolucion;
	
	protected JMenuBar jmenuBarDetalleTipoDevolucion;
	
	protected JMenu jmenuDetalleTipoDevolucion;
	protected JMenu jmenuDetalleArchivoTipoDevolucion;
	protected JMenu jmenuDetalleAccionesTipoDevolucion;
	protected JMenu jmenuDetalleDatosTipoDevolucion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDevolucion;	
	protected GridBagConstraints gridBagConstraintsTipoDevolucion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDevolucionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDevolucion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoDevolucionSessionBean tipodevolucionSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoDevolucionLogic tipodevolucionLogic;
	
	public JScrollPane jScrollPanelDatosTipoDevolucion;
	public JScrollPane jScrollPanelDatosEdicionTipoDevolucion;
	public JScrollPane jScrollPanelDatosGeneralTipoDevolucion;
	
	protected JPanel jPanelCamposTipoDevolucion;    
	protected JPanel jPanelCamposOcultosTipoDevolucion;    	
	protected JPanel jPanelAccionesTipoDevolucion;
	protected JPanel jPanelAccionesFormularioTipoDevolucion;
    
	
	
	protected Integer iXPanelCamposTipoDevolucion=0;
	protected Integer iYPanelCamposTipoDevolucion=0;
	
	protected Integer iXPanelCamposOcultosTipoDevolucion=0;
	protected Integer iYPanelCamposOcultosTipoDevolucion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDevolucion;
	public JButton jButtonModificarTipoDevolucion;
	public JButton jButtonActualizarTipoDevolucion;
    public JButton jButtonEliminarTipoDevolucion;
	public JButton jButtonCancelarTipoDevolucion;
    public JButton jButtonGuardarCambiosTipoDevolucion;
	public JButton jButtonGuardarCambiosTablaTipoDevolucion;
	protected JButton jButtonCerrarTipoDevolucion;
	
	
	protected JButton jButtonProcesarInformacionTipoDevolucion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDevolucion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDevolucion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDevolucion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDevolucion;
	protected JButton jButtonModificarToolBarTipoDevolucion;
	protected JButton jButtonActualizarToolBarTipoDevolucion;
    protected JButton jButtonEliminarToolBarTipoDevolucion;
	protected JButton jButtonCancelarToolBarTipoDevolucion;
    protected JButton jButtonGuardarCambiosToolBarTipoDevolucion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDevolucion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDevolucion;
	protected JButton jButtonCerrarToolBarTipoDevolucion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDevolucion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDevolucion;
	protected JMenuItem jMenuItemModificarTipoDevolucion;
	protected JMenuItem jMenuItemActualizarTipoDevolucion;
    protected JMenuItem jMenuItemEliminarTipoDevolucion;
	protected JMenuItem jMenuItemCancelarTipoDevolucion;
    protected JMenuItem jMenuItemGuardarCambiosTipoDevolucion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDevolucion;
	protected JMenuItem jMenuItemCerrarTipoDevolucion;
	protected JMenuItem jMenuItemDetalleCerrarTipoDevolucion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDevolucion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDevolucion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDevolucion;
	protected JMenuItem jMenuItemMostrarOcultarTipoDevolucion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDevolucion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDevolucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDevolucion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDevolucion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDevolucion;
	public JLabel jLabelIdTipoDevolucion;
	public JTextFieldMe jTextFieldidTipoDevolucion;
	public JButton jButtonidTipoDevolucionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDevolucion;
	public JLabel jLabelnombreTipoDevolucion;
	public JTextArea jTextAreanombreTipoDevolucion;
	public JScrollPane jscrollPanenombreTipoDevolucion;
	public JButton jButtonnombreTipoDevolucionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoDevolucion;
	public JLabel jLabelid_paisTipoDevolucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoDevolucion;
	public JButton jButtonid_paisTipoDevolucion= new JButtonMe();
	public JButton jButtonid_paisTipoDevolucionUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoDevolucionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDevolucion;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoDevolucionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDevolucion=new JPanel();
				this.jPanelAccionesFormularioTipoDevolucion=new JPanel();
				this.jmenuBarDetalleTipoDevolucion=new JMenuBar();
				this.jTtoolBarDetalleTipoDevolucion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDevolucionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDevolucion() {
		return this.jButtonActualizarToolBarTipoDevolucion;
	}
	
	public JButton getjButtonEliminarToolBarTipoDevolucion() {
		return this.jButtonEliminarToolBarTipoDevolucion;
	}
	
	public JButton getjButtonCancelarToolBarTipoDevolucion() {
		return this.jButtonCancelarToolBarTipoDevolucion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDevolucion() {
		return this.jButtonProcesarInformacionTipoDevolucion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDevolucion)	{
		this.jButtonProcesarInformacionTipoDevolucion = jButtonProcesarInformacionTipoDevolucion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDevolucion() {
		return this.jComboBoxTiposAccionesTipoDevolucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDevolucion(
			JComboBox jComboBoxTiposRelacionesTipoDevolucion) {
		this.jComboBoxTiposRelacionesTipoDevolucion = jComboBoxTiposRelacionesTipoDevolucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDevolucion(
			JComboBox jComboBoxTiposAccionesTipoDevolucion) {
		this.jComboBoxTiposAccionesTipoDevolucion = jComboBoxTiposAccionesTipoDevolucion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDevolucion() {
		return this.jComboBoxTiposAccionesFormularioTipoDevolucion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDevolucion(
			JComboBox jComboBoxTiposAccionesFormularioTipoDevolucion) {
		this.jComboBoxTiposAccionesFormularioTipoDevolucion = jComboBoxTiposAccionesFormularioTipoDevolucion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
		
		this.tipodevolucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodevolucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodevolucionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDevolucionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDevolucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDevolucionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Devolucion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDevolucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDevolucion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDevolucion=new JButtonMe();
				this.jButtonModificarToolBarTipoDevolucion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDevolucion,this.jTtoolBarDetalleTipoDevolucion,
							"actualizar","actualizar","Actualizar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDevolucion,this.jTtoolBarDetalleTipoDevolucion,
							"eliminar","eliminar","Eliminar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDevolucion,this.jTtoolBarDetalleTipoDevolucion,
							"cancelar","cancelar","Cancelar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDevolucion,this.jTtoolBarDetalleTipoDevolucion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDevolucion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDevolucion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDevolucion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDevolucion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDevolucion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDevolucion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDevolucion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDevolucion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDevolucion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDevolucion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDevolucion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDevolucion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDevolucion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDevolucion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDevolucion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDevolucion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDevolucion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDevolucion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDevolucion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDevolucion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDevolucion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDevolucion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDevolucion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDevolucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDevolucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDevolucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDevolucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDevolucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDevolucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDevolucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDevolucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDevolucion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDevolucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDevolucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDevolucion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDevolucion.add(this.jMenuItemDetalleCerrarTipoDevolucion);
		
		this.jmenuDetalleAccionesTipoDevolucion.add(this.jMenuItemActualizarTipoDevolucion);
		this.jmenuDetalleAccionesTipoDevolucion.add(this.jMenuItemEliminarTipoDevolucion);
		this.jmenuDetalleAccionesTipoDevolucion.add(this.jMenuItemCancelarTipoDevolucion);		
		
		//this.jmenuDetalleDatosTipoDevolucion.add(this.jMenuItemDetalleAbrirOrderByTipoDevolucion);				
		this.jmenuDetalleDatosTipoDevolucion.add(this.jMenuItemDetalleMostarOcultarTipoDevolucion);				
				
		//this.jmenuDetalleAccionesTipoDevolucion.add(this.jMenuItemGuardarCambiosTipoDevolucion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDevolucion.add(this.jmenuDetalleArchivoTipoDevolucion);		
		this.jmenuBarDetalleTipoDevolucion.add(this.jmenuDetalleAccionesTipoDevolucion);		
		this.jmenuBarDetalleTipoDevolucion.add(this.jmenuDetalleDatosTipoDevolucion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDevolucion);				
	}
	
	
	public void inicializarElementosCamposTipoDevolucion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDevolucion = new JLabelMe();
		jLabelIdTipoDevolucion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDevolucion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDevolucion.setToolTipText(TipoDevolucionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDevolucion= new GridBagLayout();

		this.jPanelidTipoDevolucion.setLayout(this.gridaBagLayoutTipoDevolucion);

		jTextFieldidTipoDevolucion = new JTextFieldMe();
		jTextFieldidTipoDevolucion.setText("Id");

		jTextFieldidTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoDevolucion = new JLabelMe();
		this.jLabelnombreTipoDevolucion.setText(""+TipoDevolucionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDevolucion.setToolTipText("Nombre");
		this.jLabelnombreTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDevolucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDevolucion.setToolTipText(TipoDevolucionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDevolucion = new GridBagLayout();
		this.jPanelnombreTipoDevolucion.setLayout(this.gridaBagLayoutTipoDevolucion);


		jTextAreanombreTipoDevolucion= new JTextAreaMe();
		jTextAreanombreTipoDevolucion.setEnabled(false);
		jTextAreanombreTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDevolucion.setLineWrap(true);
		jTextAreanombreTipoDevolucion.setWrapStyleWord(true);
		jTextAreanombreTipoDevolucion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDevolucion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDevolucion = new JScrollPane(jTextAreanombreTipoDevolucion);
		jscrollPanenombreTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoDevolucionBusqueda= new JButtonMe();
		this.jButtonnombreTipoDevolucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDevolucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDevolucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDevolucionBusqueda.setText("U");
		this.jButtonnombreTipoDevolucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDevolucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDevolucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDevolucionBusqueda"));

		if(this.tipodevolucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDevolucionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDevolucion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoDevolucion = new JLabelMe();
		this.jLabelid_paisTipoDevolucion.setText(""+TipoDevolucionConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoDevolucion.setToolTipText("Pais");
		this.jLabelid_paisTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoDevolucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoDevolucion.setToolTipText(TipoDevolucionConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoDevolucion = new GridBagLayout();
		this.jPanelid_paisTipoDevolucion.setLayout(this.gridaBagLayoutTipoDevolucion);


		jComboBoxid_paisTipoDevolucion= new JComboBoxMe();
		jComboBoxid_paisTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoDevolucion= new JButtonMe();
		this.jButtonid_paisTipoDevolucion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoDevolucion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoDevolucion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoDevolucion.setText("Buscar");
		this.jButtonid_paisTipoDevolucion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoDevolucion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoDevolucion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoDevolucion"));

		this.jButtonid_paisTipoDevolucionBusqueda= new JButtonMe();
		this.jButtonid_paisTipoDevolucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDevolucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDevolucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoDevolucionBusqueda.setText("U");
		this.jButtonid_paisTipoDevolucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoDevolucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoDevolucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoDevolucionBusqueda"));

		if(this.tipodevolucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoDevolucionBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoDevolucionUpdate= new JButtonMe();
		this.jButtonid_paisTipoDevolucionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDevolucionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDevolucionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoDevolucionUpdate.setText("U");
		this.jButtonid_paisTipoDevolucionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoDevolucionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoDevolucionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoDevolucionUpdate"));



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
		//this.jInternalFrameDetalleTipoDevolucion = new TipoDevolucionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Devolucion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDevolucion= new GridBagLayout();
		

		
		String sToolTipTipoDevolucion="";
		sToolTipTipoDevolucion=TipoDevolucionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDevolucion+="(Facturacion.TipoDevolucion)";
		}
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDevolucion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDevolucion = new JButtonMe();
		this.jButtonModificarTipoDevolucion = new JButtonMe();
        this.jButtonActualizarTipoDevolucion = new JButtonMe();
        this.jButtonEliminarTipoDevolucion = new JButtonMe();
        this.jButtonCancelarTipoDevolucion = new JButtonMe();
        this.jButtonGuardarCambiosTipoDevolucion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDevolucion = new JButtonMe();
		this.jButtonCerrarTipoDevolucion = new JButtonMe();
		
		this.jScrollPanelDatosTipoDevolucion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDevolucion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDevolucion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Devolucion";
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDevolucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDevolucion.setName("jPanelCamposTipoDevolucion"); 

		this.jPanelCamposOcultosTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDevolucion.setName("jPanelCamposOcultosTipoDevolucion"); 

        this.jPanelAccionesTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDevolucion.setToolTipText("Acciones");
        this.jPanelAccionesTipoDevolucion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDevolucion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDevolucion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDevolucion.setText("Nuevo");
		this.jButtonModificarTipoDevolucion.setText("Editar");
        this.jButtonActualizarTipoDevolucion.setText("Actualizar");
        this.jButtonEliminarTipoDevolucion.setText("Eliminar");
        this.jButtonCancelarTipoDevolucion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDevolucion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDevolucion.setText("Guardar");
		this.jButtonCerrarTipoDevolucion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDevolucion,"nuevo_button","Nuevo",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDevolucion,"modificar_button","Editar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDevolucion,"actualizar_button","Actualizar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDevolucion,"eliminar_button","Eliminar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDevolucion,"cancelar_button","Cancelar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDevolucion,"guardarcambios_button","Guardar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDevolucion,"guardarcambiostabla_button","Guardar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDevolucion,"cerrar_button","Salir",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDevolucion.setToolTipText("Nuevo"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDevolucion.setToolTipText("Editar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDevolucion.setToolTipText("Actualizar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDevolucion.setToolTipText("Eliminar)"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDevolucion.setToolTipText("Cancelar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDevolucion.setToolTipText("Guardar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDevolucion.setToolTipText("Guardar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDevolucion.setToolTipText("Salir"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDevolucion";
		inputMap = this.jButtonNuevoTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDevolucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDevolucion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDevolucion";
		inputMap = this.jButtonActualizarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDevolucion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDevolucion";
		inputMap = this.jButtonEliminarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDevolucion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDevolucion";
		inputMap = this.jButtonCancelarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDevolucion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDevolucion";
		inputMap = this.jButtonCerrarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDevolucion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDevolucion";
		inputMap = this.jButtonGuardarCambiosTablaTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDevolucion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDevolucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDevolucion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDevolucion.setToolTipText("Nuevo TipoDevolucion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDevolucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDevolucion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDevolucion.setToolTipText("Sin Cerrar Ventana TipoDevolucion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDevolucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDevolucion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDevolucion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDevolucion.setText("Accion");
		this.jComboBoxTiposAccionesTipoDevolucion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDevolucion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDevolucion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDevolucion = new JLabelMe();
		
		this.jLabelAccionesTipoDevolucion.setText("Acciones");		
		this.jLabelAccionesTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDevolucion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDevolucion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDevolucion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDevolucion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDevolucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDevolucion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDevolucion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDevolucion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDevolucion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDevolucion = new GridBagLayout();
		
		this.jPanelCamposTipoDevolucion.setLayout(gridaBagLayoutCamposTipoDevolucion);
		this.jPanelCamposOcultosTipoDevolucion.setLayout(gridaBagLayoutCamposOcultosTipoDevolucion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucion.gridy = 0;
	this.gridBagConstraintsTipoDevolucion.gridx = 0;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDevolucion.add(jLabelIdTipoDevolucion, this.gridBagConstraintsTipoDevolucion);



	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucion.gridy = 0;
	this.gridBagConstraintsTipoDevolucion.gridx = 1;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDevolucion.add(jTextFieldidTipoDevolucion, this.gridBagConstraintsTipoDevolucion);


	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucion.gridy = 0;
	this.gridBagConstraintsTipoDevolucion.gridx = 0;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoDevolucion.add(jLabelid_paisTipoDevolucion, this.gridBagConstraintsTipoDevolucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = 0;
		this.gridBagConstraintsTipoDevolucion.gridx = 2;
		this.gridBagConstraintsTipoDevolucion.ipadx = 0;
		this.gridBagConstraintsTipoDevolucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoDevolucion.add(jButtonid_paisTipoDevolucionBusqueda, this.gridBagConstraintsTipoDevolucion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = 0;
		this.gridBagConstraintsTipoDevolucion.gridx = 3;
		this.gridBagConstraintsTipoDevolucion.ipadx = 0;
		this.gridBagConstraintsTipoDevolucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoDevolucion.add(jButtonid_paisTipoDevolucionUpdate, this.gridBagConstraintsTipoDevolucion);
	}

	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucion.gridy = 0;
	this.gridBagConstraintsTipoDevolucion.gridx = 1;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoDevolucion.add(jComboBoxid_paisTipoDevolucion, this.gridBagConstraintsTipoDevolucion);


	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucion.gridy = 0;
	this.gridBagConstraintsTipoDevolucion.gridx = 0;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDevolucion.add(jLabelnombreTipoDevolucion, this.gridBagConstraintsTipoDevolucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = 0;
		this.gridBagConstraintsTipoDevolucion.gridx = 2;
		this.gridBagConstraintsTipoDevolucion.ipadx = 0;
		this.gridBagConstraintsTipoDevolucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDevolucion.add(jButtonnombreTipoDevolucionBusqueda, this.gridBagConstraintsTipoDevolucion);
	}

	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucion.gridy = 0;
	this.gridBagConstraintsTipoDevolucion.gridx = 1;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDevolucion.add(jscrollPanenombreTipoDevolucion, this.gridBagConstraintsTipoDevolucion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucion.gridy = iYPanelCamposTipoDevolucion;
	this.gridBagConstraintsTipoDevolucion.gridx = iXPanelCamposTipoDevolucion++;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucion.add(this.jPanelidTipoDevolucion, this.gridBagConstraintsTipoDevolucion);



	if(iXPanelCamposTipoDevolucion % 1==0) {
		iXPanelCamposTipoDevolucion=0;
		iYPanelCamposTipoDevolucion++;
	}
	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucion.gridy = iYPanelCamposTipoDevolucion;
	this.gridBagConstraintsTipoDevolucion.gridx = iXPanelCamposTipoDevolucion++;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucion.add(this.jPanelid_paisTipoDevolucion, this.gridBagConstraintsTipoDevolucion);



	if(iXPanelCamposTipoDevolucion % 1==0) {
		iXPanelCamposTipoDevolucion=0;
		iYPanelCamposTipoDevolucion++;
	}
	this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucion.gridy = iYPanelCamposTipoDevolucion;
	this.gridBagConstraintsTipoDevolucion.gridx = iXPanelCamposTipoDevolucion++;
	this.gridBagConstraintsTipoDevolucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucion.add(this.jPanelnombreTipoDevolucion, this.gridBagConstraintsTipoDevolucion);



	if(iXPanelCamposTipoDevolucion % 1==0) {
		iXPanelCamposTipoDevolucion=0;
		iYPanelCamposTipoDevolucion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDevolucion= new GridBagLayout();
		this.jPanelAccionesTipoDevolucion.setLayout(gridaBagLayoutAccionesTipoDevolucion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDevolucion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDevolucion.setLayout(gridaBagLayoutAccionesFormularioTipoDevolucion);
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDevolucion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDevolucion.add(this.jComboBoxTiposAccionesFormularioTipoDevolucion, this.gridBagConstraintsTipoDevolucion);

		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDevolucion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDevolucion.add(this.jCheckBoxPostAccionNuevoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDevolucion.add(this.jCheckBoxPostAccionSinCerrarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDevolucion.add(this.jCheckBoxPostAccionSinMensajeTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = 0;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDevolucion.add(this.jButtonModificarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);							

		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = 0;
		this.gridBagConstraintsTipoDevolucion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDevolucion.add(this.jButtonEliminarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
			
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = 0;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDevolucion.add(this.jButtonActualizarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);


		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = 0;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDevolucion.add(this.jButtonGuardarCambiosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);	
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = 0;		
		this.gridBagConstraintsTipoDevolucion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDevolucion.add(this.jButtonCancelarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDevolucion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDevolucion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();						
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDevolucion.gridx = 0;		
			//this.gridBagConstraintsTipoDevolucion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDevolucion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDevolucion.gridx =0;
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDevolucion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDevolucion = new TipoDevolucionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Devolucion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Devolucion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Devolucion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDevolucionModel tipodevolucionModel=new TipoDevolucionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDevolucionModel.TipoDevolucionFocusTraversalPolicy tipodevolucionFocusTraversalPolicy = tipodevolucionModel.new TipoDevolucionFocusTraversalPolicy(this);
			
			//tipodevolucionFocusTraversalPolicy.settipodevolucionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodevolucionModel);
			
			
			this.jContentPaneDetalleTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDevolucion = new GridBagLayout();	
			this.jContentPaneDetalleTipoDevolucion.setLayout(gridaBagLayoutDetalleTipoDevolucion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDevolucion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDevolucion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDevolucion.add(jTtoolBarDetalleTipoDevolucion, gridBagConstraintsTipoDevolucion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDevolucion=   new JScrollPane(jContentPaneDetalleTipoDevolucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDevolucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDevolucion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDevolucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDevolucion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDevolucion.gridx = 0;
	        
			this.jContentPaneDetalleTipoDevolucion.add(jPanelCamposTipoDevolucion, gridBagConstraintsTipoDevolucion);
			
			
			
			
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
						&& tipodevolucionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDevolucion= new GridBagConstraints();
						this.gridBagConstraintsTipoDevolucion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDevolucion.gridx = 0;
						this.jContentPaneDetalleTipoDevolucion.add(this.jTabbedPaneRelacionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDevolucion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDevolucion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
					this.gridBagConstraintsTipoDevolucion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDevolucion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDevolucion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDevolucion.add(jPanelCamposOcultosTipoDevolucion, gridBagConstraintsTipoDevolucion);
				
					this.jPanelCamposOcultosTipoDevolucion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDevolucion.gridx = 0;
	        this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDevolucion.add(this.jPanelAccionesFormularioTipoDevolucion, this.gridBagConstraintsTipoDevolucion);							
			
			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
	        this.gridBagConstraintsTipoDevolucion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDevolucion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDevolucion.add(this.jPanelAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDevolucion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDevolucion=   new JScrollPane(this.jPanelCamposTipoDevolucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDevolucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDevolucion.gridx = 0;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDevolucion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDevolucion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDevolucion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
			
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
			
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDevolucion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDevolucion;
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
