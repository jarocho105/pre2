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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.report.CobrarListadoVendedoresConstantesFunciones;

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
public class CobrarListadoVendedoresDetalleFormJInternalFrame extends CobrarListadoVendedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarListadoVendedores;
	
	protected JMenuBar jmenuBarDetalleCobrarListadoVendedores;
	
	protected JMenu jmenuDetalleCobrarListadoVendedores;
	protected JMenu jmenuDetalleArchivoCobrarListadoVendedores;
	protected JMenu jmenuDetalleAccionesCobrarListadoVendedores;
	protected JMenu jmenuDetalleDatosCobrarListadoVendedores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarListadoVendedores;	
	protected GridBagConstraints gridBagConstraintsCobrarListadoVendedores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarListadoVendedoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarListadoVendedores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public CobrarListadoVendedoresSessionBean cobrarlistadovendedoresSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public CobrarListadoVendedoresLogic cobrarlistadovendedoresLogic;
	
	public JScrollPane jScrollPanelDatosCobrarListadoVendedores;
	public JScrollPane jScrollPanelDatosEdicionCobrarListadoVendedores;
	public JScrollPane jScrollPanelDatosGeneralCobrarListadoVendedores;
	
	protected JPanel jPanelCamposCobrarListadoVendedores;    
	protected JPanel jPanelCamposOcultosCobrarListadoVendedores;    	
	protected JPanel jPanelAccionesCobrarListadoVendedores;
	protected JPanel jPanelAccionesFormularioCobrarListadoVendedores;
    
	
	
	protected Integer iXPanelCamposCobrarListadoVendedores=0;
	protected Integer iYPanelCamposCobrarListadoVendedores=0;
	
	protected Integer iXPanelCamposOcultosCobrarListadoVendedores=0;
	protected Integer iYPanelCamposOcultosCobrarListadoVendedores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarListadoVendedores;
	public JButton jButtonModificarCobrarListadoVendedores;
	public JButton jButtonActualizarCobrarListadoVendedores;
    public JButton jButtonEliminarCobrarListadoVendedores;
	public JButton jButtonCancelarCobrarListadoVendedores;
    public JButton jButtonGuardarCambiosCobrarListadoVendedores;
	public JButton jButtonGuardarCambiosTablaCobrarListadoVendedores;
	protected JButton jButtonCerrarCobrarListadoVendedores;
	
	
	protected JButton jButtonProcesarInformacionCobrarListadoVendedores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarListadoVendedores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarListadoVendedores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarListadoVendedores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarListadoVendedores;
	protected JButton jButtonModificarToolBarCobrarListadoVendedores;
	protected JButton jButtonActualizarToolBarCobrarListadoVendedores;
    protected JButton jButtonEliminarToolBarCobrarListadoVendedores;
	protected JButton jButtonCancelarToolBarCobrarListadoVendedores;
    protected JButton jButtonGuardarCambiosToolBarCobrarListadoVendedores;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarListadoVendedores;
	protected JButton jButtonCerrarToolBarCobrarListadoVendedores;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarListadoVendedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarListadoVendedores;
	protected JMenuItem jMenuItemModificarCobrarListadoVendedores;
	protected JMenuItem jMenuItemActualizarCobrarListadoVendedores;
    protected JMenuItem jMenuItemEliminarCobrarListadoVendedores;
	protected JMenuItem jMenuItemCancelarCobrarListadoVendedores;
    protected JMenuItem jMenuItemGuardarCambiosCobrarListadoVendedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarListadoVendedores;
	protected JMenuItem jMenuItemCerrarCobrarListadoVendedores;
	protected JMenuItem jMenuItemDetalleCerrarCobrarListadoVendedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarListadoVendedores;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarListadoVendedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarListadoVendedores;
	protected JMenuItem jMenuItemMostrarOcultarCobrarListadoVendedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarListadoVendedores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarListadoVendedores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarListadoVendedores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarListadoVendedores;
	public JLabel jLabelIdCobrarListadoVendedores;
	public JLabel jLabelidCobrarListadoVendedores;
	public JButton jButtonidCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorCobrarListadoVendedores;
	public JLabel jLabelnombre_vendedorCobrarListadoVendedores;
	public JTextArea jTextAreanombre_vendedorCobrarListadoVendedores;
	public JScrollPane jscrollPanenombre_vendedorCobrarListadoVendedores;
	public JButton jButtonnombre_vendedorCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarListadoVendedores;
	public JLabel jLabelcodigoCobrarListadoVendedores;
	public JTextField jTextFieldcodigoCobrarListadoVendedores;
	public JButton jButtoncodigoCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrarListadoVendedores;
	public JLabel jLabelnombreCobrarListadoVendedores;
	public JTextArea jTextAreanombreCobrarListadoVendedores;
	public JScrollPane jscrollPanenombreCobrarListadoVendedores;
	public JButton jButtonnombreCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPanelrucCobrarListadoVendedores;
	public JLabel jLabelrucCobrarListadoVendedores;
	public JTextField jTextFieldrucCobrarListadoVendedores;
	public JButton jButtonrucCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_domicilioCobrarListadoVendedores;
	public JLabel jLabeldireccion_domicilioCobrarListadoVendedores;
	public JTextArea jTextAreadireccion_domicilioCobrarListadoVendedores;
	public JScrollPane jscrollPanedireccion_domicilioCobrarListadoVendedores;
	public JButton jButtondireccion_domicilioCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoCobrarListadoVendedores;
	public JLabel jLabeltelefonoCobrarListadoVendedores;
	public JTextArea jTextAreatelefonoCobrarListadoVendedores;
	public JScrollPane jscrollPanetelefonoCobrarListadoVendedores;
	public JButton jButtontelefonoCobrarListadoVendedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarListadoVendedores;
	public JLabel jLabelid_empresaCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarListadoVendedores;
	public JButton jButtonid_empresaCobrarListadoVendedores= new JButtonMe();
	public JButton jButtonid_empresaCobrarListadoVendedoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCobrarListadoVendedores;
	public JLabel jLabelid_sucursalCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCobrarListadoVendedores;
	public JButton jButtonid_sucursalCobrarListadoVendedores= new JButtonMe();
	public JButton jButtonid_sucursalCobrarListadoVendedoresUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCobrarListadoVendedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorCobrarListadoVendedores;
	public JLabel jLabelid_vendedorCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorCobrarListadoVendedores;
	public JButton jButtonid_vendedorCobrarListadoVendedores= new JButtonMe();
	public JButton jButtonid_vendedorCobrarListadoVendedoresUpdate= new JButtonMe();
	public JButton jButtonid_vendedorCobrarListadoVendedoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarListadoVendedores;
	
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
	
	public CobrarListadoVendedoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarListadoVendedores=new JPanel();
				this.jPanelAccionesFormularioCobrarListadoVendedores=new JPanel();
				this.jmenuBarDetalleCobrarListadoVendedores=new JMenuBar();
				this.jTtoolBarDetalleCobrarListadoVendedores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarListadoVendedoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarListadoVendedores() {
		return this.jButtonActualizarToolBarCobrarListadoVendedores;
	}
	
	public JButton getjButtonEliminarToolBarCobrarListadoVendedores() {
		return this.jButtonEliminarToolBarCobrarListadoVendedores;
	}
	
	public JButton getjButtonCancelarToolBarCobrarListadoVendedores() {
		return this.jButtonCancelarToolBarCobrarListadoVendedores;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarListadoVendedores() {
		return this.jButtonProcesarInformacionCobrarListadoVendedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarListadoVendedores)	{
		this.jButtonProcesarInformacionCobrarListadoVendedores = jButtonProcesarInformacionCobrarListadoVendedores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarListadoVendedores() {
		return this.jComboBoxTiposAccionesCobrarListadoVendedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarListadoVendedores(
			JComboBox jComboBoxTiposRelacionesCobrarListadoVendedores) {
		this.jComboBoxTiposRelacionesCobrarListadoVendedores = jComboBoxTiposRelacionesCobrarListadoVendedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarListadoVendedores(
			JComboBox jComboBoxTiposAccionesCobrarListadoVendedores) {
		this.jComboBoxTiposAccionesCobrarListadoVendedores = jComboBoxTiposAccionesCobrarListadoVendedores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarListadoVendedores() {
		return this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarListadoVendedores(
			JComboBox jComboBoxTiposAccionesFormularioCobrarListadoVendedores) {
		this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores = jComboBoxTiposAccionesFormularioCobrarListadoVendedores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
		
		this.cobrarlistadovendedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarlistadovendedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarListadoVendedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarListadoVendedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarListadoVendedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Listado Vendedores MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarListadoVendedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarListadoVendedores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarListadoVendedores=new JButtonMe();
				this.jButtonModificarToolBarCobrarListadoVendedores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarListadoVendedores,this.jTtoolBarDetalleCobrarListadoVendedores,
							"actualizar","actualizar","Actualizar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarListadoVendedores,this.jTtoolBarDetalleCobrarListadoVendedores,
							"eliminar","eliminar","Eliminar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarListadoVendedores,this.jTtoolBarDetalleCobrarListadoVendedores,
							"cancelar","cancelar","Cancelar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarListadoVendedores,this.jTtoolBarDetalleCobrarListadoVendedores,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarListadoVendedores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarListadoVendedores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarListadoVendedores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarListadoVendedores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarListadoVendedores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarListadoVendedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarListadoVendedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarListadoVendedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarListadoVendedores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarListadoVendedores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarListadoVendedores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarListadoVendedores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarListadoVendedores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarListadoVendedores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarListadoVendedores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarListadoVendedores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarListadoVendedores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarListadoVendedores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarListadoVendedores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarListadoVendedores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarListadoVendedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarListadoVendedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarListadoVendedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarListadoVendedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarListadoVendedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarListadoVendedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarListadoVendedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarListadoVendedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarListadoVendedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarListadoVendedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarListadoVendedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarListadoVendedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarListadoVendedores.add(this.jMenuItemDetalleCerrarCobrarListadoVendedores);
		
		this.jmenuDetalleAccionesCobrarListadoVendedores.add(this.jMenuItemActualizarCobrarListadoVendedores);
		this.jmenuDetalleAccionesCobrarListadoVendedores.add(this.jMenuItemEliminarCobrarListadoVendedores);
		this.jmenuDetalleAccionesCobrarListadoVendedores.add(this.jMenuItemCancelarCobrarListadoVendedores);		
		
		//this.jmenuDetalleDatosCobrarListadoVendedores.add(this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores);				
		this.jmenuDetalleDatosCobrarListadoVendedores.add(this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores);				
				
		//this.jmenuDetalleAccionesCobrarListadoVendedores.add(this.jMenuItemGuardarCambiosCobrarListadoVendedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarListadoVendedores.add(this.jmenuDetalleArchivoCobrarListadoVendedores);		
		this.jmenuBarDetalleCobrarListadoVendedores.add(this.jmenuDetalleAccionesCobrarListadoVendedores);		
		this.jmenuBarDetalleCobrarListadoVendedores.add(this.jmenuDetalleDatosCobrarListadoVendedores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarListadoVendedores);				
	}
	
	
	public void inicializarElementosCamposCobrarListadoVendedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarListadoVendedores = new JLabelMe();
		jLabelIdCobrarListadoVendedores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarListadoVendedores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarListadoVendedores= new GridBagLayout();

		this.jPanelidCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);

		jLabelidCobrarListadoVendedores = new JLabel();
		jLabelidCobrarListadoVendedores.setText("Id");

		jLabelidCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_vendedorCobrarListadoVendedores = new JLabelMe();
		this.jLabelnombre_vendedorCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorCobrarListadoVendedores.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelnombre_vendedorCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jTextAreanombre_vendedorCobrarListadoVendedores= new JTextAreaMe();
		jTextAreanombre_vendedorCobrarListadoVendedores.setEnabled(false);
		jTextAreanombre_vendedorCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarListadoVendedores.setLineWrap(true);
		jTextAreanombre_vendedorCobrarListadoVendedores.setWrapStyleWord(true);
		jTextAreanombre_vendedorCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorCobrarListadoVendedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorCobrarListadoVendedores = new JScrollPane(jTextAreanombre_vendedorCobrarListadoVendedores);
		jscrollPanenombre_vendedorCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarListadoVendedores = new JLabelMe();
		this.jLabelcodigoCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarListadoVendedores.setToolTipText("Codigo");
		this.jLabelcodigoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelcodigoCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jTextFieldcodigoCobrarListadoVendedores= new JTextFieldMe();

		jTextFieldcodigoCobrarListadoVendedores.setEnabled(false);
		jTextFieldcodigoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtoncodigoCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarListadoVendedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrarListadoVendedores = new JLabelMe();
		this.jLabelnombreCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrarListadoVendedores.setToolTipText("Nombre");
		this.jLabelnombreCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelnombreCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jTextAreanombreCobrarListadoVendedores= new JTextAreaMe();
		jTextAreanombreCobrarListadoVendedores.setEnabled(false);
		jTextAreanombreCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarListadoVendedores.setLineWrap(true);
		jTextAreanombreCobrarListadoVendedores.setWrapStyleWord(true);
		jTextAreanombreCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCobrarListadoVendedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCobrarListadoVendedores = new JScrollPane(jTextAreanombreCobrarListadoVendedores);
		jscrollPanenombreCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtonnombreCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtonnombreCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobrarListadoVendedoresBusqueda.setVisible(false);		}


					
		this.jLabelrucCobrarListadoVendedores = new JLabelMe();
		this.jLabelrucCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucCobrarListadoVendedores.setToolTipText("Ruc");
		this.jLabelrucCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelrucCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jTextFieldrucCobrarListadoVendedores= new JTextFieldMe();

		jTextFieldrucCobrarListadoVendedores.setEnabled(false);
		jTextFieldrucCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtonrucCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtonrucCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucCobrarListadoVendedoresBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_domicilioCobrarListadoVendedores = new JLabelMe();
		this.jLabeldireccion_domicilioCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO+" : *");
		this.jLabeldireccion_domicilioCobrarListadoVendedores.setToolTipText("Direccion Domicilio");
		this.jLabeldireccion_domicilioCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_domicilioCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_domicilioCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_domicilioCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_domicilioCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_domicilioCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPaneldireccion_domicilioCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jTextAreadireccion_domicilioCobrarListadoVendedores= new JTextAreaMe();
		jTextAreadireccion_domicilioCobrarListadoVendedores.setEnabled(false);
		jTextAreadireccion_domicilioCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_domicilioCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_domicilioCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_domicilioCobrarListadoVendedores.setLineWrap(true);
		jTextAreadireccion_domicilioCobrarListadoVendedores.setWrapStyleWord(true);
		jTextAreadireccion_domicilioCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_domicilioCobrarListadoVendedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_domicilioCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_domicilioCobrarListadoVendedores = new JScrollPane(jTextAreadireccion_domicilioCobrarListadoVendedores);
		jscrollPanedireccion_domicilioCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_domicilioCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_domicilioCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_domicilioCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_domicilioCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_domicilioCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoCobrarListadoVendedores = new JLabelMe();
		this.jLabeltelefonoCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoCobrarListadoVendedores.setToolTipText("Telefono");
		this.jLabeltelefonoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPaneltelefonoCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jTextAreatelefonoCobrarListadoVendedores= new JTextAreaMe();
		jTextAreatelefonoCobrarListadoVendedores.setEnabled(false);
		jTextAreatelefonoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoCobrarListadoVendedores.setLineWrap(true);
		jTextAreatelefonoCobrarListadoVendedores.setWrapStyleWord(true);
		jTextAreatelefonoCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoCobrarListadoVendedores.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoCobrarListadoVendedores = new JScrollPane(jTextAreatelefonoCobrarListadoVendedores);
		jscrollPanetelefonoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtontelefonoCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtontelefonoCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoCobrarListadoVendedoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarListadoVendedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarListadoVendedores = new JLabelMe();
		this.jLabelid_empresaCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarListadoVendedores.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelid_empresaCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jComboBoxid_empresaCobrarListadoVendedores= new JComboBoxMe();
		jComboBoxid_empresaCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarListadoVendedores.setEnabled(false);

		this.jButtonid_empresaCobrarListadoVendedores= new JButtonMe();
		this.jButtonid_empresaCobrarListadoVendedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarListadoVendedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarListadoVendedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarListadoVendedores.setText("Buscar");
		this.jButtonid_empresaCobrarListadoVendedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarListadoVendedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarListadoVendedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarListadoVendedores"));

		this.jButtonid_empresaCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarListadoVendedoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarListadoVendedoresUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarListadoVendedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadoVendedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarListadoVendedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarListadoVendedoresUpdate.setText("U");
		this.jButtonid_empresaCobrarListadoVendedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarListadoVendedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarListadoVendedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarListadoVendedoresUpdate"));



					
		this.jLabelid_sucursalCobrarListadoVendedores = new JLabelMe();
		this.jLabelid_sucursalCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCobrarListadoVendedores.setToolTipText("Sucursal");
		this.jLabelid_sucursalCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelid_sucursalCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jComboBoxid_sucursalCobrarListadoVendedores= new JComboBoxMe();
		jComboBoxid_sucursalCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCobrarListadoVendedores.setEnabled(false);

		this.jButtonid_sucursalCobrarListadoVendedores= new JButtonMe();
		this.jButtonid_sucursalCobrarListadoVendedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarListadoVendedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarListadoVendedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCobrarListadoVendedores.setText("Buscar");
		this.jButtonid_sucursalCobrarListadoVendedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCobrarListadoVendedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarListadoVendedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarListadoVendedores"));

		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCobrarListadoVendedoresBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCobrarListadoVendedoresUpdate= new JButtonMe();
		this.jButtonid_sucursalCobrarListadoVendedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarListadoVendedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCobrarListadoVendedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCobrarListadoVendedoresUpdate.setText("U");
		this.jButtonid_sucursalCobrarListadoVendedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCobrarListadoVendedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCobrarListadoVendedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCobrarListadoVendedoresUpdate"));



					
		this.jLabelid_vendedorCobrarListadoVendedores = new JLabelMe();
		this.jLabelid_vendedorCobrarListadoVendedores.setText(""+CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorCobrarListadoVendedores.setToolTipText("Vendedor");
		this.jLabelid_vendedorCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorCobrarListadoVendedores.setToolTipText(CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		this.jPanelid_vendedorCobrarListadoVendedores.setLayout(this.gridaBagLayoutCobrarListadoVendedores);


		jComboBoxid_vendedorCobrarListadoVendedores= new JComboBoxMe();
		jComboBoxid_vendedorCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorCobrarListadoVendedores= new JButtonMe();
		this.jButtonid_vendedorCobrarListadoVendedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCobrarListadoVendedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCobrarListadoVendedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCobrarListadoVendedores.setText("Buscar");
		this.jButtonid_vendedorCobrarListadoVendedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorCobrarListadoVendedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCobrarListadoVendedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCobrarListadoVendedores"));

		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda= new JButtonMe();
		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setText("U");
		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCobrarListadoVendedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCobrarListadoVendedoresBusqueda"));

		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorCobrarListadoVendedoresBusqueda.setVisible(false);		}

		this.jButtonid_vendedorCobrarListadoVendedoresUpdate= new JButtonMe();
		this.jButtonid_vendedorCobrarListadoVendedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarListadoVendedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCobrarListadoVendedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorCobrarListadoVendedoresUpdate.setText("U");
		this.jButtonid_vendedorCobrarListadoVendedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorCobrarListadoVendedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCobrarListadoVendedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCobrarListadoVendedoresUpdate"));



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
		//this.jInternalFrameDetalleCobrarListadoVendedores = new CobrarListadoVendedoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Listado Vendedores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarListadoVendedores= new GridBagLayout();
		

		
		String sToolTipCobrarListadoVendedores="";
		sToolTipCobrarListadoVendedores=CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarListadoVendedores+="(Cartera.CobrarListadoVendedores)";
		}
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarListadoVendedores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarListadoVendedores = new JButtonMe();
		this.jButtonModificarCobrarListadoVendedores = new JButtonMe();
        this.jButtonActualizarCobrarListadoVendedores = new JButtonMe();
        this.jButtonEliminarCobrarListadoVendedores = new JButtonMe();
        this.jButtonCancelarCobrarListadoVendedores = new JButtonMe();
        this.jButtonGuardarCambiosCobrarListadoVendedores = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores = new JButtonMe();
		this.jButtonCerrarCobrarListadoVendedores = new JButtonMe();
		
		this.jScrollPanelDatosCobrarListadoVendedores = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarListadoVendedores = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarListadoVendedores = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Listado Vendedores";
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listado Vendedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarListadoVendedores.setName("jPanelCamposCobrarListadoVendedores"); 

		this.jPanelCamposOcultosCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarListadoVendedores.setName("jPanelCamposOcultosCobrarListadoVendedores"); 

        this.jPanelAccionesCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarListadoVendedores.setToolTipText("Acciones");
        this.jPanelAccionesCobrarListadoVendedores.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarListadoVendedores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarListadoVendedores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarListadoVendedores.setText("Nuevo");
		this.jButtonModificarCobrarListadoVendedores.setText("Editar");
        this.jButtonActualizarCobrarListadoVendedores.setText("Actualizar");
        this.jButtonEliminarCobrarListadoVendedores.setText("Eliminar");
        this.jButtonCancelarCobrarListadoVendedores.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarListadoVendedores.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.setText("Guardar");
		this.jButtonCerrarCobrarListadoVendedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarListadoVendedores,"nuevo_button","Nuevo",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarListadoVendedores,"modificar_button","Editar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarListadoVendedores,"actualizar_button","Actualizar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarListadoVendedores,"eliminar_button","Eliminar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarListadoVendedores,"cancelar_button","Cancelar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarListadoVendedores,"guardarcambios_button","Guardar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarListadoVendedores,"guardarcambiostabla_button","Guardar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarListadoVendedores,"cerrar_button","Salir",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarListadoVendedores.setToolTipText("Nuevo"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarListadoVendedores.setToolTipText("Editar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarListadoVendedores.setToolTipText("Actualizar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarListadoVendedores.setToolTipText("Eliminar)"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarListadoVendedores.setToolTipText("Cancelar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarListadoVendedores.setToolTipText("Guardar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.setToolTipText("Guardar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarListadoVendedores.setToolTipText("Salir"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarListadoVendedores";
		inputMap = this.jButtonNuevoCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarListadoVendedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarListadoVendedores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarListadoVendedores";
		inputMap = this.jButtonActualizarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarListadoVendedores"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarListadoVendedores";
		inputMap = this.jButtonEliminarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarListadoVendedores"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarListadoVendedores";
		inputMap = this.jButtonCancelarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarListadoVendedores"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarListadoVendedores";
		inputMap = this.jButtonCerrarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarListadoVendedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarListadoVendedores";
		inputMap = this.jButtonGuardarCambiosTablaCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarListadoVendedores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarListadoVendedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarListadoVendedores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarListadoVendedores.setToolTipText("Nuevo CobrarListadoVendedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarListadoVendedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarListadoVendedores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarListadoVendedores.setToolTipText("Sin Cerrar Ventana CobrarListadoVendedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarListadoVendedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarListadoVendedores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarListadoVendedores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarListadoVendedores.setText("Accion");
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarListadoVendedores = new JLabelMe();
		
		this.jLabelAccionesCobrarListadoVendedores.setText("Acciones");		
		this.jLabelAccionesCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarListadoVendedores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarListadoVendedores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarListadoVendedores=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarListadoVendedores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarListadoVendedores = new GridBagLayout();
		
		this.jPanelCamposCobrarListadoVendedores.setLayout(gridaBagLayoutCamposCobrarListadoVendedores);
		this.jPanelCamposOcultosCobrarListadoVendedores.setLayout(gridaBagLayoutCamposOcultosCobrarListadoVendedores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarListadoVendedores.add(jLabelIdCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarListadoVendedores.add(jLabelidCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarListadoVendedores.add(jLabelid_empresaCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarListadoVendedores.add(jButtonid_empresaCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 3;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarListadoVendedores.add(jButtonid_empresaCobrarListadoVendedoresUpdate, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarListadoVendedores.add(jComboBoxid_empresaCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCobrarListadoVendedores.add(jLabelid_sucursalCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarListadoVendedores.add(jButtonid_sucursalCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 3;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCobrarListadoVendedores.add(jButtonid_sucursalCobrarListadoVendedoresUpdate, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCobrarListadoVendedores.add(jComboBoxid_sucursalCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorCobrarListadoVendedores.add(jLabelid_vendedorCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCobrarListadoVendedores.add(jButtonid_vendedorCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 3;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCobrarListadoVendedores.add(jButtonid_vendedorCobrarListadoVendedoresUpdate, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorCobrarListadoVendedores.add(jComboBoxid_vendedorCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorCobrarListadoVendedores.add(jLabelnombre_vendedorCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorCobrarListadoVendedores.add(jButtonnombre_vendedorCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorCobrarListadoVendedores.add(jscrollPanenombre_vendedorCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarListadoVendedores.add(jLabelcodigoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarListadoVendedores.add(jButtoncodigoCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarListadoVendedores.add(jTextFieldcodigoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrarListadoVendedores.add(jLabelnombreCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrarListadoVendedores.add(jButtonnombreCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrarListadoVendedores.add(jscrollPanenombreCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucCobrarListadoVendedores.add(jLabelrucCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucCobrarListadoVendedores.add(jButtonrucCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucCobrarListadoVendedores.add(jTextFieldrucCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_domicilioCobrarListadoVendedores.add(jLabeldireccion_domicilioCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_domicilioCobrarListadoVendedores.add(jButtondireccion_domicilioCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_domicilioCobrarListadoVendedores.add(jscrollPanedireccion_domicilioCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoCobrarListadoVendedores.add(jLabeltelefonoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 2;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
		this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoCobrarListadoVendedores.add(jButtontelefonoCobrarListadoVendedoresBusqueda, this.gridBagConstraintsCobrarListadoVendedores);
	}

	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = 1;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoCobrarListadoVendedores.add(jscrollPanetelefonoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPanelidCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPanelid_vendedorCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPanelnombre_vendedorCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPanelcodigoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPanelnombreCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPanelrucCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPaneldireccion_domicilioCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarListadoVendedores.add(this.jPaneltelefonoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposCobrarListadoVendedores % 1==0) {
		iXPanelCamposCobrarListadoVendedores=0;
		iYPanelCamposCobrarListadoVendedores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposOcultosCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposOcultosCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarListadoVendedores.add(this.jPanelid_empresaCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposOcultosCobrarListadoVendedores % 1==0) {
		iXPanelCamposOcultosCobrarListadoVendedores=0;
		iYPanelCamposOcultosCobrarListadoVendedores++;
	}
	this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarListadoVendedores.gridy = iYPanelCamposOcultosCobrarListadoVendedores;
	this.gridBagConstraintsCobrarListadoVendedores.gridx = iXPanelCamposOcultosCobrarListadoVendedores++;
	this.gridBagConstraintsCobrarListadoVendedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarListadoVendedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarListadoVendedores.add(this.jPanelid_sucursalCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);



	if(iXPanelCamposOcultosCobrarListadoVendedores % 1==0) {
		iXPanelCamposOcultosCobrarListadoVendedores=0;
		iYPanelCamposOcultosCobrarListadoVendedores++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarListadoVendedores= new GridBagLayout();
		this.jPanelAccionesCobrarListadoVendedores.setLayout(gridaBagLayoutAccionesCobrarListadoVendedores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarListadoVendedores= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarListadoVendedores.setLayout(gridaBagLayoutAccionesFormularioCobrarListadoVendedores);
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarListadoVendedores.add(this.jComboBoxTiposAccionesFormularioCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarListadoVendedores.add(this.jButtonModificarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);							

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarListadoVendedores.add(this.jButtonEliminarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
			
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarListadoVendedores.add(this.jButtonActualizarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);


		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarListadoVendedores.add(this.jButtonGuardarCambiosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);	
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarListadoVendedores.add(this.jButtonCancelarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarListadoVendedores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();						
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;		
			//this.gridBagConstraintsCobrarListadoVendedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarListadoVendedores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarListadoVendedores.gridx =0;
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarListadoVendedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarListadoVendedores = new CobrarListadoVendedoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Listado Vendedores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Listado Vendedores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Listado Vendedores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarListadoVendedoresModel cobrarlistadovendedoresModel=new CobrarListadoVendedoresModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarListadoVendedoresModel.CobrarListadoVendedoresFocusTraversalPolicy cobrarlistadovendedoresFocusTraversalPolicy = cobrarlistadovendedoresModel.new CobrarListadoVendedoresFocusTraversalPolicy(this);
			
			//cobrarlistadovendedoresFocusTraversalPolicy.setcobrarlistadovendedoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarlistadovendedoresModel);
			
			
			this.jContentPaneDetalleCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarListadoVendedores = new GridBagLayout();	
			this.jContentPaneDetalleCobrarListadoVendedores.setLayout(gridaBagLayoutDetalleCobrarListadoVendedores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarListadoVendedores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
				this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarListadoVendedores.add(jTtoolBarDetalleCobrarListadoVendedores, gridBagConstraintsCobrarListadoVendedores);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarListadoVendedores=   new JScrollPane(jContentPaneDetalleCobrarListadoVendedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarListadoVendedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	        
			this.jContentPaneDetalleCobrarListadoVendedores.add(jPanelCamposCobrarListadoVendedores, gridBagConstraintsCobrarListadoVendedores);
			
			
			
			
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
						//&& cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarListadoVendedores= new GridBagConstraints();
						this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
						this.jContentPaneDetalleCobrarListadoVendedores.add(this.jTabbedPaneRelacionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarListadoVendedores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarListadoVendedores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
					this.gridBagConstraintsCobrarListadoVendedores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarListadoVendedores.add(jPanelCamposOcultosCobrarListadoVendedores, gridBagConstraintsCobrarListadoVendedores);
				
					this.jPanelCamposOcultosCobrarListadoVendedores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	        this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarListadoVendedores.add(this.jPanelAccionesFormularioCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);							
			
			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
	        this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarListadoVendedores.add(this.jPanelAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarListadoVendedores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarListadoVendedores=   new JScrollPane(this.jPanelCamposCobrarListadoVendedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarListadoVendedores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			
			
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
			
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarListadoVendedores;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarListadoVendedores;
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
