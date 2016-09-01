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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProcesoPedidosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProcesoPedidosDetalleFormJInternalFrame extends ProcesoPedidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoPedidos;
	
	protected JMenuBar jmenuBarDetalleProcesoPedidos;
	
	protected JMenu jmenuDetalleProcesoPedidos;
	protected JMenu jmenuDetalleArchivoProcesoPedidos;
	protected JMenu jmenuDetalleAccionesProcesoPedidos;
	protected JMenu jmenuDetalleDatosProcesoPedidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoPedidos;	
	protected GridBagConstraints gridBagConstraintsProcesoPedidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoPedidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoPedidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public ProcesoPedidosSessionBean procesopedidosSessionBean;
	
	
	
	
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public ProcesoPedidosLogic procesopedidosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoPedidos;
	public JScrollPane jScrollPanelDatosEdicionProcesoPedidos;
	public JScrollPane jScrollPanelDatosGeneralProcesoPedidos;
	
	protected JPanel jPanelCamposProcesoPedidos;    
	protected JPanel jPanelCamposOcultosProcesoPedidos;    	
	protected JPanel jPanelAccionesProcesoPedidos;
	protected JPanel jPanelAccionesFormularioProcesoPedidos;
    
	
	
	protected Integer iXPanelCamposProcesoPedidos=0;
	protected Integer iYPanelCamposProcesoPedidos=0;
	
	protected Integer iXPanelCamposOcultosProcesoPedidos=0;
	protected Integer iYPanelCamposOcultosProcesoPedidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoPedidos;
	public JButton jButtonModificarProcesoPedidos;
	public JButton jButtonActualizarProcesoPedidos;
    public JButton jButtonEliminarProcesoPedidos;
	public JButton jButtonCancelarProcesoPedidos;
    public JButton jButtonGuardarCambiosProcesoPedidos;
	public JButton jButtonGuardarCambiosTablaProcesoPedidos;
	protected JButton jButtonCerrarProcesoPedidos;
	
	
	protected JButton jButtonProcesarInformacionProcesoPedidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoPedidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoPedidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoPedidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoPedidos;
	protected JButton jButtonModificarToolBarProcesoPedidos;
	protected JButton jButtonActualizarToolBarProcesoPedidos;
    protected JButton jButtonEliminarToolBarProcesoPedidos;
	protected JButton jButtonCancelarToolBarProcesoPedidos;
    protected JButton jButtonGuardarCambiosToolBarProcesoPedidos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoPedidos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoPedidos;
	protected JButton jButtonCerrarToolBarProcesoPedidos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoPedidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoPedidos;
	protected JMenuItem jMenuItemModificarProcesoPedidos;
	protected JMenuItem jMenuItemActualizarProcesoPedidos;
    protected JMenuItem jMenuItemEliminarProcesoPedidos;
	protected JMenuItem jMenuItemCancelarProcesoPedidos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoPedidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoPedidos;
	protected JMenuItem jMenuItemCerrarProcesoPedidos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoPedidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoPedidos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoPedidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoPedidos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoPedidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoPedidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoPedidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoPedidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoPedidos;
	public JLabel jLabelIdProcesoPedidos;
	public JLabel jLabelidProcesoPedidos;
	public JButton jButtonidProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_provinciaProcesoPedidos;
	public JLabel jLabelnombre_provinciaProcesoPedidos;
	public JTextArea jTextAreanombre_provinciaProcesoPedidos;
	public JScrollPane jscrollPanenombre_provinciaProcesoPedidos;
	public JButton jButtonnombre_provinciaProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadProcesoPedidos;
	public JLabel jLabelnombre_ciudadProcesoPedidos;
	public JTextArea jTextAreanombre_ciudadProcesoPedidos;
	public JScrollPane jscrollPanenombre_ciudadProcesoPedidos;
	public JButton jButtonnombre_ciudadProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaProcesoPedidos;
	public JLabel jLabelnombre_zonaProcesoPedidos;
	public JTextField jTextFieldnombre_zonaProcesoPedidos;
	public JButton jButtonnombre_zonaProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteProcesoPedidos;
	public JLabel jLabelnombre_grupo_clienteProcesoPedidos;
	public JTextArea jTextAreanombre_grupo_clienteProcesoPedidos;
	public JScrollPane jscrollPanenombre_grupo_clienteProcesoPedidos;
	public JButton jButtonnombre_grupo_clienteProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorProcesoPedidos;
	public JLabel jLabelnombre_vendedorProcesoPedidos;
	public JTextArea jTextAreanombre_vendedorProcesoPedidos;
	public JScrollPane jscrollPanenombre_vendedorProcesoPedidos;
	public JButton jButtonnombre_vendedorProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoPedidos;
	public JLabel jLabelcodigoProcesoPedidos;
	public JTextField jTextFieldcodigoProcesoPedidos;
	public JButton jButtoncodigoProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoProcesoPedidos;
	public JLabel jLabelnombre_completoProcesoPedidos;
	public JTextArea jTextAreanombre_completoProcesoPedidos;
	public JScrollPane jscrollPanenombre_completoProcesoPedidos;
	public JButton jButtonnombre_completoProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnumeroProcesoPedidos;
	public JLabel jLabelnumeroProcesoPedidos;
	public JTextField jTextFieldnumeroProcesoPedidos;
	public JButton jButtonnumeroProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionProcesoPedidos;
	public JLabel jLabelnumero_autorizacionProcesoPedidos;
	public JTextField jTextFieldnumero_autorizacionProcesoPedidos;
	public JButton jButtonnumero_autorizacionProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPaneltotalProcesoPedidos;
	public JLabel jLabeltotalProcesoPedidos;
	public JTextField jTextFieldtotalProcesoPedidos;
	public JButton jButtontotalProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionProcesoPedidos;
	public JLabel jLabelfecha_emisionProcesoPedidos;
	//public JFormattedTextField jDateChooserfecha_emisionProcesoPedidos;

	public JDateChooser jDateChooserfecha_emisionProcesoPedidos;
	public JButton jButtonfecha_emisionProcesoPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadProcesoPedidos;
	public JLabel jLabelid_ciudadProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadProcesoPedidos;
	public JButton jButtonid_ciudadProcesoPedidos= new JButtonMe();
	public JButton jButtonid_ciudadProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaProcesoPedidos;
	public JLabel jLabelid_zonaProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaProcesoPedidos;
	public JButton jButtonid_zonaProcesoPedidos= new JButtonMe();
	public JButton jButtonid_zonaProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_zonaProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteProcesoPedidos;
	public JLabel jLabelid_grupo_clienteProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteProcesoPedidos;
	public JButton jButtonid_grupo_clienteProcesoPedidos= new JButtonMe();
	public JButton jButtonid_grupo_clienteProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteProcesoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorProcesoPedidos;
	public JLabel jLabelid_vendedorProcesoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorProcesoPedidos;
	public JButton jButtonid_vendedorProcesoPedidos= new JButtonMe();
	public JButton jButtonid_vendedorProcesoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorProcesoPedidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoPedidos;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoPedidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoPedidos=new JPanel();
				this.jPanelAccionesFormularioProcesoPedidos=new JPanel();
				this.jmenuBarDetalleProcesoPedidos=new JMenuBar();
				this.jTtoolBarDetalleProcesoPedidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoPedidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoPedidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoPedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoPedidos() {
		return this.jButtonActualizarToolBarProcesoPedidos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoPedidos() {
		return this.jButtonEliminarToolBarProcesoPedidos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoPedidos() {
		return this.jButtonCancelarToolBarProcesoPedidos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoPedidos() {
		return this.jButtonProcesarInformacionProcesoPedidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoPedidos)	{
		this.jButtonProcesarInformacionProcesoPedidos = jButtonProcesarInformacionProcesoPedidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoPedidos() {
		return this.jComboBoxTiposAccionesProcesoPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoPedidos(
			JComboBox jComboBoxTiposRelacionesProcesoPedidos) {
		this.jComboBoxTiposRelacionesProcesoPedidos = jComboBoxTiposRelacionesProcesoPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoPedidos(
			JComboBox jComboBoxTiposAccionesProcesoPedidos) {
		this.jComboBoxTiposAccionesProcesoPedidos = jComboBoxTiposAccionesProcesoPedidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoPedidos() {
		return this.jComboBoxTiposAccionesFormularioProcesoPedidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoPedidos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoPedidos) {
		this.jComboBoxTiposAccionesFormularioProcesoPedidos = jComboBoxTiposAccionesFormularioProcesoPedidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
		
		this.procesopedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesopedidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoPedidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoPedidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoPedidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Pedidos MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoPedidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoPedidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoPedidos=new JButtonMe();
				this.jButtonModificarToolBarProcesoPedidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoPedidos,this.jTtoolBarDetalleProcesoPedidos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoPedidos,this.jTtoolBarDetalleProcesoPedidos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoPedidos,this.jTtoolBarDetalleProcesoPedidos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoPedidos,this.jTtoolBarDetalleProcesoPedidos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoPedidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoPedidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoPedidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoPedidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoPedidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoPedidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoPedidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoPedidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoPedidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoPedidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoPedidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoPedidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoPedidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoPedidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoPedidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoPedidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoPedidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoPedidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoPedidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoPedidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoPedidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoPedidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoPedidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoPedidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoPedidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoPedidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoPedidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoPedidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoPedidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoPedidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoPedidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoPedidos.add(this.jMenuItemDetalleCerrarProcesoPedidos);
		
		this.jmenuDetalleAccionesProcesoPedidos.add(this.jMenuItemActualizarProcesoPedidos);
		this.jmenuDetalleAccionesProcesoPedidos.add(this.jMenuItemEliminarProcesoPedidos);
		this.jmenuDetalleAccionesProcesoPedidos.add(this.jMenuItemCancelarProcesoPedidos);		
		
		//this.jmenuDetalleDatosProcesoPedidos.add(this.jMenuItemDetalleAbrirOrderByProcesoPedidos);				
		this.jmenuDetalleDatosProcesoPedidos.add(this.jMenuItemDetalleMostarOcultarProcesoPedidos);				
				
		//this.jmenuDetalleAccionesProcesoPedidos.add(this.jMenuItemGuardarCambiosProcesoPedidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoPedidos.add(this.jmenuDetalleArchivoProcesoPedidos);		
		this.jmenuBarDetalleProcesoPedidos.add(this.jmenuDetalleAccionesProcesoPedidos);		
		this.jmenuBarDetalleProcesoPedidos.add(this.jmenuDetalleDatosProcesoPedidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoPedidos);				
	}
	
	
	public void inicializarElementosCamposProcesoPedidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoPedidos = new JLabelMe();
		jLabelIdProcesoPedidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoPedidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoPedidos= new GridBagLayout();

		this.jPanelidProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);

		jLabelidProcesoPedidos = new JLabel();
		jLabelidProcesoPedidos.setText("Id");

		jLabelidProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_provinciaProcesoPedidos = new JLabelMe();
		this.jLabelnombre_provinciaProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA+" : *");
		this.jLabelnombre_provinciaProcesoPedidos.setToolTipText("Nombre Provincia");
		this.jLabelnombre_provinciaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_provinciaProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_provinciaProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_provinciaProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnombre_provinciaProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextAreanombre_provinciaProcesoPedidos= new JTextAreaMe();
		jTextAreanombre_provinciaProcesoPedidos.setEnabled(false);
		jTextAreanombre_provinciaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoPedidos.setLineWrap(true);
		jTextAreanombre_provinciaProcesoPedidos.setWrapStyleWord(true);
		jTextAreanombre_provinciaProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_provinciaProcesoPedidos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_provinciaProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_provinciaProcesoPedidos = new JScrollPane(jTextAreanombre_provinciaProcesoPedidos);
		jscrollPanenombre_provinciaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_provinciaProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_provinciaProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_provinciaProcesoPedidosBusqueda.setText("U");
		this.jButtonnombre_provinciaProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_provinciaProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_provinciaProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_provinciaProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_provinciaProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_provinciaProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_provinciaProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadProcesoPedidos = new JLabelMe();
		this.jLabelnombre_ciudadProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadProcesoPedidos.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnombre_ciudadProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextAreanombre_ciudadProcesoPedidos= new JTextAreaMe();
		jTextAreanombre_ciudadProcesoPedidos.setEnabled(false);
		jTextAreanombre_ciudadProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoPedidos.setLineWrap(true);
		jTextAreanombre_ciudadProcesoPedidos.setWrapStyleWord(true);
		jTextAreanombre_ciudadProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadProcesoPedidos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadProcesoPedidos = new JScrollPane(jTextAreanombre_ciudadProcesoPedidos);
		jscrollPanenombre_ciudadProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadProcesoPedidosBusqueda.setText("U");
		this.jButtonnombre_ciudadProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaProcesoPedidos = new JLabelMe();
		this.jLabelnombre_zonaProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaProcesoPedidos.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnombre_zonaProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextFieldnombre_zonaProcesoPedidos= new JTextFieldMe();

		jTextFieldnombre_zonaProcesoPedidos.setEnabled(false);
		jTextFieldnombre_zonaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_zonaProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaProcesoPedidosBusqueda.setText("U");
		this.jButtonnombre_zonaProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteProcesoPedidos = new JLabelMe();
		this.jLabelnombre_grupo_clienteProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteProcesoPedidos.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnombre_grupo_clienteProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextAreanombre_grupo_clienteProcesoPedidos= new JTextAreaMe();
		jTextAreanombre_grupo_clienteProcesoPedidos.setEnabled(false);
		jTextAreanombre_grupo_clienteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoPedidos.setLineWrap(true);
		jTextAreanombre_grupo_clienteProcesoPedidos.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteProcesoPedidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteProcesoPedidos = new JScrollPane(jTextAreanombre_grupo_clienteProcesoPedidos);
		jscrollPanenombre_grupo_clienteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorProcesoPedidos = new JLabelMe();
		this.jLabelnombre_vendedorProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorProcesoPedidos.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnombre_vendedorProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextAreanombre_vendedorProcesoPedidos= new JTextAreaMe();
		jTextAreanombre_vendedorProcesoPedidos.setEnabled(false);
		jTextAreanombre_vendedorProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorProcesoPedidos.setLineWrap(true);
		jTextAreanombre_vendedorProcesoPedidos.setWrapStyleWord(true);
		jTextAreanombre_vendedorProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorProcesoPedidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorProcesoPedidos = new JScrollPane(jTextAreanombre_vendedorProcesoPedidos);
		jscrollPanenombre_vendedorProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorProcesoPedidosBusqueda.setText("U");
		this.jButtonnombre_vendedorProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProcesoPedidos = new JLabelMe();
		this.jLabelcodigoProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoPedidos.setToolTipText("Codigo");
		this.jLabelcodigoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelcodigoProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextFieldcodigoProcesoPedidos= new JTextFieldMe();

		jTextFieldcodigoProcesoPedidos.setEnabled(false);
		jTextFieldcodigoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesoPedidosBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoPedidosBusqueda.setText("U");
		this.jButtoncodigoProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoProcesoPedidos = new JLabelMe();
		this.jLabelnombre_completoProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoProcesoPedidos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnombre_completoProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextAreanombre_completoProcesoPedidos= new JTextAreaMe();
		jTextAreanombre_completoProcesoPedidos.setEnabled(false);
		jTextAreanombre_completoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoPedidos.setLineWrap(true);
		jTextAreanombre_completoProcesoPedidos.setWrapStyleWord(true);
		jTextAreanombre_completoProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoProcesoPedidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoProcesoPedidos = new JScrollPane(jTextAreanombre_completoProcesoPedidos);
		jscrollPanenombre_completoProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_completoProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoProcesoPedidosBusqueda.setText("U");
		this.jButtonnombre_completoProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnumeroProcesoPedidos = new JLabelMe();
		this.jLabelnumeroProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroProcesoPedidos.setToolTipText("Numero");
		this.jLabelnumeroProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnumeroProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextFieldnumeroProcesoPedidos= new JTextFieldMe();

		jTextFieldnumeroProcesoPedidos.setEnabled(false);
		jTextFieldnumeroProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnumeroProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroProcesoPedidosBusqueda.setText("U");
		this.jButtonnumeroProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionProcesoPedidos = new JLabelMe();
		this.jLabelnumero_autorizacionProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionProcesoPedidos.setToolTipText("Numero Autorizacion");
		this.jLabelnumero_autorizacionProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelnumero_autorizacionProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextFieldnumero_autorizacionProcesoPedidos= new JTextFieldMe();

		jTextFieldnumero_autorizacionProcesoPedidos.setEnabled(false);
		jTextFieldnumero_autorizacionProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setText("U");
		this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabeltotalProcesoPedidos = new JLabelMe();
		this.jLabeltotalProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalProcesoPedidos.setToolTipText("Total");
		this.jLabeltotalProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPaneltotalProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jTextFieldtotalProcesoPedidos= new JTextFieldMe();
		jTextFieldtotalProcesoPedidos.setEnabled(false);
		jTextFieldtotalProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalProcesoPedidos.setText("0.0");

		this.jButtontotalProcesoPedidosBusqueda= new JButtonMe();
		this.jButtontotalProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalProcesoPedidosBusqueda.setText("U");
		this.jButtontotalProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalProcesoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionProcesoPedidos = new JLabelMe();
		this.jLabelfecha_emisionProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionProcesoPedidos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelfecha_emisionProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		//jFormattedTextFieldfecha_emisionProcesoPedidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionProcesoPedidos= new JDateChooser();
		jDateChooserfecha_emisionProcesoPedidos.setEnabled(false);
		jDateChooserfecha_emisionProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionProcesoPedidos.setDate(new Date());
		jDateChooserfecha_emisionProcesoPedidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionProcesoPedidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionProcesoPedidosBusqueda.setText("U");
		this.jButtonfecha_emisionProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionProcesoPedidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoPedidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_ciudadProcesoPedidos = new JLabelMe();
		this.jLabelid_ciudadProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadProcesoPedidos.setToolTipText("Ciudad");
		this.jLabelid_ciudadProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelid_ciudadProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jComboBoxid_ciudadProcesoPedidos= new JComboBoxMe();
		jComboBoxid_ciudadProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadProcesoPedidos= new JButtonMe();
		this.jButtonid_ciudadProcesoPedidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoPedidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoPedidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoPedidos.setText("Buscar");
		this.jButtonid_ciudadProcesoPedidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadProcesoPedidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoPedidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoPedidos"));

		this.jButtonid_ciudadProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonid_ciudadProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadProcesoPedidosBusqueda.setText("U");
		this.jButtonid_ciudadProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadProcesoPedidosBusqueda.setVisible(false);		}

		this.jButtonid_ciudadProcesoPedidosUpdate= new JButtonMe();
		this.jButtonid_ciudadProcesoPedidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoPedidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoPedidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadProcesoPedidosUpdate.setText("U");
		this.jButtonid_ciudadProcesoPedidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadProcesoPedidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoPedidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoPedidosUpdate"));



					
		this.jLabelid_zonaProcesoPedidos = new JLabelMe();
		this.jLabelid_zonaProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaProcesoPedidos.setToolTipText("Zona");
		this.jLabelid_zonaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelid_zonaProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jComboBoxid_zonaProcesoPedidos= new JComboBoxMe();
		jComboBoxid_zonaProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaProcesoPedidos= new JButtonMe();
		this.jButtonid_zonaProcesoPedidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoPedidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoPedidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoPedidos.setText("Buscar");
		this.jButtonid_zonaProcesoPedidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaProcesoPedidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoPedidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoPedidos"));

		this.jButtonid_zonaProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonid_zonaProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaProcesoPedidosBusqueda.setText("U");
		this.jButtonid_zonaProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaProcesoPedidosBusqueda.setVisible(false);		}

		this.jButtonid_zonaProcesoPedidosUpdate= new JButtonMe();
		this.jButtonid_zonaProcesoPedidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoPedidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoPedidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaProcesoPedidosUpdate.setText("U");
		this.jButtonid_zonaProcesoPedidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaProcesoPedidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoPedidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoPedidosUpdate"));



					
		this.jLabelid_grupo_clienteProcesoPedidos = new JLabelMe();
		this.jLabelid_grupo_clienteProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteProcesoPedidos.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelid_grupo_clienteProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jComboBoxid_grupo_clienteProcesoPedidos= new JComboBoxMe();
		jComboBoxid_grupo_clienteProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteProcesoPedidos= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoPedidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoPedidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoPedidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoPedidos.setText("Buscar");
		this.jButtonid_grupo_clienteProcesoPedidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteProcesoPedidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoPedidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoPedidos"));

		this.jButtonid_grupo_clienteProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setText("U");
		this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteProcesoPedidosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteProcesoPedidosUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoPedidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoPedidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoPedidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteProcesoPedidosUpdate.setText("U");
		this.jButtonid_grupo_clienteProcesoPedidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteProcesoPedidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoPedidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoPedidosUpdate"));



					
		this.jLabelid_vendedorProcesoPedidos = new JLabelMe();
		this.jLabelid_vendedorProcesoPedidos.setText(""+ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorProcesoPedidos.setToolTipText("Vendedor");
		this.jLabelid_vendedorProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorProcesoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorProcesoPedidos.setToolTipText(ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutProcesoPedidos = new GridBagLayout();
		this.jPanelid_vendedorProcesoPedidos.setLayout(this.gridaBagLayoutProcesoPedidos);


		jComboBoxid_vendedorProcesoPedidos= new JComboBoxMe();
		jComboBoxid_vendedorProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorProcesoPedidos= new JButtonMe();
		this.jButtonid_vendedorProcesoPedidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoPedidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoPedidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoPedidos.setText("Buscar");
		this.jButtonid_vendedorProcesoPedidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorProcesoPedidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoPedidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoPedidos"));

		this.jButtonid_vendedorProcesoPedidosBusqueda= new JButtonMe();
		this.jButtonid_vendedorProcesoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProcesoPedidosBusqueda.setText("U");
		this.jButtonid_vendedorProcesoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorProcesoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoPedidosBusqueda"));

		if(this.procesopedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorProcesoPedidosBusqueda.setVisible(false);		}

		this.jButtonid_vendedorProcesoPedidosUpdate= new JButtonMe();
		this.jButtonid_vendedorProcesoPedidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoPedidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoPedidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProcesoPedidosUpdate.setText("U");
		this.jButtonid_vendedorProcesoPedidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorProcesoPedidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoPedidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoPedidosUpdate"));



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
		//this.jInternalFrameDetalleProcesoPedidos = new ProcesoPedidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Pedidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoPedidos= new GridBagLayout();
		

		
		String sToolTipProcesoPedidos="";
		sToolTipProcesoPedidos=ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoPedidos+="(Facturacion.ProcesoPedidos)";
		}
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoPedidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoPedidos = new JButtonMe();
		this.jButtonModificarProcesoPedidos = new JButtonMe();
        this.jButtonActualizarProcesoPedidos = new JButtonMe();
        this.jButtonEliminarProcesoPedidos = new JButtonMe();
        this.jButtonCancelarProcesoPedidos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoPedidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoPedidos = new JButtonMe();
		this.jButtonCerrarProcesoPedidos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoPedidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoPedidos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoPedidos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Pedidos";
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Pedidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoPedidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoPedidos.setName("jPanelCamposProcesoPedidos"); 

		this.jPanelCamposOcultosProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoPedidos.setName("jPanelCamposOcultosProcesoPedidos"); 

        this.jPanelAccionesProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoPedidos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoPedidos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoPedidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoPedidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoPedidos.setText("Nuevo");
		this.jButtonModificarProcesoPedidos.setText("Editar");
        this.jButtonActualizarProcesoPedidos.setText("Actualizar");
        this.jButtonEliminarProcesoPedidos.setText("Eliminar");
        this.jButtonCancelarProcesoPedidos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoPedidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoPedidos.setText("Guardar");
		this.jButtonCerrarProcesoPedidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoPedidos,"nuevo_button","Nuevo",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoPedidos,"modificar_button","Editar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoPedidos,"actualizar_button","Actualizar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoPedidos,"eliminar_button","Eliminar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoPedidos,"cancelar_button","Cancelar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoPedidos,"guardarcambios_button","Guardar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoPedidos,"guardarcambiostabla_button","Guardar",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoPedidos,"cerrar_button","Salir",this.procesopedidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoPedidos.setToolTipText("Nuevo"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoPedidos.setToolTipText("Editar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoPedidos.setToolTipText("Actualizar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoPedidos.setToolTipText("Eliminar)"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoPedidos.setToolTipText("Cancelar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoPedidos.setToolTipText("Guardar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoPedidos.setToolTipText("Guardar"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoPedidos.setToolTipText("Salir"+" "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoPedidos";
		inputMap = this.jButtonNuevoProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoPedidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoPedidos";
		inputMap = this.jButtonActualizarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoPedidos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoPedidos";
		inputMap = this.jButtonEliminarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoPedidos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoPedidos";
		inputMap = this.jButtonCancelarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoPedidos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoPedidos";
		inputMap = this.jButtonCerrarProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoPedidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoPedidos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoPedidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoPedidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoPedidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoPedidos.setToolTipText("Nuevo ProcesoPedidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoPedidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoPedidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoPedidos.setToolTipText("Sin Cerrar Ventana ProcesoPedidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoPedidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoPedidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoPedidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoPedidos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoPedidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoPedidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoPedidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoPedidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoPedidos = new JLabelMe();
		
		this.jLabelAccionesProcesoPedidos.setText("Acciones");		
		this.jLabelAccionesProcesoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoPedidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoPedidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoPedidos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoPedidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoPedidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoPedidos = new GridBagLayout();
		
		this.jPanelCamposProcesoPedidos.setLayout(gridaBagLayoutCamposProcesoPedidos);
		this.jPanelCamposOcultosProcesoPedidos.setLayout(gridaBagLayoutCamposOcultosProcesoPedidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoPedidos.add(jLabelIdProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoPedidos.add(jLabelidProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadProcesoPedidos.add(jLabelid_ciudadProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadProcesoPedidos.add(jButtonid_ciudadProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 3;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadProcesoPedidos.add(jButtonid_ciudadProcesoPedidosUpdate, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadProcesoPedidos.add(jComboBoxid_ciudadProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaProcesoPedidos.add(jLabelid_zonaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaProcesoPedidos.add(jButtonid_zonaProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 3;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaProcesoPedidos.add(jButtonid_zonaProcesoPedidosUpdate, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaProcesoPedidos.add(jComboBoxid_zonaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteProcesoPedidos.add(jLabelid_grupo_clienteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteProcesoPedidos.add(jButtonid_grupo_clienteProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 3;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteProcesoPedidos.add(jButtonid_grupo_clienteProcesoPedidosUpdate, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteProcesoPedidos.add(jComboBoxid_grupo_clienteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorProcesoPedidos.add(jLabelid_vendedorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProcesoPedidos.add(jButtonid_vendedorProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 3;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProcesoPedidos.add(jButtonid_vendedorProcesoPedidosUpdate, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorProcesoPedidos.add(jComboBoxid_vendedorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_provinciaProcesoPedidos.add(jLabelnombre_provinciaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_provinciaProcesoPedidos.add(jButtonnombre_provinciaProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_provinciaProcesoPedidos.add(jscrollPanenombre_provinciaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadProcesoPedidos.add(jLabelnombre_ciudadProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadProcesoPedidos.add(jButtonnombre_ciudadProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadProcesoPedidos.add(jscrollPanenombre_ciudadProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaProcesoPedidos.add(jLabelnombre_zonaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaProcesoPedidos.add(jButtonnombre_zonaProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaProcesoPedidos.add(jTextFieldnombre_zonaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteProcesoPedidos.add(jLabelnombre_grupo_clienteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteProcesoPedidos.add(jButtonnombre_grupo_clienteProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteProcesoPedidos.add(jscrollPanenombre_grupo_clienteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorProcesoPedidos.add(jLabelnombre_vendedorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorProcesoPedidos.add(jButtonnombre_vendedorProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorProcesoPedidos.add(jscrollPanenombre_vendedorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoPedidos.add(jLabelcodigoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoPedidos.add(jButtoncodigoProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoPedidos.add(jTextFieldcodigoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoProcesoPedidos.add(jLabelnombre_completoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoProcesoPedidos.add(jButtonnombre_completoProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoProcesoPedidos.add(jscrollPanenombre_completoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroProcesoPedidos.add(jLabelnumeroProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroProcesoPedidos.add(jButtonnumeroProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroProcesoPedidos.add(jTextFieldnumeroProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionProcesoPedidos.add(jLabelnumero_autorizacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionProcesoPedidos.add(jButtonnumero_autorizacionProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionProcesoPedidos.add(jTextFieldnumero_autorizacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalProcesoPedidos.add(jLabeltotalProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalProcesoPedidos.add(jButtontotalProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalProcesoPedidos.add(jTextFieldtotalProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 0;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionProcesoPedidos.add(jLabelfecha_emisionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = 2;
		this.gridBagConstraintsProcesoPedidos.ipadx = 0;
		this.gridBagConstraintsProcesoPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionProcesoPedidos.add(jButtonfecha_emisionProcesoPedidosBusqueda, this.gridBagConstraintsProcesoPedidos);
	}

	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoPedidos.gridy = 0;
	this.gridBagConstraintsProcesoPedidos.gridx = 1;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionProcesoPedidos.add(jDateChooserfecha_emisionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelidProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelid_ciudadProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelid_zonaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelid_grupo_clienteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelid_vendedorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnombre_provinciaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnombre_ciudadProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnombre_zonaProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnombre_grupo_clienteProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnombre_vendedorProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelcodigoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnombre_completoProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnumeroProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelnumero_autorizacionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPaneltotalProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
	}
	this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoPedidos.gridy = iYPanelCamposProcesoPedidos;
	this.gridBagConstraintsProcesoPedidos.gridx = iXPanelCamposProcesoPedidos++;
	this.gridBagConstraintsProcesoPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoPedidos.add(this.jPanelfecha_emisionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);



	if(iXPanelCamposProcesoPedidos % 2==0) {
		iXPanelCamposProcesoPedidos=0;
		iYPanelCamposProcesoPedidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoPedidos= new GridBagLayout();
		this.jPanelAccionesProcesoPedidos.setLayout(gridaBagLayoutAccionesProcesoPedidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoPedidos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoPedidos.setLayout(gridaBagLayoutAccionesFormularioProcesoPedidos);
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoPedidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoPedidos.add(this.jComboBoxTiposAccionesFormularioProcesoPedidos, this.gridBagConstraintsProcesoPedidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoPedidos.add(this.jButtonModificarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);							

		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoPedidos.gridy = 0;
		this.gridBagConstraintsProcesoPedidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoPedidos.add(this.jButtonEliminarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = 0;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoPedidos.add(this.jButtonActualizarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);


		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = 0;		
		this.gridBagConstraintsProcesoPedidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoPedidos.add(this.jButtonGuardarCambiosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);	
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = 0;		
		this.gridBagConstraintsProcesoPedidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoPedidos.add(this.jButtonCancelarProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoPedidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoPedidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoPedidos.gridx = 0;		
			//this.gridBagConstraintsProcesoPedidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoPedidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoPedidos.gridx =0;
		this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoPedidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoPedidos = new ProcesoPedidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Pedidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Pedidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Pedidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoPedidosModel procesopedidosModel=new ProcesoPedidosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoPedidosModel.ProcesoPedidosFocusTraversalPolicy procesopedidosFocusTraversalPolicy = procesopedidosModel.new ProcesoPedidosFocusTraversalPolicy(this);
			
			//procesopedidosFocusTraversalPolicy.setprocesopedidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesopedidosModel);
			
			
			this.jContentPaneDetalleProcesoPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoPedidos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoPedidos.setLayout(gridaBagLayoutDetalleProcesoPedidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoPedidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
				this.gridBagConstraintsProcesoPedidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoPedidos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoPedidos.add(jTtoolBarDetalleProcesoPedidos, gridBagConstraintsProcesoPedidos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoPedidos=   new JScrollPane(jContentPaneDetalleProcesoPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoPedidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoPedidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoPedidos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoPedidos.add(jPanelCamposProcesoPedidos, gridBagConstraintsProcesoPedidos);
			
			
			
			
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
						//&& procesopedidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoPedidos= new GridBagConstraints();
						this.gridBagConstraintsProcesoPedidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoPedidos.gridx = 0;
						this.jContentPaneDetalleProcesoPedidos.add(this.jTabbedPaneRelacionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoPedidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoPedidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
					this.gridBagConstraintsProcesoPedidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoPedidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoPedidos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoPedidos.add(jPanelCamposOcultosProcesoPedidos, gridBagConstraintsProcesoPedidos);
				
					this.jPanelCamposOcultosProcesoPedidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoPedidos.gridx = 0;
	        this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoPedidos.add(this.jPanelAccionesFormularioProcesoPedidos, this.gridBagConstraintsProcesoPedidos);							
			
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoPedidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoPedidos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoPedidos.add(this.jPanelAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoPedidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoPedidos=   new JScrollPane(this.jPanelCamposProcesoPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPedidos.gridx = 0;
			this.gridBagConstraintsProcesoPedidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoPedidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoPedidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPedidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoPedidos, this.gridBagConstraintsProcesoPedidos);			
			
			this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
			this.gridBagConstraintsProcesoPedidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoPedidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
			
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		
			
		this.gridBagConstraintsProcesoPedidos = new GridBagConstraints();
		this.gridBagConstraintsProcesoPedidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoPedidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoPedidos, this.gridBagConstraintsProcesoPedidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoPedidos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoPedidos;
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
