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
import com.bydan.erp.cartera.util.report.CobrarAnalisisCarterasConstantesFunciones;

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
public class CobrarAnalisisCarterasDetalleFormJInternalFrame extends CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarAnalisisCarteras;
	
	protected JMenuBar jmenuBarDetalleCobrarAnalisisCarteras;
	
	protected JMenu jmenuDetalleCobrarAnalisisCarteras;
	protected JMenu jmenuDetalleArchivoCobrarAnalisisCarteras;
	protected JMenu jmenuDetalleAccionesCobrarAnalisisCarteras;
	protected JMenu jmenuDetalleDatosCobrarAnalisisCarteras;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarAnalisisCarteras;	
	protected GridBagConstraints gridBagConstraintsCobrarAnalisisCarteras;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarAnalisisCarteras;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CobrarAnalisisCarterasSessionBean cobraranalisiscarterasSessionBean;
	
	
	
		
	
	public CobrarAnalisisCarterasLogic cobraranalisiscarterasLogic;
	
	public JScrollPane jScrollPanelDatosCobrarAnalisisCarteras;
	public JScrollPane jScrollPanelDatosEdicionCobrarAnalisisCarteras;
	public JScrollPane jScrollPanelDatosGeneralCobrarAnalisisCarteras;
	
	protected JPanel jPanelCamposCobrarAnalisisCarteras;    
	protected JPanel jPanelCamposOcultosCobrarAnalisisCarteras;    	
	protected JPanel jPanelAccionesCobrarAnalisisCarteras;
	protected JPanel jPanelAccionesFormularioCobrarAnalisisCarteras;
    
	
	
	protected Integer iXPanelCamposCobrarAnalisisCarteras=0;
	protected Integer iYPanelCamposCobrarAnalisisCarteras=0;
	
	protected Integer iXPanelCamposOcultosCobrarAnalisisCarteras=0;
	protected Integer iYPanelCamposOcultosCobrarAnalisisCarteras=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarAnalisisCarteras;
	public JButton jButtonModificarCobrarAnalisisCarteras;
	public JButton jButtonActualizarCobrarAnalisisCarteras;
    public JButton jButtonEliminarCobrarAnalisisCarteras;
	public JButton jButtonCancelarCobrarAnalisisCarteras;
    public JButton jButtonGuardarCambiosCobrarAnalisisCarteras;
	public JButton jButtonGuardarCambiosTablaCobrarAnalisisCarteras;
	protected JButton jButtonCerrarCobrarAnalisisCarteras;
	
	
	protected JButton jButtonProcesarInformacionCobrarAnalisisCarteras;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarAnalisisCarteras;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarAnalisisCarteras;
	protected JButton jButtonModificarToolBarCobrarAnalisisCarteras;
	protected JButton jButtonActualizarToolBarCobrarAnalisisCarteras;
    protected JButton jButtonEliminarToolBarCobrarAnalisisCarteras;
	protected JButton jButtonCancelarToolBarCobrarAnalisisCarteras;
    protected JButton jButtonGuardarCambiosToolBarCobrarAnalisisCarteras;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarAnalisisCarteras;
	protected JButton jButtonCerrarToolBarCobrarAnalisisCarteras;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarAnalisisCarteras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemModificarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemActualizarCobrarAnalisisCarteras;
    protected JMenuItem jMenuItemEliminarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemCancelarCobrarAnalisisCarteras;
    protected JMenuItem jMenuItemGuardarCambiosCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemCerrarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemDetalleCerrarCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras;
	protected JMenuItem jMenuItemMostrarOcultarCobrarAnalisisCarteras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarAnalisisCarteras;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarAnalisisCarteras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarAnalisisCarteras;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarAnalisisCarteras;
	public JLabel jLabelIdCobrarAnalisisCarteras;
	public JLabel jLabelidCobrarAnalisisCarteras;
	public JButton jButtonidCobrarAnalisisCarterasBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCobrarAnalisisCarteras;
	public JLabel jLabelid_empresaCobrarAnalisisCarteras;
	public JTextField jTextFieldid_empresaCobrarAnalisisCarteras;
	public JButton jButtonid_empresaCobrarAnalisisCarterasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras;
	public JLabel jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras;
	public JTextArea jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras;
	public JScrollPane jscrollPanenombre_tipo_radio_venciCobrarAnalisisCarteras;
	public JButton jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda= new JButtonMe();

	public JPanel jPaneldia_desdeCobrarAnalisisCarteras;
	public JLabel jLabeldia_desdeCobrarAnalisisCarteras;
	public JTextField jTextFielddia_desdeCobrarAnalisisCarteras;
	public JButton jButtondia_desdeCobrarAnalisisCarterasBusqueda= new JButtonMe();

	public JPanel jPaneldia_hastaCobrarAnalisisCarteras;
	public JLabel jLabeldia_hastaCobrarAnalisisCarteras;
	public JTextField jTextFielddia_hastaCobrarAnalisisCarteras;
	public JButton jButtondia_hastaCobrarAnalisisCarterasBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarAnalisisCarteras;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarAnalisisCarterasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarAnalisisCarteras=new JPanel();
				this.jPanelAccionesFormularioCobrarAnalisisCarteras=new JPanel();
				this.jmenuBarDetalleCobrarAnalisisCarteras=new JMenuBar();
				this.jTtoolBarDetalleCobrarAnalisisCarteras=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarAnalisisCarterasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarAnalisisCarterasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarAnalisisCarteras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarAnalisisCarteras() {
		return this.jButtonActualizarToolBarCobrarAnalisisCarteras;
	}
	
	public JButton getjButtonEliminarToolBarCobrarAnalisisCarteras() {
		return this.jButtonEliminarToolBarCobrarAnalisisCarteras;
	}
	
	public JButton getjButtonCancelarToolBarCobrarAnalisisCarteras() {
		return this.jButtonCancelarToolBarCobrarAnalisisCarteras;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarAnalisisCarteras() {
		return this.jButtonProcesarInformacionCobrarAnalisisCarteras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarAnalisisCarteras)	{
		this.jButtonProcesarInformacionCobrarAnalisisCarteras = jButtonProcesarInformacionCobrarAnalisisCarteras;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarAnalisisCarteras() {
		return this.jComboBoxTiposAccionesCobrarAnalisisCarteras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposRelacionesCobrarAnalisisCarteras) {
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras = jComboBoxTiposRelacionesCobrarAnalisisCarteras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposAccionesCobrarAnalisisCarteras) {
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras = jComboBoxTiposAccionesCobrarAnalisisCarteras;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarAnalisisCarteras() {
		return this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarAnalisisCarteras(
			JComboBox jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras) {
		this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras = jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobraranalisiscarterasSessionBean=new CobrarAnalisisCarterasSessionBean();
		
		this.cobraranalisiscarterasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobraranalisiscarterasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarAnalisisCarterasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarAnalisisCarterasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarAnalisisCarterasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Analisis Carteras MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarAnalisisCarterasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarAnalisisCarteras= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarAnalisisCarteras=new JButtonMe();
				this.jButtonModificarToolBarCobrarAnalisisCarteras=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarAnalisisCarteras,this.jTtoolBarDetalleCobrarAnalisisCarteras,
							"actualizar","actualizar","Actualizar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarAnalisisCarteras,this.jTtoolBarDetalleCobrarAnalisisCarteras,
							"eliminar","eliminar","Eliminar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarAnalisisCarteras,this.jTtoolBarDetalleCobrarAnalisisCarteras,
							"cancelar","cancelar","Cancelar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras,this.jTtoolBarDetalleCobrarAnalisisCarteras,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarAnalisisCarteras=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarAnalisisCarteras=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarAnalisisCarteras=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarAnalisisCarteras=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarAnalisisCarteras=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarAnalisisCarteras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarAnalisisCarteras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarAnalisisCarteras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarAnalisisCarteras= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarAnalisisCarteras.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarAnalisisCarteras,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarAnalisisCarteras= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarAnalisisCarteras.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarAnalisisCarteras,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarAnalisisCarteras= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarAnalisisCarteras.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarAnalisisCarteras,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarAnalisisCarteras= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarAnalisisCarteras.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarAnalisisCarteras,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarAnalisisCarteras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarAnalisisCarteras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarAnalisisCarteras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarAnalisisCarteras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarAnalisisCarteras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarAnalisisCarteras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarAnalisisCarteras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarAnalisisCarteras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarAnalisisCarteras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarAnalisisCarteras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarAnalisisCarteras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarAnalisisCarteras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarAnalisisCarteras.add(this.jMenuItemDetalleCerrarCobrarAnalisisCarteras);
		
		this.jmenuDetalleAccionesCobrarAnalisisCarteras.add(this.jMenuItemActualizarCobrarAnalisisCarteras);
		this.jmenuDetalleAccionesCobrarAnalisisCarteras.add(this.jMenuItemEliminarCobrarAnalisisCarteras);
		this.jmenuDetalleAccionesCobrarAnalisisCarteras.add(this.jMenuItemCancelarCobrarAnalisisCarteras);		
		
		//this.jmenuDetalleDatosCobrarAnalisisCarteras.add(this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras);				
		this.jmenuDetalleDatosCobrarAnalisisCarteras.add(this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras);				
				
		//this.jmenuDetalleAccionesCobrarAnalisisCarteras.add(this.jMenuItemGuardarCambiosCobrarAnalisisCarteras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarAnalisisCarteras.add(this.jmenuDetalleArchivoCobrarAnalisisCarteras);		
		this.jmenuBarDetalleCobrarAnalisisCarteras.add(this.jmenuDetalleAccionesCobrarAnalisisCarteras);		
		this.jmenuBarDetalleCobrarAnalisisCarteras.add(this.jmenuDetalleDatosCobrarAnalisisCarteras);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarAnalisisCarteras);				
	}
	
	
	public void inicializarElementosCamposCobrarAnalisisCarteras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarAnalisisCarteras = new JLabelMe();
		jLabelIdCobrarAnalisisCarteras.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarAnalisisCarteras = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarAnalisisCarteras.setToolTipText(CobrarAnalisisCarterasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarAnalisisCarteras= new GridBagLayout();

		this.jPanelidCobrarAnalisisCarteras.setLayout(this.gridaBagLayoutCobrarAnalisisCarteras);

		jLabelidCobrarAnalisisCarteras = new JLabel();
		jLabelidCobrarAnalisisCarteras.setText("Id");

		jLabelidCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelid_empresaCobrarAnalisisCarteras = new JLabelMe();
		this.jLabelid_empresaCobrarAnalisisCarteras.setText(""+CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarAnalisisCarteras.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarAnalisisCarteras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarAnalisisCarteras.setToolTipText(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarAnalisisCarteras = new GridBagLayout();
		this.jPanelid_empresaCobrarAnalisisCarteras.setLayout(this.gridaBagLayoutCobrarAnalisisCarteras);


		jTextFieldid_empresaCobrarAnalisisCarteras= new JTextFieldMe();
		jTextFieldid_empresaCobrarAnalisisCarteras.setEnabled(false);
		jTextFieldid_empresaCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_empresaCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_empresaCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldid_empresaCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldid_empresaCobrarAnalisisCarteras.setText("0");

		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setText("U");
		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarAnalisisCarterasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldid_empresaCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldid_empresaCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarAnalisisCarterasBusqueda"));

		if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarAnalisisCarterasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras = new JLabelMe();
		this.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras.setText(""+CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI+" : *");
		this.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras.setToolTipText("Nombre Tipo Radio Venci");
		this.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras.setToolTipText(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI);
		this.gridaBagLayoutCobrarAnalisisCarteras = new GridBagLayout();
		this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras.setLayout(this.gridaBagLayoutCobrarAnalisisCarteras);


		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras= new JTextAreaMe();
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setEnabled(false);
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setLineWrap(true);
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setWrapStyleWord(true);
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_radio_venciCobrarAnalisisCarteras = new JScrollPane(jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras);
		jscrollPanenombre_tipo_radio_venciCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_radio_venciCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_radio_venciCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setText("U");
		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda"));

		if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.setVisible(false);		}


					
		this.jLabeldia_desdeCobrarAnalisisCarteras = new JLabelMe();
		this.jLabeldia_desdeCobrarAnalisisCarteras.setText(""+CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE+" : *");
		this.jLabeldia_desdeCobrarAnalisisCarteras.setToolTipText("Dia Desde");
		this.jLabeldia_desdeCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_desdeCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_desdeCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_desdeCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_desdeCobrarAnalisisCarteras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_desdeCobrarAnalisisCarteras.setToolTipText(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE);
		this.gridaBagLayoutCobrarAnalisisCarteras = new GridBagLayout();
		this.jPaneldia_desdeCobrarAnalisisCarteras.setLayout(this.gridaBagLayoutCobrarAnalisisCarteras);


		jTextFielddia_desdeCobrarAnalisisCarteras= new JTextFieldMe();
		jTextFielddia_desdeCobrarAnalisisCarteras.setEnabled(false);
		jTextFielddia_desdeCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_desdeCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_desdeCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_desdeCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_desdeCobrarAnalisisCarteras.setText("0");

		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda= new JButtonMe();
		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setText("U");
		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_desdeCobrarAnalisisCarterasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_desdeCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_desdeCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_desdeCobrarAnalisisCarterasBusqueda"));

		if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_desdeCobrarAnalisisCarterasBusqueda.setVisible(false);		}


					
		this.jLabeldia_hastaCobrarAnalisisCarteras = new JLabelMe();
		this.jLabeldia_hastaCobrarAnalisisCarteras.setText(""+CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA+" : *");
		this.jLabeldia_hastaCobrarAnalisisCarteras.setToolTipText("Dia Hasta");
		this.jLabeldia_hastaCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_hastaCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_hastaCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_hastaCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_hastaCobrarAnalisisCarteras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_hastaCobrarAnalisisCarteras.setToolTipText(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA);
		this.gridaBagLayoutCobrarAnalisisCarteras = new GridBagLayout();
		this.jPaneldia_hastaCobrarAnalisisCarteras.setLayout(this.gridaBagLayoutCobrarAnalisisCarteras);


		jTextFielddia_hastaCobrarAnalisisCarteras= new JTextFieldMe();
		jTextFielddia_hastaCobrarAnalisisCarteras.setEnabled(false);
		jTextFielddia_hastaCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_hastaCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_hastaCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_hastaCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_hastaCobrarAnalisisCarteras.setText("0");

		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda= new JButtonMe();
		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setText("U");
		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_hastaCobrarAnalisisCarterasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_hastaCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_hastaCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_hastaCobrarAnalisisCarterasBusqueda"));

		if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_hastaCobrarAnalisisCarterasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarAnalisisCarteras() {
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
		//this.jInternalFrameDetalleCobrarAnalisisCarteras = new CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Analisis Carteras DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarAnalisisCarteras= new GridBagLayout();
		

		
		String sToolTipCobrarAnalisisCarteras="";
		sToolTipCobrarAnalisisCarteras=CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarAnalisisCarteras+="(Cartera.CobrarAnalisisCarteras)";
		}
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarAnalisisCarteras+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonModificarCobrarAnalisisCarteras = new JButtonMe();
        this.jButtonActualizarCobrarAnalisisCarteras = new JButtonMe();
        this.jButtonEliminarCobrarAnalisisCarteras = new JButtonMe();
        this.jButtonCancelarCobrarAnalisisCarteras = new JButtonMe();
        this.jButtonGuardarCambiosCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras = new JButtonMe();
		this.jButtonCerrarCobrarAnalisisCarteras = new JButtonMe();
		
		this.jScrollPanelDatosCobrarAnalisisCarteras = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarAnalisisCarteras = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarAnalisisCarteras = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Analisis Carteras";
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Analisis Carterases" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarAnalisisCarteras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarAnalisisCarteras.setName("jPanelCamposCobrarAnalisisCarteras"); 

		this.jPanelCamposOcultosCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarAnalisisCarteras.setName("jPanelCamposOcultosCobrarAnalisisCarteras"); 

        this.jPanelAccionesCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarAnalisisCarteras.setToolTipText("Acciones");
        this.jPanelAccionesCobrarAnalisisCarteras.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarAnalisisCarteras.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarAnalisisCarteras.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarAnalisisCarteras.setText("Nuevo");
		this.jButtonModificarCobrarAnalisisCarteras.setText("Editar");
        this.jButtonActualizarCobrarAnalisisCarteras.setText("Actualizar");
        this.jButtonEliminarCobrarAnalisisCarteras.setText("Eliminar");
        this.jButtonCancelarCobrarAnalisisCarteras.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarAnalisisCarteras.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.setText("Guardar");
		this.jButtonCerrarCobrarAnalisisCarteras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarAnalisisCarteras,"nuevo_button","Nuevo",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarAnalisisCarteras,"modificar_button","Editar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarAnalisisCarteras,"actualizar_button","Actualizar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarAnalisisCarteras,"eliminar_button","Eliminar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarAnalisisCarteras,"cancelar_button","Cancelar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarAnalisisCarteras,"guardarcambios_button","Guardar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras,"guardarcambiostabla_button","Guardar",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarAnalisisCarteras,"cerrar_button","Salir",this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarAnalisisCarteras.setToolTipText("Nuevo"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarAnalisisCarteras.setToolTipText("Editar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarAnalisisCarteras.setToolTipText("Actualizar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarAnalisisCarteras.setToolTipText("Eliminar)"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarAnalisisCarteras.setToolTipText("Cancelar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarAnalisisCarteras.setToolTipText("Guardar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.setToolTipText("Guardar"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarAnalisisCarteras.setToolTipText("Salir"+" "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarAnalisisCarteras";
		inputMap = this.jButtonNuevoCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarAnalisisCarteras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarAnalisisCarteras"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarAnalisisCarteras";
		inputMap = this.jButtonActualizarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarAnalisisCarteras"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarAnalisisCarteras";
		inputMap = this.jButtonEliminarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarAnalisisCarteras"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarAnalisisCarteras";
		inputMap = this.jButtonCancelarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarAnalisisCarteras"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarAnalisisCarteras";
		inputMap = this.jButtonCerrarCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarAnalisisCarteras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarAnalisisCarteras";
		inputMap = this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarAnalisisCarteras"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarAnalisisCarteras = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarAnalisisCarteras.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarAnalisisCarteras.setToolTipText("Nuevo CobrarAnalisisCarteras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras.setToolTipText("Sin Cerrar Ventana CobrarAnalisisCarteras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setText("Accion");
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarAnalisisCarteras = new JLabelMe();
		
		this.jLabelAccionesCobrarAnalisisCarteras.setText("Acciones");		
		this.jLabelAccionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarAnalisisCarteras();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarAnalisisCarteras();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarAnalisisCarteras=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarAnalisisCarteras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarAnalisisCarteras,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarAnalisisCarteras = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarAnalisisCarteras = new GridBagLayout();
		
		this.jPanelCamposCobrarAnalisisCarteras.setLayout(gridaBagLayoutCamposCobrarAnalisisCarteras);
		this.jPanelCamposOcultosCobrarAnalisisCarteras.setLayout(gridaBagLayoutCamposOcultosCobrarAnalisisCarteras);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarAnalisisCarteras.add(jLabelIdCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 1;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarAnalisisCarteras.add(jLabelidCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);


	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarAnalisisCarteras.add(jLabelid_empresaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		//this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 2;
		this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarAnalisisCarteras.add(jButtonid_empresaCobrarAnalisisCarterasBusqueda, this.gridBagConstraintsCobrarAnalisisCarteras);
	}

	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 1;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarAnalisisCarteras.add(jTextFieldid_empresaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);


	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras.add(jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		//this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 2;
		this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras.add(jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda, this.gridBagConstraintsCobrarAnalisisCarteras);
	}

	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 1;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras.add(jscrollPanenombre_tipo_radio_venciCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);


	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_desdeCobrarAnalisisCarteras.add(jLabeldia_desdeCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		//this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 2;
		this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_desdeCobrarAnalisisCarteras.add(jButtondia_desdeCobrarAnalisisCarterasBusqueda, this.gridBagConstraintsCobrarAnalisisCarteras);
	}

	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 1;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_desdeCobrarAnalisisCarteras.add(jTextFielddia_desdeCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);


	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_hastaCobrarAnalisisCarteras.add(jLabeldia_hastaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		//this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 2;
		this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_hastaCobrarAnalisisCarteras.add(jButtondia_hastaCobrarAnalisisCarterasBusqueda, this.gridBagConstraintsCobrarAnalisisCarteras);
	}

	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 1;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_hastaCobrarAnalisisCarteras.add(jTextFielddia_hastaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iYPanelCamposCobrarAnalisisCarteras;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iXPanelCamposCobrarAnalisisCarteras++;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarAnalisisCarteras.add(this.jPanelidCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(iXPanelCamposCobrarAnalisisCarteras % 1==0) {
		iXPanelCamposCobrarAnalisisCarteras=0;
		iYPanelCamposCobrarAnalisisCarteras++;
	}
	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iYPanelCamposCobrarAnalisisCarteras;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iXPanelCamposCobrarAnalisisCarteras++;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarAnalisisCarteras.add(this.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(iXPanelCamposCobrarAnalisisCarteras % 1==0) {
		iXPanelCamposCobrarAnalisisCarteras=0;
		iYPanelCamposCobrarAnalisisCarteras++;
	}
	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iYPanelCamposCobrarAnalisisCarteras;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iXPanelCamposCobrarAnalisisCarteras++;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarAnalisisCarteras.add(this.jPaneldia_desdeCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(iXPanelCamposCobrarAnalisisCarteras % 1==0) {
		iXPanelCamposCobrarAnalisisCarteras=0;
		iYPanelCamposCobrarAnalisisCarteras++;
	}
	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iYPanelCamposCobrarAnalisisCarteras;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iXPanelCamposCobrarAnalisisCarteras++;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarAnalisisCarteras.add(this.jPaneldia_hastaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(iXPanelCamposCobrarAnalisisCarteras % 1==0) {
		iXPanelCamposCobrarAnalisisCarteras=0;
		iYPanelCamposCobrarAnalisisCarteras++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iYPanelCamposOcultosCobrarAnalisisCarteras;
	this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iXPanelCamposOcultosCobrarAnalisisCarteras++;
	this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarAnalisisCarteras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarAnalisisCarteras.add(this.jPanelid_empresaCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);



	if(iXPanelCamposOcultosCobrarAnalisisCarteras % 1==0) {
		iXPanelCamposOcultosCobrarAnalisisCarteras=0;
		iYPanelCamposOcultosCobrarAnalisisCarteras++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarAnalisisCarteras= new GridBagLayout();
		this.jPanelAccionesCobrarAnalisisCarteras.setLayout(gridaBagLayoutAccionesCobrarAnalisisCarteras);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarAnalisisCarteras= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarAnalisisCarteras.setLayout(gridaBagLayoutAccionesFormularioCobrarAnalisisCarteras);
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarAnalisisCarteras.add(this.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarAnalisisCarteras.add(this.jButtonModificarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);							

		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarAnalisisCarteras.add(this.jButtonEliminarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
			
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarAnalisisCarteras.add(this.jButtonActualizarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);


		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarAnalisisCarteras.add(this.jButtonGuardarCambiosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);	
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = 0;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarAnalisisCarteras.add(this.jButtonCancelarCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarAnalisisCarteras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarAnalisisCarteras);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();						
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;		
			//this.gridBagConstraintsCobrarAnalisisCarteras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarAnalisisCarteras.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =0;
		this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarAnalisisCarteras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarAnalisisCarteras = new CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Analisis Carteras DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Analisis Carteras DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Analisis Carteras Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarAnalisisCarterasModel cobraranalisiscarterasModel=new CobrarAnalisisCarterasModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarAnalisisCarterasModel.CobrarAnalisisCarterasFocusTraversalPolicy cobraranalisiscarterasFocusTraversalPolicy = cobraranalisiscarterasModel.new CobrarAnalisisCarterasFocusTraversalPolicy(this);
			
			//cobraranalisiscarterasFocusTraversalPolicy.setcobraranalisiscarterasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobraranalisiscarterasModel);
			
			
			this.jContentPaneDetalleCobrarAnalisisCarteras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarAnalisisCarteras = new GridBagLayout();	
			this.jContentPaneDetalleCobrarAnalisisCarteras.setLayout(gridaBagLayoutDetalleCobrarAnalisisCarteras);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarAnalisisCarteras = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
				this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarAnalisisCarteras.add(jTtoolBarDetalleCobrarAnalisisCarteras, gridBagConstraintsCobrarAnalisisCarteras);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras=   new JScrollPane(jContentPaneDetalleCobrarAnalisisCarteras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	        
			this.jContentPaneDetalleCobrarAnalisisCarteras.add(jPanelCamposCobrarAnalisisCarteras, gridBagConstraintsCobrarAnalisisCarteras);
			
			
			
			
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
						//&& cobraranalisiscarterasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarAnalisisCarteras= new GridBagConstraints();
						this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
						this.jContentPaneDetalleCobrarAnalisisCarteras.add(this.jTabbedPaneRelacionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarAnalisisCarteras.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarAnalisisCarteras.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
					this.gridBagConstraintsCobrarAnalisisCarteras.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarAnalisisCarteras.add(jPanelCamposOcultosCobrarAnalisisCarteras, gridBagConstraintsCobrarAnalisisCarteras);
				
					this.jPanelCamposOcultosCobrarAnalisisCarteras.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	        this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarAnalisisCarteras.add(this.jPanelAccionesFormularioCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);							
			
			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
	        this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarAnalisisCarteras.add(this.jPanelAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarAnalisisCarteras);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras=   new JScrollPane(this.jPanelCamposCobrarAnalisisCarteras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
			this.gridBagConstraintsCobrarAnalisisCarteras.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarAnalisisCarteras.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarAnalisisCarteras.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);			
			
			this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
			this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
			
			
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		
			
		this.gridBagConstraintsCobrarAnalisisCarteras = new GridBagConstraints();
		this.gridBagConstraintsCobrarAnalisisCarteras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarAnalisisCarteras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarAnalisisCarteras, this.gridBagConstraintsCobrarAnalisisCarteras);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarAnalisisCarteras;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarAnalisisCarteras;
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
