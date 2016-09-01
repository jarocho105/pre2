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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoListaPrecioConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoListaPrecioDetalleFormJInternalFrame extends TipoListaPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoListaPrecio;
	
	protected JMenuBar jmenuBarDetalleTipoListaPrecio;
	
	protected JMenu jmenuDetalleTipoListaPrecio;
	protected JMenu jmenuDetalleArchivoTipoListaPrecio;
	protected JMenu jmenuDetalleAccionesTipoListaPrecio;
	protected JMenu jmenuDetalleDatosTipoListaPrecio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoListaPrecio;	
	protected GridBagConstraints gridBagConstraintsTipoListaPrecio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoListaPrecioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoListaPrecio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoListaPrecioSessionBean tipolistaprecioSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoListaPrecioLogic tipolistaprecioLogic;
	
	public JScrollPane jScrollPanelDatosTipoListaPrecio;
	public JScrollPane jScrollPanelDatosEdicionTipoListaPrecio;
	public JScrollPane jScrollPanelDatosGeneralTipoListaPrecio;
	
	protected JPanel jPanelCamposTipoListaPrecio;    
	protected JPanel jPanelCamposOcultosTipoListaPrecio;    	
	protected JPanel jPanelAccionesTipoListaPrecio;
	protected JPanel jPanelAccionesFormularioTipoListaPrecio;
    
	
	
	protected Integer iXPanelCamposTipoListaPrecio=0;
	protected Integer iYPanelCamposTipoListaPrecio=0;
	
	protected Integer iXPanelCamposOcultosTipoListaPrecio=0;
	protected Integer iYPanelCamposOcultosTipoListaPrecio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoListaPrecio;
	public JButton jButtonModificarTipoListaPrecio;
	public JButton jButtonActualizarTipoListaPrecio;
    public JButton jButtonEliminarTipoListaPrecio;
	public JButton jButtonCancelarTipoListaPrecio;
    public JButton jButtonGuardarCambiosTipoListaPrecio;
	public JButton jButtonGuardarCambiosTablaTipoListaPrecio;
	protected JButton jButtonCerrarTipoListaPrecio;
	
	
	protected JButton jButtonProcesarInformacionTipoListaPrecio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoListaPrecio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoListaPrecio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoListaPrecio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoListaPrecio;
	protected JButton jButtonModificarToolBarTipoListaPrecio;
	protected JButton jButtonActualizarToolBarTipoListaPrecio;
    protected JButton jButtonEliminarToolBarTipoListaPrecio;
	protected JButton jButtonCancelarToolBarTipoListaPrecio;
    protected JButton jButtonGuardarCambiosToolBarTipoListaPrecio;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoListaPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoListaPrecio;
	protected JButton jButtonCerrarToolBarTipoListaPrecio;
	
	protected JButton jButtonProcesarInformacionToolBarTipoListaPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoListaPrecio;
	protected JMenuItem jMenuItemModificarTipoListaPrecio;
	protected JMenuItem jMenuItemActualizarTipoListaPrecio;
    protected JMenuItem jMenuItemEliminarTipoListaPrecio;
	protected JMenuItem jMenuItemCancelarTipoListaPrecio;
    protected JMenuItem jMenuItemGuardarCambiosTipoListaPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoListaPrecio;
	protected JMenuItem jMenuItemCerrarTipoListaPrecio;
	protected JMenuItem jMenuItemDetalleCerrarTipoListaPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoListaPrecio;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoListaPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoListaPrecio;
	protected JMenuItem jMenuItemMostrarOcultarTipoListaPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoListaPrecio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoListaPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoListaPrecio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoListaPrecio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoListaPrecio;
	public JLabel jLabelIdTipoListaPrecio;
	public JLabel jLabelidTipoListaPrecio;
	public JButton jButtonidTipoListaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoListaPrecio;
	public JLabel jLabelcodigoTipoListaPrecio;
	public JTextArea jTextAreacodigoTipoListaPrecio;
	public JScrollPane jscrollPanecodigoTipoListaPrecio;
	public JButton jButtoncodigoTipoListaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoListaPrecio;
	public JLabel jLabelnombreTipoListaPrecio;
	public JTextArea jTextAreanombreTipoListaPrecio;
	public JScrollPane jscrollPanenombreTipoListaPrecio;
	public JButton jButtonnombreTipoListaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeTipoListaPrecio;
	public JLabel jLabelfecha_desdeTipoListaPrecio;
	//public JFormattedTextField jDateChooserfecha_desdeTipoListaPrecio;

	public JDateChooser jDateChooserfecha_desdeTipoListaPrecio;
	public JButton jButtonfecha_desdeTipoListaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaTipoListaPrecio;
	public JLabel jLabelfecha_hastaTipoListaPrecio;
	//public JFormattedTextField jDateChooserfecha_hastaTipoListaPrecio;

	public JDateChooser jDateChooserfecha_hastaTipoListaPrecio;
	public JButton jButtonfecha_hastaTipoListaPrecioBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoTipoListaPrecio;
	public JLabel jLabelesta_activoTipoListaPrecio;
	public JCheckBox jCheckBoxesta_activoTipoListaPrecio;
	public JButton jButtonesta_activoTipoListaPrecioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoListaPrecio;
	public JLabel jLabeldescripcionTipoListaPrecio;
	public JTextArea jTextAreadescripcionTipoListaPrecio;
	public JScrollPane jscrollPanedescripcionTipoListaPrecio;
	public JButton jButtondescripcionTipoListaPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoListaPrecio;
	public JLabel jLabelid_empresaTipoListaPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoListaPrecio;
	public JButton jButtonid_empresaTipoListaPrecio= new JButtonMe();
	public JButton jButtonid_empresaTipoListaPrecioUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoListaPrecioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoListaPrecio;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoListaPrecioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoListaPrecio=new JPanel();
				this.jPanelAccionesFormularioTipoListaPrecio=new JPanel();
				this.jmenuBarDetalleTipoListaPrecio=new JMenuBar();
				this.jTtoolBarDetalleTipoListaPrecio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoListaPrecioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoListaPrecio() {
		return this.jButtonActualizarToolBarTipoListaPrecio;
	}
	
	public JButton getjButtonEliminarToolBarTipoListaPrecio() {
		return this.jButtonEliminarToolBarTipoListaPrecio;
	}
	
	public JButton getjButtonCancelarToolBarTipoListaPrecio() {
		return this.jButtonCancelarToolBarTipoListaPrecio;
	}		
	
	public JButton getjButtonProcesarInformacionTipoListaPrecio() {
		return this.jButtonProcesarInformacionTipoListaPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoListaPrecio)	{
		this.jButtonProcesarInformacionTipoListaPrecio = jButtonProcesarInformacionTipoListaPrecio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoListaPrecio() {
		return this.jComboBoxTiposAccionesTipoListaPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoListaPrecio(
			JComboBox jComboBoxTiposRelacionesTipoListaPrecio) {
		this.jComboBoxTiposRelacionesTipoListaPrecio = jComboBoxTiposRelacionesTipoListaPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoListaPrecio(
			JComboBox jComboBoxTiposAccionesTipoListaPrecio) {
		this.jComboBoxTiposAccionesTipoListaPrecio = jComboBoxTiposAccionesTipoListaPrecio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoListaPrecio() {
		return this.jComboBoxTiposAccionesFormularioTipoListaPrecio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoListaPrecio(
			JComboBox jComboBoxTiposAccionesFormularioTipoListaPrecio) {
		this.jComboBoxTiposAccionesFormularioTipoListaPrecio = jComboBoxTiposAccionesFormularioTipoListaPrecio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
		
		this.tipolistaprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolistaprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolistaprecioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoListaPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Lista Precio MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoListaPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoListaPrecio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoListaPrecio=new JButtonMe();
				this.jButtonModificarToolBarTipoListaPrecio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoListaPrecio,this.jTtoolBarDetalleTipoListaPrecio,
							"actualizar","actualizar","Actualizar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoListaPrecio,this.jTtoolBarDetalleTipoListaPrecio,
							"eliminar","eliminar","Eliminar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoListaPrecio,this.jTtoolBarDetalleTipoListaPrecio,
							"cancelar","cancelar","Cancelar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoListaPrecio,this.jTtoolBarDetalleTipoListaPrecio,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoListaPrecio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoListaPrecio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoListaPrecio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoListaPrecio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoListaPrecio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoListaPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoListaPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoListaPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoListaPrecio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoListaPrecio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoListaPrecio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoListaPrecio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoListaPrecio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoListaPrecio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoListaPrecio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoListaPrecio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoListaPrecio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoListaPrecio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoListaPrecio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoListaPrecio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoListaPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoListaPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoListaPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoListaPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoListaPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoListaPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoListaPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoListaPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoListaPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoListaPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoListaPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoListaPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoListaPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoListaPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoListaPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoListaPrecio.add(this.jMenuItemDetalleCerrarTipoListaPrecio);
		
		this.jmenuDetalleAccionesTipoListaPrecio.add(this.jMenuItemActualizarTipoListaPrecio);
		this.jmenuDetalleAccionesTipoListaPrecio.add(this.jMenuItemEliminarTipoListaPrecio);
		this.jmenuDetalleAccionesTipoListaPrecio.add(this.jMenuItemCancelarTipoListaPrecio);		
		
		//this.jmenuDetalleDatosTipoListaPrecio.add(this.jMenuItemDetalleAbrirOrderByTipoListaPrecio);				
		this.jmenuDetalleDatosTipoListaPrecio.add(this.jMenuItemDetalleMostarOcultarTipoListaPrecio);				
				
		//this.jmenuDetalleAccionesTipoListaPrecio.add(this.jMenuItemGuardarCambiosTipoListaPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoListaPrecio.add(this.jmenuDetalleArchivoTipoListaPrecio);		
		this.jmenuBarDetalleTipoListaPrecio.add(this.jmenuDetalleAccionesTipoListaPrecio);		
		this.jmenuBarDetalleTipoListaPrecio.add(this.jmenuDetalleDatosTipoListaPrecio);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoListaPrecio.add(this.jmenuDetalleTipoListaPrecio);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoListaPrecio);				
	}
	
	
	public void inicializarElementosCamposTipoListaPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoListaPrecio = new JLabelMe();
		jLabelIdTipoListaPrecio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoListaPrecio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoListaPrecio= new GridBagLayout();

		this.jPanelidTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);

		jLabelidTipoListaPrecio = new JLabel();
		jLabelidTipoListaPrecio.setText("Id");

		jLabelidTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoListaPrecio = new JLabelMe();
		this.jLabelcodigoTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoListaPrecio.setToolTipText("Codigo");
		this.jLabelcodigoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPanelcodigoTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		jTextAreacodigoTipoListaPrecio= new JTextAreaMe();
		jTextAreacodigoTipoListaPrecio.setEnabled(false);
		jTextAreacodigoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoListaPrecio.setLineWrap(true);
		jTextAreacodigoTipoListaPrecio.setWrapStyleWord(true);
		jTextAreacodigoTipoListaPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoTipoListaPrecio.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoTipoListaPrecio = new JScrollPane(jTextAreacodigoTipoListaPrecio);
		jscrollPanecodigoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtoncodigoTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoListaPrecioBusqueda.setText("U");
		this.jButtoncodigoTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoListaPrecioBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoListaPrecio = new JLabelMe();
		this.jLabelnombreTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoListaPrecio.setToolTipText("Nombre");
		this.jLabelnombreTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPanelnombreTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		jTextAreanombreTipoListaPrecio= new JTextAreaMe();
		jTextAreanombreTipoListaPrecio.setEnabled(false);
		jTextAreanombreTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoListaPrecio.setLineWrap(true);
		jTextAreanombreTipoListaPrecio.setWrapStyleWord(true);
		jTextAreanombreTipoListaPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoListaPrecio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoListaPrecio = new JScrollPane(jTextAreanombreTipoListaPrecio);
		jscrollPanenombreTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtonnombreTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoListaPrecioBusqueda.setText("U");
		this.jButtonnombreTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoListaPrecioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_desdeTipoListaPrecio = new JLabelMe();
		this.jLabelfecha_desdeTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeTipoListaPrecio.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPanelfecha_desdeTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		//jFormattedTextFieldfecha_desdeTipoListaPrecio= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeTipoListaPrecio= new JDateChooser();
		jDateChooserfecha_desdeTipoListaPrecio.setEnabled(false);
		jDateChooserfecha_desdeTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeTipoListaPrecio.setDate(new Date());
		jDateChooserfecha_desdeTipoListaPrecio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeTipoListaPrecio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtonfecha_desdeTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeTipoListaPrecioBusqueda.setText("U");
		this.jButtonfecha_desdeTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeTipoListaPrecioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaTipoListaPrecio = new JLabelMe();
		this.jLabelfecha_hastaTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaTipoListaPrecio.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPanelfecha_hastaTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		//jFormattedTextFieldfecha_hastaTipoListaPrecio= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaTipoListaPrecio= new JDateChooser();
		jDateChooserfecha_hastaTipoListaPrecio.setEnabled(false);
		jDateChooserfecha_hastaTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaTipoListaPrecio.setDate(new Date());
		jDateChooserfecha_hastaTipoListaPrecio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaTipoListaPrecio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtonfecha_hastaTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaTipoListaPrecioBusqueda.setText("U");
		this.jButtonfecha_hastaTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaTipoListaPrecioBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoTipoListaPrecio = new JLabelMe();
		this.jLabelesta_activoTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoTipoListaPrecio.setToolTipText("Esta Activo");
		this.jLabelesta_activoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPanelesta_activoTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		jCheckBoxesta_activoTipoListaPrecio= new JCheckBoxMe();
		jCheckBoxesta_activoTipoListaPrecio.setEnabled(false);

		jCheckBoxesta_activoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtonesta_activoTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoTipoListaPrecioBusqueda.setText("U");
		this.jButtonesta_activoTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoTipoListaPrecioBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoListaPrecio = new JLabelMe();
		this.jLabeldescripcionTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoListaPrecio.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPaneldescripcionTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		jTextAreadescripcionTipoListaPrecio= new JTextAreaMe();
		jTextAreadescripcionTipoListaPrecio.setEnabled(false);
		jTextAreadescripcionTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoListaPrecio.setLineWrap(true);
		jTextAreadescripcionTipoListaPrecio.setWrapStyleWord(true);
		jTextAreadescripcionTipoListaPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoListaPrecio.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoListaPrecio = new JScrollPane(jTextAreadescripcionTipoListaPrecio);
		jscrollPanedescripcionTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtondescripcionTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoListaPrecioBusqueda.setText("U");
		this.jButtondescripcionTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoListaPrecioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoListaPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoListaPrecio = new JLabelMe();
		this.jLabelid_empresaTipoListaPrecio.setText(""+TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoListaPrecio.setToolTipText("Empresa");
		this.jLabelid_empresaTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoListaPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoListaPrecio.setToolTipText(TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		this.jPanelid_empresaTipoListaPrecio.setLayout(this.gridaBagLayoutTipoListaPrecio);


		jComboBoxid_empresaTipoListaPrecio= new JComboBoxMe();
		jComboBoxid_empresaTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoListaPrecio.setEnabled(false);

		this.jButtonid_empresaTipoListaPrecio= new JButtonMe();
		this.jButtonid_empresaTipoListaPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoListaPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoListaPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoListaPrecio.setText("Buscar");
		this.jButtonid_empresaTipoListaPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoListaPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoListaPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoListaPrecio"));

		this.jButtonid_empresaTipoListaPrecioBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoListaPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoListaPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoListaPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoListaPrecioBusqueda.setText("U");
		this.jButtonid_empresaTipoListaPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoListaPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoListaPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoListaPrecioBusqueda"));

		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoListaPrecioBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoListaPrecioUpdate= new JButtonMe();
		this.jButtonid_empresaTipoListaPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoListaPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoListaPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoListaPrecioUpdate.setText("U");
		this.jButtonid_empresaTipoListaPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoListaPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoListaPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoListaPrecioUpdate"));



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
		//this.jInternalFrameDetalleTipoListaPrecio = new TipoListaPrecioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Lista Precio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoListaPrecio= new GridBagLayout();
		

		
		String sToolTipTipoListaPrecio="";
		sToolTipTipoListaPrecio=TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoListaPrecio+="(Inventario.TipoListaPrecio)";
		}
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoListaPrecio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoListaPrecio = new JButtonMe();
		this.jButtonModificarTipoListaPrecio = new JButtonMe();
        this.jButtonActualizarTipoListaPrecio = new JButtonMe();
        this.jButtonEliminarTipoListaPrecio = new JButtonMe();
        this.jButtonCancelarTipoListaPrecio = new JButtonMe();
        this.jButtonGuardarCambiosTipoListaPrecio = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoListaPrecio = new JButtonMe();
		this.jButtonCerrarTipoListaPrecio = new JButtonMe();
		
		this.jScrollPanelDatosTipoListaPrecio = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoListaPrecio = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoListaPrecio = new JScrollPane();
				
		
		
		this.jPanelCamposTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Lista Precio";
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Lista Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoListaPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoListaPrecio.setName("jPanelCamposTipoListaPrecio"); 

		this.jPanelCamposOcultosTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoListaPrecio.setName("jPanelCamposOcultosTipoListaPrecio"); 

        this.jPanelAccionesTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoListaPrecio.setToolTipText("Acciones");
        this.jPanelAccionesTipoListaPrecio.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoListaPrecio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoListaPrecio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoListaPrecio.setText("Nuevo");
		this.jButtonModificarTipoListaPrecio.setText("Editar");
        this.jButtonActualizarTipoListaPrecio.setText("Actualizar");
        this.jButtonEliminarTipoListaPrecio.setText("Eliminar");
        this.jButtonCancelarTipoListaPrecio.setText("Cancelar");
        this.jButtonGuardarCambiosTipoListaPrecio.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoListaPrecio.setText("Guardar");
		this.jButtonCerrarTipoListaPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoListaPrecio,"nuevo_button","Nuevo",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoListaPrecio,"modificar_button","Editar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoListaPrecio,"actualizar_button","Actualizar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoListaPrecio,"eliminar_button","Eliminar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoListaPrecio,"cancelar_button","Cancelar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoListaPrecio,"guardarcambios_button","Guardar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoListaPrecio,"guardarcambiostabla_button","Guardar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoListaPrecio,"cerrar_button","Salir",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoListaPrecio.setToolTipText("Nuevo"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoListaPrecio.setToolTipText("Editar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoListaPrecio.setToolTipText("Actualizar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoListaPrecio.setToolTipText("Eliminar)"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoListaPrecio.setToolTipText("Cancelar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoListaPrecio.setToolTipText("Guardar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoListaPrecio.setToolTipText("Guardar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoListaPrecio.setToolTipText("Salir"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoListaPrecio";
		inputMap = this.jButtonNuevoTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoListaPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoListaPrecio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoListaPrecio";
		inputMap = this.jButtonActualizarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoListaPrecio"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoListaPrecio";
		inputMap = this.jButtonEliminarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoListaPrecio"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoListaPrecio";
		inputMap = this.jButtonCancelarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoListaPrecio"));
		
		//CERRAR		
		sMapKey = "CerrarTipoListaPrecio";
		inputMap = this.jButtonCerrarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoListaPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoListaPrecio";
		inputMap = this.jButtonGuardarCambiosTablaTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoListaPrecio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoListaPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoListaPrecio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoListaPrecio.setToolTipText("Nuevo TipoListaPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoListaPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoListaPrecio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoListaPrecio.setToolTipText("Sin Cerrar Ventana TipoListaPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoListaPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoListaPrecio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoListaPrecio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoListaPrecio.setText("Accion");
		this.jComboBoxTiposAccionesTipoListaPrecio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoListaPrecio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoListaPrecio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoListaPrecio = new JLabelMe();
		
		this.jLabelAccionesTipoListaPrecio.setText("Acciones");		
		this.jLabelAccionesTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoListaPrecio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoListaPrecio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoListaPrecio=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoListaPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoListaPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoListaPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoListaPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoListaPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoListaPrecio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoListaPrecio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoListaPrecio = new GridBagLayout();
		
		this.jPanelCamposTipoListaPrecio.setLayout(gridaBagLayoutCamposTipoListaPrecio);
		this.jPanelCamposOcultosTipoListaPrecio.setLayout(gridaBagLayoutCamposOcultosTipoListaPrecio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoListaPrecio.add(jLabelIdTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoListaPrecio.add(jLabelidTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoListaPrecio.add(jLabelid_empresaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoListaPrecio.add(jButtonid_empresaTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 3;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoListaPrecio.add(jButtonid_empresaTipoListaPrecioUpdate, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoListaPrecio.add(jComboBoxid_empresaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoListaPrecio.add(jLabelcodigoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoListaPrecio.add(jButtoncodigoTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoListaPrecio.add(jscrollPanecodigoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoListaPrecio.add(jLabelnombreTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoListaPrecio.add(jButtonnombreTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoListaPrecio.add(jscrollPanenombreTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeTipoListaPrecio.add(jLabelfecha_desdeTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeTipoListaPrecio.add(jButtonfecha_desdeTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeTipoListaPrecio.add(jDateChooserfecha_desdeTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaTipoListaPrecio.add(jLabelfecha_hastaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaTipoListaPrecio.add(jButtonfecha_hastaTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaTipoListaPrecio.add(jDateChooserfecha_hastaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoTipoListaPrecio.add(jLabelesta_activoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoTipoListaPrecio.add(jButtonesta_activoTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoTipoListaPrecio.add(jCheckBoxesta_activoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoListaPrecio.add(jLabeldescripcionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 2;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
		this.gridBagConstraintsTipoListaPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoListaPrecio.add(jButtondescripcionTipoListaPrecioBusqueda, this.gridBagConstraintsTipoListaPrecio);
	}

	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoListaPrecio.gridy = 0;
	this.gridBagConstraintsTipoListaPrecio.gridx = 1;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoListaPrecio.add(jscrollPanedescripcionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPanelidTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPanelcodigoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPanelnombreTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPanelfecha_desdeTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPanelfecha_hastaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPanelesta_activoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoListaPrecio.add(this.jPaneldescripcionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposTipoListaPrecio % 1==0) {
		iXPanelCamposTipoListaPrecio=0;
		iYPanelCamposTipoListaPrecio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoListaPrecio.gridy = iYPanelCamposOcultosTipoListaPrecio;
	this.gridBagConstraintsTipoListaPrecio.gridx = iXPanelCamposOcultosTipoListaPrecio++;
	this.gridBagConstraintsTipoListaPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoListaPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoListaPrecio.add(this.jPanelid_empresaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);



	if(iXPanelCamposOcultosTipoListaPrecio % 1==0) {
		iXPanelCamposOcultosTipoListaPrecio=0;
		iYPanelCamposOcultosTipoListaPrecio++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoListaPrecio= new GridBagLayout();
		this.jPanelAccionesTipoListaPrecio.setLayout(gridaBagLayoutAccionesTipoListaPrecio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoListaPrecio= new GridBagLayout();
		this.jPanelAccionesFormularioTipoListaPrecio.setLayout(gridaBagLayoutAccionesFormularioTipoListaPrecio);
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoListaPrecio.add(this.jComboBoxTiposAccionesFormularioTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoListaPrecio.add(this.jCheckBoxPostAccionNuevoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoListaPrecio.add(this.jCheckBoxPostAccionSinCerrarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoListaPrecio.add(this.jCheckBoxPostAccionSinMensajeTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoListaPrecio.add(this.jButtonModificarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);							

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoListaPrecio.add(this.jButtonEliminarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
			
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoListaPrecio.add(this.jButtonActualizarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);


		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoListaPrecio.add(this.jButtonGuardarCambiosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);	
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;		
		this.gridBagConstraintsTipoListaPrecio.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoListaPrecio.add(this.jButtonCancelarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoListaPrecio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();						
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoListaPrecio.gridx = 0;		
			//this.gridBagConstraintsTipoListaPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoListaPrecio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoListaPrecio.gridx =0;
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoListaPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoListaPrecio = new TipoListaPrecioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Lista Precio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Lista Precio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Lista Precio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoListaPrecioModel tipolistaprecioModel=new TipoListaPrecioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoListaPrecioModel.TipoListaPrecioFocusTraversalPolicy tipolistaprecioFocusTraversalPolicy = tipolistaprecioModel.new TipoListaPrecioFocusTraversalPolicy(this);
			
			//tipolistaprecioFocusTraversalPolicy.settipolistaprecioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipolistaprecioModel);
			
			
			this.jContentPaneDetalleTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoListaPrecio = new GridBagLayout();	
			this.jContentPaneDetalleTipoListaPrecio.setLayout(gridaBagLayoutDetalleTipoListaPrecio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoListaPrecio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoListaPrecio.gridx = 0;
					
				
				this.jContentPaneDetalleTipoListaPrecio.add(jTtoolBarDetalleTipoListaPrecio, gridBagConstraintsTipoListaPrecio);								
				
}
			
			this.jScrollPanelDatosEdicionTipoListaPrecio=   new JScrollPane(jContentPaneDetalleTipoListaPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoListaPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoListaPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoListaPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoListaPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoListaPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoListaPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoListaPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	        
			this.jContentPaneDetalleTipoListaPrecio.add(jPanelCamposTipoListaPrecio, gridBagConstraintsTipoListaPrecio);
			
			
			
			
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
						&& tipolistaprecioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					
					if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoListaPrecio= new GridBagConstraints();
						this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoListaPrecio.gridx = 0;
						this.jContentPaneDetalleTipoListaPrecio.add(this.jTabbedPaneRelacionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoListaPrecio.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoListaPrecio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
					this.gridBagConstraintsTipoListaPrecio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoListaPrecio.gridx = 0;
					
				
					this.jContentPaneDetalleTipoListaPrecio.add(jPanelCamposOcultosTipoListaPrecio, gridBagConstraintsTipoListaPrecio);
				
					this.jPanelCamposOcultosTipoListaPrecio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	        this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoListaPrecio.add(this.jPanelAccionesFormularioTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);							
			
			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
	        this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoListaPrecio.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoListaPrecio.add(this.jPanelAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoListaPrecio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoListaPrecio=   new JScrollPane(this.jPanelCamposTipoListaPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoListaPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoListaPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoListaPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoListaPrecio.gridx = 0;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoListaPrecio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoListaPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoListaPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
			
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
			
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoListaPrecio;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoListaPrecio;
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoListaPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoListaPrecio.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoListaPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoListaPrecio.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoListaPrecio.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoListaPrecio.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoListaPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoListaPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoListaPrecio.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoListaPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoListaPrecio.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoListaPrecio.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesTipoListaPrecio.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<TipoListaPrecio> tipolistaprecios,TipoListaPrecio tipolistaprecio,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tipolistaprecioLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settipolistapreciosForeignKey(tipolistaprecios);
					clienteBeanSwingJInternalFrame.settipolistaprecioForeignKey(tipolistaprecio);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoListaPrecio(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoListaPrecioActual(tipolistaprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoListaPrecio(true);
					clienteBeanSwingJInternalFrame.setid_tipo_lista_precioFK_IdTipoListaPrecio(tipolistaprecio.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoListaPrecioForeignKey(tipolistaprecio,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoListaPrecio");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoListaPrecio");
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

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<TipoListaPrecio> tipolistaprecios,TipoListaPrecio tipolistaprecio,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.tipolistaprecioLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.settipolistapreciosForeignKey(tipolistaprecios);
					parametrocarteradefectoBeanSwingJInternalFrame.settipolistaprecioForeignKey(tipolistaprecio);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoListaPrecio(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidTipoListaPrecioActual(tipolistaprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoListaPrecio(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_tipo_lista_precioFK_IdTipoListaPrecio(tipolistaprecio.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoListaPrecioForeignKey(tipolistaprecio,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoListaPrecio");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoListaPrecio");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

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
