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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoInstruccionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoInstruccionDetalleFormJInternalFrame extends TipoInstruccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoInstruccion;
	
	protected JMenuBar jmenuBarDetalleTipoInstruccion;
	
	protected JMenu jmenuDetalleTipoInstruccion;
	protected JMenu jmenuDetalleArchivoTipoInstruccion;
	protected JMenu jmenuDetalleAccionesTipoInstruccion;
	protected JMenu jmenuDetalleDatosTipoInstruccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInstruccion;	
	protected GridBagConstraints gridBagConstraintsTipoInstruccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoInstruccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoInstruccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoInstruccionSessionBean tipoinstruccionSessionBean;
	
	

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;
	
		
	
	public TipoInstruccionLogic tipoinstruccionLogic;
	
	public JScrollPane jScrollPanelDatosTipoInstruccion;
	public JScrollPane jScrollPanelDatosEdicionTipoInstruccion;
	public JScrollPane jScrollPanelDatosGeneralTipoInstruccion;
	
	protected JPanel jPanelCamposTipoInstruccion;    
	protected JPanel jPanelCamposOcultosTipoInstruccion;    	
	protected JPanel jPanelAccionesTipoInstruccion;
	protected JPanel jPanelAccionesFormularioTipoInstruccion;
    
	
	
	protected Integer iXPanelCamposTipoInstruccion=0;
	protected Integer iYPanelCamposTipoInstruccion=0;
	
	protected Integer iXPanelCamposOcultosTipoInstruccion=0;
	protected Integer iYPanelCamposOcultosTipoInstruccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoInstruccion;
	public JButton jButtonModificarTipoInstruccion;
	public JButton jButtonActualizarTipoInstruccion;
    public JButton jButtonEliminarTipoInstruccion;
	public JButton jButtonCancelarTipoInstruccion;
    public JButton jButtonGuardarCambiosTipoInstruccion;
	public JButton jButtonGuardarCambiosTablaTipoInstruccion;
	protected JButton jButtonCerrarTipoInstruccion;
	
	
	protected JButton jButtonProcesarInformacionTipoInstruccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoInstruccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoInstruccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoInstruccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInstruccion;
	protected JButton jButtonModificarToolBarTipoInstruccion;
	protected JButton jButtonActualizarToolBarTipoInstruccion;
    protected JButton jButtonEliminarToolBarTipoInstruccion;
	protected JButton jButtonCancelarToolBarTipoInstruccion;
    protected JButton jButtonGuardarCambiosToolBarTipoInstruccion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoInstruccion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInstruccion;
	protected JButton jButtonCerrarToolBarTipoInstruccion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoInstruccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInstruccion;
	protected JMenuItem jMenuItemModificarTipoInstruccion;
	protected JMenuItem jMenuItemActualizarTipoInstruccion;
    protected JMenuItem jMenuItemEliminarTipoInstruccion;
	protected JMenuItem jMenuItemCancelarTipoInstruccion;
    protected JMenuItem jMenuItemGuardarCambiosTipoInstruccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInstruccion;
	protected JMenuItem jMenuItemCerrarTipoInstruccion;
	protected JMenuItem jMenuItemDetalleCerrarTipoInstruccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInstruccion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoInstruccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInstruccion;
	protected JMenuItem jMenuItemMostrarOcultarTipoInstruccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInstruccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInstruccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInstruccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoInstruccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoInstruccion;
	public JLabel jLabelIdTipoInstruccion;
	public JTextFieldMe jTextFieldidTipoInstruccion;
	public JButton jButtonidTipoInstruccionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoInstruccion;
	public JLabel jLabelcodigoTipoInstruccion;
	public JTextField jTextFieldcodigoTipoInstruccion;
	public JButton jButtoncodigoTipoInstruccionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoInstruccion;
	public JLabel jLabelnombreTipoInstruccion;
	public JTextArea jTextAreanombreTipoInstruccion;
	public JScrollPane jscrollPanenombreTipoInstruccion;
	public JButton jButtonnombreTipoInstruccionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoInstruccion;
	
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
	
	public TipoInstruccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoInstruccion=new JPanel();
				this.jPanelAccionesFormularioTipoInstruccion=new JPanel();
				this.jmenuBarDetalleTipoInstruccion=new JMenuBar();
				this.jTtoolBarDetalleTipoInstruccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoInstruccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstruccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInstruccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoInstruccion() {
		return this.jButtonActualizarToolBarTipoInstruccion;
	}
	
	public JButton getjButtonEliminarToolBarTipoInstruccion() {
		return this.jButtonEliminarToolBarTipoInstruccion;
	}
	
	public JButton getjButtonCancelarToolBarTipoInstruccion() {
		return this.jButtonCancelarToolBarTipoInstruccion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoInstruccion() {
		return this.jButtonProcesarInformacionTipoInstruccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInstruccion)	{
		this.jButtonProcesarInformacionTipoInstruccion = jButtonProcesarInformacionTipoInstruccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInstruccion() {
		return this.jComboBoxTiposAccionesTipoInstruccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInstruccion(
			JComboBox jComboBoxTiposRelacionesTipoInstruccion) {
		this.jComboBoxTiposRelacionesTipoInstruccion = jComboBoxTiposRelacionesTipoInstruccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInstruccion(
			JComboBox jComboBoxTiposAccionesTipoInstruccion) {
		this.jComboBoxTiposAccionesTipoInstruccion = jComboBoxTiposAccionesTipoInstruccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoInstruccion() {
		return this.jComboBoxTiposAccionesFormularioTipoInstruccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoInstruccion(
			JComboBox jComboBoxTiposAccionesFormularioTipoInstruccion) {
		this.jComboBoxTiposAccionesFormularioTipoInstruccion = jComboBoxTiposAccionesFormularioTipoInstruccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
		
		this.tipoinstruccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinstruccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinstruccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInstruccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Instruccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoInstruccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoInstruccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoInstruccion=new JButtonMe();
				this.jButtonModificarToolBarTipoInstruccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoInstruccion,this.jTtoolBarDetalleTipoInstruccion,
							"actualizar","actualizar","Actualizar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoInstruccion,this.jTtoolBarDetalleTipoInstruccion,
							"eliminar","eliminar","Eliminar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoInstruccion,this.jTtoolBarDetalleTipoInstruccion,
							"cancelar","cancelar","Cancelar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoInstruccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoInstruccion,this.jTtoolBarDetalleTipoInstruccion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoInstruccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoInstruccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoInstruccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoInstruccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoInstruccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInstruccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInstruccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInstruccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoInstruccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoInstruccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoInstruccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoInstruccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoInstruccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoInstruccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoInstruccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoInstruccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoInstruccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoInstruccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoInstruccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoInstruccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoInstruccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInstruccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInstruccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInstruccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInstruccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInstruccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoInstruccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoInstruccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoInstruccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInstruccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInstruccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInstruccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInstruccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInstruccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInstruccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoInstruccion.add(this.jMenuItemDetalleCerrarTipoInstruccion);
		
		this.jmenuDetalleAccionesTipoInstruccion.add(this.jMenuItemActualizarTipoInstruccion);
		this.jmenuDetalleAccionesTipoInstruccion.add(this.jMenuItemEliminarTipoInstruccion);
		this.jmenuDetalleAccionesTipoInstruccion.add(this.jMenuItemCancelarTipoInstruccion);		
		
		//this.jmenuDetalleDatosTipoInstruccion.add(this.jMenuItemDetalleAbrirOrderByTipoInstruccion);				
		this.jmenuDetalleDatosTipoInstruccion.add(this.jMenuItemDetalleMostarOcultarTipoInstruccion);				
				
		//this.jmenuDetalleAccionesTipoInstruccion.add(this.jMenuItemGuardarCambiosTipoInstruccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoInstruccion.add(this.jmenuDetalleArchivoTipoInstruccion);		
		this.jmenuBarDetalleTipoInstruccion.add(this.jmenuDetalleAccionesTipoInstruccion);		
		this.jmenuBarDetalleTipoInstruccion.add(this.jmenuDetalleDatosTipoInstruccion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoInstruccion.add(this.jmenuDetalleTipoInstruccion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoInstruccion);				
	}
	
	
	public void inicializarElementosCamposTipoInstruccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoInstruccion = new JLabelMe();
		jLabelIdTipoInstruccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoInstruccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoInstruccion.setToolTipText(TipoInstruccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoInstruccion= new GridBagLayout();

		this.jPanelidTipoInstruccion.setLayout(this.gridaBagLayoutTipoInstruccion);

		jTextFieldidTipoInstruccion = new JTextFieldMe();
		jTextFieldidTipoInstruccion.setText("Id");

		jTextFieldidTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoInstruccion = new JLabelMe();
		this.jLabelcodigoTipoInstruccion.setText(""+TipoInstruccionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoInstruccion.setToolTipText("Codigo");
		this.jLabelcodigoTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoInstruccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoInstruccion.setToolTipText(TipoInstruccionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoInstruccion = new GridBagLayout();
		this.jPanelcodigoTipoInstruccion.setLayout(this.gridaBagLayoutTipoInstruccion);


		jTextFieldcodigoTipoInstruccion= new JTextFieldMe();

		jTextFieldcodigoTipoInstruccion.setEnabled(false);
		jTextFieldcodigoTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoInstruccionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoInstruccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInstruccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInstruccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoInstruccionBusqueda.setText("U");
		this.jButtoncodigoTipoInstruccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoInstruccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoInstruccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoInstruccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoInstruccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoInstruccionBusqueda"));

		if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoInstruccionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoInstruccion = new JLabelMe();
		this.jLabelnombreTipoInstruccion.setText(""+TipoInstruccionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoInstruccion.setToolTipText("Nombre");
		this.jLabelnombreTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoInstruccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoInstruccion.setToolTipText(TipoInstruccionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoInstruccion = new GridBagLayout();
		this.jPanelnombreTipoInstruccion.setLayout(this.gridaBagLayoutTipoInstruccion);


		jTextAreanombreTipoInstruccion= new JTextAreaMe();
		jTextAreanombreTipoInstruccion.setEnabled(false);
		jTextAreanombreTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInstruccion.setLineWrap(true);
		jTextAreanombreTipoInstruccion.setWrapStyleWord(true);
		jTextAreanombreTipoInstruccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoInstruccion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoInstruccion = new JScrollPane(jTextAreanombreTipoInstruccion);
		jscrollPanenombreTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoInstruccionBusqueda= new JButtonMe();
		this.jButtonnombreTipoInstruccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInstruccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInstruccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoInstruccionBusqueda.setText("U");
		this.jButtonnombreTipoInstruccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoInstruccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoInstruccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoInstruccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoInstruccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoInstruccionBusqueda"));

		if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoInstruccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoInstruccion() {
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
		//this.jInternalFrameDetalleTipoInstruccion = new TipoInstruccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Instruccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInstruccion= new GridBagLayout();
		

		
		String sToolTipTipoInstruccion="";
		sToolTipTipoInstruccion=TipoInstruccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInstruccion+="(Nomina.TipoInstruccion)";
		}
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInstruccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoInstruccion = new JButtonMe();
		this.jButtonModificarTipoInstruccion = new JButtonMe();
        this.jButtonActualizarTipoInstruccion = new JButtonMe();
        this.jButtonEliminarTipoInstruccion = new JButtonMe();
        this.jButtonCancelarTipoInstruccion = new JButtonMe();
        this.jButtonGuardarCambiosTipoInstruccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoInstruccion = new JButtonMe();
		this.jButtonCerrarTipoInstruccion = new JButtonMe();
		
		this.jScrollPanelDatosTipoInstruccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoInstruccion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoInstruccion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Instruccion";
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instrucciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInstruccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoInstruccion.setName("jPanelCamposTipoInstruccion"); 

		this.jPanelCamposOcultosTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoInstruccion.setName("jPanelCamposOcultosTipoInstruccion"); 

        this.jPanelAccionesTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInstruccion.setToolTipText("Acciones");
        this.jPanelAccionesTipoInstruccion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoInstruccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoInstruccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoInstruccion.setText("Nuevo");
		this.jButtonModificarTipoInstruccion.setText("Editar");
        this.jButtonActualizarTipoInstruccion.setText("Actualizar");
        this.jButtonEliminarTipoInstruccion.setText("Eliminar");
        this.jButtonCancelarTipoInstruccion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoInstruccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoInstruccion.setText("Guardar");
		this.jButtonCerrarTipoInstruccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInstruccion,"nuevo_button","Nuevo",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoInstruccion,"modificar_button","Editar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoInstruccion,"actualizar_button","Actualizar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoInstruccion,"eliminar_button","Eliminar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoInstruccion,"cancelar_button","Cancelar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoInstruccion,"guardarcambios_button","Guardar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInstruccion,"guardarcambiostabla_button","Guardar",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInstruccion,"cerrar_button","Salir",this.tipoinstruccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoInstruccion.setToolTipText("Nuevo"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoInstruccion.setToolTipText("Editar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoInstruccion.setToolTipText("Actualizar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoInstruccion.setToolTipText("Eliminar)"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoInstruccion.setToolTipText("Cancelar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoInstruccion.setToolTipText("Guardar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoInstruccion.setToolTipText("Guardar"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInstruccion.setToolTipText("Salir"+" "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInstruccion";
		inputMap = this.jButtonNuevoTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInstruccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInstruccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoInstruccion";
		inputMap = this.jButtonActualizarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoInstruccion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoInstruccion";
		inputMap = this.jButtonEliminarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoInstruccion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoInstruccion";
		inputMap = this.jButtonCancelarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoInstruccion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoInstruccion";
		inputMap = this.jButtonCerrarTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInstruccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInstruccion";
		inputMap = this.jButtonGuardarCambiosTablaTipoInstruccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInstruccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoInstruccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoInstruccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoInstruccion.setToolTipText("Nuevo TipoInstruccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoInstruccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoInstruccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoInstruccion.setToolTipText("Sin Cerrar Ventana TipoInstruccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoInstruccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoInstruccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoInstruccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInstruccion.setText("Accion");
		this.jComboBoxTiposAccionesTipoInstruccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoInstruccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoInstruccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoInstruccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoInstruccion = new JLabelMe();
		
		this.jLabelAccionesTipoInstruccion.setText("Acciones");		
		this.jLabelAccionesTipoInstruccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstruccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstruccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoInstruccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoInstruccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoInstruccion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoInstruccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoInstruccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoInstruccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstruccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstruccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInstruccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoInstruccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInstruccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInstruccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoInstruccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoInstruccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoInstruccion = new GridBagLayout();
		
		this.jPanelCamposTipoInstruccion.setLayout(gridaBagLayoutCamposTipoInstruccion);
		this.jPanelCamposOcultosTipoInstruccion.setLayout(gridaBagLayoutCamposOcultosTipoInstruccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstruccion.gridy = 0;
	this.gridBagConstraintsTipoInstruccion.gridx = 0;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoInstruccion.add(jLabelIdTipoInstruccion, this.gridBagConstraintsTipoInstruccion);



	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstruccion.gridy = 0;
	this.gridBagConstraintsTipoInstruccion.gridx = 1;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoInstruccion.add(jTextFieldidTipoInstruccion, this.gridBagConstraintsTipoInstruccion);


	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstruccion.gridy = 0;
	this.gridBagConstraintsTipoInstruccion.gridx = 0;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoInstruccion.add(jLabelcodigoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = 0;
		this.gridBagConstraintsTipoInstruccion.gridx = 2;
		this.gridBagConstraintsTipoInstruccion.ipadx = 0;
		this.gridBagConstraintsTipoInstruccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoInstruccion.add(jButtoncodigoTipoInstruccionBusqueda, this.gridBagConstraintsTipoInstruccion);
	}

	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstruccion.gridy = 0;
	this.gridBagConstraintsTipoInstruccion.gridx = 1;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoInstruccion.add(jTextFieldcodigoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);


	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstruccion.gridy = 0;
	this.gridBagConstraintsTipoInstruccion.gridx = 0;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoInstruccion.add(jLabelnombreTipoInstruccion, this.gridBagConstraintsTipoInstruccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstruccion.gridy = 0;
		this.gridBagConstraintsTipoInstruccion.gridx = 2;
		this.gridBagConstraintsTipoInstruccion.ipadx = 0;
		this.gridBagConstraintsTipoInstruccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoInstruccion.add(jButtonnombreTipoInstruccionBusqueda, this.gridBagConstraintsTipoInstruccion);
	}

	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstruccion.gridy = 0;
	this.gridBagConstraintsTipoInstruccion.gridx = 1;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoInstruccion.add(jscrollPanenombreTipoInstruccion, this.gridBagConstraintsTipoInstruccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstruccion.gridy = iYPanelCamposTipoInstruccion;
	this.gridBagConstraintsTipoInstruccion.gridx = iXPanelCamposTipoInstruccion++;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInstruccion.add(this.jPanelidTipoInstruccion, this.gridBagConstraintsTipoInstruccion);



	if(iXPanelCamposTipoInstruccion % 1==0) {
		iXPanelCamposTipoInstruccion=0;
		iYPanelCamposTipoInstruccion++;
	}
	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstruccion.gridy = iYPanelCamposTipoInstruccion;
	this.gridBagConstraintsTipoInstruccion.gridx = iXPanelCamposTipoInstruccion++;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInstruccion.add(this.jPanelcodigoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);



	if(iXPanelCamposTipoInstruccion % 1==0) {
		iXPanelCamposTipoInstruccion=0;
		iYPanelCamposTipoInstruccion++;
	}
	this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstruccion.gridy = iYPanelCamposTipoInstruccion;
	this.gridBagConstraintsTipoInstruccion.gridx = iXPanelCamposTipoInstruccion++;
	this.gridBagConstraintsTipoInstruccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstruccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInstruccion.add(this.jPanelnombreTipoInstruccion, this.gridBagConstraintsTipoInstruccion);



	if(iXPanelCamposTipoInstruccion % 1==0) {
		iXPanelCamposTipoInstruccion=0;
		iYPanelCamposTipoInstruccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoInstruccion= new GridBagLayout();
		this.jPanelAccionesTipoInstruccion.setLayout(gridaBagLayoutAccionesTipoInstruccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoInstruccion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoInstruccion.setLayout(gridaBagLayoutAccionesFormularioTipoInstruccion);
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInstruccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInstruccion.add(this.jComboBoxTiposAccionesFormularioTipoInstruccion, this.gridBagConstraintsTipoInstruccion);

		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInstruccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInstruccion.add(this.jCheckBoxPostAccionNuevoTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInstruccion.add(this.jCheckBoxPostAccionSinCerrarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInstruccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInstruccion.add(this.jCheckBoxPostAccionSinMensajeTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = 0;
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoInstruccion.add(this.jButtonModificarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);							

		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstruccion.gridy = 0;
		this.gridBagConstraintsTipoInstruccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoInstruccion.add(this.jButtonEliminarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
			
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = 0;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInstruccion.add(this.jButtonActualizarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);


		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = 0;		
		this.gridBagConstraintsTipoInstruccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInstruccion.add(this.jButtonGuardarCambiosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);	
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = 0;		
		this.gridBagConstraintsTipoInstruccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoInstruccion.add(this.jButtonCancelarTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInstruccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInstruccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();						
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInstruccion.gridx = 0;		
			//this.gridBagConstraintsTipoInstruccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInstruccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInstruccion.gridx =0;
		this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInstruccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoInstruccion = new TipoInstruccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Instruccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Instruccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Instruccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoInstruccionModel tipoinstruccionModel=new TipoInstruccionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoInstruccionModel.TipoInstruccionFocusTraversalPolicy tipoinstruccionFocusTraversalPolicy = tipoinstruccionModel.new TipoInstruccionFocusTraversalPolicy(this);
			
			//tipoinstruccionFocusTraversalPolicy.settipoinstruccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoinstruccionModel);
			
			
			this.jContentPaneDetalleTipoInstruccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoInstruccion = new GridBagLayout();	
			this.jContentPaneDetalleTipoInstruccion.setLayout(gridaBagLayoutDetalleTipoInstruccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInstruccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoInstruccion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoInstruccion.add(jTtoolBarDetalleTipoInstruccion, gridBagConstraintsTipoInstruccion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoInstruccion=   new JScrollPane(jContentPaneDetalleTipoInstruccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInstruccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstruccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstruccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoInstruccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInstruccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstruccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstruccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoInstruccion.gridx = 0;
	        
			this.jContentPaneDetalleTipoInstruccion.add(jPanelCamposTipoInstruccion, gridBagConstraintsTipoInstruccion);
			
			
			
			
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
						&& tipoinstruccionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					
					if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoInstruccion= new GridBagConstraints();
						this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoInstruccion.gridx = 0;
						this.jContentPaneDetalleTipoInstruccion.add(this.jTabbedPaneRelacionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoInstruccion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoInstruccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
					this.gridBagConstraintsTipoInstruccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoInstruccion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoInstruccion.add(jPanelCamposOcultosTipoInstruccion, gridBagConstraintsTipoInstruccion);
				
					this.jPanelCamposOcultosTipoInstruccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoInstruccion.gridx = 0;
	        this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoInstruccion.add(this.jPanelAccionesFormularioTipoInstruccion, this.gridBagConstraintsTipoInstruccion);							
			
			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
	        this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoInstruccion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoInstruccion.add(this.jPanelAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoInstruccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoInstruccion=   new JScrollPane(this.jPanelCamposTipoInstruccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInstruccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstruccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstruccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoInstruccion.gridx = 0;
			this.gridBagConstraintsTipoInstruccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoInstruccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoInstruccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInstruccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoInstruccion, this.gridBagConstraintsTipoInstruccion);			
			
			this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstruccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInstruccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
			
			
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		
			
		this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstruccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstruccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInstruccion, this.gridBagConstraintsTipoInstruccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoInstruccion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoInstruccion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoInstruccionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsTipoInstruccion = new GridBagConstraints();
				//this.gridBagConstraintsTipoInstruccion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoInstruccion.gridx = 0;
				//this.jContentPaneDetalleTipoInstruccion.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoInstruccion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoInstruccion.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoInstruccion.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesTipoInstruccion.add("Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoBeanSwingJInternalFrame(List<TipoInstruccion> tipoinstruccions,TipoInstruccion tipoinstruccion,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.tipoinstruccionLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.settipoinstruccionsForeignKey(tipoinstruccions);
					empleadoBeanSwingJInternalFrame.settipoinstruccionForeignKey(tipoinstruccion);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoInstruccion(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidTipoInstruccionActual(tipoinstruccion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoInstruccion(true);
					empleadoBeanSwingJInternalFrame.setid_tipo_instruccionFK_IdTipoInstruccion(tipoinstruccion.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoInstruccionForeignKey(tipoinstruccion,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoInstruccion");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoInstruccion");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

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
