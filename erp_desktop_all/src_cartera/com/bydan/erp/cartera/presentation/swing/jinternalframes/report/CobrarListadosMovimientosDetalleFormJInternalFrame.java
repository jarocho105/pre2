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
import com.bydan.erp.cartera.util.report.CobrarListadosMovimientosConstantesFunciones;

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
public class CobrarListadosMovimientosDetalleFormJInternalFrame extends CobrarListadosMovimientosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarListadosMovimientos;
	
	protected JMenuBar jmenuBarDetalleCobrarListadosMovimientos;
	
	protected JMenu jmenuDetalleCobrarListadosMovimientos;
	protected JMenu jmenuDetalleArchivoCobrarListadosMovimientos;
	protected JMenu jmenuDetalleAccionesCobrarListadosMovimientos;
	protected JMenu jmenuDetalleDatosCobrarListadosMovimientos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarListadosMovimientos;	
	protected GridBagConstraints gridBagConstraintsCobrarListadosMovimientos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarListadosMovimientosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarListadosMovimientos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarListadosMovimientosSessionBean cobrarlistadosmovimientosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CobrarListadosMovimientosLogic cobrarlistadosmovimientosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarListadosMovimientos;
	public JScrollPane jScrollPanelDatosEdicionCobrarListadosMovimientos;
	public JScrollPane jScrollPanelDatosGeneralCobrarListadosMovimientos;
	
	protected JPanel jPanelCamposCobrarListadosMovimientos;    
	protected JPanel jPanelCamposOcultosCobrarListadosMovimientos;    	
	protected JPanel jPanelAccionesCobrarListadosMovimientos;
	protected JPanel jPanelAccionesFormularioCobrarListadosMovimientos;
    
	
	
	protected Integer iXPanelCamposCobrarListadosMovimientos=0;
	protected Integer iYPanelCamposCobrarListadosMovimientos=0;
	
	protected Integer iXPanelCamposOcultosCobrarListadosMovimientos=0;
	protected Integer iYPanelCamposOcultosCobrarListadosMovimientos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarListadosMovimientos;
	public JButton jButtonModificarCobrarListadosMovimientos;
	public JButton jButtonActualizarCobrarListadosMovimientos;
    public JButton jButtonEliminarCobrarListadosMovimientos;
	public JButton jButtonCancelarCobrarListadosMovimientos;
    public JButton jButtonGuardarCambiosCobrarListadosMovimientos;
	public JButton jButtonGuardarCambiosTablaCobrarListadosMovimientos;
	protected JButton jButtonCerrarCobrarListadosMovimientos;
	
	
	protected JButton jButtonProcesarInformacionCobrarListadosMovimientos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarListadosMovimientos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarListadosMovimientos;
	protected JButton jButtonModificarToolBarCobrarListadosMovimientos;
	protected JButton jButtonActualizarToolBarCobrarListadosMovimientos;
    protected JButton jButtonEliminarToolBarCobrarListadosMovimientos;
	protected JButton jButtonCancelarToolBarCobrarListadosMovimientos;
    protected JButton jButtonGuardarCambiosToolBarCobrarListadosMovimientos;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarListadosMovimientos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarListadosMovimientos;
	protected JButton jButtonCerrarToolBarCobrarListadosMovimientos;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarListadosMovimientos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarListadosMovimientos;
	protected JMenuItem jMenuItemModificarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemActualizarCobrarListadosMovimientos;
    protected JMenuItem jMenuItemEliminarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemCancelarCobrarListadosMovimientos;
    protected JMenuItem jMenuItemGuardarCambiosCobrarListadosMovimientos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarListadosMovimientos;
	protected JMenuItem jMenuItemCerrarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarListadosMovimientos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarListadosMovimientos;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarListadosMovimientos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarListadosMovimientos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarListadosMovimientos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarListadosMovimientos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarListadosMovimientos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarListadosMovimientos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarListadosMovimientos;
	public JLabel jLabelIdCobrarListadosMovimientos;
	public JLabel jLabelidCobrarListadosMovimientos;
	public JButton jButtonidCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeCobrarListadosMovimientos;
	public JLabel jLabelfecha_emision_desdeCobrarListadosMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeCobrarListadosMovimientos;

	public JDateChooser jDateChooserfecha_emision_desdeCobrarListadosMovimientos;
	public JButton jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaCobrarListadosMovimientos;
	public JLabel jLabelfecha_emision_hastaCobrarListadosMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaCobrarListadosMovimientos;

	public JDateChooser jDateChooserfecha_emision_hastaCobrarListadosMovimientos;
	public JButton jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarListadosMovimientos;
	public JLabel jLabelcodigoCobrarListadosMovimientos;
	public JTextField jTextFieldcodigoCobrarListadosMovimientos;
	public JButton jButtoncodigoCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarListadosMovimientos;
	public JLabel jLabelnombre_completoCobrarListadosMovimientos;
	public JTextArea jTextAreanombre_completoCobrarListadosMovimientos;
	public JScrollPane jscrollPanenombre_completoCobrarListadosMovimientos;
	public JButton jButtonnombre_completoCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionCobrarListadosMovimientos;
	public JLabel jLabelnombre_transaccionCobrarListadosMovimientos;
	public JTextArea jTextAreanombre_transaccionCobrarListadosMovimientos;
	public JScrollPane jscrollPanenombre_transaccionCobrarListadosMovimientos;
	public JButton jButtonnombre_transaccionCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceCobrarListadosMovimientos;
	public JLabel jLabelfecha_venceCobrarListadosMovimientos;
	//public JFormattedTextField jDateChooserfecha_venceCobrarListadosMovimientos;

	public JDateChooser jDateChooserfecha_venceCobrarListadosMovimientos;
	public JButton jButtonfecha_venceCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionCobrarListadosMovimientos;
	public JLabel jLabelfecha_emisionCobrarListadosMovimientos;
	//public JFormattedTextField jDateChooserfecha_emisionCobrarListadosMovimientos;

	public JDateChooser jDateChooserfecha_emisionCobrarListadosMovimientos;
	public JButton jButtonfecha_emisionCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteCobrarListadosMovimientos;
	public JLabel jLabelnumero_comprobanteCobrarListadosMovimientos;
	public JTextField jTextFieldnumero_comprobanteCobrarListadosMovimientos;
	public JButton jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaCobrarListadosMovimientos;
	public JLabel jLabelnumero_facturaCobrarListadosMovimientos;
	public JTextField jTextFieldnumero_facturaCobrarListadosMovimientos;
	public JButton jButtonnumero_facturaCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localCobrarListadosMovimientos;
	public JLabel jLabeldebito_mone_localCobrarListadosMovimientos;
	public JTextField jTextFielddebito_mone_localCobrarListadosMovimientos;
	public JButton jButtondebito_mone_localCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localCobrarListadosMovimientos;
	public JLabel jLabelcredito_mone_localCobrarListadosMovimientos;
	public JTextField jTextFieldcredito_mone_localCobrarListadosMovimientos;
	public JButton jButtoncredito_mone_localCobrarListadosMovimientosBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCobrarListadosMovimientos;
	public JLabel jLabeldescripcionCobrarListadosMovimientos;
	public JTextArea jTextAreadescripcionCobrarListadosMovimientos;
	public JScrollPane jscrollPanedescripcionCobrarListadosMovimientos;
	public JButton jButtondescripcionCobrarListadosMovimientosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarListadosMovimientos;
	public JLabel jLabelid_empresaCobrarListadosMovimientos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarListadosMovimientos;
	public JButton jButtonid_empresaCobrarListadosMovimientos= new JButtonMe();
	public JButton jButtonid_empresaCobrarListadosMovimientosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarListadosMovimientosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarListadosMovimientos;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarListadosMovimientosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarListadosMovimientos=new JPanel();
				this.jPanelAccionesFormularioCobrarListadosMovimientos=new JPanel();
				this.jmenuBarDetalleCobrarListadosMovimientos=new JMenuBar();
				this.jTtoolBarDetalleCobrarListadosMovimientos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarListadosMovimientosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadosMovimientosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarListadosMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarListadosMovimientos() {
		return this.jButtonActualizarToolBarCobrarListadosMovimientos;
	}
	
	public JButton getjButtonEliminarToolBarCobrarListadosMovimientos() {
		return this.jButtonEliminarToolBarCobrarListadosMovimientos;
	}
	
	public JButton getjButtonCancelarToolBarCobrarListadosMovimientos() {
		return this.jButtonCancelarToolBarCobrarListadosMovimientos;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarListadosMovimientos() {
		return this.jButtonProcesarInformacionCobrarListadosMovimientos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarListadosMovimientos)	{
		this.jButtonProcesarInformacionCobrarListadosMovimientos = jButtonProcesarInformacionCobrarListadosMovimientos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarListadosMovimientos() {
		return this.jComboBoxTiposAccionesCobrarListadosMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposRelacionesCobrarListadosMovimientos) {
		this.jComboBoxTiposRelacionesCobrarListadosMovimientos = jComboBoxTiposRelacionesCobrarListadosMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarListadosMovimientos(
			JComboBox jComboBoxTiposAccionesCobrarListadosMovimientos) {
		this.jComboBoxTiposAccionesCobrarListadosMovimientos = jComboBoxTiposAccionesCobrarListadosMovimientos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarListadosMovimientos() {
		return this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarListadosMovimientos(
			JComboBox jComboBoxTiposAccionesFormularioCobrarListadosMovimientos) {
		this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos = jComboBoxTiposAccionesFormularioCobrarListadosMovimientos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarlistadosmovimientosSessionBean=new CobrarListadosMovimientosSessionBean();
		
		this.cobrarlistadosmovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarlistadosmovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarListadosMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarListadosMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarListadosMovimientosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Listados Movimientos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarListadosMovimientosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarListadosMovimientos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarListadosMovimientos=new JButtonMe();
				this.jButtonModificarToolBarCobrarListadosMovimientos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarListadosMovimientos,this.jTtoolBarDetalleCobrarListadosMovimientos,
							"actualizar","actualizar","Actualizar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarListadosMovimientos,this.jTtoolBarDetalleCobrarListadosMovimientos,
							"eliminar","eliminar","Eliminar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarListadosMovimientos,this.jTtoolBarDetalleCobrarListadosMovimientos,
							"cancelar","cancelar","Cancelar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarListadosMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarListadosMovimientos,this.jTtoolBarDetalleCobrarListadosMovimientos,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarListadosMovimientos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarListadosMovimientos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarListadosMovimientos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarListadosMovimientos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarListadosMovimientos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarListadosMovimientos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarListadosMovimientos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarListadosMovimientos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarListadosMovimientos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarListadosMovimientos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarListadosMovimientos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarListadosMovimientos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarListadosMovimientos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarListadosMovimientos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarListadosMovimientos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarListadosMovimientos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarListadosMovimientos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarListadosMovimientos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarListadosMovimientos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarListadosMovimientos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarListadosMovimientos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarListadosMovimientos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarListadosMovimientos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarListadosMovimientos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarListadosMovimientos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarListadosMovimientos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarListadosMovimientos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarListadosMovimientos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarListadosMovimientos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarListadosMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarListadosMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarListadosMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarListadosMovimientos.add(this.jMenuItemDetalleCerrarCobrarListadosMovimientos);
		
		this.jmenuDetalleAccionesCobrarListadosMovimientos.add(this.jMenuItemActualizarCobrarListadosMovimientos);
		this.jmenuDetalleAccionesCobrarListadosMovimientos.add(this.jMenuItemEliminarCobrarListadosMovimientos);
		this.jmenuDetalleAccionesCobrarListadosMovimientos.add(this.jMenuItemCancelarCobrarListadosMovimientos);		
		
		//this.jmenuDetalleDatosCobrarListadosMovimientos.add(this.jMenuItemDetalleAbrirOrderByCobrarListadosMovimientos);				
		this.jmenuDetalleDatosCobrarListadosMovimientos.add(this.jMenuItemDetalleMostarOcultarCobrarListadosMovimientos);				
				
		//this.jmenuDetalleAccionesCobrarListadosMovimientos.add(this.jMenuItemGuardarCambiosCobrarListadosMovimientos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarListadosMovimientos.add(this.jmenuDetalleArchivoCobrarListadosMovimientos);		
		this.jmenuBarDetalleCobrarListadosMovimientos.add(this.jmenuDetalleAccionesCobrarListadosMovimientos);		
		this.jmenuBarDetalleCobrarListadosMovimientos.add(this.jmenuDetalleDatosCobrarListadosMovimientos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarListadosMovimientos);				
	}
	
	
	public void inicializarElementosCamposCobrarListadosMovimientos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarListadosMovimientos = new JLabelMe();
		jLabelIdCobrarListadosMovimientos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarListadosMovimientos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarListadosMovimientos= new GridBagLayout();

		this.jPanelidCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);

		jLabelidCobrarListadosMovimientos = new JLabel();
		jLabelidCobrarListadosMovimientos.setText("Id");

		jLabelidCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeCobrarListadosMovimientos = new JLabelMe();
		this.jLabelfecha_emision_desdeCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeCobrarListadosMovimientos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelfecha_emision_desdeCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		//jFormattedTextFieldfecha_emision_desdeCobrarListadosMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeCobrarListadosMovimientos= new JDateChooser();
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setEnabled(false);
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setDate(new Date());
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeCobrarListadosMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaCobrarListadosMovimientos = new JLabelMe();
		this.jLabelfecha_emision_hastaCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaCobrarListadosMovimientos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelfecha_emision_hastaCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		//jFormattedTextFieldfecha_emision_hastaCobrarListadosMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaCobrarListadosMovimientos= new JDateChooser();
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setEnabled(false);
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setDate(new Date());
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaCobrarListadosMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarListadosMovimientos = new JLabelMe();
		this.jLabelcodigoCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarListadosMovimientos.setToolTipText("Codigo");
		this.jLabelcodigoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelcodigoCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextFieldcodigoCobrarListadosMovimientos= new JTextFieldMe();

		jTextFieldcodigoCobrarListadosMovimientos.setEnabled(false);
		jTextFieldcodigoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtoncodigoCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarListadosMovimientos = new JLabelMe();
		this.jLabelnombre_completoCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarListadosMovimientos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelnombre_completoCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextAreanombre_completoCobrarListadosMovimientos= new JTextAreaMe();
		jTextAreanombre_completoCobrarListadosMovimientos.setEnabled(false);
		jTextAreanombre_completoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarListadosMovimientos.setLineWrap(true);
		jTextAreanombre_completoCobrarListadosMovimientos.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarListadosMovimientos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarListadosMovimientos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarListadosMovimientos = new JScrollPane(jTextAreanombre_completoCobrarListadosMovimientos);
		jscrollPanenombre_completoCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionCobrarListadosMovimientos = new JLabelMe();
		this.jLabelnombre_transaccionCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionCobrarListadosMovimientos.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelnombre_transaccionCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextAreanombre_transaccionCobrarListadosMovimientos= new JTextAreaMe();
		jTextAreanombre_transaccionCobrarListadosMovimientos.setEnabled(false);
		jTextAreanombre_transaccionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionCobrarListadosMovimientos.setLineWrap(true);
		jTextAreanombre_transaccionCobrarListadosMovimientos.setWrapStyleWord(true);
		jTextAreanombre_transaccionCobrarListadosMovimientos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionCobrarListadosMovimientos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionCobrarListadosMovimientos = new JScrollPane(jTextAreanombre_transaccionCobrarListadosMovimientos);
		jscrollPanenombre_transaccionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceCobrarListadosMovimientos = new JLabelMe();
		this.jLabelfecha_venceCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceCobrarListadosMovimientos.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelfecha_venceCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		//jFormattedTextFieldfecha_venceCobrarListadosMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_venceCobrarListadosMovimientos= new JDateChooser();
		jDateChooserfecha_venceCobrarListadosMovimientos.setEnabled(false);
		jDateChooserfecha_venceCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceCobrarListadosMovimientos.setDate(new Date());
		jDateChooserfecha_venceCobrarListadosMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceCobrarListadosMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionCobrarListadosMovimientos = new JLabelMe();
		this.jLabelfecha_emisionCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionCobrarListadosMovimientos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelfecha_emisionCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		//jFormattedTextFieldfecha_emisionCobrarListadosMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionCobrarListadosMovimientos= new JDateChooser();
		jDateChooserfecha_emisionCobrarListadosMovimientos.setEnabled(false);
		jDateChooserfecha_emisionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionCobrarListadosMovimientos.setDate(new Date());
		jDateChooserfecha_emisionCobrarListadosMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionCobrarListadosMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteCobrarListadosMovimientos = new JLabelMe();
		this.jLabelnumero_comprobanteCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteCobrarListadosMovimientos.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelnumero_comprobanteCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextFieldnumero_comprobanteCobrarListadosMovimientos= new JTextFieldMe();

		jTextFieldnumero_comprobanteCobrarListadosMovimientos.setEnabled(false);
		jTextFieldnumero_comprobanteCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaCobrarListadosMovimientos = new JLabelMe();
		this.jLabelnumero_facturaCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaCobrarListadosMovimientos.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelnumero_facturaCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextFieldnumero_facturaCobrarListadosMovimientos= new JTextFieldMe();

		jTextFieldnumero_facturaCobrarListadosMovimientos.setEnabled(false);
		jTextFieldnumero_facturaCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localCobrarListadosMovimientos = new JLabelMe();
		this.jLabeldebito_mone_localCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localCobrarListadosMovimientos.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPaneldebito_mone_localCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextFielddebito_mone_localCobrarListadosMovimientos= new JTextFieldMe();
		jTextFielddebito_mone_localCobrarListadosMovimientos.setEnabled(false);
		jTextFielddebito_mone_localCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localCobrarListadosMovimientos.setText("0.0");

		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localCobrarListadosMovimientos = new JLabelMe();
		this.jLabelcredito_mone_localCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localCobrarListadosMovimientos.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelcredito_mone_localCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextFieldcredito_mone_localCobrarListadosMovimientos= new JTextFieldMe();
		jTextFieldcredito_mone_localCobrarListadosMovimientos.setEnabled(false);
		jTextFieldcredito_mone_localCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localCobrarListadosMovimientos.setText("0.0");

		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localCobrarListadosMovimientosBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCobrarListadosMovimientos = new JLabelMe();
		this.jLabeldescripcionCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCobrarListadosMovimientos.setToolTipText("Descripcion");
		this.jLabeldescripcionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPaneldescripcionCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jTextAreadescripcionCobrarListadosMovimientos= new JTextAreaMe();
		jTextAreadescripcionCobrarListadosMovimientos.setEnabled(false);
		jTextAreadescripcionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarListadosMovimientos.setLineWrap(true);
		jTextAreadescripcionCobrarListadosMovimientos.setWrapStyleWord(true);
		jTextAreadescripcionCobrarListadosMovimientos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCobrarListadosMovimientos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCobrarListadosMovimientos = new JScrollPane(jTextAreadescripcionCobrarListadosMovimientos);
		jscrollPanedescripcionCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtondescripcionCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtondescripcionCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCobrarListadosMovimientosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarListadosMovimientos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarListadosMovimientos = new JLabelMe();
		this.jLabelid_empresaCobrarListadosMovimientos.setText(""+CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarListadosMovimientos.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarListadosMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarListadosMovimientos.setToolTipText(CobrarListadosMovimientosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		this.jPanelid_empresaCobrarListadosMovimientos.setLayout(this.gridaBagLayoutCobrarListadosMovimientos);


		jComboBoxid_empresaCobrarListadosMovimientos= new JComboBoxMe();
		jComboBoxid_empresaCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarListadosMovimientos.setEnabled(false);

		this.jButtonid_empresaCobrarListadosMovimientos= new JButtonMe();
		this.jButtonid_empresaCobrarListadosMovimientos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarListadosMovimientos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarListadosMovimientos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarListadosMovimientos.setText("Buscar");
		this.jButtonid_empresaCobrarListadosMovimientos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarListadosMovimientos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarListadosMovimientos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarListadosMovimientos"));

		this.jButtonid_empresaCobrarListadosMovimientosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setText("U");
		this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarListadosMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarListadosMovimientosBusqueda"));

		if(this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarListadosMovimientosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarListadosMovimientosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarListadosMovimientosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadosMovimientosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadosMovimientosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarListadosMovimientosUpdate.setText("U");
		this.jButtonid_empresaCobrarListadosMovimientosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarListadosMovimientosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarListadosMovimientosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarListadosMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarListadosMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarListadosMovimientosUpdate"));



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
		//this.jInternalFrameDetalleCobrarListadosMovimientos = new CobrarListadosMovimientosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Listados Movimientos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarListadosMovimientos= new GridBagLayout();
		

		
		String sToolTipCobrarListadosMovimientos="";
		sToolTipCobrarListadosMovimientos=CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarListadosMovimientos+="(Cartera.CobrarListadosMovimientos)";
		}
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarListadosMovimientos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarListadosMovimientos = new JButtonMe();
		this.jButtonModificarCobrarListadosMovimientos = new JButtonMe();
        this.jButtonActualizarCobrarListadosMovimientos = new JButtonMe();
        this.jButtonEliminarCobrarListadosMovimientos = new JButtonMe();
        this.jButtonCancelarCobrarListadosMovimientos = new JButtonMe();
        this.jButtonGuardarCambiosCobrarListadosMovimientos = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos = new JButtonMe();
		this.jButtonCerrarCobrarListadosMovimientos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarListadosMovimientos = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarListadosMovimientos = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarListadosMovimientos = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Listados Movimientos";
		
		if(!this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listados Movimientoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarListadosMovimientos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarListadosMovimientos.setName("jPanelCamposCobrarListadosMovimientos"); 

		this.jPanelCamposOcultosCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarListadosMovimientos.setName("jPanelCamposOcultosCobrarListadosMovimientos"); 

        this.jPanelAccionesCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarListadosMovimientos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarListadosMovimientos.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarListadosMovimientos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarListadosMovimientos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarListadosMovimientos.setText("Nuevo");
		this.jButtonModificarCobrarListadosMovimientos.setText("Editar");
        this.jButtonActualizarCobrarListadosMovimientos.setText("Actualizar");
        this.jButtonEliminarCobrarListadosMovimientos.setText("Eliminar");
        this.jButtonCancelarCobrarListadosMovimientos.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarListadosMovimientos.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.setText("Guardar");
		this.jButtonCerrarCobrarListadosMovimientos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarListadosMovimientos,"nuevo_button","Nuevo",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarListadosMovimientos,"modificar_button","Editar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarListadosMovimientos,"actualizar_button","Actualizar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarListadosMovimientos,"eliminar_button","Eliminar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarListadosMovimientos,"cancelar_button","Cancelar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarListadosMovimientos,"guardarcambios_button","Guardar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarListadosMovimientos,"guardarcambiostabla_button","Guardar",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarListadosMovimientos,"cerrar_button","Salir",this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarListadosMovimientos.setToolTipText("Nuevo"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarListadosMovimientos.setToolTipText("Editar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarListadosMovimientos.setToolTipText("Actualizar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarListadosMovimientos.setToolTipText("Eliminar)"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarListadosMovimientos.setToolTipText("Cancelar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarListadosMovimientos.setToolTipText("Guardar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.setToolTipText("Guardar"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarListadosMovimientos.setToolTipText("Salir"+" "+CobrarListadosMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarListadosMovimientos";
		inputMap = this.jButtonNuevoCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarListadosMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarListadosMovimientos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarListadosMovimientos";
		inputMap = this.jButtonActualizarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarListadosMovimientos"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarListadosMovimientos";
		inputMap = this.jButtonEliminarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarListadosMovimientos"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarListadosMovimientos";
		inputMap = this.jButtonCancelarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarListadosMovimientos"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarListadosMovimientos";
		inputMap = this.jButtonCerrarCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarListadosMovimientos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarListadosMovimientos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarListadosMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarListadosMovimientos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarListadosMovimientos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarListadosMovimientos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarListadosMovimientos.setToolTipText("Nuevo CobrarListadosMovimientos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos.setToolTipText("Sin Cerrar Ventana CobrarListadosMovimientos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarListadosMovimientos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarListadosMovimientos = new JLabelMe();
		
		this.jLabelAccionesCobrarListadosMovimientos.setText("Acciones");		
		this.jLabelAccionesCobrarListadosMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadosMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadosMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarListadosMovimientos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarListadosMovimientos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarListadosMovimientos=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarListadosMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarListadosMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarListadosMovimientos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarListadosMovimientos = new GridBagLayout();
		
		this.jPanelCamposCobrarListadosMovimientos.setLayout(gridaBagLayoutCamposCobrarListadosMovimientos);
		this.jPanelCamposOcultosCobrarListadosMovimientos.setLayout(gridaBagLayoutCamposOcultosCobrarListadosMovimientos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarListadosMovimientos.add(jLabelIdCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarListadosMovimientos.add(jLabelidCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarListadosMovimientos.add(jLabelid_empresaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarListadosMovimientos.add(jButtonid_empresaCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 3;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarListadosMovimientos.add(jButtonid_empresaCobrarListadosMovimientosUpdate, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarListadosMovimientos.add(jComboBoxid_empresaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeCobrarListadosMovimientos.add(jLabelfecha_emision_desdeCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeCobrarListadosMovimientos.add(jButtonfecha_emision_desdeCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeCobrarListadosMovimientos.add(jDateChooserfecha_emision_desdeCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaCobrarListadosMovimientos.add(jLabelfecha_emision_hastaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaCobrarListadosMovimientos.add(jButtonfecha_emision_hastaCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaCobrarListadosMovimientos.add(jDateChooserfecha_emision_hastaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarListadosMovimientos.add(jLabelcodigoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarListadosMovimientos.add(jButtoncodigoCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarListadosMovimientos.add(jTextFieldcodigoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarListadosMovimientos.add(jLabelnombre_completoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarListadosMovimientos.add(jButtonnombre_completoCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarListadosMovimientos.add(jscrollPanenombre_completoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionCobrarListadosMovimientos.add(jLabelnombre_transaccionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionCobrarListadosMovimientos.add(jButtonnombre_transaccionCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionCobrarListadosMovimientos.add(jscrollPanenombre_transaccionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceCobrarListadosMovimientos.add(jLabelfecha_venceCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceCobrarListadosMovimientos.add(jButtonfecha_venceCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceCobrarListadosMovimientos.add(jDateChooserfecha_venceCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionCobrarListadosMovimientos.add(jLabelfecha_emisionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionCobrarListadosMovimientos.add(jButtonfecha_emisionCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionCobrarListadosMovimientos.add(jDateChooserfecha_emisionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteCobrarListadosMovimientos.add(jLabelnumero_comprobanteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteCobrarListadosMovimientos.add(jButtonnumero_comprobanteCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteCobrarListadosMovimientos.add(jTextFieldnumero_comprobanteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaCobrarListadosMovimientos.add(jLabelnumero_facturaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaCobrarListadosMovimientos.add(jButtonnumero_facturaCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaCobrarListadosMovimientos.add(jTextFieldnumero_facturaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localCobrarListadosMovimientos.add(jLabeldebito_mone_localCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localCobrarListadosMovimientos.add(jButtondebito_mone_localCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localCobrarListadosMovimientos.add(jTextFielddebito_mone_localCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localCobrarListadosMovimientos.add(jLabelcredito_mone_localCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localCobrarListadosMovimientos.add(jButtoncredito_mone_localCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localCobrarListadosMovimientos.add(jTextFieldcredito_mone_localCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCobrarListadosMovimientos.add(jLabeldescripcionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 2;
		this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCobrarListadosMovimientos.add(jButtondescripcionCobrarListadosMovimientosBusqueda, this.gridBagConstraintsCobrarListadosMovimientos);
	}

	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = 1;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCobrarListadosMovimientos.add(jscrollPanedescripcionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelidCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelfecha_emision_desdeCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelfecha_emision_hastaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelcodigoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelnombre_completoCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelnombre_transaccionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelfecha_venceCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelfecha_emisionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelnumero_comprobanteCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelnumero_facturaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPaneldebito_mone_localCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPanelcredito_mone_localCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadosMovimientos.add(this.jPaneldescripcionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposCobrarListadosMovimientos % 2==0) {
		iXPanelCamposCobrarListadosMovimientos=0;
		iYPanelCamposCobrarListadosMovimientos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadosMovimientos.gridy = iYPanelCamposOcultosCobrarListadosMovimientos;
	this.gridBagConstraintsCobrarListadosMovimientos.gridx = iXPanelCamposOcultosCobrarListadosMovimientos++;
	this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadosMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarListadosMovimientos.add(this.jPanelid_empresaCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);



	if(iXPanelCamposOcultosCobrarListadosMovimientos % 2==0) {
		iXPanelCamposOcultosCobrarListadosMovimientos=0;
		iYPanelCamposOcultosCobrarListadosMovimientos++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarListadosMovimientos= new GridBagLayout();
		this.jPanelAccionesCobrarListadosMovimientos.setLayout(gridaBagLayoutAccionesCobrarListadosMovimientos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarListadosMovimientos= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarListadosMovimientos.setLayout(gridaBagLayoutAccionesFormularioCobrarListadosMovimientos);
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarListadosMovimientos.add(this.jComboBoxTiposAccionesFormularioCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarListadosMovimientos.add(this.jButtonModificarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);							

		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarListadosMovimientos.add(this.jButtonEliminarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarListadosMovimientos.add(this.jButtonActualizarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);


		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarListadosMovimientos.add(this.jButtonGuardarCambiosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);	
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = 0;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarListadosMovimientos.add(this.jButtonCancelarCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarListadosMovimientos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarListadosMovimientos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarlistadosmovimientosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;		
			//this.gridBagConstraintsCobrarListadosMovimientos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarListadosMovimientos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =0;
		this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarListadosMovimientos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarListadosMovimientosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarListadosMovimientos = new CobrarListadosMovimientosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Listados Movimientos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Listados Movimientos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Listados Movimientos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarListadosMovimientosModel cobrarlistadosmovimientosModel=new CobrarListadosMovimientosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarListadosMovimientosModel.CobrarListadosMovimientosFocusTraversalPolicy cobrarlistadosmovimientosFocusTraversalPolicy = cobrarlistadosmovimientosModel.new CobrarListadosMovimientosFocusTraversalPolicy(this);
			
			//cobrarlistadosmovimientosFocusTraversalPolicy.setcobrarlistadosmovimientosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarlistadosmovimientosModel);
			
			
			this.jContentPaneDetalleCobrarListadosMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarListadosMovimientos = new GridBagLayout();	
			this.jContentPaneDetalleCobrarListadosMovimientos.setLayout(gridaBagLayoutDetalleCobrarListadosMovimientos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarListadosMovimientos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
				this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarListadosMovimientos.add(jTtoolBarDetalleCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos=   new JScrollPane(jContentPaneDetalleCobrarListadosMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	        
			this.jContentPaneDetalleCobrarListadosMovimientos.add(jPanelCamposCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);
			
			
			
			
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
						//&& cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarlistadosmovimientosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarListadosMovimientos= new GridBagConstraints();
						this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
						this.jContentPaneDetalleCobrarListadosMovimientos.add(this.jTabbedPaneRelacionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarListadosMovimientos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarListadosMovimientos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
					this.gridBagConstraintsCobrarListadosMovimientos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarListadosMovimientos.add(jPanelCamposOcultosCobrarListadosMovimientos, gridBagConstraintsCobrarListadosMovimientos);
				
					this.jPanelCamposOcultosCobrarListadosMovimientos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	        this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarListadosMovimientos.add(this.jPanelAccionesFormularioCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);							
			
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
	        this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarListadosMovimientos.add(this.jPanelAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarListadosMovimientos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos=   new JScrollPane(this.jPanelCamposCobrarListadosMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadosMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
			this.gridBagConstraintsCobrarListadosMovimientos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarListadosMovimientos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarListadosMovimientos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);			
			
			this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
			
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		
			
		this.gridBagConstraintsCobrarListadosMovimientos = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadosMovimientos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadosMovimientos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarListadosMovimientos, this.gridBagConstraintsCobrarListadosMovimientos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarListadosMovimientos;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarListadosMovimientos;
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
