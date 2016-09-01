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
import com.bydan.erp.cartera.util.report.CobrarMorosidadClientesDetalladosConstantesFunciones;

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
public class CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame extends CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarMorosidadClientesDetallados;
	
	protected JMenuBar jmenuBarDetalleCobrarMorosidadClientesDetallados;
	
	protected JMenu jmenuDetalleCobrarMorosidadClientesDetallados;
	protected JMenu jmenuDetalleArchivoCobrarMorosidadClientesDetallados;
	protected JMenu jmenuDetalleAccionesCobrarMorosidadClientesDetallados;
	protected JMenu jmenuDetalleDatosCobrarMorosidadClientesDetallados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarMorosidadClientesDetallados;	
	protected GridBagConstraints gridBagConstraintsCobrarMorosidadClientesDetallados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarMorosidadClientesDetallados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarMorosidadClientesDetalladosSessionBean cobrarmorosidadclientesdetalladosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CobrarMorosidadClientesDetalladosLogic cobrarmorosidadclientesdetalladosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarMorosidadClientesDetallados;
	public JScrollPane jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados;
	public JScrollPane jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados;
	
	protected JPanel jPanelCamposCobrarMorosidadClientesDetallados;    
	protected JPanel jPanelCamposOcultosCobrarMorosidadClientesDetallados;    	
	protected JPanel jPanelAccionesCobrarMorosidadClientesDetallados;
	protected JPanel jPanelAccionesFormularioCobrarMorosidadClientesDetallados;
    
	
	
	protected Integer iXPanelCamposCobrarMorosidadClientesDetallados=0;
	protected Integer iYPanelCamposCobrarMorosidadClientesDetallados=0;
	
	protected Integer iXPanelCamposOcultosCobrarMorosidadClientesDetallados=0;
	protected Integer iYPanelCamposOcultosCobrarMorosidadClientesDetallados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarMorosidadClientesDetallados;
	public JButton jButtonModificarCobrarMorosidadClientesDetallados;
	public JButton jButtonActualizarCobrarMorosidadClientesDetallados;
    public JButton jButtonEliminarCobrarMorosidadClientesDetallados;
	public JButton jButtonCancelarCobrarMorosidadClientesDetallados;
    public JButton jButtonGuardarCambiosCobrarMorosidadClientesDetallados;
	public JButton jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados;
	protected JButton jButtonCerrarCobrarMorosidadClientesDetallados;
	
	
	protected JButton jButtonProcesarInformacionCobrarMorosidadClientesDetallados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonModificarToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonActualizarToolBarCobrarMorosidadClientesDetallados;
    protected JButton jButtonEliminarToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonCancelarToolBarCobrarMorosidadClientesDetallados;
    protected JButton jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonCerrarToolBarCobrarMorosidadClientesDetallados;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarMorosidadClientesDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemModificarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemActualizarCobrarMorosidadClientesDetallados;
    protected JMenuItem jMenuItemEliminarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemCancelarCobrarMorosidadClientesDetallados;
    protected JMenuItem jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemCerrarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarMorosidadClientesDetallados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarMorosidadClientesDetallados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarMorosidadClientesDetallados;
	public JLabel jLabelIdCobrarMorosidadClientesDetallados;
	public JLabel jLabelidCobrarMorosidadClientesDetallados;
	public JButton jButtonidCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceCobrarMorosidadClientesDetallados;
	public JLabel jLabelfecha_venceCobrarMorosidadClientesDetallados;
	//public JFormattedTextField jDateChooserfecha_venceCobrarMorosidadClientesDetallados;

	public JDateChooser jDateChooserfecha_venceCobrarMorosidadClientesDetallados;
	public JButton jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarMorosidadClientesDetallados;
	public JLabel jLabelcodigoCobrarMorosidadClientesDetallados;
	public JTextField jTextFieldcodigoCobrarMorosidadClientesDetallados;
	public JButton jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarMorosidadClientesDetallados;
	public JLabel jLabelnombre_completoCobrarMorosidadClientesDetallados;
	public JTextArea jTextAreanombre_completoCobrarMorosidadClientesDetallados;
	public JScrollPane jscrollPanenombre_completoCobrarMorosidadClientesDetallados;
	public JButton jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados;
	public JLabel jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados;
	public JTextField jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados;
	public JButton jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_vencidoCobrarMorosidadClientesDetallados;
	public JLabel jLabelsaldo_vencidoCobrarMorosidadClientesDetallados;
	public JTextField jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados;
	public JButton jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_vencerCobrarMorosidadClientesDetallados;
	public JLabel jLabelsaldo_vencerCobrarMorosidadClientesDetallados;
	public JTextField jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados;
	public JButton jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarMorosidadClientesDetallados;
	public JLabel jLabelid_empresaCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarMorosidadClientesDetallados;
	public JButton jButtonid_empresaCobrarMorosidadClientesDetallados= new JButtonMe();
	public JButton jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarMorosidadClientesDetallados;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarMorosidadClientesDetallados=new JPanel();
				this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados=new JPanel();
				this.jmenuBarDetalleCobrarMorosidadClientesDetallados=new JMenuBar();
				this.jTtoolBarDetalleCobrarMorosidadClientesDetallados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarMorosidadClientesDetallados() {
		return this.jButtonActualizarToolBarCobrarMorosidadClientesDetallados;
	}
	
	public JButton getjButtonEliminarToolBarCobrarMorosidadClientesDetallados() {
		return this.jButtonEliminarToolBarCobrarMorosidadClientesDetallados;
	}
	
	public JButton getjButtonCancelarToolBarCobrarMorosidadClientesDetallados() {
		return this.jButtonCancelarToolBarCobrarMorosidadClientesDetallados;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarMorosidadClientesDetallados() {
		return this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarMorosidadClientesDetallados)	{
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados = jButtonProcesarInformacionCobrarMorosidadClientesDetallados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados = jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposAccionesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados = jComboBoxTiposAccionesCobrarMorosidadClientesDetallados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados = jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean();
		
		this.cobrarmorosidadclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarmorosidadclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarMorosidadClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarMorosidadClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarMorosidadClientesDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Morosidad Clientes Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarMorosidadClientesDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarMorosidadClientesDetallados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarMorosidadClientesDetallados=new JButtonMe();
				this.jButtonModificarToolBarCobrarMorosidadClientesDetallados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarDetalleCobrarMorosidadClientesDetallados,
							"actualizar","actualizar","Actualizar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarDetalleCobrarMorosidadClientesDetallados,
							"eliminar","eliminar","Eliminar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarDetalleCobrarMorosidadClientesDetallados,
							"cancelar","cancelar","Cancelar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarDetalleCobrarMorosidadClientesDetallados,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarMorosidadClientesDetallados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarMorosidadClientesDetallados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarMorosidadClientesDetallados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarMorosidadClientesDetallados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarMorosidadClientesDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarMorosidadClientesDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarMorosidadClientesDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarMorosidadClientesDetallados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarMorosidadClientesDetallados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarMorosidadClientesDetallados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarMorosidadClientesDetallados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarMorosidadClientesDetallados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarMorosidadClientesDetallados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarMorosidadClientesDetallados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarMorosidadClientesDetallados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarMorosidadClientesDetallados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarMorosidadClientesDetallados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarMorosidadClientesDetallados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarMorosidadClientesDetallados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarMorosidadClientesDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarMorosidadClientesDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarMorosidadClientesDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarMorosidadClientesDetallados.add(this.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados);
		
		this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemActualizarCobrarMorosidadClientesDetallados);
		this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemEliminarCobrarMorosidadClientesDetallados);
		this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemCancelarCobrarMorosidadClientesDetallados);		
		
		//this.jmenuDetalleDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados);				
		this.jmenuDetalleDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados);				
				
		//this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarMorosidadClientesDetallados.add(this.jmenuDetalleArchivoCobrarMorosidadClientesDetallados);		
		this.jmenuBarDetalleCobrarMorosidadClientesDetallados.add(this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados);		
		this.jmenuBarDetalleCobrarMorosidadClientesDetallados.add(this.jmenuDetalleDatosCobrarMorosidadClientesDetallados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarMorosidadClientesDetallados);				
	}
	
	
	public void inicializarElementosCamposCobrarMorosidadClientesDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarMorosidadClientesDetallados = new JLabelMe();
		jLabelIdCobrarMorosidadClientesDetallados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarMorosidadClientesDetallados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados= new GridBagLayout();

		this.jPanelidCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);

		jLabelidCobrarMorosidadClientesDetallados = new JLabel();
		jLabelidCobrarMorosidadClientesDetallados.setText("Id");

		jLabelidCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_venceCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelfecha_venceCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceCobrarMorosidadClientesDetallados.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelfecha_venceCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		//jFormattedTextFieldfecha_venceCobrarMorosidadClientesDetallados= new JFormattedTextFieldMe();

		jDateChooserfecha_venceCobrarMorosidadClientesDetallados= new JDateChooser();
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setEnabled(false);
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setDate(new Date());
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceCobrarMorosidadClientesDetallados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelcodigoCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarMorosidadClientesDetallados.setToolTipText("Codigo");
		this.jLabelcodigoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelcodigoCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		jTextFieldcodigoCobrarMorosidadClientesDetallados= new JTextFieldMe();

		jTextFieldcodigoCobrarMorosidadClientesDetallados.setEnabled(false);
		jTextFieldcodigoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelnombre_completoCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarMorosidadClientesDetallados.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelnombre_completoCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		jTextAreanombre_completoCobrarMorosidadClientesDetallados= new JTextAreaMe();
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setEnabled(false);
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setLineWrap(true);
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarMorosidadClientesDetallados = new JScrollPane(jTextAreanombre_completoCobrarMorosidadClientesDetallados);
		jscrollPanenombre_completoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO+" : *");
		this.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados.setToolTipText("Saldo Venco");
		this.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_vencidoCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados= new JTextFieldMe();
		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setEnabled(false);
		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setText("0.0");

		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_vencidoCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_vencerCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelsaldo_vencerCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER+" : *");
		this.jLabelsaldo_vencerCobrarMorosidadClientesDetallados.setToolTipText("Saldo Vencer");
		this.jLabelsaldo_vencerCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_vencerCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_vencerCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_vencerCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados= new JTextFieldMe();
		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setEnabled(false);
		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setText("0.0");

		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_vencerCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarMorosidadClientesDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarMorosidadClientesDetallados = new JLabelMe();
		this.jLabelid_empresaCobrarMorosidadClientesDetallados.setText(""+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarMorosidadClientesDetallados.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarMorosidadClientesDetallados.setToolTipText(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		this.jPanelid_empresaCobrarMorosidadClientesDetallados.setLayout(this.gridaBagLayoutCobrarMorosidadClientesDetallados);


		jComboBoxid_empresaCobrarMorosidadClientesDetallados= new JComboBoxMe();
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.setEnabled(false);

		this.jButtonid_empresaCobrarMorosidadClientesDetallados= new JButtonMe();
		this.jButtonid_empresaCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarMorosidadClientesDetallados.setText("Buscar");
		this.jButtonid_empresaCobrarMorosidadClientesDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarMorosidadClientesDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarMorosidadClientesDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarMorosidadClientesDetallados"));

		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setText("U");
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarMorosidadClientesDetalladosBusqueda"));

		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.setText("U");
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarMorosidadClientesDetalladosUpdate"));



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
		//this.jInternalFrameDetalleCobrarMorosidadClientesDetallados = new CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Morosidad Clientes Detallados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarMorosidadClientesDetallados= new GridBagLayout();
		

		
		String sToolTipCobrarMorosidadClientesDetallados="";
		sToolTipCobrarMorosidadClientesDetallados=CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarMorosidadClientesDetallados+="(Cartera.CobrarMorosidadClientesDetallados)";
		}
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarMorosidadClientesDetallados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonModificarCobrarMorosidadClientesDetallados = new JButtonMe();
        this.jButtonActualizarCobrarMorosidadClientesDetallados = new JButtonMe();
        this.jButtonEliminarCobrarMorosidadClientesDetallados = new JButtonMe();
        this.jButtonCancelarCobrarMorosidadClientesDetallados = new JButtonMe();
        this.jButtonGuardarCambiosCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonCerrarCobrarMorosidadClientesDetallados = new JButtonMe();
		
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Morosidad Clientes Detallados";
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Morosidad Clientes Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarMorosidadClientesDetallados.setName("jPanelCamposCobrarMorosidadClientesDetallados"); 

		this.jPanelCamposOcultosCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarMorosidadClientesDetallados.setName("jPanelCamposOcultosCobrarMorosidadClientesDetallados"); 

        this.jPanelAccionesCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarMorosidadClientesDetallados.setToolTipText("Acciones");
        this.jPanelAccionesCobrarMorosidadClientesDetallados.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarMorosidadClientesDetallados.setText("Nuevo");
		this.jButtonModificarCobrarMorosidadClientesDetallados.setText("Editar");
        this.jButtonActualizarCobrarMorosidadClientesDetallados.setText("Actualizar");
        this.jButtonEliminarCobrarMorosidadClientesDetallados.setText("Eliminar");
        this.jButtonCancelarCobrarMorosidadClientesDetallados.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.setText("Guardar");
		this.jButtonCerrarCobrarMorosidadClientesDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarMorosidadClientesDetallados,"nuevo_button","Nuevo",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarMorosidadClientesDetallados,"modificar_button","Editar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarMorosidadClientesDetallados,"actualizar_button","Actualizar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarMorosidadClientesDetallados,"eliminar_button","Eliminar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarMorosidadClientesDetallados,"cancelar_button","Cancelar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarMorosidadClientesDetallados,"guardarcambios_button","Guardar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados,"guardarcambiostabla_button","Guardar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarMorosidadClientesDetallados,"cerrar_button","Salir",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarMorosidadClientesDetallados.setToolTipText("Nuevo"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarMorosidadClientesDetallados.setToolTipText("Editar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarMorosidadClientesDetallados.setToolTipText("Actualizar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarMorosidadClientesDetallados.setToolTipText("Eliminar)"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarMorosidadClientesDetallados.setToolTipText("Cancelar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.setToolTipText("Guardar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.setToolTipText("Guardar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarMorosidadClientesDetallados.setToolTipText("Salir"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonNuevoCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarMorosidadClientesDetallados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonActualizarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarMorosidadClientesDetallados"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonEliminarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarMorosidadClientesDetallados"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonCancelarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarMorosidadClientesDetallados"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonCerrarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarMorosidadClientesDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarMorosidadClientesDetallados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados.setToolTipText("Nuevo CobrarMorosidadClientesDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados.setToolTipText("Sin Cerrar Ventana CobrarMorosidadClientesDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setText("Accion");
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarMorosidadClientesDetallados = new JLabelMe();
		
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setText("Acciones");		
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarMorosidadClientesDetallados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarMorosidadClientesDetallados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarMorosidadClientesDetallados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarMorosidadClientesDetallados = new GridBagLayout();
		
		this.jPanelCamposCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutCamposCobrarMorosidadClientesDetallados);
		this.jPanelCamposOcultosCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutCamposOcultosCobrarMorosidadClientesDetallados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarMorosidadClientesDetallados.add(jLabelIdCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarMorosidadClientesDetallados.add(jLabelidCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarMorosidadClientesDetallados.add(jLabelid_empresaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarMorosidadClientesDetallados.add(jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 3;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarMorosidadClientesDetallados.add(jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarMorosidadClientesDetallados.add(jComboBoxid_empresaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceCobrarMorosidadClientesDetallados.add(jLabelfecha_venceCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceCobrarMorosidadClientesDetallados.add(jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceCobrarMorosidadClientesDetallados.add(jDateChooserfecha_venceCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarMorosidadClientesDetallados.add(jLabelcodigoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarMorosidadClientesDetallados.add(jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarMorosidadClientesDetallados.add(jTextFieldcodigoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarMorosidadClientesDetallados.add(jLabelnombre_completoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarMorosidadClientesDetallados.add(jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarMorosidadClientesDetallados.add(jscrollPanenombre_completoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.add(jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.add(jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.add(jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados.add(jLabelsaldo_vencidoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados.add(jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados.add(jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados.add(jLabelsaldo_vencerCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados.add(jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	}

	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados.add(jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelidCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelfecha_venceCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelcodigoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelnombre_completoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarMorosidadClientesDetallados.add(this.jPanelsaldo_vencerCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposCobrarMorosidadClientesDetallados=0;
		iYPanelCamposCobrarMorosidadClientesDetallados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iYPanelCamposOcultosCobrarMorosidadClientesDetallados;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iXPanelCamposOcultosCobrarMorosidadClientesDetallados++;
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarMorosidadClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarMorosidadClientesDetallados.add(this.jPanelid_empresaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);



	if(iXPanelCamposOcultosCobrarMorosidadClientesDetallados % 1==0) {
		iXPanelCamposOcultosCobrarMorosidadClientesDetallados=0;
		iYPanelCamposOcultosCobrarMorosidadClientesDetallados++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarMorosidadClientesDetallados= new GridBagLayout();
		this.jPanelAccionesCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutAccionesCobrarMorosidadClientesDetallados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarMorosidadClientesDetallados= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutAccionesFormularioCobrarMorosidadClientesDetallados);
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarMorosidadClientesDetallados.add(this.jButtonModificarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);							

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarMorosidadClientesDetallados.add(this.jButtonEliminarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarMorosidadClientesDetallados.add(this.jButtonActualizarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarMorosidadClientesDetallados.add(this.jButtonGuardarCambiosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);	
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarMorosidadClientesDetallados.add(this.jButtonCancelarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarMorosidadClientesDetallados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();						
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;		
			//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarMorosidadClientesDetallados = new CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Morosidad Clientes Detallados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Morosidad Clientes Detallados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Morosidad Clientes Detallados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarMorosidadClientesDetalladosModel cobrarmorosidadclientesdetalladosModel=new CobrarMorosidadClientesDetalladosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarMorosidadClientesDetalladosModel.CobrarMorosidadClientesDetalladosFocusTraversalPolicy cobrarmorosidadclientesdetalladosFocusTraversalPolicy = cobrarmorosidadclientesdetalladosModel.new CobrarMorosidadClientesDetalladosFocusTraversalPolicy(this);
			
			//cobrarmorosidadclientesdetalladosFocusTraversalPolicy.setcobrarmorosidadclientesdetalladosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarmorosidadclientesdetalladosModel);
			
			
			this.jContentPaneDetalleCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarMorosidadClientesDetallados = new GridBagLayout();	
			this.jContentPaneDetalleCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutDetalleCobrarMorosidadClientesDetallados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarMorosidadClientesDetallados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarMorosidadClientesDetallados.add(jTtoolBarDetalleCobrarMorosidadClientesDetallados, gridBagConstraintsCobrarMorosidadClientesDetallados);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados=   new JScrollPane(jContentPaneDetalleCobrarMorosidadClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	        
			this.jContentPaneDetalleCobrarMorosidadClientesDetallados.add(jPanelCamposCobrarMorosidadClientesDetallados, gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			
			
			
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
						//&& cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarMorosidadClientesDetallados= new GridBagConstraints();
						this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
						this.jContentPaneDetalleCobrarMorosidadClientesDetallados.add(this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarMorosidadClientesDetallados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
					this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarMorosidadClientesDetallados.add(jPanelCamposOcultosCobrarMorosidadClientesDetallados, gridBagConstraintsCobrarMorosidadClientesDetallados);
				
					this.jPanelCamposOcultosCobrarMorosidadClientesDetallados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	        this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarMorosidadClientesDetallados.add(this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);							
			
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
	        this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarMorosidadClientesDetallados.add(this.jPanelAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados=   new JScrollPane(this.jPanelCamposCobrarMorosidadClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados;
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
