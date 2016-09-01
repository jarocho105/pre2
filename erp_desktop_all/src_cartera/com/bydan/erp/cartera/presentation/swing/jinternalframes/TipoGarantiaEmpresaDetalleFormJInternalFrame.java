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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoGarantiaEmpresaConstantesFunciones;

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
public class TipoGarantiaEmpresaDetalleFormJInternalFrame extends TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGarantiaEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoGarantiaEmpresa;
	
	protected JMenu jmenuDetalleTipoGarantiaEmpresa;
	protected JMenu jmenuDetalleArchivoTipoGarantiaEmpresa;
	protected JMenu jmenuDetalleAccionesTipoGarantiaEmpresa;
	protected JMenu jmenuDetalleDatosTipoGarantiaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGarantiaEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoGarantiaEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGarantiaEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame=null;
	public GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGarantiaCliente=false;
	public GarantiaClienteSessionBean garantiaclienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoGarantiaEmpresaLogic tipogarantiaempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoGarantiaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoGarantiaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoGarantiaEmpresa;
	
	protected JPanel jPanelCamposTipoGarantiaEmpresa;    
	protected JPanel jPanelCamposOcultosTipoGarantiaEmpresa;    	
	protected JPanel jPanelAccionesTipoGarantiaEmpresa;
	protected JPanel jPanelAccionesFormularioTipoGarantiaEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoGarantiaEmpresa=0;
	protected Integer iYPanelCamposTipoGarantiaEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoGarantiaEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoGarantiaEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGarantiaEmpresa;
	public JButton jButtonModificarTipoGarantiaEmpresa;
	public JButton jButtonActualizarTipoGarantiaEmpresa;
    public JButton jButtonEliminarTipoGarantiaEmpresa;
	public JButton jButtonCancelarTipoGarantiaEmpresa;
    public JButton jButtonGuardarCambiosTipoGarantiaEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoGarantiaEmpresa;
	protected JButton jButtonCerrarTipoGarantiaEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoGarantiaEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGarantiaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGarantiaEmpresa;
	protected JButton jButtonModificarToolBarTipoGarantiaEmpresa;
	protected JButton jButtonActualizarToolBarTipoGarantiaEmpresa;
    protected JButton jButtonEliminarToolBarTipoGarantiaEmpresa;
	protected JButton jButtonCancelarToolBarTipoGarantiaEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoGarantiaEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGarantiaEmpresa;
	protected JButton jButtonCerrarToolBarTipoGarantiaEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGarantiaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemModificarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemActualizarTipoGarantiaEmpresa;
    protected JMenuItem jMenuItemEliminarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemCancelarTipoGarantiaEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemCerrarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoGarantiaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGarantiaEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGarantiaEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGarantiaEmpresa;
	public JLabel jLabelIdTipoGarantiaEmpresa;
	public JLabel jLabelidTipoGarantiaEmpresa;
	public JButton jButtonidTipoGarantiaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoGarantiaEmpresa;
	public JLabel jLabelcodigoTipoGarantiaEmpresa;
	public JTextField jTextFieldcodigoTipoGarantiaEmpresa;
	public JButton jButtoncodigoTipoGarantiaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGarantiaEmpresa;
	public JLabel jLabelnombreTipoGarantiaEmpresa;
	public JTextArea jTextAreanombreTipoGarantiaEmpresa;
	public JScrollPane jscrollPanenombreTipoGarantiaEmpresa;
	public JButton jButtonnombreTipoGarantiaEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoTipoGarantiaEmpresa;
	public JLabel jLabeles_defectoTipoGarantiaEmpresa;
	public JCheckBox jCheckBoxes_defectoTipoGarantiaEmpresa;
	public JButton jButtones_defectoTipoGarantiaEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoGarantiaEmpresa;
	public JLabel jLabelid_empresaTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoGarantiaEmpresa;
	public JButton jButtonid_empresaTipoGarantiaEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoGarantiaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoGarantiaEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGarantiaEmpresa;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGarantiaEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGarantiaEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoGarantiaEmpresa=new JPanel();
				this.jmenuBarDetalleTipoGarantiaEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoGarantiaEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGarantiaEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGarantiaEmpresa() {
		return this.jButtonActualizarToolBarTipoGarantiaEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoGarantiaEmpresa() {
		return this.jButtonEliminarToolBarTipoGarantiaEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoGarantiaEmpresa() {
		return this.jButtonCancelarToolBarTipoGarantiaEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGarantiaEmpresa() {
		return this.jButtonProcesarInformacionTipoGarantiaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGarantiaEmpresa)	{
		this.jButtonProcesarInformacionTipoGarantiaEmpresa = jButtonProcesarInformacionTipoGarantiaEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGarantiaEmpresa() {
		return this.jComboBoxTiposAccionesTipoGarantiaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoGarantiaEmpresa) {
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa = jComboBoxTiposRelacionesTipoGarantiaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposAccionesTipoGarantiaEmpresa) {
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa = jComboBoxTiposAccionesTipoGarantiaEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGarantiaEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa = jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
		
		this.tipogarantiaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogarantiaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGarantiaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Garantia Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGarantiaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGarantiaEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGarantiaEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoGarantiaEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGarantiaEmpresa,this.jTtoolBarDetalleTipoGarantiaEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGarantiaEmpresa,this.jTtoolBarDetalleTipoGarantiaEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGarantiaEmpresa,this.jTtoolBarDetalleTipoGarantiaEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa,this.jTtoolBarDetalleTipoGarantiaEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGarantiaEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGarantiaEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGarantiaEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGarantiaEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGarantiaEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGarantiaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGarantiaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGarantiaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGarantiaEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGarantiaEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGarantiaEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGarantiaEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGarantiaEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGarantiaEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGarantiaEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGarantiaEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGarantiaEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGarantiaEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGarantiaEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGarantiaEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGarantiaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGarantiaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGarantiaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGarantiaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGarantiaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGarantiaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGarantiaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGarantiaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGarantiaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGarantiaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGarantiaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGarantiaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGarantiaEmpresa.add(this.jMenuItemDetalleCerrarTipoGarantiaEmpresa);
		
		this.jmenuDetalleAccionesTipoGarantiaEmpresa.add(this.jMenuItemActualizarTipoGarantiaEmpresa);
		this.jmenuDetalleAccionesTipoGarantiaEmpresa.add(this.jMenuItemEliminarTipoGarantiaEmpresa);
		this.jmenuDetalleAccionesTipoGarantiaEmpresa.add(this.jMenuItemCancelarTipoGarantiaEmpresa);		
		
		//this.jmenuDetalleDatosTipoGarantiaEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa);				
		this.jmenuDetalleDatosTipoGarantiaEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa);				
				
		//this.jmenuDetalleAccionesTipoGarantiaEmpresa.add(this.jMenuItemGuardarCambiosTipoGarantiaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGarantiaEmpresa.add(this.jmenuDetalleArchivoTipoGarantiaEmpresa);		
		this.jmenuBarDetalleTipoGarantiaEmpresa.add(this.jmenuDetalleAccionesTipoGarantiaEmpresa);		
		this.jmenuBarDetalleTipoGarantiaEmpresa.add(this.jmenuDetalleDatosTipoGarantiaEmpresa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoGarantiaEmpresa.add(this.jmenuDetalleTipoGarantiaEmpresa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGarantiaEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoGarantiaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGarantiaEmpresa = new JLabelMe();
		jLabelIdTipoGarantiaEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGarantiaEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGarantiaEmpresa.setToolTipText(TipoGarantiaEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGarantiaEmpresa= new GridBagLayout();

		this.jPanelidTipoGarantiaEmpresa.setLayout(this.gridaBagLayoutTipoGarantiaEmpresa);

		jLabelidTipoGarantiaEmpresa = new JLabel();
		jLabelidTipoGarantiaEmpresa.setText("Id");

		jLabelidTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoGarantiaEmpresa = new JLabelMe();
		this.jLabelcodigoTipoGarantiaEmpresa.setText(""+TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoGarantiaEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoGarantiaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoGarantiaEmpresa.setToolTipText(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoGarantiaEmpresa = new GridBagLayout();
		this.jPanelcodigoTipoGarantiaEmpresa.setLayout(this.gridaBagLayoutTipoGarantiaEmpresa);


		jTextFieldcodigoTipoGarantiaEmpresa= new JTextFieldMe();

		jTextFieldcodigoTipoGarantiaEmpresa.setEnabled(false);
		jTextFieldcodigoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoGarantiaEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setText("U");
		this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoGarantiaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoGarantiaEmpresaBusqueda"));

		if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoGarantiaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoGarantiaEmpresa = new JLabelMe();
		this.jLabelnombreTipoGarantiaEmpresa.setText(""+TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGarantiaEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGarantiaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGarantiaEmpresa.setToolTipText(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGarantiaEmpresa = new GridBagLayout();
		this.jPanelnombreTipoGarantiaEmpresa.setLayout(this.gridaBagLayoutTipoGarantiaEmpresa);


		jTextAreanombreTipoGarantiaEmpresa= new JTextAreaMe();
		jTextAreanombreTipoGarantiaEmpresa.setEnabled(false);
		jTextAreanombreTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGarantiaEmpresa.setLineWrap(true);
		jTextAreanombreTipoGarantiaEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoGarantiaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGarantiaEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGarantiaEmpresa = new JScrollPane(jTextAreanombreTipoGarantiaEmpresa);
		jscrollPanenombreTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGarantiaEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoGarantiaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGarantiaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGarantiaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGarantiaEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoGarantiaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGarantiaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGarantiaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGarantiaEmpresaBusqueda"));

		if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGarantiaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoTipoGarantiaEmpresa = new JLabelMe();
		this.jLabeles_defectoTipoGarantiaEmpresa.setText(""+TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoTipoGarantiaEmpresa.setToolTipText("Es Defecto");
		this.jLabeles_defectoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoTipoGarantiaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoTipoGarantiaEmpresa.setToolTipText(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutTipoGarantiaEmpresa = new GridBagLayout();
		this.jPaneles_defectoTipoGarantiaEmpresa.setLayout(this.gridaBagLayoutTipoGarantiaEmpresa);


		jCheckBoxes_defectoTipoGarantiaEmpresa= new JCheckBoxMe();
		jCheckBoxes_defectoTipoGarantiaEmpresa.setEnabled(false);

		jCheckBoxes_defectoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoTipoGarantiaEmpresaBusqueda= new JButtonMe();
		this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setText("U");
		this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoTipoGarantiaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoTipoGarantiaEmpresaBusqueda"));

		if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoTipoGarantiaEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGarantiaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoGarantiaEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoGarantiaEmpresa.setText(""+TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoGarantiaEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoGarantiaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoGarantiaEmpresa.setToolTipText(TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoGarantiaEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoGarantiaEmpresa.setLayout(this.gridaBagLayoutTipoGarantiaEmpresa);


		jComboBoxid_empresaTipoGarantiaEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoGarantiaEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoGarantiaEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoGarantiaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGarantiaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGarantiaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGarantiaEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoGarantiaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoGarantiaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGarantiaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGarantiaEmpresa"));

		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGarantiaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGarantiaEmpresaBusqueda"));

		if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoGarantiaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoGarantiaEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoGarantiaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGarantiaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGarantiaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoGarantiaEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoGarantiaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoGarantiaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGarantiaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGarantiaEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoGarantiaEmpresa = new TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Garantia Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGarantiaEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoGarantiaEmpresa="";
		sToolTipTipoGarantiaEmpresa=TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGarantiaEmpresa+="(Cartera.TipoGarantiaEmpresa)";
		}
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGarantiaEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonModificarTipoGarantiaEmpresa = new JButtonMe();
        this.jButtonActualizarTipoGarantiaEmpresa = new JButtonMe();
        this.jButtonEliminarTipoGarantiaEmpresa = new JButtonMe();
        this.jButtonCancelarTipoGarantiaEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonCerrarTipoGarantiaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoGarantiaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGarantiaEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGarantiaEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Garantia Empresa";
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantia Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGarantiaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGarantiaEmpresa.setName("jPanelCamposTipoGarantiaEmpresa"); 

		this.jPanelCamposOcultosTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGarantiaEmpresa.setName("jPanelCamposOcultosTipoGarantiaEmpresa"); 

        this.jPanelAccionesTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGarantiaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoGarantiaEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGarantiaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGarantiaEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGarantiaEmpresa.setText("Nuevo");
		this.jButtonModificarTipoGarantiaEmpresa.setText("Editar");
        this.jButtonActualizarTipoGarantiaEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoGarantiaEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoGarantiaEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGarantiaEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.setText("Guardar");
		this.jButtonCerrarTipoGarantiaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGarantiaEmpresa,"nuevo_button","Nuevo",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGarantiaEmpresa,"modificar_button","Editar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGarantiaEmpresa,"actualizar_button","Actualizar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGarantiaEmpresa,"eliminar_button","Eliminar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGarantiaEmpresa,"cancelar_button","Cancelar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGarantiaEmpresa,"guardarcambios_button","Guardar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa,"guardarcambiostabla_button","Guardar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGarantiaEmpresa,"cerrar_button","Salir",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGarantiaEmpresa.setToolTipText("Nuevo"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGarantiaEmpresa.setToolTipText("Editar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGarantiaEmpresa.setToolTipText("Actualizar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGarantiaEmpresa.setToolTipText("Eliminar)"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGarantiaEmpresa.setToolTipText("Cancelar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGarantiaEmpresa.setToolTipText("Guardar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.setToolTipText("Guardar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGarantiaEmpresa.setToolTipText("Salir"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGarantiaEmpresa";
		inputMap = this.jButtonNuevoTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGarantiaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGarantiaEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGarantiaEmpresa";
		inputMap = this.jButtonActualizarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGarantiaEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGarantiaEmpresa";
		inputMap = this.jButtonEliminarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGarantiaEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGarantiaEmpresa";
		inputMap = this.jButtonCancelarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGarantiaEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGarantiaEmpresa";
		inputMap = this.jButtonCerrarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGarantiaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGarantiaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGarantiaEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa.setToolTipText("Nuevo TipoGarantiaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa.setToolTipText("Sin Cerrar Ventana TipoGarantiaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGarantiaEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoGarantiaEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGarantiaEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGarantiaEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGarantiaEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGarantiaEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGarantiaEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoGarantiaEmpresa.setLayout(gridaBagLayoutCamposTipoGarantiaEmpresa);
		this.jPanelCamposOcultosTipoGarantiaEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoGarantiaEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGarantiaEmpresa.add(jLabelIdTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGarantiaEmpresa.add(jLabelidTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);


	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoGarantiaEmpresa.add(jLabelid_empresaTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoGarantiaEmpresa.add(jButtonid_empresaTipoGarantiaEmpresaBusqueda, this.gridBagConstraintsTipoGarantiaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 3;
		this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoGarantiaEmpresa.add(jButtonid_empresaTipoGarantiaEmpresaUpdate, this.gridBagConstraintsTipoGarantiaEmpresa);
	}

	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoGarantiaEmpresa.add(jComboBoxid_empresaTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);


	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoGarantiaEmpresa.add(jLabelcodigoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoGarantiaEmpresa.add(jButtoncodigoTipoGarantiaEmpresaBusqueda, this.gridBagConstraintsTipoGarantiaEmpresa);
	}

	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoGarantiaEmpresa.add(jTextFieldcodigoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);


	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGarantiaEmpresa.add(jLabelnombreTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGarantiaEmpresa.add(jButtonnombreTipoGarantiaEmpresaBusqueda, this.gridBagConstraintsTipoGarantiaEmpresa);
	}

	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGarantiaEmpresa.add(jscrollPanenombreTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);


	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoTipoGarantiaEmpresa.add(jLabeles_defectoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoTipoGarantiaEmpresa.add(jButtones_defectoTipoGarantiaEmpresaBusqueda, this.gridBagConstraintsTipoGarantiaEmpresa);
	}

	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoTipoGarantiaEmpresa.add(jCheckBoxes_defectoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iYPanelCamposTipoGarantiaEmpresa;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iXPanelCamposTipoGarantiaEmpresa++;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantiaEmpresa.add(this.jPanelidTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(iXPanelCamposTipoGarantiaEmpresa % 1==0) {
		iXPanelCamposTipoGarantiaEmpresa=0;
		iYPanelCamposTipoGarantiaEmpresa++;
	}
	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iYPanelCamposTipoGarantiaEmpresa;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iXPanelCamposTipoGarantiaEmpresa++;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantiaEmpresa.add(this.jPanelcodigoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(iXPanelCamposTipoGarantiaEmpresa % 1==0) {
		iXPanelCamposTipoGarantiaEmpresa=0;
		iYPanelCamposTipoGarantiaEmpresa++;
	}
	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iYPanelCamposTipoGarantiaEmpresa;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iXPanelCamposTipoGarantiaEmpresa++;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantiaEmpresa.add(this.jPanelnombreTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(iXPanelCamposTipoGarantiaEmpresa % 1==0) {
		iXPanelCamposTipoGarantiaEmpresa=0;
		iYPanelCamposTipoGarantiaEmpresa++;
	}
	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iYPanelCamposTipoGarantiaEmpresa;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iXPanelCamposTipoGarantiaEmpresa++;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantiaEmpresa.add(this.jPaneles_defectoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(iXPanelCamposTipoGarantiaEmpresa % 1==0) {
		iXPanelCamposTipoGarantiaEmpresa=0;
		iYPanelCamposTipoGarantiaEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iYPanelCamposOcultosTipoGarantiaEmpresa;
	this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iXPanelCamposOcultosTipoGarantiaEmpresa++;
	this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantiaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoGarantiaEmpresa.add(this.jPanelid_empresaTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);



	if(iXPanelCamposOcultosTipoGarantiaEmpresa % 1==0) {
		iXPanelCamposOcultosTipoGarantiaEmpresa=0;
		iYPanelCamposOcultosTipoGarantiaEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGarantiaEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoGarantiaEmpresa.setLayout(gridaBagLayoutAccionesTipoGarantiaEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGarantiaEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGarantiaEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoGarantiaEmpresa);
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGarantiaEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGarantiaEmpresa.add(this.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGarantiaEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGarantiaEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGarantiaEmpresa.add(this.jButtonModificarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);							

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGarantiaEmpresa.add(this.jButtonEliminarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
			
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGarantiaEmpresa.add(this.jButtonActualizarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);


		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGarantiaEmpresa.add(this.jButtonGuardarCambiosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);	
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGarantiaEmpresa.add(this.jButtonCancelarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGarantiaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGarantiaEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoGarantiaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =0;
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGarantiaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGarantiaEmpresa = new TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Garantia Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Garantia Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Garantia Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGarantiaEmpresaModel tipogarantiaempresaModel=new TipoGarantiaEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGarantiaEmpresaModel.TipoGarantiaEmpresaFocusTraversalPolicy tipogarantiaempresaFocusTraversalPolicy = tipogarantiaempresaModel.new TipoGarantiaEmpresaFocusTraversalPolicy(this);
			
			//tipogarantiaempresaFocusTraversalPolicy.settipogarantiaempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogarantiaempresaModel);
			
			
			this.jContentPaneDetalleTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGarantiaEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoGarantiaEmpresa.setLayout(gridaBagLayoutDetalleTipoGarantiaEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGarantiaEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGarantiaEmpresa.add(jTtoolBarDetalleTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa=   new JScrollPane(jContentPaneDetalleTipoGarantiaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoGarantiaEmpresa.add(jPanelCamposTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);
			
			
			
			
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
						&& tipogarantiaempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(this.puedeCargarPorParteGarantiaCliente,false,-1);
					
					if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGarantiaEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoGarantiaEmpresa.add(this.jTabbedPaneRelacionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGarantiaEmpresa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGarantiaEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoGarantiaEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGarantiaEmpresa.add(jPanelCamposOcultosTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);
				
					this.jPanelCamposOcultosTipoGarantiaEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGarantiaEmpresa.add(this.jPanelAccionesFormularioTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);							
			
			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGarantiaEmpresa.add(this.jPanelAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGarantiaEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa=   new JScrollPane(this.jPanelCamposTipoGarantiaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGarantiaEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
			
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
			
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGarantiaEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGarantiaEmpresa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoGarantiaEmpresa.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGarantiaEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGarantiaEmpresa.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoGarantiaEmpresa.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGarantiaCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		this.garantiaclienteSessionBean.setConGuardarRelaciones(false);
		this.garantiaclienteSessionBean.setEsGuardarRelacionado(true);

		this.garantiaclienteBeanSwingJInternalFrame=null;//new GarantiaClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.garantiaclienteBeanSwingJInternalFramePopup=new GarantiaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.garantiaclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {

				GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.garantiaclienteSessionBean.setEsGuardarRelacionado(true);

				this.garantiaclienteBeanSwingJInternalFrame=new GarantiaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.garantiaclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.garantiaclienteBeanSwingJInternalFrame.setgarantiaclienteSessionBean(this.garantiaclienteSessionBean);

				//this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoGarantiaEmpresa.add(this.garantiaclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGarantiaEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGarantiaEmpresa.add("Garantia Clientes",this.garantiaclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setComponentAt(iIndexTab,this.garantiaclienteBeanSwingJInternalFrame.getContentPane());
				}

				//GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
				this.garantiaclienteBeanSwingJInternalFrame=null;//new GarantiaClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGarantiaCliente) {
					this.jTabbedPaneRelacionesTipoGarantiaEmpresa.add("Garantia Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<TipoGarantiaEmpresa> tipogarantiaempresas,TipoGarantiaEmpresa tipogarantiaempresa,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tipogarantiaempresaLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settipogarantiaempresasForeignKey(tipogarantiaempresas);
					clienteBeanSwingJInternalFrame.settipogarantiaempresaForeignKey(tipogarantiaempresa);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoGarantiaEmpresaActual(tipogarantiaempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGarantiaEmpresa(true);
					clienteBeanSwingJInternalFrame.setid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa(tipogarantiaempresa.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGarantiaEmpresaForeignKey(tipogarantiaempresa,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGarantiaEmpresa");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGarantiaEmpresa");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGarantiaClienteBeanSwingJInternalFrame(List<TipoGarantiaEmpresa> tipogarantiaempresas,TipoGarantiaEmpresa tipogarantiaempresa,GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//garantiaclienteBeanSwingJInternalFrame=new GarantiaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					garantiaclienteBeanSwingJInternalFrame.getGarantiaClienteLogic().setConnexion(this.tipogarantiaempresaLogic.getConnexion());

					garantiaclienteBeanSwingJInternalFrame.settipogarantiaempresasForeignKey(tipogarantiaempresas);
					garantiaclienteBeanSwingJInternalFrame.settipogarantiaempresaForeignKey(tipogarantiaempresa);
					garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa(true);
					garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setlidTipoGarantiaEmpresaActual(tipogarantiaempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					garantiaclienteBeanSwingJInternalFrame.cargarCombosForeignKeyGarantiaCliente(garantiaclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					garantiaclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGarantiaEmpresa(true);
					garantiaclienteBeanSwingJInternalFrame.setid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa(tipogarantiaempresa.getId());

					if(!this.conCargarFormDetalle) {
						garantiaclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					garantiaclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGarantiaEmpresaForeignKey(tipogarantiaempresa,1,false,true,true);
					garantiaclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					garantiaclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGarantiaEmpresa");
					garantiaclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGarantiaEmpresa");
					garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(true);
					garantiaclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGarantiaCliente("n",garantiaclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, garantiaclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					garantiaclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					garantiaclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("relacionado");
					} else {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("no_relacionado");
					}

					garantiaclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionGarantiaCliente().setVisible(false);

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
