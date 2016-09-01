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
import com.bydan.erp.facturacion.util.report.ProcesoFacturasProductosConstantesFunciones;

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
public class ProcesoFacturasProductosDetalleFormJInternalFrame extends ProcesoFacturasProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoFacturasProductos;
	
	protected JMenuBar jmenuBarDetalleProcesoFacturasProductos;
	
	protected JMenu jmenuDetalleProcesoFacturasProductos;
	protected JMenu jmenuDetalleArchivoProcesoFacturasProductos;
	protected JMenu jmenuDetalleAccionesProcesoFacturasProductos;
	protected JMenu jmenuDetalleDatosProcesoFacturasProductos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoFacturasProductos;	
	protected GridBagConstraints gridBagConstraintsProcesoFacturasProductos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoFacturasProductosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoFacturasProductos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public ProcesoFacturasProductosSessionBean procesofacturasproductosSessionBean;
	
	
	
	
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public ProcesoFacturasProductosLogic procesofacturasproductosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoFacturasProductos;
	public JScrollPane jScrollPanelDatosEdicionProcesoFacturasProductos;
	public JScrollPane jScrollPanelDatosGeneralProcesoFacturasProductos;
	
	protected JPanel jPanelCamposProcesoFacturasProductos;    
	protected JPanel jPanelCamposOcultosProcesoFacturasProductos;    	
	protected JPanel jPanelAccionesProcesoFacturasProductos;
	protected JPanel jPanelAccionesFormularioProcesoFacturasProductos;
    
	
	
	protected Integer iXPanelCamposProcesoFacturasProductos=0;
	protected Integer iYPanelCamposProcesoFacturasProductos=0;
	
	protected Integer iXPanelCamposOcultosProcesoFacturasProductos=0;
	protected Integer iYPanelCamposOcultosProcesoFacturasProductos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoFacturasProductos;
	public JButton jButtonModificarProcesoFacturasProductos;
	public JButton jButtonActualizarProcesoFacturasProductos;
    public JButton jButtonEliminarProcesoFacturasProductos;
	public JButton jButtonCancelarProcesoFacturasProductos;
    public JButton jButtonGuardarCambiosProcesoFacturasProductos;
	public JButton jButtonGuardarCambiosTablaProcesoFacturasProductos;
	protected JButton jButtonCerrarProcesoFacturasProductos;
	
	
	protected JButton jButtonProcesarInformacionProcesoFacturasProductos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoFacturasProductos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoFacturasProductos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoFacturasProductos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoFacturasProductos;
	protected JButton jButtonModificarToolBarProcesoFacturasProductos;
	protected JButton jButtonActualizarToolBarProcesoFacturasProductos;
    protected JButton jButtonEliminarToolBarProcesoFacturasProductos;
	protected JButton jButtonCancelarToolBarProcesoFacturasProductos;
    protected JButton jButtonGuardarCambiosToolBarProcesoFacturasProductos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoFacturasProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoFacturasProductos;
	protected JButton jButtonCerrarToolBarProcesoFacturasProductos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoFacturasProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoFacturasProductos;
	protected JMenuItem jMenuItemModificarProcesoFacturasProductos;
	protected JMenuItem jMenuItemActualizarProcesoFacturasProductos;
    protected JMenuItem jMenuItemEliminarProcesoFacturasProductos;
	protected JMenuItem jMenuItemCancelarProcesoFacturasProductos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoFacturasProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoFacturasProductos;
	protected JMenuItem jMenuItemCerrarProcesoFacturasProductos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoFacturasProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoFacturasProductos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoFacturasProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoFacturasProductos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoFacturasProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoFacturasProductos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoFacturasProductos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoFacturasProductos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoFacturasProductos;
	public JLabel jLabelIdProcesoFacturasProductos;
	public JLabel jLabelidProcesoFacturasProductos;
	public JButton jButtonidProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoFacturasProductos;
	public JLabel jLabelcodigoProcesoFacturasProductos;
	public JTextField jTextFieldcodigoProcesoFacturasProductos;
	public JButton jButtoncodigoProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoProcesoFacturasProductos;
	public JLabel jLabelnombre_completoProcesoFacturasProductos;
	public JTextArea jTextAreanombre_completoProcesoFacturasProductos;
	public JScrollPane jscrollPanenombre_completoProcesoFacturasProductos;
	public JButton jButtonnombre_completoProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_provinciaProcesoFacturasProductos;
	public JLabel jLabelnombre_provinciaProcesoFacturasProductos;
	public JTextArea jTextAreanombre_provinciaProcesoFacturasProductos;
	public JScrollPane jscrollPanenombre_provinciaProcesoFacturasProductos;
	public JButton jButtonnombre_provinciaProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadProcesoFacturasProductos;
	public JLabel jLabelnombre_ciudadProcesoFacturasProductos;
	public JTextArea jTextAreanombre_ciudadProcesoFacturasProductos;
	public JScrollPane jscrollPanenombre_ciudadProcesoFacturasProductos;
	public JButton jButtonnombre_ciudadProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaProcesoFacturasProductos;
	public JLabel jLabelnombre_zonaProcesoFacturasProductos;
	public JTextField jTextFieldnombre_zonaProcesoFacturasProductos;
	public JButton jButtonnombre_zonaProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteProcesoFacturasProductos;
	public JLabel jLabelnombre_grupo_clienteProcesoFacturasProductos;
	public JTextArea jTextAreanombre_grupo_clienteProcesoFacturasProductos;
	public JScrollPane jscrollPanenombre_grupo_clienteProcesoFacturasProductos;
	public JButton jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_datoProcesoFacturasProductos;
	public JLabel jLabelcodigo_datoProcesoFacturasProductos;
	public JTextField jTextFieldcodigo_datoProcesoFacturasProductos;
	public JButton jButtoncodigo_datoProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_datoProcesoFacturasProductos;
	public JLabel jLabelnombre_completo_datoProcesoFacturasProductos;
	public JTextArea jTextAreanombre_completo_datoProcesoFacturasProductos;
	public JScrollPane jscrollPanenombre_completo_datoProcesoFacturasProductos;
	public JButton jButtonnombre_completo_datoProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaProcesoFacturasProductos;
	public JLabel jLabelnumero_pre_impreso_facturaProcesoFacturasProductos;
	public JTextField jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos;
	public JButton jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoProcesoFacturasProductos;
	public JLabel jLabelnombre_productoProcesoFacturasProductos;
	public JTextArea jTextAreanombre_productoProcesoFacturasProductos;
	public JScrollPane jscrollPanenombre_productoProcesoFacturasProductos;
	public JButton jButtonnombre_productoProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadProcesoFacturasProductos;
	public JLabel jLabelnombre_unidadProcesoFacturasProductos;
	public JTextField jTextFieldnombre_unidadProcesoFacturasProductos;
	public JButton jButtonnombre_unidadProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelprecioProcesoFacturasProductos;
	public JLabel jLabelprecioProcesoFacturasProductos;
	public JTextField jTextFieldprecioProcesoFacturasProductos;
	public JButton jButtonprecioProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPaneltareaProcesoFacturasProductos;
	public JLabel jLabeltareaProcesoFacturasProductos;
	public JTextArea jTextAreatareaProcesoFacturasProductos;
	public JScrollPane jscrollPanetareaProcesoFacturasProductos;
	public JButton jButtontareaProcesoFacturasProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadProcesoFacturasProductos;
	public JLabel jLabelid_ciudadProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadProcesoFacturasProductos;
	public JButton jButtonid_ciudadProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_ciudadProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaProcesoFacturasProductos;
	public JLabel jLabelid_zonaProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaProcesoFacturasProductos;
	public JButton jButtonid_zonaProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_zonaProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_zonaProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteProcesoFacturasProductos;
	public JLabel jLabelid_grupo_clienteProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteProcesoFacturasProductos;
	public JButton jButtonid_grupo_clienteProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_grupo_clienteProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteProcesoFacturasProductosBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorProcesoFacturasProductos;
	public JLabel jLabelid_vendedorProcesoFacturasProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorProcesoFacturasProductos;
	public JButton jButtonid_vendedorProcesoFacturasProductos= new JButtonMe();
	public JButton jButtonid_vendedorProcesoFacturasProductosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorProcesoFacturasProductosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoFacturasProductos;
	
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
	public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoFacturasProductosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoFacturasProductos=new JPanel();
				this.jPanelAccionesFormularioProcesoFacturasProductos=new JPanel();
				this.jmenuBarDetalleProcesoFacturasProductos=new JMenuBar();
				this.jTtoolBarDetalleProcesoFacturasProductos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoFacturasProductosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoFacturasProductosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoFacturasProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoFacturasProductos() {
		return this.jButtonActualizarToolBarProcesoFacturasProductos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoFacturasProductos() {
		return this.jButtonEliminarToolBarProcesoFacturasProductos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoFacturasProductos() {
		return this.jButtonCancelarToolBarProcesoFacturasProductos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoFacturasProductos() {
		return this.jButtonProcesarInformacionProcesoFacturasProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoFacturasProductos)	{
		this.jButtonProcesarInformacionProcesoFacturasProductos = jButtonProcesarInformacionProcesoFacturasProductos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoFacturasProductos() {
		return this.jComboBoxTiposAccionesProcesoFacturasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoFacturasProductos(
			JComboBox jComboBoxTiposRelacionesProcesoFacturasProductos) {
		this.jComboBoxTiposRelacionesProcesoFacturasProductos = jComboBoxTiposRelacionesProcesoFacturasProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoFacturasProductos(
			JComboBox jComboBoxTiposAccionesProcesoFacturasProductos) {
		this.jComboBoxTiposAccionesProcesoFacturasProductos = jComboBoxTiposAccionesProcesoFacturasProductos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoFacturasProductos() {
		return this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoFacturasProductos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoFacturasProductos) {
		this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos = jComboBoxTiposAccionesFormularioProcesoFacturasProductos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesofacturasproductosSessionBean=new ProcesoFacturasProductosSessionBean();
		
		this.procesofacturasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesofacturasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesofacturasproductosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoFacturasProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoFacturasProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoFacturasProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Facturas Productos MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoFacturasProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoFacturasProductos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoFacturasProductos=new JButtonMe();
				this.jButtonModificarToolBarProcesoFacturasProductos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoFacturasProductos,this.jTtoolBarDetalleProcesoFacturasProductos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoFacturasProductos,this.jTtoolBarDetalleProcesoFacturasProductos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoFacturasProductos,this.jTtoolBarDetalleProcesoFacturasProductos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoFacturasProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoFacturasProductos,this.jTtoolBarDetalleProcesoFacturasProductos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoFacturasProductos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoFacturasProductos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoFacturasProductos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoFacturasProductos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoFacturasProductos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoFacturasProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoFacturasProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoFacturasProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoFacturasProductos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoFacturasProductos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoFacturasProductos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoFacturasProductos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoFacturasProductos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoFacturasProductos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoFacturasProductos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoFacturasProductos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoFacturasProductos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoFacturasProductos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoFacturasProductos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoFacturasProductos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoFacturasProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoFacturasProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoFacturasProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoFacturasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoFacturasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoFacturasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoFacturasProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoFacturasProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoFacturasProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoFacturasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoFacturasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoFacturasProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoFacturasProductos.add(this.jMenuItemDetalleCerrarProcesoFacturasProductos);
		
		this.jmenuDetalleAccionesProcesoFacturasProductos.add(this.jMenuItemActualizarProcesoFacturasProductos);
		this.jmenuDetalleAccionesProcesoFacturasProductos.add(this.jMenuItemEliminarProcesoFacturasProductos);
		this.jmenuDetalleAccionesProcesoFacturasProductos.add(this.jMenuItemCancelarProcesoFacturasProductos);		
		
		//this.jmenuDetalleDatosProcesoFacturasProductos.add(this.jMenuItemDetalleAbrirOrderByProcesoFacturasProductos);				
		this.jmenuDetalleDatosProcesoFacturasProductos.add(this.jMenuItemDetalleMostarOcultarProcesoFacturasProductos);				
				
		//this.jmenuDetalleAccionesProcesoFacturasProductos.add(this.jMenuItemGuardarCambiosProcesoFacturasProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoFacturasProductos.add(this.jmenuDetalleArchivoProcesoFacturasProductos);		
		this.jmenuBarDetalleProcesoFacturasProductos.add(this.jmenuDetalleAccionesProcesoFacturasProductos);		
		this.jmenuBarDetalleProcesoFacturasProductos.add(this.jmenuDetalleDatosProcesoFacturasProductos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoFacturasProductos);				
	}
	
	
	public void inicializarElementosCamposProcesoFacturasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoFacturasProductos = new JLabelMe();
		jLabelIdProcesoFacturasProductos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoFacturasProductos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoFacturasProductos= new GridBagLayout();

		this.jPanelidProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);

		jLabelidProcesoFacturasProductos = new JLabel();
		jLabelidProcesoFacturasProductos.setText("Id");

		jLabelidProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesoFacturasProductos = new JLabelMe();
		this.jLabelcodigoProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoFacturasProductos.setToolTipText("Codigo");
		this.jLabelcodigoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelcodigoProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextFieldcodigoProcesoFacturasProductos= new JTextFieldMe();

		jTextFieldcodigoProcesoFacturasProductos.setEnabled(false);
		jTextFieldcodigoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoFacturasProductosBusqueda.setText("U");
		this.jButtoncodigoProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_completoProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoProcesoFacturasProductos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_completoProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreanombre_completoProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_completoProcesoFacturasProductos.setEnabled(false);
		jTextAreanombre_completoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoFacturasProductos.setLineWrap(true);
		jTextAreanombre_completoProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreanombre_completoProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoProcesoFacturasProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoProcesoFacturasProductos = new JScrollPane(jTextAreanombre_completoProcesoFacturasProductos);
		jscrollPanenombre_completoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_provinciaProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_provinciaProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA+" : *");
		this.jLabelnombre_provinciaProcesoFacturasProductos.setToolTipText("Nombre Provincia");
		this.jLabelnombre_provinciaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_provinciaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_provinciaProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_provinciaProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPROVINCIA);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_provinciaProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreanombre_provinciaProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_provinciaProcesoFacturasProductos.setEnabled(false);
		jTextAreanombre_provinciaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoFacturasProductos.setLineWrap(true);
		jTextAreanombre_provinciaProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreanombre_provinciaProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_provinciaProcesoFacturasProductos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_provinciaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_provinciaProcesoFacturasProductos = new JScrollPane(jTextAreanombre_provinciaProcesoFacturasProductos);
		jscrollPanenombre_provinciaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_provinciaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_provinciaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_provinciaProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_provinciaProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_ciudadProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadProcesoFacturasProductos.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_ciudadProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreanombre_ciudadProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_ciudadProcesoFacturasProductos.setEnabled(false);
		jTextAreanombre_ciudadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoFacturasProductos.setLineWrap(true);
		jTextAreanombre_ciudadProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreanombre_ciudadProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadProcesoFacturasProductos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadProcesoFacturasProductos = new JScrollPane(jTextAreanombre_ciudadProcesoFacturasProductos);
		jscrollPanenombre_ciudadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_zonaProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaProcesoFacturasProductos.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_zonaProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextFieldnombre_zonaProcesoFacturasProductos= new JTextFieldMe();

		jTextFieldnombre_zonaProcesoFacturasProductos.setEnabled(false);
		jTextFieldnombre_zonaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_grupo_clienteProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteProcesoFacturasProductos.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_grupo_clienteProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreanombre_grupo_clienteProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setEnabled(false);
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setLineWrap(true);
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteProcesoFacturasProductos = new JScrollPane(jTextAreanombre_grupo_clienteProcesoFacturasProductos);
		jscrollPanenombre_grupo_clienteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_datoProcesoFacturasProductos = new JLabelMe();
		this.jLabelcodigo_datoProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO+" : *");
		this.jLabelcodigo_datoProcesoFacturasProductos.setToolTipText("Codigo Dato");
		this.jLabelcodigo_datoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_datoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_datoProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_datoProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_CODIGODATO);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelcodigo_datoProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextFieldcodigo_datoProcesoFacturasProductos= new JTextFieldMe();

		jTextFieldcodigo_datoProcesoFacturasProductos.setEnabled(false);
		jTextFieldcodigo_datoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_datoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setText("U");
		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_datoProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_datoProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_datoProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_datoProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_datoProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_datoProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_completo_datoProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO+" : *");
		this.jLabelnombre_completo_datoProcesoFacturasProductos.setToolTipText("Nombre Completo Dato");
		this.jLabelnombre_completo_datoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_datoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_datoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_datoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_datoProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_datoProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBRECOMPLETODATO);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_completo_datoProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreanombre_completo_datoProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_completo_datoProcesoFacturasProductos.setEnabled(false);
		jTextAreanombre_completo_datoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_datoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_datoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_datoProcesoFacturasProductos.setLineWrap(true);
		jTextAreanombre_completo_datoProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreanombre_completo_datoProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_datoProcesoFacturasProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_datoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_datoProcesoFacturasProductos = new JScrollPane(jTextAreanombre_completo_datoProcesoFacturasProductos);
		jscrollPanenombre_completo_datoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_datoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_datoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_datoProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_datoProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_datoProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_datoProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_productoProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoProcesoFacturasProductos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_productoProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreanombre_productoProcesoFacturasProductos= new JTextAreaMe();
		jTextAreanombre_productoProcesoFacturasProductos.setEnabled(false);
		jTextAreanombre_productoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoProcesoFacturasProductos.setLineWrap(true);
		jTextAreanombre_productoProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreanombre_productoProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoProcesoFacturasProductos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoProcesoFacturasProductos = new JScrollPane(jTextAreanombre_productoProcesoFacturasProductos);
		jscrollPanenombre_productoProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadProcesoFacturasProductos = new JLabelMe();
		this.jLabelnombre_unidadProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadProcesoFacturasProductos.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelnombre_unidadProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextFieldnombre_unidadProcesoFacturasProductos= new JTextFieldMe();

		jTextFieldnombre_unidadProcesoFacturasProductos.setEnabled(false);
		jTextFieldnombre_unidadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabelprecioProcesoFacturasProductos = new JLabelMe();
		this.jLabelprecioProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProcesoFacturasProductos.setToolTipText("Precio");
		this.jLabelprecioProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelprecioProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextFieldprecioProcesoFacturasProductos= new JTextFieldMe();
		jTextFieldprecioProcesoFacturasProductos.setEnabled(false);
		jTextFieldprecioProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProcesoFacturasProductos.setText("0.0");

		this.jButtonprecioProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonprecioProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonprecioProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProcesoFacturasProductosBusqueda.setVisible(false);		}


					
		this.jLabeltareaProcesoFacturasProductos = new JLabelMe();
		this.jLabeltareaProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA+" : *");
		this.jLabeltareaProcesoFacturasProductos.setToolTipText("Tarea");
		this.jLabeltareaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltareaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltareaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltareaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltareaProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltareaProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_TAREA);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPaneltareaProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jTextAreatareaProcesoFacturasProductos= new JTextAreaMe();
		jTextAreatareaProcesoFacturasProductos.setEnabled(false);
		jTextAreatareaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatareaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatareaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatareaProcesoFacturasProductos.setLineWrap(true);
		jTextAreatareaProcesoFacturasProductos.setWrapStyleWord(true);
		jTextAreatareaProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatareaProcesoFacturasProductos.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreatareaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetareaProcesoFacturasProductos = new JScrollPane(jTextAreatareaProcesoFacturasProductos);
		jscrollPanetareaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetareaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetareaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontareaProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtontareaProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontareaProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontareaProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontareaProcesoFacturasProductosBusqueda.setText("U");
		this.jButtontareaProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontareaProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontareaProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatareaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatareaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tareaProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontareaProcesoFacturasProductosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoFacturasProductos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_ciudadProcesoFacturasProductos = new JLabelMe();
		this.jLabelid_ciudadProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadProcesoFacturasProductos.setToolTipText("Ciudad");
		this.jLabelid_ciudadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelid_ciudadProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jComboBoxid_ciudadProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_ciudadProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadProcesoFacturasProductos= new JButtonMe();
		this.jButtonid_ciudadProcesoFacturasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoFacturasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoFacturasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoFacturasProductos.setText("Buscar");
		this.jButtonid_ciudadProcesoFacturasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadProcesoFacturasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoFacturasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoFacturasProductos"));

		this.jButtonid_ciudadProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadProcesoFacturasProductosBusqueda.setVisible(false);		}

		this.jButtonid_ciudadProcesoFacturasProductosUpdate= new JButtonMe();
		this.jButtonid_ciudadProcesoFacturasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoFacturasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoFacturasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadProcesoFacturasProductosUpdate.setText("U");
		this.jButtonid_ciudadProcesoFacturasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadProcesoFacturasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoFacturasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoFacturasProductosUpdate"));



					
		this.jLabelid_zonaProcesoFacturasProductos = new JLabelMe();
		this.jLabelid_zonaProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaProcesoFacturasProductos.setToolTipText("Zona");
		this.jLabelid_zonaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelid_zonaProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jComboBoxid_zonaProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_zonaProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaProcesoFacturasProductos= new JButtonMe();
		this.jButtonid_zonaProcesoFacturasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoFacturasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoFacturasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoFacturasProductos.setText("Buscar");
		this.jButtonid_zonaProcesoFacturasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaProcesoFacturasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoFacturasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoFacturasProductos"));

		this.jButtonid_zonaProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonid_zonaProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonid_zonaProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaProcesoFacturasProductosBusqueda.setVisible(false);		}

		this.jButtonid_zonaProcesoFacturasProductosUpdate= new JButtonMe();
		this.jButtonid_zonaProcesoFacturasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoFacturasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoFacturasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaProcesoFacturasProductosUpdate.setText("U");
		this.jButtonid_zonaProcesoFacturasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaProcesoFacturasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoFacturasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoFacturasProductosUpdate"));



					
		this.jLabelid_grupo_clienteProcesoFacturasProductos = new JLabelMe();
		this.jLabelid_grupo_clienteProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteProcesoFacturasProductos.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelid_grupo_clienteProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jComboBoxid_grupo_clienteProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_grupo_clienteProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteProcesoFacturasProductos= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoFacturasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoFacturasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoFacturasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoFacturasProductos.setText("Buscar");
		this.jButtonid_grupo_clienteProcesoFacturasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteProcesoFacturasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoFacturasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoFacturasProductos"));

		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteProcesoFacturasProductosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.setText("U");
		this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoFacturasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoFacturasProductosUpdate"));



					
		this.jLabelid_vendedorProcesoFacturasProductos = new JLabelMe();
		this.jLabelid_vendedorProcesoFacturasProductos.setText(""+ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorProcesoFacturasProductos.setToolTipText("Vendedor");
		this.jLabelid_vendedorProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorProcesoFacturasProductos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorProcesoFacturasProductos.setToolTipText(ProcesoFacturasProductosConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		this.jPanelid_vendedorProcesoFacturasProductos.setLayout(this.gridaBagLayoutProcesoFacturasProductos);


		jComboBoxid_vendedorProcesoFacturasProductos= new JComboBoxMe();
		jComboBoxid_vendedorProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorProcesoFacturasProductos= new JButtonMe();
		this.jButtonid_vendedorProcesoFacturasProductos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoFacturasProductos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoFacturasProductos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoFacturasProductos.setText("Buscar");
		this.jButtonid_vendedorProcesoFacturasProductos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorProcesoFacturasProductos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoFacturasProductos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoFacturasProductos"));

		this.jButtonid_vendedorProcesoFacturasProductosBusqueda= new JButtonMe();
		this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setText("U");
		this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoFacturasProductosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoFacturasProductosBusqueda"));

		if(this.procesofacturasproductosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorProcesoFacturasProductosBusqueda.setVisible(false);		}

		this.jButtonid_vendedorProcesoFacturasProductosUpdate= new JButtonMe();
		this.jButtonid_vendedorProcesoFacturasProductosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoFacturasProductosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoFacturasProductosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProcesoFacturasProductosUpdate.setText("U");
		this.jButtonid_vendedorProcesoFacturasProductosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorProcesoFacturasProductosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoFacturasProductosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorProcesoFacturasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoFacturasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoFacturasProductosUpdate"));



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
		//this.jInternalFrameDetalleProcesoFacturasProductos = new ProcesoFacturasProductosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Facturas Productos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoFacturasProductos= new GridBagLayout();
		

		
		String sToolTipProcesoFacturasProductos="";
		sToolTipProcesoFacturasProductos=ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoFacturasProductos+="(Facturacion.ProcesoFacturasProductos)";
		}
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoFacturasProductos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoFacturasProductos = new JButtonMe();
		this.jButtonModificarProcesoFacturasProductos = new JButtonMe();
        this.jButtonActualizarProcesoFacturasProductos = new JButtonMe();
        this.jButtonEliminarProcesoFacturasProductos = new JButtonMe();
        this.jButtonCancelarProcesoFacturasProductos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoFacturasProductos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos = new JButtonMe();
		this.jButtonCerrarProcesoFacturasProductos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoFacturasProductos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoFacturasProductos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoFacturasProductos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Facturas Productos";
		
		if(!this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Facturas Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoFacturasProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoFacturasProductos.setName("jPanelCamposProcesoFacturasProductos"); 

		this.jPanelCamposOcultosProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoFacturasProductos.setName("jPanelCamposOcultosProcesoFacturasProductos"); 

        this.jPanelAccionesProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoFacturasProductos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoFacturasProductos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoFacturasProductos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoFacturasProductos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoFacturasProductos.setText("Nuevo");
		this.jButtonModificarProcesoFacturasProductos.setText("Editar");
        this.jButtonActualizarProcesoFacturasProductos.setText("Actualizar");
        this.jButtonEliminarProcesoFacturasProductos.setText("Eliminar");
        this.jButtonCancelarProcesoFacturasProductos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoFacturasProductos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.setText("Guardar");
		this.jButtonCerrarProcesoFacturasProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoFacturasProductos,"nuevo_button","Nuevo",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoFacturasProductos,"modificar_button","Editar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoFacturasProductos,"actualizar_button","Actualizar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoFacturasProductos,"eliminar_button","Eliminar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoFacturasProductos,"cancelar_button","Cancelar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoFacturasProductos,"guardarcambios_button","Guardar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoFacturasProductos,"guardarcambiostabla_button","Guardar",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoFacturasProductos,"cerrar_button","Salir",this.procesofacturasproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoFacturasProductos.setToolTipText("Nuevo"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoFacturasProductos.setToolTipText("Editar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoFacturasProductos.setToolTipText("Actualizar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoFacturasProductos.setToolTipText("Eliminar)"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoFacturasProductos.setToolTipText("Cancelar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoFacturasProductos.setToolTipText("Guardar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.setToolTipText("Guardar"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoFacturasProductos.setToolTipText("Salir"+" "+ProcesoFacturasProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoFacturasProductos";
		inputMap = this.jButtonNuevoProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoFacturasProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoFacturasProductos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoFacturasProductos";
		inputMap = this.jButtonActualizarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoFacturasProductos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoFacturasProductos";
		inputMap = this.jButtonEliminarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoFacturasProductos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoFacturasProductos";
		inputMap = this.jButtonCancelarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoFacturasProductos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoFacturasProductos";
		inputMap = this.jButtonCerrarProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoFacturasProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoFacturasProductos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoFacturasProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoFacturasProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoFacturasProductos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoFacturasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoFacturasProductos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoFacturasProductos.setToolTipText("Nuevo ProcesoFacturasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoFacturasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoFacturasProductos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoFacturasProductos.setToolTipText("Sin Cerrar Ventana ProcesoFacturasProductos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoFacturasProductos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoFacturasProductos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoFacturasProductos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoFacturasProductos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoFacturasProductos = new JLabelMe();
		
		this.jLabelAccionesProcesoFacturasProductos.setText("Acciones");		
		this.jLabelAccionesProcesoFacturasProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoFacturasProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoFacturasProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoFacturasProductos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoFacturasProductos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoFacturasProductos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoFacturasProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoFacturasProductos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoFacturasProductos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoFacturasProductos = new GridBagLayout();
		
		this.jPanelCamposProcesoFacturasProductos.setLayout(gridaBagLayoutCamposProcesoFacturasProductos);
		this.jPanelCamposOcultosProcesoFacturasProductos.setLayout(gridaBagLayoutCamposOcultosProcesoFacturasProductos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoFacturasProductos.add(jLabelIdProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoFacturasProductos.add(jLabelidProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadProcesoFacturasProductos.add(jLabelid_ciudadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadProcesoFacturasProductos.add(jButtonid_ciudadProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 3;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadProcesoFacturasProductos.add(jButtonid_ciudadProcesoFacturasProductosUpdate, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadProcesoFacturasProductos.add(jComboBoxid_ciudadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaProcesoFacturasProductos.add(jLabelid_zonaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaProcesoFacturasProductos.add(jButtonid_zonaProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 3;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaProcesoFacturasProductos.add(jButtonid_zonaProcesoFacturasProductosUpdate, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaProcesoFacturasProductos.add(jComboBoxid_zonaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteProcesoFacturasProductos.add(jLabelid_grupo_clienteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteProcesoFacturasProductos.add(jButtonid_grupo_clienteProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 3;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteProcesoFacturasProductos.add(jButtonid_grupo_clienteProcesoFacturasProductosUpdate, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteProcesoFacturasProductos.add(jComboBoxid_grupo_clienteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorProcesoFacturasProductos.add(jLabelid_vendedorProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProcesoFacturasProductos.add(jButtonid_vendedorProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 3;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProcesoFacturasProductos.add(jButtonid_vendedorProcesoFacturasProductosUpdate, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorProcesoFacturasProductos.add(jComboBoxid_vendedorProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoFacturasProductos.add(jLabelcodigoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoFacturasProductos.add(jButtoncodigoProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoFacturasProductos.add(jTextFieldcodigoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoProcesoFacturasProductos.add(jLabelnombre_completoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoProcesoFacturasProductos.add(jButtonnombre_completoProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoProcesoFacturasProductos.add(jscrollPanenombre_completoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_provinciaProcesoFacturasProductos.add(jLabelnombre_provinciaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_provinciaProcesoFacturasProductos.add(jButtonnombre_provinciaProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_provinciaProcesoFacturasProductos.add(jscrollPanenombre_provinciaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadProcesoFacturasProductos.add(jLabelnombre_ciudadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadProcesoFacturasProductos.add(jButtonnombre_ciudadProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadProcesoFacturasProductos.add(jscrollPanenombre_ciudadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaProcesoFacturasProductos.add(jLabelnombre_zonaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaProcesoFacturasProductos.add(jButtonnombre_zonaProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaProcesoFacturasProductos.add(jTextFieldnombre_zonaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteProcesoFacturasProductos.add(jLabelnombre_grupo_clienteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteProcesoFacturasProductos.add(jButtonnombre_grupo_clienteProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteProcesoFacturasProductos.add(jscrollPanenombre_grupo_clienteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_datoProcesoFacturasProductos.add(jLabelcodigo_datoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_datoProcesoFacturasProductos.add(jButtoncodigo_datoProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_datoProcesoFacturasProductos.add(jTextFieldcodigo_datoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_datoProcesoFacturasProductos.add(jLabelnombre_completo_datoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_datoProcesoFacturasProductos.add(jButtonnombre_completo_datoProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_datoProcesoFacturasProductos.add(jscrollPanenombre_completo_datoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos.add(jLabelnumero_pre_impreso_facturaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos.add(jButtonnumero_pre_impreso_facturaProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos.add(jTextFieldnumero_pre_impreso_facturaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoProcesoFacturasProductos.add(jLabelnombre_productoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoProcesoFacturasProductos.add(jButtonnombre_productoProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoProcesoFacturasProductos.add(jscrollPanenombre_productoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadProcesoFacturasProductos.add(jLabelnombre_unidadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadProcesoFacturasProductos.add(jButtonnombre_unidadProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadProcesoFacturasProductos.add(jTextFieldnombre_unidadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProcesoFacturasProductos.add(jLabelprecioProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProcesoFacturasProductos.add(jButtonprecioProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProcesoFacturasProductos.add(jTextFieldprecioProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltareaProcesoFacturasProductos.add(jLabeltareaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 2;
		this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
		this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltareaProcesoFacturasProductos.add(jButtontareaProcesoFacturasProductosBusqueda, this.gridBagConstraintsProcesoFacturasProductos);
	}

	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = 1;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltareaProcesoFacturasProductos.add(jscrollPanetareaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelidProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelid_ciudadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelid_zonaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelid_grupo_clienteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelid_vendedorProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelcodigoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_completoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_provinciaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_ciudadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_zonaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_grupo_clienteProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelcodigo_datoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_completo_datoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnumero_pre_impreso_facturaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_productoProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelnombre_unidadProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPanelprecioProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
	}
	this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoFacturasProductos.gridy = iYPanelCamposProcesoFacturasProductos;
	this.gridBagConstraintsProcesoFacturasProductos.gridx = iXPanelCamposProcesoFacturasProductos++;
	this.gridBagConstraintsProcesoFacturasProductos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoFacturasProductos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoFacturasProductos.add(this.jPaneltareaProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);



	if(iXPanelCamposProcesoFacturasProductos % 2==0) {
		iXPanelCamposProcesoFacturasProductos=0;
		iYPanelCamposProcesoFacturasProductos++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoFacturasProductos= new GridBagLayout();
		this.jPanelAccionesProcesoFacturasProductos.setLayout(gridaBagLayoutAccionesProcesoFacturasProductos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoFacturasProductos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoFacturasProductos.setLayout(gridaBagLayoutAccionesFormularioProcesoFacturasProductos);
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoFacturasProductos.add(this.jComboBoxTiposAccionesFormularioProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoFacturasProductos.add(this.jButtonModificarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);							

		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;
		this.gridBagConstraintsProcesoFacturasProductos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoFacturasProductos.add(this.jButtonEliminarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoFacturasProductos.add(this.jButtonActualizarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);


		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoFacturasProductos.add(this.jButtonGuardarCambiosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);	
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = 0;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoFacturasProductos.add(this.jButtonCancelarProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoFacturasProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoFacturasProductos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesofacturasproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;		
			//this.gridBagConstraintsProcesoFacturasProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoFacturasProductos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoFacturasProductos.gridx =0;
		this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoFacturasProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoFacturasProductosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoFacturasProductos = new ProcesoFacturasProductosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Facturas Productos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Facturas Productos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Facturas Productos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoFacturasProductosModel procesofacturasproductosModel=new ProcesoFacturasProductosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoFacturasProductosModel.ProcesoFacturasProductosFocusTraversalPolicy procesofacturasproductosFocusTraversalPolicy = procesofacturasproductosModel.new ProcesoFacturasProductosFocusTraversalPolicy(this);
			
			//procesofacturasproductosFocusTraversalPolicy.setprocesofacturasproductosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesofacturasproductosModel);
			
			
			this.jContentPaneDetalleProcesoFacturasProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoFacturasProductos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoFacturasProductos.setLayout(gridaBagLayoutDetalleProcesoFacturasProductos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoFacturasProductos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
				this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoFacturasProductos.add(jTtoolBarDetalleProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoFacturasProductos=   new JScrollPane(jContentPaneDetalleProcesoFacturasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoFacturasProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoFacturasProductos.add(jPanelCamposProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);
			
			
			
			
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
						//&& procesofacturasproductosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesofacturasproductosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoFacturasProductos= new GridBagConstraints();
						this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
						this.jContentPaneDetalleProcesoFacturasProductos.add(this.jTabbedPaneRelacionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoFacturasProductos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoFacturasProductos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
					this.gridBagConstraintsProcesoFacturasProductos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoFacturasProductos.add(jPanelCamposOcultosProcesoFacturasProductos, gridBagConstraintsProcesoFacturasProductos);
				
					this.jPanelCamposOcultosProcesoFacturasProductos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	        this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoFacturasProductos.add(this.jPanelAccionesFormularioProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);							
			
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoFacturasProductos.add(this.jPanelAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoFacturasProductos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoFacturasProductos=   new JScrollPane(this.jPanelCamposProcesoFacturasProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoFacturasProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoFacturasProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoFacturasProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
			this.gridBagConstraintsProcesoFacturasProductos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoFacturasProductos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoFacturasProductos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);			
			
			this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
			this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
			
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		
			
		this.gridBagConstraintsProcesoFacturasProductos = new GridBagConstraints();
		this.gridBagConstraintsProcesoFacturasProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoFacturasProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoFacturasProductos, this.gridBagConstraintsProcesoFacturasProductos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoFacturasProductos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoFacturasProductos;
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
