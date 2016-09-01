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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.ProcesoSolicitudesAutorizacionesConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame extends ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoSolicitudesAutorizaciones;
	
	protected JMenuBar jmenuBarDetalleProcesoSolicitudesAutorizaciones;
	
	protected JMenu jmenuDetalleProcesoSolicitudesAutorizaciones;
	protected JMenu jmenuDetalleArchivoProcesoSolicitudesAutorizaciones;
	protected JMenu jmenuDetalleAccionesProcesoSolicitudesAutorizaciones;
	protected JMenu jmenuDetalleDatosProcesoSolicitudesAutorizaciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoSolicitudesAutorizaciones;	
	protected GridBagConstraints gridBagConstraintsProcesoSolicitudesAutorizaciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoSolicitudesAutorizaciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ProcesoSolicitudesAutorizacionesSessionBean procesosolicitudesautorizacionesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public ProcesoSolicitudesAutorizacionesLogic procesosolicitudesautorizacionesLogic;
	
	public JScrollPane jScrollPanelDatosProcesoSolicitudesAutorizaciones;
	public JScrollPane jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones;
	public JScrollPane jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones;
	
	protected JPanel jPanelCamposProcesoSolicitudesAutorizaciones;    
	protected JPanel jPanelCamposOcultosProcesoSolicitudesAutorizaciones;    	
	protected JPanel jPanelAccionesProcesoSolicitudesAutorizaciones;
	protected JPanel jPanelAccionesFormularioProcesoSolicitudesAutorizaciones;
    
	
	
	protected Integer iXPanelCamposProcesoSolicitudesAutorizaciones=0;
	protected Integer iYPanelCamposProcesoSolicitudesAutorizaciones=0;
	
	protected Integer iXPanelCamposOcultosProcesoSolicitudesAutorizaciones=0;
	protected Integer iYPanelCamposOcultosProcesoSolicitudesAutorizaciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoSolicitudesAutorizaciones;
	public JButton jButtonModificarProcesoSolicitudesAutorizaciones;
	public JButton jButtonActualizarProcesoSolicitudesAutorizaciones;
    public JButton jButtonEliminarProcesoSolicitudesAutorizaciones;
	public JButton jButtonCancelarProcesoSolicitudesAutorizaciones;
    public JButton jButtonGuardarCambiosProcesoSolicitudesAutorizaciones;
	public JButton jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCerrarProcesoSolicitudesAutorizaciones;
	
	
	protected JButton jButtonProcesarInformacionProcesoSolicitudesAutorizaciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonModificarToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonActualizarToolBarProcesoSolicitudesAutorizaciones;
    protected JButton jButtonEliminarToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCancelarToolBarProcesoSolicitudesAutorizaciones;
    protected JButton jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCerrarToolBarProcesoSolicitudesAutorizaciones;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoSolicitudesAutorizaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemModificarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemActualizarProcesoSolicitudesAutorizaciones;
    protected JMenuItem jMenuItemEliminarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemCancelarProcesoSolicitudesAutorizaciones;
    protected JMenuItem jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemCerrarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoSolicitudesAutorizaciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoSolicitudesAutorizaciones;
	public JLabel jLabelIdProcesoSolicitudesAutorizaciones;
	public JLabel jLabelidProcesoSolicitudesAutorizaciones;
	public JButton jButtonidProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones;
	public JLabel jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones;
	//public JFormattedTextField jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones;

	public JDateChooser jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones;
	public JButton jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_monedaProcesoSolicitudesAutorizaciones;
	public JLabel jLabelnombre_monedaProcesoSolicitudesAutorizaciones;
	public JTextField jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones;
	public JButton jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones;
	public JLabel jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones;
	public JTextArea jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones;
	public JScrollPane jscrollPanenombre_completo_clienteProcesoSolicitudesAutorizaciones;
	public JButton jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones;
	public JLabel jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones;
	public JTextField jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones;
	public JButton jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionProcesoSolicitudesAutorizaciones;
	public JLabel jLabelfecha_emisionProcesoSolicitudesAutorizaciones;
	//public JFormattedTextField jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones;

	public JDateChooser jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones;
	public JButton jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pagoProcesoSolicitudesAutorizaciones;
	public JLabel jLabelfecha_pagoProcesoSolicitudesAutorizaciones;
	//public JFormattedTextField jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones;

	public JDateChooser jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones;
	public JButton jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones;
	public JLabel jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones;
	//public JFormattedTextField jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones;

	public JDateChooser jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones;
	public JButton jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localProcesoSolicitudesAutorizaciones;
	public JLabel jLabeldebito_mone_localProcesoSolicitudesAutorizaciones;
	public JTextField jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones;
	public JButton jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones;
	public JLabel jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones;
	public JTextField jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones;
	public JButton jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProcesoSolicitudesAutorizaciones;
	public JLabel jLabelid_empresaProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoSolicitudesAutorizaciones;
	public JButton jButtonid_empresaProcesoSolicitudesAutorizaciones= new JButtonMe();
	public JButton jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoSolicitudesAutorizaciones;
	public JLabel jLabelid_sucursalProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoSolicitudesAutorizaciones;
	public JButton jButtonid_sucursalProcesoSolicitudesAutorizaciones= new JButtonMe();
	public JButton jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteProcesoSolicitudesAutorizaciones;
	public JLabel jLabelid_clienteProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteProcesoSolicitudesAutorizaciones;
	public JButton jButtonid_clienteProcesoSolicitudesAutorizaciones= new JButtonMe();
	public JButton jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
	public JButton jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones;
	
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
	public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoSolicitudesAutorizaciones=new JPanel();
				this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones=new JPanel();
				this.jmenuBarDetalleProcesoSolicitudesAutorizaciones=new JMenuBar();
				this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoSolicitudesAutorizaciones() {
		return this.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones;
	}
	
	public JButton getjButtonEliminarToolBarProcesoSolicitudesAutorizaciones() {
		return this.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones;
	}
	
	public JButton getjButtonCancelarToolBarProcesoSolicitudesAutorizaciones() {
		return this.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoSolicitudesAutorizaciones() {
		return this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoSolicitudesAutorizaciones)	{
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones = jButtonProcesarInformacionProcesoSolicitudesAutorizaciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones = jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones = jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones = jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
		
		this.procesosolicitudesautorizacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesosolicitudesautorizacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoSolicitudesAutorizacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoSolicitudesAutorizacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoSolicitudesAutorizacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Solicitudes Autorizaciones MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoSolicitudesAutorizacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoSolicitudesAutorizaciones=new JButtonMe();
				this.jButtonModificarToolBarProcesoSolicitudesAutorizaciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones,
							"actualizar","actualizar","Actualizar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones,
							"eliminar","eliminar","Eliminar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones,
							"cancelar","cancelar","Cancelar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarDetalleProcesoSolicitudesAutorizaciones,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoSolicitudesAutorizaciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoSolicitudesAutorizaciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoSolicitudesAutorizaciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoSolicitudesAutorizaciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoSolicitudesAutorizaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoSolicitudesAutorizaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoSolicitudesAutorizaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoSolicitudesAutorizaciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoSolicitudesAutorizaciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoSolicitudesAutorizaciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoSolicitudesAutorizaciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoSolicitudesAutorizaciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoSolicitudesAutorizaciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoSolicitudesAutorizaciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoSolicitudesAutorizaciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoSolicitudesAutorizaciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoSolicitudesAutorizaciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoSolicitudesAutorizaciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoSolicitudesAutorizaciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoSolicitudesAutorizaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoSolicitudesAutorizaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoSolicitudesAutorizaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoSolicitudesAutorizaciones.add(this.jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones);
		
		this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemActualizarProcesoSolicitudesAutorizaciones);
		this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemEliminarProcesoSolicitudesAutorizaciones);
		this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemCancelarProcesoSolicitudesAutorizaciones);		
		
		//this.jmenuDetalleDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones);				
		this.jmenuDetalleDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones);				
				
		//this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoSolicitudesAutorizaciones.add(this.jmenuDetalleArchivoProcesoSolicitudesAutorizaciones);		
		this.jmenuBarDetalleProcesoSolicitudesAutorizaciones.add(this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones);		
		this.jmenuBarDetalleProcesoSolicitudesAutorizaciones.add(this.jmenuDetalleDatosProcesoSolicitudesAutorizaciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoSolicitudesAutorizaciones);				
	}
	
	
	public void inicializarElementosCamposProcesoSolicitudesAutorizaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoSolicitudesAutorizaciones = new JLabelMe();
		jLabelIdProcesoSolicitudesAutorizaciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoSolicitudesAutorizaciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones= new GridBagLayout();

		this.jPanelidProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);

		jLabelidProcesoSolicitudesAutorizaciones = new JLabel();
		jLabelidProcesoSolicitudesAutorizaciones.setText("Id");

		jLabelidProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA+" : *");
		this.jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setToolTipText("Fecha Vencimiento Hasta");
		this.jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		//jFormattedTextFieldfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones= new JDateChooser();
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setEnabled(false);
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setDate(new Date());
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_monedaProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelnombre_monedaProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA+" : *");
		this.jLabelnombre_monedaProcesoSolicitudesAutorizaciones.setToolTipText("Nombre Moneda");
		this.jLabelnombre_monedaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_monedaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBREMONEDA);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones= new JTextFieldMe();

		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setEnabled(false);
		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_monedaProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones= new JTextAreaMe();
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setEnabled(false);
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setLineWrap(true);
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteProcesoSolicitudesAutorizaciones = new JScrollPane(jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones);
		jscrollPanenombre_completo_clienteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelfecha_emisionProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionProcesoSolicitudesAutorizaciones.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		//jFormattedTextFieldfecha_emisionProcesoSolicitudesAutorizaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones= new JDateChooser();
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setEnabled(false);
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setDate(new Date());
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionProcesoSolicitudesAutorizaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pagoProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelfecha_pagoProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO+" : *");
		this.jLabelfecha_pagoProcesoSolicitudesAutorizaciones.setToolTipText("Fecha Pago");
		this.jLabelfecha_pagoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pagoProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAPAGO);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		//jFormattedTextFieldfecha_pagoProcesoSolicitudesAutorizaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones= new JDateChooser();
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setEnabled(false);
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setDate(new Date());
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pagoProcesoSolicitudesAutorizaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pagoProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		//jFormattedTextFieldfecha_vencimientoProcesoSolicitudesAutorizaciones= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones= new JDateChooser();
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setEnabled(false);
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setDate(new Date());
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoProcesoSolicitudesAutorizaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones= new JTextFieldMe();
		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setEnabled(false);
		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.setText("0.0");

		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones.setToolTipText("Debito Mone Extra");
		this.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones= new JTextFieldMe();
		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setEnabled(false);
		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.setText("0.0");

		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoSolicitudesAutorizaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelid_empresaProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoSolicitudesAutorizaciones.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelid_empresaProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jComboBoxid_empresaProcesoSolicitudesAutorizaciones= new JComboBoxMe();
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.setEnabled(false);

		this.jButtonid_empresaProcesoSolicitudesAutorizaciones= new JButtonMe();
		this.jButtonid_empresaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoSolicitudesAutorizaciones.setText("Buscar");
		this.jButtonid_empresaProcesoSolicitudesAutorizaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoSolicitudesAutorizaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoSolicitudesAutorizaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoSolicitudesAutorizaciones"));

		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.setText("U");
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoSolicitudesAutorizacionesUpdate"));



					
		this.jLabelid_sucursalProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelid_sucursalProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoSolicitudesAutorizaciones.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelid_sucursalProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones= new JComboBoxMe();
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.setEnabled(false);

		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones= new JButtonMe();
		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones.setText("Buscar");
		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoSolicitudesAutorizaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoSolicitudesAutorizaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoSolicitudesAutorizaciones"));

		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.setText("U");
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoSolicitudesAutorizacionesUpdate"));



					
		this.jLabelid_clienteProcesoSolicitudesAutorizaciones = new JLabelMe();
		this.jLabelid_clienteProcesoSolicitudesAutorizaciones.setText(""+ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteProcesoSolicitudesAutorizaciones.setToolTipText("Cliente");
		this.jLabelid_clienteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteProcesoSolicitudesAutorizaciones.setToolTipText(ProcesoSolicitudesAutorizacionesConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		this.jPanelid_clienteProcesoSolicitudesAutorizaciones.setLayout(this.gridaBagLayoutProcesoSolicitudesAutorizaciones);


		jComboBoxid_clienteProcesoSolicitudesAutorizaciones= new JComboBoxMe();
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteProcesoSolicitudesAutorizaciones= new JButtonMe();
		this.jButtonid_clienteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProcesoSolicitudesAutorizaciones.setText("Buscar");
		this.jButtonid_clienteProcesoSolicitudesAutorizaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteProcesoSolicitudesAutorizaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProcesoSolicitudesAutorizaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProcesoSolicitudesAutorizaciones"));

		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setText("U");
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProcesoSolicitudesAutorizacionesBusqueda"));

		if(this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda.setVisible(false);		}

		this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.setText("U");
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProcesoSolicitudesAutorizaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProcesoSolicitudesAutorizacionesUpdate"));



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
		//this.jInternalFrameDetalleProcesoSolicitudesAutorizaciones = new ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Solicitudes Autorizaciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones= new GridBagLayout();
		

		
		String sToolTipProcesoSolicitudesAutorizaciones="";
		sToolTipProcesoSolicitudesAutorizaciones=ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoSolicitudesAutorizaciones+="(Tesoreria.ProcesoSolicitudesAutorizaciones)";
		}
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoSolicitudesAutorizaciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonModificarProcesoSolicitudesAutorizaciones = new JButtonMe();
        this.jButtonActualizarProcesoSolicitudesAutorizaciones = new JButtonMe();
        this.jButtonEliminarProcesoSolicitudesAutorizaciones = new JButtonMe();
        this.jButtonCancelarProcesoSolicitudesAutorizaciones = new JButtonMe();
        this.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonCerrarProcesoSolicitudesAutorizaciones = new JButtonMe();
		
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Solicitudes Autorizaciones";
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Solicitudes Autorizacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoSolicitudesAutorizaciones.setName("jPanelCamposProcesoSolicitudesAutorizaciones"); 

		this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.setName("jPanelCamposOcultosProcesoSolicitudesAutorizaciones"); 

        this.jPanelAccionesProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoSolicitudesAutorizaciones.setToolTipText("Acciones");
        this.jPanelAccionesProcesoSolicitudesAutorizaciones.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoSolicitudesAutorizaciones.setText("Nuevo");
		this.jButtonModificarProcesoSolicitudesAutorizaciones.setText("Editar");
        this.jButtonActualizarProcesoSolicitudesAutorizaciones.setText("Actualizar");
        this.jButtonEliminarProcesoSolicitudesAutorizaciones.setText("Eliminar");
        this.jButtonCancelarProcesoSolicitudesAutorizaciones.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setText("Guardar");
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoSolicitudesAutorizaciones,"nuevo_button","Nuevo",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoSolicitudesAutorizaciones,"modificar_button","Editar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoSolicitudesAutorizaciones,"actualizar_button","Actualizar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoSolicitudesAutorizaciones,"eliminar_button","Eliminar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoSolicitudesAutorizaciones,"cancelar_button","Cancelar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones,"guardarcambios_button","Guardar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones,"guardarcambiostabla_button","Guardar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoSolicitudesAutorizaciones,"cerrar_button","Salir",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.setToolTipText("Nuevo"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoSolicitudesAutorizaciones.setToolTipText("Editar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoSolicitudesAutorizaciones.setToolTipText("Actualizar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoSolicitudesAutorizaciones.setToolTipText("Eliminar)"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoSolicitudesAutorizaciones.setToolTipText("Cancelar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones.setToolTipText("Guardar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setToolTipText("Guardar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.setToolTipText("Salir"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonNuevoProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoSolicitudesAutorizaciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonActualizarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoSolicitudesAutorizaciones"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonEliminarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoSolicitudesAutorizaciones"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonCancelarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoSolicitudesAutorizaciones"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonCerrarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoSolicitudesAutorizaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoSolicitudesAutorizaciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones.setToolTipText("Nuevo ProcesoSolicitudesAutorizaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones.setToolTipText("Sin Cerrar Ventana ProcesoSolicitudesAutorizaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setText("Accion");
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoSolicitudesAutorizaciones = new JLabelMe();
		
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setText("Acciones");		
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoSolicitudesAutorizaciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoSolicitudesAutorizaciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoSolicitudesAutorizaciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoSolicitudesAutorizaciones = new GridBagLayout();
		
		this.jPanelCamposProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutCamposProcesoSolicitudesAutorizaciones);
		this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutCamposOcultosProcesoSolicitudesAutorizaciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoSolicitudesAutorizaciones.add(jLabelIdProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoSolicitudesAutorizaciones.add(jLabelidProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoSolicitudesAutorizaciones.add(jLabelid_empresaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoSolicitudesAutorizaciones.add(jButtonid_empresaProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 3;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoSolicitudesAutorizaciones.add(jButtonid_empresaProcesoSolicitudesAutorizacionesUpdate, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoSolicitudesAutorizaciones.add(jComboBoxid_empresaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoSolicitudesAutorizaciones.add(jLabelid_sucursalProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoSolicitudesAutorizaciones.add(jButtonid_sucursalProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 3;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoSolicitudesAutorizaciones.add(jButtonid_sucursalProcesoSolicitudesAutorizacionesUpdate, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoSolicitudesAutorizaciones.add(jComboBoxid_sucursalProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteProcesoSolicitudesAutorizaciones.add(jLabelid_clienteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProcesoSolicitudesAutorizaciones.add(jButtonid_clienteProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 3;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProcesoSolicitudesAutorizaciones.add(jButtonid_clienteProcesoSolicitudesAutorizacionesUpdate, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteProcesoSolicitudesAutorizaciones.add(jComboBoxid_clienteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.add(jLabelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.add(jButtonfecha_vencimiento_hastaProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones.add(jDateChooserfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones.add(jLabelnombre_monedaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones.add(jButtonnombre_monedaProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones.add(jTextFieldnombre_monedaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones.add(jLabelnombre_completo_clienteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones.add(jButtonnombre_completo_clienteProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones.add(jscrollPanenombre_completo_clienteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.add(jLabelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.add(jButtonnumero_pre_impreso_facturaProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones.add(jTextFieldnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones.add(jLabelfecha_emisionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones.add(jButtonfecha_emisionProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones.add(jDateChooserfecha_emisionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones.add(jLabelfecha_pagoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones.add(jButtonfecha_pagoProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones.add(jDateChooserfecha_pagoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones.add(jLabelfecha_vencimientoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones.add(jButtonfecha_vencimientoProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones.add(jDateChooserfecha_vencimientoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones.add(jLabeldebito_mone_localProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones.add(jButtondebito_mone_localProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones.add(jTextFielddebito_mone_localProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones.add(jLabeldebito_mone_extraProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 2;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones.add(jButtondebito_mone_extraProcesoSolicitudesAutorizacionesBusqueda, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	}

	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones.add(jTextFielddebito_mone_extraProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelidProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelid_clienteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelfecha_vencimiento_hastaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelnombre_monedaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelnombre_completo_clienteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelnumero_pre_impreso_facturaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelfecha_emisionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelfecha_pagoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPanelfecha_vencimientoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPaneldebito_mone_localProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoSolicitudesAutorizaciones.add(this.jPaneldebito_mone_extraProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposProcesoSolicitudesAutorizaciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposOcultosProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposOcultosProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.add(this.jPanelid_empresaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposOcultosProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposOcultosProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposOcultosProcesoSolicitudesAutorizaciones++;
	}
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iYPanelCamposOcultosProcesoSolicitudesAutorizaciones;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iXPanelCamposOcultosProcesoSolicitudesAutorizaciones++;
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoSolicitudesAutorizaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.add(this.jPanelid_sucursalProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);



	if(iXPanelCamposOcultosProcesoSolicitudesAutorizaciones % 2==0) {
		iXPanelCamposOcultosProcesoSolicitudesAutorizaciones=0;
		iYPanelCamposOcultosProcesoSolicitudesAutorizaciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoSolicitudesAutorizaciones= new GridBagLayout();
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutAccionesProcesoSolicitudesAutorizaciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoSolicitudesAutorizaciones= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutAccionesFormularioProcesoSolicitudesAutorizaciones);
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposAccionesFormularioProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.add(this.jButtonModificarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);							

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.add(this.jButtonEliminarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.add(this.jButtonActualizarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.add(this.jButtonGuardarCambiosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);	
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.add(this.jButtonCancelarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoSolicitudesAutorizaciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();						
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;		
			//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoSolicitudesAutorizaciones = new ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Solicitudes Autorizaciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Solicitudes Autorizaciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Solicitudes Autorizaciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoSolicitudesAutorizacionesModel procesosolicitudesautorizacionesModel=new ProcesoSolicitudesAutorizacionesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoSolicitudesAutorizacionesModel.ProcesoSolicitudesAutorizacionesFocusTraversalPolicy procesosolicitudesautorizacionesFocusTraversalPolicy = procesosolicitudesautorizacionesModel.new ProcesoSolicitudesAutorizacionesFocusTraversalPolicy(this);
			
			//procesosolicitudesautorizacionesFocusTraversalPolicy.setprocesosolicitudesautorizacionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesosolicitudesautorizacionesModel);
			
			
			this.jContentPaneDetalleProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoSolicitudesAutorizaciones = new GridBagLayout();	
			this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutDetalleProcesoSolicitudesAutorizaciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoSolicitudesAutorizaciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.add(jTtoolBarDetalleProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones=   new JScrollPane(jContentPaneDetalleProcesoSolicitudesAutorizaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	        
			this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.add(jPanelCamposProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			
			
			
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
						//&& procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoSolicitudesAutorizaciones= new GridBagConstraints();
						this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
						this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.add(this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
					this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.add(jPanelCamposOcultosProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);
				
					this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	        this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.add(this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);							
			
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
	        this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoSolicitudesAutorizaciones.add(this.jPanelAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones=   new JScrollPane(this.jPanelCamposProcesoSolicitudesAutorizaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones;
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
