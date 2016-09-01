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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoBancoRetencionConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoBancoRetencionDetalleFormJInternalFrame extends TipoBancoRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoBancoRetencion;
	
	protected JMenuBar jmenuBarDetalleTipoBancoRetencion;
	
	protected JMenu jmenuDetalleTipoBancoRetencion;
	protected JMenu jmenuDetalleArchivoTipoBancoRetencion;
	protected JMenu jmenuDetalleAccionesTipoBancoRetencion;
	protected JMenu jmenuDetalleDatosTipoBancoRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBancoRetencion;	
	protected GridBagConstraints gridBagConstraintsTipoBancoRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoBancoRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoBancoRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBancoRetencionSessionBean tipobancoretencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoBancoRetencionLogic tipobancoretencionLogic;
	
	public JScrollPane jScrollPanelDatosTipoBancoRetencion;
	public JScrollPane jScrollPanelDatosEdicionTipoBancoRetencion;
	public JScrollPane jScrollPanelDatosGeneralTipoBancoRetencion;
	
	protected JPanel jPanelCamposTipoBancoRetencion;    
	protected JPanel jPanelCamposOcultosTipoBancoRetencion;    	
	protected JPanel jPanelAccionesTipoBancoRetencion;
	protected JPanel jPanelAccionesFormularioTipoBancoRetencion;
    
	
	
	protected Integer iXPanelCamposTipoBancoRetencion=0;
	protected Integer iYPanelCamposTipoBancoRetencion=0;
	
	protected Integer iXPanelCamposOcultosTipoBancoRetencion=0;
	protected Integer iYPanelCamposOcultosTipoBancoRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoBancoRetencion;
	public JButton jButtonModificarTipoBancoRetencion;
	public JButton jButtonActualizarTipoBancoRetencion;
    public JButton jButtonEliminarTipoBancoRetencion;
	public JButton jButtonCancelarTipoBancoRetencion;
    public JButton jButtonGuardarCambiosTipoBancoRetencion;
	public JButton jButtonGuardarCambiosTablaTipoBancoRetencion;
	protected JButton jButtonCerrarTipoBancoRetencion;
	
	
	protected JButton jButtonProcesarInformacionTipoBancoRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoBancoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoBancoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoBancoRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBancoRetencion;
	protected JButton jButtonModificarToolBarTipoBancoRetencion;
	protected JButton jButtonActualizarToolBarTipoBancoRetencion;
    protected JButton jButtonEliminarToolBarTipoBancoRetencion;
	protected JButton jButtonCancelarToolBarTipoBancoRetencion;
    protected JButton jButtonGuardarCambiosToolBarTipoBancoRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoBancoRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBancoRetencion;
	protected JButton jButtonCerrarToolBarTipoBancoRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoBancoRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBancoRetencion;
	protected JMenuItem jMenuItemModificarTipoBancoRetencion;
	protected JMenuItem jMenuItemActualizarTipoBancoRetencion;
    protected JMenuItem jMenuItemEliminarTipoBancoRetencion;
	protected JMenuItem jMenuItemCancelarTipoBancoRetencion;
    protected JMenuItem jMenuItemGuardarCambiosTipoBancoRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBancoRetencion;
	protected JMenuItem jMenuItemCerrarTipoBancoRetencion;
	protected JMenuItem jMenuItemDetalleCerrarTipoBancoRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBancoRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoBancoRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBancoRetencion;
	protected JMenuItem jMenuItemMostrarOcultarTipoBancoRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBancoRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBancoRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoBancoRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoBancoRetencion;
	public JLabel jLabelIdTipoBancoRetencion;
	public JLabel jLabelidTipoBancoRetencion;
	public JButton jButtonidTipoBancoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoBancoRetencion;
	public JLabel jLabelcodigoTipoBancoRetencion;
	public JTextField jTextFieldcodigoTipoBancoRetencion;
	public JButton jButtoncodigoTipoBancoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoBancoRetencion;
	public JLabel jLabelnombreTipoBancoRetencion;
	public JTextArea jTextAreanombreTipoBancoRetencion;
	public JScrollPane jscrollPanenombreTipoBancoRetencion;
	public JButton jButtonnombreTipoBancoRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoBancoRetencion;
	public JLabel jLabelid_empresaTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoBancoRetencion;
	public JButton jButtonid_empresaTipoBancoRetencion= new JButtonMe();
	public JButton jButtonid_empresaTipoBancoRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoBancoRetencionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoBancoRetencion;
	
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
	
	public TipoBancoRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoBancoRetencion=new JPanel();
				this.jPanelAccionesFormularioTipoBancoRetencion=new JPanel();
				this.jmenuBarDetalleTipoBancoRetencion=new JMenuBar();
				this.jTtoolBarDetalleTipoBancoRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoBancoRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoBancoRetencion() {
		return this.jButtonActualizarToolBarTipoBancoRetencion;
	}
	
	public JButton getjButtonEliminarToolBarTipoBancoRetencion() {
		return this.jButtonEliminarToolBarTipoBancoRetencion;
	}
	
	public JButton getjButtonCancelarToolBarTipoBancoRetencion() {
		return this.jButtonCancelarToolBarTipoBancoRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoBancoRetencion() {
		return this.jButtonProcesarInformacionTipoBancoRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBancoRetencion)	{
		this.jButtonProcesarInformacionTipoBancoRetencion = jButtonProcesarInformacionTipoBancoRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBancoRetencion() {
		return this.jComboBoxTiposAccionesTipoBancoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBancoRetencion(
			JComboBox jComboBoxTiposRelacionesTipoBancoRetencion) {
		this.jComboBoxTiposRelacionesTipoBancoRetencion = jComboBoxTiposRelacionesTipoBancoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBancoRetencion(
			JComboBox jComboBoxTiposAccionesTipoBancoRetencion) {
		this.jComboBoxTiposAccionesTipoBancoRetencion = jComboBoxTiposAccionesTipoBancoRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoBancoRetencion() {
		return this.jComboBoxTiposAccionesFormularioTipoBancoRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoBancoRetencion(
			JComboBox jComboBoxTiposAccionesFormularioTipoBancoRetencion) {
		this.jComboBoxTiposAccionesFormularioTipoBancoRetencion = jComboBoxTiposAccionesFormularioTipoBancoRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
		
		this.tipobancoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancoretencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoBancoRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoBancoRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoBancoRetencion=new JButtonMe();
				this.jButtonModificarToolBarTipoBancoRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoBancoRetencion,this.jTtoolBarDetalleTipoBancoRetencion,
							"actualizar","actualizar","Actualizar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoBancoRetencion,this.jTtoolBarDetalleTipoBancoRetencion,
							"eliminar","eliminar","Eliminar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoBancoRetencion,this.jTtoolBarDetalleTipoBancoRetencion,
							"cancelar","cancelar","Cancelar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoBancoRetencion,this.jTtoolBarDetalleTipoBancoRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoBancoRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoBancoRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoBancoRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoBancoRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoBancoRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBancoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBancoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBancoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoBancoRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoBancoRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoBancoRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoBancoRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoBancoRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoBancoRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoBancoRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoBancoRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoBancoRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoBancoRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoBancoRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoBancoRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoBancoRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBancoRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBancoRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBancoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBancoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBancoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoBancoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoBancoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoBancoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBancoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBancoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBancoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBancoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBancoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBancoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoBancoRetencion.add(this.jMenuItemDetalleCerrarTipoBancoRetencion);
		
		this.jmenuDetalleAccionesTipoBancoRetencion.add(this.jMenuItemActualizarTipoBancoRetencion);
		this.jmenuDetalleAccionesTipoBancoRetencion.add(this.jMenuItemEliminarTipoBancoRetencion);
		this.jmenuDetalleAccionesTipoBancoRetencion.add(this.jMenuItemCancelarTipoBancoRetencion);		
		
		//this.jmenuDetalleDatosTipoBancoRetencion.add(this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion);				
		this.jmenuDetalleDatosTipoBancoRetencion.add(this.jMenuItemDetalleMostarOcultarTipoBancoRetencion);				
				
		//this.jmenuDetalleAccionesTipoBancoRetencion.add(this.jMenuItemGuardarCambiosTipoBancoRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoBancoRetencion.add(this.jmenuDetalleArchivoTipoBancoRetencion);		
		this.jmenuBarDetalleTipoBancoRetencion.add(this.jmenuDetalleAccionesTipoBancoRetencion);		
		this.jmenuBarDetalleTipoBancoRetencion.add(this.jmenuDetalleDatosTipoBancoRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoBancoRetencion);				
	}
	
	
	public void inicializarElementosCamposTipoBancoRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoBancoRetencion = new JLabelMe();
		jLabelIdTipoBancoRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoBancoRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoBancoRetencion.setToolTipText(TipoBancoRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoBancoRetencion= new GridBagLayout();

		this.jPanelidTipoBancoRetencion.setLayout(this.gridaBagLayoutTipoBancoRetencion);

		jLabelidTipoBancoRetencion = new JLabel();
		jLabelidTipoBancoRetencion.setText("Id");

		jLabelidTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoBancoRetencion = new JLabelMe();
		this.jLabelcodigoTipoBancoRetencion.setText(""+TipoBancoRetencionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoBancoRetencion.setToolTipText("Codigo");
		this.jLabelcodigoTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoBancoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoBancoRetencion.setToolTipText(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoBancoRetencion = new GridBagLayout();
		this.jPanelcodigoTipoBancoRetencion.setLayout(this.gridaBagLayoutTipoBancoRetencion);


		jTextFieldcodigoTipoBancoRetencion= new JTextFieldMe();

		jTextFieldcodigoTipoBancoRetencion.setEnabled(false);
		jTextFieldcodigoTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoBancoRetencionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoBancoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBancoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBancoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoBancoRetencionBusqueda.setText("U");
		this.jButtoncodigoTipoBancoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoBancoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoBancoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoBancoRetencionBusqueda"));

		if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoBancoRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoBancoRetencion = new JLabelMe();
		this.jLabelnombreTipoBancoRetencion.setText(""+TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoBancoRetencion.setToolTipText("Nombre");
		this.jLabelnombreTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoBancoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoBancoRetencion.setToolTipText(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoBancoRetencion = new GridBagLayout();
		this.jPanelnombreTipoBancoRetencion.setLayout(this.gridaBagLayoutTipoBancoRetencion);


		jTextAreanombreTipoBancoRetencion= new JTextAreaMe();
		jTextAreanombreTipoBancoRetencion.setEnabled(false);
		jTextAreanombreTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoRetencion.setLineWrap(true);
		jTextAreanombreTipoBancoRetencion.setWrapStyleWord(true);
		jTextAreanombreTipoBancoRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoBancoRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoBancoRetencion = new JScrollPane(jTextAreanombreTipoBancoRetencion);
		jscrollPanenombreTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoBancoRetencionBusqueda= new JButtonMe();
		this.jButtonnombreTipoBancoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoBancoRetencionBusqueda.setText("U");
		this.jButtonnombreTipoBancoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoBancoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoBancoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoBancoRetencionBusqueda"));

		if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoBancoRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoBancoRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoBancoRetencion = new JLabelMe();
		this.jLabelid_empresaTipoBancoRetencion.setText(""+TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoBancoRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoBancoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoBancoRetencion.setToolTipText(TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoBancoRetencion = new GridBagLayout();
		this.jPanelid_empresaTipoBancoRetencion.setLayout(this.gridaBagLayoutTipoBancoRetencion);


		jComboBoxid_empresaTipoBancoRetencion= new JComboBoxMe();
		jComboBoxid_empresaTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoBancoRetencion.setEnabled(false);

		this.jButtonid_empresaTipoBancoRetencion= new JButtonMe();
		this.jButtonid_empresaTipoBancoRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBancoRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBancoRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBancoRetencion.setText("Buscar");
		this.jButtonid_empresaTipoBancoRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoBancoRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoRetencion"));

		this.jButtonid_empresaTipoBancoRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoBancoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBancoRetencionBusqueda.setText("U");
		this.jButtonid_empresaTipoBancoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoBancoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoRetencionBusqueda"));

		if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoBancoRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoBancoRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoBancoRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBancoRetencionUpdate.setText("U");
		this.jButtonid_empresaTipoBancoRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoBancoRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoRetencionUpdate"));



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
		//this.jInternalFrameDetalleTipoBancoRetencion = new TipoBancoRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Banco Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBancoRetencion= new GridBagLayout();
		

		
		String sToolTipTipoBancoRetencion="";
		sToolTipTipoBancoRetencion=TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBancoRetencion+="(Tesoreria.TipoBancoRetencion)";
		}
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBancoRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoBancoRetencion = new JButtonMe();
		this.jButtonModificarTipoBancoRetencion = new JButtonMe();
        this.jButtonActualizarTipoBancoRetencion = new JButtonMe();
        this.jButtonEliminarTipoBancoRetencion = new JButtonMe();
        this.jButtonCancelarTipoBancoRetencion = new JButtonMe();
        this.jButtonGuardarCambiosTipoBancoRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoBancoRetencion = new JButtonMe();
		this.jButtonCerrarTipoBancoRetencion = new JButtonMe();
		
		this.jScrollPanelDatosTipoBancoRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoBancoRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoBancoRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco Retencion";
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBancoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoBancoRetencion.setName("jPanelCamposTipoBancoRetencion"); 

		this.jPanelCamposOcultosTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoBancoRetencion.setName("jPanelCamposOcultosTipoBancoRetencion"); 

        this.jPanelAccionesTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBancoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesTipoBancoRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoBancoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoBancoRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoBancoRetencion.setText("Nuevo");
		this.jButtonModificarTipoBancoRetencion.setText("Editar");
        this.jButtonActualizarTipoBancoRetencion.setText("Actualizar");
        this.jButtonEliminarTipoBancoRetencion.setText("Eliminar");
        this.jButtonCancelarTipoBancoRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoBancoRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.setText("Guardar");
		this.jButtonCerrarTipoBancoRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBancoRetencion,"nuevo_button","Nuevo",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoBancoRetencion,"modificar_button","Editar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoBancoRetencion,"actualizar_button","Actualizar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoBancoRetencion,"eliminar_button","Eliminar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoBancoRetencion,"cancelar_button","Cancelar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoBancoRetencion,"guardarcambios_button","Guardar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBancoRetencion,"guardarcambiostabla_button","Guardar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBancoRetencion,"cerrar_button","Salir",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoBancoRetencion.setToolTipText("Nuevo"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoBancoRetencion.setToolTipText("Editar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoBancoRetencion.setToolTipText("Actualizar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoBancoRetencion.setToolTipText("Eliminar)"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoBancoRetencion.setToolTipText("Cancelar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoBancoRetencion.setToolTipText("Guardar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.setToolTipText("Guardar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBancoRetencion.setToolTipText("Salir"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBancoRetencion";
		inputMap = this.jButtonNuevoTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBancoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBancoRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoBancoRetencion";
		inputMap = this.jButtonActualizarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoBancoRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoBancoRetencion";
		inputMap = this.jButtonEliminarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoBancoRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoBancoRetencion";
		inputMap = this.jButtonCancelarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoBancoRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoBancoRetencion";
		inputMap = this.jButtonCerrarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBancoRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBancoRetencion";
		inputMap = this.jButtonGuardarCambiosTablaTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBancoRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoBancoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoBancoRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoBancoRetencion.setToolTipText("Nuevo TipoBancoRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoBancoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoBancoRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoBancoRetencion.setToolTipText("Sin Cerrar Ventana TipoBancoRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoBancoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoBancoRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoBancoRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBancoRetencion.setText("Accion");
		this.jComboBoxTiposAccionesTipoBancoRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoBancoRetencion = new JLabelMe();
		
		this.jLabelAccionesTipoBancoRetencion.setText("Acciones");		
		this.jLabelAccionesTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoBancoRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoBancoRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoBancoRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoBancoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoBancoRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoBancoRetencion = new GridBagLayout();
		
		this.jPanelCamposTipoBancoRetencion.setLayout(gridaBagLayoutCamposTipoBancoRetencion);
		this.jPanelCamposOcultosTipoBancoRetencion.setLayout(gridaBagLayoutCamposOcultosTipoBancoRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoBancoRetencion.add(jLabelIdTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 1;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoBancoRetencion.add(jLabelidTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);


	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoBancoRetencion.add(jLabelid_empresaTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx = 2;
		this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBancoRetencion.add(jButtonid_empresaTipoBancoRetencionBusqueda, this.gridBagConstraintsTipoBancoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx = 3;
		this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBancoRetencion.add(jButtonid_empresaTipoBancoRetencionUpdate, this.gridBagConstraintsTipoBancoRetencion);
	}

	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 1;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoBancoRetencion.add(jComboBoxid_empresaTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);


	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoBancoRetencion.add(jLabelcodigoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx = 2;
		this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoBancoRetencion.add(jButtoncodigoTipoBancoRetencionBusqueda, this.gridBagConstraintsTipoBancoRetencion);
	}

	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 1;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoBancoRetencion.add(jTextFieldcodigoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);


	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoBancoRetencion.add(jLabelnombreTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx = 2;
		this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoBancoRetencion.add(jButtonnombreTipoBancoRetencionBusqueda, this.gridBagConstraintsTipoBancoRetencion);
	}

	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
	this.gridBagConstraintsTipoBancoRetencion.gridx = 1;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoBancoRetencion.add(jscrollPanenombreTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoRetencion.gridy = iYPanelCamposTipoBancoRetencion;
	this.gridBagConstraintsTipoBancoRetencion.gridx = iXPanelCamposTipoBancoRetencion++;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoRetencion.add(this.jPanelidTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(iXPanelCamposTipoBancoRetencion % 1==0) {
		iXPanelCamposTipoBancoRetencion=0;
		iYPanelCamposTipoBancoRetencion++;
	}
	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoRetencion.gridy = iYPanelCamposTipoBancoRetencion;
	this.gridBagConstraintsTipoBancoRetencion.gridx = iXPanelCamposTipoBancoRetencion++;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoRetencion.add(this.jPanelcodigoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(iXPanelCamposTipoBancoRetencion % 1==0) {
		iXPanelCamposTipoBancoRetencion=0;
		iYPanelCamposTipoBancoRetencion++;
	}
	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoRetencion.gridy = iYPanelCamposTipoBancoRetencion;
	this.gridBagConstraintsTipoBancoRetencion.gridx = iXPanelCamposTipoBancoRetencion++;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoRetencion.add(this.jPanelnombreTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(iXPanelCamposTipoBancoRetencion % 1==0) {
		iXPanelCamposTipoBancoRetencion=0;
		iYPanelCamposTipoBancoRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoRetencion.gridy = iYPanelCamposOcultosTipoBancoRetencion;
	this.gridBagConstraintsTipoBancoRetencion.gridx = iXPanelCamposOcultosTipoBancoRetencion++;
	this.gridBagConstraintsTipoBancoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoBancoRetencion.add(this.jPanelid_empresaTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);



	if(iXPanelCamposOcultosTipoBancoRetencion % 1==0) {
		iXPanelCamposOcultosTipoBancoRetencion=0;
		iYPanelCamposOcultosTipoBancoRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoBancoRetencion= new GridBagLayout();
		this.jPanelAccionesTipoBancoRetencion.setLayout(gridaBagLayoutAccionesTipoBancoRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoBancoRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoBancoRetencion.setLayout(gridaBagLayoutAccionesFormularioTipoBancoRetencion);
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBancoRetencion.add(this.jComboBoxTiposAccionesFormularioTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBancoRetencion.add(this.jCheckBoxPostAccionNuevoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBancoRetencion.add(this.jCheckBoxPostAccionSinCerrarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBancoRetencion.add(this.jCheckBoxPostAccionSinMensajeTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoBancoRetencion.add(this.jButtonModificarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);							

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoBancoRetencion.add(this.jButtonEliminarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
			
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBancoRetencion.add(this.jButtonActualizarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);


		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBancoRetencion.add(this.jButtonGuardarCambiosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);	
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;		
		this.gridBagConstraintsTipoBancoRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoBancoRetencion.add(this.jButtonCancelarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBancoRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBancoRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();						
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;		
			//this.gridBagConstraintsTipoBancoRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBancoRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoRetencion.gridx =0;
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBancoRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoBancoRetencion = new TipoBancoRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Banco Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Banco Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoBancoRetencionModel tipobancoretencionModel=new TipoBancoRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoBancoRetencionModel.TipoBancoRetencionFocusTraversalPolicy tipobancoretencionFocusTraversalPolicy = tipobancoretencionModel.new TipoBancoRetencionFocusTraversalPolicy(this);
			
			//tipobancoretencionFocusTraversalPolicy.settipobancoretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipobancoretencionModel);
			
			
			this.jContentPaneDetalleTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoBancoRetencion = new GridBagLayout();	
			this.jContentPaneDetalleTipoBancoRetencion.setLayout(gridaBagLayoutDetalleTipoBancoRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBancoRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoBancoRetencion.add(jTtoolBarDetalleTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoBancoRetencion=   new JScrollPane(jContentPaneDetalleTipoBancoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBancoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoBancoRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBancoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	        
			this.jContentPaneDetalleTipoBancoRetencion.add(jPanelCamposTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);
			
			
			
			
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
						&& tipobancoretencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoBancoRetencion= new GridBagConstraints();
						this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
						this.jContentPaneDetalleTipoBancoRetencion.add(this.jTabbedPaneRelacionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoBancoRetencion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoBancoRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
					this.gridBagConstraintsTipoBancoRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoBancoRetencion.add(jPanelCamposOcultosTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);
				
					this.jPanelCamposOcultosTipoBancoRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	        this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoBancoRetencion.add(this.jPanelAccionesFormularioTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);							
			
			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
	        this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoBancoRetencion.add(this.jPanelAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoBancoRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoBancoRetencion=   new JScrollPane(this.jPanelCamposTipoBancoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBancoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoBancoRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
			
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
			
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoBancoRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoBancoRetencion;
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
