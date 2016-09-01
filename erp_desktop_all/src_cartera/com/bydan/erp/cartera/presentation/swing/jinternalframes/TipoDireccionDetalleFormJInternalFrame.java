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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoDireccionConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoDireccionDetalleFormJInternalFrame extends TipoDireccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDireccion;
	
	protected JMenuBar jmenuBarDetalleTipoDireccion;
	
	protected JMenu jmenuDetalleTipoDireccion;
	protected JMenu jmenuDetalleArchivoTipoDireccion;
	protected JMenu jmenuDetalleAccionesTipoDireccion;
	protected JMenu jmenuDetalleDatosTipoDireccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDireccion;	
	protected GridBagConstraints gridBagConstraintsTipoDireccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDireccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDireccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDireccionSessionBean tipodireccionSessionBean;
	
	

	public DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame=null;
	public DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDireccion=false;
	public DireccionSessionBean direccionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDireccionLogic tipodireccionLogic;
	
	public JScrollPane jScrollPanelDatosTipoDireccion;
	public JScrollPane jScrollPanelDatosEdicionTipoDireccion;
	public JScrollPane jScrollPanelDatosGeneralTipoDireccion;
	
	protected JPanel jPanelCamposTipoDireccion;    
	protected JPanel jPanelCamposOcultosTipoDireccion;    	
	protected JPanel jPanelAccionesTipoDireccion;
	protected JPanel jPanelAccionesFormularioTipoDireccion;
    
	
	
	protected Integer iXPanelCamposTipoDireccion=0;
	protected Integer iYPanelCamposTipoDireccion=0;
	
	protected Integer iXPanelCamposOcultosTipoDireccion=0;
	protected Integer iYPanelCamposOcultosTipoDireccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDireccion;
	public JButton jButtonModificarTipoDireccion;
	public JButton jButtonActualizarTipoDireccion;
    public JButton jButtonEliminarTipoDireccion;
	public JButton jButtonCancelarTipoDireccion;
    public JButton jButtonGuardarCambiosTipoDireccion;
	public JButton jButtonGuardarCambiosTablaTipoDireccion;
	protected JButton jButtonCerrarTipoDireccion;
	
	
	protected JButton jButtonProcesarInformacionTipoDireccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDireccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDireccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDireccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDireccion;
	protected JButton jButtonModificarToolBarTipoDireccion;
	protected JButton jButtonActualizarToolBarTipoDireccion;
    protected JButton jButtonEliminarToolBarTipoDireccion;
	protected JButton jButtonCancelarToolBarTipoDireccion;
    protected JButton jButtonGuardarCambiosToolBarTipoDireccion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDireccion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDireccion;
	protected JButton jButtonCerrarToolBarTipoDireccion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDireccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDireccion;
	protected JMenuItem jMenuItemModificarTipoDireccion;
	protected JMenuItem jMenuItemActualizarTipoDireccion;
    protected JMenuItem jMenuItemEliminarTipoDireccion;
	protected JMenuItem jMenuItemCancelarTipoDireccion;
    protected JMenuItem jMenuItemGuardarCambiosTipoDireccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDireccion;
	protected JMenuItem jMenuItemCerrarTipoDireccion;
	protected JMenuItem jMenuItemDetalleCerrarTipoDireccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDireccion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDireccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDireccion;
	protected JMenuItem jMenuItemMostrarOcultarTipoDireccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDireccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDireccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDireccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDireccion;
	public JLabel jLabelIdTipoDireccion;
	public JLabel jLabelidTipoDireccion;
	public JButton jButtonidTipoDireccionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDireccion;
	public JLabel jLabelcodigoTipoDireccion;
	public JTextField jTextFieldcodigoTipoDireccion;
	public JButton jButtoncodigoTipoDireccionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDireccion;
	public JLabel jLabelnombreTipoDireccion;
	public JTextArea jTextAreanombreTipoDireccion;
	public JScrollPane jscrollPanenombreTipoDireccion;
	public JButton jButtonnombreTipoDireccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDireccion;
	public JLabel jLabelid_empresaTipoDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDireccion;
	public JButton jButtonid_empresaTipoDireccion= new JButtonMe();
	public JButton jButtonid_empresaTipoDireccionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDireccionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDireccion;
	
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
	
	public TipoDireccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDireccion=new JPanel();
				this.jPanelAccionesFormularioTipoDireccion=new JPanel();
				this.jmenuBarDetalleTipoDireccion=new JMenuBar();
				this.jTtoolBarDetalleTipoDireccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDireccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDireccion() {
		return this.jButtonActualizarToolBarTipoDireccion;
	}
	
	public JButton getjButtonEliminarToolBarTipoDireccion() {
		return this.jButtonEliminarToolBarTipoDireccion;
	}
	
	public JButton getjButtonCancelarToolBarTipoDireccion() {
		return this.jButtonCancelarToolBarTipoDireccion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDireccion() {
		return this.jButtonProcesarInformacionTipoDireccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDireccion)	{
		this.jButtonProcesarInformacionTipoDireccion = jButtonProcesarInformacionTipoDireccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDireccion() {
		return this.jComboBoxTiposAccionesTipoDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDireccion(
			JComboBox jComboBoxTiposRelacionesTipoDireccion) {
		this.jComboBoxTiposRelacionesTipoDireccion = jComboBoxTiposRelacionesTipoDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDireccion(
			JComboBox jComboBoxTiposAccionesTipoDireccion) {
		this.jComboBoxTiposAccionesTipoDireccion = jComboBoxTiposAccionesTipoDireccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDireccion() {
		return this.jComboBoxTiposAccionesFormularioTipoDireccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDireccion(
			JComboBox jComboBoxTiposAccionesFormularioTipoDireccion) {
		this.jComboBoxTiposAccionesFormularioTipoDireccion = jComboBoxTiposAccionesFormularioTipoDireccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodireccionSessionBean=new TipoDireccionSessionBean();
		
		this.tipodireccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodireccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodireccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.direccionSessionBean=new DireccionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDireccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Direccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDireccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDireccion=new JButtonMe();
				this.jButtonModificarToolBarTipoDireccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDireccion,this.jTtoolBarDetalleTipoDireccion,
							"actualizar","actualizar","Actualizar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDireccion,this.jTtoolBarDetalleTipoDireccion,
							"eliminar","eliminar","Eliminar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDireccion,this.jTtoolBarDetalleTipoDireccion,
							"cancelar","cancelar","Cancelar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDireccion,this.jTtoolBarDetalleTipoDireccion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDireccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDireccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDireccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDireccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDireccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDireccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDireccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDireccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDireccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDireccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDireccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDireccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDireccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDireccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDireccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDireccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDireccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDireccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDireccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDireccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDireccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDireccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDireccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDireccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDireccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDireccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDireccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDireccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDireccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDireccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDireccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDireccion.add(this.jMenuItemDetalleCerrarTipoDireccion);
		
		this.jmenuDetalleAccionesTipoDireccion.add(this.jMenuItemActualizarTipoDireccion);
		this.jmenuDetalleAccionesTipoDireccion.add(this.jMenuItemEliminarTipoDireccion);
		this.jmenuDetalleAccionesTipoDireccion.add(this.jMenuItemCancelarTipoDireccion);		
		
		//this.jmenuDetalleDatosTipoDireccion.add(this.jMenuItemDetalleAbrirOrderByTipoDireccion);				
		this.jmenuDetalleDatosTipoDireccion.add(this.jMenuItemDetalleMostarOcultarTipoDireccion);				
				
		//this.jmenuDetalleAccionesTipoDireccion.add(this.jMenuItemGuardarCambiosTipoDireccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDireccion.add(this.jmenuDetalleArchivoTipoDireccion);		
		this.jmenuBarDetalleTipoDireccion.add(this.jmenuDetalleAccionesTipoDireccion);		
		this.jmenuBarDetalleTipoDireccion.add(this.jmenuDetalleDatosTipoDireccion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDireccion.add(this.jmenuDetalleTipoDireccion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDireccion);				
	}
	
	
	public void inicializarElementosCamposTipoDireccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDireccion = new JLabelMe();
		jLabelIdTipoDireccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDireccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDireccion.setToolTipText(TipoDireccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDireccion= new GridBagLayout();

		this.jPanelidTipoDireccion.setLayout(this.gridaBagLayoutTipoDireccion);

		jLabelidTipoDireccion = new JLabel();
		jLabelidTipoDireccion.setText("Id");

		jLabelidTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDireccion = new JLabelMe();
		this.jLabelcodigoTipoDireccion.setText(""+TipoDireccionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDireccion.setToolTipText("Codigo");
		this.jLabelcodigoTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDireccion.setToolTipText(TipoDireccionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDireccion = new GridBagLayout();
		this.jPanelcodigoTipoDireccion.setLayout(this.gridaBagLayoutTipoDireccion);


		jTextFieldcodigoTipoDireccion= new JTextFieldMe();

		jTextFieldcodigoTipoDireccion.setEnabled(false);
		jTextFieldcodigoTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDireccionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDireccionBusqueda.setText("U");
		this.jButtoncodigoTipoDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDireccionBusqueda"));

		if(this.tipodireccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDireccionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDireccion = new JLabelMe();
		this.jLabelnombreTipoDireccion.setText(""+TipoDireccionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDireccion.setToolTipText("Nombre");
		this.jLabelnombreTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDireccion.setToolTipText(TipoDireccionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDireccion = new GridBagLayout();
		this.jPanelnombreTipoDireccion.setLayout(this.gridaBagLayoutTipoDireccion);


		jTextAreanombreTipoDireccion= new JTextAreaMe();
		jTextAreanombreTipoDireccion.setEnabled(false);
		jTextAreanombreTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDireccion.setLineWrap(true);
		jTextAreanombreTipoDireccion.setWrapStyleWord(true);
		jTextAreanombreTipoDireccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDireccion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDireccion = new JScrollPane(jTextAreanombreTipoDireccion);
		jscrollPanenombreTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDireccionBusqueda= new JButtonMe();
		this.jButtonnombreTipoDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDireccionBusqueda.setText("U");
		this.jButtonnombreTipoDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDireccionBusqueda"));

		if(this.tipodireccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDireccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDireccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDireccion = new JLabelMe();
		this.jLabelid_empresaTipoDireccion.setText(""+TipoDireccionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDireccion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDireccion.setToolTipText(TipoDireccionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDireccion = new GridBagLayout();
		this.jPanelid_empresaTipoDireccion.setLayout(this.gridaBagLayoutTipoDireccion);


		jComboBoxid_empresaTipoDireccion= new JComboBoxMe();
		jComboBoxid_empresaTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDireccion.setEnabled(false);

		this.jButtonid_empresaTipoDireccion= new JButtonMe();
		this.jButtonid_empresaTipoDireccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDireccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDireccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDireccion.setText("Buscar");
		this.jButtonid_empresaTipoDireccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDireccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDireccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDireccion"));

		this.jButtonid_empresaTipoDireccionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDireccionBusqueda.setText("U");
		this.jButtonid_empresaTipoDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDireccionBusqueda"));

		if(this.tipodireccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDireccionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDireccionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDireccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDireccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDireccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDireccionUpdate.setText("U");
		this.jButtonid_empresaTipoDireccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDireccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDireccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDireccionUpdate"));



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
		//this.jInternalFrameDetalleTipoDireccion = new TipoDireccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Direccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDireccion= new GridBagLayout();
		

		
		String sToolTipTipoDireccion="";
		sToolTipTipoDireccion=TipoDireccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDireccion+="(Cartera.TipoDireccion)";
		}
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDireccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDireccion = new JButtonMe();
		this.jButtonModificarTipoDireccion = new JButtonMe();
        this.jButtonActualizarTipoDireccion = new JButtonMe();
        this.jButtonEliminarTipoDireccion = new JButtonMe();
        this.jButtonCancelarTipoDireccion = new JButtonMe();
        this.jButtonGuardarCambiosTipoDireccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDireccion = new JButtonMe();
		this.jButtonCerrarTipoDireccion = new JButtonMe();
		
		this.jScrollPanelDatosTipoDireccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDireccion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDireccion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Direccion";
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Direcciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDireccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDireccion.setName("jPanelCamposTipoDireccion"); 

		this.jPanelCamposOcultosTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDireccion.setName("jPanelCamposOcultosTipoDireccion"); 

        this.jPanelAccionesTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDireccion.setToolTipText("Acciones");
        this.jPanelAccionesTipoDireccion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDireccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDireccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDireccion.setText("Nuevo");
		this.jButtonModificarTipoDireccion.setText("Editar");
        this.jButtonActualizarTipoDireccion.setText("Actualizar");
        this.jButtonEliminarTipoDireccion.setText("Eliminar");
        this.jButtonCancelarTipoDireccion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDireccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDireccion.setText("Guardar");
		this.jButtonCerrarTipoDireccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDireccion,"nuevo_button","Nuevo",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDireccion,"modificar_button","Editar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDireccion,"actualizar_button","Actualizar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDireccion,"eliminar_button","Eliminar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDireccion,"cancelar_button","Cancelar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDireccion,"guardarcambios_button","Guardar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDireccion,"guardarcambiostabla_button","Guardar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDireccion,"cerrar_button","Salir",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDireccion.setToolTipText("Nuevo"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDireccion.setToolTipText("Editar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDireccion.setToolTipText("Actualizar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDireccion.setToolTipText("Eliminar)"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDireccion.setToolTipText("Cancelar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDireccion.setToolTipText("Guardar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDireccion.setToolTipText("Guardar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDireccion.setToolTipText("Salir"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDireccion";
		inputMap = this.jButtonNuevoTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDireccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDireccion";
		inputMap = this.jButtonActualizarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDireccion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDireccion";
		inputMap = this.jButtonEliminarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDireccion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDireccion";
		inputMap = this.jButtonCancelarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDireccion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDireccion";
		inputMap = this.jButtonCerrarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDireccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDireccion";
		inputMap = this.jButtonGuardarCambiosTablaTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDireccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDireccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDireccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDireccion.setToolTipText("Nuevo TipoDireccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDireccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDireccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDireccion.setToolTipText("Sin Cerrar Ventana TipoDireccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDireccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDireccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDireccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDireccion.setText("Accion");
		this.jComboBoxTiposAccionesTipoDireccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDireccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDireccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDireccion = new JLabelMe();
		
		this.jLabelAccionesTipoDireccion.setText("Acciones");		
		this.jLabelAccionesTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDireccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDireccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDireccion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDireccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDireccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDireccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDireccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDireccion = new GridBagLayout();
		
		this.jPanelCamposTipoDireccion.setLayout(gridaBagLayoutCamposTipoDireccion);
		this.jPanelCamposOcultosTipoDireccion.setLayout(gridaBagLayoutCamposOcultosTipoDireccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 0;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDireccion.add(jLabelIdTipoDireccion, this.gridBagConstraintsTipoDireccion);



	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 1;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDireccion.add(jLabelidTipoDireccion, this.gridBagConstraintsTipoDireccion);


	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 0;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDireccion.add(jLabelid_empresaTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx = 2;
		this.gridBagConstraintsTipoDireccion.ipadx = 0;
		this.gridBagConstraintsTipoDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDireccion.add(jButtonid_empresaTipoDireccionBusqueda, this.gridBagConstraintsTipoDireccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx = 3;
		this.gridBagConstraintsTipoDireccion.ipadx = 0;
		this.gridBagConstraintsTipoDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDireccion.add(jButtonid_empresaTipoDireccionUpdate, this.gridBagConstraintsTipoDireccion);
	}

	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 1;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDireccion.add(jComboBoxid_empresaTipoDireccion, this.gridBagConstraintsTipoDireccion);


	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 0;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDireccion.add(jLabelcodigoTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx = 2;
		this.gridBagConstraintsTipoDireccion.ipadx = 0;
		this.gridBagConstraintsTipoDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDireccion.add(jButtoncodigoTipoDireccionBusqueda, this.gridBagConstraintsTipoDireccion);
	}

	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 1;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDireccion.add(jTextFieldcodigoTipoDireccion, this.gridBagConstraintsTipoDireccion);


	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 0;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDireccion.add(jLabelnombreTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx = 2;
		this.gridBagConstraintsTipoDireccion.ipadx = 0;
		this.gridBagConstraintsTipoDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDireccion.add(jButtonnombreTipoDireccionBusqueda, this.gridBagConstraintsTipoDireccion);
	}

	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDireccion.gridy = 0;
	this.gridBagConstraintsTipoDireccion.gridx = 1;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDireccion.add(jscrollPanenombreTipoDireccion, this.gridBagConstraintsTipoDireccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDireccion.gridy = iYPanelCamposTipoDireccion;
	this.gridBagConstraintsTipoDireccion.gridx = iXPanelCamposTipoDireccion++;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDireccion.add(this.jPanelidTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(iXPanelCamposTipoDireccion % 1==0) {
		iXPanelCamposTipoDireccion=0;
		iYPanelCamposTipoDireccion++;
	}
	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDireccion.gridy = iYPanelCamposTipoDireccion;
	this.gridBagConstraintsTipoDireccion.gridx = iXPanelCamposTipoDireccion++;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDireccion.add(this.jPanelcodigoTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(iXPanelCamposTipoDireccion % 1==0) {
		iXPanelCamposTipoDireccion=0;
		iYPanelCamposTipoDireccion++;
	}
	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDireccion.gridy = iYPanelCamposTipoDireccion;
	this.gridBagConstraintsTipoDireccion.gridx = iXPanelCamposTipoDireccion++;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDireccion.add(this.jPanelnombreTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(iXPanelCamposTipoDireccion % 1==0) {
		iXPanelCamposTipoDireccion=0;
		iYPanelCamposTipoDireccion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDireccion.gridy = iYPanelCamposOcultosTipoDireccion;
	this.gridBagConstraintsTipoDireccion.gridx = iXPanelCamposOcultosTipoDireccion++;
	this.gridBagConstraintsTipoDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDireccion.add(this.jPanelid_empresaTipoDireccion, this.gridBagConstraintsTipoDireccion);



	if(iXPanelCamposOcultosTipoDireccion % 1==0) {
		iXPanelCamposOcultosTipoDireccion=0;
		iYPanelCamposOcultosTipoDireccion++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDireccion= new GridBagLayout();
		this.jPanelAccionesTipoDireccion.setLayout(gridaBagLayoutAccionesTipoDireccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDireccion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDireccion.setLayout(gridaBagLayoutAccionesFormularioTipoDireccion);
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDireccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDireccion.add(this.jComboBoxTiposAccionesFormularioTipoDireccion, this.gridBagConstraintsTipoDireccion);

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDireccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDireccion.add(this.jCheckBoxPostAccionNuevoTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDireccion.add(this.jCheckBoxPostAccionSinCerrarTipoDireccion, this.gridBagConstraintsTipoDireccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDireccion.add(this.jCheckBoxPostAccionSinMensajeTipoDireccion, this.gridBagConstraintsTipoDireccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDireccion.add(this.jButtonModificarTipoDireccion, this.gridBagConstraintsTipoDireccion);							

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDireccion.add(this.jButtonEliminarTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
			
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = 0;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDireccion.add(this.jButtonActualizarTipoDireccion, this.gridBagConstraintsTipoDireccion);


		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = 0;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDireccion.add(this.jButtonGuardarCambiosTipoDireccion, this.gridBagConstraintsTipoDireccion);	
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = 0;		
		this.gridBagConstraintsTipoDireccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDireccion.add(this.jButtonCancelarTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDireccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDireccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();						
			this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDireccion.gridx = 0;		
			//this.gridBagConstraintsTipoDireccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDireccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDireccion.gridx =0;
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDireccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDireccion, this.gridBagConstraintsTipoDireccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDireccion = new TipoDireccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Direccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Direccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Direccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDireccionModel tipodireccionModel=new TipoDireccionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDireccionModel.TipoDireccionFocusTraversalPolicy tipodireccionFocusTraversalPolicy = tipodireccionModel.new TipoDireccionFocusTraversalPolicy(this);
			
			//tipodireccionFocusTraversalPolicy.settipodireccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodireccionModel);
			
			
			this.jContentPaneDetalleTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDireccion = new GridBagLayout();	
			this.jContentPaneDetalleTipoDireccion.setLayout(gridaBagLayoutDetalleTipoDireccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDireccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
				this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDireccion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDireccion.add(jTtoolBarDetalleTipoDireccion, gridBagConstraintsTipoDireccion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDireccion=   new JScrollPane(jContentPaneDetalleTipoDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDireccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDireccion.gridx = 0;
	        
			this.jContentPaneDetalleTipoDireccion.add(jPanelCamposTipoDireccion, gridBagConstraintsTipoDireccion);
			
			
			
			
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
						&& tipodireccionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDireccion(this.puedeCargarPorParteDireccion,false,-1);
					
					if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDireccion= new GridBagConstraints();
						this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDireccion.gridx = 0;
						this.jContentPaneDetalleTipoDireccion.add(this.jTabbedPaneRelacionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDireccion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDireccion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDireccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
					this.gridBagConstraintsTipoDireccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDireccion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDireccion.add(jPanelCamposOcultosTipoDireccion, gridBagConstraintsTipoDireccion);
				
					this.jPanelCamposOcultosTipoDireccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoDireccion.gridx = 0;
	        this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDireccion.add(this.jPanelAccionesFormularioTipoDireccion, this.gridBagConstraintsTipoDireccion);							
			
			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
	        this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoDireccion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDireccion.add(this.jPanelAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDireccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDireccion=   new JScrollPane(this.jPanelCamposTipoDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDireccion.gridx = 0;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDireccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDireccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDireccion, this.gridBagConstraintsTipoDireccion);			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDireccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
			
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
			
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDireccion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDireccion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDireccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.direccionSessionBean=new DireccionSessionBean();
		this.direccionSessionBean.setConGuardarRelaciones(false);
		this.direccionSessionBean.setEsGuardarRelacionado(true);

		this.direccionBeanSwingJInternalFrame=null;//new DireccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.direccionBeanSwingJInternalFramePopup=new DireccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.direccionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.direccionSessionBean.getEsGuardarRelacionado()) {

				DireccionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.direccionSessionBean.setEsGuardarRelacionado(true);

				this.direccionBeanSwingJInternalFrame=new DireccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.direccionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.direccionBeanSwingJInternalFrame.setdireccionSessionBean(this.direccionSessionBean);

				//this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
				//this.gridBagConstraintsTipoDireccion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDireccion.gridx = 0;
				//this.jContentPaneDetalleTipoDireccion.add(this.direccionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDireccion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDireccion.add("Direcciones",this.direccionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDireccion.setComponentAt(iIndexTab,this.direccionBeanSwingJInternalFrame.getContentPane());
				}

				//DireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.direccionSessionBean.setEsGuardarRelacionado(false);
				this.direccionBeanSwingJInternalFrame=null;//new DireccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDireccion) {
					this.jTabbedPaneRelacionesTipoDireccion.add("Direcciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDireccionBeanSwingJInternalFrame(List<TipoDireccion> tipodireccions,TipoDireccion tipodireccion,DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//direccionBeanSwingJInternalFrame=new DireccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					direccionBeanSwingJInternalFrame.getDireccionLogic().setConnexion(this.tipodireccionLogic.getConnexion());

					direccionBeanSwingJInternalFrame.settipodireccionsForeignKey(tipodireccions);
					direccionBeanSwingJInternalFrame.settipodireccionForeignKey(tipodireccion);
					direccionBeanSwingJInternalFrame.direccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoDireccion(true);
					direccionBeanSwingJInternalFrame.direccionSessionBean.setlidTipoDireccionActual(tipodireccion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					direccionBeanSwingJInternalFrame.cargarCombosForeignKeyDireccion(direccionBeanSwingJInternalFrame.isCargarCombosDependencia);
					direccionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDireccion(true);
					direccionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					direccionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDireccion");
					direccionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDireccion");
					direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(true);
					direccionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDireccion("n",direccionBeanSwingJInternalFrame.isGuardarCambiosEnLote, direccionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					direccionBeanSwingJInternalFrame.setAutoscrolls(true);
					direccionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("relacionado");
					} else {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("no_relacionado");
					}

					direccionBeanSwingJInternalFrame.getjButtonRecargarInformacionDireccion().setVisible(false);

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
