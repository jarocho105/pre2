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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoMovimientoModuloConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoMovimientoModuloDetalleFormJInternalFrame extends TipoMovimientoModuloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMovimientoModulo;
	
	protected JMenuBar jmenuBarDetalleTipoMovimientoModulo;
	
	protected JMenu jmenuDetalleTipoMovimientoModulo;
	protected JMenu jmenuDetalleArchivoTipoMovimientoModulo;
	protected JMenu jmenuDetalleAccionesTipoMovimientoModulo;
	protected JMenu jmenuDetalleDatosTipoMovimientoModulo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMovimientoModulo;	
	protected GridBagConstraints gridBagConstraintsTipoMovimientoModulo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMovimientoModuloBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMovimientoModulo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	
	

	public ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame=null;
	public ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCompra=false;
	public ParametroCompraSessionBean parametrocompraSessionBean;

	public FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame=null;
	public FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaProveedorServicio=false;
	public FacturaProveedorServicioSessionBean facturaproveedorservicioSessionBean;

	public SecuencialBeanSwingJInternalFrame secuencialBeanSwingJInternalFrame=null;
	public SecuencialBeanSwingJInternalFrame secuencialBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSecuencial=false;
	public SecuencialSessionBean secuencialSessionBean;

	public TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame=null;
	public TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTipoDocumento=false;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	
	
	public ModuloSessionBean moduloSessionBean;	
	
	public TipoMovimientoModuloLogic tipomovimientomoduloLogic;
	
	public JScrollPane jScrollPanelDatosTipoMovimientoModulo;
	public JScrollPane jScrollPanelDatosEdicionTipoMovimientoModulo;
	public JScrollPane jScrollPanelDatosGeneralTipoMovimientoModulo;
	
	protected JPanel jPanelCamposTipoMovimientoModulo;    
	protected JPanel jPanelCamposOcultosTipoMovimientoModulo;    	
	protected JPanel jPanelAccionesTipoMovimientoModulo;
	protected JPanel jPanelAccionesFormularioTipoMovimientoModulo;
    
	
	
	protected Integer iXPanelCamposTipoMovimientoModulo=0;
	protected Integer iYPanelCamposTipoMovimientoModulo=0;
	
	protected Integer iXPanelCamposOcultosTipoMovimientoModulo=0;
	protected Integer iYPanelCamposOcultosTipoMovimientoModulo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMovimientoModulo;
	public JButton jButtonModificarTipoMovimientoModulo;
	public JButton jButtonActualizarTipoMovimientoModulo;
    public JButton jButtonEliminarTipoMovimientoModulo;
	public JButton jButtonCancelarTipoMovimientoModulo;
    public JButton jButtonGuardarCambiosTipoMovimientoModulo;
	public JButton jButtonGuardarCambiosTablaTipoMovimientoModulo;
	protected JButton jButtonCerrarTipoMovimientoModulo;
	
	
	protected JButton jButtonProcesarInformacionTipoMovimientoModulo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMovimientoModulo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMovimientoModulo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMovimientoModulo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMovimientoModulo;
	protected JButton jButtonModificarToolBarTipoMovimientoModulo;
	protected JButton jButtonActualizarToolBarTipoMovimientoModulo;
    protected JButton jButtonEliminarToolBarTipoMovimientoModulo;
	protected JButton jButtonCancelarToolBarTipoMovimientoModulo;
    protected JButton jButtonGuardarCambiosToolBarTipoMovimientoModulo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMovimientoModulo;
	protected JButton jButtonCerrarToolBarTipoMovimientoModulo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMovimientoModulo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMovimientoModulo;
	protected JMenuItem jMenuItemModificarTipoMovimientoModulo;
	protected JMenuItem jMenuItemActualizarTipoMovimientoModulo;
    protected JMenuItem jMenuItemEliminarTipoMovimientoModulo;
	protected JMenuItem jMenuItemCancelarTipoMovimientoModulo;
    protected JMenuItem jMenuItemGuardarCambiosTipoMovimientoModulo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMovimientoModulo;
	protected JMenuItem jMenuItemCerrarTipoMovimientoModulo;
	protected JMenuItem jMenuItemDetalleCerrarTipoMovimientoModulo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMovimientoModulo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMovimientoModulo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMovimientoModulo;
	protected JMenuItem jMenuItemMostrarOcultarTipoMovimientoModulo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMovimientoModulo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMovimientoModulo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMovimientoModulo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMovimientoModulo;
	public JLabel jLabelIdTipoMovimientoModulo;
	public JTextFieldMe jTextFieldidTipoMovimientoModulo;
	public JButton jButtonidTipoMovimientoModuloBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoMovimientoModulo;
	public JLabel jLabelcodigoTipoMovimientoModulo;
	public JTextField jTextFieldcodigoTipoMovimientoModulo;
	public JButton jButtoncodigoTipoMovimientoModuloBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMovimientoModulo;
	public JLabel jLabelnombreTipoMovimientoModulo;
	public JTextArea jTextAreanombreTipoMovimientoModulo;
	public JScrollPane jscrollPanenombreTipoMovimientoModulo;
	public JButton jButtonnombreTipoMovimientoModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloTipoMovimientoModulo;
	public JLabel jLabelid_moduloTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTipoMovimientoModulo;
	public JButton jButtonid_moduloTipoMovimientoModulo= new JButtonMe();
	public JButton jButtonid_moduloTipoMovimientoModuloUpdate= new JButtonMe();
	public JButton jButtonid_moduloTipoMovimientoModuloBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMovimientoModulo;
	
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
	
	public TipoMovimientoModuloDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMovimientoModulo=new JPanel();
				this.jPanelAccionesFormularioTipoMovimientoModulo=new JPanel();
				this.jmenuBarDetalleTipoMovimientoModulo=new JMenuBar();
				this.jTtoolBarDetalleTipoMovimientoModulo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMovimientoModuloDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMovimientoModulo() {
		return this.jButtonActualizarToolBarTipoMovimientoModulo;
	}
	
	public JButton getjButtonEliminarToolBarTipoMovimientoModulo() {
		return this.jButtonEliminarToolBarTipoMovimientoModulo;
	}
	
	public JButton getjButtonCancelarToolBarTipoMovimientoModulo() {
		return this.jButtonCancelarToolBarTipoMovimientoModulo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMovimientoModulo() {
		return this.jButtonProcesarInformacionTipoMovimientoModulo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMovimientoModulo)	{
		this.jButtonProcesarInformacionTipoMovimientoModulo = jButtonProcesarInformacionTipoMovimientoModulo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMovimientoModulo() {
		return this.jComboBoxTiposAccionesTipoMovimientoModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMovimientoModulo(
			JComboBox jComboBoxTiposRelacionesTipoMovimientoModulo) {
		this.jComboBoxTiposRelacionesTipoMovimientoModulo = jComboBoxTiposRelacionesTipoMovimientoModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMovimientoModulo(
			JComboBox jComboBoxTiposAccionesTipoMovimientoModulo) {
		this.jComboBoxTiposAccionesTipoMovimientoModulo = jComboBoxTiposAccionesTipoMovimientoModulo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMovimientoModulo() {
		return this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMovimientoModulo(
			JComboBox jComboBoxTiposAccionesFormularioTipoMovimientoModulo) {
		this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo = jComboBoxTiposAccionesFormularioTipoMovimientoModulo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
		
		this.tipomovimientomoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimientomoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrocompraSessionBean=new ParametroCompraSessionBean();
		//this.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
		//this.secuencialSessionBean=new SecuencialSessionBean();
		//this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMovimientoModuloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movimiento Modulo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMovimientoModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMovimientoModulo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMovimientoModulo=new JButtonMe();
				this.jButtonModificarToolBarTipoMovimientoModulo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMovimientoModulo,this.jTtoolBarDetalleTipoMovimientoModulo,
							"actualizar","actualizar","Actualizar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMovimientoModulo,this.jTtoolBarDetalleTipoMovimientoModulo,
							"eliminar","eliminar","Eliminar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMovimientoModulo,this.jTtoolBarDetalleTipoMovimientoModulo,
							"cancelar","cancelar","Cancelar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMovimientoModulo,this.jTtoolBarDetalleTipoMovimientoModulo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMovimientoModulo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMovimientoModulo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMovimientoModulo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMovimientoModulo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMovimientoModulo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMovimientoModulo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMovimientoModulo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMovimientoModulo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMovimientoModulo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMovimientoModulo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMovimientoModulo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMovimientoModulo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMovimientoModulo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMovimientoModulo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMovimientoModulo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMovimientoModulo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMovimientoModulo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMovimientoModulo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMovimientoModulo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMovimientoModulo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMovimientoModulo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMovimientoModulo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMovimientoModulo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMovimientoModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMovimientoModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMovimientoModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMovimientoModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMovimientoModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMovimientoModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMovimientoModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMovimientoModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMovimientoModulo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMovimientoModulo.add(this.jMenuItemDetalleCerrarTipoMovimientoModulo);
		
		this.jmenuDetalleAccionesTipoMovimientoModulo.add(this.jMenuItemActualizarTipoMovimientoModulo);
		this.jmenuDetalleAccionesTipoMovimientoModulo.add(this.jMenuItemEliminarTipoMovimientoModulo);
		this.jmenuDetalleAccionesTipoMovimientoModulo.add(this.jMenuItemCancelarTipoMovimientoModulo);		
		
		//this.jmenuDetalleDatosTipoMovimientoModulo.add(this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo);				
		this.jmenuDetalleDatosTipoMovimientoModulo.add(this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo);				
				
		//this.jmenuDetalleAccionesTipoMovimientoModulo.add(this.jMenuItemGuardarCambiosTipoMovimientoModulo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMovimientoModulo.add(this.jmenuDetalleArchivoTipoMovimientoModulo);		
		this.jmenuBarDetalleTipoMovimientoModulo.add(this.jmenuDetalleAccionesTipoMovimientoModulo);		
		this.jmenuBarDetalleTipoMovimientoModulo.add(this.jmenuDetalleDatosTipoMovimientoModulo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoMovimientoModulo.add(this.jmenuDetalleTipoMovimientoModulo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMovimientoModulo);				
	}
	
	
	public void inicializarElementosCamposTipoMovimientoModulo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMovimientoModulo = new JLabelMe();
		jLabelIdTipoMovimientoModulo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMovimientoModulo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMovimientoModulo.setToolTipText(TipoMovimientoModuloConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMovimientoModulo= new GridBagLayout();

		this.jPanelidTipoMovimientoModulo.setLayout(this.gridaBagLayoutTipoMovimientoModulo);

		jTextFieldidTipoMovimientoModulo = new JTextFieldMe();
		jTextFieldidTipoMovimientoModulo.setText("Id");

		jTextFieldidTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoMovimientoModulo = new JLabelMe();
		this.jLabelcodigoTipoMovimientoModulo.setText(""+TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoMovimientoModulo.setToolTipText("Codigo");
		this.jLabelcodigoTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoMovimientoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoMovimientoModulo.setToolTipText(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoMovimientoModulo = new GridBagLayout();
		this.jPanelcodigoTipoMovimientoModulo.setLayout(this.gridaBagLayoutTipoMovimientoModulo);


		jTextFieldcodigoTipoMovimientoModulo= new JTextFieldMe();

		jTextFieldcodigoTipoMovimientoModulo.setEnabled(false);
		jTextFieldcodigoTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoMovimientoModuloBusqueda= new JButtonMe();
		this.jButtoncodigoTipoMovimientoModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMovimientoModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMovimientoModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoMovimientoModuloBusqueda.setText("U");
		this.jButtoncodigoTipoMovimientoModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoMovimientoModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoMovimientoModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoMovimientoModuloBusqueda"));

		if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoMovimientoModuloBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoMovimientoModulo = new JLabelMe();
		this.jLabelnombreTipoMovimientoModulo.setText(""+TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMovimientoModulo.setToolTipText("Nombre");
		this.jLabelnombreTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMovimientoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMovimientoModulo.setToolTipText(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMovimientoModulo = new GridBagLayout();
		this.jPanelnombreTipoMovimientoModulo.setLayout(this.gridaBagLayoutTipoMovimientoModulo);


		jTextAreanombreTipoMovimientoModulo= new JTextAreaMe();
		jTextAreanombreTipoMovimientoModulo.setEnabled(false);
		jTextAreanombreTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimientoModulo.setLineWrap(true);
		jTextAreanombreTipoMovimientoModulo.setWrapStyleWord(true);
		jTextAreanombreTipoMovimientoModulo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMovimientoModulo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMovimientoModulo = new JScrollPane(jTextAreanombreTipoMovimientoModulo);
		jscrollPanenombreTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoMovimientoModuloBusqueda= new JButtonMe();
		this.jButtonnombreTipoMovimientoModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMovimientoModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMovimientoModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMovimientoModuloBusqueda.setText("U");
		this.jButtonnombreTipoMovimientoModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMovimientoModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMovimientoModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMovimientoModuloBusqueda"));

		if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMovimientoModuloBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMovimientoModulo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_moduloTipoMovimientoModulo = new JLabelMe();
		this.jLabelid_moduloTipoMovimientoModulo.setText(""+TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTipoMovimientoModulo.setToolTipText("Modulo");
		this.jLabelid_moduloTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTipoMovimientoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTipoMovimientoModulo.setToolTipText(TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTipoMovimientoModulo = new GridBagLayout();
		this.jPanelid_moduloTipoMovimientoModulo.setLayout(this.gridaBagLayoutTipoMovimientoModulo);


		jComboBoxid_moduloTipoMovimientoModulo= new JComboBoxMe();
		jComboBoxid_moduloTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloTipoMovimientoModulo= new JButtonMe();
		this.jButtonid_moduloTipoMovimientoModulo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoMovimientoModulo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoMovimientoModulo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoMovimientoModulo.setText("Buscar");
		this.jButtonid_moduloTipoMovimientoModulo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTipoMovimientoModulo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoMovimientoModulo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoMovimientoModulo"));

		this.jButtonid_moduloTipoMovimientoModuloBusqueda= new JButtonMe();
		this.jButtonid_moduloTipoMovimientoModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMovimientoModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMovimientoModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoMovimientoModuloBusqueda.setText("U");
		this.jButtonid_moduloTipoMovimientoModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTipoMovimientoModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoMovimientoModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoMovimientoModuloBusqueda"));

		if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTipoMovimientoModuloBusqueda.setVisible(false);		}

		this.jButtonid_moduloTipoMovimientoModuloUpdate= new JButtonMe();
		this.jButtonid_moduloTipoMovimientoModuloUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMovimientoModuloUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMovimientoModuloUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoMovimientoModuloUpdate.setText("U");
		this.jButtonid_moduloTipoMovimientoModuloUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTipoMovimientoModuloUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoMovimientoModuloUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoMovimientoModuloUpdate"));



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
		//this.jInternalFrameDetalleTipoMovimientoModulo = new TipoMovimientoModuloBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Movimiento Modulo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMovimientoModulo= new GridBagLayout();
		

		
		String sToolTipTipoMovimientoModulo="";
		sToolTipTipoMovimientoModulo=TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMovimientoModulo+="(Contabilidad.TipoMovimientoModulo)";
		}
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMovimientoModulo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMovimientoModulo = new JButtonMe();
		this.jButtonModificarTipoMovimientoModulo = new JButtonMe();
        this.jButtonActualizarTipoMovimientoModulo = new JButtonMe();
        this.jButtonEliminarTipoMovimientoModulo = new JButtonMe();
        this.jButtonCancelarTipoMovimientoModulo = new JButtonMe();
        this.jButtonGuardarCambiosTipoMovimientoModulo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo = new JButtonMe();
		this.jButtonCerrarTipoMovimientoModulo = new JButtonMe();
		
		this.jScrollPanelDatosTipoMovimientoModulo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMovimientoModulo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMovimientoModulo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movimiento Modulo";
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento Modulos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMovimientoModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMovimientoModulo.setName("jPanelCamposTipoMovimientoModulo"); 

		this.jPanelCamposOcultosTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMovimientoModulo.setName("jPanelCamposOcultosTipoMovimientoModulo"); 

        this.jPanelAccionesTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMovimientoModulo.setToolTipText("Acciones");
        this.jPanelAccionesTipoMovimientoModulo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMovimientoModulo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMovimientoModulo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMovimientoModulo.setText("Nuevo");
		this.jButtonModificarTipoMovimientoModulo.setText("Editar");
        this.jButtonActualizarTipoMovimientoModulo.setText("Actualizar");
        this.jButtonEliminarTipoMovimientoModulo.setText("Eliminar");
        this.jButtonCancelarTipoMovimientoModulo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMovimientoModulo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.setText("Guardar");
		this.jButtonCerrarTipoMovimientoModulo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMovimientoModulo,"nuevo_button","Nuevo",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMovimientoModulo,"modificar_button","Editar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMovimientoModulo,"actualizar_button","Actualizar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMovimientoModulo,"eliminar_button","Eliminar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMovimientoModulo,"cancelar_button","Cancelar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMovimientoModulo,"guardarcambios_button","Guardar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMovimientoModulo,"guardarcambiostabla_button","Guardar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMovimientoModulo,"cerrar_button","Salir",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMovimientoModulo.setToolTipText("Nuevo"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMovimientoModulo.setToolTipText("Editar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMovimientoModulo.setToolTipText("Actualizar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMovimientoModulo.setToolTipText("Eliminar)"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMovimientoModulo.setToolTipText("Cancelar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMovimientoModulo.setToolTipText("Guardar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.setToolTipText("Guardar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMovimientoModulo.setToolTipText("Salir"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMovimientoModulo";
		inputMap = this.jButtonNuevoTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMovimientoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMovimientoModulo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMovimientoModulo";
		inputMap = this.jButtonActualizarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMovimientoModulo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMovimientoModulo";
		inputMap = this.jButtonEliminarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMovimientoModulo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMovimientoModulo";
		inputMap = this.jButtonCancelarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMovimientoModulo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMovimientoModulo";
		inputMap = this.jButtonCerrarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMovimientoModulo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMovimientoModulo";
		inputMap = this.jButtonGuardarCambiosTablaTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMovimientoModulo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMovimientoModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMovimientoModulo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMovimientoModulo.setToolTipText("Nuevo TipoMovimientoModulo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo.setToolTipText("Sin Cerrar Ventana TipoMovimientoModulo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMovimientoModulo.setText("Accion");
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMovimientoModulo = new JLabelMe();
		
		this.jLabelAccionesTipoMovimientoModulo.setText("Acciones");		
		this.jLabelAccionesTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMovimientoModulo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMovimientoModulo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMovimientoModulo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMovimientoModulo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMovimientoModulo = new GridBagLayout();
		
		this.jPanelCamposTipoMovimientoModulo.setLayout(gridaBagLayoutCamposTipoMovimientoModulo);
		this.jPanelCamposOcultosTipoMovimientoModulo.setLayout(gridaBagLayoutCamposOcultosTipoMovimientoModulo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMovimientoModulo.add(jLabelIdTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 1;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMovimientoModulo.add(jTextFieldidTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);


	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTipoMovimientoModulo.add(jLabelid_moduloTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 2;
		this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
		this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoMovimientoModulo.add(jButtonid_moduloTipoMovimientoModuloBusqueda, this.gridBagConstraintsTipoMovimientoModulo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 3;
		this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
		this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoMovimientoModulo.add(jButtonid_moduloTipoMovimientoModuloUpdate, this.gridBagConstraintsTipoMovimientoModulo);
	}

	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 1;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTipoMovimientoModulo.add(jComboBoxid_moduloTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);


	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoMovimientoModulo.add(jLabelcodigoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 2;
		this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
		this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoMovimientoModulo.add(jButtoncodigoTipoMovimientoModuloBusqueda, this.gridBagConstraintsTipoMovimientoModulo);
	}

	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 1;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoMovimientoModulo.add(jTextFieldcodigoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);


	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMovimientoModulo.add(jLabelnombreTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 2;
		this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
		this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMovimientoModulo.add(jButtonnombreTipoMovimientoModuloBusqueda, this.gridBagConstraintsTipoMovimientoModulo);
	}

	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = 1;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMovimientoModulo.add(jscrollPanenombreTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = iYPanelCamposTipoMovimientoModulo;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = iXPanelCamposTipoMovimientoModulo++;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimientoModulo.add(this.jPanelidTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(iXPanelCamposTipoMovimientoModulo % 1==0) {
		iXPanelCamposTipoMovimientoModulo=0;
		iYPanelCamposTipoMovimientoModulo++;
	}
	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = iYPanelCamposTipoMovimientoModulo;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = iXPanelCamposTipoMovimientoModulo++;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimientoModulo.add(this.jPanelid_moduloTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(iXPanelCamposTipoMovimientoModulo % 1==0) {
		iXPanelCamposTipoMovimientoModulo=0;
		iYPanelCamposTipoMovimientoModulo++;
	}
	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = iYPanelCamposTipoMovimientoModulo;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = iXPanelCamposTipoMovimientoModulo++;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimientoModulo.add(this.jPanelcodigoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(iXPanelCamposTipoMovimientoModulo % 1==0) {
		iXPanelCamposTipoMovimientoModulo=0;
		iYPanelCamposTipoMovimientoModulo++;
	}
	this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimientoModulo.gridy = iYPanelCamposTipoMovimientoModulo;
	this.gridBagConstraintsTipoMovimientoModulo.gridx = iXPanelCamposTipoMovimientoModulo++;
	this.gridBagConstraintsTipoMovimientoModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimientoModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimientoModulo.add(this.jPanelnombreTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);



	if(iXPanelCamposTipoMovimientoModulo % 1==0) {
		iXPanelCamposTipoMovimientoModulo=0;
		iYPanelCamposTipoMovimientoModulo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMovimientoModulo= new GridBagLayout();
		this.jPanelAccionesTipoMovimientoModulo.setLayout(gridaBagLayoutAccionesTipoMovimientoModulo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMovimientoModulo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMovimientoModulo.setLayout(gridaBagLayoutAccionesFormularioTipoMovimientoModulo);
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMovimientoModulo.add(this.jComboBoxTiposAccionesFormularioTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMovimientoModulo.add(this.jCheckBoxPostAccionNuevoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMovimientoModulo.add(this.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMovimientoModulo.add(this.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMovimientoModulo.add(this.jButtonModificarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);							

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMovimientoModulo.add(this.jButtonEliminarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
			
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMovimientoModulo.add(this.jButtonActualizarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);


		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMovimientoModulo.add(this.jButtonGuardarCambiosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);	
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMovimientoModulo.add(this.jButtonCancelarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMovimientoModulo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMovimientoModulo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();						
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;		
			//this.gridBagConstraintsTipoMovimientoModulo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMovimientoModulo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimientoModulo.gridx =0;
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMovimientoModulo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMovimientoModulo = new TipoMovimientoModuloBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Movimiento Modulo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Movimiento Modulo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movimiento Modulo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMovimientoModuloModel tipomovimientomoduloModel=new TipoMovimientoModuloModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMovimientoModuloModel.TipoMovimientoModuloFocusTraversalPolicy tipomovimientomoduloFocusTraversalPolicy = tipomovimientomoduloModel.new TipoMovimientoModuloFocusTraversalPolicy(this);
			
			//tipomovimientomoduloFocusTraversalPolicy.settipomovimientomoduloJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomovimientomoduloModel);
			
			
			this.jContentPaneDetalleTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMovimientoModulo = new GridBagLayout();	
			this.jContentPaneDetalleTipoMovimientoModulo.setLayout(gridaBagLayoutDetalleTipoMovimientoModulo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMovimientoModulo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMovimientoModulo.add(jTtoolBarDetalleTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMovimientoModulo=   new JScrollPane(jContentPaneDetalleTipoMovimientoModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMovimientoModulo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	        
			this.jContentPaneDetalleTipoMovimientoModulo.add(jPanelCamposTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);
			
			
			
			
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
						&& tipomovimientomoduloSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(this.puedeCargarPorParteFacturaProveedorServicio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCompra(this.puedeCargarPorParteParametroCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSecuencial(this.puedeCargarPorParteSecuencial,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoDocumento(this.puedeCargarPorParteTipoDocumento,false,-1);
					
					if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMovimientoModulo= new GridBagConstraints();
						this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
						this.jContentPaneDetalleTipoMovimientoModulo.add(this.jTabbedPaneRelacionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMovimientoModulo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSecuencial(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoDocumento(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMovimientoModulo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
					this.gridBagConstraintsTipoMovimientoModulo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMovimientoModulo.add(jPanelCamposOcultosTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);
				
					this.jPanelCamposOcultosTipoMovimientoModulo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	        this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMovimientoModulo.add(this.jPanelAccionesFormularioTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);							
			
			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
	        this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMovimientoModulo.add(this.jPanelAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMovimientoModulo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMovimientoModulo=   new JScrollPane(this.jPanelCamposTipoMovimientoModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMovimientoModulo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
			
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
			
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMovimientoModulo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMovimientoModulo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
		this.facturaproveedorservicioSessionBean.setConGuardarRelaciones(false);
		this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(true);

		this.facturaproveedorservicioBeanSwingJInternalFrame=null;//new FacturaProveedorServicioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaproveedorservicioBeanSwingJInternalFramePopup=new FacturaProveedorServicioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaproveedorservicioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {

				FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(true);

				this.facturaproveedorservicioBeanSwingJInternalFrame=new FacturaProveedorServicioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.facturaproveedorservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaproveedorservicioBeanSwingJInternalFrame.setfacturaproveedorservicioSessionBean(this.facturaproveedorservicioSessionBean);

				//this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				//this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
				//this.jContentPaneDetalleTipoMovimientoModulo.add(this.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMovimientoModulo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Factura Proveedors",this.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.setComponentAt(iIndexTab,this.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(false);
				this.facturaproveedorservicioBeanSwingJInternalFrame=null;//new FacturaProveedorServicioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaProveedorServicio) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Factura Proveedors",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocompraSessionBean=new ParametroCompraSessionBean();
		this.parametrocompraSessionBean.setConGuardarRelaciones(false);
		this.parametrocompraSessionBean.setEsGuardarRelacionado(true);

		this.parametrocompraBeanSwingJInternalFrame=null;//new ParametroCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocompraBeanSwingJInternalFramePopup=new ParametroCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocompraSessionBean.getEsGuardarRelacionado()) {

				ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocompraSessionBean.setEsGuardarRelacionado(true);

				this.parametrocompraBeanSwingJInternalFrame=new ParametroCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocompraBeanSwingJInternalFrame.setparametrocompraSessionBean(this.parametrocompraSessionBean);

				//this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				//this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
				//this.jContentPaneDetalleTipoMovimientoModulo.add(this.parametrocompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMovimientoModulo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Parametro Compraes",this.parametrocompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.setComponentAt(iIndexTab,this.parametrocompraBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocompraSessionBean.setEsGuardarRelacionado(false);
				this.parametrocompraBeanSwingJInternalFrame=null;//new ParametroCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCompra) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Parametro Compraes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSecuencial(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.secuencialSessionBean=new SecuencialSessionBean();
		this.secuencialSessionBean.setConGuardarRelaciones(false);
		this.secuencialSessionBean.setEsGuardarRelacionado(true);

		this.secuencialBeanSwingJInternalFrame=null;//new SecuencialBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.secuencialBeanSwingJInternalFramePopup=new SecuencialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.secuencialBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.secuencialSessionBean.getEsGuardarRelacionado()) {

				SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
				SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.secuencialSessionBean.setEsGuardarRelacionado(true);

				this.secuencialBeanSwingJInternalFrame=new SecuencialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.secuencialBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.secuencialBeanSwingJInternalFrame.setsecuencialSessionBean(this.secuencialSessionBean);

				//this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				//this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
				//this.jContentPaneDetalleTipoMovimientoModulo.add(this.secuencialBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMovimientoModulo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Secuenciales",this.secuencialBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.setComponentAt(iIndexTab,this.secuencialBeanSwingJInternalFrame.getContentPane());
				}

				//SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.secuencialSessionBean.setEsGuardarRelacionado(false);
				this.secuencialBeanSwingJInternalFrame=null;//new SecuencialBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSecuencial) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Secuenciales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTipoDocumento(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		this.tipodocumentoSessionBean.setConGuardarRelaciones(false);
		this.tipodocumentoSessionBean.setEsGuardarRelacionado(true);

		this.tipodocumentoBeanSwingJInternalFrame=null;//new TipoDocumentoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tipodocumentoBeanSwingJInternalFramePopup=new TipoDocumentoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tipodocumentoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {

				TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
				TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tipodocumentoSessionBean.setEsGuardarRelacionado(true);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tipodocumentoBeanSwingJInternalFrame.settipodocumentoSessionBean(this.tipodocumentoSessionBean);

				//this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				//this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
				//this.jContentPaneDetalleTipoMovimientoModulo.add(this.tipodocumentoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMovimientoModulo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Tipo Documentos",this.tipodocumentoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.setComponentAt(iIndexTab,this.tipodocumentoBeanSwingJInternalFrame.getContentPane());
				}

				//TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tipodocumentoSessionBean.setEsGuardarRelacionado(false);
				this.tipodocumentoBeanSwingJInternalFrame=null;//new TipoDocumentoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTipoDocumento) {
					this.jTabbedPaneRelacionesTipoMovimientoModulo.add("Tipo Documentos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroCompraBeanSwingJInternalFrame(List<TipoMovimientoModulo> tipomovimientomodulos,TipoMovimientoModulo tipomovimientomodulo,ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocompraBeanSwingJInternalFrame=new ParametroCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocompraBeanSwingJInternalFrame.getParametroCompraLogic().setConnexion(this.tipomovimientomoduloLogic.getConnexion());

					parametrocompraBeanSwingJInternalFrame.settipomovimientomodulosForeignKey(tipomovimientomodulos);
					parametrocompraBeanSwingJInternalFrame.settipomovimientomoduloForeignKey(tipomovimientomodulo);
					parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
					parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setlidTipoMovimientoModuloActual(tipomovimientomodulo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocompraBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCompra(parametrocompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMovimientoModulo(true);
					parametrocompraBeanSwingJInternalFrame.setid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo(tipomovimientomodulo.getId());

					if(!this.conCargarFormDetalle) {
						parametrocompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocompraBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMovimientoModuloForeignKey(tipomovimientomodulo,1,false,true,true);
					parametrocompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMovimientoModulo");
					parametrocompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMovimientoModulo");
					parametrocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCompra(true);
					parametrocompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCompra("n",parametrocompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocompraBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocompraBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCompra("relacionado");
					} else {
						parametrocompraBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCompra("no_relacionado");
					}

					parametrocompraBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaProveedorServicioBeanSwingJInternalFrame(List<TipoMovimientoModulo> tipomovimientomodulos,TipoMovimientoModulo tipomovimientomodulo,FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaproveedorservicioBeanSwingJInternalFrame=new FacturaProveedorServicioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaproveedorservicioBeanSwingJInternalFrame.getFacturaProveedorServicioLogic().setConnexion(this.tipomovimientomoduloLogic.getConnexion());

					facturaproveedorservicioBeanSwingJInternalFrame.settipomovimientomodulosForeignKey(tipomovimientomodulos);
					facturaproveedorservicioBeanSwingJInternalFrame.settipomovimientomoduloForeignKey(tipomovimientomodulo);
					facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
					facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setlidTipoMovimientoModuloActual(tipomovimientomodulo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaproveedorservicioBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaProveedorServicio(facturaproveedorservicioBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaproveedorservicioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMovimientoModulo(true);
					facturaproveedorservicioBeanSwingJInternalFrame.setid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo(tipomovimientomodulo.getId());

					if(!this.conCargarFormDetalle) {
						facturaproveedorservicioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaproveedorservicioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMovimientoModuloForeignKey(tipomovimientomodulo,1,false,true,true);
					facturaproveedorservicioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaproveedorservicioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMovimientoModulo");
					facturaproveedorservicioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMovimientoModulo");
					facturaproveedorservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedorServicio(true);
					facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaProveedorServicio("n",facturaproveedorservicioBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaproveedorservicioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaproveedorservicioBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaproveedorservicioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedorServicio("relacionado");
					} else {
						facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedorServicio("no_relacionado");
					}

					facturaproveedorservicioBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaProveedorServicio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSecuencialBeanSwingJInternalFrame(List<TipoMovimientoModulo> tipomovimientomodulos,TipoMovimientoModulo tipomovimientomodulo,SecuencialBeanSwingJInternalFrame secuencialBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//secuencialBeanSwingJInternalFrame=new SecuencialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					secuencialBeanSwingJInternalFrame.getSecuencialLogic().setConnexion(this.tipomovimientomoduloLogic.getConnexion());

					secuencialBeanSwingJInternalFrame.settipomovimientomodulosForeignKey(tipomovimientomodulos);
					secuencialBeanSwingJInternalFrame.settipomovimientomoduloForeignKey(tipomovimientomodulo);
					secuencialBeanSwingJInternalFrame.secuencialSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
					secuencialBeanSwingJInternalFrame.secuencialSessionBean.setlidTipoMovimientoModuloActual(tipomovimientomodulo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					secuencialBeanSwingJInternalFrame.cargarCombosForeignKeySecuencial(secuencialBeanSwingJInternalFrame.isCargarCombosDependencia);
					secuencialBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMovimientoModulo(true);
					secuencialBeanSwingJInternalFrame.setid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo(tipomovimientomodulo.getId());

					if(!this.conCargarFormDetalle) {
						secuencialBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					secuencialBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMovimientoModuloForeignKey(tipomovimientomodulo,1,false,true,true);
					secuencialBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					secuencialBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMovimientoModulo");
					secuencialBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMovimientoModulo");
					secuencialBeanSwingJInternalFrame.inicializarActualizarBindingTablaSecuencial(true);
					secuencialBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSecuencial("n",secuencialBeanSwingJInternalFrame.isGuardarCambiosEnLote, secuencialBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					secuencialBeanSwingJInternalFrame.setAutoscrolls(true);
					secuencialBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						secuencialBeanSwingJInternalFrame.actualizarEstadoPanelsSecuencial("relacionado");
					} else {
						secuencialBeanSwingJInternalFrame.actualizarEstadoPanelsSecuencial("no_relacionado");
					}

					secuencialBeanSwingJInternalFrame.getjButtonRecargarInformacionSecuencial().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTipoDocumentoBeanSwingJInternalFrame(List<TipoMovimientoModulo> tipomovimientomodulos,TipoMovimientoModulo tipomovimientomodulo,TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.tipomovimientomoduloLogic.getConnexion());

					tipodocumentoBeanSwingJInternalFrame.settipomovimientomodulosForeignKey(tipomovimientomodulos);
					tipodocumentoBeanSwingJInternalFrame.settipomovimientomoduloForeignKey(tipomovimientomodulo);
					tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
					tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.setlidTipoMovimientoModuloActual(tipomovimientomodulo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tipodocumentoBeanSwingJInternalFrame.cargarCombosForeignKeyTipoDocumento(tipodocumentoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tipodocumentoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMovimientoModulo(true);
					tipodocumentoBeanSwingJInternalFrame.setid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo(tipomovimientomodulo.getId());

					if(!this.conCargarFormDetalle) {
						tipodocumentoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tipodocumentoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMovimientoModuloForeignKey(tipomovimientomodulo,1,false,true,true);
					tipodocumentoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMovimientoModulo");
					tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMovimientoModulo");
					tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento(true);
					tipodocumentoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTipoDocumento("n",tipodocumentoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tipodocumentoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tipodocumentoBeanSwingJInternalFrame.setAutoscrolls(true);
					tipodocumentoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tipodocumentoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoDocumento("relacionado");
					} else {
						tipodocumentoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoDocumento("no_relacionado");
					}

					tipodocumentoBeanSwingJInternalFrame.getjButtonRecargarInformacionTipoDocumento().setVisible(false);

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
