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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;



//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarClientesSuspendidosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarClientesSuspendidosDetalleFormJInternalFrame extends CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarClientesSuspendidos;
	
	protected JMenuBar jmenuBarDetalleCobrarClientesSuspendidos;
	
	protected JMenu jmenuDetalleCobrarClientesSuspendidos;
	protected JMenu jmenuDetalleArchivoCobrarClientesSuspendidos;
	protected JMenu jmenuDetalleAccionesCobrarClientesSuspendidos;
	protected JMenu jmenuDetalleDatosCobrarClientesSuspendidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesSuspendidos;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesSuspendidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarClientesSuspendidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CobrarClientesSuspendidosSessionBean cobrarclientessuspendidosSessionBean;
	
	
	
		
	
	public CobrarClientesSuspendidosLogic cobrarclientessuspendidosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarClientesSuspendidos;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesSuspendidos;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesSuspendidos;
	
	protected JPanel jPanelCamposCobrarClientesSuspendidos;    
	protected JPanel jPanelCamposOcultosCobrarClientesSuspendidos;    	
	protected JPanel jPanelAccionesCobrarClientesSuspendidos;
	protected JPanel jPanelAccionesFormularioCobrarClientesSuspendidos;
    
	
	
	protected Integer iXPanelCamposCobrarClientesSuspendidos=0;
	protected Integer iYPanelCamposCobrarClientesSuspendidos=0;
	
	protected Integer iXPanelCamposOcultosCobrarClientesSuspendidos=0;
	protected Integer iYPanelCamposOcultosCobrarClientesSuspendidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarClientesSuspendidos;
	public JButton jButtonModificarCobrarClientesSuspendidos;
	public JButton jButtonActualizarCobrarClientesSuspendidos;
    public JButton jButtonEliminarCobrarClientesSuspendidos;
	public JButton jButtonCancelarCobrarClientesSuspendidos;
    public JButton jButtonGuardarCambiosCobrarClientesSuspendidos;
	public JButton jButtonGuardarCambiosTablaCobrarClientesSuspendidos;
	protected JButton jButtonCerrarCobrarClientesSuspendidos;
	
	
	protected JButton jButtonProcesarInformacionCobrarClientesSuspendidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarClientesSuspendidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesSuspendidos;
	protected JButton jButtonModificarToolBarCobrarClientesSuspendidos;
	protected JButton jButtonActualizarToolBarCobrarClientesSuspendidos;
    protected JButton jButtonEliminarToolBarCobrarClientesSuspendidos;
	protected JButton jButtonCancelarToolBarCobrarClientesSuspendidos;
    protected JButton jButtonGuardarCambiosToolBarCobrarClientesSuspendidos;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesSuspendidos;
	protected JButton jButtonCerrarToolBarCobrarClientesSuspendidos;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesSuspendidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemModificarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemActualizarCobrarClientesSuspendidos;
    protected JMenuItem jMenuItemEliminarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemCancelarCobrarClientesSuspendidos;
    protected JMenuItem jMenuItemGuardarCambiosCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemCerrarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesSuspendidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesSuspendidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesSuspendidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesSuspendidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarClientesSuspendidos;
	public JLabel jLabelIdCobrarClientesSuspendidos;
	public JLabel jLabelidCobrarClientesSuspendidos;
	public JButton jButtonidCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCobrarClientesSuspendidos;
	public JLabel jLabelid_empresaCobrarClientesSuspendidos;
	public JTextField jTextFieldid_empresaCobrarClientesSuspendidos;
	public JButton jButtonid_empresaCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadCobrarClientesSuspendidos;
	public JLabel jLabelnombre_ciudadCobrarClientesSuspendidos;
	public JTextArea jTextAreanombre_ciudadCobrarClientesSuspendidos;
	public JScrollPane jscrollPanenombre_ciudadCobrarClientesSuspendidos;
	public JButton jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarClientesSuspendidos;
	public JLabel jLabelcodigoCobrarClientesSuspendidos;
	public JTextField jTextFieldcodigoCobrarClientesSuspendidos;
	public JButton jButtoncodigoCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarClientesSuspendidos;
	public JLabel jLabelnombre_completoCobrarClientesSuspendidos;
	public JTextArea jTextAreanombre_completoCobrarClientesSuspendidos;
	public JScrollPane jscrollPanenombre_completoCobrarClientesSuspendidos;
	public JButton jButtonnombre_completoCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_comercialCobrarClientesSuspendidos;
	public JLabel jLabelnombre_comercialCobrarClientesSuspendidos;
	public JTextArea jTextAreanombre_comercialCobrarClientesSuspendidos;
	public JScrollPane jscrollPanenombre_comercialCobrarClientesSuspendidos;
	public JButton jButtonnombre_comercialCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelrucCobrarClientesSuspendidos;
	public JLabel jLabelrucCobrarClientesSuspendidos;
	public JTextField jTextFieldrucCobrarClientesSuspendidos;
	public JButton jButtonrucCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPaneldetalle_estadoCobrarClientesSuspendidos;
	public JLabel jLabeldetalle_estadoCobrarClientesSuspendidos;
	public JTextArea jTextAreadetalle_estadoCobrarClientesSuspendidos;
	public JScrollPane jscrollPanedetalle_estadoCobrarClientesSuspendidos;
	public JButton jButtondetalle_estadoCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_direccionCobrarClientesSuspendidos;
	public JLabel jLabeldireccion_direccionCobrarClientesSuspendidos;
	public JTextArea jTextAreadireccion_direccionCobrarClientesSuspendidos;
	public JScrollPane jscrollPanedireccion_direccionCobrarClientesSuspendidos;
	public JButton jButtondireccion_direccionCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarClientesSuspendidos;
	public JLabel jLabeltelefono_telefonoCobrarClientesSuspendidos;
	public JTextArea jTextAreatelefono_telefonoCobrarClientesSuspendidos;
	public JScrollPane jscrollPanetelefono_telefonoCobrarClientesSuspendidos;
	public JButton jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda= new JButtonMe();

	public JPanel jPanelsaldoCobrarClientesSuspendidos;
	public JLabel jLabelsaldoCobrarClientesSuspendidos;
	public JTextField jTextFieldsaldoCobrarClientesSuspendidos;
	public JButton jButtonsaldoCobrarClientesSuspendidosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarClientesSuspendidos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=1254;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarClientesSuspendidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarClientesSuspendidos=new JPanel();
				this.jPanelAccionesFormularioCobrarClientesSuspendidos=new JPanel();
				this.jmenuBarDetalleCobrarClientesSuspendidos=new JMenuBar();
				this.jTtoolBarDetalleCobrarClientesSuspendidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarClientesSuspendidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSuspendidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesSuspendidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarClientesSuspendidos() {
		return this.jButtonActualizarToolBarCobrarClientesSuspendidos;
	}
	
	public JButton getjButtonEliminarToolBarCobrarClientesSuspendidos() {
		return this.jButtonEliminarToolBarCobrarClientesSuspendidos;
	}
	
	public JButton getjButtonCancelarToolBarCobrarClientesSuspendidos() {
		return this.jButtonCancelarToolBarCobrarClientesSuspendidos;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarClientesSuspendidos() {
		return this.jButtonProcesarInformacionCobrarClientesSuspendidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesSuspendidos)	{
		this.jButtonProcesarInformacionCobrarClientesSuspendidos = jButtonProcesarInformacionCobrarClientesSuspendidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesSuspendidos() {
		return this.jComboBoxTiposAccionesCobrarClientesSuspendidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposRelacionesCobrarClientesSuspendidos) {
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos = jComboBoxTiposRelacionesCobrarClientesSuspendidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposAccionesCobrarClientesSuspendidos) {
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos = jComboBoxTiposAccionesCobrarClientesSuspendidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarClientesSuspendidos() {
		return this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarClientesSuspendidos(
			JComboBox jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos) {
		this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos = jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarclientessuspendidosSessionBean=new CobrarClientesSuspendidosSessionBean();
		
		this.cobrarclientessuspendidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientessuspendidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesSuspendidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesSuspendidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesSuspendidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Suspendidos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarClientesSuspendidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarClientesSuspendidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarClientesSuspendidos=new JButtonMe();
				this.jButtonModificarToolBarCobrarClientesSuspendidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarClientesSuspendidos,this.jTtoolBarDetalleCobrarClientesSuspendidos,
							"actualizar","actualizar","Actualizar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarClientesSuspendidos,this.jTtoolBarDetalleCobrarClientesSuspendidos,
							"eliminar","eliminar","Eliminar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarClientesSuspendidos,this.jTtoolBarDetalleCobrarClientesSuspendidos,
							"cancelar","cancelar","Cancelar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos,this.jTtoolBarDetalleCobrarClientesSuspendidos,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarClientesSuspendidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarClientesSuspendidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarClientesSuspendidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarClientesSuspendidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarClientesSuspendidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesSuspendidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesSuspendidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesSuspendidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarClientesSuspendidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarClientesSuspendidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarClientesSuspendidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarClientesSuspendidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarClientesSuspendidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarClientesSuspendidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarClientesSuspendidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarClientesSuspendidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarClientesSuspendidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarClientesSuspendidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarClientesSuspendidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarClientesSuspendidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarClientesSuspendidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesSuspendidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesSuspendidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesSuspendidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesSuspendidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesSuspendidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarClientesSuspendidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarClientesSuspendidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarClientesSuspendidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesSuspendidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesSuspendidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesSuspendidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarClientesSuspendidos.add(this.jMenuItemDetalleCerrarCobrarClientesSuspendidos);
		
		this.jmenuDetalleAccionesCobrarClientesSuspendidos.add(this.jMenuItemActualizarCobrarClientesSuspendidos);
		this.jmenuDetalleAccionesCobrarClientesSuspendidos.add(this.jMenuItemEliminarCobrarClientesSuspendidos);
		this.jmenuDetalleAccionesCobrarClientesSuspendidos.add(this.jMenuItemCancelarCobrarClientesSuspendidos);		
		
		//this.jmenuDetalleDatosCobrarClientesSuspendidos.add(this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos);				
		this.jmenuDetalleDatosCobrarClientesSuspendidos.add(this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos);				
				
		//this.jmenuDetalleAccionesCobrarClientesSuspendidos.add(this.jMenuItemGuardarCambiosCobrarClientesSuspendidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarClientesSuspendidos.add(this.jmenuDetalleArchivoCobrarClientesSuspendidos);		
		this.jmenuBarDetalleCobrarClientesSuspendidos.add(this.jmenuDetalleAccionesCobrarClientesSuspendidos);		
		this.jmenuBarDetalleCobrarClientesSuspendidos.add(this.jmenuDetalleDatosCobrarClientesSuspendidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarClientesSuspendidos);				
	}
	
	
	public void inicializarElementosCamposCobrarClientesSuspendidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarClientesSuspendidos = new JLabelMe();
		jLabelIdCobrarClientesSuspendidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarClientesSuspendidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarClientesSuspendidos= new GridBagLayout();

		this.jPanelidCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);

		jLabelidCobrarClientesSuspendidos = new JLabel();
		jLabelidCobrarClientesSuspendidos.setText("Id");

		jLabelidCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelid_empresaCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelid_empresaCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarClientesSuspendidos.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelid_empresaCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextFieldid_empresaCobrarClientesSuspendidos= new JTextFieldMe();
		jTextFieldid_empresaCobrarClientesSuspendidos.setEnabled(false);
		jTextFieldid_empresaCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_empresaCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_empresaCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldid_empresaCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldid_empresaCobrarClientesSuspendidos.setText("0");

		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldid_empresaCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldid_empresaCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelnombre_ciudadCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadCobrarClientesSuspendidos.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelnombre_ciudadCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextAreanombre_ciudadCobrarClientesSuspendidos= new JTextAreaMe();
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setEnabled(false);
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setLineWrap(true);
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setWrapStyleWord(true);
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadCobrarClientesSuspendidos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadCobrarClientesSuspendidos = new JScrollPane(jTextAreanombre_ciudadCobrarClientesSuspendidos);
		jscrollPanenombre_ciudadCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelcodigoCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarClientesSuspendidos.setToolTipText("Codigo");
		this.jLabelcodigoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelcodigoCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextFieldcodigoCobrarClientesSuspendidos= new JTextFieldMe();

		jTextFieldcodigoCobrarClientesSuspendidos.setEnabled(false);
		jTextFieldcodigoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelnombre_completoCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarClientesSuspendidos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelnombre_completoCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextAreanombre_completoCobrarClientesSuspendidos= new JTextAreaMe();
		jTextAreanombre_completoCobrarClientesSuspendidos.setEnabled(false);
		jTextAreanombre_completoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesSuspendidos.setLineWrap(true);
		jTextAreanombre_completoCobrarClientesSuspendidos.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarClientesSuspendidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarClientesSuspendidos = new JScrollPane(jTextAreanombre_completoCobrarClientesSuspendidos);
		jscrollPanenombre_completoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_comercialCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelnombre_comercialCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL+" : *");
		this.jLabelnombre_comercialCobrarClientesSuspendidos.setToolTipText("Nombre Comercial");
		this.jLabelnombre_comercialCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_comercialCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_comercialCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_comercialCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelnombre_comercialCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextAreanombre_comercialCobrarClientesSuspendidos= new JTextAreaMe();
		jTextAreanombre_comercialCobrarClientesSuspendidos.setEnabled(false);
		jTextAreanombre_comercialCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesSuspendidos.setLineWrap(true);
		jTextAreanombre_comercialCobrarClientesSuspendidos.setWrapStyleWord(true);
		jTextAreanombre_comercialCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_comercialCobrarClientesSuspendidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_comercialCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_comercialCobrarClientesSuspendidos = new JScrollPane(jTextAreanombre_comercialCobrarClientesSuspendidos);
		jscrollPanenombre_comercialCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_comercialCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_comercialCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_comercialCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabelrucCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelrucCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucCobrarClientesSuspendidos.setToolTipText("Ruc");
		this.jLabelrucCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelrucCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextFieldrucCobrarClientesSuspendidos= new JTextFieldMe();

		jTextFieldrucCobrarClientesSuspendidos.setEnabled(false);
		jTextFieldrucCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtonrucCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtonrucCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabeldetalle_estadoCobrarClientesSuspendidos = new JLabelMe();
		this.jLabeldetalle_estadoCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO+" : *");
		this.jLabeldetalle_estadoCobrarClientesSuspendidos.setToolTipText("Detalle Estado");
		this.jLabeldetalle_estadoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalle_estadoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalle_estadoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalle_estadoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalle_estadoCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalle_estadoCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPaneldetalle_estadoCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextAreadetalle_estadoCobrarClientesSuspendidos= new JTextAreaMe();
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setEnabled(false);
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setLineWrap(true);
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setWrapStyleWord(true);
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalle_estadoCobrarClientesSuspendidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadetalle_estadoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalle_estadoCobrarClientesSuspendidos = new JScrollPane(jTextAreadetalle_estadoCobrarClientesSuspendidos);
		jscrollPanedetalle_estadoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedetalle_estadoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedetalle_estadoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalle_estadoCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalle_estadoCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalle_estadoCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_direccionCobrarClientesSuspendidos = new JLabelMe();
		this.jLabeldireccion_direccionCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION+" : *");
		this.jLabeldireccion_direccionCobrarClientesSuspendidos.setToolTipText("Direccion Direccion");
		this.jLabeldireccion_direccionCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_direccionCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_direccionCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_direccionCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPaneldireccion_direccionCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextAreadireccion_direccionCobrarClientesSuspendidos= new JTextAreaMe();
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setEnabled(false);
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setLineWrap(true);
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setWrapStyleWord(true);
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_direccionCobrarClientesSuspendidos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_direccionCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_direccionCobrarClientesSuspendidos = new JScrollPane(jTextAreadireccion_direccionCobrarClientesSuspendidos);
		jscrollPanedireccion_direccionCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_direccionCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_direccionCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_direccionCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarClientesSuspendidos = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarClientesSuspendidos.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextAreatelefono_telefonoCobrarClientesSuspendidos= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setEnabled(false);
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarClientesSuspendidos = new JScrollPane(jTextAreatelefono_telefonoCobrarClientesSuspendidos);
		jscrollPanetelefono_telefonoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.setVisible(false);		}


					
		this.jLabelsaldoCobrarClientesSuspendidos = new JLabelMe();
		this.jLabelsaldoCobrarClientesSuspendidos.setText(""+CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoCobrarClientesSuspendidos.setToolTipText("Saldo");
		this.jLabelsaldoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoCobrarClientesSuspendidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoCobrarClientesSuspendidos.setToolTipText(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		this.jPanelsaldoCobrarClientesSuspendidos.setLayout(this.gridaBagLayoutCobrarClientesSuspendidos);


		jTextFieldsaldoCobrarClientesSuspendidos= new JTextFieldMe();
		jTextFieldsaldoCobrarClientesSuspendidos.setEnabled(false);
		jTextFieldsaldoCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoCobrarClientesSuspendidos.setText("0.0");

		this.jButtonsaldoCobrarClientesSuspendidosBusqueda= new JButtonMe();
		this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setText("U");
		this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoCobrarClientesSuspendidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoCobrarClientesSuspendidosBusqueda"));

		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoCobrarClientesSuspendidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarClientesSuspendidos() {
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
		//this.jInternalFrameDetalleCobrarClientesSuspendidos = new CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Clientes Suspendidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesSuspendidos= new GridBagLayout();
		

		
		String sToolTipCobrarClientesSuspendidos="";
		sToolTipCobrarClientesSuspendidos=CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesSuspendidos+="(Cartera.CobrarClientesSuspendidos)";
		}
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesSuspendidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonModificarCobrarClientesSuspendidos = new JButtonMe();
        this.jButtonActualizarCobrarClientesSuspendidos = new JButtonMe();
        this.jButtonEliminarCobrarClientesSuspendidos = new JButtonMe();
        this.jButtonCancelarCobrarClientesSuspendidos = new JButtonMe();
        this.jButtonGuardarCambiosCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos = new JButtonMe();
		this.jButtonCerrarCobrarClientesSuspendidos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesSuspendidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarClientesSuspendidos = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarClientesSuspendidos = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Suspendidos";
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Suspendidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesSuspendidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarClientesSuspendidos.setName("jPanelCamposCobrarClientesSuspendidos"); 

		this.jPanelCamposOcultosCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarClientesSuspendidos.setName("jPanelCamposOcultosCobrarClientesSuspendidos"); 

        this.jPanelAccionesCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesSuspendidos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesSuspendidos.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarClientesSuspendidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarClientesSuspendidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarClientesSuspendidos.setText("Nuevo");
		this.jButtonModificarCobrarClientesSuspendidos.setText("Editar");
        this.jButtonActualizarCobrarClientesSuspendidos.setText("Actualizar");
        this.jButtonEliminarCobrarClientesSuspendidos.setText("Eliminar");
        this.jButtonCancelarCobrarClientesSuspendidos.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarClientesSuspendidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.setText("Guardar");
		this.jButtonCerrarCobrarClientesSuspendidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesSuspendidos,"nuevo_button","Nuevo",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarClientesSuspendidos,"modificar_button","Editar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarClientesSuspendidos,"actualizar_button","Actualizar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarClientesSuspendidos,"eliminar_button","Eliminar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarClientesSuspendidos,"cancelar_button","Cancelar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarClientesSuspendidos,"guardarcambios_button","Guardar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos,"guardarcambiostabla_button","Guardar",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesSuspendidos,"cerrar_button","Salir",this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarClientesSuspendidos.setToolTipText("Nuevo"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarClientesSuspendidos.setToolTipText("Editar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarClientesSuspendidos.setToolTipText("Actualizar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarClientesSuspendidos.setToolTipText("Eliminar)"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarClientesSuspendidos.setToolTipText("Cancelar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarClientesSuspendidos.setToolTipText("Guardar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.setToolTipText("Guardar"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesSuspendidos.setToolTipText("Salir"+" "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesSuspendidos";
		inputMap = this.jButtonNuevoCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesSuspendidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesSuspendidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarClientesSuspendidos";
		inputMap = this.jButtonActualizarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarClientesSuspendidos"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarClientesSuspendidos";
		inputMap = this.jButtonEliminarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarClientesSuspendidos"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarClientesSuspendidos";
		inputMap = this.jButtonCancelarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarClientesSuspendidos"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesSuspendidos";
		inputMap = this.jButtonCerrarCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesSuspendidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesSuspendidos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesSuspendidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarClientesSuspendidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarClientesSuspendidos.setToolTipText("Nuevo CobrarClientesSuspendidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos.setToolTipText("Sin Cerrar Ventana CobrarClientesSuspendidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarClientesSuspendidos = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesSuspendidos.setText("Acciones");		
		this.jLabelAccionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarClientesSuspendidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarClientesSuspendidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarClientesSuspendidos=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarClientesSuspendidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarClientesSuspendidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarClientesSuspendidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarClientesSuspendidos = new GridBagLayout();
		
		this.jPanelCamposCobrarClientesSuspendidos.setLayout(gridaBagLayoutCamposCobrarClientesSuspendidos);
		this.jPanelCamposOcultosCobrarClientesSuspendidos.setLayout(gridaBagLayoutCamposOcultosCobrarClientesSuspendidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarClientesSuspendidos.add(jLabelIdCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarClientesSuspendidos.add(jLabelidCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarClientesSuspendidos.add(jLabelid_empresaCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesSuspendidos.add(jButtonid_empresaCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarClientesSuspendidos.add(jTextFieldid_empresaCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadCobrarClientesSuspendidos.add(jLabelnombre_ciudadCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadCobrarClientesSuspendidos.add(jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadCobrarClientesSuspendidos.add(jscrollPanenombre_ciudadCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarClientesSuspendidos.add(jLabelcodigoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarClientesSuspendidos.add(jButtoncodigoCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarClientesSuspendidos.add(jTextFieldcodigoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarClientesSuspendidos.add(jLabelnombre_completoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarClientesSuspendidos.add(jButtonnombre_completoCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarClientesSuspendidos.add(jscrollPanenombre_completoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_comercialCobrarClientesSuspendidos.add(jLabelnombre_comercialCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_comercialCobrarClientesSuspendidos.add(jButtonnombre_comercialCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_comercialCobrarClientesSuspendidos.add(jscrollPanenombre_comercialCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucCobrarClientesSuspendidos.add(jLabelrucCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucCobrarClientesSuspendidos.add(jButtonrucCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucCobrarClientesSuspendidos.add(jTextFieldrucCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalle_estadoCobrarClientesSuspendidos.add(jLabeldetalle_estadoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalle_estadoCobrarClientesSuspendidos.add(jButtondetalle_estadoCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalle_estadoCobrarClientesSuspendidos.add(jscrollPanedetalle_estadoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_direccionCobrarClientesSuspendidos.add(jLabeldireccion_direccionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_direccionCobrarClientesSuspendidos.add(jButtondireccion_direccionCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_direccionCobrarClientesSuspendidos.add(jscrollPanedireccion_direccionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarClientesSuspendidos.add(jLabeltelefono_telefonoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarClientesSuspendidos.add(jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarClientesSuspendidos.add(jscrollPanetelefono_telefonoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoCobrarClientesSuspendidos.add(jLabelsaldoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoCobrarClientesSuspendidos.add(jButtonsaldoCobrarClientesSuspendidosBusqueda, this.gridBagConstraintsCobrarClientesSuspendidos);
	}

	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoCobrarClientesSuspendidos.add(jTextFieldsaldoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelidCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelnombre_ciudadCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelcodigoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelnombre_completoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelnombre_comercialCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelrucCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPaneldetalle_estadoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPaneldireccion_direccionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPaneltelefono_telefonoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSuspendidos.add(this.jPanelsaldoCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposCobrarClientesSuspendidos=0;
		iYPanelCamposCobrarClientesSuspendidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iYPanelCamposOcultosCobrarClientesSuspendidos;
	this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iXPanelCamposOcultosCobrarClientesSuspendidos++;
	this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSuspendidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesSuspendidos.add(this.jPanelid_empresaCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);



	if(iXPanelCamposOcultosCobrarClientesSuspendidos % 1==0) {
		iXPanelCamposOcultosCobrarClientesSuspendidos=0;
		iYPanelCamposOcultosCobrarClientesSuspendidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesSuspendidos= new GridBagLayout();
		this.jPanelAccionesCobrarClientesSuspendidos.setLayout(gridaBagLayoutAccionesCobrarClientesSuspendidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarClientesSuspendidos= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarClientesSuspendidos.setLayout(gridaBagLayoutAccionesFormularioCobrarClientesSuspendidos);
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarClientesSuspendidos.add(this.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesSuspendidos.add(this.jButtonModificarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);							

		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesSuspendidos.add(this.jButtonEliminarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesSuspendidos.add(this.jButtonActualizarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);


		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesSuspendidos.add(this.jButtonGuardarCambiosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);	
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesSuspendidos.add(this.jButtonCancelarCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesSuspendidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesSuspendidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesSuspendidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesSuspendidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =0;
		this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesSuspendidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarClientesSuspendidos = new CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Clientes Suspendidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Clientes Suspendidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Suspendidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarClientesSuspendidosModel cobrarclientessuspendidosModel=new CobrarClientesSuspendidosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarClientesSuspendidosModel.CobrarClientesSuspendidosFocusTraversalPolicy cobrarclientessuspendidosFocusTraversalPolicy = cobrarclientessuspendidosModel.new CobrarClientesSuspendidosFocusTraversalPolicy(this);
			
			//cobrarclientessuspendidosFocusTraversalPolicy.setcobrarclientessuspendidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarclientessuspendidosModel);
			
			
			this.jContentPaneDetalleCobrarClientesSuspendidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarClientesSuspendidos = new GridBagLayout();	
			this.jContentPaneDetalleCobrarClientesSuspendidos.setLayout(gridaBagLayoutDetalleCobrarClientesSuspendidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesSuspendidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarClientesSuspendidos.add(jTtoolBarDetalleCobrarClientesSuspendidos, gridBagConstraintsCobrarClientesSuspendidos);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos=   new JScrollPane(jContentPaneDetalleCobrarClientesSuspendidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	        
			this.jContentPaneDetalleCobrarClientesSuspendidos.add(jPanelCamposCobrarClientesSuspendidos, gridBagConstraintsCobrarClientesSuspendidos);
			
			
			
			
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
						//&& cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarClientesSuspendidos= new GridBagConstraints();
						this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
						this.jContentPaneDetalleCobrarClientesSuspendidos.add(this.jTabbedPaneRelacionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarClientesSuspendidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarClientesSuspendidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
					this.gridBagConstraintsCobrarClientesSuspendidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarClientesSuspendidos.add(jPanelCamposOcultosCobrarClientesSuspendidos, gridBagConstraintsCobrarClientesSuspendidos);
				
					this.jPanelCamposOcultosCobrarClientesSuspendidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	        this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarClientesSuspendidos.add(this.jPanelAccionesFormularioCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);							
			
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
	        this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarClientesSuspendidos.add(this.jPanelAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarClientesSuspendidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos=   new JScrollPane(this.jPanelCamposCobrarClientesSuspendidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
			this.gridBagConstraintsCobrarClientesSuspendidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarClientesSuspendidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarClientesSuspendidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);			
			
			this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
			
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		
			
		this.gridBagConstraintsCobrarClientesSuspendidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSuspendidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSuspendidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesSuspendidos, this.gridBagConstraintsCobrarClientesSuspendidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarClientesSuspendidos;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarClientesSuspendidos;
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
