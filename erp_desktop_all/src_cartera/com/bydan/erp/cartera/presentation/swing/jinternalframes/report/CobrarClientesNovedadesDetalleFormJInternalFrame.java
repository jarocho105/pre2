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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.report.CobrarClientesNovedadesConstantesFunciones;

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
public class CobrarClientesNovedadesDetalleFormJInternalFrame extends CobrarClientesNovedadesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarClientesNovedades;
	
	protected JMenuBar jmenuBarDetalleCobrarClientesNovedades;
	
	protected JMenu jmenuDetalleCobrarClientesNovedades;
	protected JMenu jmenuDetalleArchivoCobrarClientesNovedades;
	protected JMenu jmenuDetalleAccionesCobrarClientesNovedades;
	protected JMenu jmenuDetalleDatosCobrarClientesNovedades;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesNovedades;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesNovedades;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarClientesNovedadesBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarClientesNovedades;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public CobrarClientesNovedadesSessionBean cobrarclientesnovedadesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public CobrarClientesNovedadesLogic cobrarclientesnovedadesLogic;
	
	public JScrollPane jScrollPanelDatosCobrarClientesNovedades;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesNovedades;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesNovedades;
	
	protected JPanel jPanelCamposCobrarClientesNovedades;    
	protected JPanel jPanelCamposOcultosCobrarClientesNovedades;    	
	protected JPanel jPanelAccionesCobrarClientesNovedades;
	protected JPanel jPanelAccionesFormularioCobrarClientesNovedades;
    
	
	
	protected Integer iXPanelCamposCobrarClientesNovedades=0;
	protected Integer iYPanelCamposCobrarClientesNovedades=0;
	
	protected Integer iXPanelCamposOcultosCobrarClientesNovedades=0;
	protected Integer iYPanelCamposOcultosCobrarClientesNovedades=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarClientesNovedades;
	public JButton jButtonModificarCobrarClientesNovedades;
	public JButton jButtonActualizarCobrarClientesNovedades;
    public JButton jButtonEliminarCobrarClientesNovedades;
	public JButton jButtonCancelarCobrarClientesNovedades;
    public JButton jButtonGuardarCambiosCobrarClientesNovedades;
	public JButton jButtonGuardarCambiosTablaCobrarClientesNovedades;
	protected JButton jButtonCerrarCobrarClientesNovedades;
	
	
	protected JButton jButtonProcesarInformacionCobrarClientesNovedades;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarClientesNovedades;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarClientesNovedades;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarClientesNovedades;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesNovedades;
	protected JButton jButtonModificarToolBarCobrarClientesNovedades;
	protected JButton jButtonActualizarToolBarCobrarClientesNovedades;
    protected JButton jButtonEliminarToolBarCobrarClientesNovedades;
	protected JButton jButtonCancelarToolBarCobrarClientesNovedades;
    protected JButton jButtonGuardarCambiosToolBarCobrarClientesNovedades;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesNovedades;
	protected JButton jButtonCerrarToolBarCobrarClientesNovedades;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesNovedades;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesNovedades;
	protected JMenuItem jMenuItemModificarCobrarClientesNovedades;
	protected JMenuItem jMenuItemActualizarCobrarClientesNovedades;
    protected JMenuItem jMenuItemEliminarCobrarClientesNovedades;
	protected JMenuItem jMenuItemCancelarCobrarClientesNovedades;
    protected JMenuItem jMenuItemGuardarCambiosCobrarClientesNovedades;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesNovedades;
	protected JMenuItem jMenuItemCerrarCobrarClientesNovedades;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesNovedades;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesNovedades;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesNovedades;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesNovedades;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesNovedades;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesNovedades;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesNovedades;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarClientesNovedades;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarClientesNovedades;
	public JLabel jLabelIdCobrarClientesNovedades;
	public JLabel jLabelidCobrarClientesNovedades;
	public JButton jButtonidCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelfeha_atencion_hastaCobrarClientesNovedades;
	public JLabel jLabelfeha_atencion_hastaCobrarClientesNovedades;
	//public JFormattedTextField jDateChooserfeha_atencion_hastaCobrarClientesNovedades;

	public JDateChooser jDateChooserfeha_atencion_hastaCobrarClientesNovedades;
	public JButton jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarClientesNovedades;
	public JLabel jLabelcodigoCobrarClientesNovedades;
	public JTextField jTextFieldcodigoCobrarClientesNovedades;
	public JButton jButtoncodigoCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrarClientesNovedades;
	public JLabel jLabelnombreCobrarClientesNovedades;
	public JTextArea jTextAreanombreCobrarClientesNovedades;
	public JScrollPane jscrollPanenombreCobrarClientesNovedades;
	public JButton jButtonnombreCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCobrarClientesNovedades;
	public JLabel jLabelapellidoCobrarClientesNovedades;
	public JTextArea jTextAreaapellidoCobrarClientesNovedades;
	public JScrollPane jscrollPaneapellidoCobrarClientesNovedades;
	public JButton jButtonapellidoCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelfeha_atencionCobrarClientesNovedades;
	public JLabel jLabelfeha_atencionCobrarClientesNovedades;
	//public JFormattedTextField jDateChooserfeha_atencionCobrarClientesNovedades;

	public JDateChooser jDateChooserfeha_atencionCobrarClientesNovedades;
	public JButton jButtonfeha_atencionCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelhora_atencionCobrarClientesNovedades;
	public JLabel jLabelhora_atencionCobrarClientesNovedades;
	public JSpinner jSpinnerhora_atencionCobrarClientesNovedades= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_atencionCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelaccion_tomadaCobrarClientesNovedades;
	public JLabel jLabelaccion_tomadaCobrarClientesNovedades;
	public JTextArea jTextAreaaccion_tomadaCobrarClientesNovedades;
	public JScrollPane jscrollPaneaccion_tomadaCobrarClientesNovedades;
	public JButton jButtonaccion_tomadaCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCobrarClientesNovedades;
	public JLabel jLabeldescripcionCobrarClientesNovedades;
	public JTextArea jTextAreadescripcionCobrarClientesNovedades;
	public JScrollPane jscrollPanedescripcionCobrarClientesNovedades;
	public JButton jButtondescripcionCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoCobrarClientesNovedades;
	public JLabel jLabelesta_activoCobrarClientesNovedades;
	public JCheckBox jCheckBoxesta_activoCobrarClientesNovedades;
	public JButton jButtonesta_activoCobrarClientesNovedadesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarClientesNovedades;
	public JLabel jLabelid_empresaCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarClientesNovedades;
	public JButton jButtonid_empresaCobrarClientesNovedades= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesNovedadesUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesNovedadesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCobrarClientesNovedades;
	public JLabel jLabelid_sucursalCobrarClientesNovedades;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCobrarClientesNovedades;
	public JButton jButtonid_sucursalCobrarClientesNovedades= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesNovedadesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesNovedadesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarClientesNovedades;
	
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
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarClientesNovedadesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarClientesNovedades=new JPanel();
				this.jPanelAccionesFormularioCobrarClientesNovedades=new JPanel();
				this.jmenuBarDetalleCobrarClientesNovedades=new JMenuBar();
				this.jTtoolBarDetalleCobrarClientesNovedades=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarClientesNovedadesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesNovedadesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesNovedades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarClientesNovedades() {
		return this.jButtonActualizarToolBarCobrarClientesNovedades;
	}
	
	public JButton getjButtonEliminarToolBarCobrarClientesNovedades() {
		return this.jButtonEliminarToolBarCobrarClientesNovedades;
	}
	
	public JButton getjButtonCancelarToolBarCobrarClientesNovedades() {
		return this.jButtonCancelarToolBarCobrarClientesNovedades;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarClientesNovedades() {
		return this.jButtonProcesarInformacionCobrarClientesNovedades;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesNovedades)	{
		this.jButtonProcesarInformacionCobrarClientesNovedades = jButtonProcesarInformacionCobrarClientesNovedades;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesNovedades() {
		return this.jComboBoxTiposAccionesCobrarClientesNovedades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesNovedades(
			JComboBox jComboBoxTiposRelacionesCobrarClientesNovedades) {
		this.jComboBoxTiposRelacionesCobrarClientesNovedades = jComboBoxTiposRelacionesCobrarClientesNovedades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesNovedades(
			JComboBox jComboBoxTiposAccionesCobrarClientesNovedades) {
		this.jComboBoxTiposAccionesCobrarClientesNovedades = jComboBoxTiposAccionesCobrarClientesNovedades;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarClientesNovedades() {
		return this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarClientesNovedades(
			JComboBox jComboBoxTiposAccionesFormularioCobrarClientesNovedades) {
		this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades = jComboBoxTiposAccionesFormularioCobrarClientesNovedades;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
		
		this.cobrarclientesnovedadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesnovedadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesNovedadesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesNovedadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesNovedadesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Novedades MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarClientesNovedadesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarClientesNovedades= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarClientesNovedades=new JButtonMe();
				this.jButtonModificarToolBarCobrarClientesNovedades=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarClientesNovedades,this.jTtoolBarDetalleCobrarClientesNovedades,
							"actualizar","actualizar","Actualizar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarClientesNovedades,this.jTtoolBarDetalleCobrarClientesNovedades,
							"eliminar","eliminar","Eliminar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarClientesNovedades,this.jTtoolBarDetalleCobrarClientesNovedades,
							"cancelar","cancelar","Cancelar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarClientesNovedades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarClientesNovedades,this.jTtoolBarDetalleCobrarClientesNovedades,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarClientesNovedades=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarClientesNovedades=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarClientesNovedades=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarClientesNovedades=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarClientesNovedades=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesNovedades= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesNovedades.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesNovedades,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarClientesNovedades= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarClientesNovedades.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarClientesNovedades,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarClientesNovedades= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarClientesNovedades.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarClientesNovedades,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarClientesNovedades= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarClientesNovedades.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarClientesNovedades,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarClientesNovedades= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarClientesNovedades.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarClientesNovedades,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarClientesNovedades= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesNovedades.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesNovedades,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesNovedades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesNovedades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesNovedades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarClientesNovedades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarClientesNovedades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarClientesNovedades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesNovedades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesNovedades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesNovedades,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarClientesNovedades.add(this.jMenuItemDetalleCerrarCobrarClientesNovedades);
		
		this.jmenuDetalleAccionesCobrarClientesNovedades.add(this.jMenuItemActualizarCobrarClientesNovedades);
		this.jmenuDetalleAccionesCobrarClientesNovedades.add(this.jMenuItemEliminarCobrarClientesNovedades);
		this.jmenuDetalleAccionesCobrarClientesNovedades.add(this.jMenuItemCancelarCobrarClientesNovedades);		
		
		//this.jmenuDetalleDatosCobrarClientesNovedades.add(this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades);				
		this.jmenuDetalleDatosCobrarClientesNovedades.add(this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades);				
				
		//this.jmenuDetalleAccionesCobrarClientesNovedades.add(this.jMenuItemGuardarCambiosCobrarClientesNovedades);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarClientesNovedades.add(this.jmenuDetalleArchivoCobrarClientesNovedades);		
		this.jmenuBarDetalleCobrarClientesNovedades.add(this.jmenuDetalleAccionesCobrarClientesNovedades);		
		this.jmenuBarDetalleCobrarClientesNovedades.add(this.jmenuDetalleDatosCobrarClientesNovedades);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarClientesNovedades);				
	}
	
	
	public void inicializarElementosCamposCobrarClientesNovedades() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarClientesNovedades = new JLabelMe();
		jLabelIdCobrarClientesNovedades.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarClientesNovedades = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarClientesNovedades= new GridBagLayout();

		this.jPanelidCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);

		jLabelidCobrarClientesNovedades = new JLabel();
		jLabelidCobrarClientesNovedades.setText("Id");

		jLabelidCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfeha_atencion_hastaCobrarClientesNovedades = new JLabelMe();
		this.jLabelfeha_atencion_hastaCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA+" : *");
		this.jLabelfeha_atencion_hastaCobrarClientesNovedades.setToolTipText("Feha Atencion Hasta");
		this.jLabelfeha_atencion_hastaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfeha_atencion_hastaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfeha_atencion_hastaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfeha_atencion_hastaCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfeha_atencion_hastaCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfeha_atencion_hastaCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelfeha_atencion_hastaCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		//jFormattedTextFieldfeha_atencion_hastaCobrarClientesNovedades= new JFormattedTextFieldMe();

		jDateChooserfeha_atencion_hastaCobrarClientesNovedades= new JDateChooser();
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setEnabled(false);
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfeha_atencion_hastaCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setDate(new Date());
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfeha_atencion_hastaCobrarClientesNovedades.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfeha_atencion_hastaCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"feha_atencion_hastaCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarClientesNovedades = new JLabelMe();
		this.jLabelcodigoCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarClientesNovedades.setToolTipText("Codigo");
		this.jLabelcodigoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelcodigoCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jTextFieldcodigoCobrarClientesNovedades= new JTextFieldMe();

		jTextFieldcodigoCobrarClientesNovedades.setEnabled(false);
		jTextFieldcodigoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtoncodigoCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrarClientesNovedades = new JLabelMe();
		this.jLabelnombreCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrarClientesNovedades.setToolTipText("Nombre");
		this.jLabelnombreCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelnombreCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jTextAreanombreCobrarClientesNovedades= new JTextAreaMe();
		jTextAreanombreCobrarClientesNovedades.setEnabled(false);
		jTextAreanombreCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesNovedades.setLineWrap(true);
		jTextAreanombreCobrarClientesNovedades.setWrapStyleWord(true);
		jTextAreanombreCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCobrarClientesNovedades.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCobrarClientesNovedades = new JScrollPane(jTextAreanombreCobrarClientesNovedades);
		jscrollPanenombreCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonnombreCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonnombreCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCobrarClientesNovedades = new JLabelMe();
		this.jLabelapellidoCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCobrarClientesNovedades.setToolTipText("Apello");
		this.jLabelapellidoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelapellidoCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jTextAreaapellidoCobrarClientesNovedades= new JTextAreaMe();
		jTextAreaapellidoCobrarClientesNovedades.setEnabled(false);
		jTextAreaapellidoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesNovedades.setLineWrap(true);
		jTextAreaapellidoCobrarClientesNovedades.setWrapStyleWord(true);
		jTextAreaapellidoCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCobrarClientesNovedades.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCobrarClientesNovedades = new JScrollPane(jTextAreaapellidoCobrarClientesNovedades);
		jscrollPaneapellidoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonapellidoCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonapellidoCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelfeha_atencionCobrarClientesNovedades = new JLabelMe();
		this.jLabelfeha_atencionCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION+" : *");
		this.jLabelfeha_atencionCobrarClientesNovedades.setToolTipText("Feha Atencion");
		this.jLabelfeha_atencionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfeha_atencionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfeha_atencionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfeha_atencionCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfeha_atencionCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfeha_atencionCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelfeha_atencionCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		//jFormattedTextFieldfeha_atencionCobrarClientesNovedades= new JFormattedTextFieldMe();

		jDateChooserfeha_atencionCobrarClientesNovedades= new JDateChooser();
		jDateChooserfeha_atencionCobrarClientesNovedades.setEnabled(false);
		jDateChooserfeha_atencionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfeha_atencionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfeha_atencionCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfeha_atencionCobrarClientesNovedades.setDate(new Date());
		jDateChooserfeha_atencionCobrarClientesNovedades.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfeha_atencionCobrarClientesNovedades.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfeha_atencionCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfeha_atencionCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"feha_atencionCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelhora_atencionCobrarClientesNovedades = new JLabelMe();
		this.jLabelhora_atencionCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION+" : *");
		this.jLabelhora_atencionCobrarClientesNovedades.setToolTipText("Hora Atencion");
		this.jLabelhora_atencionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_atencionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_atencionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_atencionCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_atencionCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_atencionCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelhora_atencionCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		//jFormattedTextFieldhora_atencionCobrarClientesNovedades= new JFormattedTextFieldMe();

		jSpinnerhora_atencionCobrarClientesNovedades= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_atencionCobrarClientesNovedades.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_atencionCobrarClientesNovedades = new JSpinner.DateEditor(jSpinnerhora_atencionCobrarClientesNovedades, "HH:mm:ss");

		jSpinnerhora_atencionCobrarClientesNovedades.setEditor(timeEditorhora_atencionCobrarClientesNovedades);

		jSpinnerhora_atencionCobrarClientesNovedades.setValue(new Date());

		jSpinnerhora_atencionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_atencionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_atencionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_atencionCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_atencionCobrarClientesNovedades.setValue(new Date());
		//jSpinnerhora_atencionCobrarClientesNovedades.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_atencionCobrarClientesNovedades.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_atencionCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_atencionCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_atencionCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_atencionCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_atencionCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelaccion_tomadaCobrarClientesNovedades = new JLabelMe();
		this.jLabelaccion_tomadaCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA+" : *");
		this.jLabelaccion_tomadaCobrarClientesNovedades.setToolTipText("Accion Tomada");
		this.jLabelaccion_tomadaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaccion_tomadaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaccion_tomadaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaccion_tomadaCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaccion_tomadaCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaccion_tomadaCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelaccion_tomadaCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jTextAreaaccion_tomadaCobrarClientesNovedades= new JTextAreaMe();
		jTextAreaaccion_tomadaCobrarClientesNovedades.setEnabled(false);
		jTextAreaaccion_tomadaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaccion_tomadaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaccion_tomadaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaccion_tomadaCobrarClientesNovedades.setLineWrap(true);
		jTextAreaaccion_tomadaCobrarClientesNovedades.setWrapStyleWord(true);
		jTextAreaaccion_tomadaCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaaccion_tomadaCobrarClientesNovedades.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaaccion_tomadaCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneaccion_tomadaCobrarClientesNovedades = new JScrollPane(jTextAreaaccion_tomadaCobrarClientesNovedades);
		jscrollPaneaccion_tomadaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneaccion_tomadaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneaccion_tomadaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaaccion_tomadaCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaaccion_tomadaCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"accion_tomadaCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCobrarClientesNovedades = new JLabelMe();
		this.jLabeldescripcionCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCobrarClientesNovedades.setToolTipText("Descripcion");
		this.jLabeldescripcionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPaneldescripcionCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jTextAreadescripcionCobrarClientesNovedades= new JTextAreaMe();
		jTextAreadescripcionCobrarClientesNovedades.setEnabled(false);
		jTextAreadescripcionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarClientesNovedades.setLineWrap(true);
		jTextAreadescripcionCobrarClientesNovedades.setWrapStyleWord(true);
		jTextAreadescripcionCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCobrarClientesNovedades.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCobrarClientesNovedades = new JScrollPane(jTextAreadescripcionCobrarClientesNovedades);
		jscrollPanedescripcionCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtondescripcionCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtondescripcionCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCobrarClientesNovedadesBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoCobrarClientesNovedades = new JLabelMe();
		this.jLabelesta_activoCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoCobrarClientesNovedades.setToolTipText("Esta Activo");
		this.jLabelesta_activoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelesta_activoCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jCheckBoxesta_activoCobrarClientesNovedades= new JCheckBoxMe();
		jCheckBoxesta_activoCobrarClientesNovedades.setEnabled(false);

		jCheckBoxesta_activoCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoCobrarClientesNovedadesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarClientesNovedades() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarClientesNovedades = new JLabelMe();
		this.jLabelid_empresaCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarClientesNovedades.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelid_empresaCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jComboBoxid_empresaCobrarClientesNovedades= new JComboBoxMe();
		jComboBoxid_empresaCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarClientesNovedades.setEnabled(false);

		this.jButtonid_empresaCobrarClientesNovedades= new JButtonMe();
		this.jButtonid_empresaCobrarClientesNovedades.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesNovedades.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesNovedades.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesNovedades.setText("Buscar");
		this.jButtonid_empresaCobrarClientesNovedades.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarClientesNovedades.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesNovedades,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesNovedades"));

		this.jButtonid_empresaCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarClientesNovedadesBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarClientesNovedadesUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarClientesNovedadesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesNovedadesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesNovedadesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesNovedadesUpdate.setText("U");
		this.jButtonid_empresaCobrarClientesNovedadesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarClientesNovedadesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesNovedadesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesNovedadesUpdate"));



					
		this.jLabelid_sucursalCobrarClientesNovedades = new JLabelMe();
		this.jLabelid_sucursalCobrarClientesNovedades.setText(""+CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCobrarClientesNovedades.setToolTipText("Sucursal");
		this.jLabelid_sucursalCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCobrarClientesNovedades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCobrarClientesNovedades.setToolTipText(CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		this.jPanelid_sucursalCobrarClientesNovedades.setLayout(this.gridaBagLayoutCobrarClientesNovedades);


		jComboBoxid_sucursalCobrarClientesNovedades= new JComboBoxMe();
		jComboBoxid_sucursalCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCobrarClientesNovedades.setEnabled(false);

		this.jButtonid_sucursalCobrarClientesNovedades= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesNovedades.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesNovedades.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesNovedades.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesNovedades.setText("Buscar");
		this.jButtonid_sucursalCobrarClientesNovedades.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCobrarClientesNovedades.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesNovedades,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesNovedades"));

		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setText("U");
		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesNovedadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesNovedadesBusqueda"));

		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCobrarClientesNovedadesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCobrarClientesNovedadesUpdate= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesNovedadesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesNovedadesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesNovedadesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesNovedadesUpdate.setText("U");
		this.jButtonid_sucursalCobrarClientesNovedadesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCobrarClientesNovedadesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesNovedadesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesNovedadesUpdate"));



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
		//this.jInternalFrameDetalleCobrarClientesNovedades = new CobrarClientesNovedadesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Clientes Novedades DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesNovedades= new GridBagLayout();
		

		
		String sToolTipCobrarClientesNovedades="";
		sToolTipCobrarClientesNovedades=CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesNovedades+="(Cartera.CobrarClientesNovedades)";
		}
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesNovedades+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarClientesNovedades = new JButtonMe();
		this.jButtonModificarCobrarClientesNovedades = new JButtonMe();
        this.jButtonActualizarCobrarClientesNovedades = new JButtonMe();
        this.jButtonEliminarCobrarClientesNovedades = new JButtonMe();
        this.jButtonCancelarCobrarClientesNovedades = new JButtonMe();
        this.jButtonGuardarCambiosCobrarClientesNovedades = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades = new JButtonMe();
		this.jButtonCerrarCobrarClientesNovedades = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesNovedades = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarClientesNovedades = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarClientesNovedades = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Novedades";
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Novedadeses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesNovedades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarClientesNovedades.setName("jPanelCamposCobrarClientesNovedades"); 

		this.jPanelCamposOcultosCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarClientesNovedades.setName("jPanelCamposOcultosCobrarClientesNovedades"); 

        this.jPanelAccionesCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesNovedades.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesNovedades.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarClientesNovedades.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarClientesNovedades.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarClientesNovedades.setText("Nuevo");
		this.jButtonModificarCobrarClientesNovedades.setText("Editar");
        this.jButtonActualizarCobrarClientesNovedades.setText("Actualizar");
        this.jButtonEliminarCobrarClientesNovedades.setText("Eliminar");
        this.jButtonCancelarCobrarClientesNovedades.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarClientesNovedades.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.setText("Guardar");
		this.jButtonCerrarCobrarClientesNovedades.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesNovedades,"nuevo_button","Nuevo",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarClientesNovedades,"modificar_button","Editar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarClientesNovedades,"actualizar_button","Actualizar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarClientesNovedades,"eliminar_button","Eliminar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarClientesNovedades,"cancelar_button","Cancelar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarClientesNovedades,"guardarcambios_button","Guardar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesNovedades,"guardarcambiostabla_button","Guardar",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesNovedades,"cerrar_button","Salir",this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarClientesNovedades.setToolTipText("Nuevo"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarClientesNovedades.setToolTipText("Editar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarClientesNovedades.setToolTipText("Actualizar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarClientesNovedades.setToolTipText("Eliminar)"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarClientesNovedades.setToolTipText("Cancelar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarClientesNovedades.setToolTipText("Guardar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.setToolTipText("Guardar"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesNovedades.setToolTipText("Salir"+" "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesNovedades";
		inputMap = this.jButtonNuevoCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesNovedades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesNovedades"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarClientesNovedades";
		inputMap = this.jButtonActualizarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarClientesNovedades"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarClientesNovedades";
		inputMap = this.jButtonEliminarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarClientesNovedades"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarClientesNovedades";
		inputMap = this.jButtonCancelarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarClientesNovedades"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesNovedades";
		inputMap = this.jButtonCerrarCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesNovedades"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesNovedades";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesNovedades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesNovedades"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarClientesNovedades = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarClientesNovedades.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarClientesNovedades.setToolTipText("Nuevo CobrarClientesNovedades");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarClientesNovedades = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarClientesNovedades.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarClientesNovedades.setToolTipText("Sin Cerrar Ventana CobrarClientesNovedades");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarClientesNovedades = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarClientesNovedades.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarClientesNovedades.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesNovedades.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarClientesNovedades = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesNovedades.setText("Acciones");		
		this.jLabelAccionesCobrarClientesNovedades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesNovedades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesNovedades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarClientesNovedades();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarClientesNovedades();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarClientesNovedades=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarClientesNovedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarClientesNovedades,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesNovedades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarClientesNovedades = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarClientesNovedades = new GridBagLayout();
		
		this.jPanelCamposCobrarClientesNovedades.setLayout(gridaBagLayoutCamposCobrarClientesNovedades);
		this.jPanelCamposOcultosCobrarClientesNovedades.setLayout(gridaBagLayoutCamposOcultosCobrarClientesNovedades);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarClientesNovedades.add(jLabelIdCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarClientesNovedades.add(jLabelidCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarClientesNovedades.add(jLabelid_empresaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesNovedades.add(jButtonid_empresaCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 3;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesNovedades.add(jButtonid_empresaCobrarClientesNovedadesUpdate, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarClientesNovedades.add(jComboBoxid_empresaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCobrarClientesNovedades.add(jLabelid_sucursalCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesNovedades.add(jButtonid_sucursalCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 3;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesNovedades.add(jButtonid_sucursalCobrarClientesNovedadesUpdate, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCobrarClientesNovedades.add(jComboBoxid_sucursalCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfeha_atencion_hastaCobrarClientesNovedades.add(jLabelfeha_atencion_hastaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelfeha_atencion_hastaCobrarClientesNovedades.add(jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfeha_atencion_hastaCobrarClientesNovedades.add(jDateChooserfeha_atencion_hastaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarClientesNovedades.add(jLabelcodigoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarClientesNovedades.add(jButtoncodigoCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarClientesNovedades.add(jTextFieldcodigoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrarClientesNovedades.add(jLabelnombreCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrarClientesNovedades.add(jButtonnombreCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrarClientesNovedades.add(jscrollPanenombreCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCobrarClientesNovedades.add(jLabelapellidoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCobrarClientesNovedades.add(jButtonapellidoCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCobrarClientesNovedades.add(jscrollPaneapellidoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfeha_atencionCobrarClientesNovedades.add(jLabelfeha_atencionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelfeha_atencionCobrarClientesNovedades.add(jButtonfeha_atencionCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfeha_atencionCobrarClientesNovedades.add(jDateChooserfeha_atencionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_atencionCobrarClientesNovedades.add(jLabelhora_atencionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_atencionCobrarClientesNovedades.add(jButtonhora_atencionCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_atencionCobrarClientesNovedades.add(jSpinnerhora_atencionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaccion_tomadaCobrarClientesNovedades.add(jLabelaccion_tomadaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelaccion_tomadaCobrarClientesNovedades.add(jButtonaccion_tomadaCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaccion_tomadaCobrarClientesNovedades.add(jscrollPaneaccion_tomadaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCobrarClientesNovedades.add(jLabeldescripcionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCobrarClientesNovedades.add(jButtondescripcionCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCobrarClientesNovedades.add(jscrollPanedescripcionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoCobrarClientesNovedades.add(jLabelesta_activoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 2;
		this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
		this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoCobrarClientesNovedades.add(jButtonesta_activoCobrarClientesNovedadesBusqueda, this.gridBagConstraintsCobrarClientesNovedades);
	}

	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = 1;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoCobrarClientesNovedades.add(jCheckBoxesta_activoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelidCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelfeha_atencion_hastaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelcodigoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelnombreCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelapellidoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelfeha_atencionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelhora_atencionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelaccion_tomadaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPaneldescripcionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesNovedades.add(this.jPanelesta_activoCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposCobrarClientesNovedades % 1==0) {
		iXPanelCamposCobrarClientesNovedades=0;
		iYPanelCamposCobrarClientesNovedades++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposOcultosCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposOcultosCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesNovedades.add(this.jPanelid_empresaCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposOcultosCobrarClientesNovedades % 1==0) {
		iXPanelCamposOcultosCobrarClientesNovedades=0;
		iYPanelCamposOcultosCobrarClientesNovedades++;
	}
	this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesNovedades.gridy = iYPanelCamposOcultosCobrarClientesNovedades;
	this.gridBagConstraintsCobrarClientesNovedades.gridx = iXPanelCamposOcultosCobrarClientesNovedades++;
	this.gridBagConstraintsCobrarClientesNovedades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesNovedades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesNovedades.add(this.jPanelid_sucursalCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);



	if(iXPanelCamposOcultosCobrarClientesNovedades % 1==0) {
		iXPanelCamposOcultosCobrarClientesNovedades=0;
		iYPanelCamposOcultosCobrarClientesNovedades++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesNovedades= new GridBagLayout();
		this.jPanelAccionesCobrarClientesNovedades.setLayout(gridaBagLayoutAccionesCobrarClientesNovedades);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarClientesNovedades= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarClientesNovedades.setLayout(gridaBagLayoutAccionesFormularioCobrarClientesNovedades);
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarClientesNovedades.add(this.jComboBoxTiposAccionesFormularioCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesNovedades.add(this.jButtonModificarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);							

		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;
		this.gridBagConstraintsCobrarClientesNovedades.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesNovedades.add(this.jButtonEliminarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
			
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesNovedades.add(this.jButtonActualizarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);


		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesNovedades.add(this.jButtonGuardarCambiosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);	
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = 0;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesNovedades.add(this.jButtonCancelarCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesNovedades = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesNovedades);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesNovedades.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesNovedades.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesNovedades.gridx =0;
		this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesNovedades.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarClientesNovedades = new CobrarClientesNovedadesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Clientes Novedades DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Clientes Novedades DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Novedades Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarClientesNovedadesModel cobrarclientesnovedadesModel=new CobrarClientesNovedadesModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarClientesNovedadesModel.CobrarClientesNovedadesFocusTraversalPolicy cobrarclientesnovedadesFocusTraversalPolicy = cobrarclientesnovedadesModel.new CobrarClientesNovedadesFocusTraversalPolicy(this);
			
			//cobrarclientesnovedadesFocusTraversalPolicy.setcobrarclientesnovedadesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarclientesnovedadesModel);
			
			
			this.jContentPaneDetalleCobrarClientesNovedades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarClientesNovedades = new GridBagLayout();	
			this.jContentPaneDetalleCobrarClientesNovedades.setLayout(gridaBagLayoutDetalleCobrarClientesNovedades);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesNovedades = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarClientesNovedades.add(jTtoolBarDetalleCobrarClientesNovedades, gridBagConstraintsCobrarClientesNovedades);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarClientesNovedades=   new JScrollPane(jContentPaneDetalleCobrarClientesNovedades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarClientesNovedades=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	        
			this.jContentPaneDetalleCobrarClientesNovedades.add(jPanelCamposCobrarClientesNovedades, gridBagConstraintsCobrarClientesNovedades);
			
			
			
			
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
						//&& cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarClientesNovedades= new GridBagConstraints();
						this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
						this.jContentPaneDetalleCobrarClientesNovedades.add(this.jTabbedPaneRelacionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarClientesNovedades.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarClientesNovedades.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
					this.gridBagConstraintsCobrarClientesNovedades.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarClientesNovedades.add(jPanelCamposOcultosCobrarClientesNovedades, gridBagConstraintsCobrarClientesNovedades);
				
					this.jPanelCamposOcultosCobrarClientesNovedades.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	        this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarClientesNovedades.add(this.jPanelAccionesFormularioCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);							
			
			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
	        this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarClientesNovedades.add(this.jPanelAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarClientesNovedades);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarClientesNovedades=   new JScrollPane(this.jPanelCamposCobrarClientesNovedades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesNovedades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesNovedades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesNovedades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
			this.gridBagConstraintsCobrarClientesNovedades.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarClientesNovedades.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarClientesNovedades.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);			
			
			this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
			
			
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		
			
		this.gridBagConstraintsCobrarClientesNovedades = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesNovedades.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesNovedades.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesNovedades, this.gridBagConstraintsCobrarClientesNovedades);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarClientesNovedades;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarClientesNovedades;
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
