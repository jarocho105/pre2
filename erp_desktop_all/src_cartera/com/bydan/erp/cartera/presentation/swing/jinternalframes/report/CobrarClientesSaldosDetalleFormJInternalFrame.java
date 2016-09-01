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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.report.CobrarClientesSaldosConstantesFunciones;

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
public class CobrarClientesSaldosDetalleFormJInternalFrame extends CobrarClientesSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarClientesSaldos;
	
	protected JMenuBar jmenuBarDetalleCobrarClientesSaldos;
	
	protected JMenu jmenuDetalleCobrarClientesSaldos;
	protected JMenu jmenuDetalleArchivoCobrarClientesSaldos;
	protected JMenu jmenuDetalleAccionesCobrarClientesSaldos;
	protected JMenu jmenuDetalleDatosCobrarClientesSaldos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesSaldos;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesSaldos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarClientesSaldosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarClientesSaldos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public CobrarClientesSaldosSessionBean cobrarclientessaldosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public CobrarClientesSaldosLogic cobrarclientessaldosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarClientesSaldos;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesSaldos;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesSaldos;
	
	protected JPanel jPanelCamposCobrarClientesSaldos;    
	protected JPanel jPanelCamposOcultosCobrarClientesSaldos;    	
	protected JPanel jPanelAccionesCobrarClientesSaldos;
	protected JPanel jPanelAccionesFormularioCobrarClientesSaldos;
    
	
	
	protected Integer iXPanelCamposCobrarClientesSaldos=0;
	protected Integer iYPanelCamposCobrarClientesSaldos=0;
	
	protected Integer iXPanelCamposOcultosCobrarClientesSaldos=0;
	protected Integer iYPanelCamposOcultosCobrarClientesSaldos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarClientesSaldos;
	public JButton jButtonModificarCobrarClientesSaldos;
	public JButton jButtonActualizarCobrarClientesSaldos;
    public JButton jButtonEliminarCobrarClientesSaldos;
	public JButton jButtonCancelarCobrarClientesSaldos;
    public JButton jButtonGuardarCambiosCobrarClientesSaldos;
	public JButton jButtonGuardarCambiosTablaCobrarClientesSaldos;
	protected JButton jButtonCerrarCobrarClientesSaldos;
	
	
	protected JButton jButtonProcesarInformacionCobrarClientesSaldos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarClientesSaldos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarClientesSaldos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarClientesSaldos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesSaldos;
	protected JButton jButtonModificarToolBarCobrarClientesSaldos;
	protected JButton jButtonActualizarToolBarCobrarClientesSaldos;
    protected JButton jButtonEliminarToolBarCobrarClientesSaldos;
	protected JButton jButtonCancelarToolBarCobrarClientesSaldos;
    protected JButton jButtonGuardarCambiosToolBarCobrarClientesSaldos;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesSaldos;
	protected JButton jButtonCerrarToolBarCobrarClientesSaldos;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesSaldos;
	protected JMenuItem jMenuItemModificarCobrarClientesSaldos;
	protected JMenuItem jMenuItemActualizarCobrarClientesSaldos;
    protected JMenuItem jMenuItemEliminarCobrarClientesSaldos;
	protected JMenuItem jMenuItemCancelarCobrarClientesSaldos;
    protected JMenuItem jMenuItemGuardarCambiosCobrarClientesSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesSaldos;
	protected JMenuItem jMenuItemCerrarCobrarClientesSaldos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesSaldos;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesSaldos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesSaldos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesSaldos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarClientesSaldos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarClientesSaldos;
	public JLabel jLabelIdCobrarClientesSaldos;
	public JLabel jLabelidCobrarClientesSaldos;
	public JButton jButtonidCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaCobrarClientesSaldos;
	public JLabel jLabelfecha_emision_hastaCobrarClientesSaldos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaCobrarClientesSaldos;

	public JDateChooser jDateChooserfecha_emision_hastaCobrarClientesSaldos;
	public JButton jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarClientesSaldos;
	public JLabel jLabelcodigoCobrarClientesSaldos;
	public JTextField jTextFieldcodigoCobrarClientesSaldos;
	public JButton jButtoncodigoCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarClientesSaldos;
	public JLabel jLabelnombre_completoCobrarClientesSaldos;
	public JTextArea jTextAreanombre_completoCobrarClientesSaldos;
	public JScrollPane jscrollPanenombre_completoCobrarClientesSaldos;
	public JButton jButtonnombre_completoCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_comercialCobrarClientesSaldos;
	public JLabel jLabelnombre_comercialCobrarClientesSaldos;
	public JTextArea jTextAreanombre_comercialCobrarClientesSaldos;
	public JScrollPane jscrollPanenombre_comercialCobrarClientesSaldos;
	public JButton jButtonnombre_comercialCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_garantiaCobrarClientesSaldos;
	public JLabel jLabelnombre_garantiaCobrarClientesSaldos;
	public JTextArea jTextAreanombre_garantiaCobrarClientesSaldos;
	public JScrollPane jscrollPanenombre_garantiaCobrarClientesSaldos;
	public JButton jButtonnombre_garantiaCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanellimite_creditoCobrarClientesSaldos;
	public JLabel jLabellimite_creditoCobrarClientesSaldos;
	public JTextField jTextFieldlimite_creditoCobrarClientesSaldos;
	public JButton jButtonlimite_creditoCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_pedidosCobrarClientesSaldos;
	public JLabel jLabeltotal_pedidosCobrarClientesSaldos;
	public JTextField jTextFieldtotal_pedidosCobrarClientesSaldos;
	public JButton jButtontotal_pedidosCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_saldosCobrarClientesSaldos;
	public JLabel jLabeltotal_saldosCobrarClientesSaldos;
	public JTextField jTextFieldtotal_saldosCobrarClientesSaldos;
	public JButton jButtontotal_saldosCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_chequesCobrarClientesSaldos;
	public JLabel jLabeltotal_chequesCobrarClientesSaldos;
	public JTextField jTextFieldtotal_chequesCobrarClientesSaldos;
	public JButton jButtontotal_chequesCobrarClientesSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarClientesSaldos;
	public JLabel jLabelid_empresaCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarClientesSaldos;
	public JButton jButtonid_empresaCobrarClientesSaldos= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesSaldosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCobrarClientesSaldos;
	public JLabel jLabelid_sucursalCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCobrarClientesSaldos;
	public JButton jButtonid_sucursalCobrarClientesSaldos= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesSaldosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCobrarClientesSaldosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCobrarClientesSaldos;
	public JLabel jLabelid_ejercicioCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCobrarClientesSaldos;
	public JButton jButtonid_ejercicioCobrarClientesSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioCobrarClientesSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCobrarClientesSaldosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarClientesSaldos;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarClientesSaldosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarClientesSaldos=new JPanel();
				this.jPanelAccionesFormularioCobrarClientesSaldos=new JPanel();
				this.jmenuBarDetalleCobrarClientesSaldos=new JMenuBar();
				this.jTtoolBarDetalleCobrarClientesSaldos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarClientesSaldosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarClientesSaldos() {
		return this.jButtonActualizarToolBarCobrarClientesSaldos;
	}
	
	public JButton getjButtonEliminarToolBarCobrarClientesSaldos() {
		return this.jButtonEliminarToolBarCobrarClientesSaldos;
	}
	
	public JButton getjButtonCancelarToolBarCobrarClientesSaldos() {
		return this.jButtonCancelarToolBarCobrarClientesSaldos;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarClientesSaldos() {
		return this.jButtonProcesarInformacionCobrarClientesSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesSaldos)	{
		this.jButtonProcesarInformacionCobrarClientesSaldos = jButtonProcesarInformacionCobrarClientesSaldos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesSaldos() {
		return this.jComboBoxTiposAccionesCobrarClientesSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesSaldos(
			JComboBox jComboBoxTiposRelacionesCobrarClientesSaldos) {
		this.jComboBoxTiposRelacionesCobrarClientesSaldos = jComboBoxTiposRelacionesCobrarClientesSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesSaldos(
			JComboBox jComboBoxTiposAccionesCobrarClientesSaldos) {
		this.jComboBoxTiposAccionesCobrarClientesSaldos = jComboBoxTiposAccionesCobrarClientesSaldos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarClientesSaldos() {
		return this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarClientesSaldos(
			JComboBox jComboBoxTiposAccionesFormularioCobrarClientesSaldos) {
		this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos = jComboBoxTiposAccionesFormularioCobrarClientesSaldos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
		
		this.cobrarclientessaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientessaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarClientesSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarClientesSaldos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarClientesSaldos=new JButtonMe();
				this.jButtonModificarToolBarCobrarClientesSaldos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarClientesSaldos,this.jTtoolBarDetalleCobrarClientesSaldos,
							"actualizar","actualizar","Actualizar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarClientesSaldos,this.jTtoolBarDetalleCobrarClientesSaldos,
							"eliminar","eliminar","Eliminar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarClientesSaldos,this.jTtoolBarDetalleCobrarClientesSaldos,
							"cancelar","cancelar","Cancelar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarClientesSaldos,this.jTtoolBarDetalleCobrarClientesSaldos,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarClientesSaldos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarClientesSaldos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarClientesSaldos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarClientesSaldos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarClientesSaldos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarClientesSaldos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarClientesSaldos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarClientesSaldos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarClientesSaldos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarClientesSaldos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarClientesSaldos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarClientesSaldos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarClientesSaldos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarClientesSaldos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarClientesSaldos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarClientesSaldos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarClientesSaldos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarClientesSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarClientesSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarClientesSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarClientesSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarClientesSaldos.add(this.jMenuItemDetalleCerrarCobrarClientesSaldos);
		
		this.jmenuDetalleAccionesCobrarClientesSaldos.add(this.jMenuItemActualizarCobrarClientesSaldos);
		this.jmenuDetalleAccionesCobrarClientesSaldos.add(this.jMenuItemEliminarCobrarClientesSaldos);
		this.jmenuDetalleAccionesCobrarClientesSaldos.add(this.jMenuItemCancelarCobrarClientesSaldos);		
		
		//this.jmenuDetalleDatosCobrarClientesSaldos.add(this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos);				
		this.jmenuDetalleDatosCobrarClientesSaldos.add(this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos);				
				
		//this.jmenuDetalleAccionesCobrarClientesSaldos.add(this.jMenuItemGuardarCambiosCobrarClientesSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarClientesSaldos.add(this.jmenuDetalleArchivoCobrarClientesSaldos);		
		this.jmenuBarDetalleCobrarClientesSaldos.add(this.jmenuDetalleAccionesCobrarClientesSaldos);		
		this.jmenuBarDetalleCobrarClientesSaldos.add(this.jmenuDetalleDatosCobrarClientesSaldos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarClientesSaldos);				
	}
	
	
	public void inicializarElementosCamposCobrarClientesSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarClientesSaldos = new JLabelMe();
		jLabelIdCobrarClientesSaldos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarClientesSaldos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarClientesSaldos= new GridBagLayout();

		this.jPanelidCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);

		jLabelidCobrarClientesSaldos = new JLabel();
		jLabelidCobrarClientesSaldos.setText("Id");

		jLabelidCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_hastaCobrarClientesSaldos = new JLabelMe();
		this.jLabelfecha_emision_hastaCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaCobrarClientesSaldos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelfecha_emision_hastaCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		//jFormattedTextFieldfecha_emision_hastaCobrarClientesSaldos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaCobrarClientesSaldos= new JDateChooser();
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.setEnabled(false);
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.setDate(new Date());
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaCobrarClientesSaldos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarClientesSaldos = new JLabelMe();
		this.jLabelcodigoCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarClientesSaldos.setToolTipText("Codigo");
		this.jLabelcodigoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelcodigoCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextFieldcodigoCobrarClientesSaldos= new JTextFieldMe();

		jTextFieldcodigoCobrarClientesSaldos.setEnabled(false);
		jTextFieldcodigoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarClientesSaldosBusqueda.setText("U");
		this.jButtoncodigoCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarClientesSaldos = new JLabelMe();
		this.jLabelnombre_completoCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarClientesSaldos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelnombre_completoCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextAreanombre_completoCobrarClientesSaldos= new JTextAreaMe();
		jTextAreanombre_completoCobrarClientesSaldos.setEnabled(false);
		jTextAreanombre_completoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarClientesSaldos.setLineWrap(true);
		jTextAreanombre_completoCobrarClientesSaldos.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarClientesSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarClientesSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarClientesSaldos = new JScrollPane(jTextAreanombre_completoCobrarClientesSaldos);
		jscrollPanenombre_completoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_comercialCobrarClientesSaldos = new JLabelMe();
		this.jLabelnombre_comercialCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL+" : *");
		this.jLabelnombre_comercialCobrarClientesSaldos.setToolTipText("Nombre Comercial");
		this.jLabelnombre_comercialCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_comercialCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_comercialCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_comercialCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelnombre_comercialCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextAreanombre_comercialCobrarClientesSaldos= new JTextAreaMe();
		jTextAreanombre_comercialCobrarClientesSaldos.setEnabled(false);
		jTextAreanombre_comercialCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCobrarClientesSaldos.setLineWrap(true);
		jTextAreanombre_comercialCobrarClientesSaldos.setWrapStyleWord(true);
		jTextAreanombre_comercialCobrarClientesSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_comercialCobrarClientesSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_comercialCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_comercialCobrarClientesSaldos = new JScrollPane(jTextAreanombre_comercialCobrarClientesSaldos);
		jscrollPanenombre_comercialCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_comercialCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_comercialCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_comercialCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_comercialCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_comercialCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_garantiaCobrarClientesSaldos = new JLabelMe();
		this.jLabelnombre_garantiaCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA+" : *");
		this.jLabelnombre_garantiaCobrarClientesSaldos.setToolTipText("Nombre Garantia");
		this.jLabelnombre_garantiaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_garantiaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_garantiaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_garantiaCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_garantiaCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_garantiaCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelnombre_garantiaCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextAreanombre_garantiaCobrarClientesSaldos= new JTextAreaMe();
		jTextAreanombre_garantiaCobrarClientesSaldos.setEnabled(false);
		jTextAreanombre_garantiaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_garantiaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_garantiaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_garantiaCobrarClientesSaldos.setLineWrap(true);
		jTextAreanombre_garantiaCobrarClientesSaldos.setWrapStyleWord(true);
		jTextAreanombre_garantiaCobrarClientesSaldos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_garantiaCobrarClientesSaldos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_garantiaCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_garantiaCobrarClientesSaldos = new JScrollPane(jTextAreanombre_garantiaCobrarClientesSaldos);
		jscrollPanenombre_garantiaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_garantiaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_garantiaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_garantiaCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_garantiaCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_garantiaCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabellimite_creditoCobrarClientesSaldos = new JLabelMe();
		this.jLabellimite_creditoCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO+" : *");
		this.jLabellimite_creditoCobrarClientesSaldos.setToolTipText("Limite Credito");
		this.jLabellimite_creditoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellimite_creditoCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellimite_creditoCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellimite_creditoCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanellimite_creditoCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextFieldlimite_creditoCobrarClientesSaldos= new JTextFieldMe();
		jTextFieldlimite_creditoCobrarClientesSaldos.setEnabled(false);
		jTextFieldlimite_creditoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlimite_creditoCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldlimite_creditoCobrarClientesSaldos.setText("0.0");

		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlimite_creditoCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlimite_creditoCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlimite_creditoCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"limite_creditoCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlimite_creditoCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_pedidosCobrarClientesSaldos = new JLabelMe();
		this.jLabeltotal_pedidosCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS+" : *");
		this.jLabeltotal_pedidosCobrarClientesSaldos.setToolTipText("Total Pedos");
		this.jLabeltotal_pedidosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_pedidosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_pedidosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_pedidosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_pedidosCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_pedidosCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPaneltotal_pedidosCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextFieldtotal_pedidosCobrarClientesSaldos= new JTextFieldMe();
		jTextFieldtotal_pedidosCobrarClientesSaldos.setEnabled(false);
		jTextFieldtotal_pedidosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pedidosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_pedidosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_pedidosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_pedidosCobrarClientesSaldos.setText("0.0");

		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setText("U");
		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_pedidosCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_pedidosCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_pedidosCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_pedidosCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_pedidosCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_saldosCobrarClientesSaldos = new JLabelMe();
		this.jLabeltotal_saldosCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS+" : *");
		this.jLabeltotal_saldosCobrarClientesSaldos.setToolTipText("Total Saldos");
		this.jLabeltotal_saldosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_saldosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_saldosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_saldosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_saldosCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_saldosCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPaneltotal_saldosCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextFieldtotal_saldosCobrarClientesSaldos= new JTextFieldMe();
		jTextFieldtotal_saldosCobrarClientesSaldos.setEnabled(false);
		jTextFieldtotal_saldosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_saldosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_saldosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_saldosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_saldosCobrarClientesSaldos.setText("0.0");

		this.jButtontotal_saldosCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setText("U");
		this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_saldosCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_saldosCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_saldosCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_saldosCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_saldosCobrarClientesSaldosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_chequesCobrarClientesSaldos = new JLabelMe();
		this.jLabeltotal_chequesCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES+" : *");
		this.jLabeltotal_chequesCobrarClientesSaldos.setToolTipText("Total Cheques");
		this.jLabeltotal_chequesCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_chequesCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_chequesCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_chequesCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_chequesCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_chequesCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPaneltotal_chequesCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jTextFieldtotal_chequesCobrarClientesSaldos= new JTextFieldMe();
		jTextFieldtotal_chequesCobrarClientesSaldos.setEnabled(false);
		jTextFieldtotal_chequesCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_chequesCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_chequesCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_chequesCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_chequesCobrarClientesSaldos.setText("0.0");

		this.jButtontotal_chequesCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setText("U");
		this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_chequesCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_chequesCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_chequesCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_chequesCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_chequesCobrarClientesSaldosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarClientesSaldos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarClientesSaldos = new JLabelMe();
		this.jLabelid_empresaCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarClientesSaldos.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelid_empresaCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jComboBoxid_empresaCobrarClientesSaldos= new JComboBoxMe();
		jComboBoxid_empresaCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarClientesSaldos.setEnabled(false);

		this.jButtonid_empresaCobrarClientesSaldos= new JButtonMe();
		this.jButtonid_empresaCobrarClientesSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesSaldos.setText("Buscar");
		this.jButtonid_empresaCobrarClientesSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarClientesSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesSaldos"));

		this.jButtonid_empresaCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonid_empresaCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarClientesSaldosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarClientesSaldosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarClientesSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesSaldosUpdate.setText("U");
		this.jButtonid_empresaCobrarClientesSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarClientesSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesSaldosUpdate"));



					
		this.jLabelid_sucursalCobrarClientesSaldos = new JLabelMe();
		this.jLabelid_sucursalCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCobrarClientesSaldos.setToolTipText("Sucursal");
		this.jLabelid_sucursalCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelid_sucursalCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jComboBoxid_sucursalCobrarClientesSaldos= new JComboBoxMe();
		jComboBoxid_sucursalCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCobrarClientesSaldos.setEnabled(false);

		this.jButtonid_sucursalCobrarClientesSaldos= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarClientesSaldos.setText("Buscar");
		this.jButtonid_sucursalCobrarClientesSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCobrarClientesSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesSaldos"));

		this.jButtonid_sucursalCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCobrarClientesSaldosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCobrarClientesSaldosUpdate= new JButtonMe();
		this.jButtonid_sucursalCobrarClientesSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarClientesSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarClientesSaldosUpdate.setText("U");
		this.jButtonid_sucursalCobrarClientesSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCobrarClientesSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarClientesSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarClientesSaldosUpdate"));



					
		this.jLabelid_ejercicioCobrarClientesSaldos = new JLabelMe();
		this.jLabelid_ejercicioCobrarClientesSaldos.setText(""+CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCobrarClientesSaldos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCobrarClientesSaldos.setToolTipText(CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		this.jPanelid_ejercicioCobrarClientesSaldos.setLayout(this.gridaBagLayoutCobrarClientesSaldos);


		jComboBoxid_ejercicioCobrarClientesSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCobrarClientesSaldos.setEnabled(false);

		this.jButtonid_ejercicioCobrarClientesSaldos= new JButtonMe();
		this.jButtonid_ejercicioCobrarClientesSaldos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCobrarClientesSaldos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCobrarClientesSaldos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCobrarClientesSaldos.setText("Buscar");
		this.jButtonid_ejercicioCobrarClientesSaldos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCobrarClientesSaldos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCobrarClientesSaldos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCobrarClientesSaldos"));

		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setText("U");
		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCobrarClientesSaldosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCobrarClientesSaldosBusqueda"));

		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCobrarClientesSaldosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCobrarClientesSaldosUpdate= new JButtonMe();
		this.jButtonid_ejercicioCobrarClientesSaldosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCobrarClientesSaldosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCobrarClientesSaldosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCobrarClientesSaldosUpdate.setText("U");
		this.jButtonid_ejercicioCobrarClientesSaldosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCobrarClientesSaldosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCobrarClientesSaldosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCobrarClientesSaldosUpdate"));



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
		//this.jInternalFrameDetalleCobrarClientesSaldos = new CobrarClientesSaldosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Clientes Saldos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesSaldos= new GridBagLayout();
		

		
		String sToolTipCobrarClientesSaldos="";
		sToolTipCobrarClientesSaldos=CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesSaldos+="(Cartera.CobrarClientesSaldos)";
		}
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesSaldos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarClientesSaldos = new JButtonMe();
		this.jButtonModificarCobrarClientesSaldos = new JButtonMe();
        this.jButtonActualizarCobrarClientesSaldos = new JButtonMe();
        this.jButtonEliminarCobrarClientesSaldos = new JButtonMe();
        this.jButtonCancelarCobrarClientesSaldos = new JButtonMe();
        this.jButtonGuardarCambiosCobrarClientesSaldos = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos = new JButtonMe();
		this.jButtonCerrarCobrarClientesSaldos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesSaldos = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarClientesSaldos = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarClientesSaldos = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Saldos";
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarClientesSaldos.setName("jPanelCamposCobrarClientesSaldos"); 

		this.jPanelCamposOcultosCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarClientesSaldos.setName("jPanelCamposOcultosCobrarClientesSaldos"); 

        this.jPanelAccionesCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesSaldos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesSaldos.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarClientesSaldos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarClientesSaldos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarClientesSaldos.setText("Nuevo");
		this.jButtonModificarCobrarClientesSaldos.setText("Editar");
        this.jButtonActualizarCobrarClientesSaldos.setText("Actualizar");
        this.jButtonEliminarCobrarClientesSaldos.setText("Eliminar");
        this.jButtonCancelarCobrarClientesSaldos.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarClientesSaldos.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.setText("Guardar");
		this.jButtonCerrarCobrarClientesSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesSaldos,"nuevo_button","Nuevo",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarClientesSaldos,"modificar_button","Editar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarClientesSaldos,"actualizar_button","Actualizar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarClientesSaldos,"eliminar_button","Eliminar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarClientesSaldos,"cancelar_button","Cancelar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarClientesSaldos,"guardarcambios_button","Guardar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesSaldos,"guardarcambiostabla_button","Guardar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesSaldos,"cerrar_button","Salir",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarClientesSaldos.setToolTipText("Nuevo"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarClientesSaldos.setToolTipText("Editar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarClientesSaldos.setToolTipText("Actualizar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarClientesSaldos.setToolTipText("Eliminar)"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarClientesSaldos.setToolTipText("Cancelar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarClientesSaldos.setToolTipText("Guardar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.setToolTipText("Guardar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesSaldos.setToolTipText("Salir"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesSaldos";
		inputMap = this.jButtonNuevoCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesSaldos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarClientesSaldos";
		inputMap = this.jButtonActualizarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarClientesSaldos"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarClientesSaldos";
		inputMap = this.jButtonEliminarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarClientesSaldos"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarClientesSaldos";
		inputMap = this.jButtonCancelarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarClientesSaldos"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesSaldos";
		inputMap = this.jButtonCerrarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesSaldos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesSaldos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarClientesSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarClientesSaldos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarClientesSaldos.setToolTipText("Nuevo CobrarClientesSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarClientesSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarClientesSaldos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarClientesSaldos.setToolTipText("Sin Cerrar Ventana CobrarClientesSaldos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarClientesSaldos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarClientesSaldos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarClientesSaldos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesSaldos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarClientesSaldos = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesSaldos.setText("Acciones");		
		this.jLabelAccionesCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarClientesSaldos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarClientesSaldos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarClientesSaldos=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarClientesSaldos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarClientesSaldos = new GridBagLayout();
		
		this.jPanelCamposCobrarClientesSaldos.setLayout(gridaBagLayoutCamposCobrarClientesSaldos);
		this.jPanelCamposOcultosCobrarClientesSaldos.setLayout(gridaBagLayoutCamposOcultosCobrarClientesSaldos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarClientesSaldos.add(jLabelIdCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarClientesSaldos.add(jLabelidCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarClientesSaldos.add(jLabelid_empresaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesSaldos.add(jButtonid_empresaCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 3;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesSaldos.add(jButtonid_empresaCobrarClientesSaldosUpdate, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarClientesSaldos.add(jComboBoxid_empresaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCobrarClientesSaldos.add(jLabelid_sucursalCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesSaldos.add(jButtonid_sucursalCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 3;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarClientesSaldos.add(jButtonid_sucursalCobrarClientesSaldosUpdate, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCobrarClientesSaldos.add(jComboBoxid_sucursalCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioCobrarClientesSaldos.add(jLabelid_ejercicioCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCobrarClientesSaldos.add(jButtonid_ejercicioCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 3;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCobrarClientesSaldos.add(jButtonid_ejercicioCobrarClientesSaldosUpdate, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioCobrarClientesSaldos.add(jComboBoxid_ejercicioCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaCobrarClientesSaldos.add(jLabelfecha_emision_hastaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaCobrarClientesSaldos.add(jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaCobrarClientesSaldos.add(jDateChooserfecha_emision_hastaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarClientesSaldos.add(jLabelcodigoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarClientesSaldos.add(jButtoncodigoCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarClientesSaldos.add(jTextFieldcodigoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarClientesSaldos.add(jLabelnombre_completoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarClientesSaldos.add(jButtonnombre_completoCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarClientesSaldos.add(jscrollPanenombre_completoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_comercialCobrarClientesSaldos.add(jLabelnombre_comercialCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_comercialCobrarClientesSaldos.add(jButtonnombre_comercialCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_comercialCobrarClientesSaldos.add(jscrollPanenombre_comercialCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_garantiaCobrarClientesSaldos.add(jLabelnombre_garantiaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_garantiaCobrarClientesSaldos.add(jButtonnombre_garantiaCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_garantiaCobrarClientesSaldos.add(jscrollPanenombre_garantiaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellimite_creditoCobrarClientesSaldos.add(jLabellimite_creditoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPanellimite_creditoCobrarClientesSaldos.add(jButtonlimite_creditoCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellimite_creditoCobrarClientesSaldos.add(jTextFieldlimite_creditoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_pedidosCobrarClientesSaldos.add(jLabeltotal_pedidosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_pedidosCobrarClientesSaldos.add(jButtontotal_pedidosCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_pedidosCobrarClientesSaldos.add(jTextFieldtotal_pedidosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_saldosCobrarClientesSaldos.add(jLabeltotal_saldosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_saldosCobrarClientesSaldos.add(jButtontotal_saldosCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_saldosCobrarClientesSaldos.add(jTextFieldtotal_saldosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_chequesCobrarClientesSaldos.add(jLabeltotal_chequesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 2;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
		this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_chequesCobrarClientesSaldos.add(jButtontotal_chequesCobrarClientesSaldosBusqueda, this.gridBagConstraintsCobrarClientesSaldos);
	}

	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = 1;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_chequesCobrarClientesSaldos.add(jTextFieldtotal_chequesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanelidCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanelfecha_emision_hastaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanelcodigoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanelnombre_completoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanelnombre_comercialCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanelnombre_garantiaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPanellimite_creditoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPaneltotal_pedidosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPaneltotal_saldosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesSaldos.add(this.jPaneltotal_chequesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposCobrarClientesSaldos % 2==0) {
		iXPanelCamposCobrarClientesSaldos=0;
		iYPanelCamposCobrarClientesSaldos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposOcultosCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposOcultosCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesSaldos.add(this.jPanelid_empresaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposOcultosCobrarClientesSaldos % 2==0) {
		iXPanelCamposOcultosCobrarClientesSaldos=0;
		iYPanelCamposOcultosCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposOcultosCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposOcultosCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesSaldos.add(this.jPanelid_sucursalCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposOcultosCobrarClientesSaldos % 2==0) {
		iXPanelCamposOcultosCobrarClientesSaldos=0;
		iYPanelCamposOcultosCobrarClientesSaldos++;
	}
	this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesSaldos.gridy = iYPanelCamposOcultosCobrarClientesSaldos;
	this.gridBagConstraintsCobrarClientesSaldos.gridx = iXPanelCamposOcultosCobrarClientesSaldos++;
	this.gridBagConstraintsCobrarClientesSaldos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesSaldos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesSaldos.add(this.jPanelid_ejercicioCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);



	if(iXPanelCamposOcultosCobrarClientesSaldos % 2==0) {
		iXPanelCamposOcultosCobrarClientesSaldos=0;
		iYPanelCamposOcultosCobrarClientesSaldos++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesSaldos= new GridBagLayout();
		this.jPanelAccionesCobrarClientesSaldos.setLayout(gridaBagLayoutAccionesCobrarClientesSaldos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarClientesSaldos= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarClientesSaldos.setLayout(gridaBagLayoutAccionesFormularioCobrarClientesSaldos);
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarClientesSaldos.add(this.jComboBoxTiposAccionesFormularioCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesSaldos.add(this.jButtonModificarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);							

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesSaldos.add(this.jButtonEliminarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesSaldos.add(this.jButtonActualizarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesSaldos.add(this.jButtonGuardarCambiosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);	
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesSaldos.add(this.jButtonCancelarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesSaldos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesSaldos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesSaldos.gridx =0;
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarClientesSaldos = new CobrarClientesSaldosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Clientes Saldos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Clientes Saldos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Saldos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarClientesSaldosModel cobrarclientessaldosModel=new CobrarClientesSaldosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarClientesSaldosModel.CobrarClientesSaldosFocusTraversalPolicy cobrarclientessaldosFocusTraversalPolicy = cobrarclientessaldosModel.new CobrarClientesSaldosFocusTraversalPolicy(this);
			
			//cobrarclientessaldosFocusTraversalPolicy.setcobrarclientessaldosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarclientessaldosModel);
			
			
			this.jContentPaneDetalleCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarClientesSaldos = new GridBagLayout();	
			this.jContentPaneDetalleCobrarClientesSaldos.setLayout(gridaBagLayoutDetalleCobrarClientesSaldos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesSaldos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarClientesSaldos.add(jTtoolBarDetalleCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarClientesSaldos=   new JScrollPane(jContentPaneDetalleCobrarClientesSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarClientesSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	        
			this.jContentPaneDetalleCobrarClientesSaldos.add(jPanelCamposCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);
			
			
			
			
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
						//&& cobrarclientessaldosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarClientesSaldos= new GridBagConstraints();
						this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
						this.jContentPaneDetalleCobrarClientesSaldos.add(this.jTabbedPaneRelacionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarClientesSaldos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarClientesSaldos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
					this.gridBagConstraintsCobrarClientesSaldos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarClientesSaldos.add(jPanelCamposOcultosCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);
				
					this.jPanelCamposOcultosCobrarClientesSaldos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	        this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarClientesSaldos.add(this.jPanelAccionesFormularioCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);							
			
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
	        this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarClientesSaldos.add(this.jPanelAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarClientesSaldos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarClientesSaldos=   new JScrollPane(this.jPanelCamposCobrarClientesSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarClientesSaldos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarClientesSaldos;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarClientesSaldos;
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
